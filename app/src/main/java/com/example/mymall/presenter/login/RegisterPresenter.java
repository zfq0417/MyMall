package com.example.mymall.presenter.login;


import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.login.ILoginHome;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.own.bean.RegisterBean;
import com.example.mymall.utils.RxUtils;

public class RegisterPresenter extends BasePersenter<ILoginHome.IRegisterView> implements ILoginHome.IRegisterPersenter {
    //注册
    @Override
    public void getRegisterData(String name, String password) {
        addSubscribe(
                HttpManager.getInstance().getMallApi().getRegisterData(name, password)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<RegisterBean>(mView) {
                            @Override
                            public void onNext(RegisterBean registerBean) {
                                mView.getRegisterDataReturn(registerBean);
                            }
                        })
        );
    }
}
