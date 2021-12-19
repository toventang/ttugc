package com.p2082ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.vealgorithm.params.VELensOneKeyHdrResult */
public class VELensOneKeyHdrResult extends VEAlgorithmResult {
    public static int SCENE_MODE_CASE_ABNORMAL = 20003;
    public static int SCENE_MODE_CASE_COMMON = 20001;
    public static int SCENE_MODE_CASE_NIGHT = 20004;
    public static int SCENE_MODE_CASE_WITH_NOISE = 20002;
    public int scene;

    public VELensOneKeyHdrResult() {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_ONE_KEY_HDR;
    }

    static {
        Covode.recordClassIndex(37367);
    }

    public VELensOneKeyHdrResult(int i) {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_ONE_KEY_HDR;
        this.scene = i;
    }
}
