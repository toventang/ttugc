package com.p2082ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.vealgorithm.params.VEBachCommonImageParam */
public class VEBachCommonImageParam extends VEAlgorithmParam {
    public int algorithmType = VEBachCommonImageType.VEBachAlgorithmTypeNone;
    public String path;

    static {
        Covode.recordClassIndex(37360);
    }

    public VEBachCommonImageParam() {
        this.type = VEAlgorithmType.VEAlgorithmTypeBachCommonImage;
    }
}
