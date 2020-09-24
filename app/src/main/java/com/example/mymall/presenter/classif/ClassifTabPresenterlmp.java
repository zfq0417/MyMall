package com.example.mymall.presenter.classif;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.classif.IClassifTab;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.classification.bean.ClassifTabBean;
import com.example.mymall.utils.RxUtils;

public class ClassifTabPresenterlmp extends BasePersenter<IClassifTab.IClassifTabView> implements IClassifTab.IClassifTabPersenter {

    //分类垂直导航栏
    @Override
    public void getClassifTab() {
        addSubscribe(HttpManager.getInstance().getMallApi().getClassifTabData()
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<ClassifTabBean>(mView) {
                    @Override
                    public void onNext(ClassifTabBean classifTabBean) {
                        mView.getClassifTabReturn(classifTabBean);
                    }
                }));
    }
}
