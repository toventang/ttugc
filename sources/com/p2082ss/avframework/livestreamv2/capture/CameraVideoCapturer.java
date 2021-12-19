package com.p2082ss.avframework.livestreamv2.capture;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.TECameraCapture;
import com.p2082ss.android.ttvecamera.TEFrameRateRange;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.avframework.buffer.GlTextureFrameBuffer;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.capture.video.ExternalVideoCapturer;
import com.p2082ss.avframework.capture.video.VideoCapturer;
import com.p2082ss.avframework.livestreamv2.VideoFrameStatics;
import com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p2082ss.avframework.livestreamv2.utils.PrivacyCertManager;
import com.p2082ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.p2082ss.avframework.opengl.GlRenderDrawer;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.ThreadUtils;
import com.p2082ss.avframework.utils.TimeUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer */
public class CameraVideoCapturer extends ExternalVideoCapturer implements CameraObserver, IVideoCapturerControl {
    private static final Map<String, Bundle> CAMERA_FEATURES = new HashMap();
    public static String KEY_CAMERA_LOG_LEVEL = "camera_log_level";
    public static String KEY_DEST_FPS = "destFps";
    public static String KEY_ENABLE_FACE_AE = "enableFaceAE";
    public static String KEY_ENABLE_FALLBACK = "enableFallback";
    public static String KEY_ENABLE_STABILIZATION = "enableCameraStabilization";
    public static String KEY_ENABLE_WIDE_ANGLE = "enableWideAngle";
    public static String KEY_ENABLE_WIDE_FOV = "enableWideFov";
    public static String KEY_FRAME_FORMAT = "cameraFrameFormat";
    public static String KEY_IS_CAMERA_OPEN_CLOSE_SYNC = "is_camera_open_close_sync";
    public static String KEY_IS_FORCE_CLOSE_CAMERA = "isForceCloseCamera";
    public static String KEY_RESET_FPS_RANGE = "resetFpsRange";
    public static String KEY_RETRY_COUNT = "camera_open_retry_cnt";
    public static String KEY_RETRY_START_PREVIEW_COUNT = "camera_retry_start_preview_cnt";
    public static String KEY_USE_CAMERA2 = "useCamera2API";
    private int mCameraCaptureHeight;
    private int mCameraCaptureWidth;
    private int mCameraFacing;
    private int mCameraLogLevel = 0;
    private int mCameraOpenRetryCnt = 0;
    private int mCameraRetryStartPreviewCnt = 0;
    public int mCameraType;
    private TECameraCapture mCapture;
    private Context mContext;
    public int mDestFps = 0;
    public int mDisplayRotation;
    public GlRenderDrawer mDrawer;
    private boolean mEnableFaceAE = false;
    private boolean mEnableFallback = false;
    private int mEnableStabilization = 0;
    private int mEnableWideAngle = 0;
    private boolean mEnableWideFov = true;
    public GlTextureFrameBuffer mFrameBuffer;
    private int mFrameFormat = 0;
    public boolean mGotFirstFrame;
    public Handler mHandler;
    private ByteBuffer mI420Buffer;
    private ByteBuffer mI420RotatedBuffer;
    public boolean mISPExposureStatus = false;
    public boolean mISPFocuseStatus = false;
    public boolean mISPToggleStatus = false;
    private boolean mIsCameraOpenCloseSync = false;
    private boolean mIsForceCloseCamera = false;
    private ByteBuffer mNV21Buffer;
    public boolean mNewTexture;
    private final Object mObject = new Object();
    private VideoCapturer.VideoCapturerObserver mObserver;
    public int mOesTex;
    public GlTextureFrameBuffer mOesTo2DBuffer;
    public GlRenderDrawer mOesTo2DDrawer;
    public long mOpenCameraTimestamp;
    private Bundle mParams;
    private C30862c.C30863a mProviderSettings;
    private VideoDumpProxy.RawVideoDumperProxy[] mRawVideoDumpers = new VideoDumpProxy.RawVideoDumperProxy[2];
    public VideoFrameStatics mRealRateStatics = null;
    private JSONObject mReportStatus;
    public int mRotation;
    public C30933l mSettings;
    private boolean mSkipFirstFrame;
    public SurfaceTexture mSurfaceTexture;
    public float[] mTexMatrix = new float[16];
    public ThreadUtils.ThreadChecker mThreadChecker;
    private final Object mYuvBufferFence = new Object();
    public int[] mYuvTex = {0, 0, 0};
    private C30969o.AbstractC30971b veCameraLog;

    private void checkOesTo2D(int i, int i2, int i3, int i4) {
    }

    private void checkYuvFrames(ByteBuffer byteBuffer, int i, int i2, int i3) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public boolean currentSupportISPControl() {
        return true;
    }

