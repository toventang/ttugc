package com.p2082ss.avframework.livestreamv2.core;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.SurfaceTextureHelper;
import com.p2082ss.avframework.livestreamv2.RenderView;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.utils.VideoProcessUnit;
import com.p2082ss.avframework.opengl.GLThread;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.ThreadUtils;
import com.p2082ss.avframework.utils.TimeUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.avframework.livestreamv2.core.ShortVideoPushManager */
public class ShortVideoPushManager implements IShortVideoPushManager {
    private Surface mCurrentActiveSurface;
    private int mDefaultBufferHeight = 1280;
    private int mDefaultBufferWidth = 720;
    private final int mFrameInterval;
    private final GLThread mGLThread;
    public final Handler mGLTreadHandler;
    public final LiveCore mLiveCore;
    private long mNextFrameTimeStamp;
    public final int mOutputHeight;
    public int mOutputTextureId = -1;
    public final int mOutputWidth;
    public Runnable mPushTaskRunnable;
    private Object mReleaseFence = new Object();
    private boolean mReleased = false;
    private Map<Surface, SurfaceTextureHelper> mSurfaceMap;
    private int mVideoHeight;
    private VideoProcessUnit mVideoProcessUnit;
    private int mVideoWidth;
    public final Handler mWorkThreadHandler;

    static {
        Covode.recordClassIndex(100271);
    }

