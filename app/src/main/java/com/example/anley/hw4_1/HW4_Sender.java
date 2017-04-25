package com.example.anley.hw4_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.os.Build;

public class HW4_Sender extends AppCompatActivity {

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw4__sender);
        Button btn = (Button)findViewById(R.id.BTN);
        btn.setOnClickListener(notification);
        et = (EditText)findViewById(R.id.input);
    }
    private OnClickListener notification = new OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setAction("4Notification");
            String msg = et.getEditableText().toString();
            intent.putExtra("Name", msg);
            sendBroadcast(intent);
        }
    };
}
