package com.example.mymall.ui.home.actviity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.interfaces.home.IManufacturer;
import com.example.mymall.presenter.home.ManufacturerPresenterlmp;
import com.example.mymall.ui.home.adapter.ManufacturerAdapter;
import com.example.mymall.ui.home.bean.ManufacturerBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

//制造商列表   activity_manufacturer  IManufacturerView
public class ManufacturerActivity extends BaseActivity<IManufacturer.IManufacturerPersenter> implements IManufacturer.IManufacturerView {

    @BindView(R.id.manufacturer_rv)
    RecyclerView rv;
    private ArrayList<ManufacturerBean.DataBeanX.DataBean> list;
    private ManufacturerAdapter manufacturerAdapter;


    @Override
    protected int getLayout() {
        return R.layout.activity_manufacturer;
    }

    @Override
    protected void initView() {
        //集合存数据源
        list = new ArrayList<>();

        //创建适配器
        manufacturerAdapter = new ManufacturerAdapter(this, list);

        //添加布局管理器
        rv.setLayoutManager(new LinearLayoutManager(this));

        //绑定适配器
        rv.setAdapter(manufacturerAdapter);
    }

    @Override
    protected IManufacturer.IManufacturerPersenter initPersenter() {
        return new ManufacturerPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getManufacturer(1, 1000);
    }


    // 制造商列表 网咯请求返回
    @Override
    public void getManufacturerReturn(ManufacturerBean bean) {
        List<ManufacturerBean.DataBeanX.DataBean> data = bean.getData().getData();
        if (data != null && data.size() > 0) {
            list.addAll(data);
            //刷新适配器
            manufacturerAdapter.notifyDataSetChanged();
        }
    }
}