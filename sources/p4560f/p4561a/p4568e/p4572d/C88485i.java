package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.i */
public final class C88485i<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: a */
    final AbstractC88433f<? super T> f200732a;

    /* renamed from: b */
    final AbstractC88433f<? super Throwable> f200733b;

    static {
        Covode.recordClassIndex(104527);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f200733b != C88446a.f200700f) {
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

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSubscribe(AbstractC88412b bVar) {
        EnumC88441b.setOnce(this, bVar);
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSuccess(T t) {
        lazySet(EnumC88441b.DISPOSED);
        try {
            this.f200732a.accept(t);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            C88925a.m154178a(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onError(Throwable th) {
        lazySet(EnumC88441b.DISPOSED);
        try {
            this.f200733b.accept(th);
        } catch (Throwable th2) {
            C88422b.m153670a(th2);
            C88925a.m154178a(new C88417a(th, th2));
        }
    }

    public C88485i(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2) {
        this.f200732a = fVar;
        this.f200733b = fVar2;
    }
}
