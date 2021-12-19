package com.p2082ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f */
public final class C45879f {

    /* renamed from: a */
    public final boolean f106870a;

    /* renamed from: b */
    public boolean f106871b;

    /* renamed from: c */
    public boolean f106872c;

    /* renamed from: d */
    public boolean f106873d;

    static {
        Covode.recordClassIndex(54403);
    }

    public C45879f() {
        this(false, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45879f)) {
            return false;
        }
        C45879f fVar = (C45879f) obj;
        return this.f106870a == fVar.f106870a && this.f106871b == fVar.f106871b && this.f106872c == fVar.f106872c && this.f106873d == fVar.f106873d;
    }

    public final int hashCode() {
        boolean z = this.f106870a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f106871b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f106872c;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        if (!this.f106873d) {
            i = 0;
        }
        return i13 + i;
    }

    public final String toString() {
        return "EditTextStickerEnableConfig(strokeEnable=" + this.f106870a + ", enableReadText=" + this.f106871b + ", enableReadTextV2=" + this.f106872c + ", enableReadTextButton=" + this.f106873d + ")";
    }

    private C45879f(boolean z, boolean z2) {
        this.f106870a = z;
        this.f106871b = z2;
        this.f106872c = false;
        this.f106873d = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45879f(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }
}
