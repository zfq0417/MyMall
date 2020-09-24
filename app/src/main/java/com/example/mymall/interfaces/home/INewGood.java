package com.example.mymall.interfaces.home;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.home.bean.NewListBean;

import retrofit2.http.Field;
import retrofit2.http.Query;

public interface INewGood {
    //返回的
    interface INewGoodView extends IBaseView {
        //周一周四新品首发
        void getNewGoodDataReturn(NewListBean bean);

    }

    //请求的
    interface INewGoodPersenter extends IBasePresenter<INewGood.INewGoodView> {
        //周一周四新品首发
        void getNewGoodData(int isnew, int page, int size, String order, String sort, int categoryId);
    }
}
