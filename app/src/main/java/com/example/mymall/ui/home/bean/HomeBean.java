package com.example.mymall.ui.home.bean;


import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class HomeBean {

    public static final int ITEM_TYPE_BANNER = 1;        //  轮播图的
    public static final int ITEM_TYPE_TAB = 2;           //TAB
    public static final int ITEM_TYPE_TITLETOP = 3;      //标题顶部就边距
    public static final int ITEM_TYPE_TITLE = 4;         //标题
    public static final int ITEM_TYPE_BRAND = 5;         //品牌
    public static final int ITEM_TYPE_NEW = 6;           //新品首发
    public static final int ITEM_TYPE_HOT = 7;           //人气推荐
    public static final int ITEM_TYPE_TOPIC = 8;         //专题精选
    public static final int ITEM_TYPE_CATEGORY = 9;       //类别





    /**
     * 封装一个主页recyclerview公用数据对象
     * 用来代表主页所以显示的类容
     */
    public static class HomeListBean<T> implements MultiItemEntity {

        public int currentType;  //当前的item的类别

        public T data; //记录当前从服务器获取到的数据对象


        @Override
        public int getItemType() {
            return currentType;
        }
    }


    /**
     * errno : 0
     * errmsg :
     * data : {"banner":[{"id":1,"ad_position_id":1,"media_type":1,"name":"合作 谁是你的菜","link":"","image_url":"http://yanxuan.nosdn.127.net/65091eebc48899298171c2eb6696fe27.jpg","content":"合作 谁是你的菜","end_time":0,"enabled":1},{"id":2,"ad_position_id":1,"media_type":1,"name":"活动 美食节","link":"","image_url":"http://yanxuan.nosdn.127.net/bff2e49136fcef1fd829f5036e07f116.jpg","content":"活动 美食节","end_time":0,"enabled":1},{"id":3,"ad_position_id":1,"media_type":1,"name":"活动 母亲节","link":"","image_url":"http://yanxuan.nosdn.127.net/8e50c65fda145e6dd1bf4fb7ee0fcecc.jpg","content":"活动 母亲节","end_time":0,"enabled":1}],"channel":[{"id":1,"name":"居家","url":"/pages/category/category?id=1005000","icon_url":"http://ac-3yr0g9cz.clouddn.com/c031ea3cf575f885cd1c.png","sort_order":1},{"id":2,"name":"餐厨","url":"/pages/category/category?id=1005001","icon_url":"http://ac-3yr0g9cz.clouddn.com/4fbe8913819b017ebe1b.png","sort_order":2},{"id":3,"name":"配件","url":"/pages/category/category?id=1008000","icon_url":"http://ac-3yr0g9cz.clouddn.com/e8070853e6c6f5627713.png","sort_order":3},{"id":4,"name":"服装","url":"/pages/category/category?id=1005002","icon_url":"http://ac-3yr0g9cz.clouddn.com/4fa3c0c72964901c5a45.png","sort_order":4},{"id":5,"name":"志趣","url":"/pages/category/category?id=1019000","icon_url":"http://ac-3yr0g9cz.clouddn.com/da8716daa0ede53a9bb8.png","sort_order":5}],"newGoodsList":[{"id":1116011,"name":"蔓越莓曲奇 200克","list_pic_url":"http://yanxuan.nosdn.127.net/767b370d07f3973500db54900bcbd2a7.png","retail_price":36},{"id":1127047,"name":"趣味粉彩系列笔记本","list_pic_url":"http://yanxuan.nosdn.127.net/6c03ca93d8fe404faa266ea86f3f1e43.png","retail_price":29},{"id":1134030,"name":"简约知性记忆棉坐垫","list_pic_url":"http://yanxuan.nosdn.127.net/aa49dfe878becf768eddc4c1636643a6.png","retail_price":46},{"id":1134032,"name":"趣味粉彩系列记忆棉坐垫","list_pic_url":"http://yanxuan.nosdn.127.net/8b30eeb17c831eba08b97bdcb4c46a8e.png","retail_price":49}],"hotGoodsList":[{"id":1006013,"name":"双宫茧桑蚕丝被 空调被","list_pic_url":"http://yanxuan.nosdn.127.net/583812520c68ca7995b6fac4c67ae2c7.png","retail_price":699,"goods_brief":"一级桑蚕丝，吸湿透气柔软"},{"id":1009012,"name":"可水洗舒柔丝羽绒枕","list_pic_url":"http://yanxuan.nosdn.127.net/a196b367f23ccfd8205b6da647c62b84.png","retail_price":59,"goods_brief":"超细纤维，蓬松轻盈回弹"},{"id":1011004,"name":"色织精梳AB纱格纹空调被","list_pic_url":"http://yanxuan.nosdn.127.net/0984c9388a2c3fd2335779da904be393.png","retail_price":199,"goods_brief":"加大加厚，双色精彩"}],"brandList":[{"id":1026000,"name":"CK制造商","list_pic_url":"http://yanxuan.nosdn.127.net/658f09b7ec522d31742b47b914d64338.png","simple_desc":"严选寻访Calvin Klein品牌的制造商，\n深入世界领带第一生产地，设计与品质并重，\n致力于给消费者带来优质典雅的服饰用品。","pic_url":"http://yanxuan.nosdn.127.net/fb139c9f11a10deb41beeb42aaad488e.png","sort_order":1,"is_show":1,"floor_price":39,"app_list_pic_url":"http://yanxuan.nosdn.127.net/658f09b7ec522d31742b47b914d64338.png","is_new":1,"new_pic_url":"http://yanxuan.nosdn.127.net/76638fb8e6990aadf837ce761c3b7399.jpg","new_sort_order":1},{"id":1001000,"name":"MUJI制造商","list_pic_url":"http://yanxuan.nosdn.127.net/1541445967645114dd75f6b0edc4762d.png","simple_desc":"严选精选了MUJI制造商和生产原料，\n用几乎零利润的价格，剔除品牌溢价，\n让用户享受原品牌的品质生活。","pic_url":"http://yanxuan.nosdn.127.net/4ea3f1e60dd77c45c218e503d721a1ed.jpg","sort_order":2,"is_show":1,"floor_price":12.9,"app_list_pic_url":"http://yanxuan.nosdn.127.net/1541445967645114dd75f6b0edc4762d.png","is_new":1,"new_pic_url":"http://yanxuan.nosdn.127.net/4ea3f1e60dd77c45c218e503d721a1ed.jpg","new_sort_order":2},{"id":1024000,"name":"WMF制造商","list_pic_url":"http://yanxuan.nosdn.127.net/2018e9ac91ec37d9aaf437a1fd5d7070.png","simple_desc":"严选找寻德国百年高端厨具WMF的制造商，\n选择拥有14年经验的不锈钢生产工厂，\n为你甄选事半功倍的优质厨具。","pic_url":"http://yanxuan.nosdn.127.net/2a2ae0d49043e525db8d0d8d84460ac8.png","sort_order":8,"is_show":1,"floor_price":9.9,"app_list_pic_url":"http://yanxuan.nosdn.127.net/2018e9ac91ec37d9aaf437a1fd5d7070.png","is_new":1,"new_pic_url":"http://yanxuan.nosdn.127.net/abcfa79205679db51198adc19c184dd1.jpg","new_sort_order":3},{"id":1001038,"name":"Coach制造商","list_pic_url":"http://yanxuan.nosdn.127.net/1b1cc16135fd8467d40983f75f644127.png","simple_desc":"严选为制作高品质高颜值皮具配件，\n由Coach、MK等品牌制造商生产，\n由严选360度全程监制，给你带来优质皮具。","pic_url":"http://yanxuan.nosdn.127.net/c933a662bb79b2a47280363e35ab994b.png","sort_order":3,"is_show":1,"floor_price":49,"app_list_pic_url":"http://yanxuan.nosdn.127.net/1b1cc16135fd8467d40983f75f644127.png","is_new":1,"new_pic_url":"http://yanxuan.nosdn.127.net/b5cd73d3b310bad02539412f064d4ea1.jpg","new_sort_order":10}],"topicList":[{"id":314,"title":"关爱他成长的每一个足迹","content":"<img src=\"//yanxuan.nosdn.127.net/75c55a13fde5eb2bc2dd6813b4c565cc.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/e27e1de2b271a28a21c10213b9df7e95.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/9d413d1d28f753cb19096b533d53418d.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/64b0f2f350969e9818a3b6c43c217325.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/a668e6ae7f1fa45565c1eac221787570.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/0d4004e19728f2707f08f4be79bbc774.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/79ee021bbe97de7ecda691de6787241f.jpg\">","avatar":"https://yanxuan.nosdn.127.net/14943186689221563.png","item_pic_url":"https://yanxuan.nosdn.127.net/14943267735961674.jpg","subtitle":"专业运动品牌同厂，毛毛虫鞋买二送一","topic_category_id":2,"price_info":0,"read_count":"6.4k","scene_pic_url":"https://yanxuan.nosdn.127.net/14943267735961674.jpg","topic_template_id":0,"topic_tag_id":0,"sort_order":1,"is_show":1},{"id":313,"title":"一次解决5个节日送礼难题","content":"<img src=\"//yanxuan.nosdn.127.net/75c55a13fde5eb2bc2dd6813b4c565cc.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/e27e1de2b271a28a21c10213b9df7e95.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/9d413d1d28f753cb19096b533d53418d.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/64b0f2f350969e9818a3b6c43c217325.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/a668e6ae7f1fa45565c1eac221787570.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/0d4004e19728f2707f08f4be79bbc774.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/79ee021bbe97de7ecda691de6787241f.jpg\">","avatar":"https://yanxuan.nosdn.127.net/14942967243991290.png","item_pic_url":"https://yanxuan.nosdn.127.net/14942996754171334.jpg","subtitle":"这些就是他们想要的礼物清单","topic_category_id":0,"price_info":59.9,"read_count":"7.8k","scene_pic_url":"https://yanxuan.nosdn.127.net/14942996754171334.jpg","topic_template_id":0,"topic_tag_id":0,"sort_order":0,"is_show":1},{"id":300,"title":"秒杀化学洗涤剂的纯天然皂","content":"<img src=\"//yanxuan.nosdn.127.net/75c55a13fde5eb2bc2dd6813b4c565cc.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/e27e1de2b271a28a21c10213b9df7e95.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/9d413d1d28f753cb19096b533d53418d.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/64b0f2f350969e9818a3b6c43c217325.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/a668e6ae7f1fa45565c1eac221787570.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/0d4004e19728f2707f08f4be79bbc774.jpg\">\n    <img src=\"//yanxuan.nosdn.127.net/79ee021bbe97de7ecda691de6787241f.jpg\">","avatar":"https://yanxuan.nosdn.127.net/14939843011001088.png","item_pic_url":"https://yanxuan.nosdn.127.net/14939843143621089.jpg","subtitle":"前段时间有朋友跟我抱怨，和婆婆住到一起才发现生活理念有太多不和。别的不提，光是洗...","topic_category_id":1,"price_info":0,"read_count":"15.3k","scene_pic_url":"https://yanxuan.nosdn.127.net/14939843143621089.jpg","topic_template_id":0,"topic_tag_id":0,"sort_order":0,"is_show":1}],"categoryList":[{"id":1005000,"name":"居家","goodsList":[{"id":1009024,"name":"日式和风懒人沙发","list_pic_url":"http://yanxuan.nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png","retail_price":599},{"id":1015007,"name":"典雅美式全棉刺绣抱枕","list_pic_url":"http://yanxuan.nosdn.127.net/a2045004de8a6225289376ad54317fc8.png","retail_price":59},{"id":1020000,"name":"升级款记忆绵护椎腰靠","list_pic_url":"http://yanxuan.nosdn.127.net/819fdf1f635a694166bcfdd426416e8c.png","retail_price":79},{"id":1030001,"name":"160*230羊毛手工地毯","list_pic_url":"http://yanxuan.nosdn.127.net/88dc5d80c6f84102f003ecd69c86e1cf.png","retail_price":969},{"id":1030002,"name":"160*230羊毛圈绒枪刺地毯","list_pic_url":"http://yanxuan.nosdn.127.net/8b9328496990357033d4259fda250679.png","retail_price":899},{"id":1030003,"name":"160*230羊毛手工几何地毯","list_pic_url":"http://yanxuan.nosdn.127.net/1d1ab099dc0e254c15e57302e78e200b.png","retail_price":1469},{"id":1035006,"name":"全棉单面割绒浴室地垫","list_pic_url":"http://yanxuan.nosdn.127.net/ee92704f3b8323905b51fc647823e6e5.png","retail_price":56}]},{"id":1005001,"name":"餐厨","goodsList":[{"id":1023003,"name":"100年传世珐琅锅 全家系列","list_pic_url":"http://yanxuan.nosdn.127.net/c39d54c06a71b4b61b6092a0d31f2335.png","retail_price":398},{"id":1025005,"name":"100年传世珐琅锅","list_pic_url":"http://yanxuan.nosdn.127.net/49e26f00ca4d0ce00f9960d22c936738.png","retail_price":268},{"id":1038004,"name":"100年传世珐琅锅 马卡龙系列","list_pic_url":"http://yanxuan.nosdn.127.net/4d3d3eaeb872860539d7faa59f9f84e9.png","retail_price":359},{"id":1051000,"name":"Carat钻石炒锅30cm","list_pic_url":"http://yanxuan.nosdn.127.net/e564410546a11ddceb5a82bfce8da43d.png","retail_price":180},{"id":1051001,"name":"Carat钻石煎锅28cm","list_pic_url":"http://yanxuan.nosdn.127.net/f53ed57d9e23fda7e24dfd0e0a50c5d1.png","retail_price":159},{"id":1051002,"name":"Carat钻石汤锅24cm","list_pic_url":"http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png","retail_price":228},{"id":1051003,"name":"Carat钻石奶锅18cm","list_pic_url":"http://yanxuan.nosdn.127.net/6a54ccc389afb2459b163245bbb2c978.png","retail_price":148}]},{"id":1005002,"name":"饮食","goodsList":[{"id":1045000,"name":"绿茶蛋黄酥 200克/4枚入","list_pic_url":"http://yanxuan.nosdn.127.net/b2adc3fd9b84a289a1be03e8ee400e61.png","retail_price":28},{"id":1070000,"name":"星云酥 180克/3颗","list_pic_url":"http://yanxuan.nosdn.127.net/8392725765cdd57fdae3f173877f4bda.png","retail_price":26},{"id":1111007,"name":"妙曲奇遇记曲奇礼盒 520克","list_pic_url":"http://yanxuan.nosdn.127.net/8d228f767b136a67aaf2cbbf6deb46fa.png","retail_price":78},{"id":1116011,"name":"蔓越莓曲奇 200克","list_pic_url":"http://yanxuan.nosdn.127.net/767b370d07f3973500db54900bcbd2a7.png","retail_price":36},{"id":1134036,"name":"凤梨酥 360克","list_pic_url":"http://yanxuan.nosdn.127.net/9356cc27b22bd47ad43913d13226555f.png","retail_price":38},{"id":1143018,"name":"粽情乡思端午粽礼盒 640克","list_pic_url":"http://yanxuan.nosdn.127.net/d1fd69cee4990f4de1109baef30efeeb.png","retail_price":68},{"id":1143019,"name":"粽夏冰晶端午粽礼盒 480克","list_pic_url":"http://yanxuan.nosdn.127.net/277b07c1e5e6fb57cf9ca47fcd3903d5.png","retail_price":98}]},{"id":1008000,"name":"配件","goodsList":[{"id":1085019,"name":"20寸 纯PC\u201c铝框\u201d（非全铝）登机箱","list_pic_url":"http://yanxuan.nosdn.127.net/65c955a7a98e84d44ca30bb88a591eac.png","retail_price":349},{"id":1086052,"name":"20寸 铝镁合金登机箱","list_pic_url":"http://yanxuan.nosdn.127.net/93171a281c4ed272c007a050816e6f6c.png","retail_price":859},{"id":1113019,"name":"20寸 PC膜拉链登机箱","list_pic_url":"http://yanxuan.nosdn.127.net/ad504bb389039ff35c4cd6ae912be87e.png","retail_price":208},{"id":1114011,"name":"104升 纯PC拉链斜纹拉杆箱","list_pic_url":"http://yanxuan.nosdn.127.net/196b5ce11930b4eadaec563cb0406634.png","retail_price":299},{"id":1143016,"name":"112升 纯PC拉链斜纹拉杆箱","list_pic_url":"http://yanxuan.nosdn.127.net/e56c6239ee4a641ce2a4565c6babb43e.png","retail_price":319},{"id":1152101,"name":"魔兽世界 部落 奥格瑞玛 拉杆箱 可登机","list_pic_url":"http://yanxuan.nosdn.127.net/c1c62211a17b71a634fa0c705d11fb42.png","retail_price":888},{"id":1156006,"name":"20寸 全铝镁合金登机箱","list_pic_url":"http://yanxuan.nosdn.127.net/ea5b0a572b35089446fba491db7fbbc3.png","retail_price":699}]},{"id":1010000,"name":"服装","goodsList":[{"id":1056002,"name":"男式玩色内裤","list_pic_url":"http://yanxuan.nosdn.127.net/922fdbe007033f7a88f7ebc57c3d1e75.png","retail_price":59},{"id":1074001,"name":"男式莫代尔无痕内裤","list_pic_url":"http://yanxuan.nosdn.127.net/73567265b04a9998f64419186ddd8531.png","retail_price":59},{"id":1092025,"name":"Let it go男式纯棉免洗内裤","list_pic_url":"http://yanxuan.nosdn.127.net/56a46e9a4832587471c0f9ad7c1b7d85.png","retail_price":19.9},{"id":1092026,"name":"Let it go女式纯棉免洗内裤","list_pic_url":"http://yanxuan.nosdn.127.net/83433f5a7ef69abda2544a53332a0fad.png","retail_price":19.9},{"id":1113010,"name":"男式丝滑莫代尔平角内裤","list_pic_url":"http://yanxuan.nosdn.127.net/2d0920b51331bb1636330ad8e07d1b97.png","retail_price":59},{"id":1113011,"name":"女式丝滑莫代尔三角内裤","list_pic_url":"http://yanxuan.nosdn.127.net/7a683f68fc988df299b5cfe6273d6fb7.png","retail_price":49},{"id":1127024,"name":"女式无痕真丝内裤","list_pic_url":"http://yanxuan.nosdn.127.net/0a70f12a712e90d7d93beec4f686fe8e.png","retail_price":39}]},{"id":1011000,"name":"婴童","goodsList":[{"id":1033000,"name":"新生彩棉初衣礼盒（婴童）","list_pic_url":"http://yanxuan.nosdn.127.net/9aab9a0bf4fef8fe3dc8c732bc22d4b7.png","retail_price":199},{"id":1116004,"name":"条纹长袖海魂衫（男婴童）","list_pic_url":"http://yanxuan.nosdn.127.net/14d3a47ccf52815baf6df308be6db5a6.png","retail_price":79},{"id":1116005,"name":"条纹长袖海魂衫（女婴童）","list_pic_url":"http://yanxuan.nosdn.127.net/71937456c3cd654f936f619201a79c09.png","retail_price":79},{"id":1116008,"name":"棉双层纱波点娃娃裙（婴童）","list_pic_url":"http://yanxuan.nosdn.127.net/149a09a391ea5a888debf50b9dc4ed7b.png","retail_price":99},{"id":1125010,"name":"格纹棉质褶皱娃娃裙（婴童）","list_pic_url":"http://yanxuan.nosdn.127.net/f82995ccb2a2f6beddd4ad794f5da2a1.png","retail_price":159},{"id":1125011,"name":"格纹棉质衬衣（婴童）","list_pic_url":"http://yanxuan.nosdn.127.net/be9740b734087f294f59a6560b932bc1.png","retail_price":139},{"id":1125026,"name":"中国红满月百天礼盒","list_pic_url":"http://yanxuan.nosdn.127.net/6308c120c441fd3e47658167ad944156.png","retail_price":159}]},{"id":1012000,"name":"杂货","goodsList":[{"id":1039056,"name":"金属亚光钢笔","list_pic_url":"http://yanxuan.nosdn.127.net/3e14e82a44c3a250af63df4c29c572d0.png","retail_price":79},{"id":1046001,"name":"按动式三角中油笔","list_pic_url":"http://yanxuan.nosdn.127.net/74583e585825ecacb11f7c53d2021e00.png","retail_price":8.9},{"id":1046002,"name":"直杆三角中性笔","list_pic_url":"http://yanxuan.nosdn.127.net/eb486cfe807c4fe5696aa59cbcf1f96a.png","retail_price":9.9},{"id":1055022,"name":"磨砂杆直杆中性笔","list_pic_url":"http://yanxuan.nosdn.127.net/c7c74a96eacb29455dbf557b840eaaf5.png","retail_price":4.9},{"id":1075022,"name":"暗格简约钢笔","list_pic_url":"http://yanxuan.nosdn.127.net/97ad483a94ed88216a989df83e39cbf0.png","retail_price":39},{"id":1092001,"name":"星空原色水晶笔","list_pic_url":"http://yanxuan.nosdn.127.net/8e35b003ce7895c39eeb073b1f61b1d7.png","retail_price":29},{"id":1092005,"name":"木韵檀香黄铜笔","list_pic_url":"http://yanxuan.nosdn.127.net/ab1992495e0370f09386d418ad45220d.png","retail_price":39}]},{"id":1013001,"name":"洗护","goodsList":[{"id":1006051,"name":"皇室御用超柔毛巾","list_pic_url":"http://yanxuan.nosdn.127.net/ad5a317216f9da495b144070ecf1f957.png","retail_price":59},{"id":1009027,"name":"皇室御用超柔毛巾80s","list_pic_url":"http://yanxuan.nosdn.127.net/71cfd849335c498dee3c54d1eb823c17.png","retail_price":79},{"id":1021000,"name":"埃及进口长绒棉毛巾","list_pic_url":"http://yanxuan.nosdn.127.net/7191f2599c7fe44ed4cff7a76e853154.png","retail_price":39},{"id":1021001,"name":"全棉进口埃及长绒棉浴巾","list_pic_url":"http://yanxuan.nosdn.127.net/fd5a8622ee1a7dfd4b57b938ebf25b24.png","retail_price":99},{"id":1111010,"name":"静谧森林简欧色织提花面巾","list_pic_url":"http://yanxuan.nosdn.127.net/ef7efe55839e66993fb604dc3c2d9410.png","retail_price":69},{"id":1128010,"name":"趣味粉彩单面纱布亲肤毛巾","list_pic_url":"http://yanxuan.nosdn.127.net/a84e8e6979f00efd9a728ed36b154753.png","retail_price":29},{"id":1128011,"name":"趣味粉彩单面纱布超柔浴巾","list_pic_url":"http://yanxuan.nosdn.127.net/d6e25ec5b4ad7aa37e077ce751b56f46.png","retail_price":79}]},{"id":1019000,"name":"志趣","goodsList":[{"id":1152004,"name":"魔兽世界 蛋盾包 双肩包","list_pic_url":"http://yanxuan.nosdn.127.net/8c93cef435d888bd79833777df1cd0c2.png","retail_price":399},{"id":1152008,"name":"魔兽世界 部落 护腕 一只","list_pic_url":"http://yanxuan.nosdn.127.net/203cb83d93606865e3ddde57b69b9e9a.png","retail_price":29},{"id":1152009,"name":"魔兽世界 联盟 护腕 一只","list_pic_url":"http://yanxuan.nosdn.127.net/ae6d41117717387b82dcaf1dfce0cd97.png","retail_price":29},{"id":1152031,"name":"魔兽世界-伊利丹颈枕眼罩套装","list_pic_url":"http://yanxuan.nosdn.127.net/fd6e78a397bd9e9804116a36f0270b0a.png","retail_price":99},{"id":1152095,"name":"魔兽世界 联盟·暴风城 堡垒收纳盒","list_pic_url":"http://yanxuan.nosdn.127.net/c86b49f635fa141decebabbd0966a6ef.png","retail_price":499},{"id":1152097,"name":"魔兽世界 雷霆之怒逐风者的祝福之剑 雨伞","list_pic_url":"http://yanxuan.nosdn.127.net/532836444ae5eaec40b5810ca4f9b1e6.png","retail_price":399},{"id":1152100,"name":"魔兽世界 部落·奥格瑞玛 堡垒收纳盒","list_pic_url":"http://yanxuan.nosdn.127.net/a667c4fbbd9c499c0733539d7e986617.png","retail_price":499}]}]}
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
        private List<BannerBean> banner;
        private List<ChannelBean> channel;
        private List<NewGoodsListBean> newGoodsList;
        private List<HotGoodsListBean> hotGoodsList;
        private List<BrandListBean> brandList;
        private List<TopicListBean> topicList;
        private List<CategoryListBean> categoryList;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<ChannelBean> getChannel() {
            return channel;
        }

        public void setChannel(List<ChannelBean> channel) {
            this.channel = channel;
        }

        public List<NewGoodsListBean> getNewGoodsList() {
            return newGoodsList;
        }

        public void setNewGoodsList(List<NewGoodsListBean> newGoodsList) {
            this.newGoodsList = newGoodsList;
        }

        public List<HotGoodsListBean> getHotGoodsList() {
            return hotGoodsList;
        }

        public void setHotGoodsList(List<HotGoodsListBean> hotGoodsList) {
            this.hotGoodsList = hotGoodsList;
        }

        public List<BrandListBean> getBrandList() {
            return brandList;
        }

        public void setBrandList(List<BrandListBean> brandList) {
            this.brandList = brandList;
        }

        public List<TopicListBean> getTopicList() {
            return topicList;
        }

        public void setTopicList(List<TopicListBean> topicList) {
            this.topicList = topicList;
        }

        public List<CategoryListBean> getCategoryList() {
            return categoryList;
        }

        public void setCategoryList(List<CategoryListBean> categoryList) {
            this.categoryList = categoryList;
        }

        public static class BannerBean {
            /**
             * id : 1
             * ad_position_id : 1
             * media_type : 1
             * name : 合作 谁是你的菜
             * link :
             * image_url : http://yanxuan.nosdn.127.net/65091eebc48899298171c2eb6696fe27.jpg
             * content : 合作 谁是你的菜
             * end_time : 0
             * enabled : 1
             */

            private int id;
            private int ad_position_id;
            private int media_type;
            private String name;
            private String link;
            private String image_url;
            private String content;
            private int end_time;
            private int enabled;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getAd_position_id() {
                return ad_position_id;
            }

            public void setAd_position_id(int ad_position_id) {
                this.ad_position_id = ad_position_id;
            }

            public int getMedia_type() {
                return media_type;
            }

            public void setMedia_type(int media_type) {
                this.media_type = media_type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public int getEnabled() {
                return enabled;
            }

            public void setEnabled(int enabled) {
                this.enabled = enabled;
            }
        }

        public static class ChannelBean {
            /**
             * id : 1
             * name : 居家
             * url : /pages/category/category?id=1005000
             * icon_url : http://ac-3yr0g9cz.clouddn.com/c031ea3cf575f885cd1c.png
             * sort_order : 1
             */

            private int id;
            private String name;
            private String url;
            private String icon_url;
            private int sort_order;

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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }
        }

        public static class NewGoodsListBean {
            /**
             * id : 1116011
             * name : 蔓越莓曲奇 200克
             * list_pic_url : http://yanxuan.nosdn.127.net/767b370d07f3973500db54900bcbd2a7.png
             * retail_price : 36
             */

            private int id;
            private String name;
            private String list_pic_url;
            private float retail_price;

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

            public String getList_pic_url() {
                return list_pic_url;
            }

            public void setList_pic_url(String list_pic_url) {
                this.list_pic_url = list_pic_url;
            }

            public float getRetail_price() {
                return retail_price;
            }

            public void setRetail_price(int retail_price) {
                this.retail_price = retail_price;
            }
        }

        public static class HotGoodsListBean {
            /**
             * id : 1006013
             * name : 双宫茧桑蚕丝被 空调被
             * list_pic_url : http://yanxuan.nosdn.127.net/583812520c68ca7995b6fac4c67ae2c7.png
             * retail_price : 699
             * goods_brief : 一级桑蚕丝，吸湿透气柔软
             */

            private int id;
            private String name;
            private String list_pic_url;
            private float retail_price;
            private String goods_brief;

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

            public String getList_pic_url() {
                return list_pic_url;
            }

            public void setList_pic_url(String list_pic_url) {
                this.list_pic_url = list_pic_url;
            }

            public float getRetail_price() {
                return retail_price;
            }

            public void setRetail_price(int retail_price) {
                this.retail_price = retail_price;
            }

            public String getGoods_brief() {
                return goods_brief;
            }

            public void setGoods_brief(String goods_brief) {
                this.goods_brief = goods_brief;
            }
        }

        public static class BrandListBean {
            /**
             * id : 1026000
             * name : CK制造商
             * list_pic_url : http://yanxuan.nosdn.127.net/658f09b7ec522d31742b47b914d64338.png
             * simple_desc : 严选寻访Calvin Klein品牌的制造商，
             * 深入世界领带第一生产地，设计与品质并重，
             * 致力于给消费者带来优质典雅的服饰用品。
             * pic_url : http://yanxuan.nosdn.127.net/fb139c9f11a10deb41beeb42aaad488e.png
             * sort_order : 1
             * is_show : 1
             * floor_price : 39
             * app_list_pic_url : http://yanxuan.nosdn.127.net/658f09b7ec522d31742b47b914d64338.png
             * is_new : 1
             * new_pic_url : http://yanxuan.nosdn.127.net/76638fb8e6990aadf837ce761c3b7399.jpg
             * new_sort_order : 1
             */

            private int id;
            private String name;
            private String list_pic_url;
            private String simple_desc;
            private String pic_url;
            private int sort_order;
            private int is_show;
            private float floor_price;
            private String app_list_pic_url;
            private int is_new;
            private String new_pic_url;
            private int new_sort_order;

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

            public String getList_pic_url() {
                return list_pic_url;
            }

            public void setList_pic_url(String list_pic_url) {
                this.list_pic_url = list_pic_url;
            }

            public String getSimple_desc() {
                return simple_desc;
            }

            public void setSimple_desc(String simple_desc) {
                this.simple_desc = simple_desc;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }

            public int getIs_show() {
                return is_show;
            }

            public void setIs_show(int is_show) {
                this.is_show = is_show;
            }

            public float getFloor_price() {
                return floor_price;
            }

            public void setFloor_price(float floor_price) {
                this.floor_price = floor_price;
            }

            public String getApp_list_pic_url() {
                return app_list_pic_url;
            }

            public void setApp_list_pic_url(String app_list_pic_url) {
                this.app_list_pic_url = app_list_pic_url;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public String getNew_pic_url() {
                return new_pic_url;
            }

            public void setNew_pic_url(String new_pic_url) {
                this.new_pic_url = new_pic_url;
            }

            public int getNew_sort_order() {
                return new_sort_order;
            }

            public void setNew_sort_order(int new_sort_order) {
                this.new_sort_order = new_sort_order;
            }
        }

        public static class TopicListBean {
            /**
             * id : 314
             * title : 关爱他成长的每一个足迹
             * content : <img src="//yanxuan.nosdn.127.net/75c55a13fde5eb2bc2dd6813b4c565cc.jpg">
             * <img src="//yanxuan.nosdn.127.net/e27e1de2b271a28a21c10213b9df7e95.jpg">
             * <img src="//yanxuan.nosdn.127.net/9d413d1d28f753cb19096b533d53418d.jpg">
             * <img src="//yanxuan.nosdn.127.net/64b0f2f350969e9818a3b6c43c217325.jpg">
             * <img src="//yanxuan.nosdn.127.net/a668e6ae7f1fa45565c1eac221787570.jpg">
             * <img src="//yanxuan.nosdn.127.net/0d4004e19728f2707f08f4be79bbc774.jpg">
             * <img src="//yanxuan.nosdn.127.net/79ee021bbe97de7ecda691de6787241f.jpg">
             * avatar : https://yanxuan.nosdn.127.net/14943186689221563.png
             * item_pic_url : https://yanxuan.nosdn.127.net/14943267735961674.jpg
             * subtitle : 专业运动品牌同厂，毛毛虫鞋买二送一
             * topic_category_id : 2
             * price_info : 0
             * read_count : 6.4k
             * scene_pic_url : https://yanxuan.nosdn.127.net/14943267735961674.jpg
             * topic_template_id : 0
             * topic_tag_id : 0
             * sort_order : 1
             * is_show : 1
             */

            private int id;
            private String title;
            private String content;
            private String avatar;
            private String item_pic_url;
            private String subtitle;
            private int topic_category_id;
            private float price_info;
            private String read_count;
            private String scene_pic_url;
            private int topic_template_id;
            private int topic_tag_id;
            private int sort_order;
            private int is_show;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getItem_pic_url() {
                return item_pic_url;
            }

            public void setItem_pic_url(String item_pic_url) {
                this.item_pic_url = item_pic_url;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public int getTopic_category_id() {
                return topic_category_id;
            }

            public void setTopic_category_id(int topic_category_id) {
                this.topic_category_id = topic_category_id;
            }

            public float getPrice_info() {
                return price_info;
            }

            public void setPrice_info(float price_info) {
                this.price_info = price_info;
            }

            public String getRead_count() {
                return read_count;
            }

            public void setRead_count(String read_count) {
                this.read_count = read_count;
            }

            public String getScene_pic_url() {
                return scene_pic_url;
            }

            public void setScene_pic_url(String scene_pic_url) {
                this.scene_pic_url = scene_pic_url;
            }

            public int getTopic_template_id() {
                return topic_template_id;
            }

            public void setTopic_template_id(int topic_template_id) {
                this.topic_template_id = topic_template_id;
            }

            public int getTopic_tag_id() {
                return topic_tag_id;
            }

            public void setTopic_tag_id(int topic_tag_id) {
                this.topic_tag_id = topic_tag_id;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }

            public int getIs_show() {
                return is_show;
            }

            public void setIs_show(int is_show) {
                this.is_show = is_show;
            }
        }

        public static class CategoryListBean {
            /**
             * id : 1005000
             * name : 居家
             * goodsList : [{"id":1009024,"name":"日式和风懒人沙发","list_pic_url":"http://yanxuan.nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png","retail_price":599},{"id":1015007,"name":"典雅美式全棉刺绣抱枕","list_pic_url":"http://yanxuan.nosdn.127.net/a2045004de8a6225289376ad54317fc8.png","retail_price":59},{"id":1020000,"name":"升级款记忆绵护椎腰靠","list_pic_url":"http://yanxuan.nosdn.127.net/819fdf1f635a694166bcfdd426416e8c.png","retail_price":79},{"id":1030001,"name":"160*230羊毛手工地毯","list_pic_url":"http://yanxuan.nosdn.127.net/88dc5d80c6f84102f003ecd69c86e1cf.png","retail_price":969},{"id":1030002,"name":"160*230羊毛圈绒枪刺地毯","list_pic_url":"http://yanxuan.nosdn.127.net/8b9328496990357033d4259fda250679.png","retail_price":899},{"id":1030003,"name":"160*230羊毛手工几何地毯","list_pic_url":"http://yanxuan.nosdn.127.net/1d1ab099dc0e254c15e57302e78e200b.png","retail_price":1469},{"id":1035006,"name":"全棉单面割绒浴室地垫","list_pic_url":"http://yanxuan.nosdn.127.net/ee92704f3b8323905b51fc647823e6e5.png","retail_price":56}]
             */

            private int id;
            private String name;
            private List<GoodsListBean> goodsList;

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

            public List<GoodsListBean> getGoodsList() {
                return goodsList;
            }

            public void setGoodsList(List<GoodsListBean> goodsList) {
                this.goodsList = goodsList;
            }

            public static class GoodsListBean {
                /**
                 * id : 1009024
                 * name : 日式和风懒人沙发
                 * list_pic_url : http://yanxuan.nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png
                 * retail_price : 599
                 */

                private int id;
                private String name;
                private String list_pic_url;
                private float retail_price;

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

                public String getList_pic_url() {
                    return list_pic_url;
                }

                public void setList_pic_url(String list_pic_url) {
                    this.list_pic_url = list_pic_url;
                }

                public float getRetail_price() {
                    return retail_price;
                }

                public void setRetail_price(float retail_price) {
                    this.retail_price = retail_price;
                }
            }
        }
    }
}
