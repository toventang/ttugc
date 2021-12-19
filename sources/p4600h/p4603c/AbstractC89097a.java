package p4600h.p4603c;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.a */
public abstract class AbstractC89097a implements AbstractC89127f.AbstractC89130b {
    private final AbstractC89127f.AbstractC89132c<?> key;

    static {
        Covode.recordClassIndex(105181);
    }

    @Override // p4600h.p4603c.AbstractC89127f.AbstractC89130b
    public AbstractC89127f.AbstractC89132c<?> getKey() {
        return this.key;
    }

    public AbstractC89097a(AbstractC89127f.AbstractC89132c<?> cVar) {
        C89219l.m154721d(cVar, "");
        this.key = cVar;
    }

    @Override // p4600h.p4603c.AbstractC89127f.AbstractC89130b, p4600h.p4603c.AbstractC89127f
    public <E extends AbstractC89127f.AbstractC89130b> E get(AbstractC89127f.AbstractC89132c<E> cVar) {
        C89219l.m154721d(cVar, "");
        return (E) AbstractC89127f.AbstractC89130b.C89131a.m154622a(this, cVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public AbstractC89127f minusKey(AbstractC89127f.AbstractC89132c<?> cVar) {
        C89219l.m154721d(cVar, "");
        return AbstractC89127f.AbstractC89130b.C89131a.m154625b(this, cVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public AbstractC89127f plus(AbstractC89127f fVar) {
        C89219l.m154721d(fVar, "");
        return AbstractC89127f.AbstractC89130b.C89131a.m154623a(this, fVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public <R> R fold(R r, AbstractC89183m<? super R, ? super AbstractC89127f.AbstractC89130b, ? extends R> mVar) {
        C89219l.m154721d(mVar, "");
        return (R) AbstractC89127f.AbstractC89130b.C89131a.m154624a(this, r, mVar);
    }
}
