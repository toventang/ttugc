package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: kotlinx.coroutines.g */
public final class C89622g {
    static {
        Covode.recordClassIndex(105714);
    }

    /* renamed from: a */
    public static final <T> AbstractC89531av<T> m155549a(AbstractC89516am amVar, AbstractC89127f fVar, EnumC89524ao aoVar, AbstractC89183m<? super AbstractC89516am, ? super AbstractC89124d<? super T>, ? extends Object> mVar) {
        C89532aw awVar;
        AbstractC89127f a = C89506ag.m155440a(amVar, fVar);
        if (aoVar.isLazy()) {
            awVar = new C89585cg(a, mVar);
        } else {
            awVar = new C89532aw(a, true);
        }
        ((AbstractC89458a) awVar).mo144033a(aoVar, awVar, mVar);
        return awVar;
    }

    /* renamed from: b */
    public static final AbstractC89568bz m155551b(AbstractC89516am amVar, AbstractC89127f fVar, EnumC89524ao aoVar, AbstractC89183m<? super AbstractC89516am, ? super AbstractC89124d<? super C89391z>, ? extends Object> mVar) {
        AbstractC89458a crVar;
        AbstractC89127f a = C89506ag.m155440a(amVar, fVar);
        if (aoVar.isLazy()) {
            crVar = new C89586ch(a, mVar);
        } else {
            crVar = new C89596cr(a, true);
        }
        crVar.mo144033a(aoVar, crVar, mVar);
        return crVar;
    }
}
