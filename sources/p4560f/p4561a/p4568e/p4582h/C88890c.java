package p4560f.p4561a.p4568e.p4582h;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.h.c */
public final class C88890c<T> extends AtomicReference<AbstractC90215d> implements AbstractC88412b, AbstractC88955l<T>, AbstractC90215d {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a */
    final AbstractC88433f<? super T> f201883a;

    /* renamed from: b */
    final AbstractC88433f<? super Throwable> f201884b;

    /* renamed from: c */
    final AbstractC88428a f201885c;

    /* renamed from: d */
    final AbstractC88433f<? super AbstractC90215d> f201886d;

    static {
        Covode.recordClassIndex(104932);
    }

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
        EnumC88897f.cancel(this);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        cancel();
    }

    public final boolean hasCustomOnError() {
        if (this.f201884b != C88446a.f200700f) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == EnumC88897f.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onComplete() {
        if (get() != EnumC88897f.CANCELLED) {
            lazySet(EnumC88897f.CANCELLED);
            try {
                this.f201885c.mo8579a();
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
        }
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        ((AbstractC90215d) get()).request(j);
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f201883a.accept(t);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                ((AbstractC90215d) get()).cancel();
                onError(th);
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        if (EnumC88897f.setOnce(this, dVar)) {
            try {
                this.f201886d.accept(this);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onError(Throwable th) {
        if (get() != EnumC88897f.CANCELLED) {
            lazySet(EnumC88897f.CANCELLED);
            try {
                this.f201884b.accept(th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                C88925a.m154178a(new C88417a(th, th2));
            }
        } else {
            C88925a.m154178a(th);
        }
    }

    public C88890c(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88433f<? super AbstractC90215d> fVar3) {
        this.f201883a = fVar;
        this.f201884b = fVar2;
        this.f201885c = aVar;
        this.f201886d = fVar3;
    }
}
