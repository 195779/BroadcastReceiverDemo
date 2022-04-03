package com.example.intenandbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityCommunication extends BaseActivity {

    private static final int SUBACTIVITY1 = 1;
    private static final int SUBACTIVITY2 = 2;

    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

        textView = (TextView) findViewById(R.id.textShow);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCommunication.this, SubActivity1.class);
                startActivityForResult(intent, SUBACTIVITY1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCommunication.this, SubActivity2.class);
                startActivityForResult(intent, SUBACTIVITY2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            /*requestcode：我们在启动活动的时候传入的请求码，用requestcode的值判断数据的来源*/
            case SUBACTIVITY1:
                if (resultCode == RESULT_OK) {
                    /*resultCode：返回数据时是否成功*/
                    Uri uriData = data.getData();
                    /*获取intent携带的数据*/
                    textView.setText(uriData.toString());
                }
                break;
            case SUBACTIVITY2:
                break;
        }
    }

}
