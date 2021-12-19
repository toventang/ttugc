package com.p2082ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.r */
public final class C42470r {

    /* renamed from: a */
    public final String f99007a;

    /* renamed from: b */
    public final Aweme f99008b;

    /* renamed from: c */
    public final String f99009c;

    /* renamed from: d */
    public final long f99010d;

    /* renamed from: e */
    public final boolean f99011e;

    /* renamed from: f */
    public final String f99012f;

    /* renamed from: g */
    public final String f99013g;

    /* renamed from: h */
    public final long f99014h;

    static {
        Covode.recordClassIndex(50419);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42470r)) {
            return false;
        }
        C42470r rVar = (C42470r) obj;
        return C89219l.m154714a(this.f99007a, rVar.f99007a) && C89219l.m154714a(this.f99008b, rVar.f99008b) && C89219l.m154714a(this.f99009c, rVar.f99009c) && this.f99010d == rVar.f99010d && this.f99011e == rVar.f99011e && C89219l.m154714a(this.f99012f, rVar.f99012f) && C89219l.m154714a(this.f99013g, rVar.f99013g) && this.f99014h == rVar.f99014h;
    }

    public final String toString() {
        return "SearchVideoParams(event=" + this.f99007a + ", aweme=" + this.f99008b + ", enterFrom=" + this.f99009c + ", duration=" + this.f99010d + ", fromSearchResult=" + this.f99011e + ", previousPage=" + this.f99012f + ", previousPagePosition=" + this.f99013g + ", rank=" + this.f99014h + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f99007a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Aweme aweme = this.f99008b;
        if (aweme != null) {
            i2 = aweme.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f99009c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j = this.f99010d;
        int i8 = (((i7 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f99011e;
        if (z) {
            z = true;
        }
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        String str3 = this.f99012f;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str4 = this.f99013g;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        long j2 = this.f99014h;
        return ((i13 + i5) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public /* synthetic */ C42470r(String str, Aweme aweme, String str2, boolean z, String str3, long j) {
        this(str, aweme, str2, -1, z, str3, "", j);
    }

    public C42470r(String str, Aweme aweme, String str2, long j, boolean z, String str3, String str4, long j2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f99007a = str;
        this.f99008b = aweme;
        this.f99009c = str2;
        this.f99010d = j;
        this.f99011e = z;
        this.f99012f = str3;
        this.f99013g = str4;
        this.f99014h = j2;
    }
}
