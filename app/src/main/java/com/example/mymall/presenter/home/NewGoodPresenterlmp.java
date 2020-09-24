package com.example.mymall.presenter.home;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.home.IDetail;
import com.example.mymall.interfaces.home.INewGood;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.home.bean.NewListBean;
import com.example.mymall.utils.RxUtils;

public class NewGoodPresenterlmp extends BasePersenter<INewGood.INewGoodView> implements INewGood.INewGoodPersenter {

    //周一周四新品首发
    @Override
    public void getNewGoodData(int isnew, int page, int size, String order, String sort, int categoryId) {
        addSubscribe(HttpManager.getInstance().getMallApi().getNewListData(isnew, page, size, order, sort, categoryId)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<NewListBean>(mView) {
                    @Override
                    public void onNext(NewListBean newListBean) {
                        mView.getNewGoodDataReturn(newListBean);
                    }
                }));
    }
}
