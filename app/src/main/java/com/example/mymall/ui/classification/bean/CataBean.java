package com.example.mymall.ui.classification.bean;

import java.util.List;

public class CataBean {

    /**
     * errno : 0
     * errmsg :
     * data : {"categoryList":[{"id":1005000,"name":"居家","keywords":"","front_desc":"回家，放松身心","parent_id":0,"sort_order":2,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/92357337378cce650797444bc107b0f7.jpg","icon_url":"http://yanxuan.nosdn.127.net/a45c2c262a476fea0b9fc684fed91ef5.png","img_url":"//nos.netease.com/yanxuan/f0d0e1a542e2095861b42bf789d948ce.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/e8bf0cf08cf7eda21606ab191762e35c.png","level":"L1","type":0,"front_name":"回家，放松身心","subCategoryList":[{"id":1008002,"name":"布艺软装","keywords":"","front_desc":"换个软装，换个家","parent_id":1005000,"sort_order":6,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png","level":"L2","type":0,"front_name":"各种风格软装装点你的家"},{"id":1008008,"name":"被枕","keywords":"","front_desc":"选用优质材料，确保好芯","parent_id":1005000,"sort_order":2,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/927bc33f7ae2895dd6c11cf91f5e3228.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/b43ef7cececebe6292d2f7f590522e05.png","level":"L2","type":0,"front_name":"守护你的睡眠时光"},{"id":1008009,"name":"床品件套","keywords":"","front_desc":"严格用料，亲肤舒适","parent_id":1005000,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/243e5bf327a87217ad1f54592f0176ec.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/81f671bd36bce05d5f57827e5c88dd1b.png","level":"L2","type":0,"front_name":"MUJI等品牌制造商出品"},{"id":1008016,"name":"灯具","keywords":"","front_desc":"极简主义，贴近生活的设计","parent_id":1005000,"sort_order":8,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/c48e0d9dcfac01499a437774a915842b.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/f702dc399d14d4e1509d5ed6e57acd19.png","level":"L2","type":0,"front_name":"一盏灯，温暖一个家"},{"id":1010003,"name":"地垫","keywords":"","front_desc":"手工编织，时尚环保","parent_id":1005000,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/83d4c87f28c993af1aa8d3e4d30a2fa2.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/1611ef6458e244d1909218becfe87c4d.png","level":"L2","type":0,"front_name":"家里的第\u201c五\u201d面墙"},{"id":1011003,"name":"床垫","keywords":"","front_desc":"助你拥有舒眠好梦","parent_id":1005000,"sort_order":3,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/316afeb3948b295dfe073e4c51f77a42.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d6e0e84961032fc70fd52a8d4d0fb514.png","level":"L2","type":0,"front_name":"承托你的好时光"},{"id":1011004,"name":"家饰","keywords":"","front_desc":"点缀美好生活，品质在于细节","parent_id":1005000,"sort_order":9,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ab0df9445d985bf6719ac415313a8e88.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/79275db76b5865e6167b0fbd141f2d7e.png","level":"L2","type":0,"front_name":"装饰你的家"},{"id":1015000,"name":"家具","keywords":"","front_desc":"一级原木，严苛工艺","parent_id":1005000,"sort_order":7,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/4f00675caefd0d4177892ad18bfc2df6.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d5d41841136182bf49c1f99f5c452dd6.png","level":"L2","type":0,"front_name":"大师级工艺"},{"id":1017000,"name":"宠物","keywords":"","front_desc":"出口品质，严选贴合萌宠生活习惯用品。","parent_id":1005000,"sort_order":10,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/a0352c57c60ce4f68370ecdab6a30857.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/dae4d6e89ab8a0cd3e8da026e4660137.png","level":"L2","type":0,"front_name":"抑菌除味，打造宠物舒适空间"},{"id":1036000,"name":"夏凉","keywords":"","front_desc":"夏凉床品，舒适一夏","parent_id":1005000,"sort_order":1,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/13ff4decdf38fe1a5bde34f0e0cc635a.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/bd17c985bacb9b9ab1ab6e9d66ee343c.png","level":"L2","type":0,"front_name":"夏凉床品，舒适一夏"}]},{"id":1005001,"name":"餐厨","keywords":"","front_desc":"厨房","parent_id":0,"sort_order":3,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/f4ff8b3d5b0767d4e578575c1fd6b921.jpg","icon_url":"http://yanxuan.nosdn.127.net/ad8b00d084cb7d0958998edb5fee9c0a.png","img_url":"//nos.netease.com/yanxuan/88855173a0cfcfd889ee6394a3259c4f.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/3708dbcb35ad5abf9e001500f73db615.png","level":"L1","type":0,"front_name":"爱，囿于厨房"},{"id":1005002,"name":"饮食","keywords":"","front_desc":"好吃，高颜值美食","parent_id":0,"sort_order":9,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/dd6cc8a7e996936768db5634f12447ed.jpg","icon_url":"http://yanxuan.nosdn.127.net/c9280327a3fd2374c000f6bf52dff6eb.png","img_url":"//nos.netease.com/yanxuan/9a29ef4f41c305a12e1459f12abd290f.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/fb670ff3511182833e5b035275e4ac09.png","level":"L1","type":0,"front_name":"好吃，高颜值美食"},{"id":1008000,"name":"配件","keywords":"","front_desc":"配角，亦是主角","parent_id":0,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/cad5aba2bc52d3b8adfd0232c9814de2.jpg","icon_url":"http://yanxuan.nosdn.127.net/11abb11c4cfdee59abfb6d16caca4c6a.png","img_url":"//nos.netease.com/yanxuan/935f1ab7dcfeb4bbd4a5da9935161aaf.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/02f9a44d05c05c0dd439a5eb674570a2.png","level":"L1","type":0,"front_name":"配角，亦是主角"},{"id":1010000,"name":"服装","keywords":"","front_desc":"贴身的，要亲肤","parent_id":0,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/003e1d1289f4f290506ac2aedbd09d35.jpg","icon_url":"http://yanxuan.nosdn.127.net/28a685c96f91584e7e4876f1397767db.png","img_url":"//nos.netease.com/yanxuan/135113d6a43536b717063413fa24d69a.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/622c8d79292154017b0cbda97588a0d7.png","level":"L1","type":0,"front_name":"贴身的，要亲肤"},{"id":1011000,"name":"婴童","keywords":"","front_desc":"爱，从心开始","parent_id":0,"sort_order":7,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/7dc78383e44df530f543659a977740de.jpg","icon_url":"http://yanxuan.nosdn.127.net/1ba9967b8de1ac50fad21774a4494f5d.png","img_url":"//nos.netease.com/yanxuan/8ab3c73fe90951a942e8b06d848f8743.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/9cc0b3e0d5a4f4a22134c170f10b70f2.png","level":"L1","type":0,"front_name":"爱，从心开始"},{"id":1012000,"name":"杂货","keywords":"","front_desc":"解忧，每个烦恼","parent_id":0,"sort_order":8,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/d233a1a9060a22e8eb0e2b326252eece.jpg","icon_url":"http://yanxuan.nosdn.127.net/c2a3d6349e72c35931fe3b5bcd0966be.png","img_url":"//nos.netease.com/yanxuan/a0c91ae573079830743dec6ee08f5841.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/547853361d29a37282f377b9a755dd37.png","level":"L1","type":0,"front_name":"解忧，每个烦恼"},{"id":1013001,"name":"洗护","keywords":"","front_desc":"亲肤之物，严选天然","parent_id":0,"sort_order":6,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ef8c49f8c92d1f86eb76dec0b5bc7cef.jpg","icon_url":"http://yanxuan.nosdn.127.net/9fe068776b6b1fca13053d68e9c0a83f.png","img_url":"//nos.netease.com/yanxuan/14bb4a29498a0f93a1ea001f26fea1dd.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/1526ab0f5982722adbc8726f9f2a338c.png","level":"L1","type":0,"front_name":"亲肤之物，严选天然"},{"id":1019000,"name":"志趣","keywords":"","front_desc":"爱好，点缀生活","parent_id":0,"sort_order":10,"show_index":9,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/99107fbd76eb66cd537213e478189ae1.png","icon_url":"http://yanxuan.nosdn.127.net/7093cfecb9dde1dd3eaf459623df4071.png","img_url":"//nos.netease.com/yanxuan/72de912b6350b33ecf88a27498840e62.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/1706e24a5e605870ba3b37ff5f49aa18.png","level":"L1","type":0,"front_name":"周边精品，共享热爱"}],"currentCategory":{"id":1005000,"name":"居家","keywords":"","front_desc":"回家，放松身心","parent_id":0,"sort_order":2,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/92357337378cce650797444bc107b0f7.jpg","icon_url":"http://yanxuan.nosdn.127.net/a45c2c262a476fea0b9fc684fed91ef5.png","img_url":"//nos.netease.com/yanxuan/f0d0e1a542e2095861b42bf789d948ce.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/e8bf0cf08cf7eda21606ab191762e35c.png","level":"L1","type":0,"front_name":"回家，放松身心","subCategoryList":[{"id":1008002,"name":"布艺软装","keywords":"","front_desc":"换个软装，换个家","parent_id":1005000,"sort_order":6,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png","level":"L2","type":0,"front_name":"各种风格软装装点你的家"},{"id":1008008,"name":"被枕","keywords":"","front_desc":"选用优质材料，确保好芯","parent_id":1005000,"sort_order":2,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/927bc33f7ae2895dd6c11cf91f5e3228.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/b43ef7cececebe6292d2f7f590522e05.png","level":"L2","type":0,"front_name":"守护你的睡眠时光"},{"id":1008009,"name":"床品件套","keywords":"","front_desc":"严格用料，亲肤舒适","parent_id":1005000,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/243e5bf327a87217ad1f54592f0176ec.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/81f671bd36bce05d5f57827e5c88dd1b.png","level":"L2","type":0,"front_name":"MUJI等品牌制造商出品"},{"id":1008016,"name":"灯具","keywords":"","front_desc":"极简主义，贴近生活的设计","parent_id":1005000,"sort_order":8,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/c48e0d9dcfac01499a437774a915842b.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/f702dc399d14d4e1509d5ed6e57acd19.png","level":"L2","type":0,"front_name":"一盏灯，温暖一个家"},{"id":1010003,"name":"地垫","keywords":"","front_desc":"手工编织，时尚环保","parent_id":1005000,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/83d4c87f28c993af1aa8d3e4d30a2fa2.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/1611ef6458e244d1909218becfe87c4d.png","level":"L2","type":0,"front_name":"家里的第\u201c五\u201d面墙"},{"id":1011003,"name":"床垫","keywords":"","front_desc":"助你拥有舒眠好梦","parent_id":1005000,"sort_order":3,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/316afeb3948b295dfe073e4c51f77a42.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d6e0e84961032fc70fd52a8d4d0fb514.png","level":"L2","type":0,"front_name":"承托你的好时光"},{"id":1011004,"name":"家饰","keywords":"","front_desc":"点缀美好生活，品质在于细节","parent_id":1005000,"sort_order":9,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ab0df9445d985bf6719ac415313a8e88.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/79275db76b5865e6167b0fbd141f2d7e.png","level":"L2","type":0,"front_name":"装饰你的家"},{"id":1015000,"name":"家具","keywords":"","front_desc":"一级原木，严苛工艺","parent_id":1005000,"sort_order":7,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/4f00675caefd0d4177892ad18bfc2df6.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d5d41841136182bf49c1f99f5c452dd6.png","level":"L2","type":0,"front_name":"大师级工艺"},{"id":1017000,"name":"宠物","keywords":"","front_desc":"出口品质，严选贴合萌宠生活习惯用品。","parent_id":1005000,"sort_order":10,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/a0352c57c60ce4f68370ecdab6a30857.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/dae4d6e89ab8a0cd3e8da026e4660137.png","level":"L2","type":0,"front_name":"抑菌除味，打造宠物舒适空间"},{"id":1036000,"name":"夏凉","keywords":"","front_desc":"夏凉床品，舒适一夏","parent_id":1005000,"sort_order":1,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/13ff4decdf38fe1a5bde34f0e0cc635a.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/bd17c985bacb9b9ab1ab6e9d66ee343c.png","level":"L2","type":0,"front_name":"夏凉床品，舒适一夏"}]}}
     */

