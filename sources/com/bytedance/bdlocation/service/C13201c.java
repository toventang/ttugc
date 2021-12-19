package com.bytedance.bdlocation.service;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bdlocation.AbstractC13148a;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.C13167e;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p846a.C13157f;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.service.QPSController;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.bdlocation.service.c */
public final class C13201c implements C13149a.AbstractC13151a {

    /* renamed from: a */
    public final String f32246a = getClass().getSimpleName();

    /* renamed from: b */
    public BDLocation f32247b;

    /* renamed from: c */
    public C13154c f32248c;

    /* renamed from: d */
    public final Map<Integer, C13157f> f32249d;

    /* renamed from: e */
    public Handler f32250e;

    /* renamed from: f */
    public Handler f32251f;

    /* renamed from: g */
    public QPSController f32252g;

    /* renamed from: h */
    public long f32253h;

    /* renamed from: i */
    private AtomicInteger f32254i;

    /* renamed from: j */
    private final long f32255j = 1000;

    /* renamed from: k */
    private RunnableC13202a f32256k;

    static {
        Covode.recordClassIndex(15150);
    }

    /* renamed from: b */
    public final void mo21326b() {
        this.f32248c = null;
        this.f32247b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.bdlocation.service.c$a */
    public class RunnableC13202a implements Runnable {

        /* renamed from: a */
        final List<C13149a.AbstractC13151a> f32257a;

        /* renamed from: b */
        final C13156e f32258b;

        /* renamed from: d */
        private final int f32260d;

        /* renamed from: e */
        private int f32261e;

        /* renamed from: f */
        private CountDownLatch f32262f;

        static {
            Covode.recordClassIndex(15151);
        }

        /* renamed from: a */
        private BDLocation m23745a() {
            BDLocation bDLocation = C13201c.this.f32247b;
            if (bDLocation == null) {
                return null;
            }
            return new BDLocation(bDLocation);
        }

        public final void run() {
            boolean z;
            long j;
            QPSController.C13187a qps;
            C13162b.m23690d(C13201c.this.f32246a, "com.bytedance.bdlocation.service.ConnectManager.CallbackTask is executed");
            if (this.f32258b.f32081c <= 0) {
                z = true;
            } else {
                z = false;
            }
            long j2 = this.f32258b.f32083e.f32192b;
            long j3 = this.f32258b.f32080b;
            if (this.f32258b.f32081c > 0) {
                C13162b.m23690d(C13201c.this.f32246a, "com.bytedance.bdlocation.service.ConnectManager.CallbackTask.continuousLocation is executed");
                BDLocation bDLocation = C13153b.f32064w;
                BDLocation a = m23745a();
                if (bDLocation != null) {
                    m23746a(bDLocation);
                } else if (a != null) {
                    m23746a(a);
                } else if (C13201c.this.f32248c != null) {
                    m23747a(C13201c.this.f32248c);
                }
                j = this.f32258b.f32081c;
            } else {
                int i = this.f32260d;
                int i2 = this.f32261e;
                C13162b.m23690d(C13201c.this.f32246a, "com.bytedance.bdlocation.service.ConnectManager.CallbackTask.singleLocation is executed");
                BDLocation bDLocation2 = C13153b.f32064w;
                BDLocation a2 = m23745a();
                if (bDLocation2 != null) {
                    m23746a(bDLocation2);
                } else {
                    if (a2 != null) {
                        if (C13167e.m23699a(a2.getTime(), this.f32258b.f32082d) || m23748a(this.f32258b, C13201c.this.f32253h, i2, 10) || ((qps = C13201c.this.f32252g.getQPS((long) i)) != null && qps.f32201a > 1)) {
                            m23746a(a2);
                            C13162b.m23690d(C13201c.this.f32246a, "com.bytedance.bdlocation.service.ConnectManager.CallbackTask.singleLocation is executed lastLocation");
                        }
                    } else if (C13201c.this.f32248c != null && m23748a(this.f32258b, C13201c.this.f32253h, i2, 20)) {
                        m23747a(C13201c.this.f32248c);
                        C13162b.m23690d(C13201c.this.f32246a, "com.bytedance.bdlocation.service.ConnectManager.CallbackTask.singleLocation is executed mLastException");
                    }
                    j = 1000;
                }
                j = -1;
            }
            if ((C13153b.f32056o > 0 && System.currentTimeMillis() - j2 > C13153b.f32056o) || (z && System.currentTimeMillis() - j2 > j3)) {
                C13190a.m23731a().mo21312a(this.f32260d, true);
                C13154c cVar = new C13154c("Timeout.", "Unknown", "0");
                this.f32258b.f32083e.mo21290a(cVar);
                m23747a(cVar);
                CountDownLatch countDownLatch = this.f32262f;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } else if (j != -1) {
                C13201c.this.f32250e.postAtTime(this, Integer.valueOf(this.f32260d), SystemClock.uptimeMillis() + j);
                this.f32261e++;
            } else {
                C13190a.m23731a().mo21312a(this.f32260d, false);
                CountDownLatch countDownLatch2 = this.f32262f;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
            }
        }

        /* renamed from: a */
        public final void mo21327a(C13149a.AbstractC13151a aVar) {
            this.f32257a.add(aVar);
        }

        /* renamed from: a */
        private void m23746a(BDLocation bDLocation) {
            this.f32258b.f32083e.mo21289a(bDLocation);
            C13201c.this.f32251f.post(new RunnableC13203d(this, bDLocation));
        }

        /* renamed from: a */
        private void m23747a(C13154c cVar) {
            this.f32258b.f32083e.mo21290a(cVar);
            m23749b(cVar);
        }

        /* renamed from: b */
        private void m23749b(C13154c cVar) {
            C13162b.m23690d(C13201c.this.f32246a, "com.bytedance.bdlocation.service.ConnectManager.CallbackTask.downGradeLocation is executed");
            if (cVar != null) {
                C13162b.m23687b("start IP location" + cVar.getMessage());
            }
            C13201c.this.f32251f.post(new RunnableC13204e(this, AbstractC13148a.getDownGradeLocation(this.f32258b), cVar));
        }

        public RunnableC13202a(C13201c cVar, int i, C13149a.AbstractC13151a aVar, C13156e eVar) {
            this(i, aVar, eVar, (byte) 0);
        }

        /* renamed from: a */
        private static boolean m23748a(C13156e eVar, long j, int i, int i2) {
            long j2;
            long j3 = eVar.f32083e.f32192b;
            long j4 = eVar.f32080b;
            if (j4 > 0) {
                if (eVar.f32081c > 0) {
                    j2 = eVar.f32081c;
                } else {
                    j2 = 300;
                }
                if (j < j3 && ((long) i) * j2 > j4) {
                    return true;
                }
                if (j <= j3 || i <= i2 - 1) {
                    return false;
                }
                return true;
            } else if (i > i2 - 1) {
                return true;
            } else {
                return false;
            }
        }

        private RunnableC13202a(int i, C13149a.AbstractC13151a aVar, C13156e eVar, byte b) {
            this.f32260d = i;
            ArrayList arrayList = new ArrayList();
            this.f32257a = arrayList;
            arrayList.add(aVar);
            this.f32258b = eVar;
            this.f32262f = null;
        }
    }

    /* renamed from: a */
    public final boolean mo21325a() {
        if (this.f32249d.size() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.bdlocation.p846a.C13149a.AbstractC13151a
    /* renamed from: a */
    public final void mo21247a(C13154c cVar) {
        m23738a(null, cVar);
    }

    /* renamed from: a */
    public final void mo21324a(C13149a.AbstractC13151a aVar) {
        if (this.f32256k != null) {
            C13162b.m23690d("BDLocation", "ConnectManager:insertConnect is executed");
            this.f32256k.mo21327a(aVar);
        }
    }

    /* renamed from: a */
    public final int mo21323a(C13157f fVar) {
        int incrementAndGet = this.f32254i.incrementAndGet();
        this.f32249d.put(Integer.valueOf(incrementAndGet), fVar);
        this.f32252g.startLocation((long) incrementAndGet);
        C13156e eVar = fVar.f32090a;
        RunnableC13202a aVar = new RunnableC13202a(this, incrementAndGet, fVar.f32091b, eVar);
        this.f32256k = aVar;
        this.f32250e.postAtTime(aVar, Integer.valueOf(incrementAndGet), SystemClock.uptimeMillis() + eVar.f32081c);
        C13162b.m23690d("BDLocation", "ConnectManager:com.bytedance.bdlocation.service.ConnectManager.addConnect is executed");
        return incrementAndGet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0188, code lost:
        if (r0 == false) goto L_0x018c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0180  */
    @Override // com.bytedance.bdlocation.p846a.C13149a.AbstractC13151a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21246a(com.bytedance.bdlocation.BDLocation r11) {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.service.C13201c.mo21246a(com.bytedance.bdlocation.BDLocation):void");
    }

    public C13201c(QPSController qPSController, Looper looper) {
        this.f32250e = new Handler(looper);
        this.f32251f = new Handler(Looper.getMainLooper());
        this.f32249d = new ConcurrentHashMap(50);
        this.f32254i = new AtomicInteger(0);
        this.f32252g = qPSController;
    }

    /* renamed from: a */
    private void m23738a(BDLocation bDLocation, C13154c cVar) {
        MethodCollector.m26663i(2894);
        synchronized (this) {
            try {
                this.f32253h = System.currentTimeMillis();
                if (bDLocation != null) {
                    this.f32247b = bDLocation;
                    this.f32248c = null;
                } else {
                    this.f32248c = cVar;
                    this.f32247b = null;
                }
            } finally {
                MethodCollector.m26664o(2894);
            }
        }
    }
}
