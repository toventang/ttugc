package com.p2082ss.android.ttvecamera;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30840h;
import com.p2082ss.android.ttvecamera.C30853j;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.p2198g.C30834e;
import com.p2082ss.android.ttvecamera.p2200i.C30852a;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.TECameraCapture */
public class TECameraCapture {
    protected Map<String, Bundle> mAllDevicesFeatures = new HashMap();
    protected AbstractC30747a mCameraObserver = C30748b.m63135a();
    protected C30933l mCameraSettings;
    protected AbstractC30749c mPictureSizeCallback;

    /* renamed from: com.ss.android.ttvecamera.TECameraCapture$a */
    public interface AbstractC30747a {
        static {
            Covode.recordClassIndex(37369);
        }

        void onCaptureStarted(int i, int i2);

        void onCaptureStopped(int i);

        void onError(int i, String str);

        void onInfo(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraCapture$c */
    public interface AbstractC30749c {
        static {
            Covode.recordClassIndex(37371);
        }

        /* renamed from: a */
        TEFrameSizei mo55591a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    static {
        Covode.recordClassIndex(37368);
    }

    private static int convertFacing(int i) {
        return i == 0 ? 1 : 0;
    }

    private static boolean isCameraSupport(Context context, int i) {
        return true;
    }

    public void changeCaptureFormat() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ttvecamera.TECameraCapture$b */
    public static class C30748b implements AbstractC30747a {

        /* renamed from: a */
        private static volatile C30748b f73608a;

        static {
            Covode.recordClassIndex(37370);
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onCaptureStarted(int i, int i2) {
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onCaptureStopped(int i) {
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onError(int i, String str) {
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onInfo(int i, int i2, String str) {
        }

        protected C30748b() {
        }

        /* renamed from: a */
        public static C30748b m63135a() {
            C30748b bVar;
            MethodCollector.m26663i(13528);
            synchronized (C30748b.class) {
                try {
                    if (f73608a == null) {
                        synchronized (C30748b.class) {
                            try {
                                f73608a = new C30748b();
                            } catch (Throwable th) {
                                MethodCollector.m26664o(13528);
                                throw th;
                            }
                        }
                    }
                    bVar = f73608a;
                } finally {
                    MethodCollector.m26664o(13528);
                }
            }
            return bVar;
        }
    }

    public int abortSession() {
        return EnumC30872k.INSTANCE.abortSession(this);
    }

    public int cancelFocus() {
        return EnumC30872k.INSTANCE.cancelFocus(this);
    }

    public int disConnect() {
        return disConnect((PrivacyCert) null);
    }

    public void downExposureCompensation() {
        EnumC30872k.INSTANCE.downExposureCompensation(this);
    }

    public int enableCaf() {
        return EnumC30872k.INSTANCE.enableCaf(this);
    }

    public int[] getCameraCaptureSize() {
        return EnumC30872k.INSTANCE.getCameraCaptureSize();
    }

    public C30933l.C30943d getCameraECInfo() {
        return EnumC30872k.INSTANCE.getCameraECInfo(this);
    }

    public int getCameraState() {
        return EnumC30872k.INSTANCE.getCameraState();
    }

    public int getExposureCompensation() {
        return EnumC30872k.INSTANCE.getExposureCompensation(this);
    }

    public int getFlashMode() {
        return EnumC30872k.INSTANCE.getFlashMode(this);
    }

    public int[] getPictureSize() {
        return EnumC30872k.INSTANCE.getPictureSize(this);
    }

    public int[] getPreviewFps() {
        return EnumC30872k.INSTANCE.getPreviewFps();
    }

    public boolean isAutoExposureLockSupported() {
        return EnumC30872k.INSTANCE.isAutoExposureLockSupported(this);
    }

    public boolean isAutoFocuseLockSupported() {
        return EnumC30872k.INSTANCE.isAutoFocusLockSupported(this);
    }

    public boolean isSupportWhileBalance() {
        return EnumC30872k.INSTANCE.isSupportWhileBalance(this);
    }

    public boolean isSupportedExposureCompensation() {
        return EnumC30872k.INSTANCE.isSupportedExposureCompensation(this);
    }

    public boolean isTorchSupported() {
        return EnumC30872k.INSTANCE.isTorchSupported(this);
    }

    public int removeCameraProvider() {
        return EnumC30872k.INSTANCE.removeCameraProvider(this);
    }

    public int start() {
        return EnumC30872k.INSTANCE.start(this);
    }

    public int startCameraFaceDetect() {
        return EnumC30872k.INSTANCE.startCameraFaceDetect(this);
    }

    public int startRecording() {
        return EnumC30872k.INSTANCE.startRecording();
    }

    public int stop() {
        return EnumC30872k.INSTANCE.stop(this);
    }

    public int stopCameraFaceDetect() {
        return EnumC30872k.INSTANCE.stopCameraFaceDetect(this);
    }

    public int stopRecording() {
        return EnumC30872k.INSTANCE.stopRecording();
    }

    public void upExposureCompensation() {
        EnumC30872k.INSTANCE.upExposureCompensation(this);
    }

    public static void registerMonitor(C30853j.AbstractC30854a aVar) {
        C30853j.f73910a = aVar;
    }

    public int addCameraProvider(C30862c.C30863a aVar) {
        return EnumC30872k.INSTANCE.addCameraProvider(this, aVar);
    }

    public void changeAppLifeCycle(boolean z) {
        EnumC30872k.INSTANCE.appLifeCycleChanged(z);
    }

    public int connect(C30933l lVar) {
        return connect(lVar, null);
    }

    public void enableMulticamZoom(boolean z) {
        EnumC30872k.INSTANCE.enableMulticamZoom(this, z);
    }

    public float[] getApertureRange(C30933l.AbstractC30941b bVar) {
        return EnumC30872k.INSTANCE.getApertureRange(this, bVar);
    }

    public float[] getFOV(C30933l.AbstractC30944e eVar) {
        return EnumC30872k.INSTANCE.getFOV(this, eVar);
    }

    public int getISO(C30933l.AbstractC30946g gVar) {
        return EnumC30872k.INSTANCE.getISO(this, gVar);
    }

    public int[] getISORange(C30933l.AbstractC30947h hVar) {
        return EnumC30872k.INSTANCE.getISORange(this, hVar);
    }

    public float getManualFocusAbility(C30933l.AbstractC30948i iVar) {
        return EnumC30872k.INSTANCE.getManualFocusAbility(this, iVar);
    }

    public long[] getShutterTimeRange(C30933l.AbstractC30954o oVar) {
        return EnumC30872k.INSTANCE.getShutterTimeRange(this, oVar);
    }

    public void notifyHostForegroundVisible(boolean z) {
        EnumC30872k.INSTANCE.notifyHostForegroundVisible(this, z);
    }

    public void process(C30933l.C30949j jVar) {
        EnumC30872k.INSTANCE.process(this, jVar);
    }

    public void queryFeatures(Bundle bundle) {
        queryFeatures(this.mCameraSettings.f74139F, bundle);
    }

    public float queryShaderZoomAbility(C30933l.AbstractC30953n nVar) {
        return EnumC30872k.INSTANCE.queryShaderZoomStep(this, nVar);
    }

    public void setAperture(float f) {
        EnumC30872k.INSTANCE.setAperture(this, f);
    }

    public void setAutoExposureLock(boolean z) {
        EnumC30872k.INSTANCE.setAutoExposureLock(this, z);
    }

    public void setAutoFocusLock(boolean z) {
        EnumC30872k.INSTANCE.setAutoFocusLock(this, z);
    }

    public void setExposureCompensation(int i) {
        EnumC30872k.INSTANCE.setExposureCompensation(this, i);
    }

    public void setFeatureParameters(Bundle bundle) {
        EnumC30872k.INSTANCE.setFeatureParameters(this, bundle);
    }

    public void setISO(int i) {
        EnumC30872k.INSTANCE.setISO(this, i);
    }

    public void setManualFocusDistance(float f) {
        EnumC30872k.INSTANCE.setManualFocusDistance(this, f);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        EnumC30872k.INSTANCE.setPreviewFpsRange(tEFrameRateRange);
    }

    public void setSATZoomCallback(C30933l.AbstractC30952m mVar) {
        EnumC30872k.INSTANCE.setSATZoomCallback(mVar);
    }

    public void setSceneMode(int i) {
        EnumC30872k.INSTANCE.setSceneMode(this, i);
    }

    public void setShutterTime(long j) {
        EnumC30872k.INSTANCE.setShutterTime(this, j);
    }

    public int stopZoom(C30933l.AbstractC30955p pVar) {
        return EnumC30872k.INSTANCE.stopZoom(this, pVar);
    }

    public int switchCamera(int i) {
        return switchCamera(i, (PrivacyCert) null);
    }

    public int switchFlashMode(int i) {
        return EnumC30872k.INSTANCE.switchFlashMode(this, i);
    }

    public int toggleTorch(boolean z) {
        return EnumC30872k.INSTANCE.toggleTorch(this, z);
    }

    public static void registerException(C30840h.AbstractC30841a aVar) {
        WeakReference<C30840h.AbstractC30841a> weakReference;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        C30840h.f73867a = weakReference;
    }

    public int disConnect(PrivacyCert privacyCert) {
        return EnumC30872k.INSTANCE.disConnect(this, privacyCert);
    }

    public int getCameraState(boolean z) {
        return EnumC30872k.INSTANCE.getCameraState(z);
    }

    public boolean isARCoreSupported(Context context) {
        return C30834e.m63525a(context, 2).mo55860d();
    }

    public int takePicture(C30933l.AbstractC30951l lVar) {
        return EnumC30872k.INSTANCE.takePicture(this, lVar);
    }

    public TECameraCapture(AbstractC30747a aVar) {
        this.mCameraObserver = aVar;
    }

    public int disConnect(boolean z) {
        return disConnect(z, null);
    }

    public int focusAtPoint(C30966n nVar) {
        nVar.f74239f = System.currentTimeMillis();
        return EnumC30872k.INSTANCE.focusAtPoint(this, nVar);
    }

    public int switchCamera(C30933l lVar) {
        return switchCamera(lVar, (PrivacyCert) null);
    }

    public void updateAllCameraFeatures(Bundle bundle) {
        C30933l lVar = this.mCameraSettings;
        if (lVar != null) {
            updateAllCameraFeatures(lVar.f74179c, bundle);
            if (this.mAllDevicesFeatures.containsKey(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e)) {
                Bundle bundle2 = this.mAllDevicesFeatures.get(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e);
                if (bundle2 != null) {
                    bundle2.putAll(bundle);
                    return;
                }
                return;
            }
            this.mAllDevicesFeatures.put(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e, bundle);
        }
    }

    public int captureBurst(C30933l.AbstractC30942c cVar, C30852a aVar) {
        return EnumC30872k.INSTANCE.captureBurst(this, cVar, aVar);
    }

    public void changeRecorderState(int i, AbstractC30825g.AbstractC30827b bVar) {
        EnumC30872k.INSTANCE.changeRecorderState(this, i, bVar);
    }

    public TEFrameSizei getBestPreviewSize(float f, TEFrameSizei tEFrameSizei) {
        return EnumC30872k.INSTANCE.getBestPreviewSize(this, f, tEFrameSizei);
    }

    public int queryZoomAbility(C30933l.AbstractC30955p pVar, boolean z) {
        return EnumC30872k.INSTANCE.queryZoomAbility(this, pVar, z);
    }

    public void setPictureSize(int i, int i2) {
        EnumC30872k.INSTANCE.setPictureSize(this, i, i2);
    }

    public void setWhileBalance(boolean z, String str) {
        EnumC30872k.INSTANCE.setWhileBalance(this, z, str);
    }

    public int startZoom(float f, C30933l.AbstractC30955p pVar) {
        return EnumC30872k.INSTANCE.startZoom(this, f, pVar);
    }

    public int zoomV2(float f, C30933l.AbstractC30955p pVar) {
        return EnumC30872k.INSTANCE.zoomV2(this, f, pVar);
    }

    public void queryFeatures(String str, Bundle bundle) {
        EnumC30872k.INSTANCE.queryFeatures(str, bundle);
    }

    public int start(SurfaceTexture surfaceTexture, int i) {
        C30969o.m63689d("TECameraCapture", "Do not use this interface!!");
        return start();
    }

    public int switchCamera(int i, PrivacyCert privacyCert) {
        return EnumC30872k.INSTANCE.switchCamera(this, i, privacyCert);
    }

    public int switchCameraMode(int i, C30933l lVar) {
        if (lVar != null) {
            this.mCameraSettings = lVar;
        }
        return EnumC30872k.INSTANCE.switchCameraMode(this, i);
    }

    public int connect(C30933l lVar, PrivacyCert privacyCert) {
        this.mCameraSettings = lVar;
        return EnumC30872k.INSTANCE.connect(this, this.mCameraObserver, this.mCameraSettings, this.mPictureSizeCallback, privacyCert);
    }

    public TECameraCapture(AbstractC30747a aVar, AbstractC30749c cVar) {
        this.mCameraObserver = aVar;
        this.mPictureSizeCallback = cVar;
    }

    public static void registerLogOutput(byte b, C30969o.AbstractC30971b bVar) {
        if (bVar != null) {
            C30969o.f74249c = bVar;
        } else {
            C30969o.f74249c = new C30969o.C30970a();
        }
        C30969o.f74247a = "VESDK" + "-";
        C30969o.f74248b = b;
    }

    public int disConnect(boolean z, PrivacyCert privacyCert) {
        return EnumC30872k.INSTANCE.disConnect(this, z, privacyCert);
    }

    public int switchCamera(C30933l lVar, PrivacyCert privacyCert) {
        this.mCameraSettings = lVar;
        return EnumC30872k.INSTANCE.switchCamera(this, lVar, privacyCert);
    }

    /* renamed from: com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m63134xdd2129ce(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9708);
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
                    MethodCollector.m26664o(9708);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private void updateAllCameraFeatures(int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        C30969o.m63686a("TECameraCapture", "updateAllCameraFeatures with camera type: ".concat(String.valueOf(i)));
        boolean z = true;
        if (11 == i) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("device_support_ai_night_video", 0);
            bundle2.putInt("device_support_wide_angle_mode", 0);
            bundle2.putInt("device_support_antishake_mode", 0);
            queryFeatures(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e, bundle2);
            int i5 = bundle2.getInt("device_support_ai_night_video");
            int i6 = bundle.getInt("device_support_ai_night_video");
            if (i5 <= 0 || i6 <= 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            bundle.putInt("device_support_ai_night_video", i2);
            int i7 = bundle2.getInt("device_support_wide_angle_mode");
            int i8 = bundle.getInt("device_support_wide_angle_mode");
            if (i7 <= 0 || i8 <= 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            bundle.putInt("device_support_wide_angle_mode", i3);
            int i9 = bundle2.getInt("device_support_antishake_mode");
            int i10 = bundle.getInt("device_support_antishake_mode");
            if (i9 <= 0 || i10 <= 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            bundle.putInt("device_support_antishake_mode", i4);
            C30969o.m63686a("TECameraCapture", "updateAllCameraFeatures, vendor camera unit type, feature bundle = ".concat(String.valueOf(bundle)));
        } else if (10 == i) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("device_should_use_shader_zoom", false);
            queryFeatures(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e, bundle3);
            bundle.putBoolean("device_should_use_shader_zoom", bundle3.getBoolean("device_should_use_shader_zoom"));
            C30969o.m63686a("TECameraCapture", "updateAllCameraFeatures, vendor rdhw type, feature bundle = ".concat(String.valueOf(bundle)));
        } else if (2 == i) {
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("device_support_multicamera_zoom", false);
            queryFeatures(this.mCameraSettings.f74139F, bundle4);
            boolean z2 = bundle4.getBoolean("device_support_multicamera_zoom");
            boolean z3 = bundle.getBoolean("device_support_multicamera_zoom");
            if (!z2 || !z3) {
                z = false;
            }
            bundle.putBoolean("device_support_multicamera_zoom", z);
            C30969o.m63686a("TECameraCapture", "updateAllCameraFeatures, camera2 type, feature bundle = ".concat(String.valueOf(bundle)));
        }
    }

    public synchronized void getCameraAllFeatures(Context context, Bundle bundle) {
        MethodCollector.m26663i(9552);
        if (this.mCameraSettings != null) {
            if (this.mAllDevicesFeatures.containsKey(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e)) {
                Bundle bundle2 = this.mAllDevicesFeatures.get(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e);
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                MethodCollector.m26664o(9552);
                return;
            }
            getCameraAllFeatures(context, this.mCameraSettings.f74179c, bundle);
            this.mAllDevicesFeatures.put(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e, bundle);
        }
        MethodCollector.m26664o(9552);
    }

    public int takePicture(int i, int i2, C30933l.AbstractC30951l lVar) {
        return EnumC30872k.INSTANCE.takePicture(this, i, i2, lVar);
    }

    public static void queryDeviceFeatures(Context context, int i, Bundle bundle) {
        if (isCameraSupport(context, i) && fillDeviceFeatures(context, i, bundle)) {
            fillCameraFeatures(context, i, bundle);
        }
    }

    private static void fillCameraFeatures(Context context, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21 && i == 4) {
            try {
                CameraManager cameraManager = (CameraManager) m63134xdd2129ce(context, "camera");
                String[] cameraIdList = cameraManager.getCameraIdList();
                HashMap hashMap = null;
                for (String str : cameraIdList) {
                    Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                        for (String str2 : bundle.keySet()) {
                            if ("support_anti_shake".equals(str2)) {
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                Integer valueOf = Integer.valueOf(convertFacing(num.intValue()));
                                Integer.parseInt(str);
                                hashMap.put(valueOf, false);
                                bundle.putSerializable("support_anti_shake", hashMap);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void fillDeviceAntiShakeFeature(Context context, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21 && i == 4) {
            try {
                CameraManager cameraManager = (CameraManager) m63134xdd2129ce(context, "camera");
                String[] cameraIdList = cameraManager.getCameraIdList();
                HashMap hashMap = null;
                for (String str : cameraIdList) {
                    Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                        for (String str2 : bundle.keySet()) {
                            if ("device_support_anti_shake".equals(str2)) {
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                Integer valueOf = Integer.valueOf(convertFacing(num.intValue()));
                                Integer.parseInt(str);
                                hashMap.put(valueOf, false);
                                bundle.putSerializable("device_support_anti_shake", hashMap);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean fillDeviceFeatures(Context context, int i, Bundle bundle) {
        boolean z = false;
        for (String str : bundle.keySet()) {
            if ("device_support_camera".equals(str)) {
                bundle.putBoolean("device_support_camera", isCameraSupport(context, i));
            } else if (!"device_support_wide_angle".equals(str) || i == 1) {
                z = true;
            } else {
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                bundle.putBoolean("device_support_wide_angle", C30834e.m63525a(context, i).mo55856a());
                C30969o.m63687b("TECameraCapture", "Get wide angle info cost " + (System.currentTimeMillis() - valueOf.longValue()) + "ms");
            }
        }
        return z;
    }

    private void getCameraAllFeatures(Context context, int i, Bundle bundle) {
        C30969o.m63686a("TECameraCapture", "getCameraAllFeatures with camera type: ".concat(String.valueOf(i)));
        if (i == 1) {
            bundle.putBoolean("device_support_wide_angle", false);
        } else if (11 != i) {
            C30834e.m63525a(context, i);
            String c = C30834e.m63530c();
            C30969o.m63686a("TECameraCapture", "getCameraAllFeatures, filledWideCameraId: ".concat(String.valueOf(c)));
            if ("-1".equals(c)) {
                boolean a = C30834e.m63525a(context, i).mo55856a();
                bundle.putBoolean("device_support_wide_angle", a);
                if (a) {
                    bundle.putString("device_wide_angle_camera_id", C30834e.m63525a(context, i).mo55857b());
                }
            } else if (c.equals("0")) {
                bundle.putBoolean("device_support_wide_angle", false);
            } else {
                bundle.putBoolean("device_support_wide_angle", true);
                bundle.putString("device_wide_angle_camera_id", c);
            }
            if (10 == i) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("device_should_use_shader_zoom", false);
                queryFeatures(this.mCameraSettings.f74179c + "_" + this.mCameraSettings.f74181e, bundle2);
                bundle.putBoolean("device_should_use_shader_zoom", bundle2.getBoolean("device_should_use_shader_zoom"));
                C30969o.m63686a("TECameraCapture", "getCameraAllFeatures, vendor rdhw type, feature bundle = ".concat(String.valueOf(bundle)));
            }
        }
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("device_support_anti_shake", null);
        fillDeviceAntiShakeFeature(context, i, bundle3);
        if (bundle3.size() > 0) {
            bundle.putAll(bundle3);
        }
        C30969o.m63686a("TECameraCapture", "getCameraAllFeatures, features = ".concat(String.valueOf(bundle)));
    }

    public int focusAtPoint(int i, int i2, float f, int i3, int i4) {
        return focusAtPoint(new C30966n(i, i2, i3, i4, f));
    }
}
