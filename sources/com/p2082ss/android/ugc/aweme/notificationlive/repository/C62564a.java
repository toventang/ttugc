package com.p2082ss.android.ugc.aweme.notificationlive.repository;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.repository.a */
public final class C62564a {

    /* renamed from: a */
    public final String f141886a;

    /* renamed from: b */
    public final String f141887b;

    /* renamed from: c */
    public final long f141888c;

    /* renamed from: d */
    public final int f141889d = 20;

    /* renamed from: e */
    public final int f141890e;

    /* renamed from: f */
    public final int f141891f;

    /* renamed from: g */
    public final int f141892g;

    /* renamed from: h */
    public final int f141893h;

    /* renamed from: i */
    public final int f141894i;

    static {
        Covode.recordClassIndex(73361);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62564a)) {
            return false;
        }
        C62564a aVar = (C62564a) obj;
        return C89219l.m154714a(this.f141886a, aVar.f141886a) && C89219l.m154714a(this.f141887b, aVar.f141887b) && this.f141888c == aVar.f141888c && this.f141889d == aVar.f141889d && this.f141890e == aVar.f141890e && this.f141891f == aVar.f141891f && this.f141892g == aVar.f141892g && this.f141893h == aVar.f141893h && this.f141894i == aVar.f141894i;
    }

    public final String toString() {
        return "FollowRelationQueryParam(userId=" + this.f141886a + ", secUserId=" + this.f141887b + ", maxTime=" + this.f141888c + ", count=" + this.f141889d + ", offset=" + this.f141890e + ", sourceType=" + this.f141891f + ", addressBookAccess=" + this.f141892g + ", vcdCount=" + this.f141893h + ", afterVcdAuthorize=" + this.f141894i + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f141886a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f141887b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f141888c;
        return ((((((((((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f141889d) * 31) + this.f141890e) * 31) + this.f141891f) * 31) + this.f141892g) * 31) + this.f141893h) * 31) + this.f141894i;
    }

    public C62564a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f141886a = str;
        this.f141887b = str2;
        this.f141888c = j;
        this.f141890e = i;
        this.f141891f = 3;
        this.f141892g = i3;
        this.f141893h = i4;
        this.f141894i = i5;
    }
}
