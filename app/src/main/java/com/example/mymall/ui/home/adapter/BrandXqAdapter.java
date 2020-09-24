package com.example.mymall.ui.home.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.home.bean.BrandXqBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.List;

public class BrandXqAdapter extends BaseAdapter {
    public BrandXqAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.item_branxq;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {
        BrandXqBean.DataBeanX.DataBean data1 = (BrandXqBean.DataBeanX.DataBean) data;

        ImageView img = (ImageView) vh.getViewById(R.id.item_brandxq_iv_img);
        TextView name = (TextView) vh.getViewById(R.id.item_brandxq_tv_name);
        TextView price = (TextView) vh.getViewById(R.id.item_brandxqt_tv_price);

        GildeUtils.loadImg(context, data1.getList_pic_url(), img);
        TVUtils.setText(name, data1.getName());
        TVUtils.setText(price, "￥" + data1.getRetail_price());


    }
}
