package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.e */
public final class C83619e implements AbstractC75633m {

    /* renamed from: a */
    private final AbstractC89183m<Effect, Boolean, C89391z> f186688a;

    static {
        Covode.recordClassIndex(97506);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C83619e(AbstractC89183m<? super Effect, ? super Boolean, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        this.f186688a = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C75619b a = aVar.mo119345a(cVar);
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            if (aVar2.f170024c != EnumC75295a.RECOVER) {
                this.f186688a.invoke(aVar2.f170022a, true);
            }
        } else if (cVar instanceof C75621d) {
            this.f186688a.invoke(cVar.mo119346a(), false);
        }
        return a;
    }
}
