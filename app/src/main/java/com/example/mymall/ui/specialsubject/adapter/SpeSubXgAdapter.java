package com.example.mymall.ui.specialsubject.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.specialsubject.bean.SpeSubXgBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.List;

//专题相关推荐 详情
public class SpeSubXgAdapter extends BaseAdapter {

    public SpeSubXgAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.item_spesub_xg;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {
        SpeSubXgBean.DataBean data1 = (SpeSubXgBean.DataBean) data;

        ImageView pic_url = (ImageView) vh.getViewById(R.id.item_spesub_xg_scene_pic_url);
        TextView title = (TextView) vh.getViewById(R.id.item_spesub_xg_tv_title);

        GildeUtils.loadImg(context,data1.getScene_pic_url(),pic_url);
        TVUtils.setText(title,data1.getTitle());

    }
}
