package com.example.mymall.ui.own.activity;

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
import com.example.mymall.presenter.login.RegisterPresenter;
import com.example.mymall.ui.own.bean.RegisterBean;
import com.example.mymall.utils.MD5Utils;
import com.example.mymall.utils.SpUtils;

import butterknife.BindView;

//注册页
public class RegisterActivity extends BaseActivity<ILoginHome.IRegisterPersenter> implements ILoginHome.IRegisterView, View.OnClickListener {
    @BindView(R.id.img_register_back)
    ImageView imgRegisterBack;
    @BindView(R.id.et_register_name)
    EditText etRegisterName;
    @BindView(R.id.et_register_possword)
    EditText etRegisterPossword;
    @BindView(R.id.eye_register)
    ImageView eyeRegister;
    @BindView(R.id.ll)
    RelativeLayout ll;
    @BindView(R.id.btn_register_zhu)
    Button btnRegister;
    @BindView(R.id.et_affirm_register_possword)
    EditText etAffirmRegisterPossword;
    @BindView(R.id.eye_affirm_register)
    ImageView eyeAffirmRegister;
    @BindView(R.id.ll_affirm)
    RelativeLayout llAffirm;
    private String name;
    private String password;
    private String affirmPassword;
    private String digest;

    @Override
    protected int getLayout() {
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {
        eyeRegister.setOnClickListener(this);
        imgRegisterBack.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        eyeAffirmRegister.setOnClickListener(this);
    }

    @Override
    protected ILoginHome.IRegisterPersenter initPersenter() {
        return new RegisterPresenter();
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_register_back:
                finish();
                break;
            case R.id.eye_register:
                if (etRegisterPossword.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {  //可见
                    eyeRegister.setImageResource(R.mipmap.ic_eye_open);
                    etRegisterPossword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT);
                } else {  //不可见
                    etRegisterPossword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    eyeRegister.setImageResource(R.mipmap.ic_eye_close);
                }
                break;
            case R.id.btn_register_zhu:
                register();
                break;
            case R.id.eye_affirm_register:
                if (etAffirmRegisterPossword.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {  //可见
                    eyeAffirmRegister.setImageResource(R.mipmap.ic_eye_open);
                    etAffirmRegisterPossword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT);
                } else {  //不可见
                    etAffirmRegisterPossword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    eyeAffirmRegister.setImageResource(R.mipmap.ic_eye_close);
                }
                break;
        }
    }

    private void register() {
        name = etRegisterName.getText().toString();
        password = etRegisterPossword.getText().toString();
        affirmPassword = etAffirmRegisterPossword.getText().toString();
        if (name.isEmpty() || password.isEmpty() || affirmPassword.isEmpty()) {
            Toast.makeText(this, "账号或密码为空", Toast.LENGTH_SHORT).show();
        } else {
            if (affirmPassword.equals(password)) {
                digest = MD5Utils.digest(password);
                persenter.getRegisterData(name, digest);
            } else {
                Toast.makeText(this, "密码不一致", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void getRegisterDataReturn(RegisterBean result) {
        String token = result.getData().getToken();
        if (!token.isEmpty()) {
            Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
            SpUtils.getInstance().setValue("token", token);
            SpUtils.getInstance().setValue("username", name);
            SpUtils.getInstance().setValue("password", digest);
            finish();
        }
    }
}
