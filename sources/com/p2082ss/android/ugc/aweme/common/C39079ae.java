package com.p2082ss.android.ugc.aweme.common;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.common.ae */
public final class C39079ae implements InputFilter {
    static {
        Covode.recordClassIndex(46695);
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C89219l.m154721d(charSequence, "");
        String obj = charSequence.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        if (!TextUtils.isEmpty(C89361p.m154910b((CharSequence) obj).toString()) || charSequence.length() <= 0 || i3 != 0) {
            return null;
        }
        return "";
    }
}
