package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.ah */
public final class C63769ah {

    /* renamed from: a */
    public Boolean f144546a;

    /* renamed from: b */
    public int f144547b;

    /* renamed from: c */
    public long f144548c;

    /* renamed from: d */
    public long f144549d;

    /* renamed from: e */
    public long f144550e;

    /* renamed from: f */
    public long f144551f;

    /* renamed from: g */
    public boolean f144552g;

    static {
        Covode.recordClassIndex(75097);
    }

    public C63769ah() {
        this(0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63769ah)) {
            return false;
        }
        C63769ah ahVar = (C63769ah) obj;
        return C89219l.m154714a(this.f144546a, ahVar.f144546a) && this.f144547b == ahVar.f144547b && this.f144548c == ahVar.f144548c && this.f144549d == ahVar.f144549d && this.f144550e == ahVar.f144550e && this.f144551f == ahVar.f144551f && this.f144552g == ahVar.f144552g;
    }

    public final String toString() {
        return "TimeRecorder(isLoadSuccess=" + this.f144546a + ", loadDataCount=" + this.f144547b + ", showFragmentStartAt=" + this.f144548c + ", networkStartAt=" + this.f144549d + ", networkFinishedAt=" + this.f144550e + ", assemStateUpdateFinishedAt=" + this.f144551f + ", isFirstLoad=" + this.f144552g + ")";
    }

    /* renamed from: a */
    public final long mo102329a() {
        long j = this.f144549d;
        long j2 = this.f144548c;
        if (1 <= j2 && j > j2) {
            return j - j2;
        }
        return -1;
    }

    /* renamed from: b */
    public final long mo102330b() {
        long j = this.f144550e;
        long j2 = this.f144549d;
        if (1 <= j2 && j > j2) {
            return j - j2;
        }
        return -1;
    }

    /* renamed from: c */
    public final long mo102331c() {
        long j = this.f144551f;
        long j2 = this.f144550e;
        if (1 <= j2 && j > j2) {
            return j - j2;
        }
        return -1;
    }

    /* renamed from: d */
    public final long mo102332d() {
        long j = this.f144548c;
        long j2 = this.f144551f;
        if (1 <= j && j2 > j) {
            return j2 - j;
        }
        long j3 = this.f144550e;
        if (1 <= j && j3 > j) {
            return j3 - j;
        }
        return -1;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.f144546a;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        long j = this.f144548c;
        long j2 = this.f144549d;
        long j3 = this.f144550e;
        long j4 = this.f144551f;
        int i2 = ((((((((((i * 31) + this.f144547b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        boolean z = this.f144552g;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    private C63769ah(long j) {
        this.f144546a = null;
        this.f144547b = 0;
        this.f144548c = j;
        this.f144549d = 0;
        this.f144550e = 0;
        this.f144551f = 0;
        this.f144552g = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C63769ah(long j, int i) {
        this((i & 4) != 0 ? 0 : j);
    }
}
