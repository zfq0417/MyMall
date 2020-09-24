package com.example.mymall.interfaces.home;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.home.bean.BrandXqBean;
import com.example.mymall.ui.home.bean.ShangXqBean;
import com.example.mymall.ui.own.bean.AdressBean;

public interface IBrandXq {
    //返回的
    interface IBrandXqView extends IBaseView {
        //地址管理
        void getBrandXqReturn(BrandXqBean bean);

        void getShangXqReturn(ShangXqBean bean);
    }

    //请求的
    interface IBrandXqPersenter extends IBasePresenter<IBrandXq.IBrandXqView> {
        //商品详情 brandId=1001000&page=1&size=1000
        void getBrandXq(int brandId, int page, int size);

        void getShangXq(int id);
    }
}
