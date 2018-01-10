package com.example.lxr.rongyun1229;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.rong.imkit.RongIM;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send:
                /**
                 * 启动单聊,先判断RongIM对象不为null
                 * context - 应用上下文。
                 * targetUserId - 要与之聊天的用户 Id。比如Token我用的是120的,那么聊天对象是110,这里就是110(注意110和120都是我已经注册好的用户)
                 * title - 聊天的标题，如果传入空值，则默认显示与之聊天的用户名称。
                 */
                if (RongIM.getInstance() != null) {
                    RongIM.getInstance().startPrivateChat(this,"1002","大美女");
                 //   RongIM.getInstance().startPrivateChat(MainActivity.this,"110","易大师好帅!");
                }


                break;
        }
    }
}
