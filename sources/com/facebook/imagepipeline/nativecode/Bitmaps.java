package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imageutils.C24658b;

public class Bitmaps {
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        Covode.recordClassIndex(28775);
        C24658b.m47175a("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        MethodCollector.m26663i(3502);
        boolean z3 = true;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        C24091i.m45620a(bitmap.isMutable());
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45620a(z2);
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z3 = false;
        }
        C24091i.m45620a(z3);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
        MethodCollector.m26664o(3502);
    }
}
