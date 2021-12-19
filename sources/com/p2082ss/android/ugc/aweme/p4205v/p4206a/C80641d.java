package com.p2082ss.android.ugc.aweme.p4205v.p4206a;

import android.graphics.BlurMaskFilter;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.v.a.d */
public final class C80641d {

    /* renamed from: a */
    public final float f180301a;

    /* renamed from: b */
    public final BlurMaskFilter.Blur f180302b;

    /* renamed from: c */
    public final float f180303c = 0.0f;

    /* renamed from: d */
    public final float f180304d;

    /* renamed from: e */
    public final int f180305e;

    static {
        Covode.recordClassIndex(93915);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80641d)) {
            return false;
        }
        C80641d dVar = (C80641d) obj;
        return Float.compare(this.f180301a, dVar.f180301a) == 0 && C89219l.m154714a(this.f180302b, dVar.f180302b) && Float.compare(this.f180303c, dVar.f180303c) == 0 && Float.compare(this.f180304d, dVar.f180304d) == 0 && this.f180305e == dVar.f180305e;
    }

    public final String toString() {
        return "Shadow(blurRadius=" + this.f180301a + ", blur=" + this.f180302b + ", dx=" + this.f180303c + ", dy=" + this.f180304d + ", shadowColor=" + this.f180305e + ")";
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.f180301a) * 31;
        BlurMaskFilter.Blur blur = this.f180302b;
        if (blur != null) {
            i = blur.hashCode();
        } else {
            i = 0;
        }
        return ((((((floatToIntBits + i) * 31) + Float.floatToIntBits(this.f180303c)) * 31) + Float.floatToIntBits(this.f180304d)) * 31) + this.f180305e;
    }

    public C80641d(float f, BlurMaskFilter.Blur blur, float f2, int i) {
        C89219l.m154721d(blur, "");
        this.f180301a = f;
        this.f180302b = blur;
        this.f180304d = f2;
        this.f180305e = i;
    }
}
