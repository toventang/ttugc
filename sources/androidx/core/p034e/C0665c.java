package androidx.core.p034e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: androidx.core.e.c */
public final class C0665c {

    /* renamed from: a */
    final Object f2681a = new Object();

    /* renamed from: b */
    HandlerThread f2682b;

    /* renamed from: c */
    Handler f2683c;

    /* renamed from: d */
    final int f2684d;

    /* renamed from: e */
    private int f2685e;

    /* renamed from: f */
    private Handler.Callback f2686f = new Handler.Callback() {
        /* class androidx.core.p034e.C0665c.C06661 */

        static {
            Covode.recordClassIndex(745);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0665c cVar = C0665c.this;
                synchronized (cVar.f2681a) {
                    if (!cVar.f2683c.hasMessages(1)) {
                        cVar.f2682b.quit();
                        cVar.f2682b = null;
                        cVar.f2683c = null;
                    }
                }
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0665c cVar2 = C0665c.this;
                ((Runnable) message.obj).run();
                synchronized (cVar2.f2681a) {
                    cVar2.f2683c.removeMessages(0);
                    cVar2.f2683c.sendMessageDelayed(cVar2.f2683c.obtainMessage(0), (long) cVar2.f2684d);
                }
                return true;
            }
        }
    };

    /* renamed from: g */
    private final int f2687g;

    /* renamed from: h */
    private final String f2688h;

    /* renamed from: androidx.core.e.c$a */
    public interface AbstractC0670a<T> {
        static {
            Covode.recordClassIndex(749);
        }

        /* renamed from: a */
        void mo2686a(T t);
    }

    static {
        Covode.recordClassIndex(744);
    }

    public C0665c(String str) {
        this.f2688h = str;
        this.f2687g = 10;
        this.f2684d = 10000;
        this.f2685e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2689a(Runnable runnable) {
        synchronized (this.f2681a) {
            if (this.f2682b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f2688h, this.f2687g);
                this.f2682b = handlerThread;
                handlerThread.start();
                this.f2683c = new Handler(this.f2682b.getLooper(), this.f2686f);
                this.f2685e++;
            }
            this.f2683c.removeMessages(0);
            Handler handler = this.f2683c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public final <T> T mo2688a(final Callable<T> callable, int i) {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        mo2689a(new Runnable() {
            /* class androidx.core.p034e.C0665c.RunnableC06693 */

            static {
                Covode.recordClassIndex(748);
            }

            public final void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
