package com.p2082ss.avframework.opengl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TimeUtils;

/* renamed from: com.ss.avframework.opengl.GLRenderVideoSink */
public class GLRenderVideoSink extends VideoSink implements Handler.Callback, SurfaceHolder.Callback {
    private boolean mCanDrawer;
    public GLRenderer mGLRenderer;
    public GLThread mGLThread;
    protected GlRenderInfoListener mGlRenderInfoListener;
    protected boolean mNeedReportFirstRender;
    private boolean mNeedSwapSurface;
    private GLSurface mSurface;
    protected SurfaceView mSurfaceView;
    public Surface mSurfaceWithTexture;

    /* renamed from: com.ss.avframework.opengl.GLRenderVideoSink$GLRenderer */
    public interface GLRenderer {
        static {
            Covode.recordClassIndex(100654);
        }

        void onDrawFrame(VideoFrame videoFrame);

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated();

        void onSurfaceDestroy();
    }

    /* renamed from: com.ss.avframework.opengl.GLRenderVideoSink$GlRenderInfoListener */
    public interface GlRenderInfoListener {
        static {
            Covode.recordClassIndex(100655);
        }

        void onInfo(int i, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(100649);
    }

    @Override // com.p2082ss.avframework.engine.VideoSink
    public void OnDiscardedFrame() {
    }

    private void onSurfaceCreated() {
        this.mNeedReportFirstRender = true;
        this.mSurface = new GLSurface();
    }

    public Handler getGlThreadHandler() {
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            return gLThread.getHandler();
        }
        return null;
    }

