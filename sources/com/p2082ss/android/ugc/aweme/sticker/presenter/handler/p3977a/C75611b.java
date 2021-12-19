package com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.AbstractC75586c;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a.b */
public final class C75611b implements AbstractC75633m {

    /* renamed from: a */
    private final AbstractC75586c f170011a;

    static {
        Covode.recordClassIndex(88542);
    }

    public C75611b(AbstractC75586c cVar) {
        C89219l.m154721d(cVar, "");
        this.f170011a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        int i = -1;
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            if (!aVar2.f170025d) {
                i = aVar2.f170022a.getEffectType() == 0 ? this.f170011a.mo119310a(aVar2.f170022a, false) : aVar2.f170022a.getEffectType() == -1 ? this.f170011a.mo119310a(aVar2.f170022a, false) : 0;
            }
        } else if (!(cVar instanceof C75621d)) {
            throw new C89376n();
        } else if (!((C75621d) cVar).f170031d) {
            i = this.f170011a.mo119309a();
        }
        return new C75619b(i);
    }
}
