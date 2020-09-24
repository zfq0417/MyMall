package com.example.mymall.ui.classification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.mymall.R;
import com.example.mymall.adapter.VpAdapter;
import com.example.mymall.base.BaseFragment;
import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.classif.IClassifTab;
import com.example.mymall.interfaces.home.IHome;
import com.example.mymall.presenter.classif.ClassifTabPresenterlmp;
import com.example.mymall.ui.classification.bean.ClassifTabBean;
import com.example.mymall.ui.classification.fragment.ClassTabFragment;

import java.util.ArrayList;

import butterknife.BindView;
import q.rorbin.verticaltablayout.VerticalTabLayout;

//分类fragment_notifications
public class ClassificationFragment extends BaseFragment<IClassifTab.IClassifTabPersenter> implements IClassifTab.IClassifTabView {

    //垂直导航栏
    @BindView(R.id.classif_tab)
    VerticalTabLayout tab;
    //vp
    @BindView(R.id.classif_vp)
    ViewPager vp;

    @Override
    protected int getLayout() {
        return R.layout.fragment_notifications;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected IClassifTab.IClassifTabPersenter initPersenter() {
        return new ClassifTabPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getClassifTab();
    }


    //网络请求返回结果
    @Override
    public void getClassifTabReturn(ClassifTabBean bean) {
        initTab(bean);
    }

    private void initTab(ClassifTabBean bean) {
        //集合  存数据源
        ArrayList<Fragment> fragments = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();

        for (int i = 0; i < bean.getData().getCategoryList().size(); i++) {

            fragments.add(new ClassTabFragment(bean.getData().getCategoryList().get(i).getId()));
            titles.add(bean.getData().getCategoryList().get(i).getName());
        }

        //创建  s适配器
        VpAdapter vpAdapter = new VpAdapter(getChildFragmentManager(), fragments, titles);
        //绑定适配器
        vp.setAdapter(vpAdapter);
        //关联
        tab.setupWithViewPager(vp);

    }
}