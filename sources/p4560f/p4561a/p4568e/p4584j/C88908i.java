package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.j.i */
public final class C88908i {
    static {
        Covode.recordClassIndex(104950);
    }

    /* renamed from: a */
    public static void m154109a(AbstractC88986z<?> zVar, AtomicInteger atomicInteger, C88901c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = cVar.terminate();
            if (terminate != null) {
                zVar.onError(terminate);
            } else {
                zVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static void m154108a(AbstractC88986z<?> zVar, Throwable th, AtomicInteger atomicInteger, C88901c cVar) {
        if (!cVar.addThrowable(th)) {
            C88925a.m154178a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            zVar.onError(cVar.terminate());
        }
    }

    /* renamed from: a */
    public static <T> void m154107a(AbstractC88986z<? super T> zVar, T t, AtomicInteger atomicInteger, C88901c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            zVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = cVar.terminate();
                if (terminate != null) {
                    zVar.onError(terminate);
                } else {
                    zVar.onComplete();
                }
            }
        }
    }
}
