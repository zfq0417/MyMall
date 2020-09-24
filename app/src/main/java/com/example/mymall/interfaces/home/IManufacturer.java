package com.example.mymall.interfaces.home;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.home.bean.ManufacturerBean;


//制造商
public interface IManufacturer {


    interface IManufacturerView extends IBaseView {
        void getManufacturerReturn(ManufacturerBean bean);
    }

    interface IManufacturerPersenter extends IBasePresenter<IManufacturer.IManufacturerView> {
        void getManufacturer(int page, int size);
    }
}
