package com.p2082ss.android.ugc.aweme.account.login.p2254a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.a */
public final class C31815a {

    /* renamed from: a */
    public final boolean f76043a;

    /* renamed from: b */
    public final long f76044b;

    static {
        Covode.recordClassIndex(38557);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31815a)) {
            return false;
        }
        C31815a aVar = (C31815a) obj;
        return this.f76043a == aVar.f76043a && this.f76044b == aVar.f76044b;
    }

    public final int hashCode() {
        boolean z = this.f76043a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f76044b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AnimationContext(shouldAnimate=" + this.f76043a + ", animationDelay=" + this.f76044b + ")";
    }

    public C31815a(boolean z, long j) {
        this.f76043a = z;
        this.f76044b = j;
    }
}
