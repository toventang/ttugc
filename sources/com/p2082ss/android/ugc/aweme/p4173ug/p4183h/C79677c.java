package com.p2082ss.android.ugc.aweme.p4173ug.p4183h;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.h.c */
public final class C79677c {
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: a */
    public final String f178786a;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: b */
    public final String f178787b;

    static {
        Covode.recordClassIndex(92893);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79677c)) {
            return false;
        }
        C79677c cVar = (C79677c) obj;
        return C89219l.m154714a(this.f178786a, cVar.f178786a) && C89219l.m154714a(this.f178787b, cVar.f178787b);
    }

    public final int hashCode() {
        String str = this.f178786a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f178787b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UgcPermission(desc=" + this.f178786a + ", url=" + this.f178787b + ")";
    }
}
