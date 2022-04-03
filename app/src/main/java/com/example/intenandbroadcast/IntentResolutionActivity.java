package com.example.intenandbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentResolutionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_resolution);

        Button button = (Button)findViewById(R.id.button_hidden_intent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.intenandbroadcast.ACTION_START");
                intent.addCategory("com.example.intenandbroadcast.MY_GATEGORY");
                startActivity(intent);
            }
        });
    }
}