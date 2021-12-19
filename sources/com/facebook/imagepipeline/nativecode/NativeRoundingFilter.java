package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imageutils.C24658b;

public class NativeRoundingFilter {
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    static {
        Covode.recordClassIndex(28779);
        C24658b.m47175a("native-filters");
    }

    public static void toCircle(Bitmap bitmap) {
        toCircle(bitmap, false);
    }

    public static void toCircle(Bitmap bitmap, boolean z) {
        MethodCollector.m26663i(13310);
        C24091i.m45617a(bitmap);
        nativeToCircleFilter(bitmap, z);
        MethodCollector.m26664o(13310);
    }

    public static void toCircleWithBorder(Bitmap bitmap, int i, int i2, boolean z) {
        MethodCollector.m26663i(13311);
        C24091i.m45617a(bitmap);
        nativeToCircleWithBorderFilter(bitmap, i, i2, z);
        MethodCollector.m26664o(13311);
    }
}
