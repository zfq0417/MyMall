package com.example.mymall.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.mymall.R;

public class CartCustView extends LinearLayout implements View.OnClickListener {

    private Context context;
    TextView txtSubtract;
    TextView txtValue;
    TextView txtAdd;

    private IClick cb;

    private int value = 1;
    private int min = 1;
    private int max = 9999;


    public CartCustView(Context context) {
        super(context);
        this.context = context;
    }

    public CartCustView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public CartCustView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    public CartCustView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context = context;
    }


    /*
     * 初始化界面
     * */
    public void initView() {
        txtSubtract = findViewById(R.id.cart_tv_subtract);
        txtValue = findViewById(R.id.cart_tv_value);
        txtAdd = findViewById(R.id.cart_tv_add);

        if (txtSubtract != null && txtValue != null && txtAdd != null) {
            txtSubtract.setOnClickListener(this);
            txtAdd.setOnClickListener(this);
        } else {
            Toast.makeText(context, "初始化调用错误", Toast.LENGTH_SHORT).show();
        }

    }

    public void initView(int min, int max) {
        this.min = min;
        this.max = max;
        initView();
    }

    /**
     * 设置值
     *
     * @param num
     */
    public void setValue(int num) {
        this.value = num;
        txtValue.setText(String.valueOf(this.value));
    }


    public interface IClick {
        void clickCB(int value);
    }

    public void setOnClickListener(IClick cb) {
        this.cb = cb;
    }

    //点击
    @Override
    public void onClick(View view) {

        //int value = Integer.parseInt(txtValue.getText().toString());

        //判断点击的是加号减号
        switch (view.getId()) {

            case R.id.cart_tv_add:   //加号
                value++;
                if (value > max) {
                    value = max;
                } else {
                    txtValue.setText(String.valueOf(value));
                    if (cb != null) {
                        cb.clickCB(value);
                    }
                }
                break;

            case R.id.cart_tv_subtract:    //减号
                value--;
                if (value < 1) {
                    value = 1;
                } else {
                    txtValue.setText(String.valueOf(value));

                    if (cb != null) {
                        cb.clickCB(value);
                    }
                }
                break;

        }

    }


}
