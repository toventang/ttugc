package com.p2082ss.android.ugc.aweme.miniapp.p3440a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.miniapp.a.c */
public final class C59268c {
    @AbstractC27891c(mo46611a = "lifetime_finished_count")

    /* renamed from: a */
    public final int f135484a;
    @AbstractC27891c(mo46611a = "last_finished_time")

    /* renamed from: b */
    public final long f135485b;

    static {
        Covode.recordClassIndex(69634);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59268c)) {
            return false;
        }
        C59268c cVar = (C59268c) obj;
        return this.f135484a == cVar.f135484a && this.f135485b == cVar.f135485b;
    }

    public final int hashCode() {
        long j = this.f135485b;
        return (this.f135484a * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RessoPlayRecord(lifetimeFinishedCount=" + this.f135484a + ", lastFinishedTime=" + this.f135485b + ")";
    }

    public C59268c(int i, long j) {
        this.f135484a = i;
        this.f135485b = j;
    }
}
