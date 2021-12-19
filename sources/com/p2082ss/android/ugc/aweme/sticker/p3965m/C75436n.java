package com.p2082ss.android.ugc.aweme.sticker.p3965m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.n */
public final class C75436n implements AbstractC75633m {

    /* renamed from: a */
    public final ShortVideoContext f169516a;

    static {
        Covode.recordClassIndex(88355);
    }

    public C75436n(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        this.f169516a = shortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            String effectId = aVar2.f170022a.getEffectId();
            if (!(effectId == null || effectId.length() == 0)) {
                C75434l.m132305a("prop_try", C89041ag.m154428c(C89387v.m154943a("creation_id", this.f169516a.f155830o), C89387v.m154943a("shoot_way", this.f169516a.f155831p), C89387v.m154943a("content_source", this.f169516a.mo110034j().getContentSource()), C89387v.m154943a("content_type", this.f169516a.mo110034j().getContentType()), C89387v.m154943a("enter_from", "video_shoot_page"), C89387v.m154943a("prop_id", aVar2.f170022a.getEffectId())));
            }
        }
        return aVar.mo119345a(cVar);
    }
}
