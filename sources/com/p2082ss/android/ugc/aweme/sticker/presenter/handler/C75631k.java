package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.k */
public final class C75631k implements AbstractC75633m {

    /* renamed from: a */
    private final AbstractC89172b<Effect, C89391z> f170045a;

    static {
        Covode.recordClassIndex(88562);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75631k(AbstractC89172b<? super Effect, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f170045a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            if (aVar2.f170022a.getEffectType() == 2) {
                C75619b a = aVar.mo119345a(C75618a.m132676a(aVar2.f170022a, aVar2.f170023b, aVar2.f170024c, aVar2.f170026e));
                this.f170045a.invoke(aVar2.f170022a);
                return a;
            }
        }
        return aVar.mo119345a(cVar);
    }
}
