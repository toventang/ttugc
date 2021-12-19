package com.bytedance.android.livesdk.event;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.event.b */
public final class C8448b {

    /* renamed from: a */
    public boolean f20888a;

    /* renamed from: b */
    public boolean f20889b;

    static {
        Covode.recordClassIndex(9296);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8448b)) {
            return false;
        }
        C8448b bVar = (C8448b) obj;
        return this.f20888a == bVar.f20888a && this.f20889b == bVar.f20889b;
    }

    public final int hashCode() {
        boolean z = this.f20888a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f20889b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "BanTalkData(isBanned=" + this.f20888a + ", isWholeLive=" + this.f20889b + ")";
    }

    public /* synthetic */ C8448b(boolean z) {
        this(z, true);
    }

    public C8448b(boolean z, boolean z2) {
        this.f20888a = z;
        this.f20889b = z2;
    }
}
