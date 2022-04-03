package com.example.intenandbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class testReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String text = intent.getStringExtra("broadcast");
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}