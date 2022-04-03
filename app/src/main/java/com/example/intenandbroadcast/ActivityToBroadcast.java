package com.example.intenandbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityToBroadcast extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_broadcast);

        EditText editText = (EditText) findViewById(R.id.edit_text_send);
        Button button = (Button) findViewById(R.id.Send_BroadCast);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.intenandbroadcast.ACTION_BROADCAST");
                String text = editText.getText().toString();
                intent.putExtra("broadcast",text);
                //Android8.0之后：
                // 设置包名后可以接收到自定义广播信息
                intent.setPackage(getPackageName());
                //设定component后也可收到广播信息
                //intent.setComponent(new ComponentName(getPackageName(),"com.example.intenandbroadcast.testReceiver"));
                //如这两条指令都没有将无法收到自定义广播信息。
                sendBroadcast(intent);
            }
        });
    }
}