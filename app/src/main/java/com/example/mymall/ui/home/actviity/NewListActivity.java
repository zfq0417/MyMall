package com.example.mymall.ui.home.actviity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mymall.R;
import com.example.mymall.adapter.VpAdapter;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.interfaces.home.INewGood;
import com.example.mymall.presenter.home.NewGoodPresenterlmp;
import com.example.mymall.ui.home.adapter.NewGoodAdapter;
import com.example.mymall.ui.home.adapter.NewPopAdapter;
import com.example.mymall.ui.home.bean.NewListBean;
import com.example.mymall.ui.home.fragment.NewListFragment;
import com.example.mymall.ui.home.fragment.NewListPriceFragment;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.SystemUtils;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class NewListActivity extends BaseActivity<INewGood.INewGoodPersenter> implements INewGood.INewGoodView, View.OnClickListener {
    @BindView(R.id.newlist_iv)
    ImageView iv;

    @BindView(R.id.newlist_rv)
    RecyclerView rv;

    //综合
    @BindView(R.id.newlist_tv_zonghe)
    TextView zonghe;
    //价格
    @BindView(R.id.newlist_tv_price)
    TextView price;
    //分配
    @BindView(R.id.newlist_tv_classif)
    TextView classif;

    @BindView(R.id.newlist_iv_xia)
    ImageView shang;
    @BindView(R.id.newlist_iv_shang)
    ImageView xia;
    private FragmentManager fragmentManager;
    private ArrayList<Fragment> fragments;

    private List<NewListBean.DataBeanX.GoodsListBean> list;
    private NewGoodAdapter newGoodAdapter;
    private RecyclerView rv1;
    private List<NewListBean.DataBeanX.FilterCategoryBean> popList;
    private PopupWindow pop;
    private NewPopAdapter newPopAdapter;
    private Boolean isSort = true;
    private NewListBean bean;


    @Override
    protected int getLayout() {
        return R.layout.activity_new_list;
    }

    @Override
    protected void initView() {
        GildeUtils.loadImg(this, "http://yanxuan.nosdn.127.net/8976116db321744084774643a933c5ce.png", iv);

        list = new ArrayList<>();
        popList = new ArrayList<>();

        //创建 适配器
        newGoodAdapter = new NewGoodAdapter(this, list);

        //添加布局管理器
        rv.setLayoutManager(new GridLayoutManager(this, 2));

        //绑定适配器
        rv.setAdapter(newGoodAdapter);

        //综合颜色
        zonghe.setTextColor(Color.RED);


        zonghe.setOnClickListener(this);
        price.setOnClickListener(this);
        classif.setOnClickListener(this);
        shang.setOnClickListener(this);
        xia.setOnClickListener(this);

    }

    @Override
    protected INewGood.INewGoodPersenter initPersenter() {
        return new NewGoodPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getNewGoodData(1, 1, 1000, "asc", "default", 0);
    }

    //网络请求的数据
    @Override
    public void getNewGoodDataReturn(NewListBean bean) {
        initNewList(bean);
    }

    private void initNewList(NewListBean bean) {
        this.bean = bean;

        if (bean != null) {
            list.addAll(bean.getData().getGoodsList());

            //刷新适配器
            newGoodAdapter.notifyDataSetChanged();

            popList.addAll(bean.getData().getFilterCategory());

        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.newlist_tv_zonghe:   //综合

                zonghe.setTextColor(Color.RED);
                price.setTextColor(Color.BLACK);
                classif.setTextColor(Color.BLACK);
                Toast.makeText(this, "综合", Toast.LENGTH_SHORT).show();

                list.clear();   //清空集合
                popList.clear();
                persenter.getNewGoodData(1, 1, 1000, "asc", "default", 0);


                break;

            case R.id.newlist_tv_price:   //价格
                Toast.makeText(this, "价格", Toast.LENGTH_SHORT).show();

                initPrice();
                break;

            case R.id.newlist_tv_classif:   //分类
                Toast.makeText(this, "分类", Toast.LENGTH_SHORT).show();


                zonghe.setTextColor(Color.BLACK);
                price.setTextColor(Color.BLACK);
                classif.setTextColor(Color.RED);

                popWindow();

                break;


        }
    }

    private void initPrice() {
        zonghe.setTextColor(Color.BLACK);
        price.setTextColor(Color.RED);
        classif.setTextColor(Color.BLACK);

        list.clear();
        popList.clear();
        if (isSort) {
            isSort = false;
            persenter.getNewGoodData(1, 1, 1000, "asc", "price", 0);

            shang.setColorFilter(Color.BLACK);
            xia.setColorFilter(Color.RED);

        } else {
            isSort = true;
            persenter.getNewGoodData(1, 1, 1000, "desc", "price", 0);
            shang.setColorFilter(Color.RED);
            xia.setColorFilter(Color.BLACK);
        }
        newGoodAdapter.notifyDataSetChanged();


    }

    private void popWindow() {
        View view = LayoutInflater.from(this).inflate(R.layout.popwindow, null);
        //布局控件
        pop = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        //不设置该属性会出现点击view重新打开pop的问题
        //pop.setFocusable(false);

        //设置popwindow 背景
        pop.setBackgroundDrawable(new BitmapDrawable());
        //设置点击外部区域可以取消popupWindow   需要先设置背景
        pop.setOutsideTouchable(true);


        //设置显示位置
        //pop.showAtLocation(classif, Gravity.BOTTOM, 0, 0);
        pop.showAsDropDown(classif, 0, 0);

        //布局控件
        rv1 = (RecyclerView) view.findViewById(R.id.pop_rv);

        //创建适配器
        newPopAdapter = new NewPopAdapter(this, popList);
        //添加布局管理器
        rv1.setLayoutManager(new GridLayoutManager(this, 5));
        //绑定适配器
        rv1.setAdapter(newPopAdapter);

        newPopAdapter.setClick(new BaseAdapter.IClick() {
            @Override
            public void click(int pos) {
                int id = popList.get(pos).getId();
                list.clear();
                popList.clear();

                Toast.makeText(NewListActivity.this, "aaa", Toast.LENGTH_SHORT).show();

                persenter.getNewGoodData(1, 1, 1000, "asc", "default", id);

                //关闭popwindiow
                pop.dismiss();
            }
        });

        newPopAdapter.notifyDataSetChanged();

    }
}