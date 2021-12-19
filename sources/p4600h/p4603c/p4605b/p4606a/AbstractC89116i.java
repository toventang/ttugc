package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;

/* renamed from: h.c.b.a.i */
public abstract class AbstractC89116i extends AbstractC89107a {
    static {
        Covode.recordClassIndex(105200);
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public AbstractC89127f getContext() {
        return C89133g.INSTANCE;
    }

    public AbstractC89116i(AbstractC89124d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != C89133g.INSTANCE) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }
}
