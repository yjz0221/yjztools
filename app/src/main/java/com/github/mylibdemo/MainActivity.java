package com.github.mylibdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.yjz.tools.popwindow.YjzWrapPopWindow;


public class MainActivity extends AppCompatActivity {

    private Button btnRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRequest = findViewById(R.id.btnRequest);


        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopBottom();
            }
        });
    }


    private void showPopBottom(){
        YjzWrapPopWindow popWindow = new YjzWrapPopWindow.PopupWindowBuilder(this)
                .setView(R.layout.pop_test)
                .setFocusable(true)
                .setOutsideTouchable(true)
                .create();

        popWindow.showAsDropDown(btnRequest,0,10);
    }

}