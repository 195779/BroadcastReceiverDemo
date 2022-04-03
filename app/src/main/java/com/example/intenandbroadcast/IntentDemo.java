package com.example.intenandbroadcast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentDemo extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);

        Button button_intentDemo = (Button)findViewById(R.id.button_intentActivity);
        button_intentDemo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(IntentDemo.this, ActivityStart.class);
                startActivity(intent);
            }
        });

        Button button_activityCommunication = (Button)findViewById(R.id.button_ActivityCommunication);
        button_activityCommunication.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(IntentDemo.this, ActivityCommunication.class);
                startActivity(intent);
            }
        });


        Button button_activity_intent_resolution = (Button) findViewById(R.id.button_activity_intent_resolution);
        button_activity_intent_resolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntentDemo.this,IntentResolutionActivity.class));
            }
        });

        Button button_sendBroadCast = (Button)findViewById(R.id.button_broadcast);
        button_sendBroadCast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntentDemo.this,ActivityToBroadcast.class));
            }
        });

    }
}