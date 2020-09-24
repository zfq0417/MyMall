package com.example.mymall.interfaces;



public interface IMain {
    //返回的
    interface RecommendView extends IBaseView {   //返回数据

    }

    //请求的
    interface RecommendPersenter extends IBasePresenter<RecommendView> {    //加载数据

    }
}
