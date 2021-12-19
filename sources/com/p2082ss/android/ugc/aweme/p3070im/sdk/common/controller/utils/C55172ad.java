package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad */
public final class C55172ad implements InputFilter {

    /* renamed from: a */
    private final int f126226a = 6000;

    /* renamed from: b */
    private final View f126227b;

    static {
        Covode.recordClassIndex(64917);
    }

    public C55172ad(View view) {
        this.f126227b = view;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f126226a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            new C23144b(this.f126227b).mo37635a(C17867d.m33078a().getResources().getString(R.string.cey)).mo37637b();
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (!Character.isHighSurrogate(charSequence.charAt(i5 - 1)) || i5 - 1 != i) {
                return charSequence.subSequence(i, i5);
            }
            new C23144b(this.f126227b).mo37635a(C17867d.m33078a().getResources().getString(R.string.cey)).mo37637b();
            return "";
        }
    }
}
