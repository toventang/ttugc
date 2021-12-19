package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.e */
public final class C75120e {
    @AbstractC27891c(mo46611a = "daily_max_times")

    /* renamed from: a */
    public int f168869a;
    @AbstractC27891c(mo46611a = "life_time_max_times")

    /* renamed from: b */
    public int f168870b;
    @AbstractC27891c(mo46611a = "inactive_days")

    /* renamed from: c */
    public int f168871c;
    @AbstractC27891c(mo46611a = "max_close")

    /* renamed from: d */
    public int f168872d;

    static {
        Covode.recordClassIndex(87993);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75120e)) {
            return false;
        }
        C75120e eVar = (C75120e) obj;
        return this.f168869a == eVar.f168869a && this.f168870b == eVar.f168870b && this.f168871c == eVar.f168871c && this.f168872d == eVar.f168872d;
    }

    public final int hashCode() {
        return (((((this.f168869a * 31) + this.f168870b) * 31) + this.f168871c) * 31) + this.f168872d;
    }

    public final String toString() {
        return "FrequencyControl(dailyMaxTimes=" + this.f168869a + ", lifeTimeMaxTimes=" + this.f168870b + ", inactiveDays=" + this.f168871c + ", maxClose=" + this.f168872d + ")";
    }

    private C75120e() {
        this.f168869a = 0;
        this.f168870b = 0;
        this.f168871c = 0;
        this.f168872d = 0;
    }

    public /* synthetic */ C75120e(byte b) {
        this();
    }
}
