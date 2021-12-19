package com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77130b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84941d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.b */
public final class C76982b extends AbstractC77130b<StoryEditEffectPanelViewModel> {

    /* renamed from: a */
    public C76984c f172720a;

    /* renamed from: b */
    private final AbstractC89171a<StoryEditEffectPanelViewModel> f172721b;

    /* renamed from: c */
    private final AbstractC22186b f172722c;

    /* renamed from: d */
    private final int f172723d = R.id.c7m;

    static {
        Covode.recordClassIndex(89980);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<StoryEditEffectPanelViewModel> mo23031b() {
        return this.f172721b;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f172722c;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.b$a */
    static final class C76983a extends AbstractC89220m implements AbstractC89171a<StoryEditEffectPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C21582f f172724a;

        static {
            Covode.recordClassIndex(89981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76983a(C21582f fVar) {
            super(0);
            this.f172724a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryEditEffectPanelViewModel invoke() {
            return new StoryEditEffectPanelViewModel(this.f172724a);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        if (this.f172720a != null) {
            C76984c cVar = this.f172720a;
            if (cVar == null) {
                C89219l.m154710a("scene");
            }
            cVar.mo120536b().mo120537a();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (this.f172720a == null) {
            C76984c cVar = new C76984c(getDiContainer());
            this.f172722c.mo36387a(this.f172723d, cVar, "StoryEditEffectPanelScene");
            this.f172720a = cVar;
        }
        C76984c cVar2 = this.f172720a;
        if (cVar2 == null) {
            C89219l.m154710a("scene");
        }
        AbstractC22219j jVar = cVar2.f52551o;
        if (!(jVar instanceof AbstractC22186b)) {
            jVar = null;
        }
        AbstractC22186b bVar = (AbstractC22186b) jVar;
        if (bVar != null) {
            bVar.mo36417e(cVar2);
        }
        AbstractC84941d dVar = cVar2.mo120536b().f172744b;
        if (dVar == null) {
            C89219l.m154710a("transitionView");
        }
        dVar.mo86258a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f
    /* renamed from: a */
    public final /* synthetic */ void mo120490a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120490a(vEEditClip2);
        mo38334j().mo33689c(StoryEditEffectPanelViewModel.C76979c.f172718a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76982b(C21582f fVar, AbstractC22186b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172722c = bVar;
        this.f172721b = new C76983a(fVar);
    }
}
