package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.p2082ss.android.ttve.lensAlgorithm.VEBaseLensResults;
import com.p2082ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults;
import com.p2082ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig;
import com.p2082ss.android.ttve.nativePort.TELensAlgorithm;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.vesdk.VELensAlgorithm */
public class VELensAlgorithm {
    private TELensAlgorithm mLensHandle = new TELensAlgorithm();

    static {
        Covode.recordClassIndex(99296);
    }

    public int destroy() {
        return this.mLensHandle.mo55366b();
    }

    public int init() {
        return this.mLensHandle.mo55365a();
    }

    public VEBaseLensResults getAlgorithmResults(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, VEListener.AbstractC85257z zVar) {
        MethodCollector.m26663i(12425);
        VELensCallBacks vELensCallBacks = new VELensCallBacks();
        vELensCallBacks.setmLensStateListener(zVar);
        TELensAlgorithm tELensAlgorithm = this.mLensHandle;
        if (tELensAlgorithm.f73438a <= 0 || vEBaseLensAlgorithmConfig.algorithmFlag != 16) {
            MethodCollector.m26664o(12425);
            return null;
        }
        VELensVideoStabResults nativeGetVideoStabResult = tELensAlgorithm.nativeGetVideoStabResult(tELensAlgorithm.f73438a, vELensCallBacks, (VEVideoStabConfig) vEBaseLensAlgorithmConfig);
        MethodCollector.m26664o(12425);
        return nativeGetVideoStabResult;
    }
}
