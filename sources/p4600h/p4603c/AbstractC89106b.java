package p4600h.p4603c;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.AbstractC89127f.AbstractC89130b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.b */
public abstract class AbstractC89106b<B extends AbstractC89127f.AbstractC89130b, E extends B> implements AbstractC89127f.AbstractC89132c<E> {

    /* renamed from: a */
    private final AbstractC89127f.AbstractC89132c<?> f202823a;

    /* renamed from: b */
    private final AbstractC89172b<AbstractC89127f.AbstractC89130b, E> f202824b;

    static {
        Covode.recordClassIndex(105190);
    }

    /* renamed from: a */
    public final E mo143554a(AbstractC89127f.AbstractC89130b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f202824b.invoke(bVar);
    }

    /* renamed from: a */
    public final boolean mo143555a(AbstractC89127f.AbstractC89132c<?> cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar == this || this.f202823a == cVar) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: h.c.f$c<?> */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.f.a.b<h.c.f$b, E extends B>, h.f.a.b<? super h.c.f$b, ? extends E extends B>, java.lang.Object] */
    public AbstractC89106b(AbstractC89127f.AbstractC89132c<B> cVar, AbstractC89172b<? super AbstractC89127f.AbstractC89130b, ? extends E> bVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        this.f202824b = bVar;
        this.f202823a = cVar instanceof AbstractC89106b ? (AbstractC89127f.AbstractC89132c<B>) ((AbstractC89106b) cVar).f202823a : cVar;
    }
}
