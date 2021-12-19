package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.model.VEAlgorithmResult;

/* renamed from: com.ss.android.ttve.nativePort.VEAlgorithmCallback */
public interface VEAlgorithmCallback {
    static {
        Covode.recordClassIndex(37316);
    }

    void onFailed(int i);

    void onResult(VEAlgorithmResult vEAlgorithmResult);
}
