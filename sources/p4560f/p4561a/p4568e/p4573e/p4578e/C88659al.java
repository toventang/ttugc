package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88695ay;

/* renamed from: f.a.e.e.e.al */
public final class C88659al<T> extends AbstractC88979t<T> implements AbstractCallableC88474g<T> {

    /* renamed from: a */
    private final T f201159a;

    static {
        Covode.recordClassIndex(104701);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g, java.util.concurrent.Callable
    public final T call() {
        return this.f201159a;
    }

    public C88659al(T t) {
        this.f201159a = t;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88695ay.RunnableC88696a aVar = new C88695ay.RunnableC88696a(zVar, this.f201159a);
        zVar.onSubscribe(aVar);
        aVar.run();
    }
}
