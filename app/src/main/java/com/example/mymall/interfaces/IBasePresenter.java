package com.example.mymall.interfaces;

/*
 * P 层接口基类  用来约束管理进来的 V 层接口基类
 * */
public interface IBasePresenter<T extends IBaseView> {

    //V 层接口的关联
    void attachView(T view);

    //V 层接口的取消关联
    void detachView();

}
