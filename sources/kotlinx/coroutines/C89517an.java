package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.C89632e;
import kotlinx.coroutines.internal.C89657t;
import kotlinx.coroutines.p4637b.C89540b;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.an */
public final class C89517an {
    static {
        Covode.recordClassIndex(105606);
    }

    /* renamed from: a */
    public static final AbstractC89516am m155448a(AbstractC89127f fVar) {
        if (fVar.get(AbstractC89568bz.f203287c) == null) {
            fVar = fVar.plus(C89582cd.m155517a(null));
        }
        return new C89632e(fVar);
    }

    /* renamed from: b */
    public static final void m155450b(AbstractC89516am amVar) {
        AbstractC89568bz bzVar = (AbstractC89568bz) amVar.mo20678a().get(AbstractC89568bz.f203287c);
        if (bzVar != null) {
            bzVar.mo143985a((CancellationException) null);
            return;
        }
        throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(amVar)).toString());
    }

    /* renamed from: a */
    public static final boolean m155449a(AbstractC89516am amVar) {
        AbstractC89568bz bzVar = (AbstractC89568bz) amVar.mo20678a().get(AbstractC89568bz.f203287c);
        if (bzVar != null) {
            return bzVar.mo143993b();
        }
        return true;
    }

    /* renamed from: a */
    public static final <R> Object m155447a(AbstractC89183m<? super AbstractC89516am, ? super AbstractC89124d<? super R>, ? extends Object> mVar, AbstractC89124d<? super R> dVar) {
        C89657t tVar = new C89657t(dVar.getContext(), dVar);
        Object a = C89540b.m155470a(tVar, tVar, mVar);
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return a;
    }
}
