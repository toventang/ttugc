package com.p2082ss.android.ugc.aweme.account.bean;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.bean.d */
public final class C31597d {

    /* renamed from: a */
    public final String f75558a;

    /* renamed from: b */
    public final int f75559b;

    /* renamed from: c */
    public final String f75560c;

    static {
        Covode.recordClassIndex(38324);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31597d)) {
            return false;
        }
        C31597d dVar = (C31597d) obj;
        return C89219l.m154714a(this.f75558a, dVar.f75558a) && this.f75559b == dVar.f75559b && C89219l.m154714a(this.f75560c, dVar.f75560c);
    }

    public final int hashCode() {
        String str = this.f75558a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f75559b) * 31;
        String str2 = this.f75560c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PlatformInfo(name=" + this.f75558a + ", iconResID=" + this.f75559b + ", type=" + this.f75560c + ")";
    }

    public C31597d(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f75558a = str;
        this.f75559b = i;
        this.f75560c = str2;
    }
}
