package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.profile.aj */
public final class C63424aj implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f143976a;

    static {
        Covode.recordClassIndex(74715);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C63424aj) && this.f143976a == ((C63424aj) obj).f143976a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f143976a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "SafeInfoNoticeEvent(hasPrior=" + this.f143976a + ")";
    }

    public C63424aj(boolean z) {
        this.f143976a = z;
    }
}
