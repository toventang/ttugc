package com.p2082ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.vealgorithm.params.VEBorderDetectParam */
public class VEBorderDetectParam extends VEAlgorithmParam {
    public String path;

    static {
        Covode.recordClassIndex(37363);
    }

    public VEBorderDetectParam() {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_BORDER_DETECT;
    }
}
