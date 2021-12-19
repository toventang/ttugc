package com.bytedance.crash.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.crash.runtime.s */
public final class C14032s {

    /* renamed from: f */
    private static final AbstractC14036b<C14038d, Runnable> f34194f = new AbstractC14036b<C14038d, Runnable>() {
        /* class com.bytedance.crash.runtime.C14032s.C140331 */

        static {
            Covode.recordClassIndex(16098);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.crash.runtime.C14032s.AbstractC14036b
        /* renamed from: a */
        public final /* synthetic */ boolean mo22554a(C14038d dVar, Runnable runnable) {
            C14038d dVar2 = dVar;
            if (runnable == null) {
                if (dVar2 == null || dVar2.f34205a == null || dVar2.f34205a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (dVar2 == null || dVar2.f34205a == null || !runnable.equals(dVar2.f34205a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: g */
    private static final AbstractC14036b<Message, Runnable> f34195g = new AbstractC14036b<Message, Runnable>() {
        /* class com.bytedance.crash.runtime.C14032s.C140342 */

        static {
            Covode.recordClassIndex(16099);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.crash.runtime.C14032s.AbstractC14036b
        /* renamed from: a */
        public final /* synthetic */ boolean mo22554a(Message message, Runnable runnable) {
            Message message2 = message;
            if (runnable == null) {
                if (message2 == null || message2.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (message2 == null || !runnable.equals(message2.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: a */
    public final HandlerThread f34196a;

    /* renamed from: b */
    public final Queue<C14038d> f34197b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final Queue<Message> f34198c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public volatile Handler f34199d;

    /* renamed from: e */
    public final Object f34200e = new Object();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.s$b */
    public interface AbstractC14036b<A, B> {
        static {
            Covode.recordClassIndex(16101);
        }

        /* renamed from: a */
        boolean mo22554a(A a, B b);
    }

    static {
        Covode.recordClassIndex(16097);
    }

    /* renamed from: com.bytedance.crash.runtime.s$a */
    class RunnableC14035a implements Runnable {
        static {
            Covode.recordClassIndex(16100);
        }

        public final void run() {
            while (!C14032s.this.f34198c.isEmpty()) {
                if (C14032s.this.f34199d != null) {
                    try {
                        C14032s.this.f34199d.sendMessageAtFrontOfQueue(C14032s.this.f34198c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!C14032s.this.f34197b.isEmpty()) {
                C14038d poll = C14032s.this.f34197b.poll();
                if (C14032s.this.f34199d != null) {
                    try {
                        C14032s.this.f34199d.sendMessageAtTime(poll.f34205a, poll.f34206b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }

        RunnableC14035a() {
        }
    }

    /* renamed from: com.bytedance.crash.runtime.s$c */
    class HandlerThreadC14037c extends HandlerThread {

        /* renamed from: a */
        volatile int f34202a;

        /* renamed from: b */
        volatile boolean f34203b;

        static {
            Covode.recordClassIndex(16102);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|22|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            com.bytedance.crash.p924b.C13839h.m24996a(com.bytedance.crash.C13933m.f33936a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            if (r4.f34202a < 5) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
            com.bytedance.crash.C13849d.m25014a("NPTH_CATCH", r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
            r4.f34202a++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            if (r4.f34203b == false) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
            r4.f34203b = true;
            com.bytedance.crash.C13849d.m25014a("NPTH_ERR_MAX", new java.lang.RuntimeException());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:21:0x0025, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLooperPrepared() {
            /*
                r4 = this;
                r3 = 3258(0xcba, float:4.565E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                super.onLooperPrepared()
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.C14032s.this
                java.lang.Object r2 = r0.f34200e
                monitor-enter(r2)
                com.bytedance.crash.runtime.s r1 = com.bytedance.crash.runtime.C14032s.this     // Catch:{ all -> 0x0051 }
                android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0051 }
                r0.<init>()     // Catch:{ all -> 0x0051 }
                r1.f34199d = r0     // Catch:{ all -> 0x0051 }
                monitor-exit(r2)     // Catch:{ all -> 0x0051 }
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.C14032s.this
                android.os.Handler r2 = r0.f34199d
                com.bytedance.crash.runtime.s$a r1 = new com.bytedance.crash.runtime.s$a
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.C14032s.this
                r1.<init>()
                r2.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0029 }
                goto L_0x0025
            L_0x0029:
                r3 = move-exception
                android.content.Context r0 = com.bytedance.crash.C13933m.f33936a     // Catch:{ all -> 0x0025 }
                com.bytedance.crash.p924b.C13839h.m24996a(r0)     // Catch:{ all -> 0x0025 }
                int r1 = r4.f34202a     // Catch:{ all -> 0x0025 }
                r0 = 5
                r2 = 1
                if (r1 >= r0) goto L_0x0040
                java.lang.String r0 = "NPTH_CATCH"
                com.bytedance.crash.C13849d.m25014a(r0, r3)     // Catch:{ all -> 0x0025 }
            L_0x003a:
                int r0 = r4.f34202a     // Catch:{ all -> 0x0025 }
                int r0 = r0 + r2
                r4.f34202a = r0     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0040:
                boolean r0 = r4.f34203b     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x003a
                r4.f34203b = r2     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "NPTH_ERR_MAX"
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
                r0.<init>()     // Catch:{ all -> 0x0025 }
                com.bytedance.crash.C13849d.m25014a(r1, r0)     // Catch:{ all -> 0x0025 }
                goto L_0x003a
            L_0x0051:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.C14032s.HandlerThreadC14037c.onLooperPrepared():void");
        }

        HandlerThreadC14037c(String str) {
            super(str);
        }
    }

    /* renamed from: c */
    private Message m25451c(Runnable runnable) {
        return Message.obtain(this.f34199d, runnable);
    }

    /* renamed from: a */
    public final boolean mo22551a(Runnable runnable) {
        return m25448a(m25451c(runnable), 0);
    }

    public C14032s(String str) {
        this.f34196a = new HandlerThreadC14037c(str);
    }

    /* renamed from: b */
    public final void mo22553b(Runnable runnable) {
        if (!this.f34197b.isEmpty() || !this.f34198c.isEmpty()) {
            m25449a(this.f34197b, runnable, f34194f);
            m25449a(this.f34198c, runnable, f34195g);
        }
        if (this.f34199d != null) {
            this.f34199d.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.s$d */
    public static class C14038d {

        /* renamed from: a */
        Message f34205a;

        /* renamed from: b */
        long f34206b;

        static {
            Covode.recordClassIndex(16103);
        }

        C14038d(Message message, long j) {
            this.f34205a = message;
            this.f34206b = j;
        }
    }

    /* renamed from: a */
    private boolean m25448a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m25450b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m25450b(Message message, long j) {
        MethodCollector.m26663i(918);
        if (this.f34199d == null) {
            synchronized (this.f34200e) {
                try {
                    if (this.f34199d == null) {
                        this.f34197b.add(new C14038d(message, j));
                        return true;
                    }
                } finally {
                    MethodCollector.m26664o(918);
                }
            }
        }
        try {
            boolean sendMessageAtTime = this.f34199d.sendMessageAtTime(message, j);
            MethodCollector.m26664o(918);
            return sendMessageAtTime;
        } catch (Throwable unused) {
            MethodCollector.m26664o(918);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo22552a(Runnable runnable, long j) {
        return m25448a(m25451c(runnable), j);
    }

    /* renamed from: a */
    private static <L, O> boolean m25449a(Collection<L> collection, O o, AbstractC14036b<? super L, O> bVar) {
        boolean z = false;
        if (!(collection == null || collection.isEmpty() || bVar == null)) {
            try {
                Iterator<L> it = collection.iterator();
                while (it.hasNext()) {
                    if (bVar.mo22554a(it.next(), o)) {
                        it.remove();
                        z = true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }
}
