package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.o */
public final class C46104o {

    /* renamed from: a */
    public final boolean f107352a;

    /* renamed from: b */
    public final float f107353b;

    /* renamed from: c */
    public final int f107354c;

    static {
        Covode.recordClassIndex(54662);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46104o)) {
            return false;
        }
        C46104o oVar = (C46104o) obj;
        return this.f107352a == oVar.f107352a && Float.compare(this.f107353b, oVar.f107353b) == 0 && this.f107354c == oVar.f107354c;
    }

    public final String toString() {
        return "EffectTextScaleInfo(isPortrait=" + this.f107352a + ", scaleFactor=" + this.f107353b + ", maxTextWidth=" + this.f107354c + ")";
    }

    public /* synthetic */ C46104o() {
        this(true, 1.0f, -1);
    }

    /* renamed from: a */
    public final float mo78289a() {
        float f = this.f107353b;
        if (f == 0.0f) {
            return 1.0f;
        }
        return 1.0f / f;
    }

    public final int hashCode() {
        boolean z = this.f107352a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (((i * 31) + Float.floatToIntBits(this.f107353b)) * 31) + this.f107354c;
    }

    public C46104o(boolean z, float f, int i) {
        this.f107352a = z;
        this.f107353b = f;
        this.f107354c = i;
    }
}
