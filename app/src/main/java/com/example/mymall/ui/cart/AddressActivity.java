package com.example.mymall.ui.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.interfaces.IBasePresenter;

import butterknife.BindView;

public class AddressActivity extends BaseActivity implements View.OnClickListener {
    //新建地址
    @BindView(R.id.address_tv_new)
    TextView tvNew;


    @Override
    protected int getLayout() {
        return R.layout.activity_address;
    }

    @Override
    protected void initView() {
        //点击事件
        initListener();
    }

    //点击事件
    private void initListener() {
        tvNew.setOnClickListener(this);
    }

    @Override
    protected IBasePresenter initPersenter() {
        return null;
    }

    @Override
    protected void initData() {

    }

    //点击事件
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, NewAddressActivity.class);
        startActivity(intent);
    }
}