package com.p2082ss.android.ugc.aweme.story.edit;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14536a;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45830f;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71513p;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.sticker.text.C75894b;
import com.p2082ss.android.ugc.aweme.sticker.text.C75896c;
import com.p2082ss.android.ugc.aweme.sticker.view.C76136b;
import com.p2082ss.android.ugc.aweme.story.base.C76627e;
import com.p2082ss.android.ugc.aweme.story.edit.C76748b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.AbstractC76841a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76853b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77156c;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.p4028a.C76745b;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.C76761f;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77609c;
import com.p2082ss.android.ugc.aweme.view.AbstractC81298w;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.c */
public final class C77095c extends AbstractC81298w implements AbstractC21566a, AbstractC33401b {

    /* renamed from: e */
    public static final C77098c f172931e = new C77098c((byte) 0);

    /* renamed from: b */
    public AbstractC14552j f172932b;

    /* renamed from: c */
    public SurfaceView f172933c;

    /* renamed from: d */
    public StoryEditModel f172934d;

    /* renamed from: i */
    private final AbstractC89244h f172935i = C89250i.m154774a(EnumC89331m.NONE, new C77096a(this));

    /* renamed from: j */
    private final AbstractC89244h f172936j = C89250i.m154773a((AbstractC89171a) new C77099d(this));

    /* renamed from: k */
    private final AbstractC89244h f172937k = C89250i.m154773a((AbstractC89171a) new C77100e(this));

    /* renamed from: l */
    private final AbstractC89244h f172938l = C89250i.m154773a((AbstractC89171a) new C77101f(this));

    /* renamed from: F */
    private final AbstractC76760e m134686F() {
        return (AbstractC76760e) this.f172935i.getValue();
    }

