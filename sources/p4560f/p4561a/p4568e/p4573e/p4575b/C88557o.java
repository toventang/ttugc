package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g;
import p4560f.p4561a.p4568e.p4583i.C88895d;

/* renamed from: f.a.e.e.b.o */
public final class C88557o<T> extends AbstractC88924h<T> implements AbstractCallableC88474g<T> {

    /* renamed from: b */
    private final T f200920b;

    static {
        Covode.recordClassIndex(104599);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g, java.util.concurrent.Callable
    public final T call() {
        return this.f200920b;
    }

    public C88557o(T t) {
        this.f200920b = t;
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        cVar.onSubscribe(new C88895d(cVar, this.f200920b));
    }
}
