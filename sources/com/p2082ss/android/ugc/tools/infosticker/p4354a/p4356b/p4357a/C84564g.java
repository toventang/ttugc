package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4357a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84566b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.C84605m;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84467b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.g */
public final class C84564g extends AbstractC84467b<Effect, C84605m> implements AbstractC84566b {
    static {
        Covode.recordClassIndex(98529);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84564g(AbstractC89171a<? extends AbstractC84398d> aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84467b
    /* renamed from: a */
    public final /* synthetic */ C84605m mo129442a(Effect effect) {
        C89219l.m154721d(effect, "");
        return new C84605m();
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84467b
    /* renamed from: a */
    public final Exception mo129441a(Effect effect, ExceptionResult exceptionResult) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(exceptionResult, "");
        return exceptionResult.getException();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84467b
    /* renamed from: b */
    public final /* synthetic */ C84605m mo129444b(Effect effect, ExceptionResult exceptionResult) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(exceptionResult, "");
        return new C84605m(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84467b
    /* renamed from: a */
    public final /* synthetic */ Effect mo129443a(Effect effect, Effect effect2) {
        C89219l.m154721d(effect, "");
        return effect2 == null ? effect : effect2;
    }
}
