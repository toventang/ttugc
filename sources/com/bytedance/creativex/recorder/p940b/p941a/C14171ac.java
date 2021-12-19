package com.bytedance.creativex.recorder.p940b.p941a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.creativex.recorder.b.a.ac */
public final class C14171ac {

    /* renamed from: a */
    public final boolean f34443a;

    /* renamed from: b */
    public final boolean f34444b;

    /* renamed from: c */
    public final boolean f34445c;

    static {
        Covode.recordClassIndex(16240);
    }

    public C14171ac(boolean z) {
        this(z, true, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14171ac)) {
            return false;
        }
        C14171ac acVar = (C14171ac) obj;
        return this.f34443a == acVar.f34443a && this.f34444b == acVar.f34444b && this.f34445c == acVar.f34445c;
    }

    public final int hashCode() {
        boolean z = this.f34443a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f34444b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f34445c) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "VisibilityEvent(toVisible=" + this.f34443a + ", withAnim=" + this.f34444b + ", tabOnly=" + this.f34445c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14171ac(boolean z, boolean z2, int i) {
        this(z, (i & 2) != 0 ? false : z2, false);
    }

    public C14171ac(boolean z, boolean z2, boolean z3) {
        this.f34443a = z;
        this.f34444b = z2;
        this.f34445c = z3;
    }
}
