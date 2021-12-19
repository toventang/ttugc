package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a.p3978a.C75610b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.b */
public abstract class AbstractC75614b implements AbstractC75633m {

    /* renamed from: a */
    private Effect f170014a;

    static {
        Covode.recordClassIndex(88545);
    }

    /* renamed from: a */
    public abstract void mo23210a();

    /* renamed from: a */
    public abstract void mo23212a(C75619b bVar, C75618a aVar);

    /* renamed from: a */
    public abstract boolean mo23213a(C75618a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo119333b(C75618a aVar) {
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    private final C75619b m132660a(AbstractC75633m.AbstractC75634a aVar, AbstractC75620c cVar) {
        if (this.f170014a != null) {
            mo23210a();
            this.f170014a = null;
        }
        C75619b a = aVar.mo119345a(cVar);
        if (!(aVar instanceof C75610b)) {
            C89219l.m154721d(a, "");
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            if (!mo23213a(aVar2)) {
                return m132660a(aVar, cVar);
            }
            if (!(aVar instanceof C75610b)) {
                mo119333b(aVar2);
            }
            C75619b a = aVar.mo119345a(aVar2);
            mo23212a(a, aVar2);
            this.f170014a = aVar2.f170022a;
            return a;
        } else if (cVar instanceof C75621d) {
            return m132660a(aVar, cVar);
        } else {
            throw new C89376n();
        }
    }
}
