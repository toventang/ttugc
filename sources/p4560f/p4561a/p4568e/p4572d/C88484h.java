package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4566c.C88424d;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.h */
public final class C88484h extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88427d, AbstractC88433f<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: a */
    final AbstractC88433f<? super Throwable> f200730a;

    /* renamed from: b */
    final AbstractC88428a f200731b;

    static {
        Covode.recordClassIndex(104526);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f200730a != this) {
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

    @Override // p4560f.p4561a.AbstractC88427d
    public final void onComplete() {
        try {
            this.f200731b.mo8579a();
        } catch (Throwable th) {
            C88422b.m153670a(th);
            C88925a.m154178a(th);
        }
        lazySet(EnumC88441b.DISPOSED);
    }

    @Override // p4560f.p4561a.AbstractC88427d
    public final void onSubscribe(AbstractC88412b bVar) {
        EnumC88441b.setOnce(this, bVar);
    }

    public C88484h(AbstractC88428a aVar) {
        this.f200730a = this;
        this.f200731b = aVar;
    }

    public final void accept(Throwable th) {
        C88925a.m154178a(new C88424d(th));
    }

    @Override // p4560f.p4561a.AbstractC88427d
    public final void onError(Throwable th) {
        try {
            this.f200730a.accept(th);
        } catch (Throwable th2) {
            C88422b.m153670a(th2);
            C88925a.m154178a(th2);
        }
        lazySet(EnumC88441b.DISPOSED);
    }

    public C88484h(AbstractC88433f<? super Throwable> fVar, AbstractC88428a aVar) {
        this.f200730a = fVar;
        this.f200731b = aVar;
    }
}
