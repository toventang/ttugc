package com.p2082ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.repository.a */
public final class C51110a {

    /* renamed from: a */
    public final String f117939a;

    /* renamed from: b */
    public final String f117940b;

    /* renamed from: c */
    public final long f117941c;

    /* renamed from: d */
    public final int f117942d;

    /* renamed from: e */
    public final int f117943e;

    /* renamed from: f */
    public final int f117944f;

    /* renamed from: g */
    public final int f117945g;

    /* renamed from: h */
    public final int f117946h;

    /* renamed from: i */
    public final int f117947i;

    static {
        Covode.recordClassIndex(60308);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51110a)) {
            return false;
        }
        C51110a aVar = (C51110a) obj;
        return C89219l.m154714a(this.f117939a, aVar.f117939a) && C89219l.m154714a(this.f117940b, aVar.f117940b) && this.f117941c == aVar.f117941c && this.f117942d == aVar.f117942d && this.f117943e == aVar.f117943e && this.f117944f == aVar.f117944f && this.f117945g == aVar.f117945g && this.f117946h == aVar.f117946h && this.f117947i == aVar.f117947i;
    }

    public final String toString() {
        return "FollowRelationQueryParam(userId=" + this.f117939a + ", secUserId=" + this.f117940b + ", maxTime=" + this.f117941c + ", count=" + this.f117942d + ", offset=" + this.f117943e + ", sourceType=" + this.f117944f + ", addressBookAccess=" + this.f117945g + ", vcdCount=" + this.f117946h + ", afterVcdAuthorize=" + this.f117947i + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f117939a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f117940b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f117941c;
        return ((((((((((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f117942d) * 31) + this.f117943e) * 31) + this.f117944f) * 31) + this.f117945g) * 31) + this.f117946h) * 31) + this.f117947i;
    }

    public /* synthetic */ C51110a(String str, String str2, long j, int i, int i2, int i3, int i4) {
        this(str, str2, j, 20, i, i2, i3, i4, 0);
    }

    public C51110a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f117939a = str;
        this.f117940b = str2;
        this.f117941c = j;
        this.f117942d = 20;
        this.f117943e = i2;
        this.f117944f = i3;
        this.f117945g = i4;
        this.f117946h = i5;
        this.f117947i = i6;
    }
}
