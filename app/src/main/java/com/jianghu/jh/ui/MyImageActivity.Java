package com.jianghu.jh.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jianghu.jh.R;

public class MyImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }
//    boolean isFirstIn = false;
//
//    private static final int GO_HOME = 1000;
//    private static final int GO_GUIDE = 1001;
//    // 延迟3秒
//    private static final long SPLASH_DELAY_MILLIS = 3000;
//
//    private static final String SHAREDPREFERENCES_NAME = "first_pref";
//
//    /**
//     * Handler:跳转到不同界面
//     */
//    private Handler mHandler = new Handler() {
//
//        @Override
//        public void handleMessage(Message msg) {
//            switch (msg.what) {
//            case GO_HOME:
//                goHome();
//                break;
//            case GO_GUIDE:
//                goGuide();
//                break;
//            }
//            super.handleMessage(msg);
//        }
//    };
  
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.splash);
////        init();
//    }
  
//    private void init() {
//        // 读取SharedPreferences中需要的数据
//        // 使用SharedPreferences来记录程序的使用次数
//        SharedPreferences preferences = getSharedPreferences(
//                SHAREDPREFERENCES_NAME, MODE_PRIVATE);
//
//        // 取得相应的值，如果没有该值，说明还未写入，用true作为默认值
//        isFirstIn = preferences.getBoolean("isFirstIn", true);
//
//        // 判断程序与第几次运行，如果是第一次运行则跳转到引导界面，否则跳转到主界面
//        if (!isFirstIn) {
//            // 使用Handler的postDelayed方法，3秒后执行跳转到MainActivity
//            mHandler.sendEmptyMessageDelayed(GO_HOME, SPLASH_DELAY_MILLIS);
//        } else {
//            mHandler.sendEmptyMessageDelayed(GO_GUIDE, SPLASH_DELAY_MILLIS);
//        }
//
//    }
//
//    private void goHome() {
//        Intent intent = new Intent(MyImageActivity.this, MainActivity.class);
//        MyImageActivity.this.startActivity(intent);
//        MyImageActivity.this.finish();
//    }
//
//    private void goGuide() {
//        Intent intent = new Intent(MyImageActivity.this, MainActivity.class);
//        MyImageActivity.this.startActivity(intent);
//        MyImageActivity.this.finish();
//    }
}  
