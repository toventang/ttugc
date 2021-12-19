package com.p2082ss.android.ugc.asve.recorder.camera;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VECameraSettings;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.i */
public final class C31190i {
    static {
        Covode.recordClassIndex(37835);
    }

    /* renamed from: a */
    public static final VECameraSettings.CAMERA_FACING_ID m64683a(int i) {
        if (i == 0) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        }
        if (i == 1) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        }
        if (i == 2) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
        }
        if (i == 3) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_3RD;
        }
        throw new IllegalStateException();
    }
}
