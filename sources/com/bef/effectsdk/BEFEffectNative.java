package com.bef.effectsdk;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.Arrays;
import java.util.List;

public class BEFEffectNative {
    private static final List<String> list;

    private static native long nativeCreateHandle(boolean z);

    private static native int nativeDestroyHandle(long j);

    private static native String nativeGetEffectSDKVersion();

    private static native int nativeInitResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str);

    private static native int nativeProcessAlgorithm(long j, int i, int i2, int i3, double d);

    private static native int nativeProcessFrame(long j, int i, int i2, int i3, int i4, double d);

    private static native int nativeReleaseResourceFinder(long j, ResourceFinder resourceFinder);

    private static native int nativeSendMessage(long j, long j2, long j3, long j4, String str);

    private static native void nativeSetCameraPosition(long j, boolean z);

    private static native void nativeSetFrameOrientation(long j, int i);

    private static native void nativeSetOrientation(long j, int i);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    public static String getEffectSDKVersion() {
        MethodCollector.m26663i(4268);
        String nativeGetEffectSDKVersion = nativeGetEffectSDKVersion();
        MethodCollector.m26664o(4268);
        return nativeGetEffectSDKVersion;
    }

    static {
        Covode.recordClassIndex(2663);
        List<String> asList = Arrays.asList("effect");
        list = asList;
        try {
            for (String str : asList) {
                m7231x41a2eea4(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com_bef_effectsdk_BEFEffectNative_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m7231x41a2eea4(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static long createHandle(boolean z) {
        MethodCollector.m26663i(4272);
        long nativeCreateHandle = nativeCreateHandle(z);
        MethodCollector.m26664o(4272);
        return nativeCreateHandle;
    }

    public static int destroyHandle(long j) {
        MethodCollector.m26663i(4721);
        int nativeDestroyHandle = nativeDestroyHandle(j);
        MethodCollector.m26664o(4721);
        return nativeDestroyHandle;
    }

    public static int releaseResourceFinder(long j, ResourceFinder resourceFinder) {
        MethodCollector.m26663i(4727);
        int nativeReleaseResourceFinder = nativeReleaseResourceFinder(j, resourceFinder);
        MethodCollector.m26664o(4727);
        return nativeReleaseResourceFinder;
    }

    public static void setCameraPosition(long j, boolean z) {
        MethodCollector.m26663i(4743);
        nativeSetCameraPosition(j, z);
        MethodCollector.m26664o(4743);
    }

    public static void setFrameOrientation(long j, int i) {
        MethodCollector.m26663i(5030);
        nativeSetFrameOrientation(j, i);
        MethodCollector.m26664o(5030);
    }

    public static void setOrientation(long j, int i) {
        MethodCollector.m26663i(5029);
        nativeSetOrientation(j, i);
        MethodCollector.m26664o(5029);
    }

    public static int setStickerPath(long j, String str) {
        MethodCollector.m26663i(4728);
        int nativeSetStickerPath = nativeSetStickerPath(j, str);
        MethodCollector.m26664o(4728);
        return nativeSetStickerPath;
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(5115);
        int nativeTouchEvent = nativeTouchEvent(j, 0, iArr, fArr, fArr2);
        MethodCollector.m26664o(5115);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(5901);
        int nativeTouchEvent = nativeTouchEvent(j, 2, iArr, fArr, fArr2);
        MethodCollector.m26664o(5901);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(5899);
        int nativeTouchEvent = nativeTouchEvent(j, 1, iArr, fArr, fArr2);
        MethodCollector.m26664o(5899);
        return nativeTouchEvent;
    }

    public static int initResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str) {
        MethodCollector.m26663i(4724);
        int nativeInitResourceFinder = nativeInitResourceFinder(j, resourceFinder, i, i2, str);
        MethodCollector.m26664o(4724);
        return nativeInitResourceFinder;
    }

    public static int processAlgorithm(long j, int i, int i2, int i3, double d) {
        MethodCollector.m26663i(4734);
        int nativeProcessAlgorithm = nativeProcessAlgorithm(j, i, i2, i3, d);
        MethodCollector.m26664o(4734);
        return nativeProcessAlgorithm;
    }

    public static int sendMessage(long j, long j2, long j3, long j4, String str) {
        MethodCollector.m26663i(4740);
        int nativeSendMessage = nativeSendMessage(j, j2, j3, j4, str);
        MethodCollector.m26664o(4740);
        return nativeSendMessage;
    }

    public static int processFrame(long j, int i, int i2, int i3, int i4, double d) {
        MethodCollector.m26663i(4737);
        int nativeProcessFrame = nativeProcessFrame(j, i, i2, i3, i4, d);
        MethodCollector.m26664o(4737);
        return nativeProcessFrame;
    }
}
