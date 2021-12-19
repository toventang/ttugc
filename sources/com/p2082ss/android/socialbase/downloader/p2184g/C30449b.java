package com.p2082ss.android.socialbase.downloader.p2184g;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2184g.C30464k;
import com.p2082ss.android.socialbase.downloader.p2188j.C30519e;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.g.b */
public class C30449b {

    /* renamed from: a */
    public static final String f72582a = C30449b.class.getSimpleName();

    /* renamed from: d */
    public static volatile boolean f72583d;

    /* renamed from: g */
    private static long f72584g = -1;

    /* renamed from: h */
    private static volatile C30449b f72585h = null;

    /* renamed from: b */
    public final AtomicInteger f72586b = new AtomicInteger();

    /* renamed from: c */
    public final HandlerC30450a f72587c = new HandlerC30450a(C30519e.C30520a.f72818a);

    /* renamed from: e */
    public long f72588e;

    /* renamed from: f */
    private final C30464k f72589f = C30464k.C30466a.f72617a;

    /* renamed from: c */
    public static void m62059c() {
        f72583d = C30535g.m62561a(C30399c.m61674B());
    }

    static {
        Covode.recordClassIndex(36976);
    }

    private C30449b() {
    }

    /* renamed from: a */
    public static C30449b m62058a() {
        MethodCollector.m26663i(7010);
        if (f72585h == null) {
            synchronized (C30449b.class) {
                try {
                    if (f72585h == null) {
                        f72585h = new C30449b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7010);
                    throw th;
                }
            }
        }
        C30449b bVar = f72585h;
        MethodCollector.m26664o(7010);
        return bVar;
    }

    /* renamed from: b */
    public final void mo54241b() {
        try {
            C30434a.m62028c(f72582a, "stopSampling: mSamplingCounter = " + this.f72586b);
            if (this.f72586b.decrementAndGet() == 0) {
                this.f72587c.removeMessages(1);
                mo54242d();
                f72584g = -1;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54242d() {
        long mobileRxBytes;
        MethodCollector.m26663i(7170);
        try {
            m62059c();
            if (f72583d) {
                mobileRxBytes = TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
            } else {
                mobileRxBytes = TrafficStats.getMobileRxBytes();
            }
            long j = f72584g;
            long j2 = mobileRxBytes - j;
            if (j >= 0) {
                synchronized (this) {
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f72589f.mo54252a(j2, uptimeMillis - this.f72588e);
                        this.f72588e = uptimeMillis;
                    } catch (Throwable th) {
                        MethodCollector.m26664o(7170);
                        throw th;
                    }
                }
            }
            f72584g = mobileRxBytes;
            MethodCollector.m26664o(7170);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(7170);
        }
    }

    /* renamed from: com.ss.android.socialbase.downloader.g.b$a */
    public class HandlerC30450a extends Handler {
        static {
            Covode.recordClassIndex(36977);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C30449b.this.mo54242d();
                sendEmptyMessageDelayed(1, 1000);
            }
        }

        public HandlerC30450a(Looper looper) {
            super(looper);
        }
    }
}
