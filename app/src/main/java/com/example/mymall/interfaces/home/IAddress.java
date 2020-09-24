package com.example.mymall.interfaces.home;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.own.bean.AdressBean;

public interface IAddress {
    //返回的
    interface IAdressView extends IBaseView {
        //地址管理
        void getAdressByIdReturn(AdressBean result);
    }

    //请求的
    interface IAdressPersenter extends IBasePresenter<IAdressView> {
        //地址管理
        void getAdressById(int parentId);
    }
}
