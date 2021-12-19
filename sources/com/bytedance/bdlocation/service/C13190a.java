package com.bytedance.bdlocation.service;

import android.content.Context;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.bdlocation.AbstractC13148a;
import com.bytedance.bdlocation.AbstractC13160c;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.C13167e;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p846a.C13157f;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p853f.C13183a;
import com.bytedance.bdlocation.p853f.C13184b;
import com.bytedance.bdlocation.utils.C13227a;
import com.bytedance.bdlocation.utils.C13234f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.bdlocation.service.a */
public class C13190a {

    /* renamed from: e */
    private static volatile C13190a f32205e;

    /* renamed from: a */
    public C13183a f32206a;

    /* renamed from: b */
    public C13201c f32207b;

    /* renamed from: c */
    public C13205f f32208c;

    /* renamed from: d */
    public AbstractC13160c f32209d;

    static {
        Covode.recordClassIndex(15139);
    }

    /* renamed from: a */
    public static C13190a m23731a() {
        MethodCollector.m26663i(2995);
        if (f32205e == null) {
            synchronized (C13190a.class) {
                try {
                    if (f32205e == null) {
                        f32205e = new C13190a(C13153b.f32063v);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2995);
                    throw th;
                }
            }
        }
        C13190a aVar = f32205e;
        MethodCollector.m26664o(2995);
        return aVar;
    }

    /* renamed from: a */
    public static BDLocation m23730a(BDLocation bDLocation) {
        try {
            return AbstractC13148a.getGeocodeResult(bDLocation);
        } catch (Exception unused) {
            C13162b.m23690d("BDRegionLocation geocode: Exception", "BDLocationService--geocode");
            return null;
        }
    }

    private C13190a(Context context) {
        C13162b.m23687b("init BDLocationService");
        this.f32206a = new C13183a(context);
        QPSController qPSController = new QPSController();
        if (C13234f.f32341b == null) {
            HandlerThread handlerThread = new HandlerThread("LocationConnectWorker");
            C13234f.f32341b = handlerThread;
            handlerThread.start();
        }
        this.f32207b = new C13201c(qPSController, C13234f.f32341b.getLooper());
        this.f32209d = new SystemBaseLocationImpl(context, qPSController);
        AbstractC13160c cVar = this.f32209d;
        if (C13234f.f32340a == null) {
            HandlerThread handlerThread2 = new HandlerThread("LocationScheduleWorker");
            C13234f.f32340a = handlerThread2;
            handlerThread2.start();
        }
        C13205f fVar = new C13205f(context, cVar, C13234f.f32340a.getLooper());
        this.f32208c = fVar;
        fVar.f32271d = new C13210j(this.f32207b, fVar.f32268a, fVar);
    }

