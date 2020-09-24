package com.example.mymall.ui.classification.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymall.R;
import com.example.mymall.base.BaseFragment;
import com.example.mymall.interfaces.classif.IClassTabList;
import com.example.mymall.interfaces.classif.IClassifTab;
import com.example.mymall.presenter.classif.ClassTabListPresenterlmp;
import com.example.mymall.ui.classification.adapter.ClassifListAdapter;
import com.example.mymall.ui.classification.bean.ClassTabListBean;
import com.example.mymall.ui.classification.bean.ClassifTabBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.TVUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class ClassTabFragment extends BaseFragment<IClassTabList.IClassTabListPersenter> implements IClassTabList.IClassTabListView {

    //大图
    @BindView(R.id.classtab_list_iv)
    ImageView list_iv;
    //大图字
    @BindView(R.id.classtab_list_tv)
    TextView list_tv;
    //支取分类
    @BindView(R.id.classtab_list_front_name)
    TextView front_name;
    @BindView(R.id.classtab_list_rv)
    RecyclerView rv;


    private int id;
    private ArrayList<ClassTabListBean.DataBean.CurrentCategoryBean.SubCategoryListBean> list;
    private ClassifListAdapter classifListAdapter;

    public ClassTabFragment(int id) {
        this.id = id;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_class_tab;
    }

    @Override
    protected void initView() {
        //集合
        list = new ArrayList<>();
        //subCategoryList
        //创建适配器
        classifListAdapter = new ClassifListAdapter(getActivity(), list);
        //添加布局管理器
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        //绑定适配器
        rv.setAdapter(classifListAdapter);
    }

    @Override
    protected IClassTabList.IClassTabListPersenter initPersenter() {
        return new ClassTabListPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getClassTabList(id);
    }


    //网络请求返回数据
    @Override
    public void getClassTabListReturn(ClassTabListBean bean) {
        List<ClassTabListBean.DataBean.CurrentCategoryBean.SubCategoryListBean> subCategoryList = bean.getData().getCurrentCategory().getSubCategoryList();


        if (subCategoryList != null && subCategoryList.size() > 0) {
            GildeUtils.loadImg(getActivity(), bean.getData().getCurrentCategory().getBanner_url(), list_iv);
            TVUtils.setText(list_tv, bean.getData().getCurrentCategory().getFront_name());
            list.addAll(subCategoryList);
            //刷新适配器
            classifListAdapter.notifyDataSetChanged();
        }

    }


    /*private RecyclerView rv;
    private int id;

    public ClassTabFragment(int id) {
        this.id = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_class_tab, container, false);

        return initView(view);
    }

    private View initView(View view) {
        //找控件
        rv = (RecyclerView) view.findViewById(R.id.classtab_rv);

        return view;
    }*/
}