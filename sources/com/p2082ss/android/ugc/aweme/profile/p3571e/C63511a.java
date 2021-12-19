package com.p2082ss.android.ugc.aweme.profile.p3571e;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.e.a */
public final class C63511a {

    /* renamed from: a */
    public final String f144137a;

    /* renamed from: b */
    public final String f144138b;

    static {
        Covode.recordClassIndex(74819);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63511a)) {
            return false;
        }
        C63511a aVar = (C63511a) obj;
        return C89219l.m154714a(this.f144137a, aVar.f144137a) && C89219l.m154714a(this.f144138b, aVar.f144138b);
    }

    public final int hashCode() {
        String str = this.f144137a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f144138b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AnalyticsMetadata(enterFrom=" + this.f144137a + ", enterMethod=" + this.f144138b + ")";
    }

    public C63511a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f144137a = str;
        this.f144138b = str2;
    }
}
