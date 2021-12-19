package com.p2082ss.avframework.buffer;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.opengl.GLThread;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.opengl.YuvConverter;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* renamed from: com.ss.avframework.buffer.SurfaceTextureHelper */
public class SurfaceTextureHelper {
    private final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public OnTextureFrameAvailableListener listener;
    private final int oesTextureId;
    private SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    public OnTextureFrameAvailableListener pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    public YuvConverter yuvConverter;

    /* renamed from: com.ss.avframework.buffer.SurfaceTextureHelper$OnTextureFrameAvailableListener */
    public interface OnTextureFrameAvailableListener {
        static {
            Covode.recordClassIndex(99843);
        }

        void onTextureFrameAvailable(int i, float[] fArr, long j);
    }

    static {
        Covode.recordClassIndex(99833);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public int getTextureId() {
        return this.oesTextureId;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void returnTextureFrame() {
        returnTextureFrame(false);
    }

    public void updateTexImage() {
        this.surfaceTexture.updateTexImage();
    }

    public void dispose() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.RunnableC856406 */

            static {
                Covode.recordClassIndex(99839);
            }

            public void run() {
                SurfaceTextureHelper.this.isQuitting = true;
                if (!SurfaceTextureHelper.this.isTextureInUse) {
                    SurfaceTextureHelper.this.release();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void handlerExit() {
        this.handler.getLooper().quit();
    }

    public void stopListening() {
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.RunnableC856384 */

            static {
                Covode.recordClassIndex(99837);
            }

            public void run() {
                SurfaceTextureHelper.this.listener = null;
                SurfaceTextureHelper.this.pendingListener = null;
            }
        });
    }

    /* renamed from: com.ss.avframework.buffer.SurfaceTextureHelper$SurfaceTextureInternal */
    class SurfaceTextureInternal extends SurfaceTexture {
        private Boolean isFinalize = false;

        static {
            Covode.recordClassIndex(99844);
        }

        /* access modifiers changed from: protected */
        @Override // android.graphics.SurfaceTexture, java.lang.Object
        public void finalize() {
            MethodCollector.m26663i(6763);
            if (this.isFinalize.booleanValue()) {
                MethodCollector.m26664o(6763);
                return;
            }
            synchronized (this.isFinalize) {
                try {
                    if (!this.isFinalize.booleanValue()) {
                        this.isFinalize = true;
                        super.finalize();
                        MethodCollector.m26664o(6763);
                    }
                } finally {
                    MethodCollector.m26664o(6763);
                }
            }
        }

        public void release() {
            MethodCollector.m26663i(7053);
            if (this.isFinalize.booleanValue()) {
                AVLog.ioe("SurfaceTextureHelper", "BUG, texture already finalized.".concat(String.valueOf(this)));
                MethodCollector.m26664o(7053);
                return;
            }
            synchronized (this.isFinalize) {
                try {
                    if (this.isFinalize.booleanValue()) {
                        AVLog.ioe("SurfaceTextureHelper", "BUG, texture already finalized.".concat(String.valueOf(this)));
                        return;
                    }
                    super.release();
                    MethodCollector.m26664o(7053);
                } finally {
                    MethodCollector.m26664o(7053);
                }
            }
        }

        public SurfaceTextureInternal(int i) {
            super(i);
        }
    }

    public void insertTextureFrameIfNeed() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, System.currentTimeMillis() * 1000 * 1000);
        }
    }

    public void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            YuvConverter yuvConverter2 = this.yuvConverter;
            if (yuvConverter2 != null) {
                yuvConverter2.release();
            }
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            handlerExit();
        }
    }

    public SurfaceTextureHelper(Handler handler2) {
        this(handler2, false);
    }

    public void returnTextureFrame(final boolean z) {
        this.handler.post(new Runnable() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.RunnableC856395 */

            static {
                Covode.recordClassIndex(99838);
            }

            public void run() {
                SurfaceTextureHelper.this.isTextureInUse = false;
                if (SurfaceTextureHelper.this.isQuitting) {
                    SurfaceTextureHelper.this.release();
                } else {
                    SurfaceTextureHelper.this.tryDeliverTextureFrame(z);
                }
            }
        });
    }

    public static SurfaceTextureHelper create(String str) {
        GLThread gLThread = new GLThread(str);
        gLThread.start();
        final Handler handler2 = new Handler(gLThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Callable<SurfaceTextureHelper>() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.CallableC856351 */

            static {
                Covode.recordClassIndex(99834);
            }

            /* renamed from: com_ss_avframework_buffer_SurfaceTextureHelper$1_com_ss_android_ugc_aweme_lancet_LogLancet_e */
            public static int m147755xb8a03726(String str, String str2, Throwable th) {
                return 0;
            }

            @Override // java.util.concurrent.Callable
            public final SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(handler2);
                } catch (RuntimeException e) {
                    m147755xb8a03726("SurfaceTextureHelper", "call:  create failure", e);
                    return null;
                }
            }
        });
    }

    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = onTextureFrameAvailableListener;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.RunnableC856428 */

            static {
                Covode.recordClassIndex(99841);
            }

            public void run() {
                if (SurfaceTextureHelper.this.yuvConverter == null) {
                    SurfaceTextureHelper.this.yuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = SurfaceTextureHelper.this.yuvConverter.convert(textureBuffer);
            }
        });
        return i420BufferArr[0];
    }

    public void tryDeliverTextureFrame(boolean z) {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = !z;
            this.hasPendingTexture = false;
            updateTexImage();
            if (!z) {
                float[] fArr = new float[16];
                this.surfaceTexture.getTransformMatrix(fArr);
                this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, System.currentTimeMillis() * 1000 * 1000);
            }
        }
    }

    public SurfaceTextureHelper(Handler handler2, boolean z) {
        this.setListenerRunnable = new Runnable() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.RunnableC856362 */

            static {
                Covode.recordClassIndex(99835);
            }

            public void run() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.onFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.C856373 */

            static {
                Covode.recordClassIndex(99836);
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                SurfaceTextureHelper.this.hasPendingTexture = true;
                SurfaceTextureHelper.this.tryDeliverTextureFrame(false);
            }
        };
        if (handler2.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler2;
            AVLog.iow("SurfaceTextureHelper", "Using finalizeCheck ".concat(String.valueOf(z)));
            int generateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = generateTexture;
            if (z) {
                this.surfaceTexture = new SurfaceTextureInternal(generateTexture);
            } else {
                this.surfaceTexture = new SurfaceTexture(generateTexture);
            }
            setOnFrameAvailableListener(this.surfaceTexture, this.onFrameAvailableListener, handler2);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture2, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener2, Handler handler2) {
        if (Build.VERSION.SDK_INT >= 21) {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener2, handler2);
        } else {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener2);
        }
    }

    public VideoFrame.TextureBuffer createTextureBuffer(int i, int i2, Matrix matrix) {
        return new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, matrix, this, new Runnable() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.RunnableC856439 */

            static {
                Covode.recordClassIndex(99842);
            }

            public void run() {
                SurfaceTextureHelper.this.returnTextureFrame();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void textureToYUV(final ByteBuffer byteBuffer, final int i, final int i2, final int i3, final int i4, final float[] fArr) {
        if (i4 == this.oesTextureId) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() {
                /* class com.p2082ss.avframework.buffer.SurfaceTextureHelper.RunnableC856417 */

                static {
                    Covode.recordClassIndex(99840);
                }

                public void run() {
                    if (SurfaceTextureHelper.this.yuvConverter == null) {
                        SurfaceTextureHelper.this.yuvConverter = new YuvConverter();
                    }
                    SurfaceTextureHelper.this.yuvConverter.convert(byteBuffer, i, i2, i3, i4, fArr);
                }
            });
            return;
        }
        throw new IllegalStateException("textureToByteBuffer called with unexpected textureId");
    }
}
