package com.p2082ss.android.ugc.aweme.feed.assem.digg;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.l */
public final class C48702l {

    /* renamed from: a */
    public final String f112561a;

    /* renamed from: b */
    public final boolean f112562b;

    /* renamed from: c */
    public final boolean f112563c;

    static {
        Covode.recordClassIndex(57482);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48702l)) {
            return false;
        }
        C48702l lVar = (C48702l) obj;
        return C89219l.m154714a(this.f112561a, lVar.f112561a) && this.f112562b == lVar.f112562b && this.f112563c == lVar.f112563c;
    }

    public final int hashCode() {
        String str = this.f112561a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f112562b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.f112563c) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "VideoDisplayState(displayCount=" + this.f112561a + ", selected=" + this.f112562b + ", displayVisible=" + this.f112563c + ")";
    }

    public C48702l(String str, boolean z, boolean z2) {
        this.f112561a = str;
        this.f112562b = z;
        this.f112563c = z2;
    }
}
