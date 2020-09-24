package com.example.mymall.interfaces.home;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.home.bean.AddCartInfoBean;
import com.example.mymall.ui.home.bean.CartBean;
import com.example.mymall.ui.home.bean.DeleteCartBean;
import com.example.mymall.ui.home.bean.GoodDetailBean;

public interface IDetail {
    //返回的
    interface IDetailsView extends IBaseView {
        void getDetailsataReturn(GoodDetailBean bean);

        //添加到购物车
        void addCartReturn(AddCartInfoBean bean);
    }

    //请求的
    interface IDetailsPersenter extends IBasePresenter<IDetail.IDetailsView> {
        void getDetails(int id);

        //添加到购物车
        void addCart(int goodsId, int number, int productId);
    }


    /**
     * 购物车接口
     */
    interface ICartView extends IBaseView {
        //获取购物车的数据
        void getCartListReturn(CartBean result);

        //删除购物车数据
        void deleteCartListReturn(DeleteCartBean result);
    }

    interface ICartPersenter extends IBasePresenter<ICartView> {

        //获取购物车的数据
        void getCartList();

        //删除购物车数据
        void deleteCartList(String productIds);

    }

}
