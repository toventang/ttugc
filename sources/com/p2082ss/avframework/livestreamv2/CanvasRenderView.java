package com.p2082ss.avframework.livestreamv2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.opengl.GLRenderVideoSink;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.CanvasRenderView */
public class CanvasRenderView extends RenderView {
    private SafeHandlerThread mCanvasThread;
    private Handler mCanvasThreadHandler;
    private int mFB;
    private boolean mFitMode;
    private int mFrameHeight;
    private int mFrameWidth;
    private Matrix mMatrix = new Matrix();
    private boolean mMirrorX;
    private boolean mMirrorY;
    private Paint mPaint = new Paint();
    private boolean mSizedChanged;
    private SurfaceHolder mSurfaceHolder;
    private int mWindHeight;
    private int mWindWidth;

    static {
        Covode.recordClassIndex(99999);
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
    public Handler getGlThreadHandler() {
        return this.mCanvasThreadHandler;
    }

    @Override // com.p2082ss.avframework.livestreamv2.RenderView
    public float getRealRatePerSeconds() {
        return super.getRealRatePerSeconds();
    }

    public void addViewCallback() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
            AVLog.ioi("CanvasRenderView", "addViewCallback() by ".concat(String.valueOf(this)));
        }
    }

    public void removeViewCallback() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            AVLog.ioi("CanvasRenderView", "removeViewCallback() by ".concat(String.valueOf(this)));
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.RenderView, com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void init() {
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("Canvas-(" + this + ")");
        this.mCanvasThread = lockThread;
        lockThread.start();
        this.mCanvasThreadHandler = this.mCanvasThread.getHandler();
        setRenderer(this);
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink, com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(2085);
        AVLog.ioi("CanvasRenderView", "begin release[" + this + "]");
        Handler glThreadHandler = getGlThreadHandler();
        if (glThreadHandler != null) {
            if (!glThreadHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.CanvasRenderView.RunnableC856973 */

                static {
                    Covode.recordClassIndex(100002);
                }

                public void run() {
                    CanvasRenderView.this.onSurfaceDestroy();
                }
            })) {
                AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already release at")));
                MethodCollector.m26664o(2085);
                return;
            }
            SafeHandlerThreadPoolExecutor.unlockThread(this.mCanvasThread);
            this.mCanvasThread = null;
        }
        AVLog.ioi("CanvasRenderView", "end release[" + this + "]");
        MethodCollector.m26664o(2085);
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void initSurfaceView(SurfaceView surfaceView) {
        super.initSurfaceView(surfaceView);
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void initTextureView(TextureView textureView) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // com.p2082ss.avframework.livestreamv2.RenderView
    public boolean isMirror(boolean z) {
        if (z) {
            return this.mMirrorX;
        }
        return this.mMirrorY;
    }

    @Override // com.p2082ss.avframework.livestreamv2.RenderView, com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
    public void onDrawFrame(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // com.p2082ss.avframework.livestreamv2.RenderView
    public void setFitMode(boolean z) {
        this.mFitMode = z;
        this.mSizedChanged = true;
    }

    public CanvasRenderView(SurfaceView surfaceView) {
        super(surfaceView);
    }

    public void onBuffer(final VideoFrame.Buffer buffer) {
        MethodCollector.m26663i(1899);
        if (this.mFB == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.mFB = iArr[0];
        }
        VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
        GLES20.glBindFramebuffer(36160, this.mFB);
        GLES20.glFramebufferTexture2D(36160, 36064, textureBuffer.getType().getGlTarget(), textureBuffer.getTextureId(), 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(buffer.getWidth() * buffer.getHeight() * 4);
        GLES20.glReadPixels(0, 0, buffer.getWidth(), buffer.getHeight(), 6408, 5121, allocateDirect);
        GlUtil.checkAnyGLES2Error("BUG");
        GLES20.glBindFramebuffer(36160, 0);
        final Bitmap createBitmap = Bitmap.createBitmap(buffer.getWidth(), buffer.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        getGlThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.CanvasRenderView.RunnableC856962 */

            static {
                Covode.recordClassIndex(100001);
            }

            public void run() {
                CanvasRenderView.this.onCanvasDrawBuffer(createBitmap, buffer);
            }
        });
        MethodCollector.m26664o(1899);
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        AVLog.ioi("CanvasRenderView", "onSurfaceCreated() [" + this + "]");
        this.mNeedReportFirstRender = true;
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = surfaceHolder;
            AVLog.ioi("CanvasRenderView", "mSurfaceHolder is set to " + this.mSurfaceHolder);
            return;
        }
        AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already received onSurfaceCreated at")));
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(2006);
        AVLog.ioi("CanvasRenderView", "onSurfaceDestroy() [" + this + "]");
        if (this.mSurfaceHolder == null) {
            MethodCollector.m26664o(2006);
            return;
        }
        synchronized (this) {
            try {
                AVLog.ioi("CanvasRenderView", "mSurfaceHolder: " + this.mSurfaceHolder + " is set to null");
                this.mSurfaceHolder = null;
            } finally {
                MethodCollector.m26664o(2006);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.RenderView, com.p2082ss.avframework.engine.VideoSink, com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void onFrame(final VideoFrame videoFrame) {
        MethodCollector.m26663i(1862);
        if (this.mCanvasThread != null) {
            videoFrame.retain();
            if (this.mFB == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFB = iArr[0];
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
            GLES20.glBindFramebuffer(36160, this.mFB);
            GLES20.glFramebufferTexture2D(36160, 36064, textureBuffer.getType().getGlTarget(), textureBuffer.getTextureId(), 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(textureBuffer.getWidth() * textureBuffer.getHeight() * 4);
            GLES20.glReadPixels(0, 0, textureBuffer.getWidth(), textureBuffer.getHeight(), 6408, 5121, allocateDirect);
            GlUtil.checkAnyGLES2Error("BUG");
            GLES20.glBindFramebuffer(36160, 0);
            final Bitmap createBitmap = Bitmap.createBitmap(textureBuffer.getWidth(), textureBuffer.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            getGlThreadHandler().post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.CanvasRenderView.RunnableC856951 */

                static {
                    Covode.recordClassIndex(100000);
                }

                public void run() {
                    CanvasRenderView.this.onCanvasDrawFrame(createBitmap, videoFrame);
                }
            });
        }
        MethodCollector.m26664o(1862);
    }

    @Override // com.p2082ss.avframework.livestreamv2.RenderView
    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mMirrorX = z;
        } else {
            this.mMirrorY = z;
        }
        this.mSizedChanged = true;
    }

    public CanvasRenderView(SurfaceView surfaceView, boolean z) {
        super(surfaceView, z);
    }

    private Matrix calcViewRatio(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = this.mFitMode;
        float f5 = (float) i;
        float f6 = (float) i2;
        float f7 = f5 / f6;
        int i3 = this.mWindWidth;
        int i4 = this.mWindHeight;
        float f8 = ((float) i3) / ((float) i4);
        float f9 = 0.0f;
        if (z) {
            if (f7 > f8) {
                f2 = ((float) i3) / f5;
                f3 = (-(((float) i4) - (f6 * f2))) / 2.0f;
            } else {
                f2 = ((float) i3) / f5;
                f = -(((float) i3) - (f5 * f2));
                f9 = f / 2.0f;
                f3 = 0.0f;
            }
        } else if (f7 < f8) {
            f2 = ((float) i3) / f5;
            f3 = ((f6 * f2) - ((float) i4)) / 2.0f;
        } else {
            f2 = ((float) i4) / f6;
            f = (f5 * f2) - ((float) i3);
            f9 = f / 2.0f;
            f3 = 0.0f;
        }
        this.mMatrix.postScale(f2, f2);
        this.mMatrix.postTranslate(-f9, -f3);
        this.mMatrix.postTranslate((-((float) this.mWindWidth)) / 2.0f, (-((float) this.mWindHeight)) / 2.0f);
        Matrix matrix = this.mMatrix;
        float f10 = -1.0f;
        if (this.mMirrorX) {
            f4 = -1.0f;
        } else {
            f4 = 1.0f;
        }
        if (!this.mMirrorY) {
            f10 = 1.0f;
        }
        matrix.postScale(f4, f10);
        this.mMatrix.postTranslate(((float) this.mWindWidth) / 2.0f, ((float) this.mWindHeight) / 2.0f);
        this.mFrameHeight = i2;
        this.mFrameWidth = i;
        return this.mMatrix;
    }

    public void onCanvasDrawBuffer(Bitmap bitmap, VideoFrame.Buffer buffer) {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            if (lockCanvas != null) {
                int width = buffer.getWidth();
                int height = buffer.getHeight();
                if (!(!this.mSizedChanged && height == this.mFrameHeight && width == this.mFrameWidth)) {
                    calcViewRatio(width, height);
                    this.mSizedChanged = false;
                }
                lockCanvas.drawBitmap(bitmap, this.mMatrix, null);
                this.mSurfaceHolder.unlockCanvasAndPost(lockCanvas);
                if (this.mNeedReportFirstRender) {
                    this.mNeedReportFirstRender = false;
                    GLRenderVideoSink.GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                    if (glRenderInfoListener != null) {
                        glRenderInfoListener.onInfo(3, (int) (TimeUtils.currentTimeMs() - buffer.getCaptureMs()), 0);
                    }
                }
            } else {
                return;
            }
        }
        buffer.release();
    }

    public void onCanvasDrawFrame(Bitmap bitmap, VideoFrame videoFrame) {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            if (lockCanvas != null) {
                int rotatedWidth = videoFrame.getRotatedWidth();
                int rotatedHeight = videoFrame.getRotatedHeight();
                if (!(!this.mSizedChanged && rotatedHeight == this.mFrameHeight && rotatedWidth == this.mFrameWidth)) {
                    calcViewRatio(rotatedWidth, rotatedHeight);
                    this.mSizedChanged = false;
                }
                if (this.mRealRateStatistict != null) {
                    this.mRealRateStatistict.add();
                }
                lockCanvas.drawBitmap(bitmap, this.mMatrix, null);
                this.mSurfaceHolder.unlockCanvasAndPost(lockCanvas);
                if (this.mNeedReportFirstRender) {
                    this.mNeedReportFirstRender = false;
                    GLRenderVideoSink.GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                    if (!(glRenderInfoListener == null || videoFrame.getBuffer() == null)) {
                        glRenderInfoListener.onInfo(3, (int) (TimeUtils.currentTimeMs() - videoFrame.getBuffer().getCaptureMs()), 0);
                    }
                }
            } else {
                return;
            }
        }
        videoFrame.release();
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AVLog.ioi("CanvasRenderView", "onSurfaceChanged() [" + this + "] + width: " + i2 + "height:" + i3);
        this.mWindWidth = i2;
        this.mWindHeight = i3;
        this.mSizedChanged = true;
    }
}
