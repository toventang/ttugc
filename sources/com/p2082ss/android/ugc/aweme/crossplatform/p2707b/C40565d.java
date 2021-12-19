package com.p2082ss.android.ugc.aweme.crossplatform.p2707b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.d */
public final class C40565d implements AbstractC81914b {

    /* renamed from: a */
    public final long f94911a;

    static {
        Covode.recordClassIndex(48386);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C40565d) && this.f94911a == ((C40565d) obj).f94911a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f94911a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "WebviewFinishEvent(duration=" + this.f94911a + ")";
    }

    public C40565d(long j) {
        this.f94911a = j;
    }
}
