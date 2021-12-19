package com.bytedance.android.live.broadcast.stream.capture;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.opengl.GLThread;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.bytedance.android.live.broadcast.stream.capture.g */
public final class C3698g implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: a */
    public GLSurfaceView f10166a;

    /* renamed from: b */
    public AbstractC3700a f10167b;

    /* renamed from: c */
    public EGLContext f10168c;

    /* renamed from: d */
    public GLThread f10169d;

    /* renamed from: e */
    private int f10170e;

    /* renamed from: f */
    private int f10171f;

    /* renamed from: g */
    private int f10172g;

    /* renamed from: h */
    private int f10173h;

    /* renamed from: i */
    private int f10174i;

    /* renamed from: j */
    private int f10175j;

    /* renamed from: k */
    private int f10176k;

    /* renamed from: l */
    private FloatBuffer f10177l;

    /* renamed from: m */
    private FloatBuffer f10178m;

    /* renamed from: n */
    private FloatBuffer f10179n;

    /* renamed from: o */
    private SurfaceTexture f10180o;

    /* renamed from: p */
    private List<AbstractC3697f> f10181p;

    /* renamed from: q */
    private int f10182q = 36197;

    /* renamed from: com.bytedance.android.live.broadcast.stream.capture.g$a */
    public interface AbstractC3700a {
        static {
            Covode.recordClassIndex(4213);
        }

        /* renamed from: a */
        void mo9017a(Surface surface);
    }

    static {
        Covode.recordClassIndex(4211);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        GLThread gLThread = this.f10169d;
        if (gLThread != null) {
            gLThread.quit();
            this.f10169d = null;
        }
        super.finalize();
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f10166a.requestRender();
    }

    /* renamed from: a */
    public final void mo9008a(int i) {
        if (i == 36197 || i == 3553) {
            this.f10182q = i;
            return;
        }
        throw new RuntimeException("format is not support");
    }

    /* renamed from: a */
    public final synchronized void mo9009a(AbstractC3697f fVar) {
        MethodCollector.m26663i(8356);
        if (this.f10181p == null) {
            this.f10181p = new ArrayList();
        }
        this.f10181p.add(fVar);
        MethodCollector.m26664o(8356);
    }

    public C3698g(GLSurfaceView gLSurfaceView) {
        this.f10166a = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        this.f10166a.setPreserveEGLContextOnPause(true);
        this.f10166a.setEGLContextFactory(new GLSurfaceView.EGLContextFactory() {
            /* class com.bytedance.android.live.broadcast.stream.capture.C3698g.C36991 */

            static {
                Covode.recordClassIndex(4212);
            }

            public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                int[] iArr = {12440, 2, 12344};
                EGLContext[] eGLContextArr = {null};
                if (C3698g.this.f10169d == null) {
                    C3698g.this.f10169d = new GLThread("ImageCaptureThread");
                    C3698g.this.f10169d.start();
                }
                ThreadUtils.invokeAtFrontUninterruptibly(C3698g.this.f10169d.getHandler(), new RunnableC3702i(eGLContextArr));
                if (eGLContextArr[0] == null) {
                    eGLContextArr[0] = EGL10.EGL_NO_CONTEXT;
                }
                C3698g.this.f10168c = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContextArr[0], iArr);
                return C3698g.this.f10168c;
            }

            public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    C3854a.m9453a(6, "DefaultContextFactory", "display:" + eGLDisplay + " appContext: " + eGLContext);
                    throw new RuntimeException("eglDestroyContext" + egl10.eglGetError());
                } else if (C3698g.this.f10169d != null) {
                    C3698g.this.f10169d.quit();
                    C3698g.this.f10169d = null;
                }
            }
        });
        this.f10166a.setRenderer(this);
        this.f10166a.setRenderMode(0);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(C3703j.f10191e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f10177l = asFloatBuffer;
        asFloatBuffer.put(C3703j.f10191e).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(C3703j.f10187a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f10178m = asFloatBuffer2;
        asFloatBuffer2.put(C3703j.f10187a).position(0);
        float[] fArr = C3703j.f10189c;
        float[] fArr2 = {C3703j.m9207a(fArr[0]), fArr[1], C3703j.m9207a(fArr[2]), fArr[3], C3703j.m9207a(fArr[4]), fArr[5], C3703j.m9207a(fArr[6]), fArr[7]};
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f10179n = asFloatBuffer3;
        asFloatBuffer3.put(fArr2).position(0);
    }

    public final void onDrawFrame(GL10 gl10) {
        MethodCollector.m26663i(8515);
        this.f10180o.updateTexImage();
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f10170e);
        this.f10177l.position(0);
        GLES20.glVertexAttribPointer(this.f10171f, 2, 5126, false, 0, (Buffer) this.f10177l);
        GLES20.glEnableVertexAttribArray(this.f10171f);
        this.f10178m.position(0);
        GLES20.glVertexAttribPointer(this.f10173h, 2, 5126, false, 0, (Buffer) this.f10178m);
        GLES20.glEnableVertexAttribArray(this.f10173h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f10174i);
        GLES20.glUniform1i(this.f10172g, 0);
        GLES20.glDrawArrays(5, 0, 4);
        OpenGLUtils.checkGlError("ImageCapture");
        int i = this.f10174i;
        if (3553 == this.f10182q) {
            GLES20.glBindFramebuffer(36160, this.f10175j);
            this.f10179n.position(0);
            GLES20.glVertexAttribPointer(this.f10173h, 2, 5126, false, 0, (Buffer) this.f10179n);
            GLES20.glEnableVertexAttribArray(this.f10173h);
            GLES20.glDrawArrays(5, 0, 4);
            OpenGLUtils.checkGlError("ImageCapture");
            GLES20.glBindFramebuffer(36160, 0);
            i = this.f10176k;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                List<AbstractC3697f> list = this.f10181p;
                if (list != null) {
                    for (AbstractC3697f fVar : list) {
                        fVar.mo8669a(this.f10168c, i, this.f10166a.getWidth(), this.f10166a.getHeight(), currentTimeMillis);
                    }
                    MethodCollector.m26664o(8515);
                }
            } finally {
                MethodCollector.m26664o(8515);
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f10170e = OpenGLUtils.loadProgram("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n   textureCoordinate = inputTextureCoordinate.xy;\n   gl_Position = position;\n}", "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        C3695d.m9181a("onSurfaceCreated: OES programId=" + this.f10170e);
        this.f10171f = GLES20.glGetAttribLocation(this.f10170e, "position");
        this.f10172g = GLES20.glGetUniformLocation(this.f10170e, "inputImageTexture");
        this.f10173h = GLES20.glGetAttribLocation(this.f10170e, "inputTextureCoordinate");
        this.f10174i = OpenGLUtils.getExternalOESTextureID();
        C3695d.m9181a("onSurfaceCreated: OES textureId=" + this.f10174i);
        OpenGLUtils.checkGlError("ImageCapture");
        if (3553 == this.f10182q) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f10175j = iArr[0];
            C3695d.m9181a("onSurfaceCreated: frameBuffer=" + this.f10175j);
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            this.f10176k = iArr2[0];
            C3695d.m9181a("onSurfaceCreated: frameBufferTextureId=" + this.f10176k);
            int i = this.f10176k;
            int i2 = this.f10175j;
            int width = this.f10166a.getWidth();
            int height = this.f10166a.getHeight();
            GLES20.glBindTexture(3553, i);
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, i2);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f10174i);
        this.f10180o = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.f10166a.getWidth(), this.f10166a.getHeight());
        this.f10180o.setOnFrameAvailableListener(this);
        this.f10166a.post(new RunnableC3701h(this, new Surface(this.f10180o)));
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }
}
