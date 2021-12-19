package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.i */
public final class C51626i {

    /* renamed from: a */
    public final Integer f118939a;

    /* renamed from: b */
    public final Integer f118940b;

    /* renamed from: c */
    public final String f118941c;

    /* renamed from: d */
    public final int f118942d;

    /* renamed from: e */
    public final Integer f118943e;

    /* renamed from: f */
    public final Integer f118944f;

    /* renamed from: g */
    public final String f118945g;

    /* renamed from: h */
    public final String f118946h = null;

    /* renamed from: i */
    public final Integer f118947i;

    /* renamed from: j */
    public final String f118948j;

    static {
        Covode.recordClassIndex(60969);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51626i)) {
            return false;
        }
        C51626i iVar = (C51626i) obj;
        return C89219l.m154714a(this.f118939a, iVar.f118939a) && C89219l.m154714a(this.f118940b, iVar.f118940b) && C89219l.m154714a(this.f118941c, iVar.f118941c) && this.f118942d == iVar.f118942d && C89219l.m154714a(this.f118943e, iVar.f118943e) && C89219l.m154714a(this.f118944f, iVar.f118944f) && C89219l.m154714a(this.f118945g, iVar.f118945g) && C89219l.m154714a(this.f118946h, iVar.f118946h) && C89219l.m154714a(this.f118947i, iVar.f118947i) && C89219l.m154714a(this.f118948j, iVar.f118948j);
    }

    public final int hashCode() {
        Integer num = this.f118939a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f118940b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f118941c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f118942d) * 31;
        Integer num3 = this.f118943e;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f118944f;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f118945g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f118946h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.f118947i;
        int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str4 = this.f118948j;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "RecommendListUserRequestParams(count=" + this.f118939a + ", cursor=" + this.f118940b + ", targetUserId=" + this.f118941c + ", recommendType=" + this.f118942d + ", yellowPointCount=" + this.f118943e + ", addressBookAccess=" + this.f118944f + ", recImprUsers=" + this.f118945g + ", pushUserId=" + this.f118946h + ", moonAccess=" + this.f118947i + ", secTargetUserId=" + this.f118948j + ")";
    }

    public C51626i(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        this.f118939a = num;
        this.f118940b = num2;
        this.f118941c = str;
        this.f118942d = i;
        this.f118943e = num3;
        this.f118944f = num4;
        this.f118945g = str2;
        this.f118947i = num5;
        this.f118948j = str3;
    }
}
