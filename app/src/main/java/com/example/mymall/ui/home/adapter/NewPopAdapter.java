package com.example.mymall.ui.home.adapter;

import android.content.Context;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.home.bean.NewListBean;
import com.example.mymall.utils.TVUtils;

import java.util.List;

public class NewPopAdapter extends BaseAdapter {
    public NewPopAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.item_newpop;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {
        TextView tv = (TextView) vh.getViewById(R.id.item_newpop_tv);

        NewListBean.DataBeanX.FilterCategoryBean data1 = (NewListBean.DataBeanX.FilterCategoryBean) data;

        TVUtils.setText(tv, data1.getName());

    }
}
