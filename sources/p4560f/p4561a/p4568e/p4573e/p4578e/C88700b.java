package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4585f.AbstractC88918a;

/* renamed from: f.a.e.e.e.b */
public final class C88700b<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final AbstractC88918a<? extends T> f201275a;

    /* renamed from: b */
    final int f201276b = 1;

    /* renamed from: c */
    final AbstractC88433f<? super AbstractC88412b> f201277c;

    /* renamed from: d */
    final AtomicInteger f201278d;

    static {
        Covode.recordClassIndex(104742);
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201275a.mo143062b((AbstractC88986z<? super Object>) zVar);
        if (this.f201278d.incrementAndGet() == this.f201276b) {
            this.f201275a.mo143066e(this.f201277c);
        }
    }

    public C88700b(AbstractC88918a<? extends T> aVar, int i, AbstractC88433f<? super AbstractC88412b> fVar) {
        this.f201275a = aVar;
        this.f201277c = fVar;
        this.f201278d = new AtomicInteger();
    }
}
