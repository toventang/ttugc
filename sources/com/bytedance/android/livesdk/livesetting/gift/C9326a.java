package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.livesetting.gift.a */
public final class C9326a {
    @AbstractC27891c(mo46611a = "available_storage_threshold")

    /* renamed from: a */
    public final long f22765a = 204800;
    @AbstractC27891c(mo46611a = "enable_check")

    /* renamed from: b */
    public final boolean f22766b = false;

    static {
        Covode.recordClassIndex(10439);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9326a)) {
            return false;
        }
        C9326a aVar = (C9326a) obj;
        return this.f22765a == aVar.f22765a && this.f22766b == aVar.f22766b;
    }

    public final String toString() {
        return "GiftAssetsStorageConfig(availableThreshold=" + this.f22765a + ", enableCheck=" + this.f22766b + ")";
    }

    public final int hashCode() {
        long j = this.f22765a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f22766b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }
}
