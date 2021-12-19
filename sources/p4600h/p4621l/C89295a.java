package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.l.a */
public final class C89295a<T> implements AbstractC89306h<T> {

    /* renamed from: a */
    private final AtomicReference<AbstractC89306h<T>> f202937a;

    static {
        Covode.recordClassIndex(105379);
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<T> mo2926a() {
        AbstractC89306h<T> andSet = this.f202937a.getAndSet(null);
        if (andSet != null) {
            return andSet.mo2926a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public C89295a(AbstractC89306h<? extends T> hVar) {
        C89219l.m154721d(hVar, "");
        this.f202937a = new AtomicReference<>(hVar);
    }
}
