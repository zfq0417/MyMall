package com.example.mymall.presenter.login;


import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.login.ILoginHome;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.own.bean.LoginBean;
import com.example.mymall.utils.RxUtils;

public class LoginPresenter extends BasePersenter<ILoginHome.ILoginView> implements ILoginHome.ILoginPersenter {

    //登录
    @Override
    public void getLoginData(String name, String password) {
        addSubscribe(
                HttpManager.getInstance().getMallApi().getLoginData(name, password)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<LoginBean>(mView) {
                            @Override
                            public void onNext(LoginBean loginBean) {
                                mView.getLoginDataReturn(loginBean);
                            }

                        })
        );
    }
}
