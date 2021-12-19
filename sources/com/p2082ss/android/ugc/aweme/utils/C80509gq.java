package com.p2082ss.android.ugc.aweme.utils;

import android.os.Build;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.gq */
public final class C80509gq {
    static {
        Covode.recordClassIndex(93782);
    }

    /* renamed from: a */
    public static final void m139525a(TextView textView) {
        int i;
        if (textView != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean a = C80471gb.m139483a(textView.getContext());
            textView.setTextDirection(2);
            if (a) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i);
        }
    }
}
