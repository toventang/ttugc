package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g;

/* renamed from: f.a.e.e.c.m */
public final class C88606m<T> extends AbstractC88973n<T> implements AbstractCallableC88474g<T> {

    /* renamed from: a */
    final T f201035a;

    static {
        Covode.recordClassIndex(104648);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g, java.util.concurrent.Callable
    public final T call() {
        return this.f201035a;
    }

    public C88606m(T t) {
        this.f201035a = t;
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        pVar.onSubscribe(EnumC88442c.INSTANCE);
        pVar.onSuccess(this.f201035a);
    }
}
