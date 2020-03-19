package com.example.matchlinehighttextview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;

import androidx.appcompat.app.AppCompatActivity;

import com.example.matchlinehighttextview.widget.LineHightTextView;

public class LineHeightTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_height_text_view);
        LineHightTextView mTvLineHeight = findViewById(R.id.tv_line_height);
        mTvLineHeight.setWrapperText("这里面所有的我们都可以使用，括号后面的内容是为了描述该模板的，你也可以取消前面的勾选来取消该模板其实系统预设的有很多都是很实用的，有兴趣的可以去试一试，不多说。");
    }

    public static void startLineHeightTextViewActivity(Context context) {
        Intent intent = new Intent(context, LineHeightTextViewActivity.class);
        context.startActivity(intent);
    }
}
