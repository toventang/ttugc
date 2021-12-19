package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.a.b */
public final class C88499b extends AbstractC88410b {

    /* renamed from: a */
    final Callable<? extends AbstractC88917f> f200759a;

    static {
        Covode.recordClassIndex(104541);
    }

    public C88499b(Callable<? extends AbstractC88917f> callable) {
        this.f200759a = callable;
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        try {
            ((AbstractC88917f) C88466b.m153697a(this.f200759a.call(), "The completableSupplier returned a null CompletableSource")).mo17931a(dVar);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88442c.error(th, dVar);
        }
    }
}
