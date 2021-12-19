package com.bytedance.realx.video.camera;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.realx.RXNativeFunctions;
import com.bytedance.realx.base.RXLogging;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

public class RXVideoCaptureAndroid {
    private EglBase cameraEglBase;
    private CapturerObserver localCapturerObserver = new CapturerObserver() {
        /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.C219651 */

        static {
            Covode.recordClassIndex(25648);
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            MethodCollector.m26663i(1661);
            RXLogging.m41310d("RXVideoCaptureAndroid", "onCapturerStopped...");
            RXNativeFunctions.nativeOnCapturerStopped(RXVideoCaptureAndroid.this.mNativeCaptureObserver);
            MethodCollector.m26664o(1661);
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            MethodCollector.m26663i(1681);
            RXNativeFunctions.nativeOnFrameCaptured(RXVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
            MethodCollector.m26664o(1681);
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerError(String str) {
            MethodCollector.m26663i(1679);
            RXLogging.m41310d("RXVideoCaptureAndroid", "onCapturerError: ".concat(String.valueOf(str)));
            RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, 0);
            MethodCollector.m26664o(1679);
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z) {
            MethodCollector.m26663i(1581);
            if (z) {
                RXLogging.m41310d("RXVideoCaptureAndroid", "onCapturerStarted...");
                RXNativeFunctions.nativeOnCapturerStarted(RXVideoCaptureAndroid.this.mNativeCaptureObserver, z);
                MethodCollector.m26664o(1581);
                return;
            }
            RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, 0);
            MethodCollector.m26664o(1581);
        }
    };
    private CameraVideoCapturer.CameraEventsHandler mCameraEventsHandler;
    private int mCaptureBufferType;
    private Intent mCaptureScreenIntent;
    private int mHeight;
    private boolean mIsCaptureScreen;
    public boolean mIsFrontCamera = true;
    private boolean mIsVideoCaptureInited;
    private boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private VideoCapturer mVideoCapturer;
    private int mWidth;
    private EglBase.Context sharedEglGroup;

    static {
        Covode.recordClassIndex(25647);
    }

    private boolean isCaptureToTextureSupported() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    public int getCameraFace() {
        if (this.mIsFrontCamera) {
            return 1;
        }
        return 0;
    }

    public void stopCapture() {
        RXLogging.m41313i("RXVideoCaptureAndroid", "stopCapture...");
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                videoCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void switchCamera() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && (videoCapturer instanceof CameraVideoCapturer)) {
            this.mIsFrontCamera = !this.mIsFrontCamera;
            ((CameraVideoCapturer) videoCapturer).switchCamera(new CameraVideoCapturer.CameraSwitchHandler() {
                /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.C219662 */

                static {
                    Covode.recordClassIndex(25649);
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchError(String str) {
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchDone(boolean z) {
                    RXVideoCaptureAndroid.this.mIsFrontCamera = z;
                }
            });
        }
    }

    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        EglBase eglBase = this.cameraEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.cameraEglBase = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
        this.sharedEglGroup = null;
        this.mCaptureScreenIntent = null;
    }

    public class BufferType {
        static {
            Covode.recordClassIndex(25651);
        }

        public BufferType() {
        }
    }

    RXVideoCaptureAndroid(boolean z, long j, EglBase.Context context) {
        RXLogging.m41313i("RXVideoCaptureAndroid", "RXVideoCaptureAndroid Created, CaptureScreen=".concat(String.valueOf(z)));
        this.mIsCaptureScreen = z;
        this.mNativeCaptureObserver = j;
        this.sharedEglGroup = context;
    }

    private void startVideoCapture(int i, int i2, int i3) {
        RXLogging.m41313i("RXVideoCaptureAndroid", "startVideoCapture... ");
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            try {
                videoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                RXLogging.m41313i("RXVideoCaptureAndroid", "VideoCapture startCapture fail : " + e.getMessage());
            }
        }
    }

    private VideoCapturer createVideoCapturer(boolean z, int i, Intent intent) {
        boolean z2;
        CameraVideoCapturer createCapturer;
        CameraVideoCapturer createCapturer2;
        if (z) {
            try {
                return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() {
                    /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.C219673 */

                    static {
                        Covode.recordClassIndex(25650);
                    }

                    public void onStop() {
                        RXLogging.m41313i("RXVideoCaptureAndroid", "User revoked permission to capture the screen.");
                    }
                });
            } catch (IllegalArgumentException e) {
                RXLogging.m41311e("RXVideoCaptureAndroid", "Create VideoCapture fail : " + e.getMessage());
                return null;
            }
        } else {
            if (this.mCaptureBufferType == 1 || !isCaptureToTextureSupported()) {
                z2 = false;
            } else {
                z2 = true;
            }
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(z2, false);
            String[] deviceNames = camera1Enumerator.getDeviceNames();
            for (String str : deviceNames) {
                if (camera1Enumerator.isFrontFacing(str) && i == 1 && (createCapturer2 = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler)) != null) {
                    return createCapturer2;
                }
                if (camera1Enumerator.isBackFacing(str) && i == 0 && (createCapturer = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler)) != null) {
                    return createCapturer;
                }
            }
            return null;
        }
    }

    public void startCapture(int i, int i2, int i3, int i4, int i5, Intent intent) {
        MethodCollector.m26663i(1209);
        RXLogging.m41315w("RXVideoCaptureAndroid", "startCapture...");
        this.mWidth = i;
        this.mHeight = i2;
        this.mCaptureScreenIntent = intent;
        this.mCaptureBufferType = i5;
        if (C0643b.m2367a(ContextUtils.getApplicationContext(), "android.permission.CAMERA") != 0) {
            RXNativeFunctions.nativeOnCapturerError(this.mNativeCaptureObserver, -100);
            MethodCollector.m26664o(1209);
            return;
        }
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        this.mVideoCapturer = createVideoCapturer(this.mIsCaptureScreen, i4, this.mCaptureScreenIntent);
        if (this.cameraEglBase == null) {
            this.cameraEglBase = EglBase$$CC.create$$STATIC$$(this.sharedEglGroup);
        }
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RXLocalCapturer", this.cameraEglBase.getEglBaseContext());
        this.mSurfaceTextureHelper = create;
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 == null || create == null) {
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
            MethodCollector.m26664o(1209);
            return;
        }
        videoCapturer2.initialize(create, ContextUtils.getApplicationContext(), this.localCapturerObserver);
        this.mIsVideoCaptureInited = true;
        startVideoCapture(i, i2, i3);
        MethodCollector.m26664o(1209);
    }
}
