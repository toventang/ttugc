package p4560f.p4561a.p4568e.p4583i;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.p4568e.p4571c.AbstractC88473f;

/* renamed from: f.a.e.i.d */
public final class C88895d<T> extends AtomicInteger implements AbstractC88473f<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: a */
    final T f201896a;

    /* renamed from: b */
    final AbstractC90214c<? super T> f201897b;

    static {
        Covode.recordClassIndex(104937);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
    public final int requestFusion(int i) {
        return i & 1;
    }

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
        lazySet(2);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final void clear() {
        lazySet(1);
    }

    public final boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f201896a;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        if (EnumC88897f.validate(j) && compareAndSet(0, 1)) {
            AbstractC90214c<? super T> cVar = this.f201897b;
            cVar.onNext(this.f201896a);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public C88895d(AbstractC90214c<? super T> cVar, T t) {
        this.f201897b = cVar;
        this.f201896a = t;
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
