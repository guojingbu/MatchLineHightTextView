package com.example.matchlinehighttextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnTextView;
    private Button mBtnLineHeightView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnLineHeightView = findViewById(R.id.btn_lineheightview);
        mBtnTextView.setOnClickListener(this);
        mBtnLineHeightView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_textview:
                TextViewActivity.startTextViewActivity(this);
                break;
            case R.id.btn_lineheightview:
                LineHeightTextViewActivity.startLineHeightTextViewActivity(this);
                break;
            default:

                break;
        }
    }
}
