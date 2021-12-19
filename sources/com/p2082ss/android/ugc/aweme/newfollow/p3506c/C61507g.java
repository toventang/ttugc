package com.p2082ss.android.ugc.aweme.newfollow.p3506c;

import android.graphics.Matrix;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.newfollow.c.g */
public final class C61507g {
    static {
        Covode.recordClassIndex(72164);
    }

    /* renamed from: a */
    public static void m111369a(int i, int i2, TextureView textureView, float f) {
        float f2;
        if (i2 > 0 && i > 0 && f > 0.0f) {
            float f3 = ((float) i2) / ((float) i);
            float f4 = 1.0f;
            if (f3 > f) {
                f4 = f3 / f;
                f2 = 1.0f;
            } else {
                f2 = f / f3;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f4, f2, (float) (i / 2), (float) (i2 / 2));
            textureView.setTransform(matrix);
        }
    }
}
