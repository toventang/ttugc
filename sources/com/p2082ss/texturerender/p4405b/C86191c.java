package com.p2082ss.texturerender.p4405b;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.texturerender.AbstractC86187b;
import com.p2082ss.texturerender.AbstractC86206n;
import com.p2082ss.texturerender.C86197g;
import com.p2082ss.texturerender.C86203l;
import com.p2082ss.texturerender.C86205m;
import com.p2082ss.texturerender.C86211p;
import com.p2082ss.texturerender.Choreographer$FrameCallbackC86214r;
import com.p2082ss.texturerender.p4404a.C86174d;
import com.p2082ss.texturerender.p4404a.C86179i;
import com.p2082ss.texturerender.p4404a.C86180j;
import com.p2082ss.texturerender.p4404a.C86185o;
import com.p2082ss.texturerender.p4405b.C86188a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.ss.texturerender.b.c */
public final class C86191c extends AbstractC86206n {

    /* renamed from: N */
    private static int f192281N = 2;

    /* renamed from: O */
    private static int f192282O = 500;

    /* renamed from: P */
    private static int f192283P = 3;

    /* renamed from: A */
    private boolean f192284A;

    /* renamed from: B */
    private Choreographer$FrameCallbackC86214r f192285B = new Choreographer$FrameCallbackC86214r(C86205m.m148119a().f192331d);

    /* renamed from: C */
    private C86179i f192286C;

    /* renamed from: D */
    private AbstractC86187b f192287D;

    /* renamed from: E */
    private AbstractC86187b f192288E;

    /* renamed from: F */
    private int f192289F;

    /* renamed from: G */
    private int f192290G;

    /* renamed from: H */
    private float f192291H = 0.5f;

    /* renamed from: I */
    private boolean f192292I;

    /* renamed from: J */
    private C86185o f192293J;

    /* renamed from: K */
    private C86180j f192294K;

    /* renamed from: L */
    private Choreographer$FrameCallbackC86214r.C86216a f192295L;

    /* renamed from: M */
    private boolean f192296M;

    /* renamed from: Q */
    private C86188a f192297Q = new C86188a();

    /* renamed from: R */
    private C86188a f192298R = new C86188a();

    /* renamed from: S */
    private int f192299S;

    /* renamed from: T */
    private int f192300T;

    /* renamed from: U */
    private C86190b f192301U = new C86190b();

    /* renamed from: V */
    private C86211p f192302V;

    /* renamed from: W */
    private HashMap<C86211p, Message> f192303W = new HashMap<>();

    /* renamed from: s */
    public long f192304s;

    /* renamed from: t */
    private Surface f192305t;

    /* renamed from: u */
    private EGLSurface f192306u = EGL14.EGL_NO_SURFACE;

    /* renamed from: v */
    private boolean f192307v;

    /* renamed from: w */
    private float[] f192308w;

    /* renamed from: x */
    private float[] f192309x;

    /* renamed from: y */
    private Vector<C86192a> f192310y = new Vector<>(2);

    /* renamed from: z */
    private int f192311z;

    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: e */
    public final void mo136507e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.texturerender.b.c$a */
    public static class C86192a {

        /* renamed from: a */
        public static int f192312a = 1;

        /* renamed from: b */
        public static int f192313b = 2;

        /* renamed from: c */
        public static int f192314c = 3;

        /* renamed from: d */
        public C86211p f192315d;

        /* renamed from: e */
        public int f192316e = f192312a;

        /* renamed from: f */
        public C86188a.C86189a f192317f;

        static {
            Covode.recordClassIndex(101335);
        }

        public C86192a(C86211p pVar, C86188a.C86189a aVar) {
            this.f192315d = pVar;
            this.f192317f = aVar;
        }
    }

    static {
        Covode.recordClassIndex(101334);
    }

    /* renamed from: j */
    private int m148087j() {
        if (this.f192306u == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f192335d, this.f192306u, 12375, iArr, 0);
        return iArr[0];
    }

