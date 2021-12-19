package com.p2082ss.android.ugc.aweme.ftc.components.audioeffect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.filter.C50634a;
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51970b;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70878m;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70825a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70835b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a.AbstractC70830d;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g */
public final class C51990g extends AbstractC22219j implements AbstractC20382b, AbstractC21566a, AbstractC70878m {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f119762a = {new C89232y(C51990g.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: w */
    public static final C51993c f119763w = new C51993c((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f119764A;

    /* renamed from: B */
    private final C21582f f119765B;

    /* renamed from: b */
    public boolean f119766b;

    /* renamed from: c */
    public View f119767c;

    /* renamed from: d */
    TextView f119768d;

    /* renamed from: e */
    View f119769e;

    /* renamed from: f */
    public RecyclerView f119770f;

    /* renamed from: g */
    C50634a f119771g;

    /* renamed from: h */
    public AbstractC40906e f119772h;

    /* renamed from: i */
    public C51976c f119773i;

    /* renamed from: j */
    public RecyclerView.AbstractC1362i f119774j;

    /* renamed from: k */
    public int f119775k;

    /* renamed from: l */
    public int f119776l;

    /* renamed from: t */
    AbstractC70830d f119777t;

    /* renamed from: u */
    public AbstractC31071f f119778u;

    /* renamed from: v */
    FrameLayout f119779v;

    /* renamed from: x */
    private int f119780x = 1;

    /* renamed from: y */
    private final AbstractC89248d f119781y = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: z */
    private final AbstractC89244h f119782z;

    static {
        Covode.recordClassIndex(61362);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo87714a() {
        return (VideoPublishEditModel) this.f119781y.mo23374a(this, f119762a[0]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo87717b() {
        return (AbstractC72510a) this.f119764A.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$c */
    public static final class C51993c {
        static {
            Covode.recordClassIndex(61365);
        }

        private C51993c() {
        }

        public /* synthetic */ C51993c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119765B;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$d */
    public static final class C51994d implements C70837c.AbstractC70842e {

        /* renamed from: a */
        final /* synthetic */ C51990g f119787a;

        static {
            Covode.recordClassIndex(61366);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c.AbstractC70842e
        /* renamed from: a */
        public final void mo87720a(String str) {
            C89219l.m154721d(str, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$d$a */
        static final class RunnableC51995a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C51994d f119788a;

            /* renamed from: b */
            final /* synthetic */ CategoryPageModel f119789b;

            static {
                Covode.recordClassIndex(61367);
            }

            RunnableC51995a(C51994d dVar, CategoryPageModel categoryPageModel) {
                this.f119788a = dVar;
                this.f119789b = categoryPageModel;
            }

            public final void run() {
                this.f119788a.f119787a.mo87715a(this.f119789b, true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51994d(C51990g gVar) {
            this.f119787a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c.AbstractC70842e
        /* renamed from: a */
        public final void mo87719a(CategoryPageModel categoryPageModel) {
            RecyclerView recyclerView = this.f119787a.f119770f;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC51995a(this, categoryPageModel));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$a */
    public static final class C51991a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119783a;

        static {
            Covode.recordClassIndex(61363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51991a(AbstractC21566a aVar) {
            super(0);
            this.f119783a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119783a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51990g.C51991a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$f */
    public static final class C51997f extends AbstractC40906e.C40907a {

        /* renamed from: a */
        final /* synthetic */ C51990g f119791a;

        static {
            Covode.recordClassIndex(61369);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: a */
        public final void mo70104a() {
            this.f119791a.f119766b = true;
            AbstractC40906e eVar = this.f119791a.f119772h;
            if (eVar != null) {
                eVar.mo70104a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: b */
        public final void mo70106b() {
            AbstractC40906e eVar = this.f119791a.f119772h;
            if (eVar != null) {
                eVar.mo70106b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: c */
        public final void mo70108c() {
            AbstractC40906e eVar = this.f119791a.f119772h;
            if (eVar != null) {
                eVar.mo70108c();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: d */
        public final void mo70109d() {
            this.f119791a.f119766b = false;
            AbstractC40906e eVar = this.f119791a.f119772h;
            if (eVar != null) {
                eVar.mo70109d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51997f(C51990g gVar) {
            this.f119791a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: a */
        public final void mo70105a(float f, int i, int i2) {
            AbstractC40906e eVar = this.f119791a.f119772h;
            if (eVar != null) {
                eVar.mo70105a(f, i, i2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: b */
        public final void mo70107b(float f, int i, int i2) {
            AbstractC40906e eVar = this.f119791a.f119772h;
            if (eVar != null) {
                eVar.mo70107b(f, i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$i */
    public static final class C52000i extends AbstractC40906e.C40907a {

        /* renamed from: a */
        final /* synthetic */ C51990g f119794a;

        static {
            Covode.recordClassIndex(61372);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: d */
        public final void mo70109d() {
            this.f119794a.mo87717b().mo114805a((AbstractC72510a) true, false, true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52000i(C51990g gVar) {
            this.f119794a = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$e */
    public static final class C51996e extends C40903b {

        /* renamed from: a */
        final /* synthetic */ C51990g f119790a;

        static {
            Covode.recordClassIndex(61368);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40903b, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
        /* renamed from: d */
        public final void mo70109d() {
            super.mo70109d();
            AbstractC22186b bVar = (AbstractC22186b) this.f119790a.f52551o;
            if (bVar != null) {
                bVar.mo36413d(this.f119790a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51996e(C51990g gVar) {
            this.f119790a = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo87718d() {
        mo87715a(C70835b.m125101b(), false);
        C70837c.C70838a.m125105a().mo112011a(new C51994d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$k */
    public static final class C52002k extends C40903b {

        /* renamed from: a */
        final /* synthetic */ C51990g f119796a;

        static {
            Covode.recordClassIndex(61374);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40903b, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
        /* renamed from: a */
        public final void mo70104a() {
            View view = this.f119796a.f119767c;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.f119796a.f119774j != null) {
                RecyclerView.AbstractC1362i iVar = this.f119796a.f119774j;
                Objects.requireNonNull(iVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) iVar).mo4347a(this.f119796a.f119775k, this.f119796a.f119776l);
            }
            super.mo70104a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52002k(C51990g gVar) {
            this.f119796a = gVar;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C51970b.C51971a.m96696a();
        AbstractC46415f b = C51970b.C51971a.m96697b();
        if (b != null) {
            b.destroy();
        }
        C51970b.f119720b = null;
        C51970b.C51971a.m96696a();
        C51970b.C51971a.m96698c().mo112027a();
        AbstractC70830d dVar = this.f119777t;
        if (dVar != null) {
            dVar.mo112000a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$b */
    public static final class C51992b extends AbstractC89220m implements AbstractC89171a<FTCEditAudioEffectViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f119784a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f119785b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f119786c;

        static {
            Covode.recordClassIndex(61364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51992b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f119784a = jVar;
            this.f119785b = cVar;
            this.f119786c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f119784a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f119786c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f119786c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f119785b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m96733xe664ead5(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f119784a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f119785b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m96733xe664ead5(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51990g.C51992b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_audioeffect_FTCEditAudioEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m96733xe664ead5(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70878m
    /* renamed from: a */
    public final void mo87716a(Effect effect) {
        AbstractC70830d dVar = this.f119777t;
        if (dVar != null) {
            dVar.mo112001a(effect);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$h */
    static final class C51999h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51990g f119793a;

        static {
            Covode.recordClassIndex(61371);
        }

        C51999h(C51990g gVar) {
            this.f119793a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            IAudioEffectParam iAudioEffectParam = (IAudioEffectParam) obj;
            VideoPublishEditModel a = this.f119793a.mo87714a();
            if (!(iAudioEffectParam instanceof AudioEffectParam)) {
                iAudioEffectParam = null;
            }
            a.veAudioEffectParam = (AudioEffectParam) iAudioEffectParam;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$g */
    static final class View$OnClickListenerC51998g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51990g f119792a;

        static {
            Covode.recordClassIndex(61370);
        }

        View$OnClickListenerC51998g(C51990g gVar) {
            this.f119792a = gVar;
        }

        public final void onClick(View view) {
            View g;
            ClickAgent.onClick(view);
            C51990g gVar = this.f119792a;
            RecyclerView.AbstractC1362i iVar = gVar.f119774j;
            int i = 0;
            if (!(iVar == null || (g = iVar.mo4717g(0)) == null)) {
                gVar.f119776l = g.getLeft();
                if (gVar.f119774j != null) {
                    i = RecyclerView.AbstractC1362i.m4426e(g);
                }
                gVar.f119775k = i;
            }
            C50634a aVar = gVar.f119771g;
            if (aVar != null) {
                aVar.mo70112b(new C51996e(gVar));
            }
        }
    }

    public C51990g(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f119765B = fVar;
        AbstractC89277c a = C89204ab.m154669a(FTCEditAudioEffectViewModel.class);
        this.f119782z = C89250i.m154773a((AbstractC89171a) new C51992b(this, a, a));
        this.f119764A = C89250i.m154774a(EnumC89331m.NONE, new C51991a(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        this.f119780x = C70825a.m125084a(mo87714a());
        mo87717b().mo114832u().observe(this, new C51999h(this));
        this.f119772h = new C52000i(this);
        selectNonNullSubscribe((FTCEditAudioEffectViewModel) this.f119782z.getValue(), C52003h.f119797a, new C20370ah(), new C52001j(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.g$j */
    static final class C52001j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51990g f119795a;

        static {
            Covode.recordClassIndex(61373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52001j(C51990g gVar) {
            super(2);
            this.f119795a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            C51976c cVar = this.f119795a.f119773i;
            if (cVar != null) {
                cVar.mo87706b(0);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87715a(CategoryPageModel categoryPageModel, boolean z) {
        C51976c cVar;
        if (categoryPageModel != null && (cVar = this.f119773i) != null) {
            cVar.mo87704a(categoryPageModel, z);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.aso, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a;
        this.f119779v = frameLayout;
        if (frameLayout == null) {
            C89219l.m154710a("parentLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
