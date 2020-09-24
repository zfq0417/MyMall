package com.example.mymall.presenter.own;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.home.IAddress;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.own.bean.AdressBean;
import com.example.mymall.utils.RxUtils;

public class AddressPresenterlmp extends BasePersenter<IAddress.IAdressView> implements IAddress.IAdressPersenter {
    //地址管理
    @Override
    public void getAdressById(int parentId) {
        addSubscribe(HttpManager.getInstance().getMallApi().getAdressById(parentId)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<AdressBean>(mView) {
                    @Override
                    public void onNext(AdressBean adressBean) {
                        mView.getAdressByIdReturn(adressBean);
                    }
                }));
    }
}