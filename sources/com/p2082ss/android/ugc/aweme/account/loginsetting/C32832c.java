package com.p2082ss.android.ugc.aweme.account.loginsetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.c */
public final class C32832c {
    @AbstractC27891c(mo46611a = "result")

    /* renamed from: a */
    public final boolean f78198a;

    static {
        Covode.recordClassIndex(39616);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C32832c) && this.f78198a == ((C32832c) obj).f78198a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f78198a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "BoolResult(result=" + this.f78198a + ")";
    }
}
