package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.a */
public final class C64347a {

    /* renamed from: a */
    public String f145875a = null;

    /* renamed from: b */
    public String f145876b = null;

    /* renamed from: c */
    public final String f145877c;

    /* renamed from: d */
    public final String f145878d;

    /* renamed from: e */
    public String f145879e;

    /* renamed from: f */
    public int f145880f;

    /* renamed from: g */
    public int f145881g;

    static {
        Covode.recordClassIndex(75801);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64347a)) {
            return false;
        }
        C64347a aVar = (C64347a) obj;
        return C89219l.m154714a(this.f145875a, aVar.f145875a) && C89219l.m154714a(this.f145876b, aVar.f145876b) && C89219l.m154714a(this.f145877c, aVar.f145877c) && C89219l.m154714a(this.f145878d, aVar.f145878d) && C89219l.m154714a(this.f145879e, aVar.f145879e) && this.f145880f == aVar.f145880f && this.f145881g == aVar.f145881g;
    }

    public final int hashCode() {
        String str = this.f145875a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f145876b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f145877c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f145878d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f145879e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.f145880f) * 31) + this.f145881g;
    }

    public final String toString() {
        return "ChainInfo(uniqueId=" + this.f145875a + ", nickname=" + this.f145876b + ", userId=" + this.f145877c + ", secUid=" + this.f145878d + ", aid=" + this.f145879e + ", privateStatus=" + this.f145880f + ", isPrivateAccount=" + this.f145881g + ")";
    }

    public C64347a(String str, String str2) {
        this.f145877c = str;
        this.f145878d = str2;
        this.f145879e = null;
        this.f145880f = 0;
        this.f145881g = 0;
    }
}
