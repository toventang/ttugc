package com.p2082ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.lens.algorithm.VideoVFI */
public class VideoVFI {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101196);
    }

    private native int nativeGetVideoVFIOutput(long j);

    private native long nativeInitVideoVFI(String str, int i, int i2, int i3, boolean z);

    private native void nativeReleaseVideoVFI(long j);

    private native int nativeVideoVFIOesProcess(long j, int i, int i2, int i3, int i4, int i5, float f, float[] fArr, boolean z);

    private native int nativeVideoVFIProcess(long j, int i, int i2, int i3, int i4, int i5, float f, boolean z);

    public int GetVideoVFIOutput() {
        MethodCollector.m26663i(4807);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4807);
            return -1;
        }
        int nativeGetVideoVFIOutput = nativeGetVideoVFIOutput(j);
        MethodCollector.m26664o(4807);
        return nativeGetVideoVFIOutput;
    }

    public void ReleaseVideoVFI() {
        MethodCollector.m26663i(4869);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4869);
            return;
        }
        nativeReleaseVideoVFI(j);
        MethodCollector.m26664o(4869);
    }

    /* renamed from: com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147897xf7574431(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public synchronized boolean InitVideoVFI(String str, int i, int i2, int i3, boolean z) {
        MethodCollector.m26663i(4638);
        if (!isLibLoaded) {
            try {
                m147897xf7574431("lens");
                m147897xf7574431("bytenn");
                try {
                    m147897xf7574431("lens");
                    isLibLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                    MethodCollector.m26664o(4638);
                    return false;
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(4638);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.m26664o(4638);
            return false;
        }
        long nativeInitVideoVFI = nativeInitVideoVFI(str, i, i2, i3, z);
        this.mNativePtr = nativeInitVideoVFI;
        if (nativeInitVideoVFI == 0) {
            MethodCollector.m26664o(4638);
            return false;
        }
        MethodCollector.m26664o(4638);
        return true;
    }

    public int VideoVFIProcess(int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        MethodCollector.m26663i(4764);
        long j = this.mNativePtr;
        if (j == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.m26664o(4764);
            return -1;
        }
        int nativeVideoVFIProcess = nativeVideoVFIProcess(j, i, i2, i3, i4, i5, f, z);
        MethodCollector.m26664o(4764);
        return nativeVideoVFIProcess;
    }

    public int VideoVFIOesProcess(int i, int i2, int i3, int i4, int i5, float f, float[] fArr, boolean z) {
        MethodCollector.m26663i(4759);
        long j = this.mNativePtr;
        if (j == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.m26664o(4759);
            return -1;
        }
        int nativeVideoVFIOesProcess = nativeVideoVFIOesProcess(j, i, i2, i3, i4, i5, f, fArr, z);
        MethodCollector.m26664o(4759);
        return nativeVideoVFIOesProcess;
    }
}
