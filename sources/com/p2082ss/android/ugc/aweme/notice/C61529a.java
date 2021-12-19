package com.p2082ss.android.ugc.aweme.notice;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.notice.a */
public final class C61529a {

    /* renamed from: a */
    public boolean f139669a;

    /* renamed from: b */
    public boolean f139670b;

    static {
        Covode.recordClassIndex(72196);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61529a)) {
            return false;
        }
        C61529a aVar = (C61529a) obj;
        return this.f139669a == aVar.f139669a && this.f139670b == aVar.f139670b;
    }

    public final int hashCode() {
        boolean z = this.f139669a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f139670b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "Setting(onlyShowDot=" + this.f139669a + ", shouldTurnToDot=" + this.f139670b + ")";
    }

    private C61529a() {
        this.f139669a = false;
        this.f139670b = false;
    }

    public /* synthetic */ C61529a(byte b) {
        this();
    }
}
