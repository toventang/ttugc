package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75492h;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76235h;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.sticker.widget.C76412b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.d */
public final class C76222d extends C76211b {
    static {
        Covode.recordClassIndex(89172);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f, com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76211b
    /* renamed from: a */
    public final void mo119951a(AbstractC76235h<Effect, C76210a<Effect>> hVar) {
        C89219l.m154721d(hVar, "");
        super.mo119951a(hVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76211b
    /* renamed from: b */
    public final void mo119953b(AbstractC76235h<Effect, C76210a<Effect>> hVar) {
        C89219l.m154721d(hVar, "");
        hVar.mo119957a(AbstractC76235h.C76236a.C76237a.f171252a, new C76223a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.d$a */
    static final class C76223a extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76222d f171232a;

        static {
            Covode.recordClassIndex(89173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76223a(C76222d dVar) {
            super(1);
            this.f171232a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76210a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            C75575k kVar = this.f171232a.f171214e.f169833g;
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            C89378p<FrameLayout, C85037b> a = C76412b.m133923a(kVar, context);
            FrameLayout component1 = a.component1();
            C85037b component2 = a.component2();
            if (this.f171232a.f171214e.f169833g.f169875t) {
                C75492h hVar = new C75492h(component1, component2, this.f171232a.f171212c, this.f171232a.f171213d, this.f171232a.f171236j);
                hVar.f169630a = this.f171232a.f171215f;
                return hVar;
            }
            C75492h hVar2 = new C75492h(component1, component2, this.f171232a.f171212c, this.f171232a.f171213d, this.f171232a.f171236j);
            hVar2.f169630a = this.f171232a.f171215f;
            return hVar2;
        }
    }

    public /* synthetic */ C76222d(AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b bVar, C75572h hVar, AbstractC75474b bVar2, AbstractC76085a aVar) {
        this(oVar, gVar, bVar, hVar, bVar2, aVar, new AbstractC76125l.C76126a(null, null, null, 127));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C76222d(AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar, C75572h hVar, AbstractC75474b bVar2, AbstractC76085a aVar, AbstractC76125l.C76126a aVar2) {
        super(oVar, gVar, bVar, hVar, bVar2, aVar, aVar2, null, Integer.MAX_VALUE);
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar2, "");
    }
}
