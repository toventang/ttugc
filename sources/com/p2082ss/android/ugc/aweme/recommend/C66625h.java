package com.p2082ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.h */
public final class C66625h {

    /* renamed from: a */
    public final String f149764a;

    /* renamed from: b */
    public final String f149765b;

    /* renamed from: c */
    public final String f149766c;

    static {
        Covode.recordClassIndex(78183);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66625h)) {
            return false;
        }
        C66625h hVar = (C66625h) obj;
        return C89219l.m154714a(this.f149764a, hVar.f149764a) && C89219l.m154714a(this.f149765b, hVar.f149765b) && C89219l.m154714a(this.f149766c, hVar.f149766c);
    }

    public final int hashCode() {
        String str = this.f149764a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149765b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f149766c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "RecommendMobParams(enterFrom=" + this.f149764a + ", previousPage=" + this.f149765b + ", pageStatus=" + this.f149766c + ")";
    }

    public /* synthetic */ C66625h() {
        this("", "", "");
    }

    public C66625h(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f149764a = str;
        this.f149765b = str2;
        this.f149766c = str3;
    }
}
