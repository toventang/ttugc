package com.p2082ss.android.ttve.vealgorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.vealgorithm.params.VEAlgorithmParam;
import com.p2082ss.android.ttve.vealgorithm.params.VEAlgorithmResult;
import com.p2082ss.android.ttve.vealgorithm.params.VEAlgorithmType;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.ttve.vealgorithm.VEAlgorithm */
public class VEAlgorithm {
    private VEListener.AbstractC85233b mErrorListener;
    private long mHandle;
    private VEListener.AbstractC85234c mListener;

    static {
        Covode.recordClassIndex(37356);
    }

    public native int nativeAlgorithmCancel(long j);

    public native long nativeAlgorithmCreate(Object obj);

    public native int nativeAlgorithmDestroy(long j);

    public native Object nativeAlgorithmGetResult(long j);

    public native int nativeAlgorithmStart(long j);

    public void nativeCallback_onError(int i, String str) {
    }

    public void nativeCallback_onProcess(float f, boolean z) {
    }

    public int cancel() {
        MethodCollector.m26663i(13239);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13239);
            return -112;
        }
        int nativeAlgorithmCancel = nativeAlgorithmCancel(j);
        MethodCollector.m26664o(13239);
        return nativeAlgorithmCancel;
    }

    public int destroy() {
        MethodCollector.m26663i(13305);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13305);
            return -112;
        }
        int nativeAlgorithmDestroy = nativeAlgorithmDestroy(j);
        this.mHandle = 0;
        MethodCollector.m26664o(13305);
        return nativeAlgorithmDestroy;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.mHandle != 0) {
            C85315al.m146642d("VEAlgorithm", "not destroy algorithm object:" + this.mHandle);
        }
    }

    public VEAlgorithmResult getResult() {
        MethodCollector.m26663i(13240);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13240);
            return null;
        }
        VEAlgorithmResult vEAlgorithmResult = (VEAlgorithmResult) nativeAlgorithmGetResult(j);
        MethodCollector.m26664o(13240);
        return vEAlgorithmResult;
    }

    public int start() {
        MethodCollector.m26663i(13176);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13176);
            return -112;
        }
        int nativeAlgorithmStart = nativeAlgorithmStart(j);
        MethodCollector.m26664o(13176);
        return nativeAlgorithmStart;
    }

    public void setErrorListener(VEListener.AbstractC85233b bVar) {
        this.mErrorListener = bVar;
    }

    public void setProcessListener(VEListener.AbstractC85234c cVar) {
        this.mListener = cVar;
    }

    public int init(VEAlgorithmParam vEAlgorithmParam) {
        MethodCollector.m26663i(13111);
        int i = vEAlgorithmParam.type;
        if (i == VEAlgorithmType.VE_ALGORITHM_TYPE_INVALID) {
            C85315al.m146642d("VEAlgorithm", "invalid algorithm type:".concat(String.valueOf(i)));
            MethodCollector.m26664o(13111);
            return -100;
        }
        long nativeAlgorithmCreate = nativeAlgorithmCreate(vEAlgorithmParam);
        this.mHandle = nativeAlgorithmCreate;
        if (nativeAlgorithmCreate == 0) {
            C85315al.m146642d("VEAlgorithm", "nativeAlgorithmCreate failed!");
            MethodCollector.m26664o(13111);
            return -1;
        }
        MethodCollector.m26664o(13111);
        return 0;
    }
}
