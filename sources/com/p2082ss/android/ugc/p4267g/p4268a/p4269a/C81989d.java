package com.p2082ss.android.ugc.p4267g.p4268a.p4269a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.g.a.a.d */
public final class C81989d {

    /* renamed from: a */
    public final String f183478a;

    /* renamed from: b */
    public final String f183479b;

    static {
        Covode.recordClassIndex(95804);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81989d)) {
            return false;
        }
        C81989d dVar = (C81989d) obj;
        return C89219l.m154714a(this.f183478a, dVar.f183478a) && C89219l.m154714a(this.f183479b, dVar.f183479b);
    }

    public final int hashCode() {
        String str = this.f183478a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f183479b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LocalParam(topActivity=" + this.f183478a + ", topPage=" + this.f183479b + ")";
    }

    public C81989d(String str, String str2) {
        this.f183478a = str;
        this.f183479b = str2;
    }
}
