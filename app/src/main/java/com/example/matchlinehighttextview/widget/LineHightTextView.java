package com.example.matchlinehighttextview.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LineHightTextView extends TextView {
    public LineHightTextView(Context context) {
        super(context);
    }

    public LineHightTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LineHightTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 排除每行文字间的padding
     *
     * @param text
     */
    public void setWrapperText(CharSequence text) {
        if (text == null) {
            return;
        }
        // 获得视觉定义的每行文字的行高
        int lineHeight = (int) getTextSize();
        SpannableStringBuilder ssb;
        if (text instanceof SpannableStringBuilder) {
            ssb = (SpannableStringBuilder) text;
            ssb.setSpan(new ExcludeInnerLineSpaceSpan(lineHeight), 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else {
            ssb = new SpannableStringBuilder(text);
            ssb.setSpan(new ExcludeInnerLineSpaceSpan(lineHeight), 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        setText(ssb);
    }
}
