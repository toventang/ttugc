package com.p2082ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d */
public class TextureView$SurfaceTextureListenerC58540d extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: h */
    public static final C58550j f133328h = new C58550j((byte) 0);

    /* renamed from: a */
    private final WeakReference<TextureView$SurfaceTextureListenerC58540d> f133329a = new WeakReference<>(this);

    /* renamed from: b */
    private C58549i f133330b;

    /* renamed from: c */
    private boolean f133331c;

    /* renamed from: g */
    AbstractC58511b f133332g;

    /* renamed from: i */
    public AbstractC58553m f133333i;

    /* renamed from: j */
    public AbstractC58545e f133334j;

    /* renamed from: k */
    public AbstractC58546f f133335k;

    /* renamed from: l */
    public AbstractC58547g f133336l;

    /* renamed from: m */
    public AbstractC58551k f133337m;

    /* renamed from: n */
    public int f133338n;

    /* renamed from: o */
    public int f133339o;

    /* renamed from: p */
    public boolean f133340p;

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$e */
    public interface AbstractC58545e {
        static {
            Covode.recordClassIndex(68840);
        }

        /* renamed from: a */
        EGLConfig mo95994a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$f */
    public interface AbstractC58546f {
        static {
            Covode.recordClassIndex(68841);
        }

        /* renamed from: a */
        EGLContext mo95996a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo95997a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$g */
    public interface AbstractC58547g {
        static {
            Covode.recordClassIndex(68842);
        }

        /* renamed from: a */
        EGLSurface mo95998a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* renamed from: a */
        void mo95999a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$k */
    public interface AbstractC58551k {
        static {
            Covode.recordClassIndex(68846);
        }

        /* renamed from: a */
        GL mo96013a();
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$m */
    public interface AbstractC58553m {
        static {
            Covode.recordClassIndex(68848);
        }

        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i, int i2);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$d */
    public static class C58544d implements AbstractC58547g {
        static {
            Covode.recordClassIndex(68839);
        }

        private C58544d() {
        }

        /* synthetic */ C58544d(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58547g
        /* renamed from: a */
        public final void mo95999a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58547g
        /* renamed from: a */
        public final EGLSurface mo95998a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$j */
    public static class C58550j {

        /* renamed from: c */
        private static String f133378c = "GLThreadManager";

        /* renamed from: a */
        boolean f133379a;

        /* renamed from: b */
        C58549i f133380b;

        /* renamed from: d */
        private boolean f133381d;

        /* renamed from: e */
        private int f133382e;

        /* renamed from: f */
        private boolean f133383f;

        /* renamed from: g */
        private boolean f133384g;

        private C58550j() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo96012c() {
            if (!this.f133381d) {
                this.f133381d = true;
            }
        }

        static {
            Covode.recordClassIndex(68845);
        }

        /* renamed from: a */
        public final synchronized boolean mo96009a() {
            boolean z;
            MethodCollector.m26663i(181);
            z = this.f133384g;
            MethodCollector.m26664o(181);
            return z;
        }

        /* renamed from: b */
        public final synchronized boolean mo96011b() {
            MethodCollector.m26663i(184);
            mo96012c();
            if (!this.f133379a) {
                MethodCollector.m26664o(184);
                return true;
            }
            MethodCollector.m26664o(184);
            return false;
        }

        /* synthetic */ C58550j(byte b) {
            this();
        }

        /* renamed from: b */
        public final void mo96010b(C58549i iVar) {
            if (this.f133380b == iVar) {
                this.f133380b = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public final synchronized void mo96007a(C58549i iVar) {
            MethodCollector.m26663i(171);
            iVar.f133359a = true;
            if (this.f133380b == iVar) {
                this.f133380b = null;
            }
            notifyAll();
            MethodCollector.m26664o(171);
        }

        /* renamed from: a */
        public final synchronized void mo96008a(GL10 gl10) {
            boolean z;
            MethodCollector.m26663i(209);
            if (!this.f133383f) {
                mo96012c();
                String glGetString = gl10.glGetString(7937);
                boolean z2 = false;
                if (this.f133382e < 131072) {
                    if (!glGetString.startsWith("Q3Dimension MSM7500 ")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f133379a = z;
                    notifyAll();
                }
                if (!this.f133379a) {
                    z2 = true;
                }
                this.f133384g = z2;
                this.f133383f = true;
            }
            MethodCollector.m26664o(209);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$l */
    public static class C58552l extends Writer {

        /* renamed from: a */
        private StringBuilder f133385a = new StringBuilder();

        static {
            Covode.recordClassIndex(68847);
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public final void close() {
            m107591a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            m107591a();
        }

        C58552l() {
        }

        /* renamed from: a */
        private void m107591a() {
            if (this.f133385a.length() > 0) {
                StringBuilder sb = this.f133385a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m107591a();
                } else {
                    this.f133385a.append(c);
                }
            }
        }
    }

    public int getDebugFlags() {
        return this.f133338n;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f133340p;
    }

    public int getRenderMode() {
        return this.f133330b.mo96004b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$i */
    public static class C58549i extends Thread {

        /* renamed from: a */
        public boolean f133359a;

        /* renamed from: b */
        boolean f133360b;

        /* renamed from: c */
        boolean f133361c;

        /* renamed from: d */
        boolean f133362d;

        /* renamed from: e */
        boolean f133363e;

        /* renamed from: f */
        boolean f133364f;

        /* renamed from: g */
        boolean f133365g;

        /* renamed from: h */
        int f133366h = 0;

        /* renamed from: i */
        int f133367i = 0;

        /* renamed from: j */
        boolean f133368j = true;

        /* renamed from: k */
        boolean f133369k;

        /* renamed from: l */
        ArrayList<Runnable> f133370l = new ArrayList<>();

        /* renamed from: m */
        boolean f133371m = true;

        /* renamed from: n */
        private boolean f133372n;

        /* renamed from: o */
        private boolean f133373o;

        /* renamed from: p */
        private boolean f133374p;

        /* renamed from: q */
        private int f133375q = 1;

        /* renamed from: r */
        private C58548h f133376r;

        /* renamed from: s */
        private WeakReference<TextureView$SurfaceTextureListenerC58540d> f133377s;

        static {
            Covode.recordClassIndex(68844);
        }

        /* renamed from: d */
        private void m107577d() {
            if (this.f133365g) {
                this.f133365g = false;
                this.f133376r.mo96000a();
            }
        }

        /* renamed from: e */
        private void m107578e() {
            if (this.f133364f) {
                this.f133376r.mo96001b();
                this.f133364f = false;
                TextureView$SurfaceTextureListenerC58540d.f133328h.mo96010b(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo96003a() {
            if (this.f133361c || !this.f133362d || this.f133373o || this.f133366h <= 0 || this.f133367i <= 0) {
                return false;
            }
            if (this.f133368j || this.f133375q == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final int mo96004b() {
            int i;
            MethodCollector.m26663i(1292);
            synchronized (TextureView$SurfaceTextureListenerC58540d.f133328h) {
                try {
                    i = this.f133375q;
                } finally {
                    MethodCollector.m26664o(1292);
                }
            }
            return i;
        }

        /* renamed from: c */
        public final void mo96005c() {
            MethodCollector.m26663i(1298);
            synchronized (TextureView$SurfaceTextureListenerC58540d.f133328h) {
                try {
                    this.f133372n = true;
                    TextureView$SurfaceTextureListenerC58540d.f133328h.notifyAll();
                    while (!this.f133359a) {
                        try {
                            TextureView$SurfaceTextureListenerC58540d.f133328h.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(1298);
                }
            }
        }

        public final void run() {
            setName("GLThread " + getId());
            try {
                m107579f();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                TextureView$SurfaceTextureListenerC58540d.f133328h.mo96007a(this);
                throw th;
            }
            TextureView$SurfaceTextureListenerC58540d.f133328h.mo96007a(this);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ba, code lost:
            if (r7 == null) goto L_0x01be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01be, code lost:
            if (r15 == false) goto L_0x022c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c0, code lost:
            r10 = r19.f133376r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c4, code lost:
            if (r10.f133354b == null) goto L_0x032a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c8, code lost:
            if (r10.f133355c == null) goto L_0x031d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x01cc, code lost:
            if (r10.f133357e == null) goto L_0x0310;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ce, code lost:
            r10.mo96000a();
            r0 = r10.f133353a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d9, code lost:
            if (r0 == null) goto L_0x021c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x01db, code lost:
            r10.f133356d = r0.f133336l.mo95998a(r10.f133354b, r10.f133355c, r10.f133357e, r0.getSurfaceTexture());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ef, code lost:
            if (r10.f133356d == null) goto L_0x01f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f5, code lost:
            if (r10.f133356d != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x0200;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f7, code lost:
            r10.f133354b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x01fc, code lost:
            r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.f133328h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x01fe, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x020e, code lost:
            if (r10.f133354b.eglMakeCurrent(r10.f133355c, r10.f133356d, r10.f133356d, r10.f133358f) != false) goto L_0x022b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0210, code lost:
            com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.C58548h.m107574b("eglMakeCurrent", r10.f133354b.eglGetError());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x021c, code lost:
            r10.f133356d = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
            r19.f133373o = true;
            com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.f133328h.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0228, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x022b, code lost:
            r15 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x022c, code lost:
            if (r13 == false) goto L_0x0273;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x022e, code lost:
            r1 = r19.f133376r;
            r4 = r1.f133358f.getGL();
            r8 = r1.f133353a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x023e, code lost:
            if (r8 == null) goto L_0x0268;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x0242, code lost:
            if (r8.f133337m == null) goto L_0x024a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0244, code lost:
            r4 = r8.f133337m.mo96013a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x024e, code lost:
            if ((r8.f133338n & 3) == 0) goto L_0x0268;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0254, code lost:
            if ((r8.f133338n & 1) == 0) goto L_0x0258;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0256, code lost:
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0258, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x025d, code lost:
            if ((r8.f133338n & 2) == 0) goto L_0x0270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x025f, code lost:
            r0 = new com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.C58552l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0264, code lost:
            r4 = android.opengl.GLDebugHelper.wrap(r4, r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0268, code lost:
            r4 = (javax.microedition.khronos.opengles.GL10) r4;
            com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.f133328h.mo96008a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0270, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0272, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0273, code lost:
            if (r14 == false) goto L_0x0289;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0275, code lost:
            r0 = r19.f133377s.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x027d, code lost:
            if (r0 == null) goto L_0x0288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x027f, code lost:
            r0.f133333i.onSurfaceCreated(r4, r19.f133376r.f133357e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0288, code lost:
            r14 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0289, code lost:
            if (r12 == false) goto L_0x029b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x028b, code lost:
            r0 = r19.f133377s.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0293, code lost:
            if (r0 == null) goto L_0x029a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0295, code lost:
            r0.f133333i.onSurfaceChanged(r4, r6, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x029a, code lost:
            r12 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x029b, code lost:
            r0 = r19.f133377s.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x02a3, code lost:
            if (r0 == null) goto L_0x02aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x02a5, code lost:
            r0.f133333i.onDrawFrame(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x02aa, code lost:
            r8 = r19.f133376r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x02b8, code lost:
            if (r8.f133354b.eglSwapBuffers(r8.f133355c, r8.f133356d) != false) goto L_0x02db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x02ba, code lost:
            r1 = r8.f133354b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c0, code lost:
            if (r1 == 12288) goto L_0x02db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x02c4, code lost:
            if (r1 == 12302) goto L_0x02d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x02c6, code lost:
            com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.C58548h.m107574b("eglSwapBuffers", r1);
            r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.f133328h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x02cd, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
            r19.f133373o = true;
            com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.f133328h.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x02d6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x02d8, code lost:
            r18 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x02db, code lost:
            if (r11 == false) goto L_0x02df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x02dd, code lost:
            r17 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0300, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0307, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0308, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x030a, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1284);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x030f, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0310, code lost:
            r1 = new java.lang.RuntimeException("mEglConfig not initialized");
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1284);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x031c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x031d, code lost:
            r1 = new java.lang.RuntimeException("eglDisplay not initialized");
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1284);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0329, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x032a, code lost:
            r1 = new java.lang.RuntimeException("egl not initialized");
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1284);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0336, code lost:
            throw r1;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m107579f() {
            /*
            // Method dump skipped, instructions count: 894
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.C58549i.m107579f():void");
        }

        C58549i(WeakReference<TextureView$SurfaceTextureListenerC58540d> weakReference) {
            this.f133377s = weakReference;
        }

        /* renamed from: a */
        public final void mo96002a(int i) {
            MethodCollector.m26663i(1291);
            if (i < 0 || i > 1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("renderMode");
                MethodCollector.m26664o(1291);
                throw illegalArgumentException;
            }
            synchronized (TextureView$SurfaceTextureListenerC58540d.f133328h) {
                try {
                    this.f133375q = i;
                    TextureView$SurfaceTextureListenerC58540d.f133328h.notifyAll();
                } finally {
                    MethodCollector.m26664o(1291);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(68835);
    }

    /* renamed from: a */
    private void mo95883a() {
        if (this.f133330b != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            C58549i iVar = this.f133330b;
            if (iVar != null) {
                iVar.mo96005c();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C58549i iVar = this.f133330b;
        if (iVar != null) {
            iVar.mo96005c();
        }
        this.f133331c = true;
        super.onDetachedFromWindow();
    }

    public void requestRender() {
        MethodCollector.m26663i(709);
        C58549i iVar = this.f133330b;
        C58550j jVar = f133328h;
        synchronized (jVar) {
            try {
                iVar.f133368j = true;
                jVar.notifyAll();
            } finally {
                MethodCollector.m26664o(709);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$h */
    public static class C58548h {

        /* renamed from: a */
        WeakReference<TextureView$SurfaceTextureListenerC58540d> f133353a;

        /* renamed from: b */
        EGL10 f133354b;

        /* renamed from: c */
        EGLDisplay f133355c;

        /* renamed from: d */
        EGLSurface f133356d;

        /* renamed from: e */
        EGLConfig f133357e;

        /* renamed from: f */
        EGLContext f133358f;

        static {
            Covode.recordClassIndex(68843);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo96000a() {
            EGLSurface eGLSurface = this.f133356d;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                EGL10 egl10 = this.f133354b;
                EGLDisplay eGLDisplay = this.f133355c;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                TextureView$SurfaceTextureListenerC58540d dVar = this.f133353a.get();
                if (dVar != null) {
                    dVar.f133336l.mo95999a(this.f133354b, this.f133355c, this.f133356d);
                }
                this.f133356d = null;
            }
        }

        /* renamed from: b */
        public final void mo96001b() {
            if (this.f133358f != null) {
                TextureView$SurfaceTextureListenerC58540d dVar = this.f133353a.get();
                if (dVar != null) {
                    dVar.f133335k.mo95997a(this.f133354b, this.f133355c, this.f133358f);
                }
                this.f133358f = null;
            }
            EGLDisplay eGLDisplay = this.f133355c;
            if (eGLDisplay != null) {
                this.f133354b.eglTerminate(eGLDisplay);
                this.f133355c = null;
            }
        }

        public C58548h(WeakReference<TextureView$SurfaceTextureListenerC58540d> weakReference) {
            this.f133353a = weakReference;
        }

        /* renamed from: a */
        public static void m107573a(String str, int i) {
            throw new RuntimeException(m107574b(str, i));
        }

        /* renamed from: b */
        public static String m107574b(String str, int i) {
            return str + " failed: " + i;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f133331c && this.f133333i != null) {
            C58549i iVar = this.f133330b;
            if (iVar != null) {
                i = iVar.mo96004b();
            } else {
                i = 1;
            }
            C58549i iVar2 = new C58549i(this.f133329a);
            this.f133330b = iVar2;
            if (i != 1) {
                iVar2.mo96002a(i);
            }
            this.f133330b.start();
        }
        this.f133331c = false;
    }

    public void onPause() {
        MethodCollector.m26663i(734);
        C58549i iVar = this.f133330b;
        C58550j jVar = f133328h;
        synchronized (jVar) {
            try {
                iVar.f133360b = true;
                jVar.notifyAll();
                while (!iVar.f133359a && !iVar.f133361c) {
                    try {
                        f133328h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } finally {
                MethodCollector.m26664o(734);
            }
        }
    }

    public void setDebugFlags(int i) {
        this.f133338n = i;
    }

    public void setGLWrapper(AbstractC58551k kVar) {
        this.f133337m = kVar;
    }

    public void setMonitor(AbstractC58511b bVar) {
        this.f133332g = bVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f133340p = z;
    }

    public void setEGLConfigChooser(AbstractC58545e eVar) {
        mo95883a();
        this.f133334j = eVar;
    }

    public void setEGLContextClientVersion(int i) {
        mo95883a();
        this.f133339o = i;
    }

    public void setEGLContextFactory(AbstractC58546f fVar) {
        mo95883a();
        this.f133335k = fVar;
    }

    public void setEGLWindowSurfaceFactory(AbstractC58547g gVar) {
        mo95883a();
        this.f133336l = gVar;
    }

    public void setRenderMode(int i) {
        this.f133330b.mo96002a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$c */
    public class C58543c implements AbstractC58546f {

        /* renamed from: b */
        private int f133352b;

        static {
            Covode.recordClassIndex(68838);
        }

        private C58543c() {
            this.f133352b = 12440;
        }

        /* synthetic */ C58543c(TextureView$SurfaceTextureListenerC58540d dVar, byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58546f
        /* renamed from: a */
        public final void mo95997a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                C58548h.m107573a("eglDestroyContex", egl10.eglGetError());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58546f
        /* renamed from: a */
        public final EGLContext mo95996a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f133352b, TextureView$SurfaceTextureListenerC58540d.this.f133339o, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (TextureView$SurfaceTextureListenerC58540d.this.f133339o == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C58554n(z));
    }

    public TextureView$SurfaceTextureListenerC58540d(Context context) {
        super(context, null);
        MethodCollector.m26663i(593);
        setSurfaceTextureListener(this);
        MethodCollector.m26664o(593);
    }

    /* renamed from: a */
    public final void mo95970a(Runnable runnable) {
        MethodCollector.m26663i(814);
        C58549i iVar = this.f133330b;
        C58550j jVar = f133328h;
        synchronized (jVar) {
            try {
                iVar.f133370l.add(runnable);
                jVar.notifyAll();
            } finally {
                MethodCollector.m26664o(814);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MethodCollector.m26663i(849);
        C58549i iVar = this.f133330b;
        C58550j jVar = f133328h;
        synchronized (jVar) {
            try {
                iVar.f133362d = false;
                jVar.notifyAll();
                while (!iVar.f133363e && !iVar.f133359a) {
                    try {
                        f133328h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(849);
                throw th;
            }
        }
        MethodCollector.m26664o(849);
        return true;
    }

    public void setRenderer(AbstractC58553m mVar) {
        mo95883a();
        if (this.f133334j == null) {
            this.f133334j = new C58554n(true);
        }
        if (this.f133335k == null) {
            this.f133335k = new C58543c(this, (byte) 0);
        }
        if (this.f133336l == null) {
            this.f133336l = new C58544d((byte) 0);
        }
        this.f133333i = mVar;
        C58549i iVar = new C58549i(this.f133329a);
        this.f133330b = iVar;
        iVar.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$n */
    public class C58554n extends C58542b {
        static {
            Covode.recordClassIndex(68849);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C58554n(boolean r4) {
            /*
                r2 = this;
                com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.this = r3
                r1 = 0
                if (r4 == 0) goto L_0x000b
                r0 = 16
            L_0x0007:
                r2.<init>(r1, r0)
                return
            L_0x000b:
                r0 = 0
                goto L_0x0007
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.C58554n.<init>(com.ss.android.ugc.aweme.live.alphaplayer.d, boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$a */
    abstract class AbstractC58541a implements AbstractC58545e {

        /* renamed from: a */
        protected int[] f133341a;

        static {
            Covode.recordClassIndex(68836);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract EGLConfig mo95995a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public AbstractC58541a(int[] iArr) {
            if (TextureView$SurfaceTextureListenerC58540d.this.f133339o == 2) {
                int[] iArr2 = new int[15];
                System.arraycopy(iArr, 0, iArr2, 0, 12);
                iArr2[12] = 12352;
                iArr2[13] = 4;
                iArr2[14] = 12344;
                iArr = iArr2;
            }
            this.f133341a = iArr;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58545e
        /* renamed from: a */
        public final EGLConfig mo95994a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f133341a, null, 0, iArr)) {
                TextureView$SurfaceTextureListenerC58540d dVar = TextureView$SurfaceTextureListenerC58540d.this;
                String stackTraceString = Log.getStackTraceString(new IllegalArgumentException("eglChooseConfig failed"));
                if (dVar.f133332g != null) {
                    dVar.f133332g.mo16678a(false, "unknown", 0, 0, stackTraceString);
                }
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (egl10.eglChooseConfig(eGLDisplay, this.f133341a, eGLConfigArr, i, iArr)) {
                    EGLConfig a = mo95995a(egl10, eGLDisplay, eGLConfigArr);
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalArgumentException("No config chosen");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
    }

    /* renamed from: a */
    private void m107558a(int i, int i2) {
        MethodCollector.m26663i(722);
        C58549i iVar = this.f133330b;
        C58550j jVar = f133328h;
        synchronized (jVar) {
            try {
                iVar.f133366h = i;
                iVar.f133367i = i2;
                iVar.f133371m = true;
                iVar.f133368j = true;
                iVar.f133369k = false;
                jVar.notifyAll();
                while (!iVar.f133359a && !iVar.f133361c && !iVar.f133369k && iVar.f133364f && iVar.f133365g && iVar.mo96003a()) {
                    try {
                        f133328h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } finally {
                MethodCollector.m26664o(722);
            }
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        m107558a(i, i2);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        MethodCollector.m26663i(845);
        C58549i iVar = this.f133330b;
        C58550j jVar = f133328h;
        synchronized (jVar) {
            try {
                iVar.f133362d = true;
                jVar.notifyAll();
                while (iVar.f133363e && !iVar.f133359a) {
                    try {
                        f133328h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(845);
                throw th;
            }
        }
        m107558a(i, i2);
        MethodCollector.m26664o(845);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$b */
    public class C58542b extends AbstractC58541a {

        /* renamed from: c */
        protected int f133343c = 8;

        /* renamed from: d */
        protected int f133344d = 8;

        /* renamed from: e */
        protected int f133345e = 8;

        /* renamed from: f */
        protected int f133346f;

        /* renamed from: g */
        protected int f133347g;

        /* renamed from: h */
        protected int f133348h;

        /* renamed from: j */
        private int[] f133350j = new int[1];

        static {
            Covode.recordClassIndex(68837);
        }

        public C58542b(int i, int i2) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
            this.f133346f = i;
            this.f133347g = i2;
            this.f133348h = 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58541a
        /* renamed from: a */
        public final EGLConfig mo95995a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a = m107562a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = m107562a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.f133347g && a2 >= this.f133348h) {
                    int a3 = m107562a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a4 = m107562a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a5 = m107562a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a6 = m107562a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a3 == this.f133343c && a4 == this.f133344d && a5 == this.f133345e && a6 == this.f133346f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m107562a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f133350j)) {
                return this.f133350j[0];
            }
            return 0;
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getSurfaceTexture();
        m107558a(i3 - i, i4 - i2);
    }
}
