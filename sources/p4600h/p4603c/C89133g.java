package p4600h.p4603c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.g */
public final class C89133g implements AbstractC89127f, Serializable {
    public static final C89133g INSTANCE = new C89133g();
    private static final long serialVersionUID = 0;

    @Override // p4600h.p4603c.AbstractC89127f
    public final <R> R fold(R r, AbstractC89183m<? super R, ? super AbstractC89127f.AbstractC89130b, ? extends R> mVar) {
        C89219l.m154721d(mVar, "");
        return r;
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public final <E extends AbstractC89127f.AbstractC89130b> E get(AbstractC89127f.AbstractC89132c<E> cVar) {
        C89219l.m154721d(cVar, "");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public final AbstractC89127f plus(AbstractC89127f fVar) {
        C89219l.m154721d(fVar, "");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    private C89133g() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    static {
        Covode.recordClassIndex(105217);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public final AbstractC89127f minusKey(AbstractC89127f.AbstractC89132c<?> cVar) {
        C89219l.m154721d(cVar, "");
        return this;
    }
}
