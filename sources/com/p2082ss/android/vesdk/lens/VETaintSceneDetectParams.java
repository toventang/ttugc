package com.p2082ss.android.vesdk.lens;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.lens.VETaintSceneDetectParams */
public class VETaintSceneDetectParams extends VEBaseRecorderLensParams {
    public int backendType;
    public int detectFrequency = 3;
    public int detectRepeatNum = 1;
    public String kernelBinPath;
    public String modelPath;
    public int numThread = 2;

    static {
        Covode.recordClassIndex(99690);
    }
}
