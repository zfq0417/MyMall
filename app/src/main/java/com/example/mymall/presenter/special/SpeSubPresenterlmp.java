package com.example.mymall.presenter.special;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.special.ISpecial;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.specialsubject.bean.SpeSubBean;
import com.example.mymall.utils.RxUtils;

public class SpeSubPresenterlmp extends BasePersenter<ISpecial.ISpecialView> implements ISpecial.SpecialPersenter {
    @Override
    public void getSpeSub(int page, int size) {
        addSubscribe(HttpManager.getInstance().getMallApi().speSubb(page, size)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<SpeSubBean>(mView) {
                    @Override
                    public void onNext(SpeSubBean speSubBean) {
                        mView.getSpeSubReturn(speSubBean);
                    }
                }));
    }

    //专题
    /*@Override
    public void getSpeSub(int page, int size) {
        addSubscribe(HttpManager.getInstance().getMallApi().getSpeSubb(page, size)
                .compose(RxUtils.<SpeSubBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<SpeSubBean>(mView) {
                    @Override
                    public void onNext(SpeSubBean speSubBean) {
                        mView.getSpeSubReturn(speSubBean);
                    }
                }));
    }*/
}
