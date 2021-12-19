package com.p2082ss.android.ttve.lensAlgorithm.videoStable;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;

/* renamed from: com.ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig */
public class VEVideoStabConfig extends VEBaseLensAlgorithmConfig {
    public String filePath;
    public int length;
    public float[] videoStabMaxCropRatio;
    public int[] videoStabMotionType;
    public int[] videoStabSmoothRadius;

    static {
        Covode.recordClassIndex(37200);
    }
}
