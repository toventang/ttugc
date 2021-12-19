package com.p2082ss.android.ugc.aweme.recommend.viewmodel;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.a */
public final class C66760a {

    /* renamed from: a */
    public final String f149955a;

    /* renamed from: b */
    public final String f149956b;

    /* renamed from: c */
    public final String f149957c;

    static {
        Covode.recordClassIndex(78331);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66760a)) {
            return false;
        }
        C66760a aVar = (C66760a) obj;
        return C89219l.m154714a(this.f149955a, aVar.f149955a) && C89219l.m154714a(this.f149956b, aVar.f149956b) && C89219l.m154714a(this.f149957c, aVar.f149957c);
    }

    public final int hashCode() {
        String str = this.f149955a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149956b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f149957c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "RecommendMobParams(enterFrom=" + this.f149955a + ", previousPage=" + this.f149956b + ", pageStatus=" + this.f149957c + ")";
    }

    public /* synthetic */ C66760a() {
        this("", "", "");
    }

    public C66760a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f149955a = str;
        this.f149956b = str2;
        this.f149957c = str3;
    }
}
