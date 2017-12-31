package com.soli.taihe.dagger2.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.soli.taihe.dagger2.Poetry;
import com.soli.taihe.dagger2.R;
import com.soli.taihe.dagger2.component.MainComponent;

import javax.inject.Inject;

public class OtherActivity extends AppCompatActivity {

    @Inject
    Poetry mPoetry;

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainComponent.getInstance().inject(this);

        initView();
    }

    private void initView() {
        TextView mTextView = findViewById(R.id.tv_poetry);
        String json = mGson.toJson(mPoetry);
        String text = json + ",mPoetry:" + mPoetry;
        mTextView.setText(text);

        findViewById(R.id.button).setOnClickListener(view1 -> startActivity(new Intent(this, AActivity.class)));
    }

}
