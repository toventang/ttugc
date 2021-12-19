package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.m */
public final class C44784m {

    /* renamed from: a */
    public final CharSequence f104488a;

    /* renamed from: b */
    public final String f104489b;

    static {
        Covode.recordClassIndex(53170);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44784m)) {
            return false;
        }
        C44784m mVar = (C44784m) obj;
        return C89219l.m154714a(this.f104488a, mVar.f104488a) && C89219l.m154714a(this.f104489b, mVar.f104489b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f104488a;
        int i = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        String str = this.f104489b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProductTextVO(text=" + this.f104488a + ", style=" + this.f104489b + ")";
    }

    public C44784m(CharSequence charSequence, String str) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(str, "");
        this.f104488a = charSequence;
        this.f104489b = str;
    }
}
