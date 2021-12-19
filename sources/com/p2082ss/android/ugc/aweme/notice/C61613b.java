package com.p2082ss.android.ugc.aweme.notice;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.notice.b */
public final class C61613b {

    /* renamed from: a */
    public boolean f139814a;

    /* renamed from: b */
    public int f139815b;

    static {
        Covode.recordClassIndex(72302);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61613b)) {
            return false;
        }
        C61613b bVar = (C61613b) obj;
        return this.f139814a == bVar.f139814a && this.f139815b == bVar.f139815b;
    }

    public final int hashCode() {
        boolean z = this.f139814a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + this.f139815b;
    }

    public final String toString() {
        return "State(redDot=" + this.f139814a + ", count=" + this.f139815b + ")";
    }

    private C61613b() {
        this.f139814a = false;
        this.f139815b = 0;
    }

    public /* synthetic */ C61613b(byte b) {
        this();
    }
}
