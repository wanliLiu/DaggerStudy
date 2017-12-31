package com.soli.taihe.dagger2.ui;

import android.app.Application;

import com.soli.taihe.dagger2.component.AComponent;
import com.soli.taihe.dagger2.component.ApplicationComponent;
import com.soli.taihe.dagger2.component.DaggerApplicationComponent;
import com.soli.taihe.dagger2.module.AModule;

/**
 * Created by soli on 30/12/2017.
 */

public class MainApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    private AComponent mAComponent;

    private static MainApplication sApplication;

    public static MainApplication getInstance() {
        return sApplication;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        sApplication = this;

        mApplicationComponent = DaggerApplicationComponent.create();
    }

    public AComponent getAComponent() {
        if (mAComponent == null)
            mAComponent = mApplicationComponent.plusModule(new AModule());

        return mAComponent;
    }


    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
