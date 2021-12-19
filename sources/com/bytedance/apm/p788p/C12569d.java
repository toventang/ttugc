package com.bytedance.apm.p788p;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.apm.C12478h;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.apm.p.d */
public final class C12569d {

    /* renamed from: f */
    static final C12585h.AbstractC12586a<C12574c, Runnable> f30571f = new C12585h.AbstractC12586a<C12574c, Runnable>() {
        /* class com.bytedance.apm.p788p.C12569d.C125701 */

        static {
            Covode.recordClassIndex(14387);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.apm.p789q.C12585h.AbstractC12586a
        /* renamed from: a */
        public final /* synthetic */ boolean mo20401a(C12574c cVar, Runnable runnable) {
            C12574c cVar2 = cVar;
            if (runnable == null) {
                if (cVar2 == null || cVar2.f30580a == null || cVar2.f30580a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar2 == null || cVar2.f30580a == null || !runnable.equals(cVar2.f30580a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: g */
    static final C12585h.AbstractC12586a<Message, Runnable> f30572g = new C12585h.AbstractC12586a<Message, Runnable>() {
        /* class com.bytedance.apm.p788p.C12569d.C125712 */

        static {
            Covode.recordClassIndex(14388);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.apm.p789q.C12585h.AbstractC12586a
        /* renamed from: a */
        public final /* synthetic */ boolean mo20401a(Message message, Runnable runnable) {
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
    public final HandlerThread f30573a;

    /* renamed from: b */
    public final Queue<C12574c> f30574b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final Queue<Message> f30575c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public volatile Handler f30576d;

    /* renamed from: e */
    public final Object f30577e = new Object();

    /* renamed from: a */
    public final boolean mo20397a() {
        if (this.f30576d != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(14386);
    }

    /* renamed from: com.bytedance.apm.p.d$b */
    class HandlerThreadC12573b extends HandlerThread {
        static {
            Covode.recordClassIndex(14390);
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (C12569d.this.f30577e) {
                C12569d.this.f30576d = new Handler();
            }
            C12569d.this.f30576d.post(new RunnableC12572a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    C12478h.C12481b.f30317a.mo20297b(th, "apm_error");
                }
            }
        }

        HandlerThreadC12573b(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.apm.p.d$a */
    class RunnableC12572a implements Runnable {
        static {
            Covode.recordClassIndex(14389);
        }

        public final void run() {
            while (!C12569d.this.f30575c.isEmpty()) {
                synchronized (C12569d.this.f30577e) {
                    if (C12569d.this.f30576d != null) {
                        C12569d.this.f30576d.sendMessageAtFrontOfQueue(C12569d.this.f30575c.poll());
                    }
                }
            }
            while (!C12569d.this.f30574b.isEmpty()) {
                synchronized (C12569d.this.f30577e) {
                    C12574c poll = C12569d.this.f30574b.poll();
                    if (C12569d.this.f30576d != null) {
                        C12569d.this.f30576d.sendMessageAtTime(poll.f30580a, poll.f30581b);
                    }
                }
            }
        }

        RunnableC12572a() {
        }
    }

    /* renamed from: c */
    private Message m22615c(Runnable runnable) {
        return Message.obtain(this.f30576d, runnable);
    }

    /* renamed from: a */
    public final boolean mo20398a(Runnable runnable) {
        return m22613a(m22615c(runnable), 0);
    }

    public C12569d(String str) {
        this.f30573a = new HandlerThreadC12573b(str);
    }

    /* renamed from: b */
    public final void mo20400b(Runnable runnable) {
        if (!this.f30574b.isEmpty() || !this.f30575c.isEmpty()) {
            C12585h.m22681a(this.f30574b, runnable, f30571f);
            C12585h.m22681a(this.f30575c, runnable, f30572g);
        }
        if (this.f30576d != null) {
            this.f30576d.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.p.d$c */
    public static class C12574c {

        /* renamed from: a */
        Message f30580a;

        /* renamed from: b */
        long f30581b;

        static {
            Covode.recordClassIndex(14391);
        }

        C12574c(Message message, long j) {
            this.f30580a = message;
            this.f30581b = j;
        }
    }

    /* renamed from: a */
    private boolean m22613a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m22614b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m22614b(Message message, long j) {
        if (this.f30576d == null) {
            synchronized (this.f30577e) {
                if (this.f30576d == null) {
                    this.f30574b.add(new C12574c(message, j));
                    return true;
                }
            }
        }
        return this.f30576d.sendMessageAtTime(message, j);
    }

    /* renamed from: a */
    public final boolean mo20399a(Runnable runnable, long j) {
        return m22613a(m22615c(runnable), j);
    }
}
