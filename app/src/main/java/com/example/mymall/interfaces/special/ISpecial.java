package com.example.mymall.interfaces.special;

import com.example.mymall.interfaces.IBasePresenter;
import com.example.mymall.interfaces.IBaseView;
import com.example.mymall.ui.specialsubject.bean.SpeSubBean;

import java.util.List;

public interface ISpecial {
    //返回的
    interface ISpecialView extends IBaseView {
        //专题页数据
        void getSpeSubReturn(SpeSubBean bean);

    }

    //请求的
    interface SpecialPersenter extends IBasePresenter<ISpecial.ISpecialView> {
        //专题页数据
        void getSpeSub(int page, int size);
    }
}
