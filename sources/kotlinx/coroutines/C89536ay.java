package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89125e;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.ay */
public final class C89536ay {
    static {
        Covode.recordClassIndex(105627);
    }

    /* renamed from: a */
    public static final AbstractC89534ax m155465a(AbstractC89127f fVar) {
        AbstractC89127f.AbstractC89130b bVar = fVar.get(AbstractC89125e.f202840b);
        if (!(bVar instanceof AbstractC89534ax)) {
            bVar = null;
        }
        AbstractC89534ax axVar = (AbstractC89534ax) bVar;
        if (axVar == null) {
            return C89530au.f203249a;
        }
        return axVar;
    }

    /* renamed from: a */
    public static final Object m155464a(long j, AbstractC89124d<? super C89391z> dVar) {
        if (j <= 0) {
            return C89391z.f203057a;
        }
        C89672n nVar = new C89672n(C89099b.m154605a(dVar), 1);
        m155465a(nVar.getContext()).scheduleResumeAfterDelay(j, nVar);
        Object e = nVar.mo144218e();
        if (e == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return e;
    }
}
