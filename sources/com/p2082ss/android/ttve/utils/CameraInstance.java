package com.p2082ss.android.ttve.utils;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.vesdk.C85315al;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ttve.utils.CameraInstance */
public class CameraInstance {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static CameraInstance mThisInstance;
    private Comparator<Camera.Size> comparatorBigger = new Comparator<Camera.Size>() {
        /* class com.p2082ss.android.ttve.utils.CameraInstance.C307401 */

        static {
            Covode.recordClassIndex(37349);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            int i = size4.width - size3.width;
            if (i == 0) {
                return size4.height - size3.height;
            }
            return i;
        }
    };
    private Comparator<Camera.Size> comparatorSmaller = new Comparator<Camera.Size>() {
        /* class com.p2082ss.android.ttve.utils.CameraInstance.C307412 */

        static {
            Covode.recordClassIndex(37350);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            int i = size3.width - size4.width;
            if (i == 0) {
                return size3.height - size4.height;
            }
            return i;
        }
    };
    private Camera mCameraDevice;
    private int mDefaultCameraID = -1;
    private int mFacing;
    private boolean mIsPreviewing;
    private Camera.Parameters mParams;
    private int mPictureHeight = 720;
    private int mPictureWidth = 1280;
    private int mPreferPreviewHeight = 720;
    private int mPreferPreviewWidth = 1280;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private int mRotation;

    /* renamed from: com.ss.android.ttve.utils.CameraInstance$a */
    public interface AbstractC30743a {
        static {
            Covode.recordClassIndex(37352);
        }
    }

    static {
        Covode.recordClassIndex(37348);
    }

