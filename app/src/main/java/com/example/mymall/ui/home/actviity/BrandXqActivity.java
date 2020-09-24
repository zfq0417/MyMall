package com.example.mymall.ui.home.actviity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.interfaces.home.IBrandXq;
import com.example.mymall.presenter.home.BrandXqPresenterlmp;
import com.example.mymall.ui.home.adapter.BrandXqAdapter;
import com.example.mymall.ui.home.adapter.ShangXqAdapter;
import com.example.mymall.ui.home.bean.BrandXqBean;
import com.example.mymall.ui.home.bean.ShangXqBean;
import com.example.mymall.utils.GildeUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class BrandXqActivity extends BaseActivity<IBrandXq.IBrandXqPersenter> implements IBrandXq.IBrandXqView {
    @BindView(R.id.brandxq_rv)
    RecyclerView rv;
    @BindView(R.id.brandxq_list_pic_url)
    ImageView pic_url;
    //姓名
    @BindView(R.id.brandxq_tv_name)
    TextView name;
    //介绍
    @BindView(R.id.brandxq_tv_simple_desc)
    TextView desc;

    private int id;
    private ArrayList<BrandXqBean.DataBeanX.DataBean> list;
    private BrandXqAdapter brandXqAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_brand_xq;
    }

    @Override
    protected void initView() {
        id = getIntent().getIntExtra("id", 0);


        list = new ArrayList<>();

        //创建适配器
        brandXqAdapter = new BrandXqAdapter(this, list);
        //添加布局管理器   和禁止滑动
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        rv.setLayoutManager(layoutManager);

        //绑定适配器
        rv.setAdapter(brandXqAdapter);


    }

    @Override
    protected IBrandXq.IBrandXqPersenter initPersenter() {
        return new BrandXqPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getBrandXq(id, 1, 1000);
        persenter.getShangXq(id);
    }


    //商品详情列表数据
    @Override
    public void getBrandXqReturn(BrandXqBean bean) {
        List<BrandXqBean.DataBeanX.DataBean> data = bean.getData().getData();
        if (data != null && data.size() > 0) {
            list.addAll(data);
            //刷新适配器
            brandXqAdapter.notifyDataSetChanged();
        }
    }

    //商品详情上半
    @Override
    public void getShangXqReturn(ShangXqBean bean) {
        ShangXqBean.DataBean.BrandBean brand = bean.getData().getBrand();

        GildeUtils.loadImg(this, brand.getList_pic_url(), pic_url);
        name.setText(brand.getName());
        desc.setText(brand.getSimple_desc());
    }

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_xq);
    }*/
}