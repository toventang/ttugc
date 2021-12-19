package com.bytedance.android.livesdk.livesetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.livesetting.b */
public final class C9322b {
    @AbstractC27891c(mo46611a = "cpu_load_rate")

    /* renamed from: a */
    public final long f22757a;
    @AbstractC27891c(mo46611a = "cpu_cycle")

    /* renamed from: b */
    public final long f22758b;
    @AbstractC27891c(mo46611a = "is_anchor")

    /* renamed from: c */
    public final boolean f22759c;

    static {
        Covode.recordClassIndex(10258);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9322b)) {
            return false;
        }
        C9322b bVar = (C9322b) obj;
        return this.f22757a == bVar.f22757a && this.f22758b == bVar.f22758b && this.f22759c == bVar.f22759c;
    }

    public final String toString() {
        return "NegativeTestSettings(cpuLoadRate=" + this.f22757a + ", cpuCycle=" + this.f22758b + ", isAnchor=" + this.f22759c + ")";
    }

    private C9322b() {
        this.f22757a = 0;
        this.f22758b = 0;
        this.f22759c = false;
    }

    public final int hashCode() {
        long j = this.f22757a;
        long j2 = this.f22758b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f22759c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public /* synthetic */ C9322b(byte b) {
        this();
    }
}
