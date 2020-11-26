package com.example.android_projcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.android_projcet.component.LifeCycleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout llActivity;
    private LinearLayout llService;
    private LinearLayout llBroadcast;
    private LinearLayout llContentProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initOnClick();
    }

    private void init() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//版本判断
            Window window = getWindow();
            // Translucent status bar
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//设置statusbar应用所占的屏幕扩大到全屏，但是最顶上会有背景透明的状态栏，它的文字可能会盖着你的应用的标题栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        llActivity = findViewById(R.id.ll_activity);
        llService = findViewById(R.id.ll_service);
        llBroadcast = findViewById(R.id.ll_broadcast);
        llContentProvider = findViewById(R.id.ll_content_provider);

    }

    private void initOnClick() {
        llActivity.setOnClickListener(this);
        llService.setOnClickListener(this);
        llBroadcast.setOnClickListener(this);
        llContentProvider.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_activity:
                startActivity(new Intent(this, LifeCycleActivity.class));
                break;
            case R.id.ll_service:

                break;
            case R.id.ll_broadcast:

                break;
            case R.id.ll_content_provider:

                break;
            default:
                break;

        }
    }
}