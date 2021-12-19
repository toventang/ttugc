package com.bef.effectsdk.view;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.Arrays;
import java.util.List;

public class ViewControllerInterface {
    private static final List<String> list;

    public interface NativeMessageListener {
        static {
            Covode.recordClassIndex(2759);
        }

        int nativeOnMsgReceived(long j, long j2, long j3, String str);
    }

    private static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeAttachEffect(long j, long j2);

    private static native void nativeCreateHandle(long[] jArr);

    private static native void nativeCreateHandle(long[] jArr, int i);

    private static native int nativeCreateTexture(int i, int i2, int i3, int i4, int i5);

    private static native int nativeDeleteTexture(int i);

    private static native int nativeDestroy(long j);

    private static native int nativeInit(long j, int i, int i2);

    private static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    private static native int nativeProcess(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d);

    private static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeSetRenderCacheTexture(long j, String str, String str2);

    private static native int nativeSetRenderCacheTextureWithBuffer(long j, String str, byte[] bArr, int i, int i2);

    private static native int nativeSetResourceFinder(long j, long j2, long j3);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2, int i2);

    static {
        Covode.recordClassIndex(2758);
        List<String> asList = Arrays.asList("effect");
        list = asList;
        try {
            for (String str : asList) {
                m7256x786c5e51(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com_bef_effectsdk_view_ViewControllerInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m7256x786c5e51(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static void createHandle(long[] jArr) {
        MethodCollector.m26663i(6166);
        nativeCreateHandle(jArr, 0);
        MethodCollector.m26664o(6166);
    }

    public static int deleteTexture(int i) {
        MethodCollector.m26663i(8096);
        int nativeDeleteTexture = nativeDeleteTexture(i);
        MethodCollector.m26664o(8096);
        return nativeDeleteTexture;
    }

    public static int destroy(long j) {
        MethodCollector.m26663i(6909);
        int nativeDestroy = nativeDestroy(j);
        MethodCollector.m26664o(6909);
        return nativeDestroy;
    }

    public static int addMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m26663i(7812);
        int nativeAddMessageListener = nativeAddMessageListener(j, nativeMessageListener);
        MethodCollector.m26664o(7812);
        return nativeAddMessageListener;
    }

    public static int attachEffect(long j, long j2) {
        MethodCollector.m26663i(6622);
        int nativeAttachEffect = nativeAttachEffect(j, j2);
        MethodCollector.m26664o(6622);
        return nativeAttachEffect;
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m26663i(7943);
        int nativeRemoveMessageListener = nativeRemoveMessageListener(j, nativeMessageListener);
        MethodCollector.m26664o(7943);
        return nativeRemoveMessageListener;
    }

    public static int setStickerPath(long j, String str) {
        MethodCollector.m26663i(6762);
        int nativeSetStickerPath = nativeSetStickerPath(j, str);
        MethodCollector.m26664o(6762);
        return nativeSetStickerPath;
    }

    public static void createHandle(long[] jArr, int i) {
        MethodCollector.m26663i(6321);
        nativeCreateHandle(jArr, i);
        MethodCollector.m26664o(6321);
    }

    public static int init(long j, int i, int i2) {
        MethodCollector.m26663i(6471);
        int nativeInit = nativeInit(j, i, i2);
        MethodCollector.m26664o(6471);
        return nativeInit;
    }

    public static int setRenderCacheTexture(long j, String str, String str2) {
        MethodCollector.m26663i(8097);
        int nativeSetRenderCacheTexture = nativeSetRenderCacheTexture(j, str, str2);
        MethodCollector.m26664o(8097);
        return nativeSetRenderCacheTexture;
    }

    public static int setResourceFinder(long j, long j2, long j3) {
        MethodCollector.m26663i(8382);
        int nativeSetResourceFinder = nativeSetResourceFinder(j, j2, j3);
        MethodCollector.m26664o(8382);
        return nativeSetResourceFinder;
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(6911);
        int nativeTouchEvent = nativeTouchEvent(j, 0, iArr, fArr, fArr2, iArr.length);
        MethodCollector.m26664o(6911);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(7337);
        int nativeTouchEvent = nativeTouchEvent(j, 1, iArr, fArr, fArr2, iArr.length);
        MethodCollector.m26664o(7337);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(7200);
        int nativeTouchEvent = nativeTouchEvent(j, 2, iArr, fArr, fArr2, iArr.length);
        MethodCollector.m26664o(7200);
        return nativeTouchEvent;
    }

    public static int createTexture(int i, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(7945);
        int nativeCreateTexture = nativeCreateTexture(i, i2, i3, i4, i5);
        MethodCollector.m26664o(7945);
        return nativeCreateTexture;
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        MethodCollector.m26663i(7811);
        int nativePostMessage = nativePostMessage(j, j2, j3, j4, str);
        MethodCollector.m26664o(7811);
        return nativePostMessage;
    }

    public static int setRenderCacheTextureWithBuffer(long j, String str, byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(8236);
        int nativeSetRenderCacheTextureWithBuffer = nativeSetRenderCacheTextureWithBuffer(j, str, bArr, i, i2);
        MethodCollector.m26664o(8236);
        return nativeSetRenderCacheTextureWithBuffer;
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        MethodCollector.m26663i(7499);
        int nativeTouchEvent = nativeTouchEvent(j, 0, iArr, fArr, fArr2, i);
        MethodCollector.m26664o(7499);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        MethodCollector.m26663i(7675);
        int nativeTouchEvent = nativeTouchEvent(j, 1, iArr, fArr, fArr2, i);
        MethodCollector.m26664o(7675);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        MethodCollector.m26663i(7673);
        int nativeTouchEvent = nativeTouchEvent(j, 2, iArr, fArr, fArr2, i);
        MethodCollector.m26664o(7673);
        return nativeTouchEvent;
    }

    public static int processFrame(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d) {
        MethodCollector.m26663i(6907);
        int nativeProcess = nativeProcess(j, i, i2, i3, fArr, fArr2, d);
        MethodCollector.m26664o(6907);
        return nativeProcess;
    }
}
