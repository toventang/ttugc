package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ak */
public final class C42663ak {
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: a */
    public final long f99490a;

    static {
        Covode.recordClassIndex(50767);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C42663ak) && this.f99490a == ((C42663ak) obj).f99490a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f99490a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "RequestInfo(duration=" + this.f99490a + ")";
    }

    public C42663ak(long j) {
        this.f99490a = j;
    }
}
