package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88413c;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4570b.C88446a;

/* renamed from: f.a.e.e.a.f */
public final class C88504f extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88428a f200773a;

    static {
        Covode.recordClassIndex(104546);
    }

    public C88504f(AbstractC88428a aVar) {
        this.f200773a = aVar;
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        AbstractC88412b a = C88413c.m153658a(C88446a.f200696b);
        dVar.onSubscribe(a);
        try {
            this.f200773a.mo8579a();
            if (!a.isDisposed()) {
                dVar.onComplete();
            }
        } catch (Throwable th) {
            C88422b.m153670a(th);
            if (!a.isDisposed()) {
                dVar.onError(th);
            }
        }
    }
}
