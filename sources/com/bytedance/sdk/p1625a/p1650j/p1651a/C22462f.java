package com.bytedance.sdk.p1625a.p1650j.p1651a;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1650j.p1651a.AbstractC22460e;
import java.lang.Thread;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.a.j.a.f */
public class C22462f {

    /* renamed from: a */
    private static AtomicInteger f53102a = new AtomicInteger();

    /* renamed from: c */
    private static volatile C22462f f53103c;

    /* renamed from: d */
    private static volatile boolean f53104d = true;

    /* renamed from: b */
    private volatile boolean f53105b;

    /* renamed from: e */
    private int f53106e;

    /* renamed from: f */
    private int f53107f;

    /* renamed from: g */
    private final PriorityBlockingQueue<AbstractC22460e> f53108g;

    /* renamed from: h */
    private final PriorityBlockingQueue<AbstractC22460e> f53109h;

    /* renamed from: i */
    private final PriorityBlockingQueue<AbstractC22460e> f53110i;

    /* renamed from: j */
    private C22456a[] f53111j;

    /* renamed from: k */
    private C22459d[] f53112k;

    /* renamed from: l */
    private C22457b f53113l;

    /* renamed from: m */
    private volatile long f53114m;

    /* renamed from: n */
    private volatile long f53115n;

    /* renamed from: o */
    private volatile long f53116o;

    /* renamed from: p */
    private volatile long f53117p;

    public C22462f() {
        this(4, true);
    }

    static {
        Covode.recordClassIndex(26278);
    }