    /* renamed from: G */
    private final C77142e m134687G() {
        return (C77142e) this.f172938l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$c */
    public static final class C77098c {
        static {
            Covode.recordClassIndex(90099);
        }

        private C77098c() {
        }

        public /* synthetic */ C77098c(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: E */
    public final void mo62771E() {
        m134686F().mo120451Z();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$a */
    public static final class C77096a extends AbstractC89220m implements AbstractC89171a<AbstractC76760e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172939a;

        static {
            Covode.recordClassIndex(90097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77096a(AbstractC21566a aVar) {
            super(0);
            this.f172939a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172939a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.C77095c.C77096a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$d */
    static final class C77099d extends AbstractC89220m implements AbstractC89171a<AnalysisActivityComponent> {

        /* renamed from: a */
        final /* synthetic */ C77095c f172941a;

        static {
            Covode.recordClassIndex(90100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77099d(C77095c cVar) {
            super(0);
            this.f172941a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnalysisActivityComponent invoke() {
            return new AnalysisActivityComponent(this.f172941a.mo36486t(), this.f172941a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$f */
    static final class C77101f extends AbstractC89220m implements AbstractC89171a<C77142e> {

        /* renamed from: a */
        final /* synthetic */ C77095c f172943a;

        static {
            Covode.recordClassIndex(90102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77101f(C77095c cVar) {
            super(0);
            this.f172943a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77142e invoke() {
            return new C77142e(C22228c.m41832b(this.f172943a));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b
    /* renamed from: f */
    public final Analysis mo59474f() {
        return (Analysis) this.f172937k.getValue();
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        C21582f b = C2552c.m7464b(this);
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        C75896c.m133082a(new C45830f());
        super.mo36481o();
    }

    static {
        Covode.recordClassIndex(90096);
        C75894b.m133079a();
        C75896c.m133081a();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$e */
    static final class C77100e extends AbstractC89220m implements AbstractC89171a<Analysis> {

        /* renamed from: a */
        final /* synthetic */ C77095c f172942a;

        static {
            Covode.recordClassIndex(90101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77100e(C77095c cVar) {
            super(0);
            this.f172942a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Analysis invoke() {
            Analysis analysis = new Analysis();
            analysis.setLabelName("video_edit_page");
            analysis.setExtraMap(C89041ag.m154427b(C89387v.m154943a("creation_id", C77095c.m134688a(this.f172942a).getCreationId()), C89387v.m154943a("is_story_shoot", "1")));
            return analysis;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C71513p.f160269a = false;
        C75894b.m133080a(new C76136b());
        C63253l.f143623a.mo73306b().mo101552k().mo101565a(true);
        C72479d.m127866a(C72477c.f162474a).mo114738a("at_edit_page");
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: a */
    public final void mo120626a(boolean z) {
        m134687G();
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: b */
    public final void mo120627b(boolean z) {
        m134687G();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i */
    static final class C77104i extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77095c f172947a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f172948b;

        static {
            Covode.recordClassIndex(90105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77104i(C77095c cVar, VideoPublishEditModel videoPublishEditModel) {
            super(1);
            this.f172947a = cVar;
            this.f172948b = videoPublishEditModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$a */
        public static final class C77105a extends AbstractC21603p<VEEditClipCluster> {

            /* renamed from: a */
            final /* synthetic */ C77104i f172949a;

            static {
                Covode.recordClassIndex(90106);
            }

            public C77105a(C77104i iVar) {
                this.f172949a = iVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final VEEditClipCluster get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new VEEditClipCluster(this.f172949a.f172947a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$b */
        public static final class C77106b extends AbstractC21603p<SurfaceView> {

            /* renamed from: a */
            final /* synthetic */ C77104i f172950a;

            static {
                Covode.recordClassIndex(90107);
            }

            public C77106b(C77104i iVar) {
                this.f172950a = iVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final SurfaceView get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                SurfaceView surfaceView = this.f172950a.f172947a.f172933c;
                if (surfaceView == null) {
                    C89219l.m154710a("surfaceView");
                }
                return surfaceView;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$c */
        public static final class C77107c extends AbstractC21603p<AbstractC14552j> {

            /* renamed from: a */
            final /* synthetic */ C77104i f172951a;

            static {
                Covode.recordClassIndex(90108);
            }

            public C77107c(C77104i iVar) {
                this.f172951a = iVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC14552j get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                AbstractC14552j jVar = this.f172951a.f172947a.f172932b;
                if (jVar == null) {
                    C89219l.m154710a("gestureService");
                }
                return jVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$d */
        public static final class C77108d extends AbstractC21603p<StoryEditModel> {

            /* renamed from: a */
            final /* synthetic */ C77104i f172952a;

            static {
                Covode.recordClassIndex(90109);
            }

            public C77108d(C77104i iVar) {
                this.f172952a = iVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final StoryEditModel get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C77095c.m134688a(this.f172952a.f172947a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$g */
        public static final class C77111g extends AbstractC21603p<VideoPublishEditModel> {

            /* renamed from: a */
            final /* synthetic */ C77104i f172953a;

            static {
                Covode.recordClassIndex(90112);
            }

            public C77111g(C77104i iVar) {
                this.f172953a = iVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final VideoPublishEditModel get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f172953a.f172948b;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$h */
        public static final class C77112h extends AbstractC21603p<C56724i> {

            /* renamed from: a */
            final /* synthetic */ C77104i f172954a;

            static {
                Covode.recordClassIndex(90113);
            }

            public C77112h(C77104i iVar) {
                this.f172954a = iVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C56724i get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C56724i(this.f172954a.f172948b);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$e */
        public static final class C77109e extends AbstractC21603p<C77156c> {
            static {
                Covode.recordClassIndex(90110);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C77156c get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C77156c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.c$i$f */
        public static final class C77110f extends AbstractC21603p<AbstractC50651a> {
            static {
                Covode.recordClassIndex(90111);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC50651a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C76627e.f171965b.mo120334a();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(VEEditClipCluster.class, (String) null, (AbstractC21603p) new C77105a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(SurfaceView.class, (String) null, (AbstractC21603p) new C77106b(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC14552j.class, (String) null, (AbstractC21603p) new C77107c(this)), "");
            C89219l.m154716b(nVar2.mo35260a(StoryEditModel.class, (String) null, (AbstractC21603p) new C77108d(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C77156c.class, (String) null, (AbstractC21603p) new C77109e()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC50651a.class, (String) null, (AbstractC21603p) new C77110f()), "");
            C89219l.m154716b(nVar2.mo35260a(VideoPublishEditModel.class, (String) null, (AbstractC21603p) new C77111g(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C56724i.class, (String) null, (AbstractC21603p) new C77112h(this)), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$b */
    public static final class C77097b extends AbstractC21603p<C76761f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172940a;

        static {
            Covode.recordClassIndex(90098);
        }

        public C77097b(C2553d dVar) {
            this.f172940a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76761f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76761f(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$g */
    static final class C77102g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C77095c f172944a;

        static {
            Covode.recordClassIndex(90103);
        }

        C77102g(C77095c cVar) {
            this.f172944a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f172944a.mo124762M();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.c$h */
    public static final class C77103h extends AbstractC21603p<C76853b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172945a;

        /* renamed from: b */
        final /* synthetic */ C77095c f172946b;

        static {
            Covode.recordClassIndex(90104);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76853b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76853b(fVar, this.f172946b);
        }

        public C77103h(C2553d dVar, C77095c cVar) {
            this.f172945a = dVar;
            this.f172946b = cVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ StoryEditModel m134688a(C77095c cVar) {
        StoryEditModel storyEditModel = cVar.f172934d;
        if (storyEditModel == null) {
            C89219l.m154710a("editModel");
        }
        return storyEditModel;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        StoryEditModel storyEditModel;
        super.mo22704a(bundle);
        getLifecycle().mo4012a((AnalysisActivityComponent) this.f172936j.getValue());
        C71513p.f160269a = true;
        C75894b.m133080a(C76745b.f172256a);
        C75896c.m133083a(false, false, false);
        Bundle bundle2 = this.f52554r;
        if (bundle2 == null || (storyEditModel = (StoryEditModel) bundle2.getParcelable("extra_edit_model")) == null || storyEditModel.getClips().isEmpty()) {
            C22227b.m41826b(this).mo36525F();
            return;
        }
        this.f172934d = storyEditModel;
        C2556g.m7472a(this, new C77104i(this, C76740a.m134319a(storyEditModel)));
        C2551b bVar = new C2551b(C2552c.m7462a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C76761f.class, (String) null, (AbstractC21603p) new C77097b(dVar));
        alsLogicContainer.mo7005a(AbstractC76760e.class, C76761f.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C76853b.class, (String) null, (AbstractC21603p) new C77103h(dVar2, this));
        alsLogicContainer2.mo7005a(AbstractC76841a.class, C76853b.class);
        bVar.mo7031a();
        m134686F().mo120447T().observe(this, new C77102g(this));
        StoryEditModel storyEditModel2 = this.f172934d;
        if (storyEditModel2 == null) {
            C89219l.m154710a("editModel");
        }
        C89219l.m154721d(storyEditModel2, "");
        C77609c.m135599a("enter_video_edit_page");
        C76748b.m134344a("enter_video_edit_page", storyEditModel2, new C76748b.C76750b(storyEditModel2));
        C72479d.m127866a(C72477c.f162474a).mo114739a("at_edit_page", false);
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: a */
    public final void mo120625a(int i, int i2) {
        m134687G().mo87778a(i, i2);
        AbstractC76760e F = m134686F();
        F.mo114811c(i);
        F.mo114814d(i2);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b1y, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        View findViewById = viewGroup2.findViewById(R.id.ec9);
        C89219l.m154716b(findViewById, "");
        this.f172933c = (SurfaceView) findViewById;
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        this.f172932b = C14536a.m26550a(context, (FrameLayout) viewGroup2.findViewById(R.id.aro));
        return viewGroup2;
    }
}
