package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89659v;
import kotlinx.coroutines.internal.C89663z;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.ba */
public final class C89541ba {

    /* renamed from: a */
    public static final C89659v f203261a = new C89659v("UNDEFINED");

    /* renamed from: b */
    public static final C89659v f203262b = new C89659v("REUSABLE_CLAIMED");

    static {
        Covode.recordClassIndex(105632);
    }

    /* renamed from: a */
    public static final <T> void m155472a(AbstractC89124d<? super T> dVar, Object obj) {
        if (dVar instanceof C89537az) {
            C89537az azVar = (C89537az) dVar;
            Object a = C89500aa.m155437a(obj);
            if (azVar.f203257d.isDispatchNeeded(azVar.getContext())) {
                azVar.f203255a = a;
                azVar.f203264f = 1;
                azVar.f203257d.dispatch(azVar.getContext(), azVar);
                return;
            }
            AbstractC89552bl a2 = C89601cw.m155534a();
            if (a2.isUnconfinedLoopActive()) {
                azVar.f203255a = a;
                azVar.f203264f = 1;
                a2.dispatchUnconfined(azVar);
                return;
            }
            a2.incrementUseCount(true);
            try {
                AbstractC89568bz bzVar = (AbstractC89568bz) azVar.getContext().get(AbstractC89568bz.f203287c);
                if (bzVar == null || bzVar.mo143993b()) {
                    AbstractC89127f context = azVar.getContext();
                    Object a3 = C89663z.m155642a(context, azVar.f203256b);
                    try {
                        azVar.f203258e.resumeWith(obj);
                    } finally {
                        C89663z.m155643b(context, a3);
                    }
                } else {
                    azVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) bzVar.mo144009m())));
                }
                do {
                } while (a2.processUnconfinedEvent());
            } catch (Throwable th) {
                azVar.mo144113a(th, (Throwable) null);
            } finally {
                a2.decrementUseCount(true);
            }
        } else {
            dVar.resumeWith(obj);
        }
    }
}
