package com.bef.effectsdk;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ImgporcUtils {

    public static class InterpolationFlags {
        static {
            Covode.recordClassIndex(2692);
        }
    }

    static {
        Covode.recordClassIndex(2691);
    }

    private static native float nativeCalculateAspectRatio(PointF[] pointFArr, int i, int i2);

    private static native Bitmap nativeCorrectPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2, int i3);

    public static float calculateAspectRatio(PointF[] pointFArr, int i, int i2) {
        MethodCollector.m26663i(3085);
        float nativeCalculateAspectRatio = nativeCalculateAspectRatio(pointFArr, i, i2);
        MethodCollector.m26664o(3085);
        return nativeCalculateAspectRatio;
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2) {
        MethodCollector.m26663i(3082);
        Bitmap nativeCorrectPerspective = nativeCorrectPerspective(bitmap, pointFArr, i, i2, 1);
        MethodCollector.m26664o(3082);
        return nativeCorrectPerspective;
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2, int i3) {
        MethodCollector.m26663i(3080);
        Bitmap nativeCorrectPerspective = nativeCorrectPerspective(bitmap, pointFArr, i, i2, i3);
        MethodCollector.m26664o(3080);
        return nativeCorrectPerspective;
    }
}
