package com.example.mymall.interfaces.special;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.specialsubject.bean.SpeSubXgBean;

public interface ISpecialXq {
    //返回的
    interface SpecialXqView extends IBaseView {
        //专题相关推荐
        void getSpeSubXqReturn(SpeSubXgBean bean);

    }

    //请求的
    interface SpecialXqPersenter extends IBasePresenter<ISpecialXq.SpecialXqView> {
        //专题相关推荐
        void getSpeSubXq(int id);
    }
}
