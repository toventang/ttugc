package com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a;

import android.graphics.Rect;
import android.hardware.Camera;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.ecommerce.ocr.c.a.a.a */
public final class C2878a {

    /* renamed from: a */
    private static final Pattern f8557a = Pattern.compile(";");

    static {
        Covode.recordClassIndex(3304);
    }

    /* renamed from: a */
    public static List<Camera.Area> m8163a() {
        return Collections.singletonList(new Camera.Area(new Rect(-400, -400, 400, 400), 1));
    }

    /* renamed from: a */
    public static void m8164a(Camera.Parameters parameters) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (!(supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty())) {
            for (int[] iArr : supportedPreviewFpsRange) {
                int i = iArr[0];
                int i2 = iArr[1];
                if (i >= 10000 && i2 <= 20000) {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (!Arrays.equals(iArr2, iArr)) {
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static String m8162a(Collection<String> collection, String... strArr) {
        if (collection == null) {
            return null;
        }
        for (String str : strArr) {
            if (collection.contains(str)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m8165a(Camera.Parameters parameters, boolean z) {
        String a;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            a = m8162a(supportedFlashModes, "torch", "on");
        } else {
            a = m8162a(supportedFlashModes, "off");
        }
        if (a != null && !a.equals(parameters.getFlashMode())) {
            parameters.setFlashMode(a);
        }
    }
}
