package com.p2082ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.d */
public final class C51083d {

    /* renamed from: a */
    public final int f117850a;

    /* renamed from: b */
    public final int f117851b;

    /* renamed from: c */
    public final int f117852c;

    /* renamed from: d */
    public final String f117853d;

    /* renamed from: e */
    public final String f117854e;

    /* renamed from: f */
    public final Integer f117855f;

    /* renamed from: g */
    public final String f117856g;

    /* renamed from: h */
    public final String f117857h;

    /* renamed from: i */
    public final String f117858i;

    /* renamed from: j */
    public final int f117859j;

    /* renamed from: k */
    public final List<Long> f117860k;

    static {
        Covode.recordClassIndex(60277);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51083d)) {
            return false;
        }
        C51083d dVar = (C51083d) obj;
        return this.f117850a == dVar.f117850a && this.f117851b == dVar.f117851b && this.f117852c == dVar.f117852c && C89219l.m154714a(this.f117853d, dVar.f117853d) && C89219l.m154714a(this.f117854e, dVar.f117854e) && C89219l.m154714a(this.f117855f, dVar.f117855f) && C89219l.m154714a(this.f117856g, dVar.f117856g) && C89219l.m154714a(this.f117857h, dVar.f117857h) && C89219l.m154714a(this.f117858i, dVar.f117858i) && this.f117859j == dVar.f117859j && C89219l.m154714a(this.f117860k, dVar.f117860k);
    }

    public final int hashCode() {
        int i = ((((this.f117850a * 31) + this.f117851b) * 31) + this.f117852c) * 31;
        String str = this.f117853d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f117854e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f117855f;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f117856g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f117857h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f117858i;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f117859j) * 31;
        List<Long> list = this.f117860k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "FollowFeedParam(listQueryType=" + this.f117850a + ", pullType=" + this.f117851b + ", followFeedStyle=" + this.f117852c + ", impressionIds=" + this.f117853d + ", lastFeedsId=" + this.f117854e + ", liveTagShow=" + this.f117855f + ", insertAwemeId=" + this.f117856g + ", pushAids=" + this.f117857h + ", pushParams=" + this.f117858i + ", refreshAfterVcdAuthorize=" + this.f117859j + ", insertRoomIds=" + this.f117860k + ")";
    }

    public C51083d(int i, int i2, int i3, String str, String str2, Integer num, String str3, String str4, String str5, int i4, List<Long> list) {
        C89219l.m154721d(str, "");
        this.f117850a = i;
        this.f117851b = i2;
        this.f117852c = i3;
        this.f117853d = str;
        this.f117854e = str2;
        this.f117855f = num;
        this.f117856g = str3;
        this.f117857h = str4;
        this.f117858i = str5;
        this.f117859j = i4;
        this.f117860k = list;
    }
}
