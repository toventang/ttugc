package com.bytedance.creativex.recorder.p940b.p941a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.creativex.recorder.b.a.l */
public final class C14192l {

    /* renamed from: a */
    public final boolean f34467a;

    /* renamed from: b */
    public final boolean f34468b;

    static {
        Covode.recordClassIndex(16261);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14192l)) {
            return false;
        }
        C14192l lVar = (C14192l) obj;
        return this.f34467a == lVar.f34467a && this.f34468b == lVar.f34468b;
    }

    public final int hashCode() {
        boolean z = this.f34467a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f34468b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "OnVisibilityChanged(tabOnly=" + this.f34467a + ", toVisible=" + this.f34468b + ")";
    }

    public C14192l(boolean z, boolean z2) {
        this.f34467a = z;
        this.f34468b = z2;
    }
}
