package com.example.mymall.model.api;


import androidx.constraintlayout.helper.widget.Flow;

import com.example.mymall.ui.classification.bean.ClassTabListBean;
import com.example.mymall.ui.classification.bean.ClassifTabBean;
import com.example.mymall.ui.home.bean.AddCartInfoBean;
import com.example.mymall.ui.home.bean.BrandXqBean;
import com.example.mymall.ui.home.bean.CartBean;
import com.example.mymall.ui.home.bean.DeleteCartBean;
import com.example.mymall.ui.home.bean.GoodDetailBean;
import com.example.mymall.ui.home.bean.HomeBean;
import com.example.mymall.ui.home.bean.ManufacturerBean;
import com.example.mymall.ui.home.bean.NewListBean;
import com.example.mymall.ui.home.bean.ShangXqBean;
import com.example.mymall.ui.own.bean.AdressBean;
import com.example.mymall.ui.own.bean.LoginBean;
import com.example.mymall.ui.own.bean.RegisterBean;
import com.example.mymall.ui.specialsubject.bean.SpeSubBean;
import com.example.mymall.ui.specialsubject.bean.SpeSubXgBean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Apiservice {

    //http://cdwan.cn/api/index
    @GET("index")
    Flowable<HomeBean> getHome();


    //http://cdwan.cn/api/goods/detail
    //商品购买页详情
    @GET("goods/detail")
    Flowable<GoodDetailBean> getGoodDetail(@Query("id") int id);

    //http://cdwan.cn/api/topic/list
    //专题列表
   /* @GET("topic/list")
    Flowable<SpeSubBean> getSpeSubb();*/
    //https://cdwan.cn/api/topic/list?page=1&size=10
    @GET("topic/list")
    Flowable<SpeSubBean> speSubb(@Query("page") int page, @Query("size") int size);


    //添加到购物车
    @POST("cart/add")
    @FormUrlEncoded
    Flowable<AddCartInfoBean> addCart(@Field("goodsId") int goodsId, @Field("number") int number, @Field("productId") int productId);


    //获取购物车的数据
    @GET("cart/index")
    Flowable<CartBean> getCartList();

    //删除购物车
    @POST("cart/delete")
    @FormUrlEncoded
    Flowable<DeleteCartBean> cartDelete(@Field("productIds") String productIds);


    //注册
    @POST("auth/register")
    @FormUrlEncoded
    Flowable<RegisterBean> getRegisterData(@Field("username") String name, @Field("password") String password);

    //登录
    @POST("auth/login")
    @FormUrlEncoded
    Flowable<LoginBean> getLoginData(@Field("username") String name, @Field("password") String password);

    //地址管理
    @GET("region/list")
    Flowable<AdressBean> getAdressById(@Query("parentId") int parentId);

    //分类导航栏  https://cdwan.cn/api/catalog/index
    @GET("catalog/index")
    Flowable<ClassifTabBean> getClassifTabData();

    //分类右侧  https://cdwan.cn/api/catalog/current?id=1005000
    @GET("catalog/current")
    Flowable<ClassTabListBean> getClassTabListData(@Query("id") int id);

    //人气标题跳转
    @GET("goods/list")
    Flowable<NewListBean> getNewListData(@Query("isNew") int isnew, @Query("page") int page, @Query("size") int size,
                                         @Query("order") String order, @Query("sort") String sort, @Query("categoryId") int categoryId);

    //品牌制造商详情 https://cdwan.cn/api/goods/list?brandId=1001000&page=1&size=1000
    @GET("goods/list")
    Flowable<BrandXqBean> getBrandXqData(@Query("brandId") int brandId, @Query("page") int page, @Query("size") int size);

    //品牌制造商详情  上边部分  https://cdwan.cn/api/brand/detail?id=1001000
    @GET("brand/detail")
    Flowable<ShangXqBean> getShangXqData(@Query("id") int id);

    //制造商列表  https://cdwan.cn/api/brand/list?page=1&size=1000
    @GET("brand/list")
    Flowable<ManufacturerBean> getManufacturerData(@Query("page") int page, @Query("size") int size);

    //专题相关推荐 详情  https://cdwan.cn/api/topic/related?id=314
    @GET("topic/related")
    Flowable<SpeSubXgBean> getSpeSubXgData(@Query("id") int id);

}
