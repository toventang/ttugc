package com.bytedance.frameworks.baselib.network.p979a;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.p979a.C14588c;
import com.bytedance.platform.p1572b.C21668d;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.a.e */
public class C14592e {

    /* renamed from: g */
    private static long f35270g = -1;

    /* renamed from: a */
    private final C14588c f35271a;

    /* renamed from: b */
    private AtomicInteger f35272b;

    /* renamed from: c */
    private HandlerC14594b f35273c;

    /* renamed from: d */
    private HandlerThread f35274d;

    /* renamed from: e */
    private boolean f35275e;

    /* renamed from: f */
    private long f35276f;

    /* renamed from: com.bytedance.frameworks.baselib.network.a.e$a */
    public static class C14593a {

        /* renamed from: a */
        public static final C14592e f35277a = new C14592e(C14588c.C14589a.f35268a);

        static {
            Covode.recordClassIndex(16684);
        }
    }

    static {
        Covode.recordClassIndex(16683);
    }

    /* renamed from: a */
    public final void mo23466a() {
        try {
            if (!this.f35275e && this.f35272b.getAndIncrement() == 0) {
                Logger.debug();
                this.f35273c.sendEmptyMessage(1);
                this.f35276f = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo23467b() {
        try {
            if (!this.f35275e && this.f35272b.decrementAndGet() == 0) {
                Logger.debug();
                this.f35273c.removeMessages(1);
                mo23468c();
                f35270g = -1;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo23468c() {
        MethodCollector.m26663i(11603);
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j = f35270g;
            long j2 = totalRxBytes - j;
            if (j >= 0) {
                synchronized (this) {
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        this.f35271a.mo23463a(j2, elapsedRealtime - this.f35276f);
                        this.f35276f = elapsedRealtime;
                    } catch (Throwable th) {
                        MethodCollector.m26664o(11603);
                        throw th;
                    }
                }
            }
            f35270g = totalRxBytes;
            MethodCollector.m26664o(11603);
        } catch (Throwable unused) {
            MethodCollector.m26664o(11603);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.a.e$b */
    public class HandlerC14594b extends Handler {
        static {
            Covode.recordClassIndex(16685);
        }

        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    C14592e.this.mo23468c();
                    sendEmptyMessageDelayed(1, 1000);
                }
            } catch (Throwable unused) {
            }
        }

        public HandlerC14594b(Looper looper) {
            super(looper);
        }
    }

    protected C14592e(C14588c cVar) {
        this.f35271a = cVar;
        try {
            this.f35272b = new AtomicInteger();
            HandlerThread a = C21668d.m40613a("ParseThread");
            this.f35274d = a;
            a.start();
            this.f35273c = new HandlerC14594b(this.f35274d.getLooper());
        } catch (Throwable unused) {
            this.f35275e = true;
        }
    }
}
