package com.example.mymall.presenter.home;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.home.IBrandXq;
import com.example.mymall.interfaces.home.IDetail;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.home.bean.BrandXqBean;
import com.example.mymall.ui.home.bean.ShangXqBean;
import com.example.mymall.utils.RxUtils;

public class BrandXqPresenterlmp extends BasePersenter<IBrandXq.IBrandXqView> implements IBrandXq.IBrandXqPersenter {

    //商品详情
    @Override
    public void getBrandXq(int brandId, int page, int size) {
        addSubscribe(HttpManager.getInstance().getMallApi().getBrandXqData(brandId, page, size)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<BrandXqBean>(mView) {
                    @Override
                    public void onNext(BrandXqBean brandXqBean) {
                        mView.getBrandXqReturn(brandXqBean);
                    }
                }));
    }

    //商品详情  上半
    @Override
    public void getShangXq(int id) {
        addSubscribe(HttpManager.getInstance().getMallApi().getShangXqData(id)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<ShangXqBean>(mView) {
                    @Override
                    public void onNext(ShangXqBean shangXqBean) {
                        mView.getShangXqReturn(shangXqBean);
                    }
                }));
    }
}
