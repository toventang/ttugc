package com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.b.b */
public final class C34312b {

    /* renamed from: a */
    public final String f81156a;

    /* renamed from: b */
    public final String f81157b;

    /* renamed from: c */
    public final String f81158c;

    static {
        Covode.recordClassIndex(41256);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34312b)) {
            return false;
        }
        C34312b bVar = (C34312b) obj;
        return C89219l.m154714a(this.f81156a, bVar.f81156a) && C89219l.m154714a(this.f81157b, bVar.f81157b) && C89219l.m154714a(this.f81158c, bVar.f81158c);
    }

    public final int hashCode() {
        String str = this.f81156a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81157b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f81158c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DefinedTimingInfo(preTrigger=" + this.f81156a + ", curTrigger=" + this.f81157b + ", intervalName=" + this.f81158c + ")";
    }

    public C34312b(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f81156a = str;
        this.f81157b = str2;
        this.f81158c = str3;
    }
}
