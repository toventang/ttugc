package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89125e;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.b.a.d */
public abstract class AbstractC89110d extends AbstractC89107a {
    private final AbstractC89127f _context;
    private transient AbstractC89124d<Object> intercepted;

    static {
        Covode.recordClassIndex(105194);
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public AbstractC89127f getContext() {
        AbstractC89127f fVar = this._context;
        if (fVar == null) {
            C89219l.m154715b();
        }
        return fVar;
    }

    public final AbstractC89124d<Object> intercepted() {
        AbstractC89124d<Object> dVar = this.intercepted;
        if (dVar == null) {
            AbstractC89125e eVar = (AbstractC89125e) getContext().get(AbstractC89125e.f202840b);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
    public void releaseIntercepted() {
        AbstractC89124d<?> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            AbstractC89127f.AbstractC89130b bVar = getContext().get(AbstractC89125e.f202840b);
            if (bVar == null) {
                C89219l.m154715b();
            }
            ((AbstractC89125e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = C89109c.f202825a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractC89110d(p4600h.p4603c.AbstractC89124d<java.lang.Object> r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            h.c.f r0 = r2.getContext()
        L_0x0006:
            r1.<init>(r2, r0)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4603c.p4605b.p4606a.AbstractC89110d.<init>(h.c.d):void");
    }

    public AbstractC89110d(AbstractC89124d<Object> dVar, AbstractC89127f fVar) {
        super(dVar);
        this._context = fVar;
    }
}
