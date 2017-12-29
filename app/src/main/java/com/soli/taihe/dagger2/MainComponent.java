package com.soli.taihe.dagger2;

import com.soli.taihe.dagger2.ui.MainActivity;
import com.soli.taihe.dagger2.ui.OtherActivity;

import dagger.Component;

/**
 * 用@Component表示这个接口是一个连接器，能用@Component注解的只
 * 能是interface或者抽象类
 *
 * @author Soli
 * @Time 2017/12/29
 */
//这里表示Component会从MainModule类中拿那些用@Provides注解的方法来生成需要注入的实例
@Component(modules = {MainModule.class, PoetryModule.class})
public abstract class MainComponent {

    /**
     * 需要用到这个连接器的对象，就是这个对象里面有需要注入的属性
     * （被标记为@Inject的属性）
     * 这里inject表示注入的意思，这个方法名可以随意更改，但建议就
     * 用inject即可。
     */
    public abstract void inject(MainActivity activity);

    public abstract void inject(OtherActivity activity);

    private static MainComponent component;

    /**
     * @return
     */
    public static MainComponent getInstance() {
        if (component == null)
            component = DaggerMainComponent.create();

        return component;
    }
}
