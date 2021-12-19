package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.feed.ab */
public final class C48020ab implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f111243a;

    static {
        Covode.recordClassIndex(56746);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C48020ab) && this.f111243a == ((C48020ab) obj).f111243a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f111243a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "LiveCleanEvent(show=" + this.f111243a + ")";
    }

    public C48020ab(boolean z) {
        this.f111243a = z;
    }
}
