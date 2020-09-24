package com.example.mymall.app;

import android.app.Application;
import android.content.Context;

import com.danikula.videocache.HttpProxyCacheServer;
import com.facebook.drawee.backends.pipeline.Fresco;

public class BaseApp extends Application {

    public static Context app;

    private HttpProxyCacheServer proxy;

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        app = this;
    }


    public static HttpProxyCacheServer getProxy(Context context){
        BaseApp myApp = (BaseApp) context.getApplicationContext();
        return myApp.proxy == null ? (myApp.proxy = myApp.newProxy()) : myApp.proxy;
    }

    private HttpProxyCacheServer newProxy(){
        return new HttpProxyCacheServer.Builder(this)
                .maxCacheSize(1024*1024*1024)
                .maxCacheFilesCount(30)
                .fileNameGenerator(new MyFileNameGenerator())
                .build();
    }



}
