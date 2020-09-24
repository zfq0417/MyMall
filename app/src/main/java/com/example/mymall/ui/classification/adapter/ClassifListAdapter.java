package com.example.mymall.ui.classification.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.classification.bean.ClassTabListBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.List;

public class ClassifListAdapter extends BaseAdapter {
    public ClassifListAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.item_classtablist;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {
        ClassTabListBean.DataBean.CurrentCategoryBean.SubCategoryListBean data1 = (ClassTabListBean.DataBean.CurrentCategoryBean.SubCategoryListBean) data;

        ImageView iv = (ImageView) vh.getViewById(R.id.item_classlist_wap_banner_url);
        TextView name = (TextView) vh.getViewById(R.id.item_classlist_name);

        GildeUtils.loadImg(context,data1.getWap_banner_url(),iv);
        TVUtils.setText(name,data1.getName());


    }
}
