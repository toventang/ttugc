package com.p2082ss.android.ugc.aweme.bullet.p2418f;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.f.a */
public final class C35149a {

    /* renamed from: a */
    public final boolean f82942a;

    /* renamed from: b */
    public final byte[] f82943b;

    /* renamed from: c */
    public final Throwable f82944c;

    static {
        Covode.recordClassIndex(42304);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35149a)) {
            return false;
        }
        C35149a aVar = (C35149a) obj;
        return this.f82942a == aVar.f82942a && C89219l.m154714a(this.f82943b, aVar.f82943b) && C89219l.m154714a(this.f82944c, aVar.f82944c);
    }

    public final int hashCode() {
        boolean z = this.f82942a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        byte[] bArr = this.f82943b;
        int i5 = 0;
        int hashCode = (i4 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        Throwable th = this.f82944c;
        if (th != null) {
            i5 = th.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "NetworkResult(success=" + this.f82942a + ", bytes=" + Arrays.toString(this.f82943b) + ", error=" + this.f82944c + ")";
    }

    public C35149a(boolean z, byte[] bArr, Throwable th) {
        this.f82942a = z;
        this.f82943b = bArr;
        this.f82944c = th;
    }
}
