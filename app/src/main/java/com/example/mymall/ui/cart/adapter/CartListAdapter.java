package com.example.mymall.ui.cart.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.ui.home.bean.CartBean;
import com.example.mymall.view.CartCustView;

import java.util.List;

public class CartListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private final List<CartBean.DataBean.CartListBean> list;
    private CheckBoxClick click;
    public boolean isEditor; //是否是编辑状态

    public CartListAdapter(Context context, List<CartBean.DataBean.CartListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cartlist_item, parent, false);
        return new CartListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CartBean.DataBean.CartListBean bean = list.get(position);

        CartListViewHolder holder1 = (CartListViewHolder) holder;

        //通过编辑状态控制界面组件
        if (isEditor) {
            holder1.txtName.setVisibility(View.GONE);   //隐藏名字
            holder1.txtNumber.setVisibility(View.GONE);   //隐藏数量
            holder1.txtSelect.setVisibility(View.VISIBLE);  //显示选中文本
            holder1.cartCustomView.setVisibility(View.VISIBLE); //显示自定义  view
        } else {
            holder1.txtName.setVisibility(View.VISIBLE);      //显示名字
            holder1.txtNumber.setVisibility(View.VISIBLE);    //显示数量
            holder1.txtSelect.setVisibility(View.GONE);       //隐藏选中文本
            holder1.cartCustomView.setVisibility(View.GONE);  //隐藏自定义  view
        }

        //赋值
        holder1.txtName.setText(bean.getGoods_name());           //名字
        holder1.txtNumber.setText("X" + bean.getNumber());        //数量
        holder1.txtPrice.setText("￥" + bean.getRetail_price());  //价格

        holder1.cartCustomView.initView();

        holder1.cartCustomView.setValue(bean.getNumber());
        //加号减号监听
        holder1.cartCustomView.setOnClickListener(new CartCustView.IClick() {
            @Override
            public void clickCB(int value) {
                bean.setNumber(value);
            }
        });
        //默认  选中不选中
        //holder1.checkBox.setChecked(bean.select);
        holder1.checkBox.setSelected(bean.select);

        holder1.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                bean.select = !bean.select;
                if(click != null){
                    click.checkChange();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class CartListViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox;
        TextView txtName;     //名字
        TextView txtNumber;   //数量
        TextView txtPrice;     //价格
        TextView txtSelect;   //选中文本
        //自定义  view   加减
        CartCustView cartCustomView;

        public CartListViewHolder(@NonNull View vh) {
            super(vh);
            checkBox = (CheckBox) vh.findViewById(R.id.checkbox_select);
            txtName = (TextView) vh.findViewById(R.id.txt_name);     //名字
            txtNumber = (TextView) vh.findViewById(R.id.txt_number);   //数量
            txtPrice = (TextView) vh.findViewById(R.id.txt_price);     //价格
            txtSelect = (TextView) vh.findViewById(R.id.txt_select);   //选中文本
            //自定义  view   加减
            cartCustomView = (CartCustView) vh.findViewById(R.id.view_number);
        }
    }

    public void setOnItemCheckBoxClickListener(CheckBoxClick click) {
        this.click = click;
    }


    public interface CheckBoxClick {
        void checkChange();
    }

}
