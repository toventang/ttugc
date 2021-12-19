package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.j */
public final class RunnableC58860j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    public Object f133975a;

    /* renamed from: b */
    Object f133976b;

    /* renamed from: c */
    C58855e f133977c;

    /* renamed from: d */
    List<C58862k> f133978d;

    /* renamed from: e */
    C58856f f133979e;

    /* renamed from: f */
    C58870q f133980f;

    /* renamed from: g */
    C58872s f133981g;

    /* renamed from: h */
    C58872s f133982h;

    /* renamed from: i */
    float[] f133983i;

    /* renamed from: j */
    int f133984j;

    /* renamed from: k */
    int f133985k;

    /* renamed from: l */
    public int f133986l;

    /* renamed from: m */
    float[] f133987m;

    /* renamed from: n */
    public Pair<Float, Float> f133988n;

    /* renamed from: o */
    private C58854d f133989o;

    /* renamed from: p */
    private Thread f133990p;

    /* renamed from: q */
    private Handler f133991q;

    /* renamed from: r */
    private List<C58862k> f133992r;

    /* renamed from: s */
    private boolean f133993s;

    /* renamed from: t */
    private Object f133994t = new Object();

    /* renamed from: u */
    private int f133995u = 8;

    static {
        Covode.recordClassIndex(69174);
    }

    /* renamed from: e */
    public final void mo96288e() {
        this.f133991q.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public final void mo96282a() {
        if (this.f133986l != 3) {
            m108123g();
            this.f133986l = 3;
        }
    }

    /* renamed from: b */
    public final void mo96285b() {
        try {
            mo96284a(this.f133975a);
            this.f133986l = 4;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public final void mo96287d() {
        this.f133991q.sendEmptyMessage(8);
        m108125i();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0008 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0008 A[LOOP:0: B:2:0x0008->B:14:0x0008, LOOP_START, SYNTHETIC, Splitter:B:2:0x0008] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m108124h() {
        /*
            r5 = this;
            r4 = 4903(0x1327, float:6.87E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            java.lang.Object r3 = r5.f133994t
            monitor-enter(r3)
        L_0x0008:
            boolean r0 = r5.f133993s     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0014
            java.lang.Object r2 = r5.f133994t     // Catch:{ InterruptedException -> 0x0008 }
            r0 = 10
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0008 }
            goto L_0x0008
        L_0x0014:
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.RunnableC58860j.m108124h():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0008 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0008 A[LOOP:0: B:2:0x0008->B:14:0x0008, LOOP_START, SYNTHETIC, Splitter:B:2:0x0008] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m108125i() {
        /*
            r5 = this;
            r4 = 4959(0x135f, float:6.949E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            java.lang.Object r3 = r5.f133994t
            monitor-enter(r3)
        L_0x0008:
            boolean r0 = r5.f133993s     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r5.f133994t     // Catch:{ InterruptedException -> 0x0008 }
            r0 = 10
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0008 }
            goto L_0x0008
        L_0x0014:
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.RunnableC58860j.m108125i():void");
    }

    /* renamed from: f */
    public final C58862k mo96289f() {
        AbstractC58858h j = m108126j();
        if (j == null) {
            return null;
        }
        C58862k kVar = new C58862k(j);
        j.mo96279b();
        kVar.setOnFrameAvailableListener(this);
        return kVar;
    }

    /* renamed from: g */
    private void m108123g() {
        C58872s sVar = this.f133981g;
        if (sVar != null) {
            sVar.mo96304b();
        }
        C58872s sVar2 = this.f133982h;
        if (sVar2 != null) {
            sVar2.mo96304b();
        }
        C58856f fVar = this.f133979e;
        if (fVar != null) {
            fVar.mo96301c();
            this.f133979e = null;
        }
        C58870q qVar = this.f133980f;
        if (qVar != null) {
            qVar.mo96301c();
            this.f133980f = null;
        }
        C58855e eVar = this.f133977c;
        if (eVar != null) {
            eVar.mo96273d();
            this.f133977c = null;
        }
        C58854d dVar = this.f133989o;
        if (dVar != null) {
            dVar.mo96266a();
            this.f133989o = null;
        }
    }

    /* renamed from: j */
    private AbstractC58858h m108126j() {
        MethodCollector.m26663i(4966);
        Message obtainMessage = this.f133991q.obtainMessage(3);
        Message message = new Message();
        message.arg1 = 1;
        obtainMessage.arg1 = 0;
        obtainMessage.arg2 = 0;
        obtainMessage.obj = message;
        this.f133991q.sendMessage(obtainMessage);
        try {
            synchronized (message) {
                while (message.arg1 != 0) {
                    try {
                        message.wait(10);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(4966);
                        throw th;
                    }
                }
            }
            AbstractC58858h hVar = (AbstractC58858h) message.obj;
            MethodCollector.m26664o(4966);
            return hVar;
        } catch (InterruptedException unused) {
            MethodCollector.m26664o(4966);
            return null;
        }
    }

    public final void run() {
        MethodCollector.m26663i(5025);
        Looper.prepare();
        this.f133991q = new HandlerC58861a(this);
        synchronized (this.f133994t) {
            try {
                this.f133993s = true;
                this.f133994t.notify();
            } finally {
                MethodCollector.m26664o(5025);
            }
        }
        Looper.loop();
        synchronized (this.f133994t) {
            try {
                this.f133993s = false;
                this.f133994t.notify();
            } finally {
                MethodCollector.m26664o(5025);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo96286c() {
        C58855e eVar = this.f133977c;
        if (eVar != null) {
            eVar.mo96273d();
        }
        Object obj = this.f133976b;
        if (obj == null) {
            this.f133977c = new C58863l(this.f133989o);
        } else if (obj instanceof Surface) {
            this.f133977c = new C58874t(this.f133989o, (Surface) this.f133976b);
        } else if (obj instanceof SurfaceTexture) {
            this.f133977c = new C58874t(this.f133989o, (SurfaceTexture) this.f133976b);
        } else {
            throw new AndroidRuntimeException("UnsupportedOperation");
        }
        this.f133985k = this.f133977c.mo96271b();
        this.f133984j = this.f133977c.mo96272c();
        this.f133977c.mo96274e();
        this.f133975a = C58854d.m108102b();
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.j$a */
    static class HandlerC58861a extends Handler {

        /* renamed from: a */
        private WeakReference<RunnableC58860j> f133996a;

        static {
            Covode.recordClassIndex(69175);
        }

        HandlerC58861a(RunnableC58860j jVar) {
            this.f133996a = new WeakReference<>(jVar);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public final void handleMessage(Message message) {
            MethodCollector.m26663i(5632);
            RunnableC58860j jVar = this.f133996a.get();
            if (jVar != null) {
                switch (message.what) {
                    case 1:
                        jVar.mo96284a(message.obj);
                        MethodCollector.m26664o(5632);
                        return;
                    case 2:
                        Object obj = message.obj;
                        if (obj != null) {
                            AbstractC58858h hVar = (AbstractC58858h) obj;
                            if (jVar.f133986l == 4) {
                                if (jVar.f133980f == null) {
                                    jVar.f133980f = new C58870q();
                                    if (!jVar.f133980f.mo96300a(jVar.f133985k, jVar.f133984j)) {
                                        jVar.mo96282a();
                                    }
                                }
                                if (!(jVar.f133980f == null || hVar == null || jVar.f133976b == null)) {
                                    Matrix.setIdentityM(jVar.f133987m, 0);
                                    jVar.f133980f.mo96298a(hVar.mo96280c(), jVar.f133987m);
                                    hVar.mo96281d();
                                    jVar.f133977c.mo96269a(System.nanoTime());
                                    jVar.f133977c.mo96275f();
                                }
                            }
                            hVar.mo96279b();
                            MethodCollector.m26664o(5632);
                            return;
                        }
                        synchronized (jVar.f133978d) {
                            while (!jVar.f133978d.isEmpty()) {
                                try {
                                    C58862k remove = jVar.f133978d.remove(0);
                                    if (jVar.f133986l == 4) {
                                        if (jVar.f133979e == null) {
                                            jVar.f133979e = new C58856f();
                                            if (!jVar.f133979e.mo96300a(jVar.f133985k, jVar.f133984j)) {
                                                jVar.mo96282a();
                                            }
                                            jVar.f133983i = new float[16];
                                        }
                                        if (jVar.f133979e != null) {
                                            if (remove != null) {
                                                if (jVar.f133976b != null) {
                                                    synchronized (remove) {
                                                        try {
                                                            if (!remove.f133999c) {
                                                                remove.updateTexImage();
                                                                long timestamp = remove.getTimestamp();
                                                                if (remove.f133998b) {
                                                                    AbstractC58858h hVar2 = remove.f133997a;
                                                                    remove.getTransformMatrix(jVar.f133983i);
                                                                    Matrix.setIdentityM(jVar.f133987m, 0);
                                                                    Matrix.scaleM(jVar.f133987m, 0, ((Float) jVar.f133988n.first).floatValue(), ((Float) jVar.f133988n.second).floatValue(), 1.0f);
                                                                    GLES20.glViewport(0, 0, jVar.f133985k, jVar.f133984j);
                                                                    jVar.f133979e.mo96299a(hVar2.mo96280c(), jVar.f133983i, jVar.f133987m);
                                                                    hVar2.mo96281d();
                                                                    jVar.f133977c.mo96269a(timestamp);
                                                                    jVar.f133977c.mo96275f();
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    MethodCollector.m26664o(5632);
                                }
                            }
                        }
                        MethodCollector.m26664o(5632);
                        return;
                    case 3:
                        Message message2 = (Message) message.obj;
                        int i = message.arg1;
                        int i2 = message.arg2;
                        AbstractC58858h hVar3 = null;
                        if (i == 0 && i2 == 0 && jVar.f133982h != null) {
                            hVar3 = jVar.f133982h.mo96303a();
                        } else if (jVar.f133981g != null) {
                            hVar3 = jVar.f133981g.mo96303a();
                        }
                        message2.obj = hVar3;
                        synchronized (message2) {
                            try {
                                message2.arg1 = 0;
                                message2.notify();
                            } finally {
                                MethodCollector.m26664o(5632);
                            }
                        }
                        return;
                    case 4:
                        jVar.mo96282a();
                        MethodCollector.m26664o(5632);
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        jVar.mo96285b();
                        MethodCollector.m26664o(5632);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (jVar.f133986l == 4) {
                            jVar.f133986l = 2;
                        }
                        MethodCollector.m26664o(5632);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        if (jVar.f133986l == 2) {
                            jVar.f133986l = 4;
                        }
                        MethodCollector.m26664o(5632);
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        jVar.mo96282a();
                        Looper.myLooper().quit();
                        jVar.f133986l = 5;
                        MethodCollector.m26664o(5632);
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        Object obj2 = message.obj;
                        jVar.f133976b = obj2;
                        if (obj2 != null) {
                            jVar.mo96286c();
                        }
                        MethodCollector.m26664o(5632);
                        return;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        int i3 = message.arg1;
                        int i4 = message.arg2;
                        jVar.f133985k = i3;
                        jVar.f133984j = i4;
                        if (jVar.f133980f != null) {
                            jVar.f133980f.mo96301c();
                            jVar.f133980f.mo96300a(jVar.f133985k, jVar.f133984j);
                        }
                        if (jVar.f133979e != null) {
                            jVar.f133979e.mo96301c();
                            jVar.f133979e.mo96300a(jVar.f133985k, jVar.f133984j);
                        }
                        MethodCollector.m26664o(5632);
                        return;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
            MethodCollector.m26664o(5632);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo96284a(Object obj) {
        m108123g();
        this.f133989o = new C58854d(obj);
        mo96286c();
        C58872s sVar = new C58872s(this.f133995u, this.f133985k, this.f133984j);
        this.f133981g = sVar;
        sVar.f134032c = "MusMediaRender.TexQueue";
        C58872s sVar2 = new C58872s(this.f133995u, 0, 0);
        this.f133982h = sVar2;
        sVar2.f134032c = "MusMediaRender.OESQueue";
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        MethodCollector.m26663i(4970);
        synchronized (this.f133978d) {
            try {
                this.f133978d.add((C58862k) surfaceTexture);
            } finally {
                MethodCollector.m26664o(4970);
            }
        }
        if (this.f133986l == 4) {
            Message obtainMessage = this.f133991q.obtainMessage(2);
            obtainMessage.obj = null;
            this.f133991q.sendMessage(obtainMessage);
        }
    }

    public RunnableC58860j(Object obj) {
        Float valueOf = Float.valueOf(1.0f);
        this.f133988n = new Pair<>(valueOf, valueOf);
        this.f133978d = new ArrayList();
        this.f133992r = new ArrayList();
        Thread thread = new Thread(this);
        this.f133990p = thread;
        this.f133975a = null;
        this.f133976b = obj;
        this.f133993s = false;
        this.f133986l = 3;
        thread.start();
        m108124h();
        this.f133987m = new float[16];
    }

    /* renamed from: a */
    public final void mo96283a(int i, int i2) {
        Message obtainMessage = this.f133991q.obtainMessage(10);
        obtainMessage.arg1 = i;
        obtainMessage.arg2 = i2;
        this.f133991q.sendMessage(obtainMessage);
    }
}
