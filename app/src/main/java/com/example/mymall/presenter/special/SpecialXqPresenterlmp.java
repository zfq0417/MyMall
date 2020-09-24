package com.example.mymall.presenter.special;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.special.ISpecial;
import com.example.mymall.interfaces.special.ISpecialXq;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.specialsubject.bean.SpeSubXgBean;
import com.example.mymall.utils.RxUtils;

public class SpecialXqPresenterlmp extends BasePersenter<ISpecialXq.SpecialXqView> implements ISpecialXq.SpecialXqPersenter {
    //专题相关推荐 详情
    @Override
    public void getSpeSubXq(int id) {
        addSubscribe(HttpManager.getInstance().getMallApi().getSpeSubXgData(id)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<SpeSubXgBean>(mView) {
                    @Override
                    public void onNext(SpeSubXgBean speSubXgBean) {
                        mView.getSpeSubXqReturn(speSubXgBean);
                    }
                }));
    }
}
