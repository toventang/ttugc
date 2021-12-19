package p4560f.p4561a.p4568e.p4583i;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;

/* renamed from: f.a.e.i.b */
public class C88893b<T> extends AbstractC88892a<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: e */
    protected final AbstractC90214c<? super T> f201893e;

    /* renamed from: f */
    protected T f201894f;

    static {
        Covode.recordClassIndex(104935);
    }

    @Override // org.p4663a.AbstractC90215d
    public void cancel() {
        set(4);
        this.f201894f = null;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final void clear() {
        lazySet(32);
        this.f201894f = null;
    }

    public final boolean isCancelled() {
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

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f201894f;
        this.f201894f = null;
        return t;
    }

    public C88893b(AbstractC90214c<? super T> cVar) {
        this.f201893e = cVar;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        T t;
        if (EnumC88897f.validate(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (t = this.f201894f) != null) {
                            this.f201894f = null;
                            AbstractC90214c<? super T> cVar = this.f201893e;
                            cVar.onNext(t);
                            if (get() != 4) {
                                cVar.onComplete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    AbstractC90214c<? super T> cVar = this.f201893e;
                    cVar.onNext(t);
                    if (get() != 4) {
                        cVar.onComplete();
                        return;
                    }
                    return;
                }
                this.f201894f = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f201894f = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f201894f = t;
        lazySet(16);
        AbstractC90214c<? super T> cVar2 = this.f201893e;
        cVar2.onNext(t);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }
}
