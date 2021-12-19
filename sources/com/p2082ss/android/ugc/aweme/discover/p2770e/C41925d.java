package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.discover.e.d */
public final class C41925d implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f97796a;

    static {
        Covode.recordClassIndex(49851);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41925d) && this.f97796a == ((C41925d) obj).f97796a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f97796a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "DiscoverSearchEvent(enter=" + this.f97796a + ")";
    }

    public C41925d(boolean z) {
        this.f97796a = z;
    }
}
