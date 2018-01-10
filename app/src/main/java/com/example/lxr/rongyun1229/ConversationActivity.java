package com.example.lxr.rongyun1229;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by lxr on 2017/12/29.
 */

public class ConversationActivity extends ActionBarActivity {
    private static final String TAG = ConversationActivity.class.getSimpleName();
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //唯一有用的代码，加载一个 layout
        setContentView(R.layout.conversation);
        //继承的是ActionBarActivity，直接调用 自带的 Actionbar，下面是Actionbar 的配置，如果不用可忽略…
        getSupportActionBar().setTitle("聊天");
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);//把它改成我们有的图片
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//是否在左上角显示图标
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);//把它改成我们有的图片
    }
/*    @Override
    菜单我们用不到,注释掉.
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }*/
}

