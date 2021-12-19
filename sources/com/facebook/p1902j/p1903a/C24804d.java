package com.facebook.p1902j.p1903a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.p1902j.p1903a.C24801b;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.j.a.d */
public final class C24804d {

    /* renamed from: a */
    public final C24801b f58852a;

    /* renamed from: b */
    public long f58853b;

    /* renamed from: c */
    private AtomicInteger f58854c;

    /* renamed from: d */
    private Handler f58855d;

    /* renamed from: e */
    private HandlerThread f58856e;

    static {
        Covode.recordClassIndex(28957);
    }

    /* renamed from: com.facebook.j.a.d$a */
    public static class C24805a {

        /* renamed from: a */
        public static final C24804d f58857a = new C24804d(C24801b.C24802a.f58850a, (byte) 0);

        static {
            Covode.recordClassIndex(28958);
        }
    }

    /* renamed from: b */
    public final void mo40618b() {
        if (this.f58854c.decrementAndGet() == 0) {
            this.f58855d.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public final void mo40617a() {
        if (this.f58854c.getAndIncrement() == 0) {
            this.f58855d.sendEmptyMessage(1);
            this.f58853b = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: com.facebook.j.a.d$b */
    class HandlerC24806b extends Handler {
        static {
            Covode.recordClassIndex(28959);
        }

        /* renamed from: a */
        private void m47523a() {
            MethodCollector.m26663i(126);
            long a = C24809g.m47526a().mo40622a(Process.myUid());
            synchronized (this) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (a != -1) {
                        C24804d.this.f58852a.mo40615a(a, elapsedRealtime - C24804d.this.f58853b);
                    }
                    C24804d.this.f58853b = elapsedRealtime;
                } finally {
                    MethodCollector.m26664o(126);
                }
            }
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                m47523a();
                sendEmptyMessageDelayed(1, 1000);
            } else if (i == 2) {
                m47523a();
                removeMessages(1);
            } else {
                throw new IllegalArgumentException("Unknown what=" + message.what);
            }
        }

        public HandlerC24806b(Looper looper) {
            super(looper);
        }
    }

    private C24804d(C24801b bVar) {
        this.f58852a = bVar;
        this.f58854c = new AtomicInteger();
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        this.f58856e = handlerThread;
        handlerThread.start();
        this.f58855d = new HandlerC24806b(this.f58856e.getLooper());
    }

    /* synthetic */ C24804d(C24801b bVar, byte b) {
        this(bVar);
    }
}
