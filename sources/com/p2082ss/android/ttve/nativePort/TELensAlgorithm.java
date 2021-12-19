package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults;
import com.p2082ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig;

/* renamed from: com.ss.android.ttve.nativePort.TELensAlgorithm */
public class TELensAlgorithm {

    /* renamed from: a */
    public long f73438a;

    private native long nativeCreateLensEngine();

    private native int nativeDestroyLensEngine(long j);

    public native VELensVideoStabResults nativeGetVideoStabResult(long j, Object obj, VEVideoStabConfig vEVideoStabConfig);

    static {
        Covode.recordClassIndex(37302);
        C30731d.m63114a();
    }

    /* renamed from: a */
    public final synchronized int mo55365a() {
        MethodCollector.m26663i(13442);
        long nativeCreateLensEngine = nativeCreateLensEngine();
        this.f73438a = nativeCreateLensEngine;
        if (nativeCreateLensEngine <= 0) {
            MethodCollector.m26664o(13442);
            return -112;
        }
        MethodCollector.m26664o(13442);
        return 0;
    }

    /* renamed from: b */
    public final synchronized int mo55366b() {
        MethodCollector.m26663i(13443);
        long j = this.f73438a;
        if (j <= 0) {
            MethodCollector.m26664o(13443);
            return -112;
        }
        int nativeDestroyLensEngine = nativeDestroyLensEngine(j);
        this.f73438a = 0;
        MethodCollector.m26664o(13443);
        return nativeDestroyLensEngine;
    }
}
