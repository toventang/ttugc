package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84436a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.c.c */
public final class C84530c implements AbstractC84436a {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f188934a;

    static {
        Covode.recordClassIndex(98495);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84530c(AbstractC89171a<? extends AbstractC84398d> aVar) {
        C89219l.m154721d(aVar, "");
        this.f188934a = aVar;
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84436a
    /* renamed from: a */
    public final boolean mo129418a(Effect effect) {
        C89219l.m154721d(effect, "");
        return this.f188934a.invoke().mo78918c(effect);
    }
}
