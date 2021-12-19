package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89388w;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89106b;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89125e;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.ah */
public abstract class AbstractC89507ah extends AbstractC89097a implements AbstractC89125e {
    public static final C89508a Key = new C89508a((byte) 0);

    static {
        Covode.recordClassIndex(105596);
    }

    public abstract void dispatch(AbstractC89127f fVar, Runnable runnable);

    public boolean isDispatchNeeded(AbstractC89127f fVar) {
        return true;
    }

    public final AbstractC89507ah plus(AbstractC89507ah ahVar) {
        return ahVar;
    }

    /* renamed from: kotlinx.coroutines.ah$a */
    public static final class C89508a extends AbstractC89106b<AbstractC89125e, AbstractC89507ah> {
        static {
            Covode.recordClassIndex(105597);
        }

        private C89508a() {
            super(AbstractC89125e.f202840b, C895091.f203223a);
        }

        public /* synthetic */ C89508a(byte b) {
            this();
        }
    }

    public AbstractC89507ah() {
        super(AbstractC89125e.f202840b);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    @Override // p4600h.p4603c.AbstractC89125e
    public final <T> AbstractC89124d<T> interceptContinuation(AbstractC89124d<? super T> dVar) {
        return new C89537az(this, dVar);
    }

    @Override // p4600h.p4603c.AbstractC89125e
    public void releaseInterceptedContinuation(AbstractC89124d<?> dVar) {
        if (dVar != null) {
            Object obj = ((C89537az) dVar)._reusableCancellableContinuation;
            if (!(obj instanceof C89672n)) {
                obj = null;
            }
            C89672n nVar = (C89672n) obj;
            if (nVar != null) {
                nVar.mo144220g();
                return;
            }
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // p4600h.p4603c.AbstractC89127f.AbstractC89130b, p4600h.p4603c.AbstractC89127f, p4600h.p4603c.AbstractC89097a
    public <E extends AbstractC89127f.AbstractC89130b> E get(AbstractC89127f.AbstractC89132c<E> cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar instanceof AbstractC89106b) {
            AbstractC89106b bVar = (AbstractC89106b) cVar;
            if (!bVar.mo143555a(getKey())) {
                return null;
            }
            E e = (E) bVar.mo143554a(this);
            if (!(e instanceof AbstractC89127f.AbstractC89130b)) {
                return null;
            }
            return e;
        } else if (AbstractC89125e.f202840b == cVar) {
            return this;
        } else {
            return null;
        }
    }

    @Override // p4600h.p4603c.AbstractC89127f, p4600h.p4603c.AbstractC89097a
    public AbstractC89127f minusKey(AbstractC89127f.AbstractC89132c<?> cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar instanceof AbstractC89106b) {
            AbstractC89106b bVar = (AbstractC89106b) cVar;
            if (!bVar.mo143555a(getKey()) || bVar.mo143554a(this) == null) {
                return this;
            }
            return C89133g.INSTANCE;
        } else if (AbstractC89125e.f202840b == cVar) {
            return C89133g.INSTANCE;
        } else {
            return this;
        }
    }

    public void dispatchYield(AbstractC89127f fVar, Runnable runnable) {
        dispatch(fVar, runnable);
    }
}
