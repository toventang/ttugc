package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89658u;
import kotlinx.coroutines.internal.C89663z;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;

/* renamed from: kotlinx.coroutines.bd */
public final class C89544bd {
    static {
        Covode.recordClassIndex(105635);
    }

    /* renamed from: a */
    public static final boolean m155485a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    private static boolean m155486b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    private static final void m155482a(AbstractC89543bc<?> bcVar) {
        AbstractC89552bl a = C89601cw.m155534a();
        if (a.isUnconfinedLoopActive()) {
            a.dispatchUnconfined(bcVar);
            return;
        }
        a.incrementUseCount(true);
        try {
            m155484a(bcVar, bcVar.mo144109i(), 2);
            do {
            } while (a.processUnconfinedEvent());
        } catch (Throwable th) {
            bcVar.mo144113a(th, (Throwable) null);
        } finally {
            a.decrementUseCount(true);
        }
    }

    /* renamed from: a */
    public static final <T> void m155483a(AbstractC89543bc<? super T> bcVar, int i) {
        AbstractC89124d<? super T> i2 = bcVar.mo144109i();
        if (!m155486b(i) || !(i2 instanceof C89537az) || m155485a(i) != m155485a(bcVar.f203264f)) {
            m155484a(bcVar, i2, i);
            return;
        }
        AbstractC89507ah ahVar = ((C89537az) i2).f203257d;
        AbstractC89127f context = i2.getContext();
        if (ahVar.isDispatchNeeded(context)) {
            ahVar.dispatch(context, bcVar);
        } else {
            m155482a(bcVar);
        }
    }

    /* renamed from: a */
    private static <T> void m155484a(AbstractC89543bc<? super T> bcVar, AbstractC89124d<? super T> dVar, int i) {
        Object d = bcVar.mo144108d();
        Throwable d2 = AbstractC89543bc.m155476d(d);
        if (d2 != null && (!C89527ar.f203245c || !(dVar instanceof AbstractC89111e) || (d2 = C89658u.m155628a(d2, (AbstractC89111e) dVar)) != null)) {
            d = C89382r.m154941a(d2);
        }
        Object r3 = C89379q.m157068constructorimpl(d);
        if (i == 0) {
            dVar.resumeWith(r3);
        } else if (i == 1) {
            C89541ba.m155472a(dVar, r3);
        } else if (i != 2) {
            throw new IllegalStateException("Invalid mode ".concat(String.valueOf(i)).toString());
        } else if (dVar != null) {
            C89537az azVar = (C89537az) dVar;
            AbstractC89127f context = azVar.getContext();
            Object a = C89663z.m155642a(context, azVar.f203256b);
            try {
                azVar.f203258e.resumeWith(r3);
            } finally {
                C89663z.m155643b(context, a);
            }
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