    private static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open */
    private static Camera m63127xa182b2d5() {
        Pair<Boolean, Object> a = C15346a.m28238a(Camera.class, new Object[0], 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (Camera) a.second;
        }
        Camera open = Camera.open();
        C15346a.m28240a(open, Camera.class, new Object[0], 100100, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open()Landroid/hardware/Camera;");
        return open;
    }

    /* renamed from: com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open */
    private static Camera m63128xa182b2d5(int i) {
        Pair<Boolean, Object> a = C15346a.m28238a(Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (Camera) a.second;
        }
        Camera open = Camera.open(i);
        C15346a.m28240a(open, Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
        return open;
    }

    /* renamed from: com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release */
    private static void m63129xb4d64b9c(Camera camera) {
        if (!((Boolean) C15346a.m28238a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, camera, new Object[0], 100106, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera.release();
            C15346a.m28240a(null, camera, new Object[0], 100101, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    public Camera getCameraDevice() {
        return this.mCameraDevice;
    }

    public int getCameraFacing() {
        return this.mFacing;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public boolean isPreviewing() {
        return this.mIsPreviewing;
    }

    public int pictureHeight() {
        return this.mPictureHeight;
    }

    public int pictureWidth() {
        return this.mPictureWidth;
    }

    public int previewHeight() {
        return this.mPreviewHeight;
    }

    public int previewWidth() {
        return this.mPreviewWidth;
    }

    public boolean isCameraOpened() {
        if (this.mCameraDevice != null) {
            return true;
        }
        return false;
    }

    public boolean isUsingFrontCamera() {
        if (this.mFacing == 1) {
            return true;
        }
        return false;
    }

    public static synchronized CameraInstance getInstance() {
        CameraInstance cameraInstance;
        synchronized (CameraInstance.class) {
            MethodCollector.m26663i(6252);
            if (mThisInstance == null) {
                mThisInstance = new CameraInstance();
            }
            cameraInstance = mThisInstance;
            MethodCollector.m26664o(6252);
        }
        return cameraInstance;
    }

    public synchronized Camera.Parameters getParams() {
        MethodCollector.m26663i(6850);
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            MethodCollector.m26664o(6850);
            return parameters;
        }
        MethodCollector.m26664o(6850);
        return null;
    }

    public synchronized void stopCamera() {
        MethodCollector.m26663i(6551);
        C85315al.m146637a("CameraInstance", "stopCamera...");
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            this.mIsPreviewing = false;
            camera.stopPreview();
            try {
                this.mCameraDevice.setPreviewTexture(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            m63129xb4d64b9c(this.mCameraDevice);
            this.mCameraDevice = null;
        }
        MethodCollector.m26664o(6551);
    }

    public synchronized void stopPreview() {
        Camera camera;
        MethodCollector.m26663i(6702);
        C85315al.m146639b("CameraInstance", "Camera stopPreview...");
        if (this.mIsPreviewing && (camera = this.mCameraDevice) != null) {
            this.mIsPreviewing = false;
            camera.stopPreview();
            C85315al.m146637a("CameraInstance", "Camera stopped!");
        }
        MethodCollector.m26664o(6702);
    }

    public boolean tryOpenCamera(AbstractC30743a aVar) {
        return tryOpenCamera(aVar, 0);
    }

    private static int clamp(int i) {
        return clamp(i, -1000, 1000);
    }

    public synchronized void setParams(Camera.Parameters parameters) {
        MethodCollector.m26663i(6851);
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            this.mParams = parameters;
            camera.setParameters(parameters);
        }
        MethodCollector.m26664o(6851);
    }

    private void setCameraDisplayOrientation(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = LiveFeedRefreshTimeSetting.DEFAULT;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        this.mRotation = setOrientationDegrees(i);
    }

    public synchronized void setFocusMode(String str) {
        MethodCollector.m26663i(6988);
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            MethodCollector.m26664o(6988);
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        if (parameters.getSupportedFocusModes().contains(str)) {
            this.mParams.setFocusMode(str);
        }
        MethodCollector.m26664o(6988);
    }

    public int setOrientationDegrees(int i) {
        int i2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.mDefaultCameraID, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = ((360 - ((cameraInfo.orientation + i) % 360)) + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i) + 360) % 360;
        }
        try {
            this.mCameraDevice.setDisplayOrientation(i2);
        } catch (Exception unused) {
        }
        return i2;
    }

    public synchronized void startPreview(SurfaceTexture surfaceTexture) {
        MethodCollector.m26663i(6553);
        C85315al.m146637a("CameraInstance", "Camera startPreview...");
        if (this.mIsPreviewing) {
            C85315al.m146641c("CameraInstance", "Camera is previewing...");
            MethodCollector.m26664o(6553);
            return;
        }
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            try {
                camera.setPreviewTexture(surfaceTexture);
                this.mCameraDevice.startPreview();
                this.mIsPreviewing = true;
                MethodCollector.m26664o(6553);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                C85315al.m146642d("CameraInstance", "startPreview: Error " + e.getMessage());
                this.mIsPreviewing = false;
                try {
                    m63129xb4d64b9c(this.mCameraDevice);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.mCameraDevice = null;
            }
        }
        MethodCollector.m26664o(6553);
    }

    public void initCamera(int i) {
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            C85315al.m146642d("CameraInstance", "initCamera: Camera is not opened!");
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        Iterator<Integer> it = parameters.getSupportedPictureFormats().iterator();
        while (it.hasNext()) {
            C85315al.m146637a("CameraInstance", C1764a.m5928a("Picture Format: %x", new Object[]{Integer.valueOf(it.next().intValue())}));
        }
        this.mParams.setPictureFormat(256);
        List<Camera.Size> supportedPictureSizes = this.mParams.getSupportedPictureSizes();
        Collections.sort(supportedPictureSizes, this.comparatorBigger);
        Camera.Size size = null;
        Camera.Size size2 = null;
        for (Camera.Size size3 : supportedPictureSizes) {
            if (size2 == null || (size3.width >= this.mPictureWidth && size3.height >= this.mPictureHeight)) {
                size2 = size3;
            }
        }
        List<Camera.Size> supportedPreviewSizes = this.mParams.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, this.comparatorBigger);
        for (Camera.Size size4 : supportedPreviewSizes) {
            C85315al.m146639b("CameraInstance", C1764a.m5928a("Supported preview size: %d x %d", new Object[]{Integer.valueOf(size4.width), Integer.valueOf(size4.height)}));
            if (size == null || (size4.width >= this.mPreferPreviewWidth && size4.height >= this.mPreferPreviewHeight)) {
                size = size4;
            }
        }
        List<Integer> supportedPreviewFrameRates = this.mParams.getSupportedPreviewFrameRates();
        this.mParams.setPreviewSize(size.width, size.height);
        this.mParams.setPictureSize(size2.width, size2.height);
        if (this.mParams.getSupportedFocusModes().contains("continuous-video")) {
            this.mParams.setFocusMode("continuous-video");
        }
        int i2 = 30;
        int i3 = (i * 2) / 3;
        int i4 = (i * 4) / 3;
        int i5 = 0;
        for (Integer num : supportedPreviewFrameRates) {
            C85315al.m146643e("CameraInstance", "Supported frame rate: ".concat(String.valueOf(num)));
            if (i5 < num.intValue()) {
                i5 = num.intValue();
            }
            if (i2 > num.intValue()) {
                i2 = num.intValue();
            }
        }
        int max = Math.max(i2, i3);
        int min = Math.min(i4, i5);
        C85315al.m146637a("CameraInstance", "FpsRange = [" + max + ", " + min + "]");
        this.mParams.setPreviewFpsRange(max * 1000, min * 1000);
        int[] iArr = new int[2];
        this.mParams.getPreviewFpsRange(iArr);
        C85315al.m146637a("CameraInstance", "FpsRange = [" + (iArr[0] / 1000) + ", " + (iArr[1] / 1000) + "]");
        try {
            this.mCameraDevice.setParameters(this.mParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Camera.Parameters parameters2 = this.mCameraDevice.getParameters();
        this.mParams = parameters2;
        Camera.Size pictureSize = parameters2.getPictureSize();
        Camera.Size previewSize = this.mParams.getPreviewSize();
        this.mPreviewWidth = previewSize.width;
        this.mPreviewHeight = previewSize.height;
        this.mPictureWidth = pictureSize.width;
        this.mPictureHeight = pictureSize.height;
        C85315al.m146637a("CameraInstance", C1764a.m5928a("Camera Picture Size: %d x %d", new Object[]{Integer.valueOf(pictureSize.width), Integer.valueOf(pictureSize.height)}));
        C85315al.m146637a("CameraInstance", C1764a.m5928a("Camera Preview Size: %d x %d", new Object[]{Integer.valueOf(previewSize.width), Integer.valueOf(previewSize.height)}));
    }

    public void focusAtPoint(float f, float f2) {
        focusAtPoint(f, f2, 0.08f);
    }

    public void setPreferPreviewSize(int i, int i2) {
        this.mPreferPreviewHeight = i;
        this.mPreferPreviewWidth = i2;
    }

    public synchronized boolean tryOpenCamera(AbstractC30743a aVar, int i) {
        MethodCollector.m26663i(6413);
        C85315al.m146637a("CameraInstance", "try open camera...");
        try {
            int i2 = Build.VERSION.SDK_INT;
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i3 = 0; i3 < numberOfCameras; i3++) {
                Camera.getCameraInfo(i3, cameraInfo);
                if (cameraInfo.facing == i) {
                    this.mDefaultCameraID = i3;
                    this.mFacing = i;
                }
            }
            stopPreview();
            Camera camera = this.mCameraDevice;
            if (camera != null) {
                m63129xb4d64b9c(camera);
            }
            int i4 = this.mDefaultCameraID;
            if (i4 >= 0) {
                this.mCameraDevice = m63128xa182b2d5(i4);
            } else {
                this.mCameraDevice = m63127xa182b2d5();
                this.mFacing = 0;
            }
            this.mRotation = setOrientationDegrees(0);
            C85315al.m146639b("CameraInstance", "Camera rotation = " + this.mRotation);
            if (this.mCameraDevice != null) {
                C85315al.m146637a("CameraInstance", "Camera opened!");
                try {
                    initCamera(30);
                    MethodCollector.m26664o(6413);
                    return true;
                } catch (Exception unused) {
                    m63129xb4d64b9c(this.mCameraDevice);
                    this.mCameraDevice = null;
                    MethodCollector.m26664o(6413);
                    return false;
                }
            } else {
                MethodCollector.m26664o(6413);
                return false;
            }
        } catch (Exception e) {
            C85315al.m146642d("CameraInstance", "Open Camera Failed!");
            e.printStackTrace();
            this.mCameraDevice = null;
            MethodCollector.m26664o(6413);
            return false;
        }
    }

    private void rotateRectForOrientation(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    public synchronized void focusAtPoint(float f, float f2, float f3) {
        MethodCollector.m26663i(7146);
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            C85315al.m146642d("CameraInstance", "Error: focus after release.");
            MethodCollector.m26664o(7146);
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Rect calculateTapArea = calculateTapArea(f, f2, f3, this.mRotation);
            C85315al.m146639b("CameraInstance", C1764a.m5928a("FocusAreas: [%d, %d, %d, %d]", new Object[]{Integer.valueOf(calculateTapArea.left), Integer.valueOf(calculateTapArea.top), Integer.valueOf(calculateTapArea.right), Integer.valueOf(calculateTapArea.bottom)}));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(calculateTapArea, 1000));
            try {
                this.mCameraDevice.cancelAutoFocus();
                if (!TextUtils.equals(Build.BRAND, "Multilaser") && !TextUtils.equals(Build.BRAND, "MS40")) {
                    this.mParams.setFocusAreas(arrayList);
                }
                this.mParams.setMeteringAreas(arrayList);
                this.mParams.setFocusMode("continuous-video");
                this.mCameraDevice.setParameters(this.mParams);
                this.mCameraDevice.autoFocus(new Camera.AutoFocusCallback() {
                    /* class com.p2082ss.android.ttve.utils.CameraInstance.C307423 */

                    static {
                        Covode.recordClassIndex(37351);
                    }

                    public final void onAutoFocus(boolean z, Camera camera) {
                        if (z) {
                            C85315al.m146637a("CameraInstance", "Camera Focus Succeed!");
                            return;
                        }
                        C85315al.m146637a("CameraInstance", "Camera Focus Failed!");
                        try {
                            Camera.Parameters parameters = camera.getParameters();
                            parameters.setFocusMode("auto");
                            camera.setParameters(parameters);
                        } catch (Exception unused) {
                        }
                    }
                });
                MethodCollector.m26664o(7146);
            } catch (Exception e) {
                C85315al.m146642d("CameraInstance", "Error: focusAtPoint failed: " + e.toString());
                MethodCollector.m26664o(7146);
            }
        } else {
            C85315al.m146637a("CameraInstance", "The device does not support metering areas...");
            MethodCollector.m26664o(7146);
        }
    }

    public synchronized void setPictureSize(int i, int i2, boolean z) {
        MethodCollector.m26663i(7144);
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            this.mPictureWidth = i;
            this.mPictureHeight = i2;
            MethodCollector.m26664o(7144);
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Camera.Size size = null;
        if (z) {
            Collections.sort(supportedPictureSizes, this.comparatorBigger);
            for (Camera.Size size2 : supportedPictureSizes) {
                if (size == null || (size2.width >= i && size2.height >= i2)) {
                    size = size2;
                }
            }
        } else {
            Collections.sort(supportedPictureSizes, this.comparatorSmaller);
            for (Camera.Size size3 : supportedPictureSizes) {
                if (size == null || (size3.width <= i && size3.height <= i2)) {
                    size = size3;
                }
            }
        }
        if (size != null) {
            this.mPictureWidth = size.width;
            this.mPictureHeight = size.height;
        }
        try {
            this.mParams.setPictureSize(this.mPictureWidth, this.mPictureHeight);
            this.mCameraDevice.setParameters(this.mParams);
            MethodCollector.m26664o(7144);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(7144);
        }
    }

    public Rect calculateTapArea(float f, float f2, float f3, int i) {
        int intValue = Float.valueOf(f3 * 1000.0f).intValue();
        int i2 = intValue / 2;
        int clamp = clamp((((int) (f * 2000.0f)) - 1000) - i2, -1000, 1000);
        int clamp2 = clamp((((int) (f2 * 2000.0f)) - 1000) - i2, -1000, 1000);
        RectF rectF = new RectF((float) clamp, (float) clamp2, (float) clamp(clamp + intValue), (float) clamp(clamp2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        rotateRectForOrientation(i, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = clamp(rect2.left);
        rect2.right = clamp(rect2.right);
        rect2.top = clamp(rect2.top);
        rect2.bottom = clamp(rect2.bottom);
        return rect2;
    }
}
