package com.p2082ss.android.ttvecamera.p2198g;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttvecamera.C30853j;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.TEFrameRateRange;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* renamed from: com.ss.android.ttvecamera.g.e */
public class C30834e {

    /* renamed from: b */
    protected static String f73861b = "-1";

    /* renamed from: c */
    public static int f73862c = 1;

    /* renamed from: a */
    protected Context f73863a;

    /* renamed from: c */
    public static String m63530c() {
        return f73861b;
    }

    static {
        Covode.recordClassIndex(37459);
    }

    /* renamed from: a */
    public boolean mo55856a() {
        if (!mo55857b().equals("0")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String mo55857b() {
        CameraManager cameraManager = (CameraManager) m63526a(this.f73863a, "camera");
        try {
            return m63527a(cameraManager.getCameraIdList(), cameraManager);
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return "0";
        }
    }

    /* renamed from: d */
    public final boolean mo55860d() {
        boolean z = false;
        try {
            if (f73862c != 1) {
                long currentTimeMillis = System.currentTimeMillis();
                Class<?> cls = Class.forName("com.google.ar.core.ArCoreApk");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Object invoke2 = cls.getMethod("checkAvailability", Context.class).invoke(invoke, this.f73863a);
                C30969o.m63686a("TECameraHardware2Proxy", "cost: " + (System.currentTimeMillis() - currentTimeMillis) + ", ARCore availability " + invoke2.toString());
                z = "SUPPORTED_INSTALLED".equals(invoke2.toString());
            }
            C30853j.m63558a("te_record_camera_is_support_arcore", String.valueOf(z));
            return z;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
            C30853j.m63558a("te_record_camera_is_support_arcore", "false");
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            C30853j.m63558a("te_record_camera_is_support_arcore", "false");
            return false;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            C30853j.m63558a("te_record_camera_is_support_arcore", "false");
            return false;
        } catch (Throwable unused) {
            C30853j.m63558a("te_record_camera_is_support_arcore", "false");
            return false;
        }
    }

    public C30834e(Context context) {
        this.f73863a = context;
    }

    /* renamed from: b */
    public static boolean m63529b(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    /* renamed from: d */
    public static boolean m63531d(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            return false;
        }
        for (int i : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i == 11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m63532e(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m63533f(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static float m63522a(CameraCharacteristics cameraCharacteristics) {
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        try {
            return Float.valueOf(new DecimalFormat("0.00").format((double) ((((float) (rect.width() - ((int) (((float) rect.width()) / floatValue)))) / floatValue) / ((float) rect.width()))).trim()).floatValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.01f;
        }
    }

    /* renamed from: c */
    public boolean mo55859c(CameraCharacteristics cameraCharacteristics) {
        int i;
        int[] iArr;
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length <= 0) {
            i = 0;
        } else {
            i = 1;
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            int length = iArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (iArr2[i2] == 1) {
                    i |= 2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        C30969o.m63686a("TECameraHardware2Proxy", "Stabilization type: " + Integer.toBinaryString(i));
        C30853j.m63557a("te_record_camera_stabilization", (long) i);
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo55855a(int i, CameraManager cameraManager) {
        try {
            f73861b = m63527a(cameraManager.getCameraIdList(), cameraManager);
            C30969o.m63686a("TECameraHardware2Proxy", "fillWideCameraID mWideCameraID = " + f73861b);
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m63528b(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f = Float.MIN_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr == null || fArr.length == 0) {
                        fArr = new float[]{0.0f};
                    }
                    if (fArr[0] > f) {
                        f = fArr[0];
                        str = str2;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: a */
    public static C30834e m63525a(Context context, int i) {
        C30834e eVar;
        MethodCollector.m26663i(12834);
        C30969o.m63686a("TECameraHardware2Proxy", "getDeviceProxy, cameraType: ".concat(String.valueOf(i)));
        f73862c = i;
        synchronized (C30834e.class) {
            if (i == 3) {
                try {
                    eVar = new C30836g(context);
                } catch (Throwable th) {
                    MethodCollector.m26664o(12834);
                    throw th;
                }
            } else if (i == 4) {
                eVar = new C30831b(context);
            } else if (i == 6) {
                eVar = new C30830a(context);
            } else if (i == 8) {
                eVar = new C30837h(context);
            } else if (C30833d.m63521a()) {
                eVar = new C30839j(context);
            } else {
                String lowerCase = Build.HARDWARE.toLowerCase();
                if (lowerCase.equals("qcom") || lowerCase.matches("msm[0-9]*")) {
                    C30969o.m63687b("TECameraHardware2", "QCOM Platform.");
                    eVar = new C30838i(context);
                } else if (Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
                    C30969o.m63687b("TECameraHardware2", "MTK Platform.");
                    eVar = new C30835f(context);
                } else {
                    String lowerCase2 = Build.BRAND.toLowerCase();
                    if (lowerCase2.equals("huawei") || lowerCase2.equals("honor")) {
                        eVar = new C30832c(context);
                    } else {
                        C30969o.m63689d("TECameraHardware2Proxy", "Unknown platform");
                        eVar = new C30834e(context);
                    }
                }
            }
        }
        MethodCollector.m26664o(12834);
        return eVar;
    }

    /* renamed from: a */
    private static Object m63526a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12836);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.m26664o(12836);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static String m63527a(String[] strArr, CameraManager cameraManager) {
        float[] fArr;
        String str = "0";
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() != 0) && (fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) != null && fArr.length > 0) {
                    float f2 = fArr[0];
                    if (f2 != -1.0f && f2 <= f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: a */
    public static float m63523a(CameraCharacteristics cameraCharacteristics, int i, float f) {
        Float f2 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 == null) {
            return 0.0f;
        }
        float floatValue = f2.floatValue();
        if (f != -1.0f) {
            return floatValue * f;
        }
        if (i != 6) {
            return floatValue / 2.0f;
        }
        return floatValue;
    }

    /* renamed from: a */
    public int mo55858a(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            C30969o.m63686a("TECameraHardware2Proxy", "configStabilization not toggle");
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                C30969o.m63686a("TECameraHardware2Proxy", "EIS mode: ".concat(String.valueOf(i)));
                if (i == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    C30969o.m63686a("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            C30969o.m63686a("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                C30969o.m63686a("TECameraHardware2Proxy", "OIS mode: ".concat(String.valueOf(i2)));
                if (i2 == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    C30969o.m63686a("TECameraHardware2Proxy", "Enable OIS");
                    return 0;
                }
            }
            return -200;
        }
        C30969o.m63686a("TECameraHardware2Proxy", "Don't supported OIS");
        return -200;
    }

    /* renamed from: a */
    public static TEFrameRateRange m63524a(CameraCharacteristics cameraCharacteristics, int i, int i2, int i3, int i4) {
        Range[] rangeArr;
        TEFrameRateRange tEFrameRateRange = new TEFrameRateRange(i, i2);
        if (cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
            return tEFrameRateRange;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i5 = tEFrameRateRange.f73615c;
        int i6 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i5, ((Integer) range.getUpper()).intValue() * i5};
            arrayList.add(iArr);
            if (i6 < iArr[1]) {
                i6 = iArr[1];
            }
        }
        C30853j.m63557a("te_record_camera_max_fps", (long) i6);
        int[] a = C30956m.m63673a(i3, i4, tEFrameRateRange.mo55597a(), arrayList);
        tEFrameRateRange.f73613a = a[0];
        tEFrameRateRange.f73614b = a[1];
        return tEFrameRateRange;
    }
}
