package com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.f */
public final class C42174f {

    /* renamed from: a */
    public final String f98284a;

    /* renamed from: b */
    public final int f98285b;

    /* renamed from: c */
    public final String f98286c;

    /* renamed from: d */
    public final String f98287d;

    /* renamed from: e */
    public final int f98288e;

    /* renamed from: f */
    public final int f98289f;

    /* renamed from: g */
    public String f98290g;

    /* renamed from: h */
    public String f98291h;

    /* renamed from: i */
    public final long f98292i;

    /* renamed from: j */
    public final int f98293j;

    /* renamed from: k */
    public final String f98294k;

    /* renamed from: l */
    public final C67437b f98295l;

    /* renamed from: m */
    public final String f98296m;

    /* renamed from: n */
    public final String f98297n;

    /* renamed from: o */
    public final String f98298o;

    /* renamed from: p */
    public final String f98299p;

    /* renamed from: q */
    public final int f98300q;

    /* renamed from: r */
    public final C67678d f98301r;

    /* renamed from: s */
    public final String f98302s;

    /* renamed from: t */
    public String f98303t;

    static {
        Covode.recordClassIndex(50113);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42174f)) {
            return false;
        }
        C42174f fVar = (C42174f) obj;
        return C89219l.m154714a(this.f98284a, fVar.f98284a) && this.f98285b == fVar.f98285b && C89219l.m154714a(this.f98286c, fVar.f98286c) && C89219l.m154714a(this.f98287d, fVar.f98287d) && this.f98288e == fVar.f98288e && this.f98289f == fVar.f98289f && C89219l.m154714a(this.f98290g, fVar.f98290g) && C89219l.m154714a(this.f98291h, fVar.f98291h) && this.f98292i == fVar.f98292i && this.f98293j == fVar.f98293j && C89219l.m154714a(this.f98294k, fVar.f98294k) && C89219l.m154714a(this.f98295l, fVar.f98295l) && C89219l.m154714a(this.f98296m, fVar.f98296m) && C89219l.m154714a(this.f98297n, fVar.f98297n) && C89219l.m154714a(this.f98298o, fVar.f98298o) && C89219l.m154714a(this.f98299p, fVar.f98299p) && this.f98300q == fVar.f98300q && C89219l.m154714a(this.f98301r, fVar.f98301r) && C89219l.m154714a(this.f98302s, fVar.f98302s) && C89219l.m154714a(this.f98303t, fVar.f98303t);
    }

    public final String toString() {
        return "SearchRequestParam(keyword=" + this.f98284a + ", refreshType=" + this.f98285b + ", searchSource=" + this.f98286c + ", source=" + this.f98287d + ", hotSearch=" + this.f98288e + ", correctType=" + this.f98289f + ", searchId=" + this.f98290g + ", lastSearchId=" + this.f98291h + ", cursor=" + this.f98292i + ", count=" + this.f98293j + ", enterFrom=" + this.f98294k + ", filterOption=" + this.f98295l + ", channel=" + this.f98296m + ", showResultsSource=" + this.f98297n + ", sugUserId=" + this.f98298o + ", isRichSug=" + this.f98299p + ", isAuthorSearch=" + this.f98300q + ", searchParam=" + this.f98301r + ", roomIdList=" + this.f98302s + ", searchContext=" + this.f98303t + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = this.f98284a;
        int i14 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i15 = ((i * 31) + this.f98285b) * 31;
        String str2 = this.f98286c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        String str3 = this.f98287d;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (((((i16 + i3) * 31) + this.f98288e) * 31) + this.f98289f) * 31;
        String str4 = this.f98290g;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        String str5 = this.f98291h;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        long j = this.f98292i;
        int i19 = (((((i18 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f98293j) * 31;
        String str6 = this.f98294k;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        C67437b bVar = this.f98295l;
        if (bVar != null) {
            i7 = bVar.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        String str7 = this.f98296m;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        String str8 = this.f98297n;
        if (str8 != null) {
            i9 = str8.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        String str9 = this.f98298o;
        if (str9 != null) {
            i10 = str9.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        String str10 = this.f98299p;
        if (str10 != null) {
            i11 = str10.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (((i24 + i11) * 31) + this.f98300q) * 31;
        C67678d dVar = this.f98301r;
        if (dVar != null) {
            i12 = dVar.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 31;
        String str11 = this.f98302s;
        if (str11 != null) {
            i13 = str11.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 31;
        String str12 = this.f98303t;
        if (str12 != null) {
            i14 = str12.hashCode();
        }
        return i27 + i14;
    }

    private C42174f(String str, int i, String str2, String str3, int i2, int i3, String str4, String str5, long j, int i4, String str6, C67437b bVar, String str7, String str8, String str9, String str10, int i5, String str11, String str12) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str6, "");
        this.f98284a = str;
        this.f98285b = i;
        this.f98286c = str2;
        this.f98287d = str3;
        this.f98288e = i2;
        this.f98289f = i3;
        this.f98290g = str4;
        this.f98291h = str5;
        this.f98292i = j;
        this.f98293j = i4;
        this.f98294k = str6;
        this.f98295l = bVar;
        this.f98296m = str7;
        this.f98297n = str8;
        this.f98298o = str9;
        this.f98299p = str10;
        this.f98300q = i5;
        this.f98301r = null;
        this.f98302s = str11;
        this.f98303t = str12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C42174f(java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, int r27, int r28, java.lang.String r29, java.lang.String r30, long r31, int r33, java.lang.String r34, com.p2082ss.android.ugc.aweme.search.p3691g.C67437b r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, java.lang.String r42, int r43) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f.<init>(java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, long, int, java.lang.String, com.ss.android.ugc.aweme.search.g.b, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int):void");
    }
}
