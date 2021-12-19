package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.k */
public final class C88487k<T> implements AbstractC88412b, AbstractC88986z<T> {

    /* renamed from: a */
    final AbstractC88986z<? super T> f200736a;

    /* renamed from: b */
    final AbstractC88433f<? super AbstractC88412b> f200737b;

    /* renamed from: c */
    final AbstractC88428a f200738c;

    /* renamed from: d */
    AbstractC88412b f200739d;

    static {
        Covode.recordClassIndex(104529);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return this.f200739d.isDisposed();
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        if (this.f200739d != EnumC88441b.DISPOSED) {
            this.f200739d = EnumC88441b.DISPOSED;
            this.f200736a.onComplete();
        }
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        AbstractC88412b bVar = this.f200739d;
        if (bVar != EnumC88441b.DISPOSED) {
            this.f200739d = EnumC88441b.DISPOSED;
            try {
                this.f200738c.mo8579a();
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
            bVar.dispose();
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        this.f200736a.onNext(t);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        if (this.f200739d != EnumC88441b.DISPOSED) {
            this.f200739d = EnumC88441b.DISPOSED;
            this.f200736a.onError(th);
            return;
        }
        C88925a.m154178a(th);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        try {
            this.f200737b.accept(bVar);
            if (EnumC88441b.validate(this.f200739d, bVar)) {
                this.f200739d = bVar;
                this.f200736a.onSubscribe(this);
            }
        } catch (Throwable th) {
            C88422b.m153670a(th);
            bVar.dispose();
            this.f200739d = EnumC88441b.DISPOSED;
            EnumC88442c.error(th, this.f200736a);
        }
    }

    public C88487k(AbstractC88986z<? super T> zVar, AbstractC88433f<? super AbstractC88412b> fVar, AbstractC88428a aVar) {
        this.f200736a = zVar;
        this.f200737b = fVar;
        this.f200738c = aVar;
    }
}
