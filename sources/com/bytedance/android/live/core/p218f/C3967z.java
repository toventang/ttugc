package com.bytedance.android.live.core.p218f;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;

/* renamed from: com.bytedance.android.live.core.f.z */
public final class C3967z extends C24229q.AbstractC24230a {

    /* renamed from: a */
    public static final C3967z f10871a = new C3967z();

    private C3967z() {
    }

    static {
        Covode.recordClassIndex(4496);
    }

    @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
    /* renamed from: a */
    public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5;
        float height;
        if (rect != null) {
            float f6 = (float) i;
            float c = ((float) C3966y.m9664c()) / f6;
            float f7 = (float) i2;
            float b = ((float) C3966y.m9662b()) / f7;
            if (b > c) {
                f5 = ((float) rect.left) + ((((float) rect.width()) - (f6 * b)) * 0.5f);
                if (f2 == 0.0f || f2 != 1.0f) {
                    height = (float) rect.top;
                } else {
                    height = ((float) rect.top) + (((float) rect.height()) - (f7 * b));
                }
                c = b;
            } else {
                f5 = (float) rect.left;
                float f8 = f7 * c;
                float b2 = (((float) C3966y.m9662b()) - f8) * 0.5f;
                if (f2 == 0.0f) {
                    height = ((float) rect.top) + b2;
                } else if (f2 == 1.0f) {
                    height = ((float) rect.top) + ((Math.abs(b2) + ((float) rect.height())) - f8);
                } else {
                    height = ((float) rect.top) + ((((float) rect.height()) - f8) * 0.5f);
                }
            }
            if (matrix != null) {
                matrix.setScale(c, c);
                matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
            }
        }
    }
}
