package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.AbstractC88440a;

/* renamed from: f.a.e.g.m */
public final class RunnableC88877m extends AtomicReferenceArray<Object> implements AbstractC88412b, Runnable, Callable<Object> {

    /* renamed from: b */
    static final Object f201841b = new Object();

    /* renamed from: c */
    static final Object f201842c = new Object();

    /* renamed from: d */
    static final Object f201843d = new Object();

    /* renamed from: e */
    static final Object f201844e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: a */
    final Runnable f201845a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        Object obj = get(0);
        if (obj == f201841b || obj == f201844e) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104919);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f201844e || obj5 == (obj3 = f201842c) || obj5 == (obj4 = f201843d)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z = true;
                obj3 = obj4;
            } else {
                z = false;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f201844e || obj == (obj2 = f201841b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((AbstractC88440a) obj).mo142947c(this);
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f201845a.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == f201841b || !compareAndSet(0, obj3, f201844e) || obj3 == null)) {
                ((AbstractC88440a) obj3).mo142947c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f201842c || obj2 == f201843d) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f201844e));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == f201841b || !compareAndSet(0, obj4, f201844e) || obj4 == null)) {
            ((AbstractC88440a) obj4).mo142947c(this);
        }
        do {
            obj = get(1);
            if (obj == f201842c || obj == f201843d) {
                return;
            }
        } while (!compareAndSet(1, obj, f201844e));
    }

    public final void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f201844e) {
                if (obj == f201842c) {
                    future.cancel(false);
                    return;
                } else if (obj == f201843d) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public RunnableC88877m(Runnable runnable, AbstractC88440a aVar) {
        super(3);
        this.f201845a = runnable;
        lazySet(0, aVar);
    }
}
