package com.soli.taihe.dagger2.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.soli.taihe.dagger2.MainComponent;
import com.soli.taihe.dagger2.Poetry;
import com.soli.taihe.dagger2.R;

import javax.inject.Inject;

public class OtherActivity extends AppCompatActivity {

    @Inject
    Poetry mPoetry;

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        MainComponent.getInstance().inject(this);

        initView();
    }

    private void initView() {
        TextView mTextView = findViewById(R.id.tv_poetry_other);
        String json = mGson.toJson(mPoetry);
        String text = json + ",mPoetry:" + mPoetry;
        mTextView.setText(text);
    }

}
