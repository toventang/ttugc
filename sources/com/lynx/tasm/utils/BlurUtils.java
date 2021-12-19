package com.lynx.tasm.utils;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;

public class BlurUtils {
    static {
        Covode.recordClassIndex(35037);
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    public static void iterativeBoxBlur(Bitmap bitmap, int i) {
        MethodCollector.m26663i(3947);
        if (bitmap == null) {
            LLog.m56856a(5, "Blur", "bitmap is null");
            MethodCollector.m26664o(3947);
        } else if (i <= 0) {
            LLog.m56856a(5, "Blur", "radius <= 0");
            MethodCollector.m26664o(3947);
        } else {
            try {
                nativeIterativeBoxBlur(bitmap, 3, i);
                MethodCollector.m26664o(3947);
            } catch (RuntimeException e) {
                LLog.m56856a(5, "Blur", e.getMessage());
                MethodCollector.m26664o(3947);
            }
        }
    }
}
