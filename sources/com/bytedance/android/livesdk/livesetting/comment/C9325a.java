package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.livesetting.comment.a */
public final class C9325a {
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: a */
    public final boolean f22761a = false;
    @AbstractC27891c(mo46611a = "delayTime")

    /* renamed from: b */
    public final long f22762b = 0;

    static {
        Covode.recordClassIndex(10364);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9325a)) {
            return false;
        }
        C9325a aVar = (C9325a) obj;
        return this.f22761a == aVar.f22761a && this.f22762b == aVar.f22762b;
    }

    public final int hashCode() {
        boolean z = this.f22761a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f22762b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "InputDialogFixSettingModel(enable=" + this.f22761a + ", delayTime=" + this.f22762b + ")";
    }
}
