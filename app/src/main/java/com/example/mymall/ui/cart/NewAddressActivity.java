package com.example.mymall.ui.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mymall.R;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.interfaces.home.IAddress;
import com.example.mymall.presenter.own.AddressPresenterlmp;
import com.example.mymall.ui.own.bean.AdressBean;
import com.example.mymall.utils.SystemUtils;
import com.weigan.loopview.LoopView;
import com.weigan.loopview.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class NewAddressActivity extends BaseActivity<IAddress.IAdressPersenter> implements IAddress.IAdressView, View.OnClickListener {
    //省份、城市、区县
    @BindView(R.id.newadd_ed_address)
    EditText ed_address;
    //总布局
    @BindView(R.id.layout_adress)
    LinearLayout layoutAdress;

    private PopupWindow mPopWindow;
    private Map<Integer, List<AdressBean.DataBean>> addressMap;


    private LoopView province, city, area;           //当前省市区的LoopView
    private TextView txtProvince, txtCity, txtArea;  //当前省市区的TextView

    private int curProvinceId, curCityId, curAreaId; //当前省市区的ID

    @Override
    protected int getLayout() {
        return R.layout.activity_new_address;
    }

    @Override
    protected void initView() {

        addressMap = new HashMap<>();

        //设置不可编辑   可点击
        ed_address.setCursorVisible(false);
        ed_address.setFocusable(false);
        ed_address.setFocusableInTouchMode(false);

        ed_address.setOnClickListener(this);
    }

    @Override
    protected IAddress.IAdressPersenter initPersenter() {
        return new AddressPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getAdressById(1);
    }


    //点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.newadd_ed_address:
                Toast.makeText(this, "哈哈哈", Toast.LENGTH_SHORT).show();
                openAdressSelect();
                break;
        }
    }

    private void openAdressSelect() {
        if (mPopWindow != null && mPopWindow.isShowing()) {

        } else {
            //创建布局
            View contentView = LayoutInflater.from(this).inflate(R.layout.layout_popwindow_adress, null);
            int height = SystemUtils.dp2px(this, 250);

            //布局控件
            mPopWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT, height);

            //设置popwindow 背景
            mPopWindow.setBackgroundDrawable(new BitmapDrawable());
            //不设置该属性会出现点击view重新打开pop的问题
            mPopWindow.setFocusable(false);
            //showAtLocation
            mPopWindow.setOutsideTouchable(false);
            mPopWindow.setContentView(contentView);
            contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);

            //LoopView 省市区
            province = contentView.findViewById(R.id.adress_province);
            city = contentView.findViewById(R.id.adress_city);
            area = contentView.findViewById(R.id.adress_area);

            txtProvince = contentView.findViewById(R.id.txt_province);
            txtCity = contentView.findViewById(R.id.txt_city);
            txtArea = contentView.findViewById(R.id.txt_area);

            TextView txt_submit = contentView.findViewById(R.id.txt_submitb);
            txt_submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mPopWindow.dismiss();
                    mPopWindow = null;
                    //ed_address.setText("啧啧啧");

                    if (txtArea.getText().toString().equals("区县")) {
                        ed_address.setText(txtProvince.getText().toString() + txtCity.getText().toString());
                    } else {
                        ed_address.setText(txtProvince.getText().toString() + txtCity.getText().toString() + txtArea.getText().toString());
                    }


                }
            });

            //设置显示位置
            mPopWindow.showAtLocation(layoutAdress, Gravity.BOTTOM, 0, 0);

            //省份
            province.setListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(int index) {
                    List<AdressBean.DataBean> proviceList = addressMap.get(1); //key为1固定为省的数据
                    AdressBean.DataBean dataBean = proviceList.get(index);
                    curProvinceId = dataBean.getId();
                    persenter.getAdressById(curProvinceId);
                    List<String> items = new ArrayList<>();
                    items.add("请选择");
                    city.setItems(items);

                    txtProvince.setText("省份");
                    txtProvince.setText(dataBean.getName());

                    txtCity.setText("城市");
                    txtArea.setText("区县");
                }
            });

            //市
            city.setListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(int index) {
                    List<AdressBean.DataBean> cityList = addressMap.get(curProvinceId); //key省份id
                    AdressBean.DataBean dataBean = cityList.get(index);
                    curCityId = dataBean.getId();
                    persenter.getAdressById(curCityId);
                    area.setItems(new ArrayList<>());
                    txtCity.setText(dataBean.getName());
                    txtArea.setText("区县");
                }
            });

            //区
            area.setListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(int index) {
                    List<AdressBean.DataBean> areaList = addressMap.get(curCityId); //key省份id
                    AdressBean.DataBean dataBean = areaList.get(index);
                    curAreaId = dataBean.getId();
                    txtArea.setText(dataBean.getName());
                }
            });

            //初始化省份的数据
            List<AdressBean.DataBean> pList = addressMap.get(1);
            if (pList == null) return;
            List<String> adresses = getAdressStrings(pList);
            if (pList == null || adresses.size() == 0) {
                persenter.getAdressById(1);
            } else {
                province.setItems(adresses);
                curProvinceId = pList.get(0).getId();
                txtProvince.setText(adresses.get(0));
            }

        }
    }

    //返回的
    @Override
    public void getAdressByIdReturn(AdressBean result) {
        List<AdressBean.DataBean> list = null;
        int type = 0;
        for (AdressBean.DataBean item : result.getData()) {
            int key = item.getParent_id();
            list = addressMap.get(key);
            if (list == null) {
                list = new ArrayList<>();
                addressMap.put(key, list);
            }
            boolean bool = hasList(item.getId(), list);
            if (!bool) list.add(item);
            if (type == 0) {
                type = item.getType();
            }
        }
        if (list == null) return;
        List<String> adresses = getAdressStrings(list);


        if (type == 1) {
            //刷新省的数据
            if (province != null) {
                curProvinceId = list.get(0).getId();
                txtProvince.setText(list.get(0).getName());
                province.setItems(adresses);
            }
        } else if (type == 2) {
            //刷新市的数据
            if (city != null) {
                curCityId = list.get(0).getId();
                txtCity.setText(list.get(0).getName());
                city.setItems(adresses);
            }
        } else {
            //区
            if (area != null) {
                curAreaId = list.get(0).getId();
                txtArea.setText(list.get(0).getName());
                area.setItems(adresses);
            }
        }
    }

    /**
     * 提取省市区的名字
     *
     * @param list
     * @return
     */
    private List<String> getAdressStrings(List<AdressBean.DataBean> list) {
        List<String> adresses = new ArrayList<>();
        for (AdressBean.DataBean item : list) {
            adresses.add(item.getName());
        }
        return adresses;
    }

    /**
     * 判断当前的地址列表中是否有这个地址
     *
     * @param id
     * @param list
     * @return
     */
    private boolean hasList(int id, List<AdressBean.DataBean> list) {
        boolean bool = false;
        for (AdressBean.DataBean item : list) {
            if (item.getId() == id) {
                bool = true;
                break;
            }
        }
        return bool;
    }

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_address);
    }*/
}