package com.example.mymall.ui.cart.fragment;


import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.base.BaseFragment;
import com.example.mymall.interfaces.home.IDetail;
import com.example.mymall.presenter.home.CartListPersenter;
import com.example.mymall.ui.cart.SubmitActivity;
import com.example.mymall.ui.cart.adapter.CartListAdapter;
import com.example.mymall.ui.home.bean.CartBean;
import com.example.mymall.ui.home.bean.DeleteCartBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;


public class CartFragment extends BaseFragment<IDetail.ICartPersenter> implements IDetail.ICartView {
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @BindView(R.id.layout_top)
    FrameLayout layoutTop;
    @BindView(R.id.txt_allPrice)
    TextView txtAllPrice;

    //编辑
    @BindView(R.id.txt_edit)
    TextView txtEdit;

    //下单
    @BindView(R.id.txt_submit)
    TextView txtSubmit;
    @BindView(R.id.layout_bottom)
    RelativeLayout layoutBottom;
    //全选
    @BindView(R.id.txt_selectAll)
    TextView txtSelectAll;
    //全选按钮
    @BindView(R.id.radio_select)
    CheckBox radioSelect;


    List<CartBean.DataBean.CartListBean> list;
    //适配器
    private CartListAdapter cartListAdapter;

    private int allNumber;
    private int allPrice;

    @Override
    protected int getLayout() {
        return R.layout.fragment_cart;
    }

    @Override
    protected void initView() {
        //集合  存数据源
        list = new ArrayList<>();
        //创建适配器
        cartListAdapter = new CartListAdapter(getActivity(), list);
        //添加布局管理器
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        //绑定适配器
        recyclerview.setAdapter(cartListAdapter);


        txtSelectAll.setText("全选(0)");
        cartListAdapter.setOnItemCheckBoxClickListener(new CartListAdapter.CheckBoxClick() {
            @Override
            public void checkChange() {
                //判断当前是否全选
                boolean bool = CheckSelectAll();
                txtSelectAll.setText("全选(" + allNumber + ")");
                txtAllPrice.setText("￥" + allPrice);
                radioSelect.setSelected(bool);
                cartListAdapter.notifyDataSetChanged();
            }
        });

        //下单点击事件
        txtSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubmitActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected IDetail.ICartPersenter initPersenter() {
        return new CartListPersenter();
    }

    @Override
    protected void initData() {
        persenter.getCartList();
    }

    @Override
    public void getCartListReturn(CartBean result) {
        list.addAll(result.getData().getCartList());
        //刷新适配器
        cartListAdapter.notifyDataSetChanged();
    }

    //删除返回数据
    @Override
    public void deleteCartListReturn(DeleteCartBean result) {

    }

    //点击
    @OnClick({R.id.radio_select, R.id.txt_edit, R.id.txt_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.radio_select:   //全选
                selectAll();
                break;
            case R.id.txt_edit:        //编辑
                clickEdit();
                break;
            case R.id.txt_submit:       //下单
                submitData();
                break;
        }
    }

    /**
     * 全选状态的切换
     */
    private void selectAll() {
        //设置当前是否是权限
        resetSelect(!radioSelect.isChecked());
        radioSelect.setSelected(!radioSelect.isChecked());
        txtSelectAll.setText("全选(" + allNumber + ")");
        txtAllPrice.setText("￥" + allPrice);
        cartListAdapter.notifyDataSetChanged();
        allNumber = 0;
        allPrice = 0;
    }

    /**
     * 编辑状态的切换
     */
    private void clickEdit() {
        //当前是默认的状态---编辑状态
        if ("编辑".equals(txtEdit.getText())) {
            cartListAdapter.isEditor = true;
            txtEdit.setText("完成");
            txtSubmit.setText("删除所选");
            txtAllPrice.setVisibility(View.GONE);
        } else if ("完成".equals(txtEdit.getText())) {   //编辑状态进入默认状态
            cartListAdapter.isEditor = false;
            txtEdit.setText("编辑");
            txtSubmit.setText("下单");
            txtAllPrice.setVisibility(View.VISIBLE);
            txtAllPrice.setText("￥0");
        }
        resetSelect(false);
        cartListAdapter.notifyDataSetChanged();
    }

    /**
     * 提交
     */
    private void submitData() {
        if ("下单".equals(txtSubmit.getText())) {
            //提交数据

        } else if ("删除所选".equals(txtSubmit.getText())) {
            StringBuilder sb = new StringBuilder();
            List<Integer> ids = getSelectProducts();
            for (Integer id : ids) {
                sb.append(id);
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                String productIds = sb.toString();
                persenter.deleteCartList(productIds);
            } else {
                Toast.makeText(context, "没有选中要删除的商品", Toast.LENGTH_SHORT).show();
            }
        }
    }


    /**
     * 重置选中状态
     *
     * @param bool
     */
    private void resetSelect(boolean bool) {
        allNumber = 0;
        allPrice = 0;
        for (CartBean.DataBean.CartListBean item : list) {
            item.select = bool;
            if (bool) {
                allNumber += item.getNumber();
                allPrice += item.getNumber() * item.getRetail_price();
            }
        }
        if (!bool) {
            allNumber = 0;
            allPrice = 0;
        }
    }

    /**
     * 获取当前选中的商品
     *
     * @return
     */
    private List<Integer> getSelectProducts() {
        List<Integer> ids = new ArrayList<>();
        for (CartBean.DataBean.CartListBean item : list) {
            if (item.select) {
                ids.add(item.getProduct_id());
            }
        }
        return ids;
    }

    /**
     * 判断当前数据是否选中
     *
     * @return
     */
    private boolean CheckSelectAll() {
        allNumber = 0;
        allPrice = 0;
        boolean isSelectAll = true;
        for (CartBean.DataBean.CartListBean item : list) {
            if (item.select) {
                allNumber += item.getNumber();
                allPrice += item.getNumber() * item.getRetail_price();
            }
            if (isSelectAll && !item.select) {
                isSelectAll = false;
            }
        }
        return isSelectAll;
    }


}