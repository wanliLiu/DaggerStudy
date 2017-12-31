package com.soli.taihe.dagger2.module;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by soli on 30/12/2017.
 */

@Module
public class ApplicationModule {


    @Singleton
    @Provides
    public Gson provideGson() {
        return new Gson();
    }
}
