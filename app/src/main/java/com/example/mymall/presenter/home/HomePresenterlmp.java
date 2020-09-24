package com.example.mymall.presenter.home;


import com.example.mymall.base.BasePersenter;
import com.example.mymall.common.CommonSubscriber;
import com.example.mymall.interfaces.home.IHome;
import com.example.mymall.model.api.HttpManager;
import com.example.mymall.ui.home.bean.HomeBean;
import com.example.mymall.utils.RxUtils;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Function;

public class HomePresenterlmp extends BasePersenter<IHome.IView> implements IHome.IPersenter {

    //首页
    @Override
    public void getHomeData() {
        addSubscribe(HttpManager.getInstance().getMallApi().getHome()
                .compose(RxUtils.<HomeBean>rxScheduler())
                //数据加工 把HomeBean转换成List<HomeListBean>
                .map(new Function<HomeBean, List<HomeBean.HomeListBean>>() {
                    @Override
                    public List<HomeBean.HomeListBean> apply(HomeBean homeBean) throws Exception {
                        List<HomeBean.HomeListBean> list = new ArrayList<>();

                        // 轮播图  tab    标题   标题顶部带边距   品牌   新品首发   人气推荐    专题精选  居家

                        //第一个  轮播图
                        HomeBean.HomeListBean banner = new HomeBean.HomeListBean();
                        banner.currentType = HomeBean.ITEM_TYPE_BANNER;
                        banner.data = homeBean.getData().getBanner();
                        list.add(banner);

                        //第二个  tab
                        HomeBean.HomeListBean tab = new HomeBean.HomeListBean();
                        tab.currentType = HomeBean.ITEM_TYPE_TAB;
                        tab.data = homeBean.getData().getChannel();
                        list.add(tab);



                        //封装带top边距的标题
                        HomeBean.HomeListBean title1 = new HomeBean.HomeListBean();
                        title1.currentType = HomeBean.ITEM_TYPE_TITLETOP;
                        title1.data = "品牌制造商直供";
                        list.add(title1);
                        //第三个  品牌直供
                        for (int i = 0; i < homeBean.getData().getBrandList().size(); i++) {
                            HomeBean.HomeListBean brand = new HomeBean.HomeListBean();
                            brand.currentType = HomeBean.ITEM_TYPE_BRAND;
                            brand.data = homeBean.getData().getBrandList().get(i);
                            list.add(brand);
                        }

                        //新品首发标题
                        HomeBean.HomeListBean title2 = new HomeBean.HomeListBean();
                        title2.currentType = HomeBean.ITEM_TYPE_TITLE;
                        title2.data = "周一周四·新品首发";
                        list.add(title2);
                        //第四个  新品首发
                        for (int i = 0; i < homeBean.getData().getNewGoodsList().size(); i++) {
                            HomeBean.HomeListBean newgood = new HomeBean.HomeListBean();
                            newgood.currentType = HomeBean.ITEM_TYPE_NEW;
                            newgood.data = homeBean.getData().getNewGoodsList().get(i);
                            list.add(newgood);
                        }

                        //人气推荐标题
                        HomeBean.HomeListBean title3 = new HomeBean.HomeListBean();
                        title3.currentType = HomeBean.ITEM_TYPE_TITLETOP;
                        title3.data = "人气推荐";
                        list.add(title3);
                        //第五个   人气推荐
                        for (int i = 0; i < homeBean.getData().getHotGoodsList().size(); i++) {
                            HomeBean.HomeListBean hotgood = new HomeBean.HomeListBean();
                            hotgood.currentType = HomeBean.ITEM_TYPE_HOT;
                            hotgood.data = homeBean.getData().getHotGoodsList().get(i);
                            list.add(hotgood);
                        }

                        //专题精选
                        HomeBean.HomeListBean title4 = new HomeBean.HomeListBean();
                        title4.currentType = HomeBean.ITEM_TYPE_TITLETOP;
                        title4.data = "专题精选";
                        list.add(title4);
                        //专题数据
                        HomeBean.HomeListBean topic = new HomeBean.HomeListBean();
                        topic.currentType = HomeBean.ITEM_TYPE_TOPIC;
                        topic.data = homeBean.getData().getTopicList();
                        list.add(topic);

                        //居家 .......
                        //解析商品数据   catgroy
                        for(HomeBean.DataBean.CategoryListBean item:homeBean.getData().getCategoryList()){
                            //标题
                            HomeBean.HomeListBean title5 = new HomeBean.HomeListBean();
                            title5.currentType = HomeBean.ITEM_TYPE_TITLETOP;
                            title5.data = item.getName();
                            list.add(title5);
                            for(HomeBean.DataBean.CategoryListBean.GoodsListBean good:item.getGoodsList()){
                                HomeBean.HomeListBean catgroy = new HomeBean.HomeListBean();
                                catgroy.currentType = HomeBean.ITEM_TYPE_CATEGORY;
                                catgroy.data = good;
                                list.add(catgroy);
                            }
                        }


                        return list;
                    }
                })
                .subscribeWith(new CommonSubscriber<List<HomeBean.HomeListBean>>(mView) {
                    @Override
                    public void onNext(List<HomeBean.HomeListBean> list) {
                        mView.getHomeDataReturn(list);
                    }
                }));
    }
}
