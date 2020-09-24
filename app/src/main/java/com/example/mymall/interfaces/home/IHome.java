package com.example.mymall.interfaces.home;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.home.bean.HomeBean;

import java.util.List;

public interface IHome {
    interface IView extends IBaseView {
        void getHomeDataReturn(List<HomeBean.HomeListBean> result);

    }

    interface IPersenter extends IBasePresenter<IHome.IView> {
        void getHomeData();
    }
}
