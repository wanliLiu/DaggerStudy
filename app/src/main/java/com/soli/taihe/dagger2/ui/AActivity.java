package com.soli.taihe.dagger2.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.soli.taihe.dagger2.Poetry;
import com.soli.taihe.dagger2.R;
import com.soli.taihe.dagger2.scope.PoetryQualifier;

import javax.inject.Inject;

/**
 * Created by soli on 31/12/2017.
 */

public class AActivity extends AppCompatActivity {

    @PoetryQualifier("A")
    @Inject
    Poetry mPoetry;

    @PoetryQualifier("B")
    @Inject
    Poetry mPoetryB;

    @Inject
    Gson mGson;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        MainApplication.getInstance().getAComponent().inject(this);

        initView();
    }


    private void initView() {
        TextView view = findViewById(R.id.tv_poetry_other);
        String text = mPoetry.getPemo() + ",mPoetryA:" + mPoetry + mPoetryB.getPemo() +
                ",mPoetryB:" + mPoetryB + (mGson == null ? "Gson没被注入" : "Gson已经被注入");

        view.setText(text);
    }
}
