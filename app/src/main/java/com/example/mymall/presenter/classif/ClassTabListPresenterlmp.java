package com.example.mymall.presenter.classif;

import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.classif.IClassTabList;
import com.example.mymall.interfaces.classif.IClassifTab;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.classification.bean.ClassTabListBean;
import com.example.mymall.utils.RxUtils;

public class ClassTabListPresenterlmp extends BasePersenter<IClassTabList.IClassTabListView> implements IClassTabList.IClassTabListPersenter {

    //分类数据
    @Override
    public void getClassTabList(int id) {
        addSubscribe(HttpManager.getInstance().getMallApi().getClassTabListData(id)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<ClassTabListBean>(mView) {
                    @Override
                    public void onNext(ClassTabListBean classTabListBean) {
                        mView.getClassTabListReturn(classTabListBean);
                    }
                }));
    }
}
