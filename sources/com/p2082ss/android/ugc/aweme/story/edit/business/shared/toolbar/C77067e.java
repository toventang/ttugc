package com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77130b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e */
public final class C77067e extends AbstractC77130b<StoryEditToolbarViewModel> {

    /* renamed from: a */
    public boolean f172880a;

    /* renamed from: b */
    final AbstractC22186b f172881b;

    /* renamed from: c */
    public final int f172882c = R.id.ask;

    /* renamed from: d */
    public final int f172883d = R.id.arg;

    /* renamed from: f */
    private final AbstractC89244h f172884f = C89250i.m154774a(EnumC89331m.NONE, new C77068a(this));

    /* renamed from: k */
    private final AbstractC89171a<StoryEditToolbarViewModel> f172885k = C77070c.f172888a;

    static {
        Covode.recordClassIndex(90068);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<StoryEditToolbarViewModel> mo23031b() {
        return this.f172885k;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f172881b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e$c */
    static final class C77070c extends AbstractC89220m implements AbstractC89171a<StoryEditToolbarViewModel> {

        /* renamed from: a */
        public static final C77070c f172888a = new C77070c();

        static {
            Covode.recordClassIndex(90071);
        }

        C77070c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryEditToolbarViewModel invoke() {
            return new StoryEditToolbarViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e$a */
    public static final class C77068a extends AbstractC89220m implements AbstractC89171a<AbstractC76760e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172886a;

        static {
            Covode.recordClassIndex(90069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77068a(AbstractC21566a aVar) {
            super(0);
            this.f172886a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172886a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.C77067e.C77068a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f, com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        ((AbstractC76760e) this.f172884f.getValue()).mo120447T().observe(this, new C77069b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e$b */
    static final class C77069b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C77067e f172887a;

        static {
            Covode.recordClassIndex(90070);
        }

        C77069b(C77067e eVar) {
            this.f172887a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (!this.f172887a.f172880a) {
                this.f172887a.f172881b.mo36387a(this.f172887a.f172882c, new C77071f(this.f172887a.getDiContainer()), "StoryEditToolbarScene");
                this.f172887a.f172881b.mo36387a(this.f172887a.f172883d, new C77050a(this.f172887a.getDiContainer()), "StoryEditBottomBarScene");
                this.f172887a.f172880a = true;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f
    /* renamed from: a */
    public final /* synthetic */ void mo120490a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120490a(vEEditClip2);
        if (this.f172880a) {
            ((StoryEditToolbarViewModel) mo38334j()).mo120603d(C77148a.m134761f(vEEditClip2.f172984g));
            mo38334j().mo33689c(new StoryEditToolbarViewModel.C77044c(!C77148a.m134760e(vEEditClip2.f172984g)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77067e(C21582f fVar, AbstractC22186b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172881b = bVar;
    }
}
