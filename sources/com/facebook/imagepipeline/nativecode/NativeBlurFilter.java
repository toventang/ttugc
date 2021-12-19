package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imageutils.C24658b;

public class NativeBlurFilter {
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        Covode.recordClassIndex(28777);
        C24658b.m47175a("native-filters");
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        boolean z;
        MethodCollector.m26663i(13250);
        C24091i.m45617a(bitmap);
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i2 <= 0) {
            z2 = false;
        }
        C24091i.m45620a(z2);
        nativeIterativeBoxBlur(bitmap, i, i2);
        MethodCollector.m26664o(13250);
    }
}
