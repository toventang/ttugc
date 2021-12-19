package com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.p171a;

import android.hardware.Camera;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.c.a.a.a.a */
public final class C2879a {
    static {
        Covode.recordClassIndex(3305);
    }

    /* renamed from: a */
    public static int m8166a(int i) {
        boolean z;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        if (i < 0) {
            z = false;
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        } else {
            z = true;
        }
        if (i < numberOfCameras) {
            return i;
        }
        if (z) {
            return -1;
        }
        return 0;
    }
}
