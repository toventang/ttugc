package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.k */
public final class C74225k {

    /* renamed from: a */
    public final long f166733a;

    /* renamed from: b */
    public final long f166734b;

    /* renamed from: c */
    public final String f166735c;

    static {
        Covode.recordClassIndex(86984);
    }

    /* renamed from: a */
    private static C74225k m130486a(long j, long j2, String str) {
        C89219l.m154721d(str, "");
        return new C74225k(j, j2, str);
    }

    /* renamed from: a */
    public static /* synthetic */ C74225k m130487a(C74225k kVar, long j, long j2, String str, int i) {
        if ((i & 1) != 0) {
            j = kVar.f166733a;
        }
        if ((i & 2) != 0) {
            j2 = kVar.f166734b;
        }
        if ((i & 4) != 0) {
            str = kVar.f166735c;
        }
        return m130486a(j, j2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74225k)) {
            return false;
        }
        C74225k kVar = (C74225k) obj;
        return this.f166733a == kVar.f166733a && this.f166734b == kVar.f166734b && C89219l.m154714a(this.f166735c, kVar.f166735c);
    }

    public final int hashCode() {
        long j = this.f166733a;
        long j2 = this.f166734b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f166735c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RecordLog(concatFinishTime=" + this.f166733a + ", enterEditTime=" + this.f166734b + ", goNextReason=" + this.f166735c + ")";
    }

    public /* synthetic */ C74225k() {
        this(0, 0, "");
    }

    private C74225k(long j, long j2, String str) {
        C89219l.m154721d(str, "");
        this.f166733a = j;
        this.f166734b = j2;
        this.f166735c = str;
    }
}
