package com.example.mymall.ui.home.actviity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.mymall.R;
import com.example.mymall.base.BaseActivity;
import com.example.mymall.interfaces.home.IDetail;
import com.example.mymall.presenter.home.details.GoodDetailsPresenterlmp;
import com.example.mymall.ui.home.adapter.CommentRvAdapter;
import com.example.mymall.ui.home.bean.AddCartInfoBean;
import com.example.mymall.ui.home.bean.GoodDetailBean;
import com.example.mymall.utils.GildeUtils;
import com.example.mymall.utils.SpUtils;
import com.example.mymall.utils.SystemUtils;
import com.example.mymall.view.CartCustView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

//详情页   人气推荐
public class GoodDetailActivity extends BaseActivity<IDetail.IDetailsPersenter> implements IDetail.IDetailsView, View.OnClickListener {
    @BindView(R.id.item_gooddetail_banner)
    Banner banner;
    //商品名字
    @BindView(R.id.item_gooddetail_tv_name)
    TextView name;
    //介绍
    @BindView(R.id.item_gooddetail_tv_goodsbrief)
    TextView goodsbrief;
    //价格
    @BindView(R.id.item_gooddetail_tv_retailprice)
    TextView retailprice;
    //评论数量
    @BindView(R.id.item_gooddetail_count)
    TextView count;
    //评论查看更多
    @BindView(R.id.item_gooddetail_rl)
    RelativeLayout rl;
    @BindView(R.id.item_gooddetail_count_ll)
    LinearLayout count_ll;
    //制造商
    @BindView(R.id.item_gooddetail_tv_product)
    TextView tv_product;
    //评论图片
    @BindView(R.id.item_gooddetail_comment_rv)
    RecyclerView comment_rv;
    //评论  时间
    @BindView(R.id.item_gooddetail_addtime)
    TextView addtime;
    //评论  内容
    @BindView(R.id.item_gooddetail_content)
    TextView commenr_content;
    @BindView(R.id.item_gooddetail_webview)
    WebView webView;
    //商品参数
    @BindView(R.id.item_gooddetail_parameter)
    LinearLayout parameter;
    //常见问题
    @BindView(R.id.item_gooddetail_questions)
    LinearLayout questions;
    //商品参数
    @BindView(R.id.item_gooddetail_parameter_ll)
    LinearLayout parameter_ll;


    @BindView(R.id.item_gooddetail_questions_ll)
    LinearLayout questions_ll;

    //
    @BindView(R.id.item_gooddetail_pop_good)
    RelativeLayout pop_good;
    //item_gooddetail_pop_good


    //收藏
    @BindView(R.id.item_gooddetail_bot_shoucang)
    RelativeLayout bot_shoucang;
    //购物车 页
    @BindView(R.id.item_gooddetail_bot_cart)
    TextView bot_cart;
    @BindView(R.id.img_cart)
    ImageView img_cart;

    //立即购买
    @BindView(R.id.item_gooddetail_bot_tv_buy)
    TextView tv_buy;
    //加入购物车
    @BindView(R.id.item_gooddetail_bot_tv_che)
    TextView tv_che;

    //单钱商品信息
    private GoodDetailBean goodDetailBean;

    //当前商品数量  默认值为1
    private int currentNum = 1;


    private String html = "<html>\n" +
            "            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\n" +
            "            <head>\n" +
            "                <style>\n" +
            "                    p{\n" +
            "                        margin:0px;\n" +
            "                    }\n" +
            "                    img{\n" +
            "                        width:100%;\n" +
            "                        height:auto;\n" +
            "                    }\n" +
            "                </style>\n" +
            "            </head>\n" +
            "            <body>\n" +
            "                $\n" +
            "            </body>\n" +
            "        </html>";

    private PopupWindow mPopWindow;

    @BindView(R.id.item_gooddetail_bottom)
    LinearLayout linearLayoutbottom;

    @Override
    protected int getLayout() {
        return R.layout.activity_good_detail;
    }

