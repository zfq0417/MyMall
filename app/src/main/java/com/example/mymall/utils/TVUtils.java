package com.example.mymall.utils;

import android.text.TextUtils;
import android.widget.TextView;

//字符串工具类
public class TVUtils {

    //字符串  判断  不为空赋值
    public static void setText(TextView tv,String value){
        if(!TextUtils.isEmpty(value)){
            tv.setText(value);
        }
    }

    //int类型  赋值
    public static void setText(TextView tv,int value){
        tv.setText(String.valueOf(value));
    }

}
