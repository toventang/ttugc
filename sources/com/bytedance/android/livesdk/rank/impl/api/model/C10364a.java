package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.api.model.a */
public final class C10364a {
    @AbstractC27891c(mo46611a = "exempt_host")

    /* renamed from: a */
    public boolean f25045a;
    @AbstractC27891c(mo46611a = "exempt_current_audience")

    /* renamed from: b */
    public boolean f25046b;
    @AbstractC27891c(mo46611a = "exempt_audience_top")

    /* renamed from: c */
    public int f25047c;

    static {
        Covode.recordClassIndex(11938);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10364a)) {
            return false;
        }
        C10364a aVar = (C10364a) obj;
        return this.f25045a == aVar.f25045a && this.f25046b == aVar.f25046b && this.f25047c == aVar.f25047c;
    }

    public final int hashCode() {
        boolean z = this.f25045a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f25046b) {
            i = 0;
        }
        return ((i5 + i) * 31) + this.f25047c;
    }

    public final String toString() {
        return "ExemptConfig(exemptHost=" + this.f25045a + ", exemptCurrentAudience=" + this.f25046b + ", exemptAudienceTop=" + this.f25047c + ")";
    }
}
