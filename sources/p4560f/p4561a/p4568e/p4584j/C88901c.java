package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4566c.C88417a;

/* renamed from: f.a.e.j.c */
public final class C88901c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    static {
        Covode.recordClassIndex(104943);
    }

    public final boolean isTerminated() {
        if (get() == C88906h.f201913a) {
            return true;
        }
        return false;
    }

    public final Throwable terminate() {
        Throwable th = (Throwable) get();
        if (th != C88906h.f201913a) {
            return (Throwable) getAndSet(C88906h.f201913a);
        }
        return th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Throwable[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addThrowable(Throwable th) {
        Object obj;
        Throwable aVar;
        do {
            obj = get();
            if (obj == C88906h.f201913a) {
                return false;
            }
            if (obj == null) {
                aVar = th;
            } else {
                aVar = new C88417a(obj, th);
            }
        } while (!compareAndSet(obj, aVar));
        return true;
    }
}
