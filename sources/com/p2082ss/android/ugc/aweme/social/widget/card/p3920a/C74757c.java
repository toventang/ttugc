package com.p2082ss.android.ugc.aweme.social.widget.card.p3920a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.c */
public final class C74757c {
    @AbstractC27891c(mo46611a = "max_exposure_count")

    /* renamed from: a */
    public final int f168033a;
    @AbstractC27891c(mo46611a = "max_auto_hide_days")

    /* renamed from: b */
    public final int f168034b;
    @AbstractC27891c(mo46611a = "max_delete_hide_days")

    /* renamed from: c */
    public final int f168035c;
    @AbstractC27891c(mo46611a = "max_delete_count")

    /* renamed from: d */
    public final int f168036d;

    static {
        Covode.recordClassIndex(87602);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74757c)) {
            return false;
        }
        C74757c cVar = (C74757c) obj;
        return this.f168033a == cVar.f168033a && this.f168034b == cVar.f168034b && this.f168035c == cVar.f168035c && this.f168036d == cVar.f168036d;
    }

    public final int hashCode() {
        return (((((this.f168033a * 31) + this.f168034b) * 31) + this.f168035c) * 31) + this.f168036d;
    }

    public final String toString() {
        return "PermissionCardFreqParams(maxExposureCount=" + this.f168033a + ", maxAutoHideDays=" + this.f168034b + ", maxDeleteHideDays=" + this.f168035c + ", maxDeleteCount=" + this.f168036d + ")";
    }

    private C74757c() {
        this.f168033a = 10;
        this.f168034b = 14;
        this.f168035c = 14;
        this.f168036d = 3;
    }

    public /* synthetic */ C74757c(byte b) {
        this();
    }
}
