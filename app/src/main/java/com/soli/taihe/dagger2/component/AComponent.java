package com.soli.taihe.dagger2.component;

import com.soli.taihe.dagger2.scope.AScope;
import com.soli.taihe.dagger2.module.AModule;
import com.soli.taihe.dagger2.ui.AActivity;

import dagger.Subcomponent;

/**
 * Created by soli on 31/12/2017.
 */

@AScope
@Subcomponent(modules = AModule.class)
public interface AComponent {

    void inject(AActivity aActivity);
}
