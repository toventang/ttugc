package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

public class SurfaceTextureHelper {
    private final EglBase eglBase;
    private int frameRotation;
    public final Handler handler;
    public boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    public long lastDeliverTime;
    public VideoSink listener;
    public int maxDeliverTimerInternal;
    private final int oesTextureId;
    public VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private int textureWidth;
    final Runnable timedDeliverRunnable;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    static {
        Covode.recordClassIndex(106710);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$stopListening$1$SurfaceTextureHelper() {
        this.listener = null;
        this.pendingListener = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: returnTextureFrame */
    public void bridge$lambda$0$SurfaceTextureHelper() {
        this.handler.post(new SurfaceTextureHelper$$Lambda$4(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$dispose$5$SurfaceTextureHelper() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$returnTextureFrame$4$SurfaceTextureHelper() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    public void dispose() {
        Logging.m157044i("SurfaceTextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new SurfaceTextureHelper$$Lambda$5(this));
    }

    public void stopListening() {
        Logging.m157044i("SurfaceTextureHelper", "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new SurfaceTextureHelper$$Lambda$1(this));
    }

    public void updateTexImage() {
        MethodCollector.m26663i(355);
        synchronized (EglBase.lock) {
            try {
                this.surfaceTexture.updateTexImage();
            } finally {
                MethodCollector.m26664o(355);
            }
        }
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.yuvConverter.release();
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestampAligner2.dispose();
            }
        }
    }

    public void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            long timestamp = this.surfaceTexture.getTimestamp();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestamp = timestampAligner2.translateTimestamp(timestamp);
            }
            if (this.textureWidth == 0 || this.textureHeight == 0) {
                throw new RuntimeException("Texture size has not been set.");
            }
            this.lastDeliverTime = System.currentTimeMillis();
            VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new SurfaceTextureHelper$$Lambda$6(this)), this.frameRotation, timestamp);
            this.listener.onFrame(videoFrame);
            videoFrame.release();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setFrameRotation$3$SurfaceTextureHelper(int i) {
        this.frameRotation = i;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$SurfaceTextureHelper(SurfaceTexture surfaceTexture2) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public void setFrameRotation(int i) {
        this.handler.post(new SurfaceTextureHelper$$Lambda$3(this, i));
    }

    public void setMinFps(int i) {
        if (i > 0) {
            this.maxDeliverTimerInternal = (int) (1000.0f / ((float) i));
        } else {
            this.maxDeliverTimerInternal = 0;
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            this.handler.post(this.timedDeliverRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setTextureSize$2$SurfaceTextureHelper(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
    }

    public void setTextureSize(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Texture width must be positive, but was ".concat(String.valueOf(i)));
        } else if (i2 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new SurfaceTextureHelper$$Lambda$2(this, i, i2));
        } else {
            throw new IllegalArgumentException("Texture height must be positive, but was ".concat(String.valueOf(i2)));
        }
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture2, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler2) {
        if (Build.VERSION.SDK_INT >= 21) {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener, handler2);
        } else {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler2 = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Callable<SurfaceTextureHelper>() {
            /* class org.webrtc.SurfaceTextureHelper.CallableC903021 */

            static {
                Covode.recordClassIndex(106718);
            }

            @Override // java.util.concurrent.Callable
            public final SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler2, z);
                } catch (RuntimeException e) {
                    Logging.m157043e("SurfaceTextureHelper", str + " create failure", e);
                    return null;
                }
            }
        });
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler2, boolean z) {
        TimestampAligner timestampAligner2;
        this.yuvConverter = new YuvConverter();
        this.setListenerRunnable = new Runnable() {
            /* class org.webrtc.SurfaceTextureHelper.RunnableC903032 */

            static {
                Covode.recordClassIndex(106719);
            }

            public void run() {
                Logging.m157044i("SurfaceTextureHelper", "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.lastDeliverTime = 0;
        this.maxDeliverTimerInternal = -1;
        this.timedDeliverRunnable = new Runnable() {
            /* class org.webrtc.SurfaceTextureHelper.RunnableC903043 */

            static {
                Covode.recordClassIndex(106720);
            }

            public void run() {
                if (SurfaceTextureHelper.this.maxDeliverTimerInternal > 0 && SurfaceTextureHelper.this.handler != null && SurfaceTextureHelper.this.listener != null) {
                    if (!SurfaceTextureHelper.this.hasPendingTexture && System.currentTimeMillis() - SurfaceTextureHelper.this.lastDeliverTime > ((long) SurfaceTextureHelper.this.maxDeliverTimerInternal)) {
                        SurfaceTextureHelper.this.hasPendingTexture = true;
                        SurfaceTextureHelper.this.tryDeliverTextureFrame();
                    }
                    SurfaceTextureHelper.this.handler.postDelayed(this, (long) SurfaceTextureHelper.this.maxDeliverTimerInternal);
                }
            }
        };
        if (handler2.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler2;
            if (z) {
                timestampAligner2 = new TimestampAligner();
            } else {
                timestampAligner2 = null;
            }
            this.timestampAligner = timestampAligner2;
            EglBase create$$STATIC$$ = EglBase$$CC.create$$STATIC$$(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create$$STATIC$$;
            try {
                create$$STATIC$$.createDummyPbufferSurface();
                create$$STATIC$$.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture2;
                setOnFrameAvailableListener(surfaceTexture2, new SurfaceTextureHelper$$Lambda$0(this), handler2);
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler2.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
    }
}
