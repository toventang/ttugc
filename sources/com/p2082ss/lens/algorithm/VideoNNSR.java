package com.p2082ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.lens.algorithm.VideoNNSR */
public class VideoNNSR {
    private long mNativePtr;

    private native int nativeGetVideoNNSrOutput(long j);

    private native long nativeInitVideoNNSr(int i, int i2, String str, String str2, String str3, boolean z);

    private native void nativeReleaseVideoNNSr(long j);

    private native int nativeVideoNNSrOesProcess(long j, int i, float[] fArr, boolean z);

    private native int nativeVideoNNSrProcess(long j, int i, boolean z);

    static {
        Covode.recordClassIndex(101194);
        try {
            m147895x9b1ec6b5("lens");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public int GetVideoNNSrOutput() {
        MethodCollector.m26663i(4625);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4625);
            return -1;
        }
        int nativeGetVideoNNSrOutput = nativeGetVideoNNSrOutput(j);
        MethodCollector.m26664o(4625);
        return nativeGetVideoNNSrOutput;
    }

    public void ReleaseVideoNNSr() {
        MethodCollector.m26663i(4628);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4628);
            return;
        }
        nativeReleaseVideoNNSr(j);
        MethodCollector.m26664o(4628);
    }

    /* renamed from: com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147895x9b1ec6b5(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public int VideoNNSrProcess(int i, boolean z) {
        MethodCollector.m26663i(4621);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4621);
            return -1;
        }
        int nativeVideoNNSrProcess = nativeVideoNNSrProcess(j, i, z);
        MethodCollector.m26664o(4621);
        return nativeVideoNNSrProcess;
    }

    public int VideoNNSrOesProcess(int i, float[] fArr, boolean z) {
        MethodCollector.m26663i(4562);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4562);
            return -1;
        }
        int nativeVideoNNSrOesProcess = nativeVideoNNSrOesProcess(j, i, fArr, z);
        MethodCollector.m26664o(4562);
        return nativeVideoNNSrOesProcess;
    }

    public boolean InitVideoNNSr(int i, int i2, String str, String str2, String str3, boolean z) {
        MethodCollector.m26663i(4558);
        if (i <= 0 || i2 <= 0 || str.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
            MethodCollector.m26664o(4558);
            return false;
        }
        long nativeInitVideoNNSr = nativeInitVideoNNSr(i, i2, str, str2, str3, z);
        this.mNativePtr = nativeInitVideoNNSr;
        if (nativeInitVideoNNSr == 0) {
            MethodCollector.m26664o(4558);
            return false;
        }
        MethodCollector.m26664o(4558);
        return true;
    }
}
