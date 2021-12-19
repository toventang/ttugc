package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17362a;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.y */
public final class C33104y implements AbstractC17362a {

    /* renamed from: a */
    public final boolean f78676a;

    /* renamed from: b */
    public final boolean f78677b;

    static {
        Covode.recordClassIndex(39916);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33104y)) {
            return false;
        }
        C33104y yVar = (C33104y) obj;
        return this.f78676a == yVar.f78676a && this.f78677b == yVar.f78677b;
    }

    public final int hashCode() {
        boolean z = this.f78676a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f78677b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "InitHookConfig(enableInitHook=" + this.f78676a + ", mDisableOptimizeViewHierarchy=" + this.f78677b + ")";
    }

    private /* synthetic */ C33104y() {
        this(true, false);
    }

    public C33104y(boolean z, boolean z2) {
        this.f78676a = z;
        this.f78677b = z2;
    }
}
