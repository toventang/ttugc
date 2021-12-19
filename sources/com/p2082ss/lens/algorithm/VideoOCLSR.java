package com.p2082ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.lens.algorithm.VideoOCLSR */
public class VideoOCLSR {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101195);
    }

    private native int nativeGetVideoOclSrOutput(long j);

    private native long nativeInitVideoOclSr(String str, int i, boolean z, boolean z2, int i2, int i3);

    private native void nativeReleaseVideoOclSr(long j);

    private native int nativeVideoOclSrOesProcess(long j, int i, int i2, int i3, float[] fArr, boolean z);

    private native int nativeVideoOclSrProcess(long j, int i, int i2, int i3, boolean z);

    public int GetVideoOclSrOutput() {
        MethodCollector.m26663i(6106);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(6106);
            return -1;
        }
        int nativeGetVideoOclSrOutput = nativeGetVideoOclSrOutput(j);
        MethodCollector.m26664o(6106);
        return nativeGetVideoOclSrOutput;
    }

    public void ReleaseVideoOclSr() {
        MethodCollector.m26663i(6263);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(6263);
            return;
        }
        nativeReleaseVideoOclSr(j);
        MethodCollector.m26664o(6263);
    }

    /* renamed from: com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147896xe4880573(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z) {
        MethodCollector.m26663i(5675);
        if (!isLibLoaded) {
            try {
                m147896xe4880573("c++_shared");
                m147896xe4880573("bytenn");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                m147896xe4880573("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(5675);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.m26664o(5675);
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, true, 720, 1440);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr == 0) {
            MethodCollector.m26664o(5675);
            return false;
        }
        MethodCollector.m26664o(5675);
        return true;
    }

    public int VideoOclSrProcess(int i, int i2, int i3, boolean z) {
        MethodCollector.m26663i(5952);
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            MethodCollector.m26664o(5952);
            return -1;
        }
        int nativeVideoOclSrProcess = nativeVideoOclSrProcess(j, i, i2, i3, z);
        MethodCollector.m26664o(5952);
        return nativeVideoOclSrProcess;
    }

    public int VideoOclSrOesProcess(int i, int i2, int i3, float[] fArr, boolean z) {
        MethodCollector.m26663i(5816);
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            MethodCollector.m26664o(5816);
            return -1;
        }
        int nativeVideoOclSrOesProcess = nativeVideoOclSrOesProcess(j, i, i2, i3, fArr, z);
        MethodCollector.m26664o(5816);
        return nativeVideoOclSrOesProcess;
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z, int i2, int i3) {
        MethodCollector.m26663i(5678);
        if (!isLibLoaded) {
            try {
                m147896xe4880573("c++_shared");
                m147896xe4880573("bytenn");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                m147896xe4880573("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(5678);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.m26664o(5678);
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, true, i2, i3);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr == 0) {
            MethodCollector.m26664o(5678);
            return false;
        }
        MethodCollector.m26664o(5678);
        return true;
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z, boolean z2, int i2, int i3) {
        MethodCollector.m26663i(5814);
        if (!isLibLoaded) {
            try {
                m147896xe4880573("c++_shared");
                m147896xe4880573("bytenn");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                m147896xe4880573("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(5814);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.m26664o(5814);
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, z2, i2, i3);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr == 0) {
            MethodCollector.m26664o(5814);
            return false;
        }
        MethodCollector.m26664o(5814);
        return true;
    }
}
