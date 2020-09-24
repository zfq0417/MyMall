package com.example.mymall.ui.specialsubject.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.specialsubject.bean.SpeSubBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.List;

public class SpecialSubAdapter extends BaseAdapter {
    public SpecialSubAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.item_special;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {
        SpeSubBean.DataBeanX.DataBean data1 = (SpeSubBean.DataBeanX.DataBean) data;

        ImageView img = (ImageView) vh.getViewById(R.id.item_special_iv_img);
        TextView name = (TextView) vh.getViewById(R.id.item_special_tv_name);
        TextView price = (TextView) vh.getViewById(R.id.item_special__tv_price);
        TextView subTitle = (TextView) vh.getViewById(R.id.item_special_tv_subTitle);


        GildeUtils.loadImg(context, data1.getScene_pic_url(), img);
        TVUtils.setText(name, data1.getTitle());
        TVUtils.setText(price, "￥" + data1.getPrice_info());
        TVUtils.setText(subTitle, data1.getSubtitle());

    }
    /*private final Context context;
    private final List<SpeSubBean.DataBeanX.DataBean> list;


    public SpecialSubAdapter(Context context, List<SpeSubBean.DataBeanX.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_special, parent, false);
        return new SpecialSubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SpeSubBean.DataBeanX.DataBean dataBean = list.get(position);

        SpecialSubViewHolder holder1 = (SpecialSubViewHolder) holder;

        GildeUtils.loadImg(context, dataBean.getScene_pic_url(), holder1.img);
        TVUtils.setText(holder1.name, dataBean.getTitle());
        TVUtils.setText(holder1.price, "￥" + dataBean.getPrice_info());
        TVUtils.setText(holder1.subTitle, dataBean.getSubtitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class SpecialSubViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;
        TextView price;
        TextView subTitle;


        public SpecialSubViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.item_special_iv_img);
            name = itemView.findViewById(R.id.item_special_tv_name);
            price = itemView.findViewById(R.id.item_special__tv_price);
            subTitle = itemView.findViewById(R.id.item_special_tv_subTitle);
        }
    }*/


}