    /* renamed from: k */
    private int m148088k() {
        if (this.f192306u == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f192335d, this.f192306u, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: g */
    public final synchronized void mo136510g() {
        MethodCollector.m26663i(4569);
        super.mo136510g();
        m148085h();
        this.f192311z = 0;
        this.f192301U.mo136502c();
        MethodCollector.m26664o(4569);
    }

    /* renamed from: h */
    private void m148085h() {
        Iterator<C86192a> it = this.f192310y.iterator();
        while (it.hasNext()) {
            C86192a next = it.next();
            C86203l.m148116a("OverlayVideoTextureRenderer", "_dropAllFrames isMain:" + m148082c(next.f192315d));
            m148081b(next.f192315d);
            m148084e(next.f192315d);
            it.remove();
        }
    }

    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: c */
    public final void mo136504c() {
        if (this.f192339h != -1) {
            try {
                C86185o oVar = this.f192293J;
                if (oVar != null) {
                    oVar.mo136470a();
                }
                C86185o oVar2 = new C86185o();
                this.f192293J = oVar2;
                oVar2.mo136469a((Bundle) null);
                C86180j jVar = this.f192294K;
                if (jVar != null) {
                    jVar.mo136470a();
                }
                C86180j jVar2 = new C86180j();
                this.f192294K = jVar2;
                jVar2.mo136469a((Bundle) null);
                this.f192295L = new Choreographer$FrameCallbackC86214r.C86216a(this.f192337f);
            } catch (Exception e) {
                mo136525a(e.toString());
            }
            C86203l.m148116a("OverlayVideoTextureRenderer", "initGLComponents done render:".concat(String.valueOf(this)));
        }
    }

    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: d */
    public final void mo136505d() {
        C86185o oVar = this.f192293J;
        if (oVar != null) {
            oVar.mo136470a();
            this.f192293J = null;
        }
        C86180j jVar = this.f192294K;
        if (jVar != null) {
            jVar.mo136470a();
            this.f192294K = null;
        }
        C86179i iVar = this.f192286C;
        if (iVar != null) {
            C86197g.m148103a(iVar.f192208a);
            this.f192286C = null;
        }
        AbstractC86187b bVar = this.f192287D;
        if (bVar != null) {
            bVar.mo136467b();
            this.f192287D = null;
        }
        AbstractC86187b bVar2 = this.f192288E;
        if (bVar2 != null) {
            bVar2.mo136467b();
            this.f192288E = null;
        }
    }

    /* renamed from: l */
    private void m148089l() {
        int i;
        long d = this.f192301U.mo136503d();
        Iterator<C86192a> it = this.f192310y.iterator();
        while (it.hasNext()) {
            C86192a next = it.next();
            long j = next.f192317f.pts - d;
            if (j > ((long) f192282O)) {
                if (m148082c(next.f192315d)) {
                    i = this.f192299S + 1;
                    this.f192299S = i;
                } else {
                    i = this.f192300T + 1;
                    this.f192300T = i;
                }
                if (i <= f192283P) {
                    next.f192316e = C86192a.f192314c;
                } else {
                    next.f192316e = C86192a.f192313b;
                }
            } else {
                long j2 = 1000000 * j;
                if (j2 < this.f192285B.f192422c * -2) {
                    next.f192316e = C86192a.f192314c;
                } else if (j2 > this.f192285B.f192422c) {
                    next.f192316e = C86192a.f192313b;
                } else {
                    next.f192316e = C86192a.f192312a;
                }
            }
            C86203l.m148116a("OverlayVideoTextureRenderer", "_avSyncByVsync pts:" + next.f192317f.pts + " master:" + d + " diff:" + j + " isMainSurface:" + m148082c(next.f192315d) + " status:" + next.f192316e);
        }
        if (m148086i()) {
            if (this.f192306u == EGL14.EGL_NO_SURFACE) {
                C86203l.m148116a("OverlayVideoTextureRenderer", "no surface to render");
            } else if (!EGL14.eglSwapBuffers(this.f192335d, this.f192306u)) {
                C86203l.m148116a("OverlayVideoTextureRenderer", this + "swap buffer failed");
            }
        }
        C86203l.m148116a("OverlayVideoTextureRenderer", "handleVsyncDraw end, ReadyVector size:" + this.f192310y.size());
        if (this.f192310y.isEmpty()) {
            Choreographer$FrameCallbackC86214r rVar = this.f192285B;
            Choreographer$FrameCallbackC86214r.C86216a aVar = this.f192295L;
            C86203l.m148116a("VsyncHelper", "removeObserver");
            if (aVar != null) {
                Message obtainMessage = rVar.f192420a.obtainMessage(30);
                obtainMessage.obj = aVar;
                obtainMessage.sendToTarget();
            }
            this.f192284A = false;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m148086i() {
        /*
        // Method dump skipped, instructions count: 668
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.texturerender.p4405b.C86191c.m148086i():boolean");
    }

    /* renamed from: c */
    private boolean m148082c(C86211p pVar) {
        if (pVar == this.f192302V) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m148081b(C86211p pVar) {
        try {
            pVar.lock();
            if (!pVar.isRelease()) {
                pVar.updateTexImage();
                pVar.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pVar.unlock();
        }
    }

    /* renamed from: d */
    private boolean m148083d(C86211p pVar) {
        Iterator<C86192a> it = this.f192310y.iterator();
        while (it.hasNext()) {
            if (it.next().f192315d == pVar) {
                return false;
            }
        }
        if (m148082c(pVar)) {
            if (this.f192297Q.f192276a.size() > 0) {
                return false;
            }
            return true;
        } else if (this.f192298R.f192276a.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private void m148084e(C86211p pVar) {
        MethodCollector.m26663i(4766);
        Message message = this.f192303W.get(pVar);
        if (message != null) {
            synchronized (message) {
                try {
                    C86203l.m148116a("OverlayVideoTextureRenderer", "notify st:" + pVar + " MainQueue:" + this.f192297Q.toString() + " SubQueue:" + this.f192298R.toString());
                    message.arg1 = Integer.MIN_VALUE;
                    message.notify();
                } finally {
                    MethodCollector.m26664o(4766);
                }
            }
            return;
        }
        MethodCollector.m26664o(4766);
    }

    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: f */
    public final void mo136509f(Message message) {
        C86188a.C86189a a;
        long j;
        C86211p pVar = (C86211p) message.obj;
        if (m148082c(pVar)) {
            a = this.f192297Q.mo136496a(pVar.getTimestamp());
        } else {
            a = this.f192298R.mo136496a(pVar.getTimestamp());
        }
        long j2 = -1;
        if (a != null) {
            j = a.pts - this.f192301U.mo136503d();
        } else {
            j = -1;
        }
        StringBuilder append = new StringBuilder("handleFrameAvailable,st = ").append(pVar).append(" isMainSurface:").append(m148082c(pVar)).append(" pts:");
        if (a != null) {
            j2 = a.pts;
        }
        C86203l.m148116a("OverlayVideoTextureRenderer", append.append(j2).append(" master:").append(this.f192301U.mo136503d()).append(" diff:").append(j).toString());
        if (j < 0) {
            m148081b(pVar);
            m148084e(pVar);
            return;
        }
        if (!this.f192284A) {
            this.f192285B.mo136607a(this.f192295L);
            this.f192284A = true;
        }
        this.f192310y.add(new C86192a(pVar, a));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.util.HashMap<com.ss.texturerender.p, android.os.Message> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: d */
    public final void mo136506d(Message message) {
        MethodCollector.m26663i(4635);
        boolean z = true;
        switch (message.what) {
            case 26:
                if (!m148082c((C86211p) message.obj)) {
                    MethodCollector.m26664o(4635);
                    return;
                }
                int i = message.arg1;
                if (i == 1) {
                    this.f192301U.mo136499a();
                    MethodCollector.m26664o(4635);
                    return;
                } else if (i == 2) {
                    MethodCollector.m26664o(4635);
                    return;
                } else if (i == 3) {
                    C86203l.m148116a("OverlayVideoTextureRenderer", "TEXTURE_STATE_STOP");
                    this.f192297Q.f192276a.clear();
                    this.f192298R.f192276a.clear();
                    this.f192301U.mo136502c();
                    MethodCollector.m26664o(4635);
                    return;
                } else if (i != 4) {
                    MethodCollector.m26664o(4635);
                    return;
                } else {
                    this.f192301U.mo136501b();
                    MethodCollector.m26664o(4635);
                    return;
                }
            case 27:
                float f = message.getData().getFloat("overlay_ratio");
                C86203l.m148116a("OverlayVideoTextureRenderer", "SetOverlayRatio ratio:".concat(String.valueOf(f)));
                if (f != this.f192291H) {
                    this.f192291H = f;
                    this.f192292I = true;
                    if (!this.f192284A) {
                        this.f192285B.mo136607a(this.f192295L);
                        this.f192284A = true;
                    }
                }
                MethodCollector.m26664o(4635);
                return;
            case 28:
                m148089l();
                MethodCollector.m26664o(4635);
                return;
            case 31:
                if (message.arg1 != 1) {
                    z = false;
                }
                this.f192296M = z;
                C86203l.m148116a("OverlayVideoTextureRenderer", "MSG_SET_OVERLAY_SYNC mNeedSync:" + this.f192296M);
                MethodCollector.m26664o(4635);
                return;
            case 32:
                Bundle data = message.getData();
                C86211p pVar = (C86211p) data.getSerializable("texture");
                C86188a.C86189a aVar = (C86188a.C86189a) data.getSerializable("update_frame_time");
                if (m148082c(pVar)) {
                    String string = data.getString("master_clock");
                    if (!TextUtils.isEmpty(string)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - data.getLong("master_clock_diff");
                        this.f192301U.mo136500a(Long.parseLong(string.trim()) + elapsedRealtime);
                    }
                }
                boolean d = m148083d(pVar);
                if (d) {
                    Message message2 = (Message) message.obj;
                    synchronized (message2) {
                        try {
                            message2.arg1 = (int) aVar.pts;
                            message.obj.notify();
                        } catch (Throwable th) {
                            MethodCollector.m26664o(4635);
                            throw th;
                        }
                    }
                }
                this.f192303W.put(pVar, message.obj);
                if (m148082c(pVar)) {
                    this.f192297Q.mo136497a(aVar);
                } else {
                    this.f192298R.mo136497a(aVar);
                }
                C86203l.m148116a("OverlayVideoTextureRenderer", "MSG_UPDATE_FRAME_TIME needNotify:" + d + " MainQueue:" + this.f192297Q.f192276a.size() + " SubQueue:" + this.f192298R.f192276a.size());
                MethodCollector.m26664o(4635);
                return;
            case 33:
                this.f192302V = (C86211p) message.obj;
                C86203l.m148116a("OverlayVideoTextureRenderer", "MSG_SET_MAIN_SURFACE st:" + this.f192302V);
                break;
        }
        MethodCollector.m26664o(4635);
    }

    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: e */
    public final void mo136508e(Message message) {
        MethodCollector.m26663i(4380);
        Bundle data = message.getData();
        if (data != null) {
            C86211p pVar = (C86211p) data.getSerializable("texture");
            if (pVar != null) {
                Surface updateSurface = pVar.getUpdateSurface();
                Surface surface = this.f192305t;
                if (surface == null || surface != updateSurface) {
                    if (updateSurface == null) {
                        m148085h();
                        if (this.f192305t == null) {
                            C86203l.m148116a("OverlayVideoTextureRenderer", "reset null surface, return");
                            MethodCollector.m26664o(4380);
                            return;
                        }
                    }
                } else if (updateSurface.toString().contains("SurfaceTexture")) {
                    C86203l.m148116a("OverlayVideoTextureRenderer", "set same surface, return");
                    MethodCollector.m26664o(4380);
                    return;
                }
                if (this.f192306u != EGL14.EGL_NO_SURFACE) {
                    C86203l.m148116a("OverlayVideoTextureRenderer", "destory previous surface = " + this.f192306u);
                    if (updateSurface == null) {
                        C86203l.m148116a("OverlayVideoTextureRenderer", "make current to dummy surface due to non render surface");
                        EGL14.eglMakeCurrent(this.f192335d, this.f192336e, this.f192336e, this.f192334c);
                    }
                    boolean eglDestroySurface = EGL14.eglDestroySurface(this.f192335d, this.f192306u);
                    this.f192306u = EGL14.EGL_NO_SURFACE;
                    this.f192307v = false;
                    C86203l.m148116a("OverlayVideoTextureRenderer", "destory previous surface done = " + this.f192306u + " ret:" + eglDestroySurface);
                }
                if (updateSurface != null && updateSurface.isValid()) {
                    int[] iArr = {12344};
                    try {
                        C86203l.m148116a("OverlayVideoTextureRenderer", this + ",create window surface from " + updateSurface);
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f192335d, this.f192333b, updateSurface, iArr, 0);
                        this.f192306u = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                            C86203l.m148116a("OverlayVideoTextureRenderer", "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                            MethodCollector.m26664o(4380);
                            return;
                        }
                        if (this.f192306u == EGL14.EGL_NO_SURFACE) {
                            C86203l.m148116a("OverlayVideoTextureRenderer", "no surface for make current");
                        } else {
                            C86203l.m148116a("OverlayVideoTextureRenderer", this + " make current again");
                            GLES20.glFinish();
                            EGLDisplay eGLDisplay = this.f192335d;
                            EGLSurface eGLSurface = this.f192306u;
                            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f192334c)) {
                                C86203l.m148116a("OverlayVideoTextureRenderer", "make current failed = " + this.f192306u);
                            } else {
                                C86203l.m148116a("OverlayVideoTextureRenderer", this + "make current done");
                                this.f192307v = true;
                            }
                        }
                        int length = C86180j.f192210o.length;
                        this.f192308w = new float[length];
                        System.arraycopy(C86180j.f192210o, 0, this.f192308w, 0, length);
                        this.f192309x = new float[length];
                        System.arraycopy(C86180j.f192210o, 0, this.f192309x, 0, length);
                    } catch (Exception unused) {
                        C86203l.m148116a("OverlayVideoTextureRenderer", "create current exception failed");
                        MethodCollector.m26664o(4380);
                        return;
                    }
                }
                this.f192304s = System.nanoTime();
                this.f192305t = updateSurface;
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        try {
                            obj.notify();
                        } catch (Throwable th) {
                            MethodCollector.m26664o(4380);
                            throw th;
                        }
                    }
                }
                C86203l.m148116a("OverlayVideoTextureRenderer", "set surface done, mEglSurface=" + this.f192306u + " render:" + this);
                MethodCollector.m26664o(4380);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("OverlayVideoTextureRenderer update surface but missing texture");
            MethodCollector.m26664o(4380);
            throw runtimeException;
        }
        RuntimeException runtimeException2 = new RuntimeException("OverlayVideoTextureRenderer update surface but missing bundle?");
        MethodCollector.m26664o(4380);
        throw runtimeException2;
    }

    public C86191c(C86174d dVar, int i) {
        super(dVar, i);
        C86203l.m148116a("OverlayVideoTextureRenderer", "OverlayVideoTextureRenderer");
    }
}
