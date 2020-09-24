package com.example.mymall.presenter.home;


import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.home.IDetail;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.home.bean.CartBean;
import com.example.mymall.ui.home.bean.DeleteCartBean;
import com.example.mymall.utils.RxUtils;

public class CartListPersenter extends BasePersenter<IDetail.ICartView> implements IDetail.ICartPersenter {

    //
    @Override
    public void getCartList() {
        addSubscribe(HttpManager.getInstance().getMallApi().getCartList()
                .compose(RxUtils.<CartBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<CartBean>(mView) {
                    @Override
                    public void onNext(CartBean result) {
                        mView.getCartListReturn(result);
                    }
                }));
    }


    //从购物车中删除
    @Override
    public void deleteCartList(String productIds) {
        addSubscribe(HttpManager.getInstance().getMallApi().cartDelete(productIds)
                .compose(RxUtils.<DeleteCartBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<DeleteCartBean>(mView) {
                    @Override
                    public void onNext(DeleteCartBean result) {
                        mView.deleteCartListReturn(result);
                    }
                }));
    }
}
