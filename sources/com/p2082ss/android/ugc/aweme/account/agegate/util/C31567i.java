package com.p2082ss.android.ugc.aweme.account.agegate.util;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31546g;
import java.util.regex.Pattern;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.i */
public final class C31567i implements InputFilter {

    /* renamed from: a */
    private final C31546g[] f75507a;

    /* renamed from: b */
    private final AbstractC89172b<Integer, C89391z> f75508b;

    static {
        Covode.recordClassIndex(38286);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C31567i(C31546g[] gVarArr, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(gVarArr, "");
        C89219l.m154721d(bVar, "");
        this.f75507a = gVarArr;
        this.f75508b = bVar;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String str;
        if (charSequence == null || (str = charSequence.subSequence(i, i2).toString()) == null) {
            str = "";
        }
        CharSequence a = spanned != null ? C89361p.m154893a(spanned, i3, i4, str) : null;
        C31546g[] gVarArr = this.f75507a;
        for (C31546g gVar : gVarArr) {
            if (!Pattern.compile(gVar.f75450a).matcher(a).matches()) {
                this.f75508b.invoke(Integer.valueOf(gVar.f75451b));
                if (spanned != null) {
                    return spanned.subSequence(i3, i4);
                }
                return null;
            }
        }
        return null;
    }
}
