package com.p2082ss.android.p2133d;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.d.g */
public final class C29859g implements WeakHandler.IHandler {

    /* renamed from: a */
    public static C29859g f71219a = new C29859g();

    /* renamed from: c */
    public static final AtomicLong f71220c = new AtomicLong();

    /* renamed from: b */
    public long f71221b;

    /* renamed from: d */
    final Object f71222d = new Object();

    /* renamed from: e */
    int f71223e = 0;

    /* renamed from: f */
    int f71224f = 0;

    /* renamed from: g */
    WeakReference<C29847a> f71225g;

    /* renamed from: h */
    public final AtomicLong f71226h = new AtomicLong(0);

    /* renamed from: i */
    public boolean f71227i = false;

    /* renamed from: j */
    public WeakHandler f71228j = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: k */
    final C13605d<Object> f71229k = new C13605d<>();

    /* renamed from: l */
    public final Runnable f71230l = new Runnable() {
        /* class com.p2082ss.android.p2133d.C29859g.RunnableC298601 */

        static {
            Covode.recordClassIndex(36268);
        }

        public final void run() {
            C29847a aVar;
            MethodCollector.m26663i(13573);
            C29859g gVar = C29859g.this;
            gVar.f71226h.get();
            C29859g.f71220c.get();
            Iterator<Object> it = gVar.f71229k.iterator();
            while (it.hasNext()) {
                it.next();
            }
            synchronized (gVar.f71222d) {
                try {
                    if (gVar.f71223e != gVar.f71224f) {
                        gVar.f71224f = gVar.f71223e;
                        if (gVar.f71225g != null && (aVar = gVar.f71225g.get()) != null) {
                            new C29861a(aVar).start();
                        } else {
                            return;
                        }
                    }
                    MethodCollector.m26664o(13573);
                } finally {
                    MethodCollector.m26664o(13573);
                }
            }
        }
    };

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    static {
        Covode.recordClassIndex(36267);
    }

    /* renamed from: com.ss.android.d.g$a */
    class C29861a extends Thread {

        /* renamed from: a */
        final C29847a f71232a;

        static {
            Covode.recordClassIndex(36269);
        }

        public final void run() {
            System.currentTimeMillis();
            long d = C29847a.m60153d();
            System.currentTimeMillis();
            C29859g.this.f71227i = true;
            C29859g.this.f71226h.set(d);
            C29859g.f71220c.set(0);
            C29859g.this.f71228j.post(C29859g.this.f71230l);
        }

        public C29861a(C29847a aVar) {
            super("CacheSizeThread");
            this.f71232a = aVar;
        }
    }

    private C29859g() {
    }

    /* renamed from: a */
    public final int mo52142a(C29847a aVar) {
        int i;
        MethodCollector.m26663i(13630);
        boolean z = false;
        if (aVar == null) {
            MethodCollector.m26664o(13630);
            return 0;
        }
        synchronized (this.f71222d) {
            try {
                int i2 = this.f71223e;
                if (i2 > this.f71224f) {
                    z = true;
                }
                this.f71223e = i2 + 1;
                this.f71225g = new WeakReference<>(aVar);
                if (!z) {
                    this.f71224f = this.f71223e;
                    new C29861a(aVar).start();
                }
                i = this.f71223e;
            } finally {
                MethodCollector.m26664o(13630);
            }
        }
        return i;
    }
}