    /* renamed from: a */
    public final BDLocation mo21311a(C13156e eVar) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final BDLocation[] bDLocationArr = new BDLocation[1];
        final C13154c[] cVarArr = new C13154c[1];
        C131999 r6 = new C13149a.AbstractC13151a() {
            /* class com.bytedance.bdlocation.service.C13190a.C131999 */

            static {
                Covode.recordClassIndex(15148);
            }

            @Override // com.bytedance.bdlocation.p846a.C13149a.AbstractC13151a
            /* renamed from: a */
            public final void mo21246a(BDLocation bDLocation) {
                bDLocationArr[0] = bDLocation;
                countDownLatch.countDown();
            }

            @Override // com.bytedance.bdlocation.p846a.C13149a.AbstractC13151a
            /* renamed from: a */
            public final void mo21247a(C13154c cVar) {
                cVarArr[0] = cVar;
                countDownLatch.countDown();
            }
        };
        C13153b.m23670a();
        eVar.f32083e.mo21288a();
        if (C13153b.f32065x.f32339b) {
            C13154c cVar = new C13154c("No positioning in the background", "Unknown", "36");
            eVar.f32083e.mo21290a(cVar);
            eVar.f32083e.mo21291b();
            r6.mo21247a(cVar);
        } else if (!C13182f.m23709a()) {
            C13154c cVar2 = new C13154c("No Location Permission", "Unknown", "30");
            eVar.f32083e.mo21290a(cVar2);
            eVar.f32083e.mo21291b();
            r6.mo21247a(cVar2);
        } else if (!C13182f.m23712b()) {
            C13154c cVar3 = new C13154c("Device did not enable location service", "Unknown", "1");
            eVar.f32083e.mo21290a(cVar3);
            eVar.f32083e.mo21291b();
            r6.mo21247a(cVar3);
        } else {
            C13227a.f32333a.f32334b.execute(new RunnableC13200b(this, eVar, r6));
        }
        try {
            countDownLatch.await(eVar.f32080b, TimeUnit.MILLISECONDS);
            if (cVarArr[0] == null) {
                return bDLocationArr[0];
            }
            throw cVarArr[0];
        } catch (InterruptedException e) {
            throw new C13154c(e, "Android", "0");
        }
    }

    /* renamed from: b */
    public final BDLocation mo21313b(C13156e eVar) {
        BDLocation bDLocation;
        if (eVar.f32082d > 0 && eVar.f32081c == 0) {
            BDLocation bDLocation2 = C13153b.f32064w;
            if (bDLocation2 != null) {
                return bDLocation2;
            }
            C13184b a = this.f32206a.mo21282a();
            if (!(a == null || (bDLocation = a.f32190c) == null || C13167e.m23700a(bDLocation))) {
                if ((eVar.f32084f != 0 && TextUtils.isEmpty(bDLocation.f32008a) && TextUtils.isEmpty(bDLocation.f32009b) && TextUtils.isEmpty(bDLocation.f32010c) && TextUtils.isEmpty(bDLocation.f32011d) && TextUtils.isEmpty(bDLocation.f32012e) && TextUtils.isEmpty(bDLocation.f32013f)) || !C13167e.m23699a(bDLocation.f31991C, eVar.f32082d)) {
                    return null;
                }
                bDLocation.f31994F = true;
                C13162b.m23683a("LocationCache: cache is " + bDLocation.toString());
                return bDLocation;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m23732a(C13149a.AbstractC13152b bVar, int i) {
        if (bVar != null) {
            bVar.mo21245a(i);
        }
    }

    /* renamed from: a */
    public static BDLocation m23729a(double d, double d2) {
        BDLocation bDLocation = new BDLocation("");
        bDLocation.setLatitude(d);
        bDLocation.setLongitude(d2);
        try {
            return AbstractC13148a.getGeocodeResult(bDLocation);
        } catch (Exception unused) {
            C13162b.m23690d("BDRegionLocation geocode: Exception", "BDLocationService--geocode");
            return null;
        }
    }

    /* renamed from: a */
    public final void mo21312a(final int i, final boolean z) {
        if (i != -1) {
            C13227a.f32333a.f32335c.execute(new Runnable() {
                /* class com.bytedance.bdlocation.service.C13190a.RunnableC131988 */

                static {
                    Covode.recordClassIndex(15147);
                }

                public final void run() {
                    C13201c cVar = C13190a.this.f32207b;
                    int i = i;
                    cVar.f32250e.removeCallbacksAndMessages(Integer.valueOf(i));
                    cVar.f32252g.stopLocation((long) i);
                    C13157f fVar = cVar.f32249d.get(Integer.valueOf(i));
                    if (fVar != null) {
                        cVar.f32249d.remove(Integer.valueOf(i));
                        C13156e eVar = fVar.f32090a;
                        C13162b.m23688b("BDLocation", eVar.toString());
                        eVar.f32083e.mo21292c();
                    }
                    if (!C13190a.this.f32207b.mo21325a()) {
                        C13190a.this.f32208c.mo21332a(z);
                    }
                    C13162b.m23687b("stopLocation :" + i);
                }
            });
        }
    }
}
