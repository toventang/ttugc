package com.p2082ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.lens.algorithm.AdaptiveSharpen */
public class AdaptiveSharpen {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101190);
    }

    private native int nativeAdaptiveSharpenProcess(long j, int i, int i2, int i3, float[] fArr, boolean z, int i4, float f, float f2, float f3, int i5);

    private native int nativeGetAdaptiveSharpenOutput(long j);

    private native long nativeInitAdaptiveSharpen(boolean z, int i, int i2, int i3);

    private native void nativeReleaseAdaptiveSharpen(long j);

    public int GetAdaptiveSharpenOutput() {
        MethodCollector.m26663i(6435);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(6435);
            return -1;
        }
        int nativeGetAdaptiveSharpenOutput = nativeGetAdaptiveSharpenOutput(j);
        MethodCollector.m26664o(6435);
        return nativeGetAdaptiveSharpenOutput;
    }

    public void ReleaseAdaptiveSharpen() {
        MethodCollector.m26663i(6570);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(6570);
            return;
        }
        nativeReleaseAdaptiveSharpen(j);
        MethodCollector.m26664o(6570);
    }

    /* renamed from: com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147891x5e065472(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public synchronized boolean InitAdaptiveSharpen(boolean z, int i, int i2, int i3) {
        MethodCollector.m26663i(6272);
        if (!isLibLoaded) {
            try {
                m147891x5e065472("c++_shared");
                m147891x5e065472("bytenn");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                m147891x5e065472("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(6272);
                return false;
            }
        }
        long nativeInitAdaptiveSharpen = nativeInitAdaptiveSharpen(z, i, i2, i3);
        this.mNativePtr = nativeInitAdaptiveSharpen;
        if (nativeInitAdaptiveSharpen == 0) {
            MethodCollector.m26664o(6272);
            return false;
        }
        MethodCollector.m26664o(6272);
        return true;
    }

    public int AdaptiveSharpenProcess(int i, int i2, int i3, boolean z, int i4, float f, float f2, float f3, int i5) {
        MethodCollector.m26663i(6275);
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            MethodCollector.m26664o(6275);
            return -1;
        }
        int nativeAdaptiveSharpenProcess = nativeAdaptiveSharpenProcess(j, i, i2, i3, null, z, i4, f, f2, f3, i5);
        MethodCollector.m26664o(6275);
        return nativeAdaptiveSharpenProcess;
    }

    public int AdaptiveSharpenOesProcess(int i, int i2, int i3, float[] fArr, boolean z, int i4, float f, float f2, float f3, int i5) {
        MethodCollector.m26663i(6274);
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            MethodCollector.m26664o(6274);
            return -1;
        }
        int nativeAdaptiveSharpenProcess = nativeAdaptiveSharpenProcess(j, i, i2, i3, fArr, z, i4, f, f2, f3, i5);
        MethodCollector.m26664o(6274);
        return nativeAdaptiveSharpenProcess;
    }
}
