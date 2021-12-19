package com.bytedance.framwork.core.p999b.p1003d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.p999b.p1004e.C14796b;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.framwork.core.b.d.d */
public final class C14789d {

    /* renamed from: f */
    static final C14796b.AbstractC14797a<C14794c, Runnable> f36057f = new C14796b.AbstractC14797a<C14794c, Runnable>() {
        /* class com.bytedance.framwork.core.p999b.p1003d.C14789d.C147901 */

        static {
            Covode.recordClassIndex(16890);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.framwork.core.p999b.p1004e.C14796b.AbstractC14797a
        /* renamed from: a */
        public final /* synthetic */ boolean mo23826a(C14794c cVar, Runnable runnable) {
            C14794c cVar2 = cVar;
            if (runnable == null) {
                if (cVar2 == null || cVar2.f36066a == null || cVar2.f36066a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar2 == null || cVar2.f36066a == null || !runnable.equals(cVar2.f36066a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: g */
    static final C14796b.AbstractC14797a<Message, Runnable> f36058g = new C14796b.AbstractC14797a<Message, Runnable>() {
        /* class com.bytedance.framwork.core.p999b.p1003d.C14789d.C147912 */

        static {
            Covode.recordClassIndex(16891);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.framwork.core.p999b.p1004e.C14796b.AbstractC14797a
        /* renamed from: a */
        public final /* synthetic */ boolean mo23826a(Message message, Runnable runnable) {
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
    final HandlerThread f36059a;

    /* renamed from: b */
    public final Queue<C14794c> f36060b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final Queue<Message> f36061c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public volatile Handler f36062d;

    /* renamed from: e */
    public final Object f36063e = new Object();

    static {
        Covode.recordClassIndex(16889);
    }

    /* renamed from: com.bytedance.framwork.core.b.d.d$b */
    class HandlerThreadC14793b extends HandlerThread {
        static {
            Covode.recordClassIndex(16893);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:7:?, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLooperPrepared() {
            /*
                r4 = this;
                r3 = 12827(0x321b, float:1.7974E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                super.onLooperPrepared()
                com.bytedance.framwork.core.b.d.d r0 = com.bytedance.framwork.core.p999b.p1003d.C14789d.this
                java.lang.Object r2 = r0.f36063e
                monitor-enter(r2)
                com.bytedance.framwork.core.b.d.d r1 = com.bytedance.framwork.core.p999b.p1003d.C14789d.this     // Catch:{ all -> 0x0029 }
                android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0029 }
                r0.<init>()     // Catch:{ all -> 0x0029 }
                r1.f36062d = r0     // Catch:{ all -> 0x0029 }
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.framwork.core.b.d.d r0 = com.bytedance.framwork.core.p999b.p1003d.C14789d.this
                android.os.Handler r2 = r0.f36062d
                com.bytedance.framwork.core.b.d.d$a r1 = new com.bytedance.framwork.core.b.d.d$a
                com.bytedance.framwork.core.b.d.d r0 = com.bytedance.framwork.core.p999b.p1003d.C14789d.this
                r1.<init>()
                r2.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0029:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p999b.p1003d.C14789d.HandlerThreadC14793b.onLooperPrepared():void");
        }

        HandlerThreadC14793b(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.framwork.core.b.d.d$a */
    class RunnableC14792a implements Runnable {
        static {
            Covode.recordClassIndex(16892);
        }

        public final void run() {
            while (!C14789d.this.f36061c.isEmpty()) {
                if (C14789d.this.f36062d != null) {
                    C14789d.this.f36062d.sendMessageAtFrontOfQueue(C14789d.this.f36061c.poll());
                }
            }
            while (!C14789d.this.f36060b.isEmpty()) {
                C14794c poll = C14789d.this.f36060b.poll();
                if (C14789d.this.f36062d != null) {
                    C14789d.this.f36062d.sendMessageAtTime(poll.f36066a, poll.f36067b);
                }
            }
        }

        RunnableC14792a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Message mo23822a(Runnable runnable) {
        return Message.obtain(this.f36062d, runnable);
    }

    public C14789d(String str) {
        this.f36059a = new HandlerThreadC14793b(str);
    }

    /* renamed from: b */
    public final void mo23825b(Runnable runnable) {
        if (!this.f36060b.isEmpty() || !this.f36061c.isEmpty()) {
            C14796b.m27160a(this.f36060b, runnable, f36057f);
            C14796b.m27160a(this.f36061c, runnable, f36058g);
        }
        if (this.f36062d != null) {
            this.f36062d.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.framwork.core.b.d.d$c */
    public static class C14794c {

        /* renamed from: a */
        Message f36066a;

        /* renamed from: b */
        long f36067b;

        static {
            Covode.recordClassIndex(16894);
        }

        C14794c(Message message, long j) {
            this.f36066a = message;
            this.f36067b = j;
        }
    }

    /* renamed from: a */
    public final boolean mo23824a(Runnable runnable, long j) {
        return mo23823a(mo23822a(runnable), j);
    }

    /* renamed from: a */
    public final boolean mo23823a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m27152b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m27152b(Message message, long j) {
        MethodCollector.m26663i(13900);
        if (this.f36062d == null) {
            synchronized (this.f36063e) {
                try {
                    if (this.f36062d == null) {
                        this.f36060b.add(new C14794c(message, j));
                        return true;
                    }
                } finally {
                    MethodCollector.m26664o(13900);
                }
            }
        }
        boolean sendMessageAtTime = this.f36062d.sendMessageAtTime(message, j);
        MethodCollector.m26664o(13900);
        return sendMessageAtTime;
    }
}