    static final /* synthetic */ void lambda$doRelease$1$ShortVideoPushManager() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void enableVideoMirror(boolean z, boolean z2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public boolean isVideoMirror(boolean z) {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void setFitMode(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void setRenderView(RenderView renderView) {
    }

    private int getVideoHeight() {
        return this.mVideoHeight;
    }

    private int getVideoWidth() {
        return this.mVideoWidth;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.ShortVideoPushManager$ShortVideoSurfaceTextureHelper */
    public class ShortVideoSurfaceTextureHelper extends SurfaceTextureHelper {
        static {
            Covode.recordClassIndex(100276);
        }

        @Override // com.p2082ss.avframework.buffer.SurfaceTextureHelper
        public void handlerExit() {
            AVLog.ioi("ShortVideoPushManager", "call handlerExit.");
        }

        ShortVideoSurfaceTextureHelper(Handler handler) {
            super(handler, true);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public synchronized void release() {
        MethodCollector.m26663i(3052);
        synchronized (this.mReleaseFence) {
            try {
                doRelease();
            } finally {
                MethodCollector.m26664o(3052);
            }
        }
    }

    private void doRelease() {
        if (!this.mReleased) {
            this.mReleased = true;
            this.mPushTaskRunnable = ShortVideoPushManager$$Lambda$1.$instance;
            this.mCurrentActiveSurface = null;
            Map<Surface, SurfaceTextureHelper> map = this.mSurfaceMap;
            if (map != null && map.size() > 0) {
                for (Map.Entry<Surface, SurfaceTextureHelper> entry : this.mSurfaceMap.entrySet()) {
                    Surface key = entry.getKey();
                    if (key != null) {
                        key.release();
                    }
                    SurfaceTextureHelper value = entry.getValue();
                    if (value != null) {
                        value.dispose();
                    }
                }
                this.mSurfaceMap.clear();
            }
            this.mSurfaceMap = null;
            VideoProcessUnit videoProcessUnit = this.mVideoProcessUnit;
            if (videoProcessUnit != null) {
                videoProcessUnit.release();
                this.mVideoProcessUnit = null;
            }
            SafeHandlerThreadPoolExecutor.unlockThread(this.mGLThread);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public Surface getSurface() {
        SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(this.mGLTreadHandler, new Callable<SurfaceTextureHelper>() {
            /* class com.p2082ss.avframework.livestreamv2.core.ShortVideoPushManager.CallableC858162 */

            static {
                Covode.recordClassIndex(100275);
            }

            /* Return type fixed from 'com.ss.avframework.livestreamv2.core.ShortVideoPushManager$ShortVideoSurfaceTextureHelper' to match base method */
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    ShortVideoPushManager shortVideoPushManager = ShortVideoPushManager.this;
                    return new ShortVideoSurfaceTextureHelper(shortVideoPushManager.mGLTreadHandler);
                } catch (RuntimeException unused) {
                    AVLog.m147806e("ShortVideoPushManager", "call:  create failure");
                    return null;
                }
            }
        });
        if (surfaceTextureHelper == null) {
            return null;
        }
        SurfaceTexture surfaceTexture = surfaceTextureHelper.getSurfaceTexture();
        int i = Build.VERSION.SDK_INT;
        surfaceTexture.setDefaultBufferSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
        Surface surface = new Surface(surfaceTexture);
        surfaceTextureHelper.startListening(new ShortVideoPushManager$$Lambda$0(this, surface, surfaceTextureHelper));
        AVLog.m147809w("ShortVideoPushManager", "getSurface(" + surface + ")");
        this.mSurfaceMap.put(surface, surfaceTextureHelper);
        return surface;
    }

    public static IShortVideoPushManager createShortVideoPushManager(LiveCore liveCore) {
        return new ShortVideoPushManager(liveCore);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void releaseSurface(Surface surface) {
        MethodCollector.m26663i(3039);
        synchronized (this.mReleaseFence) {
            try {
                doReleaseSurface(surface);
            } finally {
                MethodCollector.m26664o(3039);
            }
        }
    }

    private boolean keepFrame(long j) {
        long j2 = this.mNextFrameTimeStamp;
        if (j2 > 0) {
            long j3 = j2 - j;
            long abs = Math.abs(j3);
            int i = this.mFrameInterval;
            if (abs < ((long) (i * 2))) {
                if (j3 > 0) {
                    return false;
                }
                this.mNextFrameTimeStamp += (long) i;
                return true;
            }
        }
        this.mNextFrameTimeStamp = j + ((long) (this.mFrameInterval / 2));
        return true;
    }

    private void doReleaseSurface(Surface surface) {
        AVLog.iow("ShortVideoPushManager", "releaseSurface(" + surface + ")");
        if (this.mCurrentActiveSurface == surface) {
            AVLog.m147809w("ShortVideoPushManager", "can not release surface cause active(" + surface + ")");
        } else if (this.mSurfaceMap != null && surface != null) {
            surface.release();
            SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceMap.get(surface);
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
            }
            this.mSurfaceMap.remove(surface);
        }
    }

    private ShortVideoPushManager(LiveCore liveCore) {
        DisplayMetrics displayMetrics;
        AVLog.m147809w("ShortVideoPushManager", "ShortVideoPushManager ctor");
        AVLog.logKibana(4, "ShortVideoPushManager", "ShortVideoPushManager ctor", null);
        this.mLiveCore = liveCore;
        this.mFrameInterval = 1000 / liveCore.getBuilder().getVideoFps();
        int videoCaptureWidth = liveCore.getBuilder().getVideoCaptureWidth();
        this.mOutputWidth = videoCaptureWidth;
        int videoCaptureHeight = liveCore.getBuilder().getVideoCaptureHeight();
        this.mOutputHeight = videoCaptureHeight;
        this.mWorkThreadHandler = liveCore.getWorkThreadHandler();
        this.mSurfaceMap = new HashMap();
        LiveCore.Builder builder = liveCore.getBuilder();
        if (!(builder == null || (displayMetrics = builder.getContext().getResources().getDisplayMetrics()) == null)) {
            this.mDefaultBufferWidth = displayMetrics.widthPixels;
            this.mDefaultBufferHeight = displayMetrics.heightPixels;
        }
        GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("GL-ShortVideo");
        this.mGLThread = lockGLThread;
        lockGLThread.start();
        Handler handler = lockGLThread.getHandler();
        this.mGLTreadHandler = handler;
        VideoProcessUnit videoProcessUnit = new VideoProcessUnit(handler, VideoProcessUnit.Mode.MODE_FIT);
        this.mVideoProcessUnit = videoProcessUnit;
        videoProcessUnit.updateCrop(videoCaptureWidth, videoCaptureHeight);
        this.mPushTaskRunnable = new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.ShortVideoPushManager.RunnableC858151 */

            static {
                Covode.recordClassIndex(100274);
            }

            public void run() {
                ShortVideoPushManager.this.mWorkThreadHandler.removeCallbacks(ShortVideoPushManager.this.mPushTaskRunnable);
                AVLog.logToIODevice2(5, "ShortVideoPushManager", "Short video frame comes.", null, "ShortVideoPushManager:mVideoMixer", 10000);
                ShortVideoPushManager.this.mLiveCore.pushVideoFrame(ShortVideoPushManager.this.mOutputTextureId, false, ShortVideoPushManager.this.mOutputWidth, ShortVideoPushManager.this.mOutputHeight, 0, null, TimeUtils.nanoTime() / 1000);
                ShortVideoPushManager.this.mWorkThreadHandler.postDelayed(ShortVideoPushManager.this.mPushTaskRunnable, 100);
            }
        };
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.IShortVideoPushManager
    public void activeSurface(Surface surface, int i, int i2) {
        MethodCollector.m26663i(3032);
        AVLog.iow("ShortVideoPushManager", "activeSurface(" + i + "," + i2 + "),surface" + surface);
        synchronized (this.mSurfaceMap) {
            try {
                this.mCurrentActiveSurface = surface;
                this.mVideoWidth = i;
                this.mVideoHeight = i2;
            } finally {
                MethodCollector.m26664o(3032);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$getSurface$0$ShortVideoPushManager(Surface surface, SurfaceTextureHelper surfaceTextureHelper, int i, float[] fArr, long j) {
        MethodCollector.m26663i(3071);
        synchronized (this.mSurfaceMap) {
            try {
                if (this.mCurrentActiveSurface != surface) {
                    AVLog.logToIODevice2(5, "ShortVideoPushManager", "Current surface (" + surface + ")is not active,active is:" + this.mCurrentActiveSurface, null, "ShortVideoPushManager:CheceSurface", 10000);
                    surfaceTextureHelper.returnTextureFrame(true);
                } else if (!keepFrame(j / 1000000)) {
                    surfaceTextureHelper.returnTextureFrame(true);
                    MethodCollector.m26664o(3071);
                } else {
                    int videoWidth = getVideoWidth();
                    int videoHeight = getVideoHeight();
                    if (i <= 0 || videoWidth <= 0 || videoHeight <= 0) {
                        surfaceTextureHelper.returnTextureFrame(true);
                        MethodCollector.m26664o(3071);
                        return;
                    }
                    this.mOutputTextureId = this.mVideoProcessUnit.process(i, videoWidth, videoHeight, true, fArr);
                    this.mPushTaskRunnable.run();
                    surfaceTextureHelper.returnTextureFrame();
                    MethodCollector.m26664o(3071);
                }
            } finally {
                MethodCollector.m26664o(3071);
            }
        }
    }
}
