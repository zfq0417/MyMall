package com.example.mymall.presenter.home.details;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.home.IDetail;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.home.bean.AddCartInfoBean;
import com.example.mymall.ui.home.bean.GoodDetailBean;
import com.example.mymall.utils.RxUtils;

public class GoodDetailsPresenterlmp extends BasePersenter<IDetail.IDetailsView> implements IDetail.IDetailsPersenter {

    //商品详情
    @Override
    public void getDetails(int id) {
        addSubscribe(HttpManager.getInstance().getMallApi().getGoodDetail(id)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<GoodDetailBean>(mView) {
                    @Override
                    public void onNext(GoodDetailBean goodDetailBean) {
                        mView.getDetailsataReturn(goodDetailBean);
                    }
                }));
    }

    //添加到购物车
    @Override
    public void addCart(int goodsId, int number, int productId) {
        addSubscribe(HttpManager.getInstance().getMallApi().addCart(goodsId, number, productId)
                .compose(RxUtils.<AddCartInfoBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<AddCartInfoBean>(mView) {
                    @Override
                    public void onNext(AddCartInfoBean result) {
                        mView.addCartReturn(result);
                    }
                }));
    }


}
