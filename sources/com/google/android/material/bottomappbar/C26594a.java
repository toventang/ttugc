package com.google.android.material.bottomappbar;

import com.bytedance.covode.number.Covode;
import com.google.android.material.p1960i.C26649b;
import com.google.android.material.p1960i.C26651d;

/* renamed from: com.google.android.material.bottomappbar.a */
public final class C26594a extends C26649b {

    /* renamed from: a */
    public float f62829a;

    /* renamed from: b */
    public float f62830b;

    /* renamed from: c */
    public float f62831c;

    /* renamed from: d */
    public float f62832d;

    /* renamed from: e */
    public float f62833e;

    static {
        Covode.recordClassIndex(32036);
    }

    @Override // com.google.android.material.p1960i.C26649b
    /* renamed from: a */
    public final void mo43896a(float f, float f2, C26651d dVar) {
        float f3 = this.f62831c;
        if (f3 == 0.0f) {
            dVar.mo44114a(f);
            return;
        }
        float f4 = ((this.f62830b * 2.0f) + f3) / 2.0f;
        float f5 = f2 * this.f62829a;
        float f6 = (f / 2.0f) + this.f62833e;
        float f7 = (this.f62832d * f2) + ((1.0f - f2) * f4);
        if (f7 / f4 >= 1.0f) {
            dVar.mo44114a(f);
            return;
        }
        float f8 = f4 + f5;
        float f9 = f7 + f5;
        float sqrt = (float) Math.sqrt((double) ((f8 * f8) - (f9 * f9)));
        float f10 = f6 - sqrt;
        float f11 = f6 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f9)));
        float f12 = 90.0f - degrees;
        float f13 = f10 - f5;
        dVar.mo44114a(f13);
        float f14 = f5 * 2.0f;
        dVar.mo44115a(f13, 0.0f, f10 + f5, f14, 270.0f, degrees);
        dVar.mo44115a(f6 - f4, (-f4) - f7, f6 + f4, f4 - f7, 180.0f - f12, (f12 * 2.0f) - 180.0f);
        dVar.mo44115a(f11 - f5, 0.0f, f11 + f5, f14, 270.0f - degrees, degrees);
        dVar.mo44114a(f);
    }
}
