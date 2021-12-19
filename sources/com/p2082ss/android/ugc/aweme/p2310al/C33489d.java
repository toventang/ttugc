package com.p2082ss.android.ugc.aweme.p2310al;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.al.d */
public final class C33489d implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f79558a;

    /* renamed from: b */
    public final boolean f79559b;

    static {
        Covode.recordClassIndex(40346);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33489d)) {
            return false;
        }
        C33489d dVar = (C33489d) obj;
        return this.f79558a == dVar.f79558a && this.f79559b == dVar.f79559b;
    }

    public final int hashCode() {
        boolean z = this.f79558a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f79559b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "LoopCurrentStoryVideoEvent(loop=" + this.f79558a + ", useCount=" + this.f79559b + ")";
    }

    public /* synthetic */ C33489d(boolean z) {
        this(z, true);
    }

    public C33489d(boolean z, boolean z2) {
        this.f79558a = z;
        this.f79559b = z2;
    }
}
