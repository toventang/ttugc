package com.p2082ss.android.ugc.aweme.services.external.ability.camera;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.camera.IAVESCameraInterface */
public interface IAVESCameraInterface {
    public static final int[] CameraHWLevelAndroid2VE = {1, 2, 0, 3};
    public static final int[] CameraHWLevelVE2Android = {2, 0, 1, 3};

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.camera.IAVESCameraInterface$CameraErrorCode */
    public static class CameraErrorCode {
        static {
            Covode.recordClassIndex(79839);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.camera.IAVESCameraInterface$CameraRatio */
    public enum CameraRatio {
        RATIO_18x9,
        RATIO_16x9,
        RATIO_4x3;

        static {
            Covode.recordClassIndex(79840);
        }
    }

    static {
        Covode.recordClassIndex(79838);
    }
}
