package com.soli.taihe.dagger2;

import javax.inject.Inject;

/**
 * @author Soli
 * @Time 2017/12/29
 */
public class Poetry {

    private String mPemo;

    @Inject
    public Poetry() {
        mPemo = "我是初始化的内容";
    }

    /**
     * @param mPemo
     */
    public Poetry(String mPemo) {
        this.mPemo = mPemo;
    }

    public String getPemo() {
        return mPemo;
    }
}
