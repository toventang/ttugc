package com.p2082ss.android.ugc.aweme.social.monitor;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.monitor.a */
public final class C74733a {

    /* renamed from: a */
    public final int f167974a;

    /* renamed from: b */
    public long f167975b;

    /* renamed from: c */
    public long f167976c;

    /* renamed from: d */
    public long f167977d;

    /* renamed from: e */
    public long f167978e;

    /* renamed from: f */
    public long f167979f;

    /* renamed from: g */
    public long f167980g;

    /* renamed from: h */
    public long f167981h;

    /* renamed from: i */
    public long f167982i;

    /* renamed from: j */
    public long f167983j;

    /* renamed from: k */
    public boolean f167984k;

    /* renamed from: l */
    public int f167985l;

    /* renamed from: m */
    public int f167986m;

    /* renamed from: n */
    public Throwable f167987n;

    /* renamed from: o */
    public Throwable f167988o;

    static {
        Covode.recordClassIndex(87574);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74733a)) {
            return false;
        }
        C74733a aVar = (C74733a) obj;
        return this.f167974a == aVar.f167974a && this.f167975b == aVar.f167975b && this.f167976c == aVar.f167976c && this.f167977d == aVar.f167977d && this.f167978e == aVar.f167978e && this.f167979f == aVar.f167979f && this.f167980g == aVar.f167980g && this.f167981h == aVar.f167981h && this.f167982i == aVar.f167982i && this.f167983j == aVar.f167983j && this.f167984k == aVar.f167984k && this.f167985l == aVar.f167985l && this.f167986m == aVar.f167986m && C89219l.m154714a(this.f167987n, aVar.f167987n) && C89219l.m154714a(this.f167988o, aVar.f167988o);
    }

    public final String toString() {
        return "CollectParams(scene=" + this.f167974a + ", beginTs=" + this.f167975b + ", readDBTs=" + this.f167976c + ", filterTs=" + this.f167977d + ", preHashTs=" + this.f167978e + ", hashTs=" + this.f167979f + ", serializeTs=" + this.f167980g + ", respTs=" + this.f167981h + ", constructTs=" + this.f167982i + ", endTs=" + this.f167983j + ", isNewImpl=" + this.f167984k + ", errorCount=" + this.f167985l + ", contactCount=" + this.f167986m + ", readDBError=" + this.f167987n + ", networkError=" + this.f167988o + ")";
    }

    public final int hashCode() {
        int i;
        long j = this.f167975b;
        long j2 = this.f167976c;
        long j3 = this.f167977d;
        long j4 = this.f167978e;
        long j5 = this.f167979f;
        long j6 = this.f167980g;
        long j7 = this.f167981h;
        long j8 = this.f167982i;
        long j9 = this.f167983j;
        int i2 = ((((((((((((((((((this.f167974a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        boolean z = this.f167984k;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((((i2 + i3) * 31) + this.f167985l) * 31) + this.f167986m) * 31;
        Throwable th = this.f167987n;
        int i7 = 0;
        if (th != null) {
            i = th.hashCode();
        } else {
            i = 0;
        }
        int i8 = (i6 + i) * 31;
        Throwable th2 = this.f167988o;
        if (th2 != null) {
            i7 = th2.hashCode();
        }
        return i8 + i7;
    }

    public /* synthetic */ C74733a(int i) {
        this(i, -1, -1, -1, -1, -1, -1, -1, -1, -1, false, 0, 0, null, null);
    }

    public C74733a(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, int i2, int i3, Throwable th, Throwable th2) {
        this.f167974a = i;
        this.f167975b = j;
        this.f167976c = j2;
        this.f167977d = j3;
        this.f167978e = j4;
        this.f167979f = j5;
        this.f167980g = j6;
        this.f167981h = j7;
        this.f167982i = j8;
        this.f167983j = j9;
        this.f167984k = z;
        this.f167985l = i2;
        this.f167986m = i3;
        this.f167987n = th;
        this.f167988o = th2;
    }
}
