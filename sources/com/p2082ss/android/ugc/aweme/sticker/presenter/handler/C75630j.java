package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.j */
public final class C75630j extends AbstractC75614b {

    /* renamed from: a */
    private Effect f170040a;

    /* renamed from: b */
    private final AbstractC89171a<Boolean> f170041b;

    /* renamed from: c */
    private final AbstractC89172b<Effect, C89391z> f170042c;

    /* renamed from: d */
    private final AbstractC89171a<C89391z> f170043d;

    /* renamed from: e */
    private final AbstractC89171a<C89391z> f170044e;

    static {
        Covode.recordClassIndex(88561);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f170043d.invoke();
        this.f170040a = null;
    }

    /* renamed from: b */
    public final void mo119363b() {
        if (C75466g.m132367s(this.f170040a)) {
            this.f170043d.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132367s(aVar.f170022a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f170044e.invoke();
        if (this.f170040a != null) {
            this.f170043d.invoke();
        }
        if (this.f170041b.invoke().booleanValue()) {
            this.f170042c.invoke(aVar.f170022a);
        }
        this.f170040a = aVar.f170022a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75630j(AbstractC89171a<Boolean> aVar, AbstractC89172b<? super Effect, C89391z> bVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.f170041b = aVar;
        this.f170042c = bVar;
        this.f170043d = aVar2;
        this.f170044e = aVar3;
    }
}
