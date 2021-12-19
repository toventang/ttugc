package com.bef.effectsdk.game;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.Arrays;
import java.util.List;

public class NativeInterface {
    private static final List<String> list;

    interface NativeMessageListener {
        static {
            Covode.recordClassIndex(2722);
        }

        int nativeOnMsgReceived(long j, long j2, long j3, String str);
    }

    private static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native void nativeCreateHandle(long[] jArr);

    private static native int nativeDestroy(long j);

    private static native int nativeInit(long j, int i, int i2);

    private static native int nativePause(long j);

    private static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    private static native int nativeProcess(long j, int i, int i2, double d);

    private static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeResume(long j);

    private static native int nativeSetSize(long j, int i, int i2);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesMove(long j, int[] iArr, float[] fArr, float[] fArr2);

    static {
        Covode.recordClassIndex(2721);
        List<String> asList = Arrays.asList("effect");
        list = asList;
        try {
            for (String str : asList) {
                m7252x6308901a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com_bef_effectsdk_game_NativeInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m7252x6308901a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static void createHandle(long[] jArr) {
        MethodCollector.m26663i(3263);
        nativeCreateHandle(jArr);
        MethodCollector.m26664o(3263);
    }

    public static int destroy(long j) {
        MethodCollector.m26663i(3591);
        int nativeDestroy = nativeDestroy(j);
        MethodCollector.m26664o(3591);
        return nativeDestroy;
    }

    public static int pause(long j) {
        MethodCollector.m26663i(3332);
        int nativePause = nativePause(j);
        MethodCollector.m26664o(3332);
        return nativePause;
    }

    public static int resume(long j) {
        MethodCollector.m26663i(3464);
        int nativeResume = nativeResume(j);
        MethodCollector.m26664o(3464);
        return nativeResume;
    }

    public static int addMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m26663i(3607);
        int nativeAddMessageListener = nativeAddMessageListener(j, nativeMessageListener);
        MethodCollector.m26664o(3607);
        return nativeAddMessageListener;
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m26663i(3614);
        int nativeRemoveMessageListener = nativeRemoveMessageListener(j, nativeMessageListener);
        MethodCollector.m26664o(3614);
        return nativeRemoveMessageListener;
    }

    public static int setGameBundlePath(long j, String str) {
        MethodCollector.m26663i(3268);
        int nativeSetStickerPath = nativeSetStickerPath(j, str);
        MethodCollector.m26664o(3268);
        return nativeSetStickerPath;
    }

    public static int init(long j, int i, int i2) {
        MethodCollector.m26663i(3266);
        int nativeInit = nativeInit(j, i, i2);
        MethodCollector.m26664o(3266);
        return nativeInit;
    }

    public static int setSize(long j, int i, int i2) {
        MethodCollector.m26663i(3269);
        int nativeSetSize = nativeSetSize(j, i, i2);
        MethodCollector.m26664o(3269);
        return nativeSetSize;
    }

    public static int processFrame(long j, int i, int i2, double d) {
        MethodCollector.m26663i(3328);
        int nativeProcess = nativeProcess(j, i, i2, d);
        MethodCollector.m26664o(3328);
        return nativeProcess;
    }

    public static int touchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(3597);
        int nativeTouchesBegin = nativeTouchesBegin(j, iArr, fArr, fArr2);
        MethodCollector.m26664o(3597);
        return nativeTouchesBegin;
    }

    public static int touchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(3600);
        int nativeTouchesEnd = nativeTouchesEnd(j, iArr, fArr, fArr2);
        MethodCollector.m26664o(3600);
        return nativeTouchesEnd;
    }

    public static int touchesMove(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(3599);
        int nativeTouchesMove = nativeTouchesMove(j, iArr, fArr, fArr2);
        MethodCollector.m26664o(3599);
        return nativeTouchesMove;
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        MethodCollector.m26663i(3605);
        int nativePostMessage = nativePostMessage(j, j2, j3, j4, str);
        MethodCollector.m26664o(3605);
        return nativePostMessage;
    }
}
