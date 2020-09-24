package com.example.mymall.interfaces.login;


import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.own.bean.LoginBean;
import com.example.mymall.ui.own.bean.RegisterBean;

public interface ILoginHome {
    //返回的
    //登录
    interface ILoginView extends IBaseView {
        void getLoginDataReturn(LoginBean result);
    }

    //请求的
    interface ILoginPersenter extends IBasePresenter<ILoginView> {
        void getLoginData(String name, String password);
    }


    //注册
    interface IRegisterView extends IBaseView {
        void getRegisterDataReturn(RegisterBean result);
    }

    interface IRegisterPersenter extends IBasePresenter<IRegisterView> {
        void getRegisterData(String name, String password);
    }


}