    public void init() {
        this.mNeedSwapSurface = false;
        GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("GRK(" + this + ")");
        this.mGLThread = lockGLThread;
        lockGLThread.start();
        this.mGLThread.setHandlerCallback(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onSurfaceDestroy() {
        GLRenderer gLRenderer;
        if (this.mSurface != null) {
            GLES20.glFinish();
            Surface surface = this.mSurfaceWithTexture;
            if (surface != null) {
                surface.release();
                this.mSurfaceWithTexture = null;
            }
            this.mSurface.surfaceDestroy();
            this.mSurface.release();
            this.mSurface = null;
            this.mCanDrawer = false;
            AVLog.ioi("GLRenderVideoSink", this + " mSurface is released");
            Handler glThreadHandler = getGlThreadHandler();
            if ((glThreadHandler == null || !glThreadHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.opengl.GLRenderVideoSink.RunnableC860283 */

                static {
                    Covode.recordClassIndex(100652);
                }

                public void run() {
                    if (GLRenderVideoSink.this.mGLRenderer != null) {
                        GLRenderVideoSink.this.mGLRenderer.onSurfaceDestroy();
                    }
                    GlRenderInfoListener glRenderInfoListener = GLRenderVideoSink.this.mGlRenderInfoListener;
                    if (glRenderInfoListener != null) {
                        glRenderInfoListener.onInfo(1, 0, 0);
                        AVLog.ioi("GLRenderVideoSink", "MSG_EGL_SURFACE_DESTROYED from GLRenderVideoSink");
                    }
                }
            })) && (gLRenderer = this.mGLRenderer) != null) {
                gLRenderer.onSurfaceDestroy();
                AVLog.m147809w("GLRenderVideoSink", "surfaceDestroy at release");
                GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                if (glRenderInfoListener != null) {
                    glRenderInfoListener.onInfo(1, 0, 0);
                    AVLog.ioi("GLRenderVideoSink", "MSG_EGL_SURFACE_DESTROYED from GLRenderVideoSink");
                }
            }
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(2395);
        super.release();
        AVLog.ioi("GLRenderVideoSink", "begin release[" + this + "]");
        SurfaceView surfaceView = this.mSurfaceView;
        if (!(surfaceView == null || surfaceView.getHolder() == null)) {
            this.mSurfaceView.getHolder().removeCallback(this);
        }
        Handler glThreadHandler = getGlThreadHandler();
        if (glThreadHandler == null || glThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.opengl.GLRenderVideoSink.RunnableC860294 */

            static {
                Covode.recordClassIndex(100653);
            }

            public void run() {
                GLRenderVideoSink.this.onSurfaceDestroy();
                SafeHandlerThreadPoolExecutor.unlockThread(GLRenderVideoSink.this.mGLThread);
            }
        })) {
            AVLog.ioi("GLRenderVideoSink", "end release[" + this + "]");
            MethodCollector.m26664o(2395);
            return;
        }
        AVLog.ioe("GLRenderVideoSink", Log.getStackTraceString(new Exception("Already release at")));
        MethodCollector.m26664o(2395);
    }

    public void setGlRenderInfoListener(GlRenderInfoListener glRenderInfoListener) {
        this.mGlRenderInfoListener = glRenderInfoListener;
    }

    public void setRenderer(GLRenderer gLRenderer) {
        this.mGLRenderer = gLRenderer;
    }

    public void initSurfaceView(SurfaceView surfaceView) {
        init();
        this.mSurfaceView = surfaceView;
        surfaceView.getHolder().addCallback(this);
    }

    /* access modifiers changed from: protected */
    public void initTextureView(TextureView textureView) {
        init();
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.avframework.opengl.GLRenderVideoSink.TextureView$SurfaceTextureListenerC860261 */

            static {
                Covode.recordClassIndex(100650);
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                GLRenderVideoSink.this.surfaceDestroyed(null);
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                GLRenderVideoSink.this.surfaceChanged(null, 3, i, i2);
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                GLRenderVideoSink.this.mSurfaceWithTexture = new Surface(surfaceTexture);
                GLRenderVideoSink.this.surfaceCreated(null);
                GLRenderVideoSink.this.surfaceChanged(null, 3, i, i2);
            }
        });
    }

    @Override // com.p2082ss.avframework.engine.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.mGLThread != null) {
            videoFrame.retain();
            if (!this.mGLThread.post(4, videoFrame)) {
                videoFrame.release();
            }
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            onSurfaceCreated();
        } else if (i == 2) {
            onSurfaceChanged(message.arg1, message.arg2, (Surface) message.obj);
        } else if (i == 3) {
            onSurfaceDestroy();
        } else if (i == 4) {
            onFrameAvailable((VideoFrame) message.obj);
        }
        return true;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        AVLog.ioi("GLRenderVideoSink", this + " surfaceCreated");
        this.mNeedSwapSurface = true;
        this.mGLThread.post(1);
    }

    public GLRenderVideoSink(View view) {
        AVLog.iod("GLRenderVideoSink", "Construct [" + this + "] with view " + view + ". Stack: " + Log.getStackTraceString(new Throwable()));
        if (view instanceof TextureView) {
            initTextureView((TextureView) view);
        } else if (view instanceof SurfaceView) {
            initSurfaceView((SurfaceView) view);
        } else {
            throw new AndroidRuntimeException("Unsupported view ".concat(String.valueOf(view)));
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(2227);
        AVLog.ioi("GLRenderVideoSink", this + " surfaceDestroyed");
        this.mNeedSwapSurface = false;
        this.mCanDrawer = false;
        final Object obj = new Object();
        synchronized (obj) {
            try {
                GLThread gLThread = this.mGLThread;
                if (gLThread == null || !gLThread.postAtFrontOfQueue(new Runnable() {
                    /* class com.p2082ss.avframework.opengl.GLRenderVideoSink.RunnableC860272 */

                    static {
                        Covode.recordClassIndex(100651);
                    }

                    public void run() {
                        MethodCollector.m26663i(2371);
                        GLRenderVideoSink.this.onSurfaceDestroy();
                        synchronized (obj) {
                            try {
                                obj.notify();
                            } finally {
                                MethodCollector.m26664o(2371);
                            }
                        }
                    }
                })) {
                    AVLog.m147809w("GLRenderVideoSink", "already surfaceDestroy");
                } else {
                    try {
                        obj.wait(3000);
                    } catch (Throwable th) {
                        AVLog.ioe("GLRenderVideoSink", "Waited exception " + th.getMessage(), th);
                    }
                }
            } finally {
                MethodCollector.m26664o(2227);
            }
        }
    }

    private void onFrameAvailable(VideoFrame videoFrame) {
        GLSurface gLSurface;
        MethodCollector.m26663i(2347);
        GLRenderer gLRenderer = this.mGLRenderer;
        if (gLRenderer == null || !this.mCanDrawer) {
            AVLog.logToIODevice2(5, "GLRenderVideoSink", this + " mGLRenderer " + this.mGLRenderer + ", mCanDrawer " + this.mCanDrawer, null, "GLRenderVideoSink.onFrameAvailable2", 10000);
        } else {
            gLRenderer.onDrawFrame(videoFrame);
            if (!this.mNeedSwapSurface || (gLSurface = this.mSurface) == null) {
                AVLog.logToIODevice2(5, "GLRenderVideoSink", this + " mNeedSwapSurface " + this.mNeedSwapSurface + ", mSurface " + this.mSurface, null, "GLRenderVideoSink.onFrameAvailable1", 10000);
            } else {
                gLSurface.nativeSwapBuffers();
                if (this.mNeedReportFirstRender) {
                    this.mNeedReportFirstRender = false;
                    GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                    if (!(glRenderInfoListener == null || videoFrame == null || videoFrame.getBuffer() == null)) {
                        glRenderInfoListener.onInfo(3, (int) (TimeUtils.currentTimeMs() - videoFrame.getBuffer().getCaptureMs()), 0);
                    }
                }
            }
        }
        videoFrame.release();
        MethodCollector.m26664o(2347);
    }

    private void onSurfaceChanged(int i, int i2, Surface surface) {
        GLSurface gLSurface;
        MethodCollector.m26663i(2377);
        if (this.mGLRenderer != null) {
            if (this.mSurface != null) {
                GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                if (glRenderInfoListener != null) {
                    glRenderInfoListener.onInfo(2, 0, 0);
                    AVLog.ioi("GLRenderVideoSink", "MSG_EGL_SURFACE_WILL_BE_CREATED  from GLRenderVideoSink");
                }
                this.mSurface.nativeSurfaceCreate(i, i2, surface);
                this.mSurface.nativeMakeCurrent();
                this.mCanDrawer = true;
            }
            GLRenderer gLRenderer = this.mGLRenderer;
            if (gLRenderer != null) {
                gLRenderer.onSurfaceCreated();
                this.mGLRenderer.onSurfaceChanged(i, i2);
            }
            if (this.mNeedSwapSurface && (gLSurface = this.mSurface) != null) {
                gLSurface.nativeSwapBuffers();
            }
        }
        AVLog.ioi("GLRenderVideoSink", this + " onSurfaceChanged: width " + i + ", height " + i2 + ", obj " + surface + ", mGLRenderer " + this.mGLRenderer + ", mSurface " + this.mSurface + ", mCanDrawer " + this.mCanDrawer + ", mNeedSwapSurface " + this.mNeedSwapSurface);
        MethodCollector.m26664o(2377);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AVLog.ioi("GLRenderVideoSink", this + " surfaceChanged: format " + i + ", width " + i2 + ", height " + i3);
        Surface surface = this.mSurfaceWithTexture;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        }
        if (!this.mGLThread.post(2, i2, i3, surface)) {
            AVLog.iow("GLRenderVideoSink", this + " surfaceChanged exception! thread already exit.");
        }
    }
}