    private int errno;
    private String errmsg;
    private DataBean data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * categoryList : [{"id":1005000,"name":"居家","keywords":"","front_desc":"回家，放松身心","parent_id":0,"sort_order":2,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/92357337378cce650797444bc107b0f7.jpg","icon_url":"http://yanxuan.nosdn.127.net/a45c2c262a476fea0b9fc684fed91ef5.png","img_url":"//nos.netease.com/yanxuan/f0d0e1a542e2095861b42bf789d948ce.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/e8bf0cf08cf7eda21606ab191762e35c.png","level":"L1","type":0,"front_name":"回家，放松身心","subCategoryList":[{"id":1008002,"name":"布艺软装","keywords":"","front_desc":"换个软装，换个家","parent_id":1005000,"sort_order":6,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png","level":"L2","type":0,"front_name":"各种风格软装装点你的家"},{"id":1008008,"name":"被枕","keywords":"","front_desc":"选用优质材料，确保好芯","parent_id":1005000,"sort_order":2,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/927bc33f7ae2895dd6c11cf91f5e3228.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/b43ef7cececebe6292d2f7f590522e05.png","level":"L2","type":0,"front_name":"守护你的睡眠时光"},{"id":1008009,"name":"床品件套","keywords":"","front_desc":"严格用料，亲肤舒适","parent_id":1005000,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/243e5bf327a87217ad1f54592f0176ec.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/81f671bd36bce05d5f57827e5c88dd1b.png","level":"L2","type":0,"front_name":"MUJI等品牌制造商出品"},{"id":1008016,"name":"灯具","keywords":"","front_desc":"极简主义，贴近生活的设计","parent_id":1005000,"sort_order":8,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/c48e0d9dcfac01499a437774a915842b.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/f702dc399d14d4e1509d5ed6e57acd19.png","level":"L2","type":0,"front_name":"一盏灯，温暖一个家"},{"id":1010003,"name":"地垫","keywords":"","front_desc":"手工编织，时尚环保","parent_id":1005000,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/83d4c87f28c993af1aa8d3e4d30a2fa2.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/1611ef6458e244d1909218becfe87c4d.png","level":"L2","type":0,"front_name":"家里的第\u201c五\u201d面墙"},{"id":1011003,"name":"床垫","keywords":"","front_desc":"助你拥有舒眠好梦","parent_id":1005000,"sort_order":3,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/316afeb3948b295dfe073e4c51f77a42.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d6e0e84961032fc70fd52a8d4d0fb514.png","level":"L2","type":0,"front_name":"承托你的好时光"},{"id":1011004,"name":"家饰","keywords":"","front_desc":"点缀美好生活，品质在于细节","parent_id":1005000,"sort_order":9,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ab0df9445d985bf6719ac415313a8e88.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/79275db76b5865e6167b0fbd141f2d7e.png","level":"L2","type":0,"front_name":"装饰你的家"},{"id":1015000,"name":"家具","keywords":"","front_desc":"一级原木，严苛工艺","parent_id":1005000,"sort_order":7,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/4f00675caefd0d4177892ad18bfc2df6.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d5d41841136182bf49c1f99f5c452dd6.png","level":"L2","type":0,"front_name":"大师级工艺"},{"id":1017000,"name":"宠物","keywords":"","front_desc":"出口品质，严选贴合萌宠生活习惯用品。","parent_id":1005000,"sort_order":10,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/a0352c57c60ce4f68370ecdab6a30857.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/dae4d6e89ab8a0cd3e8da026e4660137.png","level":"L2","type":0,"front_name":"抑菌除味，打造宠物舒适空间"},{"id":1036000,"name":"夏凉","keywords":"","front_desc":"夏凉床品，舒适一夏","parent_id":1005000,"sort_order":1,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/13ff4decdf38fe1a5bde34f0e0cc635a.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/bd17c985bacb9b9ab1ab6e9d66ee343c.png","level":"L2","type":0,"front_name":"夏凉床品，舒适一夏"}]},{"id":1005001,"name":"餐厨","keywords":"","front_desc":"厨房","parent_id":0,"sort_order":3,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/f4ff8b3d5b0767d4e578575c1fd6b921.jpg","icon_url":"http://yanxuan.nosdn.127.net/ad8b00d084cb7d0958998edb5fee9c0a.png","img_url":"//nos.netease.com/yanxuan/88855173a0cfcfd889ee6394a3259c4f.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/3708dbcb35ad5abf9e001500f73db615.png","level":"L1","type":0,"front_name":"爱，囿于厨房"},{"id":1005002,"name":"饮食","keywords":"","front_desc":"好吃，高颜值美食","parent_id":0,"sort_order":9,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/dd6cc8a7e996936768db5634f12447ed.jpg","icon_url":"http://yanxuan.nosdn.127.net/c9280327a3fd2374c000f6bf52dff6eb.png","img_url":"//nos.netease.com/yanxuan/9a29ef4f41c305a12e1459f12abd290f.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/fb670ff3511182833e5b035275e4ac09.png","level":"L1","type":0,"front_name":"好吃，高颜值美食"},{"id":1008000,"name":"配件","keywords":"","front_desc":"配角，亦是主角","parent_id":0,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/cad5aba2bc52d3b8adfd0232c9814de2.jpg","icon_url":"http://yanxuan.nosdn.127.net/11abb11c4cfdee59abfb6d16caca4c6a.png","img_url":"//nos.netease.com/yanxuan/935f1ab7dcfeb4bbd4a5da9935161aaf.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/02f9a44d05c05c0dd439a5eb674570a2.png","level":"L1","type":0,"front_name":"配角，亦是主角"},{"id":1010000,"name":"服装","keywords":"","front_desc":"贴身的，要亲肤","parent_id":0,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/003e1d1289f4f290506ac2aedbd09d35.jpg","icon_url":"http://yanxuan.nosdn.127.net/28a685c96f91584e7e4876f1397767db.png","img_url":"//nos.netease.com/yanxuan/135113d6a43536b717063413fa24d69a.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/622c8d79292154017b0cbda97588a0d7.png","level":"L1","type":0,"front_name":"贴身的，要亲肤"},{"id":1011000,"name":"婴童","keywords":"","front_desc":"爱，从心开始","parent_id":0,"sort_order":7,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/7dc78383e44df530f543659a977740de.jpg","icon_url":"http://yanxuan.nosdn.127.net/1ba9967b8de1ac50fad21774a4494f5d.png","img_url":"//nos.netease.com/yanxuan/8ab3c73fe90951a942e8b06d848f8743.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/9cc0b3e0d5a4f4a22134c170f10b70f2.png","level":"L1","type":0,"front_name":"爱，从心开始"},{"id":1012000,"name":"杂货","keywords":"","front_desc":"解忧，每个烦恼","parent_id":0,"sort_order":8,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/d233a1a9060a22e8eb0e2b326252eece.jpg","icon_url":"http://yanxuan.nosdn.127.net/c2a3d6349e72c35931fe3b5bcd0966be.png","img_url":"//nos.netease.com/yanxuan/a0c91ae573079830743dec6ee08f5841.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/547853361d29a37282f377b9a755dd37.png","level":"L1","type":0,"front_name":"解忧，每个烦恼"},{"id":1013001,"name":"洗护","keywords":"","front_desc":"亲肤之物，严选天然","parent_id":0,"sort_order":6,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ef8c49f8c92d1f86eb76dec0b5bc7cef.jpg","icon_url":"http://yanxuan.nosdn.127.net/9fe068776b6b1fca13053d68e9c0a83f.png","img_url":"//nos.netease.com/yanxuan/14bb4a29498a0f93a1ea001f26fea1dd.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/1526ab0f5982722adbc8726f9f2a338c.png","level":"L1","type":0,"front_name":"亲肤之物，严选天然"},{"id":1019000,"name":"志趣","keywords":"","front_desc":"爱好，点缀生活","parent_id":0,"sort_order":10,"show_index":9,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/99107fbd76eb66cd537213e478189ae1.png","icon_url":"http://yanxuan.nosdn.127.net/7093cfecb9dde1dd3eaf459623df4071.png","img_url":"//nos.netease.com/yanxuan/72de912b6350b33ecf88a27498840e62.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/1706e24a5e605870ba3b37ff5f49aa18.png","level":"L1","type":0,"front_name":"周边精品，共享热爱"}]
         * currentCategory : {"id":1005000,"name":"居家","keywords":"","front_desc":"回家，放松身心","parent_id":0,"sort_order":2,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/92357337378cce650797444bc107b0f7.jpg","icon_url":"http://yanxuan.nosdn.127.net/a45c2c262a476fea0b9fc684fed91ef5.png","img_url":"//nos.netease.com/yanxuan/f0d0e1a542e2095861b42bf789d948ce.jpg","wap_banner_url":"http://yanxuan.nosdn.127.net/e8bf0cf08cf7eda21606ab191762e35c.png","level":"L1","type":0,"front_name":"回家，放松身心","subCategoryList":[{"id":1008002,"name":"布艺软装","keywords":"","front_desc":"换个软装，换个家","parent_id":1005000,"sort_order":6,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png","level":"L2","type":0,"front_name":"各种风格软装装点你的家"},{"id":1008008,"name":"被枕","keywords":"","front_desc":"选用优质材料，确保好芯","parent_id":1005000,"sort_order":2,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/927bc33f7ae2895dd6c11cf91f5e3228.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/b43ef7cececebe6292d2f7f590522e05.png","level":"L2","type":0,"front_name":"守护你的睡眠时光"},{"id":1008009,"name":"床品件套","keywords":"","front_desc":"严格用料，亲肤舒适","parent_id":1005000,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/243e5bf327a87217ad1f54592f0176ec.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/81f671bd36bce05d5f57827e5c88dd1b.png","level":"L2","type":0,"front_name":"MUJI等品牌制造商出品"},{"id":1008016,"name":"灯具","keywords":"","front_desc":"极简主义，贴近生活的设计","parent_id":1005000,"sort_order":8,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/c48e0d9dcfac01499a437774a915842b.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/f702dc399d14d4e1509d5ed6e57acd19.png","level":"L2","type":0,"front_name":"一盏灯，温暖一个家"},{"id":1010003,"name":"地垫","keywords":"","front_desc":"手工编织，时尚环保","parent_id":1005000,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/83d4c87f28c993af1aa8d3e4d30a2fa2.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/1611ef6458e244d1909218becfe87c4d.png","level":"L2","type":0,"front_name":"家里的第\u201c五\u201d面墙"},{"id":1011003,"name":"床垫","keywords":"","front_desc":"助你拥有舒眠好梦","parent_id":1005000,"sort_order":3,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/316afeb3948b295dfe073e4c51f77a42.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d6e0e84961032fc70fd52a8d4d0fb514.png","level":"L2","type":0,"front_name":"承托你的好时光"},{"id":1011004,"name":"家饰","keywords":"","front_desc":"点缀美好生活，品质在于细节","parent_id":1005000,"sort_order":9,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ab0df9445d985bf6719ac415313a8e88.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/79275db76b5865e6167b0fbd141f2d7e.png","level":"L2","type":0,"front_name":"装饰你的家"},{"id":1015000,"name":"家具","keywords":"","front_desc":"一级原木，严苛工艺","parent_id":1005000,"sort_order":7,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/4f00675caefd0d4177892ad18bfc2df6.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d5d41841136182bf49c1f99f5c452dd6.png","level":"L2","type":0,"front_name":"大师级工艺"},{"id":1017000,"name":"宠物","keywords":"","front_desc":"出口品质，严选贴合萌宠生活习惯用品。","parent_id":1005000,"sort_order":10,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/a0352c57c60ce4f68370ecdab6a30857.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/dae4d6e89ab8a0cd3e8da026e4660137.png","level":"L2","type":0,"front_name":"抑菌除味，打造宠物舒适空间"},{"id":1036000,"name":"夏凉","keywords":"","front_desc":"夏凉床品，舒适一夏","parent_id":1005000,"sort_order":1,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/13ff4decdf38fe1a5bde34f0e0cc635a.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/bd17c985bacb9b9ab1ab6e9d66ee343c.png","level":"L2","type":0,"front_name":"夏凉床品，舒适一夏"}]}
         */

        private CurrentCategoryBean currentCategory;
        private List<CategoryListBean> categoryList;

        public CurrentCategoryBean getCurrentCategory() {
            return currentCategory;
        }

        public void setCurrentCategory(CurrentCategoryBean currentCategory) {
            this.currentCategory = currentCategory;
        }

        public List<CategoryListBean> getCategoryList() {
            return categoryList;
        }

        public void setCategoryList(List<CategoryListBean> categoryList) {
            this.categoryList = categoryList;
        }

        public static class CurrentCategoryBean {
            /**
             * id : 1005000
             * name : 居家
             * keywords :
             * front_desc : 回家，放松身心
             * parent_id : 0
             * sort_order : 2
             * show_index : 1
             * is_show : 1
             * banner_url : http://yanxuan.nosdn.127.net/92357337378cce650797444bc107b0f7.jpg
             * icon_url : http://yanxuan.nosdn.127.net/a45c2c262a476fea0b9fc684fed91ef5.png
             * img_url : //nos.netease.com/yanxuan/f0d0e1a542e2095861b42bf789d948ce.jpg
             * wap_banner_url : http://yanxuan.nosdn.127.net/e8bf0cf08cf7eda21606ab191762e35c.png
             * level : L1
             * type : 0
             * front_name : 回家，放松身心
             * subCategoryList : [{"id":1008002,"name":"布艺软装","keywords":"","front_desc":"换个软装，换个家","parent_id":1005000,"sort_order":6,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png","level":"L2","type":0,"front_name":"各种风格软装装点你的家"},{"id":1008008,"name":"被枕","keywords":"","front_desc":"选用优质材料，确保好芯","parent_id":1005000,"sort_order":2,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/927bc33f7ae2895dd6c11cf91f5e3228.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/b43ef7cececebe6292d2f7f590522e05.png","level":"L2","type":0,"front_name":"守护你的睡眠时光"},{"id":1008009,"name":"床品件套","keywords":"","front_desc":"严格用料，亲肤舒适","parent_id":1005000,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/243e5bf327a87217ad1f54592f0176ec.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/81f671bd36bce05d5f57827e5c88dd1b.png","level":"L2","type":0,"front_name":"MUJI等品牌制造商出品"},{"id":1008016,"name":"灯具","keywords":"","front_desc":"极简主义，贴近生活的设计","parent_id":1005000,"sort_order":8,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/c48e0d9dcfac01499a437774a915842b.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/f702dc399d14d4e1509d5ed6e57acd19.png","level":"L2","type":0,"front_name":"一盏灯，温暖一个家"},{"id":1010003,"name":"地垫","keywords":"","front_desc":"手工编织，时尚环保","parent_id":1005000,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/83d4c87f28c993af1aa8d3e4d30a2fa2.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/1611ef6458e244d1909218becfe87c4d.png","level":"L2","type":0,"front_name":"家里的第\u201c五\u201d面墙"},{"id":1011003,"name":"床垫","keywords":"","front_desc":"助你拥有舒眠好梦","parent_id":1005000,"sort_order":3,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/316afeb3948b295dfe073e4c51f77a42.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d6e0e84961032fc70fd52a8d4d0fb514.png","level":"L2","type":0,"front_name":"承托你的好时光"},{"id":1011004,"name":"家饰","keywords":"","front_desc":"点缀美好生活，品质在于细节","parent_id":1005000,"sort_order":9,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ab0df9445d985bf6719ac415313a8e88.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/79275db76b5865e6167b0fbd141f2d7e.png","level":"L2","type":0,"front_name":"装饰你的家"},{"id":1015000,"name":"家具","keywords":"","front_desc":"一级原木，严苛工艺","parent_id":1005000,"sort_order":7,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/4f00675caefd0d4177892ad18bfc2df6.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d5d41841136182bf49c1f99f5c452dd6.png","level":"L2","type":0,"front_name":"大师级工艺"},{"id":1017000,"name":"宠物","keywords":"","front_desc":"出口品质，严选贴合萌宠生活习惯用品。","parent_id":1005000,"sort_order":10,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/a0352c57c60ce4f68370ecdab6a30857.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/dae4d6e89ab8a0cd3e8da026e4660137.png","level":"L2","type":0,"front_name":"抑菌除味，打造宠物舒适空间"},{"id":1036000,"name":"夏凉","keywords":"","front_desc":"夏凉床品，舒适一夏","parent_id":1005000,"sort_order":1,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/13ff4decdf38fe1a5bde34f0e0cc635a.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/bd17c985bacb9b9ab1ab6e9d66ee343c.png","level":"L2","type":0,"front_name":"夏凉床品，舒适一夏"}]
             */

            private int id;
            private String name;
            private String keywords;
            private String front_desc;
            private int parent_id;
            private int sort_order;
            private int show_index;
            private int is_show;
            private String banner_url;
            private String icon_url;
            private String img_url;
            private String wap_banner_url;
            private String level;
            private int type;
            private String front_name;
            private List<SubCategoryListBean> subCategoryList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getFront_desc() {
                return front_desc;
            }

            public void setFront_desc(String front_desc) {
                this.front_desc = front_desc;
            }

            public int getParent_id() {
                return parent_id;
            }

            public void setParent_id(int parent_id) {
                this.parent_id = parent_id;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }

            public int getShow_index() {
                return show_index;
            }

            public void setShow_index(int show_index) {
                this.show_index = show_index;
            }

            public int getIs_show() {
                return is_show;
            }

            public void setIs_show(int is_show) {
                this.is_show = is_show;
            }

            public String getBanner_url() {
                return banner_url;
            }

            public void setBanner_url(String banner_url) {
                this.banner_url = banner_url;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public String getWap_banner_url() {
                return wap_banner_url;
            }

            public void setWap_banner_url(String wap_banner_url) {
                this.wap_banner_url = wap_banner_url;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getFront_name() {
                return front_name;
            }

            public void setFront_name(String front_name) {
                this.front_name = front_name;
            }

            public List<SubCategoryListBean> getSubCategoryList() {
                return subCategoryList;
            }

            public void setSubCategoryList(List<SubCategoryListBean> subCategoryList) {
                this.subCategoryList = subCategoryList;
            }

            public static class SubCategoryListBean {
                /**
                 * id : 1008002
                 * name : 布艺软装
                 * keywords :
                 * front_desc : 换个软装，换个家
                 * parent_id : 1005000
                 * sort_order : 6
                 * show_index : 4
                 * is_show : 1
                 * banner_url : http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png
                 * icon_url :
                 * img_url :
                 * wap_banner_url : http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png
                 * level : L2
                 * type : 0
                 * front_name : 各种风格软装装点你的家
                 */

                private int id;
                private String name;
                private String keywords;
                private String front_desc;
                private int parent_id;
                private int sort_order;
                private int show_index;
                private int is_show;
                private String banner_url;
                private String icon_url;
                private String img_url;
                private String wap_banner_url;
                private String level;
                private int type;
                private String front_name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getKeywords() {
                    return keywords;
                }

                public void setKeywords(String keywords) {
                    this.keywords = keywords;
                }

                public String getFront_desc() {
                    return front_desc;
                }

                public void setFront_desc(String front_desc) {
                    this.front_desc = front_desc;
                }

                public int getParent_id() {
                    return parent_id;
                }

                public void setParent_id(int parent_id) {
                    this.parent_id = parent_id;
                }

                public int getSort_order() {
                    return sort_order;
                }

                public void setSort_order(int sort_order) {
                    this.sort_order = sort_order;
                }

                public int getShow_index() {
                    return show_index;
                }

                public void setShow_index(int show_index) {
                    this.show_index = show_index;
                }

                public int getIs_show() {
                    return is_show;
                }

                public void setIs_show(int is_show) {
                    this.is_show = is_show;
                }

                public String getBanner_url() {
                    return banner_url;
                }

                public void setBanner_url(String banner_url) {
                    this.banner_url = banner_url;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }

                public String getImg_url() {
                    return img_url;
                }

                public void setImg_url(String img_url) {
                    this.img_url = img_url;
                }

                public String getWap_banner_url() {
                    return wap_banner_url;
                }

                public void setWap_banner_url(String wap_banner_url) {
                    this.wap_banner_url = wap_banner_url;
                }

                public String getLevel() {
                    return level;
                }

                public void setLevel(String level) {
                    this.level = level;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getFront_name() {
                    return front_name;
                }

                public void setFront_name(String front_name) {
                    this.front_name = front_name;
                }
            }
        }

        public static class CategoryListBean {
            /**
             * id : 1005000
             * name : 居家
             * keywords :
             * front_desc : 回家，放松身心
             * parent_id : 0
             * sort_order : 2
             * show_index : 1
             * is_show : 1
             * banner_url : http://yanxuan.nosdn.127.net/92357337378cce650797444bc107b0f7.jpg
             * icon_url : http://yanxuan.nosdn.127.net/a45c2c262a476fea0b9fc684fed91ef5.png
             * img_url : //nos.netease.com/yanxuan/f0d0e1a542e2095861b42bf789d948ce.jpg
             * wap_banner_url : http://yanxuan.nosdn.127.net/e8bf0cf08cf7eda21606ab191762e35c.png
             * level : L1
             * type : 0
             * front_name : 回家，放松身心
             * subCategoryList : [{"id":1008002,"name":"布艺软装","keywords":"","front_desc":"换个软装，换个家","parent_id":1005000,"sort_order":6,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png","level":"L2","type":0,"front_name":"各种风格软装装点你的家"},{"id":1008008,"name":"被枕","keywords":"","front_desc":"选用优质材料，确保好芯","parent_id":1005000,"sort_order":2,"show_index":2,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/927bc33f7ae2895dd6c11cf91f5e3228.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/b43ef7cececebe6292d2f7f590522e05.png","level":"L2","type":0,"front_name":"守护你的睡眠时光"},{"id":1008009,"name":"床品件套","keywords":"","front_desc":"严格用料，亲肤舒适","parent_id":1005000,"sort_order":4,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/243e5bf327a87217ad1f54592f0176ec.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/81f671bd36bce05d5f57827e5c88dd1b.png","level":"L2","type":0,"front_name":"MUJI等品牌制造商出品"},{"id":1008016,"name":"灯具","keywords":"","front_desc":"极简主义，贴近生活的设计","parent_id":1005000,"sort_order":8,"show_index":6,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/c48e0d9dcfac01499a437774a915842b.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/f702dc399d14d4e1509d5ed6e57acd19.png","level":"L2","type":0,"front_name":"一盏灯，温暖一个家"},{"id":1010003,"name":"地垫","keywords":"","front_desc":"手工编织，时尚环保","parent_id":1005000,"sort_order":5,"show_index":4,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/83d4c87f28c993af1aa8d3e4d30a2fa2.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/1611ef6458e244d1909218becfe87c4d.png","level":"L2","type":0,"front_name":"家里的第\u201c五\u201d面墙"},{"id":1011003,"name":"床垫","keywords":"","front_desc":"助你拥有舒眠好梦","parent_id":1005000,"sort_order":3,"show_index":3,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/316afeb3948b295dfe073e4c51f77a42.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d6e0e84961032fc70fd52a8d4d0fb514.png","level":"L2","type":0,"front_name":"承托你的好时光"},{"id":1011004,"name":"家饰","keywords":"","front_desc":"点缀美好生活，品质在于细节","parent_id":1005000,"sort_order":9,"show_index":7,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/ab0df9445d985bf6719ac415313a8e88.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/79275db76b5865e6167b0fbd141f2d7e.png","level":"L2","type":0,"front_name":"装饰你的家"},{"id":1015000,"name":"家具","keywords":"","front_desc":"一级原木，严苛工艺","parent_id":1005000,"sort_order":7,"show_index":5,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/4f00675caefd0d4177892ad18bfc2df6.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/d5d41841136182bf49c1f99f5c452dd6.png","level":"L2","type":0,"front_name":"大师级工艺"},{"id":1017000,"name":"宠物","keywords":"","front_desc":"出口品质，严选贴合萌宠生活习惯用品。","parent_id":1005000,"sort_order":10,"show_index":8,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/a0352c57c60ce4f68370ecdab6a30857.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/dae4d6e89ab8a0cd3e8da026e4660137.png","level":"L2","type":0,"front_name":"抑菌除味，打造宠物舒适空间"},{"id":1036000,"name":"夏凉","keywords":"","front_desc":"夏凉床品，舒适一夏","parent_id":1005000,"sort_order":1,"show_index":1,"is_show":1,"banner_url":"http://yanxuan.nosdn.127.net/13ff4decdf38fe1a5bde34f0e0cc635a.png","icon_url":"","img_url":"","wap_banner_url":"http://yanxuan.nosdn.127.net/bd17c985bacb9b9ab1ab6e9d66ee343c.png","level":"L2","type":0,"front_name":"夏凉床品，舒适一夏"}]
             */

            private int id;
            private String name;
            private String keywords;
            private String front_desc;
            private int parent_id;
            private int sort_order;
            private int show_index;
            private int is_show;
            private String banner_url;
            private String icon_url;
            private String img_url;
            private String wap_banner_url;
            private String level;
            private int type;
            private String front_name;
            private List<SubCategoryListBeanX> subCategoryList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getFront_desc() {
                return front_desc;
            }

            public void setFront_desc(String front_desc) {
                this.front_desc = front_desc;
            }

            public int getParent_id() {
                return parent_id;
            }

            public void setParent_id(int parent_id) {
                this.parent_id = parent_id;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }

            public int getShow_index() {
                return show_index;
            }

            public void setShow_index(int show_index) {
                this.show_index = show_index;
            }

            public int getIs_show() {
                return is_show;
            }

            public void setIs_show(int is_show) {
                this.is_show = is_show;
            }

            public String getBanner_url() {
                return banner_url;
            }

            public void setBanner_url(String banner_url) {
                this.banner_url = banner_url;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public String getWap_banner_url() {
                return wap_banner_url;
            }

            public void setWap_banner_url(String wap_banner_url) {
                this.wap_banner_url = wap_banner_url;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getFront_name() {
                return front_name;
            }

            public void setFront_name(String front_name) {
                this.front_name = front_name;
            }

            public List<SubCategoryListBeanX> getSubCategoryList() {
                return subCategoryList;
            }

            public void setSubCategoryList(List<SubCategoryListBeanX> subCategoryList) {
                this.subCategoryList = subCategoryList;
            }

            public static class SubCategoryListBeanX {
                /**
                 * id : 1008002
                 * name : 布艺软装
                 * keywords :
                 * front_desc : 换个软装，换个家
                 * parent_id : 1005000
                 * sort_order : 6
                 * show_index : 4
                 * is_show : 1
                 * banner_url : http://yanxuan.nosdn.127.net/8bbcd7de60a678846664af998f57e71c.png
                 * icon_url :
                 * img_url :
                 * wap_banner_url : http://yanxuan.nosdn.127.net/2e2fb4f2856a021bbcd1b4c8400f2b06.png
                 * level : L2
                 * type : 0
                 * front_name : 各种风格软装装点你的家
                 */

                private int id;
                private String name;
                private String keywords;
                private String front_desc;
                private int parent_id;
                private int sort_order;
                private int show_index;
                private int is_show;
                private String banner_url;
                private String icon_url;
                private String img_url;
                private String wap_banner_url;
                private String level;
                private int type;
                private String front_name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getKeywords() {
                    return keywords;
                }

                public void setKeywords(String keywords) {
                    this.keywords = keywords;
                }

                public String getFront_desc() {
                    return front_desc;
                }

                public void setFront_desc(String front_desc) {
                    this.front_desc = front_desc;
                }

                public int getParent_id() {
                    return parent_id;
                }

                public void setParent_id(int parent_id) {
                    this.parent_id = parent_id;
                }

                public int getSort_order() {
                    return sort_order;
                }

                public void setSort_order(int sort_order) {
                    this.sort_order = sort_order;
                }

                public int getShow_index() {
                    return show_index;
                }

                public void setShow_index(int show_index) {
                    this.show_index = show_index;
                }

                public int getIs_show() {
                    return is_show;
                }

                public void setIs_show(int is_show) {
                    this.is_show = is_show;
                }

                public String getBanner_url() {
                    return banner_url;
                }

                public void setBanner_url(String banner_url) {
                    this.banner_url = banner_url;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }

                public String getImg_url() {
                    return img_url;
                }

                public void setImg_url(String img_url) {
                    this.img_url = img_url;
                }

                public String getWap_banner_url() {
                    return wap_banner_url;
                }

                public void setWap_banner_url(String wap_banner_url) {
                    this.wap_banner_url = wap_banner_url;
                }

                public String getLevel() {
                    return level;
                }

                public void setLevel(String level) {
                    this.level = level;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getFront_name() {
                    return front_name;
                }

                public void setFront_name(String front_name) {
                    this.front_name = front_name;
                }
            }
        }
    }
}
