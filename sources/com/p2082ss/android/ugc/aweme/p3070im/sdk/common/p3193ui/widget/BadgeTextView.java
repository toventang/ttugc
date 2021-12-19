package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.BadgeTextView */
public class BadgeTextView extends TuxTextView {
    static {
        Covode.recordClassIndex(65061);
    }

    public void setBadgeCount(int i) {
        String str = null;
        if (i >= 0) {
            if (i > 99) {
                str = "99+";
            } else if (i > 0 && i <= 99) {
                str = String.valueOf(i);
            }
        }
        setText(str);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null || charSequence.toString().equalsIgnoreCase("0")) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }
}
