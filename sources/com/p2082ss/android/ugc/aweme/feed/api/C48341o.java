package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.cache.AbstractC49331j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.api.o */
public final class C48341o {

    /* renamed from: a */
    public final Integer f112027a;

    /* renamed from: b */
    public final Long f112028b;

    /* renamed from: c */
    public final Long f112029c;

    /* renamed from: d */
    public final Integer f112030d;

    /* renamed from: e */
    public final Integer f112031e;

    /* renamed from: f */
    public final String f112032f;

    /* renamed from: g */
    public final Integer f112033g;

    /* renamed from: h */
    public final String f112034h;

    /* renamed from: i */
    public final String f112035i;

    /* renamed from: j */
    public final AbstractC49331j f112036j;

    /* renamed from: k */
    public Boolean f112037k;

    /* renamed from: l */
    public String f112038l = null;

    /* renamed from: m */
    public String f112039m = null;

    /* renamed from: n */
    public final boolean f112040n;

    /* renamed from: o */
    public final String f112041o;

    static {
        Covode.recordClassIndex(57113);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48341o)) {
            return false;
        }
        C48341o oVar = (C48341o) obj;
        return C89219l.m154714a(this.f112027a, oVar.f112027a) && C89219l.m154714a(this.f112028b, oVar.f112028b) && C89219l.m154714a(this.f112029c, oVar.f112029c) && C89219l.m154714a(this.f112030d, oVar.f112030d) && C89219l.m154714a(this.f112031e, oVar.f112031e) && C89219l.m154714a(this.f112032f, oVar.f112032f) && C89219l.m154714a(this.f112033g, oVar.f112033g) && C89219l.m154714a(this.f112034h, oVar.f112034h) && C89219l.m154714a(this.f112035i, oVar.f112035i) && C89219l.m154714a(this.f112036j, oVar.f112036j) && C89219l.m154714a(this.f112037k, oVar.f112037k) && C89219l.m154714a(this.f112038l, oVar.f112038l) && C89219l.m154714a(this.f112039m, oVar.f112039m) && this.f112040n == oVar.f112040n && C89219l.m154714a(this.f112041o, oVar.f112041o);
    }

    public final int hashCode() {
        Integer num = this.f112027a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Long l = this.f112028b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f112029c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Integer num2 = this.f112030d;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f112031e;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str = this.f112032f;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num4 = this.f112033g;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f112034h;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112035i;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AbstractC49331j jVar = this.f112036j;
        int hashCode10 = (hashCode9 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Boolean bool = this.f112037k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f112038l;
        int hashCode12 = (hashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f112039m;
        int hashCode13 = (hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f112040n;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode13 + i2) * 31;
        String str6 = this.f112041o;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "RecommendApiParam(type=" + this.f112027a + ", max=" + this.f112028b + ", min=" + this.f112029c + ", count=" + this.f112030d + ", feedStyle=" + this.f112031e + ", awemeId=" + this.f112032f + ", pullType=" + this.f112033g + ", awemeIds=" + this.f112034h + ", pushParams=" + this.f112035i + ", localCache=" + this.f112036j + ", isFirst=" + this.f112037k + ", showIds=" + this.f112038l + ", cachedIds=" + this.f112039m + ", isPlayingInBackground=" + this.f112040n + ", showTimeGapInfo=" + this.f112041o + ")";
    }

    public C48341o(Integer num, Long l, Long l2, Integer num2, Integer num3, String str, Integer num4, String str2, String str3, AbstractC49331j jVar, Boolean bool, boolean z, String str4) {
        this.f112027a = num;
        this.f112028b = l;
        this.f112029c = l2;
        this.f112030d = num2;
        this.f112031e = num3;
        this.f112032f = str;
        this.f112033g = num4;
        this.f112034h = str2;
        this.f112035i = str3;
        this.f112036j = jVar;
        this.f112037k = bool;
        this.f112040n = z;
        this.f112041o = str4;
    }
}
