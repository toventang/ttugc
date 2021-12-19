package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88413c;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.a.g */
public final class C88505g extends AbstractC88410b {

    /* renamed from: a */
    final Callable<?> f200774a;

    static {
        Covode.recordClassIndex(104547);
    }

    public C88505g(Callable<?> callable) {
        this.f200774a = callable;
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        AbstractC88412b a = C88413c.m153658a(C88446a.f200696b);
        dVar.onSubscribe(a);
        try {
            this.f200774a.call();
            if (!a.isDisposed()) {
                dVar.onComplete();
            }
        } catch (Throwable th) {
            C88422b.m153670a(th);
            if (!a.isDisposed()) {
                dVar.onError(th);
            } else {
                C88925a.m154178a(th);
            }
        }
    }
}
