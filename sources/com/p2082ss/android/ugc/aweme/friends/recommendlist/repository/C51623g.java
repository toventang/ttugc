package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.g */
public final class C51623g {

    /* renamed from: a */
    public final Integer f118928a;

    /* renamed from: b */
    public final Integer f118929b;

    /* renamed from: c */
    public final String f118930c;

    /* renamed from: d */
    public final int f118931d;

    /* renamed from: e */
    public final Integer f118932e;

    /* renamed from: f */
    public final Integer f118933f;

    /* renamed from: g */
    public final String f118934g;

    /* renamed from: h */
    public final String f118935h = null;

    /* renamed from: i */
    public final Integer f118936i;

    /* renamed from: j */
    public final String f118937j;

    static {
        Covode.recordClassIndex(60966);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51623g)) {
            return false;
        }
        C51623g gVar = (C51623g) obj;
        return C89219l.m154714a(this.f118928a, gVar.f118928a) && C89219l.m154714a(this.f118929b, gVar.f118929b) && C89219l.m154714a(this.f118930c, gVar.f118930c) && this.f118931d == gVar.f118931d && C89219l.m154714a(this.f118932e, gVar.f118932e) && C89219l.m154714a(this.f118933f, gVar.f118933f) && C89219l.m154714a(this.f118934g, gVar.f118934g) && C89219l.m154714a(this.f118935h, gVar.f118935h) && C89219l.m154714a(this.f118936i, gVar.f118936i) && C89219l.m154714a(this.f118937j, gVar.f118937j);
    }

    public final int hashCode() {
        Integer num = this.f118928a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f118929b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f118930c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f118931d) * 31;
        Integer num3 = this.f118932e;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f118933f;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f118934g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f118935h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.f118936i;
        int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str4 = this.f118937j;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "RecommendListRequestParams(count=" + this.f118928a + ", cursor=" + this.f118929b + ", targetUserId=" + this.f118930c + ", recommendType=" + this.f118931d + ", yellowPointCount=" + this.f118932e + ", addressBookAccess=" + this.f118933f + ", recImprUsers=" + this.f118934g + ", pushUserId=" + this.f118935h + ", moonAccess=" + this.f118936i + ", secTargetUserId=" + this.f118937j + ")";
    }

    public C51623g(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        this.f118928a = num;
        this.f118929b = num2;
        this.f118930c = str;
        this.f118931d = i;
        this.f118932e = num3;
        this.f118933f = num4;
        this.f118934g = str2;
        this.f118936i = num5;
        this.f118937j = str3;
    }
}
