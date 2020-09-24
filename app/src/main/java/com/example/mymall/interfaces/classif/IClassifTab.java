package com.example.mymall.interfaces.classif;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.interfaces.login.ILoginHome;
import com.example.mymall.ui.classification.bean.ClassifTabBean;
import com.example.mymall.ui.own.bean.RegisterBean;

public interface IClassifTab {
    //分类导航栏
    interface IClassifTabView extends IBaseView {
        void getClassifTabReturn(ClassifTabBean bean);
    }

    //请求的
    interface IClassifTabPersenter extends IBasePresenter<IClassifTab.IClassifTabView> {
        void getClassifTab();
    }
}
