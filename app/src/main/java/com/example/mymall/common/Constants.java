package com.example.mymall.common;



import com.example.mymall.app.BaseApp;

import java.io.File;

public class Constants {

    //public static final String Base_Url = "http://cdwan.cn/api/";
    //https://cdplay.cn
    public static final String Base_Url = "https://cdplay.cn/api/";

    //网络缓存的地址
    public static final String PATH_DATA = BaseApp.app.getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/mall";
}
