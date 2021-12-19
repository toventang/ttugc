package org.webrtc;

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
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class ScreenCaptureAndroidManager implements VideoCapturer, VideoSink {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private DeviceOrientation mCurrentOrientation;
    private Display mDisplay;
    private int mFrameIndex;
    public Map<Integer, CountDownLatch> mLocks;
    private Map<Integer, VideoFrame> mVideoFrames;
    public MediaProjection mediaProjection;
    public MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    private int width;

    static {
        Covode.recordClassIndex(106699);
    }

    /* renamed from: org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection */
    private static MediaProjection m157055x377ad65b(MediaProjectionManager mediaProjectionManager2, int i, Intent intent) {
        Pair<Boolean, Object> a = C15346a.m28238a(mediaProjectionManager2, new Object[]{Integer.valueOf(i), intent}, 102101, "android.media.projection.MediaProjection", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (MediaProjection) a.second;
        }
        MediaProjection mediaProjection2 = mediaProjectionManager2.getMediaProjection(i, intent);
        C15346a.m28240a(mediaProjection2, mediaProjectionManager2, new Object[]{Integer.valueOf(i), intent}, 102101, "org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection(Landroid/media/projection/MediaProjectionManager;ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;");
        return mediaProjection2;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class HOLDER {
        public static final ScreenCaptureAndroidManager INSTANCE = new ScreenCaptureAndroidManager();

        private HOLDER() {
        }

        static {
            Covode.recordClassIndex(106704);
        }
    }

    public static ScreenCaptureAndroidManager INSTANCE() {
        return HOLDER.INSTANCE;
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private ScreenCaptureAndroidManager() {
        this.mVideoFrames = new HashMap();
        this.mLocks = new HashMap();
    }

    private boolean maybeDoRotation() {
        DeviceOrientation deviceOrientation = getDeviceOrientation(getDeviceRotation());
        if (deviceOrientation == this.mCurrentOrientation) {
            return false;
        }
        this.mCurrentOrientation = deviceOrientation;
        rotateCaptureOrientation(deviceOrientation);
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        MethodCollector.m26663i(816);
        this.isDisposed = true;
        MethodCollector.m26664o(816);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        MethodCollector.m26663i(811);
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class org.webrtc.ScreenCaptureAndroidManager.RunnableC903002 */

            static {
                Covode.recordClassIndex(106701);
            }

            /* renamed from: org_webrtc_ScreenCaptureAndroidManager$2_android_media_projection_MediaProjection_stop */
            private static void m157059x43b1efe3(MediaProjection mediaProjection) {
                if (!((Boolean) C15346a.m28238a(mediaProjection, new Object[0], 102102, "void", false, null).first).booleanValue()) {
                    mediaProjection.stop();
                    C15346a.m28240a(null, mediaProjection, new Object[0], 102102, "org_webrtc_ScreenCaptureAndroidManager$2_android_media_projection_MediaProjection_stop(Landroid/media/projection/MediaProjection;)V");
                }
            }

            public void run() {
                ScreenCaptureAndroidManager.this.surfaceTextureHelper.stopListening();
                ScreenCaptureAndroidManager.this.capturerObserver.onCapturerStopped();
                if (ScreenCaptureAndroidManager.this.virtualDisplay != null) {
                    ScreenCaptureAndroidManager.this.virtualDisplay.release();
                    ScreenCaptureAndroidManager.this.virtualDisplay = null;
                }
                if (ScreenCaptureAndroidManager.this.mediaProjection != null) {
                    ScreenCaptureAndroidManager.this.mediaProjection.unregisterCallback(ScreenCaptureAndroidManager.this.mediaProjectionCallback);
                    m157059x43b1efe3(ScreenCaptureAndroidManager.this.mediaProjection);
                    ScreenCaptureAndroidManager.this.mediaProjection = null;
                }
            }
        });
        MethodCollector.m26664o(811);
    }

    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE;

        static {
            Covode.recordClassIndex(106703);
        }
    }

    private synchronized int getDeviceRotation() {
        MethodCollector.m26663i(1047);
        int rotation = this.mDisplay.getRotation();
        if (rotation == 0) {
            MethodCollector.m26664o(1047);
            return 0;
        } else if (rotation == 1) {
            MethodCollector.m26664o(1047);
            return 90;
        } else if (rotation == 2) {
            MethodCollector.m26664o(1047);
            return LiveFeedRefreshTimeSetting.DEFAULT;
        } else if (rotation != 3) {
            MethodCollector.m26664o(1047);
            return 0;
        } else {
            MethodCollector.m26664o(1047);
            return 270;
        }
    }

    public void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("RTCScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    private DeviceOrientation getDeviceOrientation(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        return DeviceOrientation.LANDSCAPE;
                    }
                }
            }
            return DeviceOrientation.LANDSCAPE;
        }
        return DeviceOrientation.PORTRAIT;
    }

    private void rotateCaptureOrientation(DeviceOrientation deviceOrientation) {
        if ((deviceOrientation == DeviceOrientation.LANDSCAPE && this.width < this.height) || (deviceOrientation == DeviceOrientation.PORTRAIT && this.height < this.width)) {
            int i = this.width;
            int i2 = this.height;
            this.height = i;
            this.width = i + (i2 - i);
        }
    }

    public int addFrame(VideoFrame videoFrame) {
        int i = this.mFrameIndex;
        this.mVideoFrames.put(Integer.valueOf(i), videoFrame);
        this.mFrameIndex++;
        return i;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (maybeDoRotation()) {
            VirtualDisplay virtualDisplay2 = this.virtualDisplay;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
            }
            createVirtualDisplay();
            return;
        }
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public VideoFrame removeFrame(int i) {
        if (this.mVideoFrames.containsKey(Integer.valueOf(i))) {
            return this.mVideoFrames.remove(Integer.valueOf(i));
        }
        return null;
    }

    public synchronized void stopCapture(final int i) {
        MethodCollector.m26663i(803);
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class org.webrtc.ScreenCaptureAndroidManager.RunnableC902991 */

            static {
                Covode.recordClassIndex(106700);
            }

            /* renamed from: org_webrtc_ScreenCaptureAndroidManager$1_android_media_projection_MediaProjection_stop */
            private static void m157057xce37c9a2(MediaProjection mediaProjection) {
                if (!((Boolean) C15346a.m28238a(mediaProjection, new Object[0], 102102, "void", false, null).first).booleanValue()) {
                    mediaProjection.stop();
                    C15346a.m28240a(null, mediaProjection, new Object[0], 102102, "org_webrtc_ScreenCaptureAndroidManager$1_android_media_projection_MediaProjection_stop(Landroid/media/projection/MediaProjection;)V");
                }
            }

            /* renamed from: org_webrtc_ScreenCaptureAndroidManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_i */
            public static int m157058x5d7d2267(String str, String str2) {
                return 0;
            }

            public void run() {
                CountDownLatch remove = ScreenCaptureAndroidManager.this.mLocks.remove(Integer.valueOf(i));
                if (remove != null) {
                    remove.countDown();
                    m157058x5d7d2267("ScreenCaptureAndroid", "stopCapture countDown finish");
                }
                ScreenCaptureAndroidManager.this.surfaceTextureHelper.stopListening();
                ScreenCaptureAndroidManager.this.capturerObserver.onCapturerStopped();
                if (ScreenCaptureAndroidManager.this.virtualDisplay != null) {
                    ScreenCaptureAndroidManager.this.virtualDisplay.release();
                    ScreenCaptureAndroidManager.this.virtualDisplay = null;
                }
                if (ScreenCaptureAndroidManager.this.mediaProjection != null) {
                    ScreenCaptureAndroidManager.this.mediaProjection.unregisterCallback(ScreenCaptureAndroidManager.this.mediaProjectionCallback);
                    m157057xce37c9a2(ScreenCaptureAndroidManager.this.mediaProjection);
                    ScreenCaptureAndroidManager.this.mediaProjection = null;
                }
            }
        });
        MethodCollector.m26664o(803);
    }

    public void setData(Intent intent, MediaProjection.Callback callback) {
        this.isDisposed = false;
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    public void addLock(int i, CountDownLatch countDownLatch) {
        this.mLocks.put(Integer.valueOf(i), countDownLatch);
    }

    /* renamed from: org_webrtc_ScreenCaptureAndroidManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m157056x4899f39(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(752);
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
                    MethodCollector.m26664o(752);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        MethodCollector.m26663i(775);
        startCapture(i, i2, i3, 4);
        MethodCollector.m26664o(775);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        MethodCollector.m26663i(947);
        checkNotDisposed();
        if (i <= 0 || i2 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i;
            this.height = i2;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        if (this.virtualDisplay == null) {
            MethodCollector.m26664o(947);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class org.webrtc.ScreenCaptureAndroidManager.RunnableC903013 */

            static {
                Covode.recordClassIndex(106702);
            }

            public void run() {
                ScreenCaptureAndroidManager.this.virtualDisplay.release();
                ScreenCaptureAndroidManager.this.createVirtualDisplay();
            }
        });
        MethodCollector.m26664o(947);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context, CapturerObserver capturerObserver2) {
        MethodCollector.m26663i(733);
        checkNotDisposed();
        if (capturerObserver2 != null) {
            this.capturerObserver = capturerObserver2;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.mediaProjectionManager = (MediaProjectionManager) m157056x4899f39(context, "media_projection");
                this.mDisplay = ((WindowManager) m157056x4899f39(context, "window")).getDefaultDisplay();
                MethodCollector.m26664o(733);
            } else {
                RuntimeException runtimeException = new RuntimeException("surfaceTextureHelper not set.");
                MethodCollector.m26664o(733);
                throw runtimeException;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException("capturerObserver not set.");
            MethodCollector.m26664o(733);
            throw runtimeException2;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(768);
        checkNotDisposed();
        if (i <= 0 || i2 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i;
            this.height = i2;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        MediaProjection org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection = m157055x377ad65b(this.mediaProjectionManager, -1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection;
        if (org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection == null) {
            MethodCollector.m26664o(768);
            return;
        }
        org_webrtc_ScreenCaptureAndroidManager_android_media_projection_MediaProjectionManager_getMediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (i4 <= 0) {
            i4 = 4;
        }
        surfaceTextureHelper2.setMinFps(i4);
        this.surfaceTextureHelper.startListening(this);
        MethodCollector.m26664o(768);
    }
}
