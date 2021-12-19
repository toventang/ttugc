package com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d.b */
public final class C37790b {

    /* renamed from: a */
    public final String f89236a;

    /* renamed from: b */
    public final String f89237b;

    /* renamed from: c */
    public final String f89238c;

    /* renamed from: d */
    public final String f89239d;

    /* renamed from: e */
    public final String f89240e;

    static {
        Covode.recordClassIndex(45237);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37790b)) {
            return false;
        }
        C37790b bVar = (C37790b) obj;
        return C89219l.m154714a(this.f89236a, bVar.f89236a) && C89219l.m154714a(this.f89237b, bVar.f89237b) && C89219l.m154714a(this.f89238c, bVar.f89238c) && C89219l.m154714a(this.f89239d, bVar.f89239d) && C89219l.m154714a(this.f89240e, bVar.f89240e);
    }

    public final int hashCode() {
        String str = this.f89236a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f89237b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f89238c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f89239d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f89240e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CommerceEggLogParam(eggType=" + this.f89236a + ", creativeId=" + this.f89237b + ", logExtra=" + this.f89238c + ", groupId=" + this.f89239d + ", eggId=" + this.f89240e + ")";
    }

    public /* synthetic */ C37790b(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
    }

    public C37790b(String str, String str2, String str3, String str4, String str5) {
        this.f89236a = str;
        this.f89237b = str2;
        this.f89238c = str3;
        this.f89239d = str4;
        this.f89240e = str5;
    }
}
