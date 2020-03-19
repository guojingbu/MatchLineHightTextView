package com.example.matchlinehighttextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
    }

    public static void startTextViewActivity(Context context) {
        Intent intent = new Intent(context, TextViewActivity.class);
        context.startActivity(intent);
    }
}
