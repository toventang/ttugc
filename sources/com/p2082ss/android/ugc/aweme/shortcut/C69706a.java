package com.p2082ss.android.ugc.aweme.shortcut;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.shortcut.a */
public final class C69706a {
    @AbstractC27891c(mo46611a = "cash_amount")

    /* renamed from: a */
    public final long f155613a;

    static {
        Covode.recordClassIndex(82084);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C69706a) && this.f155613a == ((C69706a) obj).f155613a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f155613a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "FissionWithdrawalNum(amount=" + this.f155613a + ")";
    }
}
