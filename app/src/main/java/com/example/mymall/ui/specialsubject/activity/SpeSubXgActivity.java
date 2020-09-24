package com.example.mymall.ui.specialsubject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.mymall.R;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.interfaces.special.ISpecialXq;
import com.example.mymall.presenter.special.SpecialXqPresenterlmp;
import com.example.mymall.ui.specialsubject.adapter.SpeSubXgAdapter;
import com.example.mymall.ui.specialsubject.bean.SpeSubXgBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

//专题相关推荐 详情
public class SpeSubXgActivity extends BaseActivity<ISpecialXq.SpecialXqPersenter> implements ISpecialXq.SpecialXqView {
    @BindView(R.id.spesub_xg_rv)
    RecyclerView rv;
    private ArrayList<SpeSubXgBean.DataBean> listxg;
    private SpeSubXgAdapter speSubXgAdapter;
    private int id;

    @Override
    protected int getLayout() {
        return R.layout.activity_spe_sub_xg;
    }

    @Override
    protected void initView() {

        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);

        //集合  存放数据源
        listxg = new ArrayList<>();

        //创建适配器
        speSubXgAdapter = new SpeSubXgAdapter(this, listxg);
        //添加布局管理器
        rv.setLayoutManager(new LinearLayoutManager(this));
        //绑定适配器
        rv.setAdapter(speSubXgAdapter);
    }

    @Override
    protected ISpecialXq.SpecialXqPersenter initPersenter() {
        return new SpecialXqPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getSpeSubXq(id);
    }


    //专题相关推荐 详情
    @Override
    public void getSpeSubXqReturn(SpeSubXgBean bean) {
        List<SpeSubXgBean.DataBean> data = bean.getData();
        if (data != null && data.size() > 0) {
            listxg.addAll(data);
            //刷新适配器
            speSubXgAdapter.notifyDataSetChanged();
        }
    }

}