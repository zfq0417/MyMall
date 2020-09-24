package com.example.mymall.ui.home.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.R;
import com.example.mymall.base.BaseFragment;
import com.example.mymall.interfaces.home.INewGood;
import com.example.mymall.presenter.home.NewGoodPresenterlmp;
import com.example.mymall.ui.home.adapter.NewGoodAdapter;
import com.example.mymall.ui.home.bean.NewListBean;

import java.util.List;

import butterknife.BindView;

public class NewListFragment extends BaseFragment<INewGood.INewGoodPersenter> implements INewGood.INewGoodView {

    @BindView(R.id.item_newlist_rv)
    RecyclerView rv;

    private final NewListBean bean;
    private final String order;
    private List<NewListBean.DataBeanX.GoodsListBean> list;
    private NewGoodAdapter newGoodAdapter;

    public NewListFragment(NewListBean bean, String order) {
        this.bean = bean;
        this.order = order;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_new_list;
    }

    @Override
    protected void initView() {
        list = bean.getData().getGoodsList();
        //创建 适配器
        newGoodAdapter = new NewGoodAdapter(getActivity(), list);

        //添加布局管理器
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        //绑定适配器
        rv.setAdapter(newGoodAdapter);
    }

    @Override
    protected INewGood.INewGoodPersenter initPersenter() {
        return new NewGoodPresenterlmp();
    }

    @Override
    protected void initData() {
        persenter.getNewGoodData(1, 1, 1000, order, "default", 0);
    }

     /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new_list, container, false);

        return initView(view);
    }*/


   /* private View initView(View view) {
        //找控件
        rv = (RecyclerView) view.findViewById(R.id.item_newlist_rv);

        initData();

        return view;
    }*/

    /*private void initData() {
        List<NewListBean.DataBeanX.GoodsListBean> goodsList = bean.getData().getGoodsList();
        //创建 适配器
        NewGoodAdapter newGoodAdapter = new NewGoodAdapter(getActivity(), goodsList);

        //添加布局管理器
        rv.setLayoutManager(new GridLayoutManager(getActivity(),2));

        //绑定适配器
        rv.setAdapter(newGoodAdapter);


    }*/


    @Override
    public void getNewGoodDataReturn(NewListBean bean) {
        if (bean != null) {
            list.addAll(bean.getData().getGoodsList());
            //刷新适配器
            newGoodAdapter.notifyDataSetChanged();
        }
    }
}