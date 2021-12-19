package com.p2082ss.texturerender;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.texturerender.p4404a.C86174d;
import com.p2082ss.texturerender.p4404a.C86177g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.texturerender.n */
public abstract class AbstractC86206n implements Handler.Callback {

    /* renamed from: a */
    public static String f192332a = "TextureRenderer";

    /* renamed from: b */
    protected EGLConfig f192333b;

    /* renamed from: c */
    protected EGLContext f192334c;

    /* renamed from: d */
    protected EGLDisplay f192335d;

    /* renamed from: e */
    protected EGLSurface f192336e;

    /* renamed from: f */
    protected volatile Handler f192337f;

    /* renamed from: g */
    protected Handler f192338g;

    /* renamed from: h */
    public volatile int f192339h;

    /* renamed from: i */
    public String f192340i;

    /* renamed from: j */
    protected final float[] f192341j = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: k */
    protected FloatBuffer f192342k;

    /* renamed from: l */
    protected C86200i f192343l;

    /* renamed from: m */
    public C86177g f192344m;

    /* renamed from: n */
    protected List<C86211p> f192345n;

    /* renamed from: o */
    protected long f192346o;

    /* renamed from: p */
    public int f192347p;

    /* renamed from: q */
    public C86174d f192348q;

    /* renamed from: r */
    protected C86174d f192349r;

    /* renamed from: s */
    private HandlerThread f192350s;

    /* renamed from: t */
    private final Object f192351t = new Object();

    /* renamed from: u */
    private AbstractC86208a f192352u;

    /* renamed from: v */
    private AbstractC86209b f192353v;

    /* renamed from: w */
    private Object f192354w = new Object();

    /* renamed from: com.ss.texturerender.n$a */
    public interface AbstractC86208a {
        static {
            Covode.recordClassIndex(101351);
        }
    }

