package com.example.mymall.ui.home.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.home.bean.NewListBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.List;

public class NewGoodAdapter extends BaseAdapter {


    public NewGoodAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.item_newlist_adapter;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {

        NewListBean.DataBeanX.GoodsListBean data1 = (NewListBean.DataBeanX.GoodsListBean) data;

        ImageView img = (ImageView) vh.getViewById(R.id.item_newlist_iv_img);
        TextView name = (TextView) vh.getViewById(R.id.item_newlist_tv_name);
        TextView price = (TextView) vh.getViewById(R.id.item_newlist_tv_price);

        GildeUtils.loadImg(context, data1.getList_pic_url(), img);
        TVUtils.setText(name, data1.getName());
        TVUtils.setText(price, "￥" + data1.getRetail_price());

    }


}
