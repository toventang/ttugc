package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.j */
public class C88486j<T> extends AbstractC88478b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: a */
    protected final AbstractC88986z<? super T> f200734a;

    /* renamed from: b */
    protected T f200735b;

    static {
        Covode.recordClassIndex(104528);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public void dispose() {
        set(4);
        this.f200735b = null;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final void clear() {
        lazySet(32);
        this.f200735b = null;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final boolean tryDispose() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    public final void complete() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f200734a.onComplete();
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.f200735b;
        this.f200735b = null;
        lazySet(32);
        return t;
    }

    public C88486j(AbstractC88986z<? super T> zVar) {
        this.f200734a = zVar;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            C88925a.m154178a(th);
            return;
        }
        lazySet(2);
        this.f200734a.onError(th);
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) == 0) {
            AbstractC88986z<? super T> zVar = this.f200734a;
            if (i == 8) {
                this.f200735b = t;
                lazySet(16);
                zVar.onNext(null);
            } else {
                lazySet(2);
                zVar.onNext(t);
            }
            if (get() != 4) {
                zVar.onComplete();
            }
        }
    }
}