    public void releaseRawVideoDumpers() {
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    public void tryDeliverYuvFrame(C30844i iVar, long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public void cancelAudioFocus() {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                tECameraCapture.cancelFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public void cancelAutoFocus() {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                tECameraCapture.cancelFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public float getInCaptureRealFps() {
        return getInCapFps();
    }

    public boolean isBackCam() {
        if (this.mCameraFacing != 1) {
            return true;
        }
        return false;
    }

    public boolean isCamera2Like() {
        if (this.mCameraType != 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public float getInCapFps() {
        VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
        if (videoFrameStatics != null) {
            return videoFrameStatics.getRealRatePerSecond();
        }
        return 0.0f;
    }

    private C30862c.C30863a createProviderSettings() {
        return new C30862c.C30863a(new TEFrameSizei(this.mCameraCaptureWidth, this.mCameraCaptureHeight), new AbstractC30857b.AbstractC30860a(false) {
            /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.C857577 */

            static {
                Covode.recordClassIndex(100122);
            }

            @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
            public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
            }

            @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
            public void onFrameCaptured(C30844i iVar) {
                boolean z;
                long currentTimeMs = TimeUtils.currentTimeMs();
                if (!CameraVideoCapturer.this.mGotFirstFrame) {
                    CameraVideoCapturer.this.mGotFirstFrame = true;
                    int[] iArr = {CameraVideoCapturer.this.mSettings.f74180d.f73613a / CameraVideoCapturer.this.mSettings.f74180d.f73615c, CameraVideoCapturer.this.mSettings.f74180d.f73614b / CameraVideoCapturer.this.mSettings.f74180d.f73615c};
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("CameraFirstFrameTime(ms)", currentTimeMs - CameraVideoCapturer.this.mOpenCameraTimestamp);
                        if (!CameraVideoCapturer.this.isBackCam()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jSONObject.put("IsFrontCamera", z);
                        jSONObject.put("CameraType", CameraVideoCapturer.this.mCameraType);
                        jSONObject.put("DestFps", CameraVideoCapturer.this.mDestFps);
                        jSONObject.put("FpsRangeStart", iArr[0]);
                        jSONObject.put("FpsRangeEnd", iArr[1]);
                    } catch (Exception unused) {
                    }
                    AVLog.logKibana(4, "CameraVideoCapturer", jSONObject.toString(), null);
                }
                AVLog.logToIODevice2(5, "CameraVideoCapturer", "TECameraProvider onFrameCaptured", null, "CameraVideoCapturer.java:onFrameCaptured", 10000);
                if (false) {
                    onYuvFrame(iVar, currentTimeMs);
                } else {
                    onTextureFrame(iVar, currentTimeMs);
                }
                VideoFrameStatics videoFrameStatics = CameraVideoCapturer.this.mRealRateStatics;
                if (videoFrameStatics != null) {
                    videoFrameStatics.add();
                }
            }

            private void onYuvFrame(C30844i iVar, long j) {
                CameraVideoCapturer.this.tryDeliverYuvFrame(iVar, j);
            }

            private void onTextureFrame(C30844i iVar, final long j) {
                if (!CameraVideoCapturer.this.isCamera2Like()) {
                    int i = iVar.f73882c.f73900f;
                    if (!(iVar.f73882c.f73902h == 0 || CameraVideoCapturer.this.mDisplayRotation == 0)) {
                        i = (i + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
                    }
                    CameraVideoCapturer.this.mRotation = i;
                } else {
                    int i2 = 0;
                    if (CameraVideoCapturer.this.mDisplayRotation == 1 || CameraVideoCapturer.this.mDisplayRotation == 3) {
                        i2 = (CameraVideoCapturer.this.mDisplayRotation - 2) * 90;
                    } else if (CameraVideoCapturer.this.mDisplayRotation == 2) {
                        i2 = LiveFeedRefreshTimeSetting.DEFAULT;
                    }
                    CameraVideoCapturer.this.mRotation = i2;
                }
                if (Thread.currentThread() != CameraVideoCapturer.this.mHandler.getLooper().getThread()) {
                    CameraVideoCapturer.this.mHandler.post(new Runnable() {
                        /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.C857577.RunnableC857581 */

                        static {
                            Covode.recordClassIndex(100123);
                        }

                        public void run() {
                            CameraVideoCapturer.this.mNewTexture = true;
                            CameraVideoCapturer.this.tryDeliverFrame(j);
                        }
                    });
                    return;
                }
                CameraVideoCapturer.this.mNewTexture = true;
                CameraVideoCapturer.this.tryDeliverFrame(j);
            }
        }, true, this.mSurfaceTexture, this.mOesTex);
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public IVideoCapturerControl.Range getExposureCompensationRange() {
        C30933l.C30943d cameraECInfo;
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture == null || (cameraECInfo = tECameraCapture.getCameraECInfo()) == null) {
            return null;
        }
        IVideoCapturerControl.Range range = new IVideoCapturerControl.Range();
        range.max = (float) cameraECInfo.f74215a;
        range.min = (float) cameraECInfo.f74217c;
        return range;
    }

    public int getValidCaptureFps() {
        C30933l lVar = this.mSettings;
        if (lVar == null || lVar.f74180d.f73615c <= 0) {
            return 0;
        }
        return this.mSettings.f74180d.f73614b / this.mSettings.f74180d.f73615c;
    }

    @Override // com.p2082ss.avframework.capture.video.ExternalVideoCapturer
    public void returnTexture() {
        this.mThreadChecker.checkIsOnValidThread();
        this.mBufferAlreadyReturn = true;
        if (this.mStatus == 1 && this.mNewTexture) {
            tryDeliverFrame(TimeUtils.currentTimeMs());
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.capture.video.ExternalVideoCapturer
    public synchronized void release() {
        MethodCollector.m26663i(2544);
        if (this.mHandler != null) {
            stop();
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC857609 */

                static {
                    Covode.recordClassIndex(100125);
                }

                public void run() {
                    if (CameraVideoCapturer.this.mSurfaceTexture != null) {
                        CameraVideoCapturer.this.mSurfaceTexture.release();
                        CameraVideoCapturer.this.mSurfaceTexture = null;
                    }
                    CameraVideoCapturer.this.releaseRawVideoDumpers();
                    if (CameraVideoCapturer.this.mOesTo2DBuffer != null) {
                        CameraVideoCapturer.this.mOesTo2DBuffer.release();
                        CameraVideoCapturer.this.mOesTo2DBuffer = null;
                    }
                    if (CameraVideoCapturer.this.mOesTo2DDrawer != null) {
                        CameraVideoCapturer.this.mOesTo2DDrawer.release();
                        CameraVideoCapturer.this.mOesTo2DDrawer = null;
                    }
                    if (CameraVideoCapturer.this.mYuvTex[0] > 0) {
                        GLES20.glDeleteTextures(CameraVideoCapturer.this.mYuvTex.length, CameraVideoCapturer.this.mYuvTex, 0);
                        CameraVideoCapturer.this.mYuvTex = new int[]{0, 0, 0};
                    }
                    if (CameraVideoCapturer.this.mDrawer != null) {
                        CameraVideoCapturer.this.mDrawer.release();
                        CameraVideoCapturer.this.mDrawer = null;
                    }
                    if (CameraVideoCapturer.this.mFrameBuffer != null) {
                        CameraVideoCapturer.this.mFrameBuffer.release();
                        CameraVideoCapturer.this.mFrameBuffer = null;
                    }
                }
            });
        }
        this.mContext = null;
        this.mRealRateStatics = null;
        super.release();
        MethodCollector.m26664o(2544);
    }

    static {
        Covode.recordClassIndex(100109);
    }

    public void switchCamera() {
        int i;
        int i2;
        try {
            this.mThreadChecker.checkIsOnValidThread();
            AVLog.ioi("CameraVideoCapturer", "switchCamera");
            if (this.mCapture == null) {
                this.mObserver.onVideoCapturerError(-205, new Exception("Capture already release"));
                return;
            }
            int i3 = 1;
            if (status() != 1) {
                AVLog.ioe("CameraVideoCapturer", "Camera no ready.");
                return;
            }
            boolean isBackCam = isBackCam();
            if (this.mEnableWideAngle != 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mEnableWideAngle = i;
            if (this.mEnableStabilization != 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.mEnableStabilization = i2;
            if (isBackCam) {
                this.mEnableWideAngle = -101;
            }
            if (!isCamera2Like()) {
                this.mEnableWideAngle = -100;
                this.mEnableStabilization = -100;
            }
            if (!isBackCam) {
                if (this.mEnableWideAngle == 1) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
            }
            this.mCameraFacing = i3;
            checkCameraFeatures(false);
            PrivacyCertManager.switchCameraWithCert(this.mCapture, this.mCameraFacing);
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC857544 */

                static {
                    Covode.recordClassIndex(100119);
                }

                public void run() {
                    CameraVideoCapturer.this.switchCamera();
                }
            });
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00a6 */
    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject getRealCameraStatus() {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.getRealCameraStatus():org.json.JSONObject");
    }

    @Override // com.p2082ss.avframework.capture.video.ExternalVideoCapturer, com.p2082ss.avframework.capture.video.VideoCapturer
    public synchronized void stop() {
        MethodCollector.m26663i(1702);
        this.mThreadChecker.checkIsOnValidThread();
        synchronized (this.mObject) {
            try {
                TECameraCapture tECameraCapture = this.mCapture;
                this.mCapture = null;
                if (tECameraCapture != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        PrivacyCertManager.cameraDisconnectWithCert(tECameraCapture);
                        tECameraCapture.stop();
                        String str = "Close TECamera: " + tECameraCapture + " cost time " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
                        AVLog.iod("CameraVideoCapturer", str);
                        AVLog.logKibana(6, "CameraVideoCapturer", str, null);
                    } catch (Throwable th) {
                        String str2 = "Close TECamera fail. cost time " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
                        AVLog.logToIODevice(6, "CameraVideoCapturer", str2, th);
                        AVLog.logKibana(6, "CameraVideoCapturer", str2, th);
                    }
                    C30933l lVar = this.mSettings;
                    if (lVar != null) {
                        lVar.mo56038a();
                    }
                }
            } finally {
                MethodCollector.m26664o(1702);
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$LiveCoreCameraObserver */
    class LiveCoreCameraObserver implements TECameraCapture.AbstractC30747a {
        private WeakReference<CameraObserver> mCameraObserverWeakReference;

        static {
            Covode.recordClassIndex(100126);
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onCaptureStopped(int i) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onCaptureStopped(i);
            }
        }

        public LiveCoreCameraObserver(WeakReference<CameraObserver> weakReference) {
            this.mCameraObserverWeakReference = weakReference;
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onCaptureStarted(int i, int i2) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onCaptureStarted(i, i2);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onError(int i, String str) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onError(i, str);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
        public void onInfo(int i, int i2, String str) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onInfo(i, i2, str);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.CameraObserver
    public void onCaptureStopped(final int i) {
        try {
            this.mThreadChecker.checkIsOnValidThread();
            C30862c.C30863a aVar = this.mProviderSettings;
            if (aVar != null) {
                aVar.f73933c = null;
                this.mProviderSettings = null;
            }
            AVLog.ioi("CameraVideoCapturer", "onCaptureStopped ".concat(String.valueOf(i)));
            super.stop();
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC857598 */

                static {
                    Covode.recordClassIndex(100124);
                }

                public void run() {
                    CameraVideoCapturer.this.onCaptureStopped(i);
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int setExposureCompensation(float f) {
        TECameraCapture tECameraCapture;
        final int[] iArr = {-1};
        IVideoCapturerControl.Range exposureCompensationRange = getExposureCompensationRange();
        if (exposureCompensationRange != null && ((f <= exposureCompensationRange.max || f >= exposureCompensationRange.min) && (tECameraCapture = this.mCapture) != null)) {
            try {
                this.mISPExposureStatus = true;
                tECameraCapture.setExposureCompensation((int) f);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC8574711 */

                    static {
                        Covode.recordClassIndex(100112);
                    }

                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPExposureStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int toggleFlashLight(boolean z) {
        final int[] iArr = {-1};
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                this.mISPToggleStatus = true;
                tECameraCapture.toggleTorch(z);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC8574610 */

                    static {
                        Covode.recordClassIndex(100111);
                    }

                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPToggleStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return iArr[0];
            }
        }
        return iArr[0];
    }

    private void checkCameraFeatures(boolean z) {
        StringBuilder sb;
        if (z) {
            try {
                sb = new StringBuilder().append(this.mSettings.f74179c).append("_").append(this.mSettings.f74181e);
            } catch (Exception e) {
                AVLog.logToIODevice(6, "CameraVideoCapturer", "queryFeatures fail. ", e);
                return;
            }
        } else {
            sb = new StringBuilder().append(this.mCameraType).append("_").append(this.mCameraFacing);
        }
        String sb2 = sb.toString();
        Map<String, Bundle> map = CAMERA_FEATURES;
        if (map.get(sb2) == null) {
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putString("camera_support_fps_range", "");
                this.mCapture.queryFeatures(bundle);
                this.mCapture.getCameraAllFeatures(this.mContext, bundle);
                map.put(sb2, bundle);
            } else {
                return;
            }
        } else if (z) {
            return;
        }
        if (map.get(sb2) == null) {
            AVLog.ioe("CameraVideoCapturer", "CAMERA_FEATURES[\"" + sb2 + "\"] is null.");
            return;
        }
        checkResetFpsRange(z, map.get(sb2));
        checkStabilizationAndWideAngle(z, map.get(sb2));
    }

    public void tryDeliverFrame(long j) {
        float f;
        if (this.mStatus != 1 || !this.mNewTexture || !this.mBufferAlreadyReturn) {
            String str = "mStatus " + this.mStatus + ", !mNewTexture " + (!this.mNewTexture) + ", !mBufferAlreadyReturn" + (true ^ this.mBufferAlreadyReturn);
            AVLog.logToIODevice2(5, "CameraVideoCapturer", "CameraVideoCapturer.tryDeliverFrame return: ".concat(String.valueOf(str)), null, "CameraVideoCapturer.java:tryDeliverFrame1: ".concat(String.valueOf(str)), 10000);
            return;
        }
        this.mNewTexture = false;
        try {
            this.mSurfaceTexture.updateTexImage();
            if (!this.mSkipFirstFrame || isCamera2Like()) {
                this.mSurfaceTexture.getTransformMatrix(this.mTexMatrix);
                checkOesTo2D(this.mOesTex, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mFps);
                if (isCamera2Like()) {
                    Matrix matrix = new Matrix();
                    matrix.preTranslate(0.5f, 0.5f);
                    matrix.preRotate((float) this.mRotation);
                    float f2 = -1.0f;
                    if (this.mHorizontalMirror) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (!this.mVerticalMirror) {
                        f2 = 1.0f;
                    }
                    matrix.preScale(f, f2);
                    matrix.preTranslate(-0.5f, -0.5f);
                    matrix.postConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.mTexMatrix));
                    pushVideoFrame(this.mOesTex, true, this.mOutWidth, this.mOutHeight, matrix, this.mSurfaceTexture.getTimestamp() / 1000, null, j);
                    return;
                }
                pushVideoFrame(this.mOesTex, true, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mRotation, this.mTexMatrix, this.mSurfaceTexture.getTimestamp() / 1000, null, j);
                return;
            }
            this.mSkipFirstFrame = false;
        } catch (Throwable th) {
            AVLog.logToIODevice2(6, "CameraVideoCapturer", th.getMessage(), null, "CameraVideoCapturer.java:tryDeliverFrame2", 10000);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int startZoom(boolean z, float f) {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            return tECameraCapture.startZoom(f, new C30933l.AbstractC30955p() {
                /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.C8575115 */

                static {
                    Covode.recordClassIndex(100116);
                }

                @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
                public boolean enableSmooth() {
                    return true;
                }

                @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
                public void onChange(int i, float f, boolean z) {
                    AVLog.iow("CameraVideoCapturer", "cameraType " + i + ", zoomValue " + f + ", stopped " + z);
                }

                @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
                public void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
                    String str;
                    String str2 = "";
                    String str3 = str2;
                    for (Integer num : list) {
                        int intValue = num.intValue();
                        StringBuilder append = new StringBuilder().append(str3);
                        if (str3.isEmpty()) {
                            str = "[";
                        } else {
                            str = ", ";
                        }
                        str3 = append.append(str).append(intValue).toString();
                    }
                    StringBuilder append2 = new StringBuilder().append(str3);
                    if (!str3.isEmpty()) {
                        str2 = "]";
                    }
                    AVLog.iow("CameraVideoCapturer", "cameraType " + i + ", supportZoom " + z + ", supportSmooth " + z2 + ", maxZoom " + f + ", ratios " + append2.append(str2).toString());
                }
            });
        }
        return -1;
    }

    private int compareFpsRange(TEFrameRateRange tEFrameRateRange, TEFrameRateRange tEFrameRateRange2) {
        int i = tEFrameRateRange.f73614b / tEFrameRateRange.f73615c;
        int i2 = tEFrameRateRange.f73613a / tEFrameRateRange.f73615c;
        int i3 = tEFrameRateRange2.f73614b / tEFrameRateRange2.f73615c;
        int i4 = tEFrameRateRange2.f73613a / tEFrameRateRange2.f73615c;
        if (i != i3) {
            return i - i3;
        }
        return i2 - i4;
    }

    public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
        final boolean[] zArr = {false};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC857533 */

            static {
                Covode.recordClassIndex(100118);
            }

            public void run() {
                GlTextureFrameBuffer glTextureFrameBuffer;
                if (CameraVideoCapturer.this.mOesTex > 0 && glRenderDrawer != null && (glTextureFrameBuffer = glTextureFrameBuffer) != null && glTextureFrameBuffer.getFrameBufferId() > 0) {
                    if (!(glTextureFrameBuffer.getWidth() == CameraVideoCapturer.this.mOutWidth && glTextureFrameBuffer.getHeight() == CameraVideoCapturer.this.mOutHeight)) {
                        try {
                            glTextureFrameBuffer.setSize(CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                        } catch (Exception e) {
                            AVLog.m147806e("CameraVideoCapturer", "frameBuffer setSize failed (" + e.getMessage() + ") w " + CameraVideoCapturer.this.mOutWidth + " h " + CameraVideoCapturer.this.mOutHeight);
                            return;
                        }
                    }
                    Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix);
                    if (CameraVideoCapturer.this.isCamera2Like()) {
                        CameraVideoCapturer.this.mRotation = 0;
                        if (CameraVideoCapturer.this.mDisplayRotation == 1 || CameraVideoCapturer.this.mDisplayRotation == 3) {
                            CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                            cameraVideoCapturer.mRotation = (cameraVideoCapturer.mDisplayRotation - 2) * 90;
                            CameraVideoCapturer cameraVideoCapturer2 = CameraVideoCapturer.this;
                            cameraVideoCapturer2.mRotation = (cameraVideoCapturer2.mRotation + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
                        } else if (CameraVideoCapturer.this.mDisplayRotation == 2) {
                            CameraVideoCapturer.this.mRotation = LiveFeedRefreshTimeSetting.DEFAULT;
                        }
                    }
                    if (CameraVideoCapturer.this.mRotation != 0) {
                        Matrix matrix = new Matrix();
                        matrix.reset();
                        matrix.preTranslate(0.5f, 0.5f);
                        matrix.preRotate((float) (-CameraVideoCapturer.this.mRotation));
                        matrix.preTranslate(-0.5f, -0.5f);
                        if (convertMatrixToAndroidGraphicsMatrix != null) {
                            if (CameraVideoCapturer.this.isCamera2Like()) {
                                matrix.postConcat(convertMatrixToAndroidGraphicsMatrix);
                            } else {
                                matrix.preConcat(convertMatrixToAndroidGraphicsMatrix);
                            }
                        }
                        convertMatrixToAndroidGraphicsMatrix = matrix;
                    }
                    AVLog.iod("CameraVideoCapturer", "CopyFrame CameraType " + CameraVideoCapturer.this.mSettings.f74179c + " mRotation " + CameraVideoCapturer.this.mRotation + " dpyRotation " + CameraVideoCapturer.this.mDisplayRotation);
                    float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
                    try {
                        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                        glRenderDrawer.drawOes(CameraVideoCapturer.this.mOesTex, null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                        GLES20.glFlush();
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("CameraVideoCapturer.copyCurrentFrame");
                        zArr[0] = true;
                    } catch (Exception e2) {
                        AVLog.ioe("CameraVideoCapturer", "copyCurrentFrame error: " + e2.toString());
                    }
                }
            }
        });
        return zArr[0];
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.CameraObserver
    public void onError(final int i, String str) {
        final Exception exc = new Exception(str);
        if (Thread.currentThread() == this.mHandler.getLooper().getThread()) {
            onErrorOnHandler(i, exc);
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC857555 */

                static {
                    Covode.recordClassIndex(100120);
                }

                public void run() {
                    CameraVideoCapturer.this.onErrorOnHandler(i, exc);
                }
            });
        }
    }

    private void checkStabilizationAndWideAngle(boolean z, Bundle bundle) {
        try {
            if (this.mEnableWideAngle == 1 || this.mEnableStabilization == 1) {
                boolean z2 = bundle.getBoolean("device_support_wide_angle");
                boolean z3 = bundle.getBoolean("device_support_anti_shake");
                if (this.mEnableWideAngle == 1 && !z2) {
                    this.mEnableWideAngle = -1;
                }
                if (this.mEnableStabilization == 1 && !z3) {
                    this.mEnableStabilization = -1;
                    this.mSettings.f74151R = false;
                }
                AVLog.iow("CameraVideoCapturer", "Feature support status: stabilization " + this.mEnableStabilization + ", wide angle " + this.mEnableWideAngle);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com_ss_avframework_livestreamv2_capture_CameraVideoCapturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147779x397a6f81(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1660);
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
                    MethodCollector.m26664o(1660);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void onErrorOnHandler(int i, Exception exc) {
        switch (i) {
            case -417:
            case -416:
                this.mISPToggleStatus = false;
                return;
            case -415:
            case -414:
            case -413:
                this.mISPExposureStatus = false;
                return;
            case -412:
            case -411:
                this.mISPFocuseStatus = false;
                return;
            default:
                this.mStatus = 2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("TECaptureError", i);
                    jSONObject.put("params", this.mParams);
                } catch (Exception unused) {
                }
                if (this.mCameraOpenRetryCnt <= 0 || i != -404) {
                    AVLog.logKibana(6, "CameraVideoCapturer", jSONObject.toString(), exc);
                    this.mObserver.onVideoCapturerError(i, exc);
                    return;
                }
                return;
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int queryZoomAbility(final boolean z, boolean z2) {
        MethodCollector.m26663i(3143);
        final int[] iArr = {0, 0};
        final Object obj = new Object();
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            iArr[0] = tECameraCapture.queryZoomAbility(new C30933l.AbstractC30955p() {
                /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.C8575014 */

                static {
                    Covode.recordClassIndex(100115);
                }

                @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
                public boolean enableSmooth() {
                    return z;
                }

                @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
                public void onChange(int i, float f, boolean z) {
                    AVLog.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: cameraType " + i + ", zoomValue " + f + ", stopped " + z, null, "CameraVideoCapturer.queryZoomAbility2", 10000);
                }

                @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
                public void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
                    String str;
                    String str2;
                    MethodCollector.m26663i(2319);
                    String str3 = "";
                    for (Integer num : list) {
                        int intValue = num.intValue();
                        StringBuilder append = new StringBuilder().append(str3);
                        if (str3.isEmpty()) {
                            str2 = "[";
                        } else {
                            str2 = ", ";
                        }
                        str3 = append.append(str2).append(intValue).toString();
                    }
                    StringBuilder append2 = new StringBuilder().append(str3);
                    if (str3.isEmpty()) {
                        str = "";
                    } else {
                        str = "]";
                    }
                    String sb = append2.append(str).toString();
                    try {
                        synchronized (obj) {
                            try {
                                AVLog.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: cameraType " + i + ", supportZoom " + z + ", supportSmooth " + z2 + ", maxZoom " + f + ", ratios " + sb, null, "CameraVideoCapturer.queryZoomAbility1", 10000);
                                iArr[1] = (int) f;
                                obj.notifyAll();
                            } finally {
                                MethodCollector.m26664o(2319);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MethodCollector.m26664o(2319);
                    }
                }
            }, z2);
            if (iArr[0] != 0) {
                int abs = Math.abs(iArr[0]) * -1;
                MethodCollector.m26664o(3143);
                return abs;
            }
            try {
                synchronized (obj) {
                    try {
                        obj.wait(500);
                        if (iArr[1] == 0) {
                            AVLog.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: query timeout", null, "CameraVideoCapturer.queryZoomAbility3", 10000);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(3143);
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int i = iArr[1];
        MethodCollector.m26664o(3143);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (r9 != 0) goto L_0x00ca;
     */
    @Override // com.p2082ss.avframework.livestreamv2.capture.CameraObserver
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureStarted(final int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.onCaptureStarted(int, int):void");
    }

    private void checkResetFpsRange(boolean z, Bundle bundle) {
        String str;
        String str2;
        MethodCollector.m26663i(2488);
        try {
            int i = this.mDestFps;
            if (i <= 0) {
                MethodCollector.m26664o(2488);
                return;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("camera_support_fps_range");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                AVLog.ioe("CameraVideoCapturer", "TECameraCapture query CAMERA_SUPPORT_FPS_RANGE get null.");
                MethodCollector.m26664o(2488);
                return;
            }
            TEFrameRateRange tEFrameRateRange = this.mSettings.f74180d;
            String str3 = "";
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                TEFrameRateRange tEFrameRateRange2 = (TEFrameRateRange) it.next();
                int i2 = tEFrameRateRange2.f73614b / tEFrameRateRange2.f73615c;
                int i3 = tEFrameRateRange2.f73613a / tEFrameRateRange2.f73615c;
                if (i2 >= i && compareFpsRange(tEFrameRateRange2, tEFrameRateRange) < 0) {
                    tEFrameRateRange = new TEFrameRateRange(i3, i2);
                }
                StringBuilder append = new StringBuilder().append(str3);
                if (str3.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = ", ";
                }
                str3 = append.append(str2).append("(").append(i3).append(", ").append(i2).append(")").toString();
            }
            if (compareFpsRange(tEFrameRateRange, this.mSettings.f74180d) != 0) {
                StringBuilder append2 = new StringBuilder("Dest fps: ").append(this.mDestFps).append(". Fps range list: [").append(str3).append("]. mCapture.setPreviewFpsRange(").append(tEFrameRateRange.f73613a).append(", ").append(tEFrameRateRange.f73614b).append(")");
                if (z) {
                    str = " after ";
                } else {
                    str = " before ";
                }
                AVLog.iow("CameraVideoCapturer", append2.append(str).append("open camera.").toString());
                synchronized (this.mObject) {
                    try {
                        this.mSettings.f74180d = tEFrameRateRange;
                        if (z) {
                            this.mCapture.setPreviewFpsRange(tEFrameRateRange);
                        }
                        this.mFps = tEFrameRateRange.f73614b;
                    } finally {
                        MethodCollector.m26664o(2488);
                    }
                }
                return;
            }
            MethodCollector.m26664o(2488);
        } catch (Exception unused) {
            MethodCollector.m26664o(2488);
        }
    }

    private int genTextureWithInit(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
        return iArr[0];
    }

    private boolean postAndWait(Handler handler, long j, final Runnable runnable) {
        MethodCollector.m26663i(2918);
        boolean z = false;
        if (!(handler == null || runnable == null || j <= 0)) {
            final Object obj = new Object();
            final boolean[] zArr = {false};
            synchronized (obj) {
                try {
                    if (handler.post(new Runnable() {
                        /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC8574913 */

                        static {
                            Covode.recordClassIndex(100114);
                        }

                        public void run() {
                            MethodCollector.m26663i(4264);
                            runnable.run();
                            zArr[0] = true;
                            synchronized (obj) {
                                try {
                                    obj.notify();
                                } finally {
                                    MethodCollector.m26664o(4264);
                                }
                            }
                        }
                    })) {
                        try {
                            obj.wait(j);
                        } catch (InterruptedException unused) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(2918);
                }
            }
            z = zArr[0];
        }
        return z;
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.CameraObserver
    public void onInfo(int i, int i2, String str) {
        if (i == 120) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("TECaptureInfo", i);
                jSONObject.put("Ext", i2);
                jSONObject.put("msg", str);
                jSONObject.put("CameraType", this.mCameraType);
                jSONObject.put("CameraOpenRetryCnt", this.mCameraOpenRetryCnt);
            } catch (Exception unused) {
            }
            AVLog.logKibana(4, "CameraVideoCapturer", jSONObject.toString(), null);
        } else if (i == 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("TECaptureInfo", i);
                jSONObject2.put("Ext", i2);
                jSONObject2.put("msg", str);
                jSONObject2.put("CameraType", this.mCameraType);
                jSONObject2.put("CameraRetryStartPreviewCnt", this.mCameraRetryStartPreviewCnt);
            } catch (Exception unused2) {
            }
            AVLog.logKibana(4, "CameraVideoCapturer", jSONObject2.toString(), null);
        } else if (i == 1) {
            checkCameraFeatures(true);
        } else {
            AVLog.iod("CameraVideoCapturer", "TECapture type " + i + " ext " + i2 + " msg " + str);
        }
    }

    @Override // com.p2082ss.avframework.capture.video.ExternalVideoCapturer, com.p2082ss.avframework.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        int i4;
        MethodCollector.m26663i(1692);
        AVLog.ioi("CameraVideoCapturer", "start(" + i + ", " + i2 + ", " + i3 + ")");
        this.mOutWidth = i;
        this.mOutHeight = i2;
        this.mCameraCaptureHeight = Math.min(i, i2);
        this.mCameraCaptureWidth = Math.max(i, i2);
        this.mFps = i3;
        synchronized (this.mObject) {
            try {
                if (this.mCapture != null) {
                    C30933l lVar = new C30933l(this.mContext, this.mCameraType, this.mCameraCaptureWidth, this.mCameraCaptureHeight);
                    this.mSettings = lVar;
                    if (this.mFps < 30) {
                        i4 = this.mFps;
                    } else {
                        i4 = this.mSettings.f74180d.f73613a;
                    }
                    lVar.f74180d = new TEFrameRateRange(i4, this.mFps);
                    this.mSettings.f74181e = this.mCameraFacing;
                    this.mSettings.f74135B = 0;
                    this.mSettings.f74142I = this.mEnableFallback;
                    boolean z = true;
                    this.mSettings.f74136C.putBoolean("enableFrontFacingVideoContinueFocus", true);
                    this.mSettings.f74145L = 3;
                    this.mSettings.f74197u = this.mCameraOpenRetryCnt;
                    this.mSettings.f74199w = this.mCameraOpenRetryCnt;
                    this.mSettings.f74198v = this.mCameraRetryStartPreviewCnt;
                    this.mSettings.f74148O = this.mIsForceCloseCamera;
                    this.mSettings.f74147N = this.mIsCameraOpenCloseSync;
                    C30933l lVar2 = this.mSettings;
                    if (this.mEnableStabilization != 1) {
                        z = false;
                    }
                    lVar2.f74151R = z;
                    this.mSettings.f74189m = this.mEnableWideFov;
                    this.mSettings.f74136C.putBoolean("useCameraFaceDetect", this.mEnableFaceAE);
                    checkCameraFeatures(false);
                    this.mOpenCameraTimestamp = TimeUtils.currentTimeMs();
                    this.mGotFirstFrame = false;
                    int cameraConnectWithCert = PrivacyCertManager.cameraConnectWithCert(this.mCapture, this.mSettings);
                    AVLog.logKibana(4, "CameraVideoCapturer", "TECameraCapture: " + this.mCapture + " connect, CameraVideoCapturer: " + this, null);
                    if (cameraConnectWithCert != 0) {
                        this.mObserver.onVideoCapturerError(cameraConnectWithCert, new Exception("Capture connect failed(" + cameraConnectWithCert + ")"));
                    }
                } else {
                    this.mObserver.onVideoCapturerError(-204, new Exception("Capture already release"));
                }
            } finally {
                MethodCollector.m26664o(1692);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int setFocusAreas(int i, int i2, int i3, int i4) {
        final int[] iArr = {-1};
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                this.mISPFocuseStatus = true;
                tECameraCapture.focusAtPoint(i, i2, 0.15f, i3, i4);
                postAndWait(this.mHandler, 3000, new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC8574812 */

                    static {
                        Covode.recordClassIndex(100113);
                    }

                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPFocuseStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return super.onFrame(buffer, i, i2, i3, j);
    }

    private void updateTexSubImage(int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
    }

    public CameraVideoCapturer(Handler handler, boolean z, VideoCapturer.VideoCapturerObserver videoCapturerObserver, Context context, int i, Bundle bundle) {
        super(videoCapturerObserver, handler);
        int i2;
        int i3;
        int i4;
        this.mOesTex = i;
        this.mParams = bundle;
        boolean z2 = bundle.getBoolean(KEY_USE_CAMERA2);
        if (Build.VERSION.SDK_INT < 24 && z2) {
            if (!(handler == null || videoCapturerObserver == null)) {
                AVLog.iow("CameraVideoCapturer", "Find using CameraV2 at SDK " + Build.VERSION.SDK_INT + " with force using CameraV1");
            }
            bundle.putBoolean(KEY_USE_CAMERA2, false);
            z2 = false;
        }
        this.mCapture = new TECameraCapture(new LiveCoreCameraObserver(new WeakReference(this)));
        String str = "TECameraCapture: " + this.mCapture + " is created, CameraVideoCapturer: " + this + ", front " + z + ", params " + bundle;
        AVLog.ioi("CameraVideoCapturer", str);
        AVLog.logKibana(4, "CameraVideoCapturer", str, null);
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.RunnableC857451 */

            static {
                Covode.recordClassIndex(100110);
            }

            public void run() {
                CameraVideoCapturer.this.mThreadChecker = new ThreadUtils.ThreadChecker();
                CameraVideoCapturer.this.mSurfaceTexture = new SurfaceTexture(CameraVideoCapturer.this.mOesTex);
            }
        });
        this.mHandler = handler;
        this.mObserver = videoCapturerObserver;
        this.mContext = context;
        enableSigalMode(true);
        if (z2) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        this.mCameraType = i2;
        this.mCameraOpenRetryCnt = bundle.getInt(KEY_RETRY_COUNT);
        this.mCameraRetryStartPreviewCnt = bundle.getInt(KEY_RETRY_START_PREVIEW_COUNT);
        this.mCameraLogLevel = bundle.getInt(KEY_CAMERA_LOG_LEVEL);
        int i5 = -100;
        if (!z2) {
            i3 = -100;
        } else if (bundle.getInt(KEY_ENABLE_STABILIZATION) == 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.mEnableStabilization = i3;
        if (z) {
            i5 = -101;
        } else if (z2) {
            if (bundle.getBoolean(KEY_ENABLE_WIDE_ANGLE)) {
                i5 = 1;
            } else {
                i5 = 0;
            }
        }
        this.mEnableWideAngle = i5;
        if (z) {
            i4 = 1;
        } else if (i5 == 1) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        this.mCameraFacing = i4;
        this.mEnableFaceAE = bundle.getBoolean(KEY_ENABLE_FACE_AE);
        this.mEnableWideFov = bundle.getBoolean(KEY_ENABLE_WIDE_FOV);
        this.mDestFps = bundle.getInt(KEY_DEST_FPS);
        this.mEnableFallback = bundle.getBoolean(KEY_ENABLE_FALLBACK);
        this.mIsForceCloseCamera = bundle.getBoolean(KEY_IS_FORCE_CLOSE_CAMERA);
        this.mIsCameraOpenCloseSync = bundle.getBoolean(KEY_IS_CAMERA_OPEN_CLOSE_SYNC);
        this.mFrameFormat = 0;
        this.mDisplayRotation = ((WindowManager) m147779x397a6f81(this.mContext, "window")).getDefaultDisplay().getRotation();
        int i6 = this.mCameraLogLevel;
        if (i6 > 0 && i6 <= 5) {
            this.veCameraLog = new C30969o.AbstractC30971b() {
                /* class com.p2082ss.avframework.livestreamv2.capture.CameraVideoCapturer.C857522 */

                static {
                    Covode.recordClassIndex(100117);
                }

                @Override // com.p2082ss.android.ttvecamera.C30969o.AbstractC30971b
                public void Log(byte b, String str, String str2) {
                    if (b == 16) {
                        AVLog.iov(str, str2);
                    } else if (b == 8) {
                        AVLog.iod(str, str2);
                    } else if (b == 4) {
                        AVLog.ioi(str, str2);
                    } else if (b == 2) {
                        AVLog.iow(str, str2);
                    } else if (b == 1) {
                        AVLog.ioe(str, str2);
                    }
                }
            };
        }
        C30969o.AbstractC30971b bVar = this.veCameraLog;
        if (bVar != null) {
            int i7 = this.mCameraLogLevel;
            if (i7 == 0) {
                TECameraCapture.registerLogOutput((byte) 0, bVar);
            } else if (i7 == 1) {
                TECameraCapture.registerLogOutput((byte) 31, bVar);
            } else if (i7 == 2) {
                TECameraCapture.registerLogOutput((byte) 15, bVar);
            } else if (i7 == 3) {
                TECameraCapture.registerLogOutput((byte) 7, bVar);
            } else if (i7 == 4) {
                TECameraCapture.registerLogOutput((byte) 3, bVar);
            } else if (i7 != 5) {
                TECameraCapture.registerLogOutput((byte) 0, bVar);
            } else {
                TECameraCapture.registerLogOutput((byte) 1, bVar);
            }
        }
    }
}
