package com.example.mymall.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseActivity<P extends IBasePresenter> extends AppCompatActivity implements IBaseView {

    Unbinder unbinder;

    protected P persenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设计模式中的模板方法调用
        setContentView(getLayout());

        unbinder = ButterKnife.bind(this);

        initView();
        persenter = initPersenter();
        if(persenter != null) {
            persenter.attachView(this);
            initData();
        }
    }

    /**
     * 获取界面布局的方法
     * @return
     */
    protected abstract int getLayout();

    /**
     * 初始化界面
     */
    protected abstract void initView();

    /**
     * 初始化p层
     */
    protected abstract P initPersenter();

    /**
     * 初始化加载数据
     */
    protected abstract void initData();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
        if(persenter != null){
            persenter.detachView();
        }
    }


    @Override
    public void showTips(String tips) {

    }

    @Override
    public void showLoading(int visible) {

    }

}
