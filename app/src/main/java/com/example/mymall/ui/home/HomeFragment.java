package com.example.mymall.ui.home;

import android.content.Intent;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.mymall.R;
import com.example.mymall.base.BaseFragment;
import com.example.mymall.interfaces.home.IHome;
import com.example.mymall.presenter.home.HomePresenterlmp;
import com.example.mymall.ui.home.actviity.BrandXqActivity;
import com.example.mymall.ui.home.actviity.GoodDetailActivity;
import com.example.mymall.ui.home.actviity.ManufacturerActivity;
import com.example.mymall.ui.home.actviity.NewListActivity;
import com.example.mymall.ui.home.actviity.TabActivity;
import com.example.mymall.ui.home.adapter.HomeListAdapter;
import com.example.mymall.ui.home.bean.HomeBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeFragment extends BaseFragment<IHome.IPersenter> implements IHome.IView {

    @BindView(R.id.home_rv)
    RecyclerView rv;
    private List<HomeBean.HomeListBean> list;
    private HomeListAdapter homeListAdapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }


    @Override
    protected void initView() {
        //创建集合   存放数据源
        list = new ArrayList<>();
        //创建适配器
        homeListAdapter = new HomeListAdapter(getActivity(), list);
        //创建  布局管理器
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);

        homeListAdapter.setSpanSizeLookup(new BaseQuickAdapter.SpanSizeLookup() {
            @Override
            public int getSpanSize(GridLayoutManager gridLayoutManager, int i) {
                int type = list.get(i).currentType;
                switch (type) {
                    case HomeBean.ITEM_TYPE_BANNER:   //轮播图
                    case HomeBean.ITEM_TYPE_TITLE:
                    case HomeBean.ITEM_TYPE_TITLETOP:
                    case HomeBean.ITEM_TYPE_HOT:      //人气推荐
                    case HomeBean.ITEM_TYPE_TOPIC:    //专题精
                    case HomeBean.ITEM_TYPE_TAB:
                        return 2;    //返回一列
                    case HomeBean.ITEM_TYPE_BRAND:   //品牌制造直供
                    case HomeBean.ITEM_TYPE_NEW:     //新品首发
                    case HomeBean.ITEM_TYPE_CATEGORY:   //居家.......
                        return 1;    //返回二列

                }
                return 0;
            }
        });

        //添加布局管理器
        rv.setLayoutManager(gridLayoutManager);
        //绑定适配器
        homeListAdapter.bindToRecyclerView(rv);

        //点击事件
        homeListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                int type = list.get(position).currentType;

                Intent intent = new Intent();
                switch (type) {
                    case HomeBean.ITEM_TYPE_BRAND:
                        HomeBean.DataBean.BrandListBean data2 = (HomeBean.DataBean.BrandListBean) list.get(position).data;
                        intent.putExtra("id", data2.getId());
                        intent.setClass(context, BrandXqActivity.class);
                        startActivity(intent);

                        break;
                    //跳转  人气推荐详情
                    case HomeBean.ITEM_TYPE_HOT:
                        HomeBean.DataBean.HotGoodsListBean data = (HomeBean.DataBean.HotGoodsListBean) list.get(position).data;
                        intent.putExtra("id", data.getId());
                        intent.setClass(context, GoodDetailActivity.class);
                        startActivityForResult(intent, 2000);
                        break;

                    //新品首发详情
                    case HomeBean.ITEM_TYPE_NEW:
                        HomeBean.DataBean.NewGoodsListBean newGoodsListBean = (HomeBean.DataBean.NewGoodsListBean) list.get(position).data;
                        intent.putExtra("id", newGoodsListBean.getId());
                        intent.setClass(getActivity(), GoodDetailActivity.class);
                        startActivity(intent);
                        break;
                    //居家.......
                    case HomeBean.ITEM_TYPE_CATEGORY:
                        HomeBean.DataBean.CategoryListBean.GoodsListBean data1 = (HomeBean.DataBean.CategoryListBean.GoodsListBean) list.get(position).data;

                        intent.putExtra("id", data1.getId());
                        intent.setClass(getActivity(), GoodDetailActivity.class);
                        startActivity(intent);

                        break;

                    //标题.......
                    case HomeBean.ITEM_TYPE_TAB:
                        intent.setClass(getActivity(), TabActivity.class);
                        startActivity(intent);
                        break;

                    //标题.......
                    case HomeBean.ITEM_TYPE_TITLE:
                        intent.setClass(getActivity(), NewListActivity.class);
                        startActivity(intent);
                        break;
                    case HomeBean.ITEM_TYPE_TITLETOP:
                        intent.setClass(getActivity(), ManufacturerActivity.class);
                        startActivity(intent);
                        break;
                }

            }
        });


    }

    @Override
    protected IHome.IPersenter initPersenter() {
        return new HomePresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getHomeData();
    }

    //请求返回的数据
    @Override
    public void getHomeDataReturn(List<HomeBean.HomeListBean> result) {

        if (result.size() > 0 && result != null) {
            list.addAll(result);
            homeListAdapter.notifyDataSetChanged();
        }


    }
}