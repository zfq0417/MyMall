package com.example.mymall.ui.specialsubject;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.base.BaseAdapter;
import com.example.mymall.base.BaseFragment;
import com.example.mymall.interfaces.special.ISpecial;
import com.example.mymall.presenter.special.SpeSubPresenterlmp;
import com.example.mymall.ui.specialsubject.activity.SpeSubXgActivity;
import com.example.mymall.ui.specialsubject.adapter.SpecialSubAdapter;
import com.example.mymall.ui.specialsubject.bean.SpeSubBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

//专题
public class SpecialsubjectFragment extends BaseFragment<ISpecial.SpecialPersenter> implements ISpecial.ISpecialView, View.OnClickListener {

    @BindView(R.id.spesub_rv)
    RecyclerView rv;
    //上一页
    @BindView(R.id.special_tv_previous)
    TextView tv_previous;
    //下一页
    @BindView(R.id.special_tv_nextpage)
    TextView tv_nextpage;

    private List<SpeSubBean.DataBeanX.DataBean> list;
    private SpecialSubAdapter specialSubAdapter;
    private int page = 1;

    @Override
    protected int getLayout() {
        return R.layout.fragment_specialsubject;
    }

    @Override
    protected void initView() {
        //集合  存数据源
        list = new ArrayList<>();
        //创建适配器
        specialSubAdapter = new SpecialSubAdapter(getActivity(), list);
        //添加布局管理器
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        //绑定适配器
        rv.setAdapter(specialSubAdapter);

        //点击点听
        tv_previous.setOnClickListener(this);  //上一页
        tv_nextpage.setOnClickListener(this);  //下一页

        //条目点击
        specialSubAdapter.setClick(new BaseAdapter.IClick() {
            @Override
            public void click(int pos) {
                int id = list.get(pos).getId();
                Intent intent = new Intent(getActivity(), SpeSubXgActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });


    }

    @Override
    protected ISpecial.SpecialPersenter initPersenter() {
        return new SpeSubPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getSpeSub(page, 10);
    }


    //专题请求返回的数据
    @Override
    public void getSpeSubReturn(SpeSubBean bean) {
        List<SpeSubBean.DataBeanX.DataBean> data = bean.getData().getData();

        if (data != null && data.size() > 0) {
            list.addAll(data);
            specialSubAdapter.notifyDataSetChanged();
        }
    }

    //点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.special_tv_previous:   //上一页

                if (page == 1) {
                    Toast.makeText(context, "已经没有上一页了哦", Toast.LENGTH_SHORT).show();
                } else {

                    page--;
                    list.clear();   //清空集合
                    persenter.getSpeSub(page, 10);
                    //刷新适配器
                    specialSubAdapter.notifyDataSetChanged();

                }

                break;
            case R.id.special_tv_nextpage:   //下一页
                page++;
                if (page <= 2) {

                    list.clear();   //清空集合
                    persenter.getSpeSub(page, 10);
                    //刷新适配器
                    specialSubAdapter.notifyDataSetChanged();

                } else {
                    Toast.makeText(context, "已经没有下一页了哦", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}