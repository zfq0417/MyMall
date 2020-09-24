package com.example.mymall.ui.home.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.mymall.R;
import com.example.mymall.ui.home.bean.HomeBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.SystemUtils;
import com.example.mymall.utils.TVUtils;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class HomeListAdapter extends BaseMultiItemQuickAdapter<HomeBean.HomeListBean, BaseViewHolder> {

    private Context context;
    private TopicAdapter topicAdapter;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param context
     * @param data    A new list is created out of this one to avoid mutable list
     */
    public HomeListAdapter(Context context, List<HomeBean.HomeListBean> data) {
        super(data);
        this.context = context;

        //UI绑定
        addItemType(HomeBean.ITEM_TYPE_BANNER, R.layout.item_home_banner);   //轮播图
        addItemType(HomeBean.ITEM_TYPE_TAB, R.layout.item_home_tab);          //tab  标题

        addItemType(HomeBean.ITEM_TYPE_TITLETOP, R.layout.layout_title_top);
        addItemType(HomeBean.ITEM_TYPE_BRAND, R.layout.item_home_brand);      //品牌直供

        addItemType(HomeBean.ITEM_TYPE_TITLE, R.layout.layout_title);
        addItemType(HomeBean.ITEM_TYPE_NEW, R.layout.item_home_newgood);      //新品首发


        addItemType(HomeBean.ITEM_TYPE_HOT, R.layout.item_home_hot);          //人气推荐

        addItemType(HomeBean.ITEM_TYPE_TOPIC, R.layout.item_home_topic);      //专题精选

        addItemType(HomeBean.ITEM_TYPE_CATEGORY, R.layout.item_home_category); //居家......


    }


    /**
     * 主要刷新数据，绑定数据  onbindviewholder
     *
     * @param helper viewholder 界面
     * @param item   数据
     */
    @Override
    protected void convert(BaseViewHolder helper, HomeBean.HomeListBean item) {
        switch (item.getItemType()) {
            case HomeBean.ITEM_TYPE_TITLE:
                updateTitle(helper, (String) item.data);
                break;
            case HomeBean.ITEM_TYPE_TITLETOP:
                updateTitle(helper, (String) item.data);
                break;
            case HomeBean.ITEM_TYPE_BANNER:   //轮播图
                updateBanner(helper, (List<HomeBean.DataBean.BannerBean>) item.data);
                break;

            case HomeBean.ITEM_TYPE_TAB:      //tab 标题
                updateTab(helper, (List<HomeBean.DataBean.ChannelBean>) item.data);
                break;

            case HomeBean.ITEM_TYPE_BRAND:     //品牌
                updateBrand(helper, (HomeBean.DataBean.BrandListBean) item.data);
                break;

            case HomeBean.ITEM_TYPE_NEW:     //新品首发
                updateNewGood(helper, (HomeBean.DataBean.NewGoodsListBean) item.data);
                break;
            case HomeBean.ITEM_TYPE_HOT:     //人气推荐
                udpateHot(helper, (HomeBean.DataBean.HotGoodsListBean) item.data);
                break;

            case HomeBean.ITEM_TYPE_TOPIC:    //专题精选
                updatetopic(helper, (List<HomeBean.DataBean.TopicListBean>) item.data);
                break;

            case HomeBean.ITEM_TYPE_CATEGORY:    //居家......
                updateCategory(helper, (HomeBean.DataBean.CategoryListBean.GoodsListBean) item.data);
                break;


        }
    }


    //标题
    private void updateTitle(BaseViewHolder helper, String data) {
        TextView tv = (TextView) helper.getView(R.id.txt_title);
        tv.setText(data);
    }


    //刷新  轮播图
    private void updateBanner(BaseViewHolder viewHolder, List<HomeBean.DataBean.BannerBean> bannerList) {
        Banner banner = viewHolder.getView(R.id.item_home_banner);
        if (banner.getTag() == null || (int) banner.getTag() == 0) {
            List<String> imgs = new ArrayList<>();
            for (HomeBean.DataBean.BannerBean item : bannerList) {
                imgs.add(item.getImage_url());
            }
            /* banner.setTag(1);
             *//*banner.setImageLoader(new GlideImageLoader());
            banner.setImages(imgs);*//*
            banner.start();*/

            banner.setImages(imgs)
                    .setImageLoader(new ImageLoader() {
                        @Override
                        public void displayImage(Context context, Object path, ImageView imageView) {
                            GildeUtils.loadImg(context, (String) path, imageView);
                        }
                    })
                    .start();
        }
    }

    //tab
    private void updateTab(BaseViewHolder helper, List<HomeBean.DataBean.ChannelBean> data) {
        LinearLayout linearLayout = helper.getView(R.id.item_home_ln_tab);
        if (linearLayout.getChildCount() == 0) {
            for (HomeBean.DataBean.ChannelBean item : data) {
                String name = item.getName();
                TextView tab = new TextView(context);
                tab.setText(name);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1);
                int size = SystemUtils.dp2px(context, 5);
                tab.setTextSize(size);
                tab.setLayoutParams(params);
                Drawable drawable = context.getDrawable(R.drawable.ic_launcher_background);
                drawable.setBounds(0, 0, 80, 80);
                tab.setCompoundDrawables(null, drawable, null, null);
                linearLayout.addView(tab);
                tab.setGravity(Gravity.CENTER);
            }
        }


    }

    //品牌直供
    private void updateBrand(BaseViewHolder helper, HomeBean.DataBean.BrandListBean data) {
        TextView tv_price = helper.getView(R.id.item_home_brand_tv_price);
        ImageView iv = (ImageView) helper.getView(R.id.item_home_brand_img);

        if (!TextUtils.isEmpty(data.getNew_pic_url())) {
            Glide.with(context).load(data.getNew_pic_url()).into(iv);
        }
        helper.setText(R.id.item_home_brand_tv_name, data.getName());
        tv_price.setText(data.getFloor_price() + "元起");
    }

    //新品首发
    private void updateNewGood(BaseViewHolder helper, HomeBean.DataBean.NewGoodsListBean data) {
        ImageView img = (ImageView) helper.getView(R.id.item_home_newgood_iv_img);
        TextView name = (TextView) helper.getView(R.id.item_home_newgood_tv_name);
        TextView price = (TextView) helper.getView(R.id.item_home_newgood_tv_price);

        GildeUtils.loadImg(context, data.getList_pic_url(), img);
        TVUtils.setText(name, data.getName());
        TVUtils.setText(price, data.getRetail_price() + "元");

    }


    //刷新 人气推荐推荐
    private void udpateHot(BaseViewHolder helper, HomeBean.DataBean.HotGoodsListBean data) {
        //找控件
        ImageView img = (ImageView) helper.getView(R.id.item_home_hot_iv_img);
        TextView name = (TextView) helper.getView(R.id.item_home_hot_tv_name);
        TextView title = (TextView) helper.getView(R.id.item_home_hot_tv_title);
        TextView price = (TextView) helper.getView(R.id.item_home_hot_tv_price);

        GildeUtils.loadImg(context, data.getList_pic_url(), img);
        TVUtils.setText(name, data.getName());
        TVUtils.setText(title, data.getGoods_brief());
        TVUtils.setText(price, "￥" + data.getRetail_price());

    }

    //专题精选
    private void updatetopic(BaseViewHolder helper, List<HomeBean.DataBean.TopicListBean> data) {
        RecyclerView rv = (RecyclerView) helper.getView(R.id.item_home_topic_rv);

        if (topicAdapter == null) {
            topicAdapter = new TopicAdapter(context, data);
            //创建布局管理器
            LinearLayoutManager manager = new LinearLayoutManager(context);
            //添加横向滑动
            manager.setOrientation(LinearLayoutManager.HORIZONTAL);
            rv.setLayoutManager(manager);
            rv.setAdapter(topicAdapter);
        } else if (rv.getAdapter() == null) {
            rv.setAdapter(topicAdapter);
        }
    }

    //居家.......
    private void updateCategory(BaseViewHolder helper, HomeBean.DataBean.CategoryListBean.GoodsListBean data) {
        ImageView img = (ImageView) helper.getView(R.id.item_home_categroy_iv_img);
        TextView name = (TextView) helper.getView(R.id.item_home_categroy_tv_name);
        TextView price = (TextView) helper.getView(R.id.item_home_categroy_tv_price);

        GildeUtils.loadImg(context, data.getList_pic_url(), img);
        TVUtils.setText(name, data.getName());
        TVUtils.setText(price, "￥" + data.getRetail_price());

    }

}
