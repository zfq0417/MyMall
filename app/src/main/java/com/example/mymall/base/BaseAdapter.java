package com.example.mymall.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class BaseAdapter<T> extends RecyclerView.Adapter {

    protected Context context;
    protected List<T> data;
    private IClick callback;
    public void setClick(IClick cb){
        callback = cb;
    }


    public BaseAdapter(Context context, List<T> data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(getLayout(),parent,false);
        BaseViewHolder vh = new BaseViewHolder(view);
        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(callback != null){
                    callback.click(vh.getLayoutPosition());
                }
            }
        });
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        BaseViewHolder vh = (BaseViewHolder) holder;
        T _data = data.get(position);
        bindData(vh,_data);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    /**
     * 获取当前适配器的布局layout
     * @return
     */
    protected abstract int getLayout();

    /**
     * 绑定数据
     * @return
     */
    protected abstract void bindData(BaseViewHolder vh,T data);



    public interface IClick{
        void click(int pos);
    }


    /**
     * 基类适配器
     */
    public class BaseViewHolder extends RecyclerView.ViewHolder{

        SparseArray views = new SparseArray();

        public BaseViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        /**
         * 通过id获取适配器的组件
         * @param id
         * @return
         */
        public View getViewById(int id){
            View view = (View) views.get(id);
            if(view == null){
                view = itemView.findViewById(id);
                views.append(id,view);
            }
            return view;
        }
    }

}
