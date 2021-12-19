package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89125e;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: kotlinx.coroutines.h */
public final /* synthetic */ class C89623h {
    static {
        Covode.recordClassIndex(105715);
    }

    /* renamed from: a */
    public static final <T> T m155552a(AbstractC89127f fVar, AbstractC89183m<? super AbstractC89516am, ? super AbstractC89124d<? super T>, ? extends Object> mVar) {
        AbstractC89552bl blVar;
        AbstractC89127f a;
        Thread currentThread = Thread.currentThread();
        AbstractC89125e eVar = (AbstractC89125e) fVar.get(AbstractC89125e.f202840b);
        if (eVar == null) {
            blVar = C89601cw.m155534a();
            a = C89506ag.m155440a(C89561bs.f203280a, fVar.plus(blVar));
        } else {
            if (!(eVar instanceof AbstractC89552bl)) {
                eVar = null;
            }
            blVar = (AbstractC89552bl) eVar;
            if (blVar == null || !blVar.shouldBeProcessedFromContext()) {
                blVar = C89601cw.m155535b();
            }
            a = C89506ag.m155440a(C89561bs.f203280a, fVar);
        }
        C89613e eVar2 = new C89613e(a, currentThread, blVar);
        eVar2.mo144033a(EnumC89524ao.DEFAULT, eVar2, mVar);
        return (T) eVar2.mo144154j();
    }
}
