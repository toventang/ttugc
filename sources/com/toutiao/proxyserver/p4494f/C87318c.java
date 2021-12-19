package com.toutiao.proxyserver.p4494f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.p4494f.C87314a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.toutiao.proxyserver.f.c */
public final class C87318c {

    /* renamed from: b */
    public static final AbstractC87324g f197917b = new C87323f();

    /* renamed from: c */
    public static long f197918c = 1000;

    /* renamed from: i */
    private static long f197919i = -1;

    /* renamed from: a */
    public AbstractC87324g f197920a;

    /* renamed from: d */
    private final C87314a f197921d;

    /* renamed from: e */
    private AtomicInteger f197922e;

    /* renamed from: f */
    private HandlerC87320b f197923f;

    /* renamed from: g */
    private HandlerThread f197924g;

    /* renamed from: h */
    private long f197925h;

    /* renamed from: com.toutiao.proxyserver.f.c$a */
    public static class C87319a {

        /* renamed from: a */
        public static final C87318c f197926a = new C87318c(C87314a.C87316a.f197915a, (byte) 0);

        static {
            Covode.recordClassIndex(103215);
        }
    }

    static {
        Covode.recordClassIndex(103214);
    }

    /* renamed from: a */
    public final void mo141349a() {
        if (this.f197922e.getAndIncrement() == 0) {
            this.f197923f.sendEmptyMessage(1);
            this.f197925h = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo141350b() {
        if (this.f197922e.decrementAndGet() == 0) {
            this.f197923f.removeMessages(1);
            mo141351c();
            f197919i = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo141351c() {
        MethodCollector.m26663i(13514);
        AbstractC87324g gVar = this.f197920a;
        if (gVar == null) {
            MethodCollector.m26664o(13514);
            return;
        }
        long a = gVar.mo141353a();
        long j = f197919i;
        long j2 = a - j;
        if (j >= 0) {
            synchronized (this) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f197921d.mo141348a(j2, elapsedRealtime - this.f197925h);
                    this.f197925h = elapsedRealtime;
                } catch (Throwable th) {
                    MethodCollector.m26664o(13514);
                    throw th;
                }
            }
        }
        f197919i = a;
        MethodCollector.m26664o(13514);
    }

    /* renamed from: com.toutiao.proxyserver.f.c$b */
    class HandlerC87320b extends Handler {
        static {
            Covode.recordClassIndex(103216);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C87318c.this.mo141351c();
                sendEmptyMessageDelayed(1, C87318c.f197918c);
                return;
            }
            throw new IllegalArgumentException("Unknown what=" + message.what);
        }

        public HandlerC87320b(Looper looper) {
            super(looper);
        }
    }

    private C87318c(C87314a aVar) {
        this.f197920a = f197917b;
        this.f197921d = aVar;
        this.f197922e = new AtomicInteger();
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        this.f197924g = handlerThread;
        handlerThread.start();
        this.f197923f = new HandlerC87320b(this.f197924g.getLooper());
    }

    /* synthetic */ C87318c(C87314a aVar, byte b) {
        this(aVar);
    }
}
