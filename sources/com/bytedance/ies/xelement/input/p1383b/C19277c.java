package com.bytedance.ies.xelement.input.p1383b;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.input.b.c */
public final class C19277c extends Editable.Factory {

    /* renamed from: a */
    private final NoCopySpan[] f45556a;

    static {
        Covode.recordClassIndex(22056);
    }

    public C19277c(NoCopySpan... noCopySpanArr) {
        C89219l.m154719c(noCopySpanArr, "");
        this.f45556a = noCopySpanArr;
    }

    public final Editable newEditable(CharSequence charSequence) {
        C89219l.m154719c(charSequence, "");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (NoCopySpan noCopySpan : this.f45556a) {
            valueOf.setSpan(noCopySpan, 0, charSequence.length(), 18);
        }
        C89219l.m154709a((Object) valueOf, "");
        return valueOf;
    }
}
