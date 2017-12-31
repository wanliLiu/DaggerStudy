package com.soli.taihe.dagger2.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.soli.taihe.dagger2.component.MainComponent;
import com.soli.taihe.dagger2.Poetry;
import com.soli.taihe.dagger2.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Poetry mPoetry;

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 使用Dagger2生成的类 生成组件进行构造，并注入
        MainComponent.getInstance().inject(this);

        initView();
    }

    private void initView() {
        TextView view = findViewById(R.id.tv_poetry);
        String json = mGson.toJson(mPoetry);
        view.setText(json);

        findViewById(R.id.button).setOnClickListener(view1 -> startActivity(new Intent(this, OtherActivity.class)));
    }
}
