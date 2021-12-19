package com.p2082ss.android.ugc.aweme.effect.p2891c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.effect.c.b */
public final class C46343b {

    /* renamed from: a */
    public int f108025a;

    /* renamed from: b */
    public boolean f108026b;

    /* renamed from: c */
    public boolean f108027c;

    static {
        Covode.recordClassIndex(54920);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46343b)) {
            return false;
        }
        C46343b bVar = (C46343b) obj;
        return this.f108025a == bVar.f108025a && this.f108026b == bVar.f108026b && this.f108027c == bVar.f108027c;
    }

    public final int hashCode() {
        int i = this.f108025a * 31;
        boolean z = this.f108026b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        if (!this.f108027c) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "MotionConfig(messageCount=" + this.f108025a + ", isNeedregisted=" + this.f108026b + ", isShowed=" + this.f108027c + ")";
    }

    private /* synthetic */ C46343b() {
        this(false);
    }

    public C46343b(boolean z) {
        this.f108025a = 0;
        this.f108026b = z;
        this.f108027c = false;
    }
}
