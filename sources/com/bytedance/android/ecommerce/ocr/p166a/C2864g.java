package com.bytedance.android.ecommerce.ocr.p166a;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.g */
public class C2864g extends AbstractC2869l {

    /* renamed from: a */
    private static final String f8525a = C2864g.class.getSimpleName();

    static {
        Covode.recordClassIndex(3290);
    }

    @Override // com.bytedance.android.ecommerce.ocr.p166a.AbstractC2869l
    /* renamed from: b */
    public final Rect mo7458b(C2871m mVar, C2871m mVar2) {
        C2871m b = mVar.mo7464b(mVar2);
        int i = (b.f8535a - mVar2.f8535a) / 2;
        int i2 = (b.f8536b - mVar2.f8536b) / 2;
        return new Rect(-i, -i2, b.f8535a - i, b.f8536b - i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.ecommerce.ocr.p166a.AbstractC2869l
    /* renamed from: a */
    public final float mo7457a(C2871m mVar, C2871m mVar2) {
        if (mVar.f8535a <= 0 || mVar.f8536b <= 0) {
            return 0.0f;
        }
        C2871m b = mVar.mo7464b(mVar2);
        float f = (((float) b.f8535a) * 1.0f) / ((float) mVar.f8535a);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) b.f8535a) * 1.0f) / ((float) mVar2.f8535a)) + ((((float) b.f8536b) * 1.0f) / ((float) mVar2.f8536b));
        return f * ((1.0f / f2) / f2);
    }
}
