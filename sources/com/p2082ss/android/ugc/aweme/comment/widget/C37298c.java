package com.p2082ss.android.ugc.aweme.comment.widget;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.c */
public final class C37298c implements InputFilter {

    /* renamed from: a */
    private final int f87972a;

    static {
        Covode.recordClassIndex(44668);
    }

    public C37298c(int i) {
        this.f87972a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f87972a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                new C79459a(C51427a.f118503a).mo123052a(C51427a.f118503a.getResources().getString(R.string.fin, Integer.valueOf(this.f87972a))).mo123053a();
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (!Character.isHighSurrogate(charSequence.charAt(i5 - 1)) || i5 - 1 != i) {
                new C79459a(C51427a.f118503a).mo123052a(C51427a.f118503a.getResources().getString(R.string.fin, Integer.valueOf(this.f87972a))).mo123053a();
                return charSequence.subSequence(i, i5);
            }
            new C79459a(C51427a.f118503a).mo123052a(C51427a.f118503a.getResources().getString(R.string.fin, Integer.valueOf(this.f87972a))).mo123053a();
            return "";
        }
    }
}
