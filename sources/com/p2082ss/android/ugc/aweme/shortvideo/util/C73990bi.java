package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bi */
public final class C73990bi {

    /* renamed from: a */
    public static final C73990bi f166083a = new C73990bi();

    private C73990bi() {
    }

    static {
        Covode.recordClassIndex(86740);
    }

    /* renamed from: a */
    public static final void m130127a(TextView textView, int i) {
        int fontMetricsInt;
        if (textView != null && textView.getPaint() != null && i != (fontMetricsInt = textView.getPaint().getFontMetricsInt(null))) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }
}
