package com.example.mymall.ui.home.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.home.bean.ManufacturerBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.List;

public class ManufacturerAdapter extends BaseAdapter {

    public ManufacturerAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.item_manufacturer;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {
        ManufacturerBean.DataBeanX.DataBean data1 = (ManufacturerBean.DataBeanX.DataBean) data;

        ImageView pic_url = (ImageView) vh.getViewById(R.id.item_manu_pic_url);
        TextView name = (TextView) vh.getViewById(R.id.item_manu_tv_name);

        GildeUtils.loadImg(context, data1.getApp_list_pic_url(), pic_url);
        TVUtils.setText(name, data1.getName());
    }
}
