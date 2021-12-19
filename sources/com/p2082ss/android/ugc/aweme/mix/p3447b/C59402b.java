package com.p2082ss.android.ugc.aweme.mix.p3447b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.mix.b.b */
public final class C59402b implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f135694a = false;

    static {
        Covode.recordClassIndex(69794);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C59402b) && this.f135694a == ((C59402b) obj).f135694a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f135694a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ChangePlayListEntryShowEvent(show=" + this.f135694a + ")";
    }
}
