package org.webrtc;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoFrame;

/* access modifiers changed from: package-private */
public class Camera1Session implements CameraSession {
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
    private static int sMinFramerate;
    private final Context applicationContext;
    public final Camera camera;
    private final int cameraId;
    public final Handler cameraThreadHandler;
    public final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public final Camera.CameraInfo info;
    private boolean isDesktopMode;
    private int mDisplayRotationCheckCounter;
    private int mLastDisplayRotation;
    private int mLastValidDisplayRotation;
    private CameraVideoCapturer.ORIENTATION_MODE mOrientation = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    private final int scaleHeight;
    private final int scaleWidth;
    public SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;

    private static Camera org_webrtc_Camera1Session_android_hardware_Camera_open(int i) {
        Pair<Boolean, Object> a = C15346a.m28238a(Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (Camera) a.second;
        }
        Camera open = Camera.open(i);
        C15346a.m28240a(open, Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "org_webrtc_Camera1Session_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
        return open;
    }

    private static void org_webrtc_Camera1Session_android_hardware_Camera_release(Camera camera2) {
        if (!((Boolean) C15346a.m28238a(camera2, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, camera2, new Object[0], 100106, "org_webrtc_Camera1Session_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera2.release();
            C15346a.m28240a(null, camera2, new Object[0], 100101, "org_webrtc_Camera1Session_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() {
            /* class org.webrtc.Camera1Session.C902722 */

            static {
                Covode.recordClassIndex(106555);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void lambda$null$0$Camera1Session$2(byte[] bArr) {
                if (Camera1Session.this.state == SessionState.RUNNING) {
                    Camera1Session.this.camera.addCallbackBuffer(bArr);
                }
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void lambda$onPreviewFrame$1$Camera1Session$2(byte[] bArr) {
                Camera1Session.this.cameraThreadHandler.post(new Camera1Session$2$$Lambda$1(this, bArr));
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                boolean z;
                Camera1Session.this.checkIsOnCameraThread();
                if (camera != Camera1Session.this.camera) {
                    Logging.m157042e("Camera1Session", "Callback from a different camera. This should never happen.");
                } else if (Camera1Session.this.state != SessionState.RUNNING) {
                    Logging.m157044i("Camera1Session", "Bytebuffer frame captured but camera is no longer running.");
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                    if (!Camera1Session.this.firstFrameReported) {
                        Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                        Camera1Session.this.firstFrameReported = true;
                    }
                    NV21Buffer nV21Buffer = new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Camera1Session$2$$Lambda$0(this, bArr));
                    int frameOrientation = Camera1Session.this.getFrameOrientation();
                    if (Camera1Session.this.info.facing == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    VideoFrame videoFrame = new VideoFrame(nV21Buffer, frameOrientation, nanos, z);
                    Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                    videoFrame.release();
                }
            }
        });
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new Camera1Session$$Lambda$0(this));
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    /* access modifiers changed from: package-private */
    public enum SessionState {
        RUNNING,
        STOPPED;

        static {
            Covode.recordClassIndex(106558);
        }
    }

    static {
        Covode.recordClassIndex(106552);
    }

    private void startCapturing() {
        Logging.m157044i("Camera1Session", "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() {
            /* class org.webrtc.Camera1Session.C902711 */

            static {
                Covode.recordClassIndex(106554);
            }

            public void onError(int i, Camera camera) {
                String concat;
                if (i == 100) {
                    concat = "Camera server died!";
                } else {
                    concat = "Camera error: ".concat(String.valueOf(i));
                }
                Logging.m157042e("Camera1Session", concat);
                Camera1Session.this.stopInternal();
                if (i == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, concat);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        Logging.m157044i("Camera1Session", "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public int getFrameOrientation() {
        int deviceOrientation$$STATIC$$ = CameraSession$$CC.getDeviceOrientation$$STATIC$$(this.applicationContext);
        int i = this.mLastValidDisplayRotation;
        int i2 = this.mDisplayRotationCheckCounter;
        if (i2 > 0) {
            this.mDisplayRotationCheckCounter = i2 - 1;
        } else if (i2 == 0) {
            if (!isInForeground(this.applicationContext)) {
                i = this.mLastValidDisplayRotation;
            } else {
                i = deviceOrientation$$STATIC$$;
            }
            this.mDisplayRotationCheckCounter = -1;
        } else if (deviceOrientation$$STATIC$$ != this.mLastDisplayRotation) {
            int i3 = sMinFramerate;
            if (i3 > 0) {
                this.mDisplayRotationCheckCounter = i3;
            } else {
                this.mDisplayRotationCheckCounter = 5;
            }
        }
        this.mLastDisplayRotation = deviceOrientation$$STATIC$$;
        this.mLastValidDisplayRotation = i;
        if (this.info.facing == 0) {
            i = 360 - i;
        }
        return (this.info.orientation + i) % 360;
    }

    public void stopInternal() {
        Logging.m157044i("Camera1Session", "Stop internal");
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            Logging.m157044i("Camera1Session", "Camera is already stopped");
            return;
        }
        this.state = SessionState.STOPPED;
        this.surfaceTextureHelper.stopListening();
        try {
            this.camera.stopPreview();
            if (this.captureToTexture) {
                this.camera.setPreviewTexture(null);
            }
            org_webrtc_Camera1Session_android_hardware_Camera_release(this.camera);
            this.events.onCameraClosed(this);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Error e2) {
            e2.printStackTrace();
        }
        Logging.m157044i("Camera1Session", "Stop done");
    }

    @Override // org.webrtc.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientation = orientation_mode;
    }

    private static boolean isInForeground(Context context) {
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) m157032xade3cf9(context, "activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$listenForTextureFrames$0$Camera1Session(VideoFrame videoFrame) {
        VideoFrame.Buffer cropAndScale;
        boolean z;
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            Logging.m157044i("Camera1Session", "Texture frame captured but camera is no longer running.");
            return;
        }
        boolean z2 = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        if (this.scaleWidth == 0 || this.scaleHeight == 0 || (this.captureFormat.width == this.scaleWidth && this.captureFormat.height == this.scaleHeight)) {
            cropAndScale = videoFrame.getBuffer().cropAndScale(0, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else if (((float) this.captureFormat.width) / ((float) this.captureFormat.height) > ((float) this.scaleWidth) / ((float) this.scaleHeight)) {
            cropAndScale = videoFrame.getBuffer().cropAndScale(((int) (((float) this.captureFormat.width) - ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)))) / 2, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else {
            cropAndScale = videoFrame.getBuffer().cropAndScale(0, ((int) (((float) this.captureFormat.height) - ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)))) / 2, this.captureFormat.width, (int) ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)), this.scaleWidth, this.scaleHeight);
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) cropAndScale;
        if (this.info.facing == 1) {
            z = true;
        } else {
            z = false;
        }
        VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix$$STATIC$$ = CameraSession$$CC.createTextureBufferWithModifiedTransformMatrix$$STATIC$$(textureBufferImpl, z, 0);
        int frameOrientation = getFrameOrientation();
        long timestampNs = videoFrame.getTimestampNs();
        if (this.info.facing != 1) {
            z2 = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(createTextureBufferWithModifiedTransformMatrix$$STATIC$$, frameOrientation, timestampNs, z2);
        cropAndScale.release();
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    /* renamed from: org_webrtc_Camera1Session_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m157032xade3cf9(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(444);
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
                    MethodCollector.m26664o(444);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        if (parameters != null) {
            return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
        }
        Logging.m157042e("Camera1Session", "camera parameters is null!");
        return null;
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i, int i2, int i3) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.m157044i("Camera1Session", "Available fps ranges: ".concat(String.valueOf(convertFramerates)));
        if (!Build.MODEL.equalsIgnoreCase("PEGM00") || i3 != 15) {
            closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        } else {
            closestSupportedFramerateRange = new CameraEnumerationAndroid.CaptureFormat.FramerateRange(15000, 20000);
            Logging.m157044i("Camera1Session", "unsupported framerate for special device found, hardcode framerange to:" + closestSupportedFramerateRange.toString());
        }
        Logging.m157044i("Camera1Session", "selected fps range :" + closestSupportedFramerateRange.toString());
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        Logging.m157044i("Camera1Session", "selected preview size" + closestSupportedSize.toString());
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static void updateCameraParameters(Camera camera2, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat2, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        parameters.setPreviewFpsRange(captureFormat2.framerate.min, captureFormat2.framerate.max);
        parameters.setPreviewSize(captureFormat2.width, captureFormat2.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            captureFormat2.getClass();
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera2.setParameters(parameters);
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, int i2, int i3, int i4) {
        long nanoTime = System.nanoTime();
        Logging.m157044i("Camera1Session", "Open camera " + i + " brand:" + Build.BRAND + ", modle:" + Build.MODEL + ", width:" + i2 + ", height:" + i3 + ", framerate:" + i4);
        events2.onCameraOpening();
        try {
            Camera org_webrtc_Camera1Session_android_hardware_Camera_open = org_webrtc_Camera1Session_android_hardware_Camera_open(i);
            if (org_webrtc_Camera1Session_android_hardware_Camera_open == null) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "android.hardware.Camera.open returned null for camera id = ".concat(String.valueOf(i)));
                return;
            }
            try {
                org_webrtc_Camera1Session_android_hardware_Camera_open.setPreviewTexture(surfaceTextureHelper2.getSurfaceTexture());
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                try {
                    Camera.Parameters parameters = org_webrtc_Camera1Session_android_hardware_Camera_open.getParameters();
                    CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i2, i3, i4);
                    Size findClosestPictureSize = findClosestPictureSize(parameters, i2, i3);
                    events2.onCameraConfig(findClosestPictureSize.width, findClosestPictureSize.height, findClosestCaptureFormat.framerate);
                    sMinFramerate = findClosestCaptureFormat.framerate.min / 1000;
                    updateCameraParameters(org_webrtc_Camera1Session_android_hardware_Camera_open, parameters, findClosestCaptureFormat, findClosestPictureSize, z);
                    if (!z) {
                        int frameSize = findClosestCaptureFormat.frameSize();
                        int i5 = 0;
                        do {
                            org_webrtc_Camera1Session_android_hardware_Camera_open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                            i5++;
                        } while (i5 < 3);
                    }
                    org_webrtc_Camera1Session_android_hardware_Camera_open.setDisplayOrientation(0);
                    createSessionCallback.onDone(new Camera1Session(events2, z, z2, context, surfaceTextureHelper2, i, org_webrtc_Camera1Session_android_hardware_Camera_open, cameraInfo, findClosestCaptureFormat, nanoTime, i2, i3));
                } catch (RuntimeException e) {
                    org_webrtc_Camera1Session_android_hardware_Camera_release(org_webrtc_Camera1Session_android_hardware_Camera_open);
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                }
            } catch (IOException | RuntimeException e2) {
                org_webrtc_Camera1Session_android_hardware_Camera_release(org_webrtc_Camera1Session_android_hardware_Camera_open);
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
            }
        } catch (RuntimeException e3) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
        }
    }

    private Camera1Session(CameraSession.Events events2, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, Camera camera2, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat2, long j, int i2, int i3) {
        Logging.m157044i("Camera1Session", "Create new camera1 session on camera ".concat(String.valueOf(i)));
        this.cameraThreadHandler = new Handler();
        this.events = events2;
        this.captureToTexture = z;
        this.isDesktopMode = z2;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = i;
        this.camera = camera2;
        this.info = cameraInfo;
        this.captureFormat = captureFormat2;
        this.constructionTimeNs = j;
        this.scaleWidth = i2;
        this.scaleHeight = i3;
        surfaceTextureHelper2.setTextureSize(captureFormat2.width, captureFormat2.height);
        startCapturing();
    }
}
