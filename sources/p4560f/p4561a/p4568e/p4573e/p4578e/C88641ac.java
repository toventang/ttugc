package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.C88486j;

/* renamed from: f.a.e.e.e.ac */
public final class C88641ac<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final Future<? extends T> f201103a;

    /* renamed from: b */
    final long f201104b = 0;

    /* renamed from: c */
    final TimeUnit f201105c = null;

    static {
        Covode.recordClassIndex(104683);
    }

    public C88641ac(Future<? extends T> future) {
        this.f201103a = future;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.e.d.j */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        Object obj;
        C88486j jVar = new C88486j(zVar);
        zVar.onSubscribe(jVar);
        if (!jVar.isDisposed()) {
            try {
                TimeUnit timeUnit = this.f201105c;
                if (timeUnit != null) {
                    obj = this.f201103a.get(this.f201104b, timeUnit);
                } else {
                    obj = this.f201103a.get();
                }
                jVar.complete(C88466b.m153697a(obj, "Future returned null"));
            } catch (Throwable th) {
                C88422b.m153670a(th);
                if (!jVar.isDisposed()) {
                    zVar.onError(th);
                }
            }
        }
    }
}
