package com.bytedance.android.live.design.widget;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.widget.d */
public final class C4129d implements InputFilter {

    /* renamed from: a */
    private final View f11531a;

    static {
        Covode.recordClassIndex(4688);
    }

    public C4129d(View view) {
        this.f11531a = view;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.f11531a.isInEditMode() && (charSequence instanceof String)) {
            return C4054a.m9854a((String) charSequence);
        }
        return charSequence;
    }
}