    /* renamed from: com.ss.texturerender.n$b */
    public interface AbstractC86209b {
        static {
            Covode.recordClassIndex(101352);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo136504c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo136505d();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo136506d(Message message);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo136507e();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo136508e(Message message);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo136509f(Message message);

    static {
        Covode.recordClassIndex(101349);
    }

    /* renamed from: f */
    public final VideoSurface mo136530f() {
        C86211p i;
        if (this.f192339h > 0 && (i = m148128i()) != null) {
            return i.getOffScreenSurface();
        }
        return null;
    }

    /* renamed from: h */
    private void m148127h() {
        synchronized (this.f192345n) {
            if (this.f192345n.size() > 0) {
                Iterator<C86211p> it = this.f192345n.iterator();
                while (it.hasNext()) {
                    it.next().release(true);
                    it.remove();
                }
            }
            C86203l.m148116a(f192332a, "delete textures : " + this.f192345n.size());
            this.f192343l.mo136514a();
        }
    }

    /* renamed from: j */
    private AbstractC86187b m148129j() {
        try {
            Message obtainMessage = this.f192337f.obtainMessage(9);
            Message message = new Message();
            obtainMessage.obj = message;
            try {
                synchronized (message) {
                    this.f192337f.sendMessageAtFrontOfQueue(obtainMessage);
                    message.wait(1000);
                }
                if (message.obj == null) {
                    if (this.f192337f.hasMessages(9)) {
                        this.f192340i = "The handler is busy for other operation timeout";
                    } else {
                        this.f192340i = "Try modify the wait timeOut";
                    }
                }
                return (AbstractC86187b) message.obj;
            } catch (Exception e) {
                C86203l.m148116a(f192332a, "texture render may exit, error:" + e.toString());
                return null;
            }
        } catch (Exception unused) {
            C86203l.m148116a(f192332a, "texture render already exit");
            return null;
        }
    }

    /* renamed from: g */
    public void mo136510g() {
        C86203l.m148116a(f192332a, this + "call release");
        synchronized (this) {
            if (this.f192339h == 0 || this.f192337f == null) {
                C86203l.m148116a(f192332a, this + "release return");
                return;
            }
            C86203l.m148116a(f192332a, this + "send deinit");
            this.f192337f.sendEmptyMessage(3);
            try {
                int i = Build.VERSION.SDK_INT;
                this.f192350s.quitSafely();
            } catch (Exception unused) {
            }
            C86203l.m148116a(f192332a, this + "call release end");
        }
    }

    /* renamed from: i */
    private C86211p m148128i() {
        synchronized (this.f192345n) {
            Iterator<C86211p> it = this.f192345n.iterator();
            while (true) {
                C86211p pVar = null;
                while (it.hasNext()) {
                    pVar = it.next();
                    if (pVar.isRelease() || pVar.isAlive()) {
                        if (!this.f192348q.f192198a && !this.f192348q.f192199b && (this.f192347p & 4) == 0) {
                            C86203l.m148116a(f192332a, "still living");
                            return null;
                        }
                    } else if (pVar.canReuse(Looper.myLooper())) {
                        C86203l.m148116a(f192332a, "same looper reuse texture");
                        pVar.pause(false, false);
                        pVar.getOffScreenSurface();
                        return pVar;
                    } else {
                        C86203l.m148116a(f192332a, "can't reuse, delete = ".concat(String.valueOf(pVar)));
                        pVar.release(false);
                        it.remove();
                    }
                }
                AbstractC86187b j = m148129j();
                if (j != null) {
                    pVar = new C86211p(j, this.f192337f, this);
                    pVar.setOption(5, this.f192347p);
                    pVar.bindEGLEnv(this.f192334c, this.f192335d, this.f192333b);
                    j.mo136467b();
                    pVar.getOffScreenSurface();
                    this.f192345n.add(pVar);
                }
                return pVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo136521a() {
        if (this.f192337f == null) {
            return;
        }
        if ((!this.f192348q.f192198a && !this.f192348q.f192199b) || (this.f192347p & 4) != 0) {
            C86203l.m148116a(f192332a, "renderer =" + this + ", check expired");
            synchronized (this.f192345n) {
                if (this.f192337f.hasMessages(8) || this.f192337f.hasMessages(9)) {
                    C86203l.m148116a(f192332a, "renderer is excuting");
                    this.f192337f.sendEmptyMessageDelayed(11, 120000);
                } else if (this.f192345n.size() == 0) {
                    C86203l.m148116a(f192332a, "renderer is expired");
                    mo136510g();
                } else {
                    for (C86211p pVar : this.f192345n) {
                        if (!pVar.isRelease() && (pVar.isAlive() || !pVar.couldForceRelease())) {
                            C86203l.m148116a(f192332a, "a texture is still working ".concat(String.valueOf(pVar)));
                            this.f192337f.sendEmptyMessageDelayed(11, 120000);
                            return;
                        }
                    }
                    C86203l.m148116a(f192332a, "non live texture , renderer is expired");
                    mo136510g();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo136527b() {
        C86203l.m148116a(f192332a, this + "deinit");
        m148126a(0, true);
        mo136507e();
        m148127h();
        mo136505d();
        if (this.f192335d != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f192335d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            if (this.f192336e != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f192335d, this.f192336e);
                this.f192336e = EGL14.EGL_NO_SURFACE;
            }
            if (this.f192334c != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f192335d, this.f192334c);
                this.f192334c = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.f192335d);
            this.f192335d = EGL14.EGL_NO_DISPLAY;
            C86203l.m148116a(f192332a, this + "OpenGL deinit OK.");
        }
        this.f192337f = null;
        C86203l.m148116a(f192332a, this + "deinit done");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo136528b(Message message) {
        if (message != null) {
            synchronized (message) {
                message.arg1 = this.f192339h;
                message.notify();
            }
        }
    }

    /* renamed from: a */
    public final void mo136522a(Message message) {
        AbstractC86187b a = this.f192343l.mo136513a(36197);
        if (a == null) {
            C86203l.m148116a(f192332a, "Create Texture failed.");
        }
        message.obj = a;
        synchronized (message) {
            message.notify();
        }
    }

    /* renamed from: a */
    public final void mo136523a(C86211p pVar) {
        if (pVar != null) {
            C86203l.m148116a(f192332a, "resume texture =".concat(String.valueOf(pVar)));
            if (!pVar.isCurrentObject(this.f192346o)) {
                pVar.makeCurrent();
                this.f192346o = pVar.getOjbectId();
                C86203l.m148116a(f192332a, "change active drawing id = " + this.f192346o);
            }
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    return true;
                }
                int i2 = message.arg1;
                C86211p pVar = (C86211p) message.obj;
                if (pVar == null) {
                    return true;
                }
                pVar.notifyRenderFrame(i2);
                return true;
            } else if (this.f192353v == null) {
                return true;
            } else {
                int i3 = message.arg1;
                if (message.arg1 != 0) {
                    return true;
                }
                this.f192338g.removeCallbacksAndMessages(null);
                this.f192338g = null;
                return true;
            }
        } else if (this.f192352u == null) {
            return true;
        } else {
            int i4 = message.arg1;
            Object obj = message.obj;
            return true;
        }
    }

    /* renamed from: c */
    public final void mo136529c(Message message) {
        C86203l.m148116a(f192332a, "handle clear surface");
        Message message2 = (Message) message.obj;
        if (this.f192339h <= 0) {
            C86203l.m148116a(f192332a, "state is invalid : " + this.f192339h);
            mo136528b(message2);
            return;
        }
        Parcelable parcelable = message.getData().getParcelable("surface");
        try {
            C86203l.m148116a(f192332a, this + ",create window surface from " + parcelable);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f192335d, this.f192333b, parcelable, new int[]{12344}, 0);
            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                C86203l.m148116a(f192332a, "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                mo136528b(message2);
            } else if (!EGL14.eglMakeCurrent(this.f192335d, eglCreateWindowSurface, eglCreateWindowSurface, this.f192334c)) {
                C86203l.m148116a(f192332a, "make current failed = ".concat(String.valueOf(eglCreateWindowSurface)));
                mo136528b(message2);
            } else {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                EGL14.eglSwapBuffers(this.f192335d, eglCreateWindowSurface);
                EGLDisplay eGLDisplay = this.f192335d;
                EGLSurface eGLSurface = this.f192336e;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f192334c);
                EGL14.eglDestroySurface(this.f192335d, eglCreateWindowSurface);
                mo136528b(message2);
            }
        } catch (Exception unused) {
            C86203l.m148116a(f192332a, "create current exception failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r1 == android.opengl.EGL14.EGL_NO_SURFACE) goto L_0x0099;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136524a(java.lang.Object r17) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.texturerender.AbstractC86206n.mo136524a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo136525a(String str) {
        synchronized (this.f192351t) {
            this.f192340i = str + ", reason = " + GLUtils.getEGLErrorString(EGL14.eglGetError());
            m148126a(-1, false);
            if (this.f192352u != null) {
                Message obtainMessage = this.f192338g.obtainMessage(6);
                obtainMessage.arg1 = 0;
                obtainMessage.obj = "EGL fail = " + str + ", reason = " + GLUtils.getEGLErrorString(EGL14.eglGetError());
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo136526a(Surface surface) {
        Message obtainMessage = this.f192337f.obtainMessage(13);
        Bundle bundle = new Bundle();
        bundle.putParcelable("surface", surface);
        obtainMessage.setData(bundle);
        Message message = new Message();
        obtainMessage.obj = message;
        try {
            synchronized (message) {
                C86203l.m148116a(f192332a, "clear surface start");
                this.f192337f.sendMessage(obtainMessage);
                message.wait(1000);
                C86203l.m148116a(f192332a, "clear surface end : ret = " + message.arg1);
            }
            if (message.arg1 <= 0) {
                return false;
            }
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m148126a(int i, boolean z) {
        Handler handler;
        if (this.f192339h != i) {
            if (this.f192339h != -1 || i == 0) {
                C86203l.m148116a(f192332a, "state change from " + this.f192339h + " to " + i);
                this.f192339h = i;
                if (z) {
                    synchronized (this.f192351t) {
                        if (this.f192353v != null && (handler = this.f192338g) != null) {
                            Message obtainMessage = handler.obtainMessage(7);
                            obtainMessage.arg1 = i;
                            obtainMessage.sendToTarget();
                        }
                    }
                }
            }
        }
    }

    public AbstractC86206n(C86174d dVar, int i) {
        C86203l.m148116a(f192332a, "version :3.8.4 config:" + dVar + " type:" + i);
        this.f192339h = 0;
        this.f192340i = null;
        this.f192336e = EGL14.EGL_NO_SURFACE;
        this.f192334c = EGL14.EGL_NO_CONTEXT;
        this.f192335d = EGL14.EGL_NO_DISPLAY;
        this.f192346o = 0;
        this.f192348q = new C86174d();
        this.f192349r = dVar;
        this.f192347p = i;
        this.f192343l = new C86200i();
        this.f192345n = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("RendererThread_".concat(String.valueOf(i)));
        this.f192350s = handlerThread;
        handlerThread.start();
        this.f192337f = new Handler(this.f192350s.getLooper()) {
            /* class com.p2082ss.texturerender.AbstractC86206n.HandlerC862071 */

            static {
                Covode.recordClassIndex(101350);
            }

            public final void handleMessage(Message message) {
                MethodCollector.m26663i(5791);
                int i = message.what;
                if (i == 1) {
                    AbstractC86206n.this.mo136524a(message.obj);
                    MethodCollector.m26664o(5791);
                } else if (i == 2) {
                    AbstractC86206n.this.mo136509f(message);
                    MethodCollector.m26664o(5791);
                } else if (i == 3) {
                    AbstractC86206n.this.mo136527b();
                    MethodCollector.m26664o(5791);
                } else if (i == 4) {
                    AbstractC86206n.this.mo136508e(message);
                    MethodCollector.m26664o(5791);
                } else if (i == 13) {
                    AbstractC86206n.this.mo136529c(message);
                    MethodCollector.m26664o(5791);
                } else if (i != 14) {
                    switch (i) {
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            AbstractC86206n.this.mo136522a((Message) message.obj);
                            MethodCollector.m26664o(5791);
                            return;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            AbstractC86206n.this.mo136523a((C86211p) message.obj);
                            MethodCollector.m26664o(5791);
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            AbstractC86206n.this.mo136521a();
                            MethodCollector.m26664o(5791);
                            return;
                        default:
                            AbstractC86206n.this.mo136506d(message);
                            MethodCollector.m26664o(5791);
                            return;
                    }
                } else {
                    AbstractC86206n nVar = AbstractC86206n.this;
                    C86203l.m148116a(AbstractC86206n.f192332a, "handle save frame");
                    Bundle data = message.getData();
                    if (data != null) {
                        C86211p pVar = (C86211p) data.getSerializable("texture");
                        if (pVar != null) {
                            Message message2 = (Message) message.obj;
                            if (nVar.f192339h <= 0) {
                                C86203l.m148116a(AbstractC86206n.f192332a, "state is invalid : " + nVar.f192339h);
                                nVar.mo136528b(message2);
                                MethodCollector.m26664o(5791);
                                return;
                            }
                            try {
                                int viewportWidth = pVar.getViewportWidth();
                                int viewportHeight = pVar.getViewportHeight();
                                if (viewportWidth == 0 || viewportHeight == 0) {
                                    C86203l.m148116a(AbstractC86206n.f192332a, "texture size is invalid = " + viewportWidth + ", height =" + viewportHeight);
                                }
                                C86203l.m148116a(AbstractC86206n.f192332a, "savexx frame = " + viewportWidth + ", " + viewportHeight);
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(viewportWidth * viewportHeight * 4);
                                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                                GLES20.glFinish();
                                GLES20.glReadPixels(0, 0, viewportWidth, viewportHeight, 6408, 5121, allocateDirect);
                                C86197g.m148104a("handleSaveFrame");
                                Bitmap createBitmap = Bitmap.createBitmap(viewportWidth, viewportHeight, Bitmap.Config.ARGB_8888);
                                allocateDirect.rewind();
                                createBitmap.copyPixelsFromBuffer(allocateDirect);
                                Matrix matrix = new Matrix();
                                matrix.postScale(1.0f, -1.0f);
                                message2.obj = Bitmap.createBitmap(createBitmap, 0, 0, viewportWidth, viewportHeight, matrix, true);
                                createBitmap.recycle();
                            } catch (Exception e) {
                                C86203l.m148116a(AbstractC86206n.f192332a, "save frame failed " + e.getMessage());
                            }
                            nVar.mo136528b(message2);
                            MethodCollector.m26664o(5791);
                            return;
                        }
                        RuntimeException runtimeException = new RuntimeException("update surface but missing texture");
                        MethodCollector.m26664o(5791);
                        throw runtimeException;
                    }
                    RuntimeException runtimeException2 = new RuntimeException("update surface but missing bundle?");
                    MethodCollector.m26664o(5791);
                    throw runtimeException2;
                }
            }
        };
        Message obtainMessage = this.f192337f.obtainMessage(1);
        obtainMessage.obj = this.f192354w;
        synchronized (this.f192354w) {
            obtainMessage.sendToTarget();
            try {
                this.f192354w.wait(1000);
            } catch (InterruptedException unused) {
                throw new RuntimeException("EGL initial timeout");
            }
        }
        this.f192337f.sendMessageDelayed(this.f192337f.obtainMessage(11), 120000);
        C86203l.m148116a(f192332a, "construct done");
    }
}