    @Override
    protected void initView() {
        pop_good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showpopWindow();
            }
        });

        //加入购物车  监听
        tv_che.setOnClickListener(this);

        //购物车  页
        img_cart.setOnClickListener(this);

    }

    @Override
    protected IDetail.IDetailsPersenter initPersenter() {
        return new GoodDetailsPresenterlmp();
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        persenter.getDetails(id);
    }


    //网络返回数据
    @Override
    public void getDetailsataReturn(GoodDetailBean bean) {
        //刷新轮播图数据
        List<GoodDetailBean.DataBeanX.GalleryBean> gallery = bean.getData().getGallery();
        if (gallery != null && gallery.size() > 0) {
            updateBanner(gallery);
        }

        //刷新info数据
        GoodDetailBean.DataBeanX.InfoBean info = bean.getData().getInfo();
        GoodDetailBean.DataBeanX.BrandBean brand = bean.getData().getBrand();
        updateInfo(info, bean.getData().getBrand());


        //刷新评论
        if (bean.getData().getComment().getCount() > 0) {
            count_ll.setVisibility(View.VISIBLE);
            updateCommentary(bean);
        } else {
            count_ll.setVisibility(View.GONE);
        }


        updateDetailInfo(bean.getData().getInfo());

        //刷新商品参数
        updateParameter(bean.getData().getAttribute());

        //刷新常见问题
        updateQuestions(bean.getData().getIssue());


    }

    //网络返回数据   添加到购物车
    @Override
    public void addCartReturn(AddCartInfoBean bean) {

    }


    //刷新常见问题
    private void updateQuestions(List<GoodDetailBean.DataBeanX.IssueBean> issue) {
        //questions_ll

        if (issue != null && issue.size() > 0) {
            questions_ll.setVisibility(View.VISIBLE);
            questions.removeAllViews();

            for (GoodDetailBean.DataBeanX.IssueBean item : issue) {
                //创建布局
                View view = LayoutInflater.from(this).inflate(R.layout.deatil_layout_questions, null);
                TextView name = (TextView) view.findViewById(R.id.gooddetail_questions_name);
                TextView subtitle = (TextView) view.findViewById(R.id.gooddetail_questions_subtitle);

                //question  answer
                name.setText(item.getQuestion());
                subtitle.setText(item.getAnswer());
                questions.addView(view);
            }
        } else {
            questions_ll.setVisibility(View.GONE);
        }

    }

    //刷新商品参数
    private void updateParameter(List<GoodDetailBean.DataBeanX.AttributeBean> attribute) {

        if (attribute.size() > 0 && attribute != null) {
            parameter_ll.setVisibility(View.VISIBLE);

            parameter.removeAllViews(); //清空
            for (GoodDetailBean.DataBeanX.AttributeBean item : attribute) {
                View view = LayoutInflater.from(this).inflate(R.layout.deatil_layout_parameter, null);
                TextView name = view.findViewById(R.id.gooddetail_parameter_feet);
                TextView values = view.findViewById(R.id.gooddetail_parameter_value);
                name.setText(item.getName());
                values.setText(item.getValue());
                parameter.addView(view);
            }

        } else {
            parameter_ll.setVisibility(View.GONE);
        }

    }

    //刷新评论
    private void updateCommentary(GoodDetailBean bean) {
        //给评论赋值
        goodDetailBean = bean;
        int countb = bean.getData().getComment().getCount();
        GoodDetailBean.DataBeanX.CommentBean.DataBean data = bean.getData().getComment().getData();
        List<GoodDetailBean.DataBeanX.CommentBean.DataBean.PicListBean> pic_list = bean.getData().getComment().getData().getPic_list();

        count.setText("评价(" + countb + ")");

        //时间  内容
        addtime.setText(data.getAdd_time());
        commenr_content.setText(data.getContent());

        //创建适配器
        CommentRvAdapter commentRvAdapter = new CommentRvAdapter(this, pic_list);
        //创建 布局管理器
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        //添加布局管理
        comment_rv.setLayoutManager(gridLayoutManager);
        //绑定适配器
        comment_rv.setAdapter(commentRvAdapter);


    }


    //刷新轮播图数据
    private void updateBanner(List<GoodDetailBean.DataBeanX.GalleryBean> gallery) {


        if (banner.getTag() == null || (int) banner.getTag() == 0) {
            ArrayList<String> images = new ArrayList<>();
            for (int i = 0; i < gallery.size(); i++) {
                images.add(gallery.get(i).getImg_url());
            }

            banner.setImages(images)
                    .setImageLoader(new ImageLoader() {
                        @Override
                        public void displayImage(Context context, Object path, ImageView imageView) {
                            Glide.with(context).load(path).into(imageView);
                        }
                    })
                    .start();
        }


    }

    //刷新info数据   +  制造商  product
    private void updateInfo(GoodDetailBean.DataBeanX.InfoBean info, GoodDetailBean.DataBeanX.BrandBean brand) {
        name.setText(info.getName());
        goodsbrief.setText(info.getGoods_brief());
        retailprice.setText("￥" + info.getRetail_price());

        //制造商
        if (brand.getName() != null) {
            tv_product.setVisibility(View.VISIBLE);
            tv_product.setText(brand.getName());
        } else {
            tv_product.setVisibility(View.GONE);
        }

    }

    //webView
    private void updateDetailInfo(GoodDetailBean.DataBeanX.InfoBean infoBean) {
        if (!TextUtils.isEmpty(infoBean.getGoods_desc())) {
            String h5 = infoBean.getGoods_desc();
            html = html.replace("$", h5);
            webView.loadData(html, "text/html", "utf-8");
        }
    }


    public void showpopWindow() {
        if (mPopWindow != null && mPopWindow.isShowing()) {

        } else {
            View contentView = LayoutInflater.from(this).inflate(R.layout.layout_popwindow, null);
            int height = SystemUtils.dp2px(this, 200);
            mPopWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT, height);

            //点击范围外关闭  PopWindow
            mPopWindow.setFocusable(false);
            mPopWindow.setOutsideTouchable(false);

            mPopWindow.setContentView(contentView);

            /*//全屏阴影
            setBackGroundAlpha(0.5f);
            //把亮度调回正常
            mPopWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public void onDismiss() {
                    setBackGroundAlpha(1f);
                }
            });*/


            //获取自身的长宽高
            contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);

            CartCustView cartCustomView = contentView.findViewById(R.id.layout_cartwindow);

            //叉
            TextView txtClose = contentView.findViewById(R.id.tv_close);
            //叉点击退出
            txtClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mPopWindow.dismiss();
                    mPopWindow = null;
                }
            });


            int[] pt = new int[2];

            //获取到的屏幕宽高(除开了当前组件的宽高）
            linearLayoutbottom.getLocationInWindow(pt);
            // Display display = getWindowManager().getDefaultDisplay();
            // int activityheight = display.getHeight();
            mPopWindow.showAtLocation(linearLayoutbottom, Gravity.NO_GRAVITY, 0, pt[1] - height);


            cartCustomView.initView();

            //点击
            cartCustomView.setOnClickListener(new CartCustView.IClick() {
                @Override
                public void clickCB(int value) {
                    currentNum = value;
                }
            });
        }
    }


    private void setBackGroundAlpha(float v) {
        Window win = getWindow();
        WindowManager.LayoutParams lp = win.getAttributes();
        lp.alpha = v;
        win.setAttributes(lp);
    }

    //点击
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.item_gooddetail_bot_shoucang:  //收藏
                break;
            case R.id.item_gooddetail_bot_tv_che:   //加入购物车
                addCart();    //
                break;
            case R.id.img_cart:    //购物车页
                setResult(1000);
                finish();
                break;
        }
    }

    //加入购物车
    private void addCart() {
        String token = SpUtils.getInstance().getString("token");

        if (!TextUtils.isEmpty(token)) {
            //判断当前的弹窗是否打开
            if ((mPopWindow != null && mPopWindow.isShowing())) {    //打开
                //添加到购物车操作
                if (goodDetailBean != null && goodDetailBean.getData().getProductList().size() > 0) {

                    int goodsId = goodDetailBean.getData().getProductList().get(0).getGoods_id();
                    int productId = goodDetailBean.getData().getProductList().get(0).getId();

                    persenter.addCart(goodsId, currentNum, productId);

                    //关闭 PopWindow
                    mPopWindow.dismiss();
                    mPopWindow = null;


                    Toast.makeText(this, "啧啧啧", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "没有产品数据", Toast.LENGTH_SHORT).show();
                }

            } else {   //未打开  去打开
                showpopWindow();
            }

        } else {
            Toast.makeText(this, "未登录,请先登录", Toast.LENGTH_SHORT).show();
            //Intent跳转到登录
        }

    }


}