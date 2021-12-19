package com.p2082ss.android.ugc.aweme.journey.p3300ui;

import android.graphics.BlurMaskFilter;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.ui.a */
public final class C57047a {

    /* renamed from: a */
    public final float f129894a;

    /* renamed from: b */
    public final BlurMaskFilter.Blur f129895b;

    /* renamed from: c */
    public final float f129896c = 0.0f;

    /* renamed from: d */
    public final float f129897d;

    /* renamed from: e */
    public final int f129898e;

    /* renamed from: f */
    public final float f129899f;

    static {
        Covode.recordClassIndex(66937);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57047a)) {
            return false;
        }
        C57047a aVar = (C57047a) obj;
        return Float.compare(this.f129894a, aVar.f129894a) == 0 && C89219l.m154714a(this.f129895b, aVar.f129895b) && Float.compare(this.f129896c, aVar.f129896c) == 0 && Float.compare(this.f129897d, aVar.f129897d) == 0 && this.f129898e == aVar.f129898e && Float.compare(this.f129899f, aVar.f129899f) == 0;
    }

    public final String toString() {
        return "Shadow(blurRadius=" + this.f129894a + ", blur=" + this.f129895b + ", dx=" + this.f129896c + ", dy=" + this.f129897d + ", shadowColor=" + this.f129898e + ", radius=" + this.f129899f + ")";
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.f129894a) * 31;
        BlurMaskFilter.Blur blur = this.f129895b;
        if (blur != null) {
            i = blur.hashCode();
        } else {
            i = 0;
        }
        return ((((((((floatToIntBits + i) * 31) + Float.floatToIntBits(this.f129896c)) * 31) + Float.floatToIntBits(this.f129897d)) * 31) + this.f129898e) * 31) + Float.floatToIntBits(this.f129899f);
    }

    public C57047a(float f, BlurMaskFilter.Blur blur, float f2, int i, float f3) {
        C89219l.m154721d(blur, "");
        this.f129894a = f;
        this.f129895b = blur;
        this.f129897d = f2;
        this.f129898e = i;
        this.f129899f = f3;
    }
}
