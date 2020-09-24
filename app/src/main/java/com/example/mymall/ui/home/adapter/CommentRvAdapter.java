package com.example.mymall.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.ui.home.actviity.GoodDetailActivity;
import com.example.mymall.ui.home.bean.GoodDetailBean;
import com.example.mymall.utils.GildeUtils;

import java.util.List;

public class CommentRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private final List<GoodDetailBean.DataBeanX.CommentBean.DataBean.PicListBean> list;

    public CommentRvAdapter(Context context, List<GoodDetailBean.DataBeanX.CommentBean.DataBean.PicListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gooddetail_comment, parent, false);
        return new CommentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        GoodDetailBean.DataBeanX.CommentBean.DataBean.PicListBean picListBean = list.get(position);
        CommentViewHolder holder1 = (CommentViewHolder) holder;
        GildeUtils.loadImg(context,picListBean.getPic_url(),holder1.iv);
    }
    //item_comment_iv

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CommentViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;

        public CommentViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.item_comment_iv);
        }
    }

}
