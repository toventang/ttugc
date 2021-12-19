package org.webrtc;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AndroidException;
import android.util.Range;
import android.util.Size;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public class Camera2Enumerator implements CameraEnumerator {
    private static final Map<String, List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new HashMap();
    final CameraManager cameraManager;
    final Context context;

    static {
        Covode.recordClassIndex(106560);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (AndroidException e) {
            Logging.m157042e("Camera2Enumerator", "Camera access exception: ".concat(String.valueOf(e)));
            return new String[0];
        }
    }

    @Override // org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    public Camera2Enumerator(Context context2) {
        this.context = context2;
        this.cameraManager = (CameraManager) m157034x71849cb2(context2, "camera");
    }

    private static List<Size> convertSizes(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.cameraManager.getCameraCharacteristics(str);
        } catch (AndroidException e) {
            Logging.m157042e("Camera2Enumerator", "Camera access exception: ".concat(String.valueOf(e)));
            return null;
        }
    }

    static int getFpsUnitFactor(Range<Integer>[] rangeArr) {
        if (rangeArr.length != 0 && rangeArr[0].getUpper().intValue() >= 1000) {
            return 1;
        }
        return 1000;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() != 0) {
            return false;
        }
        return true;
    }

    static List<Size> getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        Size[] outputSizes = ((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            return null;
        }
        List<Size> convertSizes = convertSizes(outputSizes);
        if (Build.VERSION.SDK_INT >= 22 || intValue != 2) {
            return convertSizes;
        }
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        ArrayList arrayList = new ArrayList();
        for (Size size : convertSizes) {
            if (rect.width() * size.height == rect.height() * size.width) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static boolean isSupported(Context context2) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        CameraManager cameraManager2 = (CameraManager) m157034x71849cb2(context2, "camera");
        try {
            for (String str : cameraManager2.getCameraIdList()) {
                if (((Integer) cameraManager2.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (AndroidException e) {
            Logging.m157042e("Camera2Enumerator", "Camera access exception: ".concat(String.valueOf(e)));
            return false;
        }
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(Context context2, String str) {
        return getSupportedFormats((CameraManager) m157034x71849cb2(context2, "camera"), str);
    }

    static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(Range<Integer>[] rangeArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (Range<Integer> range : rangeArr) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(range.getLower().intValue() * i, range.getUpper().intValue() * i));
        }
        return arrayList;
    }

    /* renamed from: org_webrtc_Camera2Enumerator_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m157034x71849cb2(Context context2, String str) {
        Object obj;
        MethodCollector.m26663i(2056);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context2.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context2.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context2.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2056);
                }
            }
        } else {
            obj = context2.getSystemService(str);
        }
        return obj;
    }

    static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager2, String str) {
        long j;
        int i;
        MethodCollector.m26663i(2146);
        Map<String, List<CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    List<CameraEnumerationAndroid.CaptureFormat> list = map.get(str);
                    MethodCollector.m26664o(2146);
                    return list;
                }
                Logging.m157044i("Camera2Enumerator", "Get supported formats for camera index " + str + ".");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager2.getCameraCharacteristics(str);
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                    List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                    int i2 = 0;
                    for (CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange : convertFramerates) {
                        i2 = Math.max(i2, framerateRange.max);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Size size : supportedSizes) {
                        try {
                            j = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new Size(size.width, size.height));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        if (j == 0) {
                            i = i2;
                        } else {
                            double d = (double) j;
                            Double.isNaN(d);
                            i = ((int) Math.round(1.0E9d / d)) * 1000;
                        }
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, i));
                        Logging.m157044i("Camera2Enumerator", "Format: " + size.width + "x" + size.height + "@" + i);
                    }
                    cachedSupportedFormats.put(str, arrayList);
                    Logging.m157044i("Camera2Enumerator", "Get supported formats for camera index " + str + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                    return arrayList;
                } catch (Exception e) {
                    Logging.m157042e("Camera2Enumerator", "getCameraCharacteristics(): ".concat(String.valueOf(e)));
                    ArrayList arrayList2 = new ArrayList();
                    MethodCollector.m26664o(2146);
                    return arrayList2;
                }
            } finally {
                MethodCollector.m26664o(2146);
            }
        }
    }
}