    /* renamed from: a */
    public static C22462f m42397a() {
        MethodCollector.m26663i(405);
        if (f53103c == null) {
            synchronized (C22462f.class) {
                try {
                    if (f53103c == null) {
                        f53103c = new C22462f((byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(405);
                    throw th;
                }
            }
        }
        C22462f fVar = f53103c;
        MethodCollector.m26664o(405);
        return fVar;
    }

    /* renamed from: f */
    private synchronized void m42398f() {
        MethodCollector.m26663i(430);
        m42399g();
        C22457b bVar = new C22457b(this.f53108g, this.f53109h);
        this.f53113l = bVar;
        bVar.start();
        for (int i = 0; i < this.f53106e; i++) {
            C22456a aVar = new C22456a(this.f53109h, "Account-ApiDispatcher-Thread", "ApiDispatcher");
            this.f53111j[i] = aVar;
            aVar.start();
        }
        if (this.f53112k != null) {
            for (int i2 = 0; i2 < this.f53107f; i2++) {
                C22459d dVar = new C22459d(this.f53110i, "Account-DownloadDispatcher-Thread", "DownloadDispatcher");
                this.f53112k[i2] = dVar;
                dVar.start();
            }
        }
        this.f53105b = true;
        MethodCollector.m26664o(430);
    }

    /* renamed from: g */
    private synchronized void m42399g() {
        MethodCollector.m26663i(435);
        int i = 0;
        this.f53105b = false;
        C22457b bVar = this.f53113l;
        if (bVar != null) {
            bVar.f53091a = true;
            bVar.interrupt();
        }
        int i2 = 0;
        while (true) {
            C22456a[] aVarArr = this.f53111j;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (aVarArr[i2] != null) {
                aVarArr[i2].mo36740a();
                this.f53111j[i2] = null;
            }
            i2++;
        }
        if (this.f53112k != null) {
            while (true) {
                C22459d[] dVarArr = this.f53112k;
                if (i >= dVarArr.length) {
                    break;
                }
                if (dVarArr[i] != null) {
                    dVarArr[i].mo36740a();
                    this.f53112k[i] = null;
                }
                i++;
            }
        }
        MethodCollector.m26664o(435);
    }

    /* renamed from: b */
    public final synchronized void mo36756b() {
        MethodCollector.m26663i(439);
        try {
            if (!f53104d) {
                MethodCollector.m26664o(439);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f53114m > currentTimeMillis) {
                this.f53114m = currentTimeMillis;
            }
            if (currentTimeMillis - this.f53114m <= 1000) {
                MethodCollector.m26664o(439);
                return;
            }
            this.f53114m = currentTimeMillis;
            int i = 0;
            int i2 = 0;
            while (true) {
                C22456a[] aVarArr = this.f53111j;
                if (i >= aVarArr.length) {
                    break;
                }
                if (aVarArr[i] == null) {
                    i2++;
                    if (i2 > this.f53106e) {
                        break;
                    }
                    C22456a aVar = new C22456a(this.f53109h, "Account-ApiDispatcher-Thread", "ApiDispatcher");
                    this.f53111j[i] = aVar;
                    aVar.start();
                }
                i++;
            }
            MethodCollector.m26664o(439);
        } catch (Throwable unused) {
            MethodCollector.m26664o(439);
        }
    }

    /* renamed from: c */
    public final synchronized void mo36757c() {
        MethodCollector.m26663i(441);
        try {
            if (!f53104d) {
                MethodCollector.m26664o(441);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f53115n > currentTimeMillis) {
                this.f53115n = currentTimeMillis;
            }
            if (currentTimeMillis - this.f53115n <= 1000) {
                MethodCollector.m26664o(441);
                return;
            }
            this.f53115n = currentTimeMillis;
            if (this.f53112k == null) {
                MethodCollector.m26664o(441);
                return;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                C22459d[] dVarArr = this.f53112k;
                if (i >= dVarArr.length) {
                    break;
                }
                if (dVarArr[i] == null) {
                    i2++;
                    if (i2 > this.f53107f) {
                        break;
                    }
                    C22459d dVar = new C22459d(this.f53110i, "Account-DownloadDispatcher-Thread", "DownloadDispatcher");
                    this.f53112k[i] = dVar;
                    dVar.start();
                }
                i++;
            }
            MethodCollector.m26664o(441);
        } catch (Throwable unused) {
            MethodCollector.m26664o(441);
        }
    }

    /* renamed from: d */
    public final synchronized void mo36758d() {
        MethodCollector.m26663i(457);
        try {
            if (!f53104d) {
                MethodCollector.m26664o(457);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f53116o > currentTimeMillis) {
                this.f53116o = currentTimeMillis;
            }
            if (currentTimeMillis - this.f53116o <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                MethodCollector.m26664o(457);
                return;
            }
            boolean z = true;
            boolean z2 = true;
            for (int length = this.f53111j.length - 1; length >= this.f53106e; length--) {
                C22456a aVar = this.f53111j[length];
                if (aVar != null) {
                    if (aVar.mo36742b()) {
                        z = false;
                    }
                    z2 = false;
                }
            }
            this.f53116o = currentTimeMillis;
            if (!z || z2) {
                MethodCollector.m26664o(457);
                return;
            }
            for (int length2 = this.f53111j.length - 1; length2 >= this.f53106e; length2--) {
                try {
                    C22456a aVar2 = this.f53111j[length2];
                    if (!(aVar2 == null || aVar2.getState() == Thread.State.RUNNABLE || aVar2.mo36742b())) {
                        aVar2.mo36740a();
                        this.f53111j[length2] = null;
                    }
                } catch (Throwable unused) {
                }
            }
            MethodCollector.m26664o(457);
        } catch (Throwable unused2) {
            MethodCollector.m26664o(457);
        }
    }

    /* renamed from: e */
    public final synchronized void mo36759e() {
        MethodCollector.m26663i(467);
        try {
            if (!f53104d) {
                MethodCollector.m26664o(467);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f53117p > currentTimeMillis) {
                this.f53117p = currentTimeMillis;
            }
            if (currentTimeMillis - this.f53117p <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                MethodCollector.m26664o(467);
                return;
            }
            C22459d[] dVarArr = this.f53112k;
            if (dVarArr == null) {
                MethodCollector.m26664o(467);
                return;
            }
            boolean z = true;
            boolean z2 = true;
            for (int length = dVarArr.length - 1; length >= this.f53107f; length--) {
                C22459d dVar = this.f53112k[length];
                if (dVar != null) {
                    if (dVar.mo36742b()) {
                        z = false;
                    }
                    z2 = false;
                }
            }
            this.f53117p = currentTimeMillis;
            if (!z || z2) {
                MethodCollector.m26664o(467);
                return;
            }
            for (int length2 = this.f53112k.length - 1; length2 >= this.f53107f; length2--) {
                try {
                    C22459d dVar2 = this.f53112k[length2];
                    if (!(dVar2 == null || dVar2.getState() == Thread.State.RUNNABLE || dVar2.mo36742b())) {
                        dVar2.mo36740a();
                        this.f53112k[length2] = null;
                    }
                } catch (Throwable unused) {
                }
            }
            MethodCollector.m26664o(467);
        } catch (Throwable unused2) {
            MethodCollector.m26664o(467);
        }
    }

    private C22462f(byte b) {
        this(0, false);
    }

    /* renamed from: a */
    public final synchronized void mo36755a(AbstractRunnableC22458c cVar) {
        MethodCollector.m26663i(413);
        cVar.f53098d = f53102a.incrementAndGet();
        if (!this.f53105b) {
            m42398f();
        }
        if (cVar.mo36751d() == AbstractC22460e.EnumC22461a.IMMEDIATE) {
            RunnableC13596e.m24423a(cVar);
            MethodCollector.m26664o(413);
            return;
        }
        cVar.mo36753f();
        this.f53109h.add(cVar);
        MethodCollector.m26664o(413);
    }

    private C22462f(int i, boolean z) {
        this.f53108g = new PriorityBlockingQueue<>();
        this.f53109h = new PriorityBlockingQueue<>();
        this.f53110i = new PriorityBlockingQueue<>();
        this.f53114m = 0;
        this.f53115n = 0;
        this.f53116o = 0;
        this.f53117p = 0;
        this.f53106e = 4;
        this.f53111j = new C22456a[16];
        if (z) {
            this.f53107f = i;
            this.f53112k = new C22459d[(i * 4)];
        }
    }
}
