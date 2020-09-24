package com.example.mymall.interfaces.classif;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.classification.bean.ClassTabListBean;

public interface IClassTabList {
    //分类数据
    interface IClassTabListView extends IBaseView {
        void getClassTabListReturn(ClassTabListBean bean);
    }

    //请求的
    interface IClassTabListPersenter extends IBasePresenter<IClassTabList.IClassTabListView> {
        void getClassTabList(int id);
    }
}
