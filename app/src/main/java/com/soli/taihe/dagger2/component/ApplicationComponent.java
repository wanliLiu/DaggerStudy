package com.soli.taihe.dagger2.component;

import com.google.gson.Gson;
import com.soli.taihe.dagger2.module.AModule;
import com.soli.taihe.dagger2.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by soli on 30/12/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Gson getGson();


    AComponent plusModule(AModule module);
}
