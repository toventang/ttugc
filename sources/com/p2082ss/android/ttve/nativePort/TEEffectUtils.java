package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

/* renamed from: com.ss.android.ttve.nativePort.TEEffectUtils */
public class TEEffectUtils {

    /* renamed from: com.ss.android.ttve.nativePort.TEEffectUtils$ImageListener */
    public interface ImageListener {
        static {
            Covode.recordClassIndex(37293);
        }

        void onData(int[] iArr, int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TEEffectUtils$QrImageListener */
    public interface QrImageListener {
        static {
            Covode.recordClassIndex(37294);
        }

        void onData(int[] iArr, int i, int i2, int i3);
    }

    public static native String getAudioAECModelName();

    public static native String getEffectVersion();

    public static String getTaintSceneDetectModelName() {
        return "lens_taint_scene_detect";
    }

    private static native int nativeGetQREncodedData(String str, int[] iArr, ImageListener imageListener);

    private static native int nativeGetQREncodedDataWithWH(String str, int i, int i2, int[] iArr, QrImageListener qrImageListener);

    static {
        Covode.recordClassIndex(37292);
        C30731d.m63114a();
    }

    public static int getQREncodedData(String str, Map<Integer, Integer> map, ImageListener imageListener) {
        int[] iArr;
        MethodCollector.m26663i(5177);
        if (map != null) {
            iArr = new int[(map.size() * 2)];
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                iArr[i] = entry.getKey().intValue();
                iArr[i + 1] = entry.getValue().intValue();
                i += 2;
            }
        } else {
            iArr = null;
        }
        int nativeGetQREncodedData = nativeGetQREncodedData(str, iArr, imageListener);
        MethodCollector.m26664o(5177);
        return nativeGetQREncodedData;
    }

    public static int getQREncodedData(String str, int i, int i2, Map<Integer, Integer> map, QrImageListener qrImageListener) {
        int[] iArr;
        MethodCollector.m26663i(5235);
        if (map != null) {
            iArr = new int[(map.size() * 2)];
            int i3 = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                iArr[i3] = entry.getKey().intValue();
                iArr[i3 + 1] = entry.getValue().intValue();
                i3 += 2;
            }
        } else {
            iArr = null;
        }
        int nativeGetQREncodedDataWithWH = nativeGetQREncodedDataWithWH(str, i, i2, iArr, qrImageListener);
        MethodCollector.m26664o(5235);
        return nativeGetQREncodedDataWithWH;
    }
}
