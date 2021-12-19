package com.bytedance.android.ecommerce.ocr.p166a;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.j */
public class C2867j extends AbstractC2869l {

    /* renamed from: a */
    private static final String f8531a = C2867j.class.getSimpleName();

    /* renamed from: a */
    private static float m8145a(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    static {
        Covode.recordClassIndex(3293);
    }

    @Override // com.bytedance.android.ecommerce.ocr.p166a.AbstractC2869l
    /* renamed from: b */
    public final Rect mo7458b(C2871m mVar, C2871m mVar2) {
        return new Rect(0, 0, mVar2.f8535a, mVar2.f8536b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.ecommerce.ocr.p166a.AbstractC2869l
    /* renamed from: a */
    public final float mo7457a(C2871m mVar, C2871m mVar2) {
        if (mVar.f8535a <= 0 || mVar.f8536b <= 0) {
            return 0.0f;
        }
        float a = (1.0f / m8145a((((float) mVar.f8535a) * 1.0f) / ((float) mVar2.f8535a))) / m8145a((((float) mVar.f8536b) * 1.0f) / ((float) mVar2.f8536b));
        float a2 = m8145a(((((float) mVar.f8535a) * 1.0f) / ((float) mVar.f8536b)) / ((((float) mVar2.f8535a) * 1.0f) / ((float) mVar2.f8536b)));
        return a * (((1.0f / a2) / a2) / a2);
    }
}
