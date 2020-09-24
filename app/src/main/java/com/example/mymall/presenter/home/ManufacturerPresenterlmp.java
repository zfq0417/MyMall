package com.example.mymall.presenter.home;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.home.IHome;
import com.example.mymall.interfaces.home.IManufacturer;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.home.bean.ManufacturerBean;
import com.example.mymall.utils.RxUtils;

public class ManufacturerPresenterlmp extends BasePersenter<IManufacturer.IManufacturerView> implements IManufacturer.IManufacturerPersenter {

    //制造商列表
    @Override
    public void getManufacturer(int page, int size) {
        addSubscribe(HttpManager.getInstance().getMallApi().getManufacturerData(page, size)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<ManufacturerBean>(mView) {
                    @Override
                    public void onNext(ManufacturerBean bean) {
                        mView.getManufacturerReturn(bean);
                    }
                }));
    }
}
