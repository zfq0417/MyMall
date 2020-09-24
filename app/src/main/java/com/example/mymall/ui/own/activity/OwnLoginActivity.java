package com.example.mymall.ui.own.activity;

import android.content.Intent;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.example.mymall.R;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.interfaces.login.ILoginHome;
import com.example.mymall.presenter.login.LoginPresenter;
import com.example.mymall.ui.own.bean.LoginBean;
import com.example.mymall.utils.MD5Utils;
import com.example.mymall.utils.SpUtils;

import butterknife.BindView;

public class OwnLoginActivity extends BaseActivity<ILoginHome.ILoginPersenter> implements ILoginHome.ILoginView,View.OnClickListener {
    @BindView(R.id.et_login_name)
    EditText etName;
    @BindView(R.id.et_login_possword)
    EditText etPossword;
    @BindView(R.id.eye_login)
    ImageView eye;
    @BindView(R.id.rl)
    RelativeLayout ll;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;
    @BindView(R.id.img_login_back)
    ImageView imgLoginBack;
    private String etName1;
    private String etPassword;


    @Override
    protected int getLayout() {

        return R.layout.activity_own_login;
    }

    @Override
    protected void initView() {
        eye.setOnClickListener(this);
        imgLoginBack.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    protected ILoginHome.ILoginPersenter initPersenter() {
        return new LoginPresenter();
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.eye_login:
                if (etPossword.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {  //可见
                    eye.setImageResource(R.mipmap.ic_eye_open);
                    etPossword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT);
                } else {  //可见
                    etPossword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    eye.setImageResource(R.mipmap.ic_eye_close);
                }
                break;
            case R.id.btn_login:
                etName1 = this.etName.getText().toString();
                etPassword = this.etPossword.getText().toString();
                if (etName1.isEmpty() || etPassword.isEmpty()){
                    Toast.makeText(this, "账号或密码为空", Toast.LENGTH_SHORT).show();
                }else{
                    String password = SpUtils.getInstance().getString("password");//取的密码
                    String digest = MD5Utils.digest(etPassword);//转换的密码
                    String username = SpUtils.getInstance().getString("username");
                    //判断账号和密码是否正确
                    if (etName1.equals(username) && password.equals(digest)){
                        persenter.getLoginData(etName1,digest);
                    }else{
                        Toast.makeText(this, "账号或密码不正确", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.btn_register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.img_login_back:
                finish();
                break;
        }
    }

    //登录成功返回的数据
    @Override
    public void getLoginDataReturn(LoginBean result) {
        if (result.getData().getCode() == 200){
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
            SpUtils.getInstance().setValue("token",result.getData().getToken());
            finish();
        }
    }
}
