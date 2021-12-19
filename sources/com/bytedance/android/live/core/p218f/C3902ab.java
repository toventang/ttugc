package com.bytedance.android.live.core.p218f;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.ab */
public final class C3902ab {
    static {
        Covode.recordClassIndex(4431);
    }

    /* renamed from: a */
    public static SpannableString m9532a(String str, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(0.6777f), i, i2, 18);
        return spannableString;
    }
}
