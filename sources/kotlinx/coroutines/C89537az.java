package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C89663z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;

/* renamed from: kotlinx.coroutines.az */
public final class C89537az<T> extends AbstractC89543bc<T> implements AbstractC89111e, AbstractC89124d<T> {

    /* renamed from: c */
    static final AtomicReferenceFieldUpdater f203254c = AtomicReferenceFieldUpdater.newUpdater(C89537az.class, Object.class, "_reusableCancellableContinuation");
    volatile Object _reusableCancellableContinuation;

    /* renamed from: a */
    public Object f203255a = C89541ba.f203261a;

    /* renamed from: b */
    public final Object f203256b;

    /* renamed from: d */
    public final AbstractC89507ah f203257d;

    /* renamed from: e */
    public final AbstractC89124d<T> f203258e;

    /* renamed from: i */
    private final AbstractC89111e f203259i;

    static {
        Covode.recordClassIndex(105628);
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final AbstractC89127f getContext() {
        return this.f203258e.getContext();
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public final AbstractC89111e getCallerFrame() {
        return this.f203259i;
    }

    @Override // kotlinx.coroutines.AbstractC89543bc
    /* renamed from: i */
    public final AbstractC89124d<T> mo144109i() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractC89543bc
    /* renamed from: d */
    public final Object mo144108d() {
        Object obj = this.f203255a;
        if (!C89527ar.f203243a || obj != C89541ba.f203261a) {
            this.f203255a = C89541ba.f203261a;
            return obj;
        }
        throw new AssertionError();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f203257d + ", " + C89528as.m155453a(this.f203258e) + ']';
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final void resumeWith(Object obj) {
        AbstractC89127f context = this.f203258e.getContext();
        Object a = C89500aa.m155437a(obj);
        if (this.f203257d.isDispatchNeeded(context)) {
            this.f203255a = a;
            this.f203264f = 0;
            this.f203257d.dispatch(context, this);
            return;
        }
        AbstractC89552bl a2 = C89601cw.m155534a();
        if (a2.isUnconfinedLoopActive()) {
            this.f203255a = a;
            this.f203264f = 0;
            a2.dispatchUnconfined(this);
            return;
        }
        a2.incrementUseCount(true);
        try {
            AbstractC89127f context2 = getContext();
            Object a3 = C89663z.m155642a(context2, this.f203256b);
            try {
                this.f203258e.resumeWith(obj);
                do {
                } while (a2.processUnconfinedEvent());
            } finally {
                C89663z.m155643b(context2, a3);
            }
        } catch (Throwable th) {
            mo144113a(th, (Throwable) null);
        } finally {
            a2.decrementUseCount(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89537az(AbstractC89507ah ahVar, AbstractC89124d<? super T> dVar) {
        super(0);
        this.f203257d = ahVar;
        this.f203258e = dVar;
        this.f203259i = (AbstractC89111e) (!(dVar instanceof AbstractC89111e) ? null : dVar);
        this.f203256b = C89663z.m155641a(getContext());
        this._reusableCancellableContinuation = null;
    }
}
