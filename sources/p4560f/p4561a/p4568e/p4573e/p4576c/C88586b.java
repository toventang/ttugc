package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.b */
public final class C88586b<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88975p<T> {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: a */
    final AbstractC88433f<? super T> f200999a;

    /* renamed from: b */
    final AbstractC88433f<? super Throwable> f201000b;

    /* renamed from: c */
    final AbstractC88428a f201001c;

    static {
        Covode.recordClassIndex(104628);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f201000b != C88446a.f200700f) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return EnumC88441b.isDisposed((AbstractC88412b) get());
    }

    @Override // p4560f.p4561a.AbstractC88975p
    public final void onComplete() {
        lazySet(EnumC88441b.DISPOSED);
        try {
            this.f201001c.mo8579a();
        } catch (Throwable th) {
            C88422b.m153670a(th);
            C88925a.m154178a(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88975p
    public final void onSubscribe(AbstractC88412b bVar) {
        EnumC88441b.setOnce(this, bVar);
    }

    @Override // p4560f.p4561a.AbstractC88975p
    public final void onSuccess(T t) {
        lazySet(EnumC88441b.DISPOSED);
        try {
            this.f200999a.accept(t);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            C88925a.m154178a(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88975p
    public final void onError(Throwable th) {
        lazySet(EnumC88441b.DISPOSED);
        try {
            this.f201000b.accept(th);
        } catch (Throwable th2) {
            C88422b.m153670a(th2);
            C88925a.m154178a(new C88417a(th, th2));
        }
    }

    public C88586b(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar) {
        this.f200999a = fVar;
        this.f201000b = fVar2;
        this.f201001c = aVar;
    }
}
