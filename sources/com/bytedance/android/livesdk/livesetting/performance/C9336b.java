package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.livesetting.performance.b */
public final class C9336b {
    @AbstractC27891c(mo46611a = "live_sdk_panel_open_cost_times_switch")

    /* renamed from: a */
    public boolean f22808a;
    @AbstractC27891c(mo46611a = "live_sdk_panel_open_cost_times_limit_duration")

    /* renamed from: b */
    public int f22809b;

    static {
        Covode.recordClassIndex(10672);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9336b)) {
            return false;
        }
        C9336b bVar = (C9336b) obj;
        return this.f22808a == bVar.f22808a && this.f22809b == bVar.f22809b;
    }

    public final int hashCode() {
        boolean z = this.f22808a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + this.f22809b;
    }

    public final String toString() {
        return "LivePanelCostTimeModel(mSwitch=" + this.f22808a + ", mLimitDuration=" + this.f22809b + ")";
    }

    private C9336b() {
        this.f22808a = true;
        this.f22809b = 3;
    }

    public /* synthetic */ C9336b(byte b) {
        this();
    }
}
