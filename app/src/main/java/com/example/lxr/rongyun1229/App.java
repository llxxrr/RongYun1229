package com.example.lxr.rongyun1229;

import android.app.Application;
import android.util.Log;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

/**
 * Created by lxr on 2017/12/29.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
        String Token = "fkr/bCv630MrP21DBw+b7pOCf7Txt2xnOLRhyd0ExMFUu6NsIz0bnURpVCNphZlOxjn+AIhO6UV7e23q7ogUyQ==";//这个值是我在融云的后台管理中配置好的.你们不能用
         RongIM.connect(Token, new RongIMClient.ConnectCallback() {
             @Override
             public void onTokenIncorrect() {

             }

             @Override
             public void onSuccess(String s) {
                 Log.d("LoginActivity", "--onSuccess" + s);
             }

             @Override
             public void onError(RongIMClient.ErrorCode errorCode) {
                 Log.d("LoginActivity", "--onError" + errorCode);
             }
         });


    }
}
