package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89657t;
import kotlinx.coroutines.internal.C89663z;
import kotlinx.coroutines.p4637b.C89539a;
import kotlinx.coroutines.p4637b.C89540b;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89125e;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.i */
public final /* synthetic */ class C89624i {
    static {
        Covode.recordClassIndex(105716);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.concurrent.atomic.AtomicIntegerFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Object m155554a(AbstractC89127f fVar, AbstractC89183m<? super AbstractC89516am, ? super AbstractC89124d<? super T>, ? extends Object> mVar, AbstractC89124d<? super T> dVar) {
        boolean z;
        Object b;
        AbstractC89127f context = dVar.getContext();
        AbstractC89127f plus = context.plus(fVar);
        C89612de.m155541a(plus);
        if (plus == context) {
            C89657t tVar = new C89657t(plus, dVar);
            b = C89540b.m155470a(tVar, tVar, mVar);
        } else if (C89219l.m154714a(plus.get(AbstractC89125e.f202840b), context.get(AbstractC89125e.f202840b))) {
            C89609dc dcVar = new C89609dc(plus, dVar);
            Object a = C89663z.m155642a(plus, null);
            try {
                b = C89540b.m155470a(dcVar, dcVar, mVar);
            } finally {
                C89663z.m155643b(plus, a);
            }
        } else {
            C89542bb bbVar = new C89542bb(plus, dVar);
            bbVar.cS_();
            C89539a.m155469a(mVar, bbVar, bbVar);
            while (true) {
                int i = bbVar._decision;
                z = true;
                if (i == 0) {
                    if (C89542bb.f203263b.compareAndSet(bbVar, 0, 1)) {
                        break;
                    }
                } else if (i == 2) {
                    z = false;
                } else {
                    throw new IllegalStateException("Already suspended".toString());
                }
            }
            if (z) {
                b = EnumC89098a.COROUTINE_SUSPENDED;
            } else {
                b = C89584cf.m155519b(bbVar.mo144012p());
                if (b instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) b).cause;
                }
            }
        }
        if (b == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return b;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC89568bz m155555a(AbstractC89516am amVar, AbstractC89127f fVar, EnumC89524ao aoVar, AbstractC89183m mVar, int i) {
        if ((i & 1) != 0) {
            fVar = C89133g.INSTANCE;
        }
        if ((i & 2) != 0) {
            aoVar = EnumC89524ao.DEFAULT;
        }
        return C89622g.m155551b(amVar, fVar, aoVar, mVar);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC89531av m155556b(AbstractC89516am amVar, AbstractC89127f fVar, EnumC89524ao aoVar, AbstractC89183m mVar, int i) {
        if ((i & 1) != 0) {
            fVar = C89133g.INSTANCE;
        }
        if ((i & 2) != 0) {
            aoVar = EnumC89524ao.DEFAULT;
        }
        return C89622g.m155549a(amVar, fVar, aoVar, mVar);
    }
}
