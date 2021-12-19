package com.p2082ss.avframework.capture.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.avframework.buffer.SurfaceTextureHelper;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.capture.video.VideoCapturer;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.lang.reflect.Field;

/* renamed from: com.ss.avframework.capture.video.ScreenVideoCapturer */
public class ScreenVideoCapturer extends VideoCapturer implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    private int fps;
    private int frameInterval;
    public int height;
    private boolean isDisposed;
    public final Runnable mDupFrameTask = new Runnable() {
        /* class com.p2082ss.avframework.capture.video.ScreenVideoCapturer.RunnableC856612 */

        static {
            Covode.recordClassIndex(99885);
        }

        public void run() {
            if (ScreenVideoCapturer.this.surfaceTextureHelper != null && ScreenVideoCapturer.this.mStat == 1) {
                ScreenVideoCapturer.this.surfaceTextureHelper.insertTextureFrameIfNeed();
            }
        }
    };
    private long mNextFrameTimeStamp;
    public final VideoCapturer.VideoCapturerObserver mObserver;
    public int mStat;
    protected MediaProjection mediaProjection;
    public final MediaProjection.Callback mediaProjectionCallback = new MediaProjection.Callback() {
        /* class com.p2082ss.avframework.capture.video.ScreenVideoCapturer.C856601 */

        static {
            Covode.recordClassIndex(99884);
        }

        public void onStop() {
            if (ScreenVideoCapturer.this.mObserver != null) {
                ScreenVideoCapturer.this.mObserver.onVideoCapturerError(-201, new Exception("mediaProjection session is no longer valid"));
            }
            super.onStop();
        }
    };
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    public int width;

    static {
        Covode.recordClassIndex(99883);
    }

    /* renamed from: com_ss_avframework_capture_video_ScreenVideoCapturer_android_media_projection_MediaProjectionManager_getMediaProjection */
    private static MediaProjection m147763x6578b435(MediaProjectionManager mediaProjectionManager2, int i, Intent intent) {
        Pair<Boolean, Object> a = C15346a.m28238a(mediaProjectionManager2, new Object[]{Integer.valueOf(i), intent}, 102101, "android.media.projection.MediaProjection", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (MediaProjection) a.second;
        }
        MediaProjection mediaProjection2 = mediaProjectionManager2.getMediaProjection(i, intent);
        C15346a.m28240a(mediaProjection2, mediaProjectionManager2, new Object[]{Integer.valueOf(i), intent}, 102101, "com_ss_avframework_capture_video_ScreenVideoCapturer_android_media_projection_MediaProjectionManager_getMediaProjection(Landroid/media/projection/MediaProjectionManager;ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;");
        return mediaProjection2;
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer, com.p2082ss.avframework.engine.VideoSource
    public boolean isScreenCast() {
        return true;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public void stop() {
        stopCapture();
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void release() {
        dispose();
        super.release();
        this.mStat = 2;
    }

    private synchronized void dispose() {
        MethodCollector.m26663i(1808);
        this.isDisposed = true;
        MethodCollector.m26664o(1808);
    }

    public synchronized void stopCapture() {
        MethodCollector.m26663i(1806);
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class com.p2082ss.avframework.capture.video.ScreenVideoCapturer.RunnableC856623 */

            static {
                Covode.recordClassIndex(99886);
            }

            /* renamed from: com_ss_avframework_capture_video_ScreenVideoCapturer$3_android_media_projection_MediaProjection_stop */
            private static void m147765x2376228a(MediaProjection mediaProjection) {
                if (!((Boolean) C15346a.m28238a(mediaProjection, new Object[0], 102102, "void", false, null).first).booleanValue()) {
                    mediaProjection.stop();
                    C15346a.m28240a(null, mediaProjection, new Object[0], 102102, "com_ss_avframework_capture_video_ScreenVideoCapturer$3_android_media_projection_MediaProjection_stop(Landroid/media/projection/MediaProjection;)V");
                }
            }

            public void run() {
                ScreenVideoCapturer.this.surfaceTextureHelper.getHandler().removeCallbacks(ScreenVideoCapturer.this.mDupFrameTask);
                ScreenVideoCapturer.this.surfaceTextureHelper.stopListening();
                if (ScreenVideoCapturer.this.virtualDisplay != null) {
                    ScreenVideoCapturer.this.virtualDisplay.release();
                    ScreenVideoCapturer.this.virtualDisplay = null;
                }
                if (ScreenVideoCapturer.this.mediaProjection != null) {
                    ScreenVideoCapturer.this.mediaProjection.unregisterCallback(ScreenVideoCapturer.this.mediaProjectionCallback);
                    try {
                        AVLog.ioi("ScreenVideoCapturer", "MediaProjection stop " + ScreenVideoCapturer.this.mediaProjection);
                        m147765x2376228a(ScreenVideoCapturer.this.mediaProjection);
                    } catch (Exception e) {
                        AVLog.ioe("ScreenVideoCapturer", "MediaProjection stop exception: " + e.getMessage());
                    }
                    ScreenVideoCapturer.this.mediaProjection = null;
                }
                ScreenVideoCapturer.this.mStat = 0;
            }
        });
        MethodCollector.m26664o(1806);
    }

    public void createVirtualDisplay() {
        this.surfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    private boolean keepFrame(long j) {
        long j2 = this.mNextFrameTimeStamp;
        if (j2 > 0) {
            long j3 = j2 - j;
            long abs = Math.abs(j3);
            int i = this.frameInterval;
            if (abs < ((long) (i * 2))) {
                if (j3 > 0) {
                    return false;
                }
                this.mNextFrameTimeStamp += (long) i;
                return true;
            }
        }
        this.mNextFrameTimeStamp = j + ((long) (this.frameInterval / 2));
        return true;
    }

    public ScreenVideoCapturer(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
        this.mediaProjectionPermissionResultData = intent;
        this.mObserver = videoCapturerObserver;
        this.mStat = 2;
    }

    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context) {
        MethodCollector.m26663i(1526);
        checkNotDisposed();
        if (surfaceTextureHelper2 != null) {
            this.surfaceTextureHelper = surfaceTextureHelper2;
            this.mediaProjectionManager = (MediaProjectionManager) m147764x9fae599f(context, "media_projection");
            this.mStat = 0;
            MethodCollector.m26664o(1526);
        } else {
            RuntimeException runtimeException = new RuntimeException("surfaceTextureHelper not set.");
            MethodCollector.m26664o(1526);
            throw runtimeException;
        }
    }

    /* renamed from: com_ss_avframework_capture_video_ScreenVideoCapturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147764x9fae599f(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1631);
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
                    MethodCollector.m26664o(1631);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        startCapture(i, i2, i3);
    }

    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        MethodCollector.m26663i(1818);
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay == null) {
            MethodCollector.m26664o(1818);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class com.p2082ss.avframework.capture.video.ScreenVideoCapturer.RunnableC856634 */

            static {
                Covode.recordClassIndex(99887);
            }

            public void run() {
                ScreenVideoCapturer.this.virtualDisplay.release();
                ScreenVideoCapturer.this.createVirtualDisplay();
            }
        });
        MethodCollector.m26664o(1818);
    }

    @Override // com.p2082ss.avframework.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        this.surfaceTextureHelper.getHandler().removeCallbacks(this.mDupFrameTask);
        this.surfaceTextureHelper.getHandler().postDelayed(this.mDupFrameTask, (long) this.frameInterval);
        this.numCapturedFrames++;
        long j2 = j / 1000;
        if (!keepFrame(j2 / 1000)) {
            this.surfaceTextureHelper.returnTextureFrame(true);
            return;
        }
        VideoFrame.TextureBuffer createTextureBuffer = this.surfaceTextureHelper.createTextureBuffer(this.width, this.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
        onFrame(createTextureBuffer, this.width, this.height, 0, j2);
        createTextureBuffer.release();
    }

    public synchronized void startCapture(int i, int i2, int i3) {
        MethodCollector.m26663i(1728);
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.frameInterval = 1000 / i3;
        try {
            this.mediaProjection = m147763x6578b435(this.mediaProjectionManager, -1, this.mediaProjectionPermissionResultData);
            AVLog.ioi("ScreenVideoCapturer", "MediaProjectionManager getMediaProjection " + this.mediaProjection);
            MediaProjection mediaProjection2 = this.mediaProjection;
            if (mediaProjection2 == null) {
                this.mObserver.onVideoCapturerError(-203, new Exception("mediaProjection is null, please check permission"));
                MethodCollector.m26664o(1728);
                return;
            }
            mediaProjection2.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.surfaceTextureHelper.startListening(this);
            this.mStat = 1;
            VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mObserver;
            if (videoCapturerObserver != null) {
                videoCapturerObserver.onVideoCapturerStarted();
            }
            MethodCollector.m26664o(1728);
        } catch (Exception e) {
            AVLog.ioe("ScreenVideoCapturer", "MediaProjectionManager getMediaProjection fail: " + e.getMessage());
            this.mObserver.onVideoCapturerError(-202, e);
            MethodCollector.m26664o(1728);
        }
    }
}
