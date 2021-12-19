package com.p2082ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.lens.algorithm.OnekeyRec */
public class OnekeyRec {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101192);
    }

    private native int nativeGetOnekeyRecOutput(long j);

    private native long nativeInitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2);

    private native int nativeOnekeyRecProcess(long j, int i, int i2, int i3, float[] fArr, boolean z);

    private native void nativeReleaseOnekeyRec(long j);

    public int GetOnekeyRecOutput() {
        MethodCollector.m26663i(4944);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4944);
            return -1;
        }
        int nativeGetOnekeyRecOutput = nativeGetOnekeyRecOutput(j);
        MethodCollector.m26664o(4944);
        return nativeGetOnekeyRecOutput;
    }

    public void ReleaseOnekeyRec() {
        MethodCollector.m26663i(4957);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(4957);
            return;
        }
        nativeReleaseOnekeyRec(j);
        MethodCollector.m26664o(4957);
    }

    /* renamed from: com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147892x943538d8(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public int OnekeyRecProcess(int i, int i2, int i3, float[] fArr, boolean z) {
        MethodCollector.m26663i(4884);
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            MethodCollector.m26664o(4884);
            return -1;
        }
        int nativeOnekeyRecProcess = nativeOnekeyRecProcess(j, i, i2, i3, fArr, z);
        MethodCollector.m26664o(4884);
        return nativeOnekeyRecProcess;
    }

    public synchronized boolean InitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2) {
        MethodCollector.m26663i(4806);
        if (!isLibLoaded) {
            try {
                m147892x943538d8("c++_shared");
                m147892x943538d8("bytenn");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                m147892x943538d8("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(4806);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.m26664o(4806);
            return false;
        }
        long nativeInitOnekeyRec = nativeInitOnekeyRec(str, z, z2, z3, z4, z5, z6, i, i2);
        this.mNativePtr = nativeInitOnekeyRec;
        if (nativeInitOnekeyRec == 0) {
            MethodCollector.m26664o(4806);
            return false;
        }
        MethodCollector.m26664o(4806);
        return true;
    }
}
