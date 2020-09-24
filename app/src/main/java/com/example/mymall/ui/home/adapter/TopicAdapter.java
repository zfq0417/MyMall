package com.example.mymall.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.ui.home.bean.HomeBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.List;

public class TopicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private final List<HomeBean.DataBean.TopicListBean> data;

    public TopicAdapter(Context context, List<HomeBean.DataBean.TopicListBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_home_topic, parent, false);
        return new TopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        HomeBean.DataBean.TopicListBean topicListBean = data.get(position);
        TopViewHolder holder1 = (TopViewHolder) holder;

        GildeUtils.loadImg(context, topicListBean.getItem_pic_url(), holder1.img);
        TVUtils.setText(holder1.name, topicListBean.getTitle());
        TVUtils.setText(holder1.subtitle, topicListBean.getSubtitle());
        TVUtils.setText(holder1.price, "￥" + topicListBean.getPrice_info() + "元起");
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class TopViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;
        TextView price;
        TextView subtitle;

        public TopViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.item_topic_adapter_img);
            name = itemView.findViewById(R.id.item_topic_adapter_tv_name);
            price = itemView.findViewById(R.id.item_topic_adapter_tv_price);
            subtitle = itemView.findViewById(R.id.item_topic_adapter_tv_subtitle);
        }
    }

    /*public TopicAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.layout_home_topic;
    }

    @Override
    protected void bindData(BaseViewHolder vh, Object data) {
        HomeBean.DataBean.TopicListBean topicListBean = (HomeBean.DataBean.TopicListBean) data;
        //找控件
        ImageView img = (ImageView) vh.getViewById(R.id.item_topic_adapter_img);
        TextView name = (TextView) vh.getViewById(R.id.item_topic_adapter_tv_name);
        TextView price = (TextView) vh.getViewById(R.id.item_topic_adapter_tv_price);
        TextView subtitle = (TextView) vh.getViewById(R.id.item_topic_adapter_tv_subtitle);

        //getItem_pic_url
        GildeUtils.loadImg(context,topicListBean.getItem_pic_url(),img);
        TVUtils.setText(name,topicListBean.getTitle());
        TVUtils.setText(subtitle,topicListBean.getSubtitle());
        //price_info
        TVUtils.setText(price,"￥"+topicListBean.getPrice_info()+"元起");

    }*/

}
