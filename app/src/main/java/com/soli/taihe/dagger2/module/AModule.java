package com.soli.taihe.dagger2.module;

import com.soli.taihe.dagger2.scope.AScope;
import com.soli.taihe.dagger2.Poetry;

import dagger.Module;
import dagger.Provides;

/**
 * Created by soli on 31/12/2017.
 */

@Module
public class AModule {

    @AScope
    @Provides
    public Poetry getPoetry() {
        return new Poetry("万物美好");
    }
}
