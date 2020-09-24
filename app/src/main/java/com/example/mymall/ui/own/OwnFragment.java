package com.example.mymall.ui.own;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mymall.R;
import com.example.mymall.base.BaseFragment;
import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.ui.cart.AddressActivity;
import com.example.mymall.ui.own.activity.OwnLoginActivity;
import com.example.mymall.utils.SpUtils;

import java.util.ArrayList;

import butterknife.BindView;

public class OwnFragment extends BaseFragment implements View.OnClickListener {

    private ArrayList<String> list;

    @BindView(R.id.own_tv_login)
    TextView tv_login;
    //退出登录
    @BindView(R.id.btn_tui)
    TextView btn_tui;
    @BindView(R.id.own_tv_loginname)
    TextView login_name;
    //地址管理
    @BindView(R.id.layout_location)
    LinearLayout layout_location;


    @Override
    protected int getLayout() {
        return R.layout.fragment_own;
    }

    @Override
    protected void initView() {
        //点击事件
        initListener();

        String token = SpUtils.getInstance().getString("token");
        //username
        String username = SpUtils.getInstance().getString("username");
        if (!token.isEmpty()) {

            login_name.setVisibility(View.VISIBLE);
            tv_login.setVisibility(View.GONE);

            login_name.setText(username);
        } else {
            Toast.makeText(getActivity(), "未登录", Toast.LENGTH_SHORT).show();
        }


    }


    @Override
    protected IBasePresenter initPersenter() {
        return null;
    }

    @Override
    protected void initData() {

    }


    //点击事件
    private void initListener() {
        //登录
        tv_login.setOnClickListener(this);
        btn_tui.setOnClickListener(this);
        layout_location.setOnClickListener(this);  //地址管理
    }

    //点击监听
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.own_tv_login:   //点击登录
                startActivity(new Intent(context, OwnLoginActivity.class));
                break;
            case R.id.btn_tui:   //退出登录
                SpUtils.getInstance().remove("token");
                SpUtils.getInstance().remove("username");
                SpUtils.getInstance().remove("password");
                login_name.setText("");
                login_name.setVisibility(View.GONE);
                tv_login.setVisibility(View.VISIBLE);
                break;

            case R.id.layout_location:   //地址管理
                Intent intent = new Intent(getActivity(), AddressActivity.class);
                startActivity(intent);
                break;
        }
    }

}