package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.l */
public final class C75632l implements AbstractC75633m {

    /* renamed from: a */
    public final AbstractC75549i f170046a;

    static {
        Covode.recordClassIndex(88563);
    }

    public C75632l(AbstractC75549i iVar) {
        C89219l.m154721d(iVar, "");
        this.f170046a = iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C75619b a = aVar.mo119345a(cVar);
        if (cVar instanceof C75618a) {
            this.f170046a.mo119216a(((C75618a) cVar).f170022a);
        }
        return a;
    }
}
