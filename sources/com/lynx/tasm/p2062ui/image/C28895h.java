package com.lynx.tasm.p2062ui.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;

/* renamed from: com.lynx.tasm.ui.image.h */
public final class C28895h implements C24229q.AbstractC24231b {
    static {
        Covode.recordClassIndex(35018);
    }

    @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24231b
    /* renamed from: a */
    public final Matrix mo39936a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        float width = ((float) rect.width()) / ((float) i);
        float height = ((float) rect.height()) / ((float) i2);
        float max = Math.max(width, height);
        float f3 = (float) rect.left;
        float f4 = (float) rect.top;
        if (width > height) {
            matrix.postTranslate(f3, 0.0f);
        } else {
            matrix.postTranslate(0.0f, f4);
        }
        matrix.setScale(max, max);
        return matrix;
    }
}
