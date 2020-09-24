package com.example.mymall.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

//加载工具类
public class GildeUtils {


    //加载正常图片
    public static void loadImg(Context context,String url,ImageView img){
        if(!TextUtils.isEmpty(url) && img != null){
            Glide.with(context).load(url).into(img);
        }else{

        }
    }

    /**
     * 加载圆形图片
     * @param context
     * @param url
     * @param img
     */
    public static void loadRoundImg(Context context,String url, ImageView img){
        if(!TextUtils.isEmpty(url) && img != null){
            RequestOptions options = RequestOptions.bitmapTransform(new CircleTransform(context));
            Glide.with(context).load(url).apply(options).into(img);
        }else{

        }

    }

}
