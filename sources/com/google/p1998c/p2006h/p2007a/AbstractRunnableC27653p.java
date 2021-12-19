package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.h.a.p */
public abstract class AbstractRunnableC27653p<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a */
    static final Runnable f65049a = new RunnableC27654a((byte) 0);

    /* renamed from: b */
    static final Runnable f65050b = new RunnableC27654a((byte) 0);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo46273a(T t, Throwable th);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo46274a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo46275b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract String mo46276c();

    /* renamed from: com.google.c.h.a.p$a */
    static final class RunnableC27654a implements Runnable {
        static {
            Covode.recordClassIndex(33234);
        }

        public final void run() {
        }

        private RunnableC27654a() {
        }

        /* synthetic */ RunnableC27654a(byte b) {
            this();
        }
    }

    AbstractRunnableC27653p() {
    }

    static {
        Covode.recordClassIndex(33233);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.c.h.a.p<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !mo46274a();
            if (z) {
                try {
                    obj = mo46275b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f65049a)) {
                        while (get() == f65050b) {
                            Thread.yield();
                        }
                    }
                    mo46273a(null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f65049a)) {
                while (get() == f65050b) {
                    Thread.yield();
                }
            }
            if (z) {
                mo46273a(obj, null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f65049a) {
            str = "running=[DONE]";
        } else if (runnable == f65050b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo46276c();
    }
}
