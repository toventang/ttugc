package com.p2082ss.android.ugc.aweme.search.p3700n;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.n.f */
public final class C67694f {

    /* renamed from: a */
    public int f151723a;

    /* renamed from: b */
    public String f151724b;

    /* renamed from: c */
    public String f151725c;

    /* renamed from: d */
    public String f151726d;

    static {
        Covode.recordClassIndex(79339);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67694f)) {
            return false;
        }
        C67694f fVar = (C67694f) obj;
        return this.f151723a == fVar.f151723a && C89219l.m154714a(this.f151724b, fVar.f151724b) && C89219l.m154714a(this.f151725c, fVar.f151725c) && C89219l.m154714a(this.f151726d, fVar.f151726d);
    }

    public final int hashCode() {
        int i = this.f151723a * 31;
        String str = this.f151724b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f151725c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f151726d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SearchMutableData(tabIndex=" + this.f151723a + ", searchPosition=" + this.f151724b + ", searchId=" + this.f151725c + ", searchKeyword=" + this.f151726d + ")";
    }

    public /* synthetic */ C67694f() {
        this("", "", "");
    }

    /* renamed from: a */
    public final void mo106797a(String str) {
        C89219l.m154721d(str, "");
        this.f151725c = str;
    }

    /* renamed from: b */
    public final void mo106798b(String str) {
        C89219l.m154721d(str, "");
        this.f151726d = str;
    }

    private C67694f(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f151723a = 0;
        this.f151724b = str;
        this.f151725c = str2;
        this.f151726d = str3;
    }
}
