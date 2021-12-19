package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.o */
public final class C88491o<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88986z<T> {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a */
    final AbstractC88433f<? super T> f200745a;

    /* renamed from: b */
    final AbstractC88433f<? super Throwable> f200746b;

    /* renamed from: c */
    final AbstractC88428a f200747c;

    /* renamed from: d */
    final AbstractC88433f<? super AbstractC88412b> f200748d;

    static {
        Covode.recordClassIndex(104533);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f200746b != C88446a.f200700f) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == EnumC88441b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        if (!isDisposed()) {
            lazySet(EnumC88441b.DISPOSED);
            try {
                this.f200747c.mo8579a();
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f200745a.accept(t);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                ((AbstractC88412b) get()).dispose();
                onError(th);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        if (EnumC88441b.setOnce(this, bVar)) {
            try {
                this.f200748d.accept(this);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                bVar.dispose();
                onError(th);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(EnumC88441b.DISPOSED);
            try {
                this.f200746b.accept(th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                C88925a.m154178a(new C88417a(th, th2));
            }
        } else {
            C88925a.m154178a(th);
        }
    }

    public C88491o(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88433f<? super AbstractC88412b> fVar3) {
        this.f200745a = fVar;
        this.f200746b = fVar2;
        this.f200747c = aVar;
        this.f200748d = fVar3;
    }
}
