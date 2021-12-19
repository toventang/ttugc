package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.e.w */
public final class C88791w<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f201617a;

    static {
        Covode.recordClassIndex(104833);
    }

    public C88791w(Callable<? extends Throwable> callable) {
        this.f201617a = callable;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        Throwable th;
        try {
            th = (Throwable) C88466b.m153697a(this.f201617a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C88422b.m153670a(th);
        }
        EnumC88442c.error(th, zVar);
    }
}
