package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71393k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d */
public final class C52388d extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120672a = {new C89232y(C52388d.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: h */
    public static final C52391c f120673h = new C52391c((byte) 0);

    /* renamed from: b */
    public ConstraintLayout f120674b;

    /* renamed from: c */
    public ImageView f120675c;

    /* renamed from: d */
    public TextView f120676d;

    /* renamed from: e */
    public ViewGroup f120677e;

    /* renamed from: f */
    public final Map<Integer, View> f120678f = new LinkedHashMap();

    /* renamed from: g */
    public C52421p f120679g;

    /* renamed from: i */
    private final AbstractC89244h f120680i;

    /* renamed from: j */
    private final AbstractC89248d f120681j = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: k */
    private C52412m f120682k;

    /* renamed from: l */
    private final AbstractC89244h f120683l = C89250i.m154774a(EnumC89331m.NONE, new C52389a(this));

    /* renamed from: t */
    private final boolean f120684t = C65350at.m117036a();

    /* renamed from: u */
    private final C21582f f120685u;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$j */
    static final class C52398j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, List<? extends C83395y>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52388d f120696a;

        static {
            Covode.recordClassIndex(61790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52398j(C52388d dVar) {
            super(2);
            this.f120696a = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$j$b */
        public static final class C52400b implements AbstractC52411l {
            static {
                Covode.recordClassIndex(61792);
            }

            C52400b() {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$j$a */
        public static final class C52399a extends AbstractView$OnClickListenerC81432d {

            /* renamed from: a */
            final /* synthetic */ C83395y f120697a;

            /* renamed from: b */
            final /* synthetic */ C52398j f120698b;

            /* renamed from: c */
            final /* synthetic */ List f120699c;

            /* renamed from: d */
            final /* synthetic */ Map f120700d;

            static {
                Covode.recordClassIndex(61791);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                this.f120698b.f120696a.mo88168a().mo88149a(this.f120697a.f186262a);
            }

            C52399a(C83395y yVar, C52398j jVar, List list, Map map) {
                this.f120697a = yVar;
                this.f120698b = jVar;
                this.f120699c = list;
                this.f120700d = map;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, List<? extends C83395y> list) {
            MethodCollector.m26663i(12150);
            List<? extends C83395y> list2 = list;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list2) {
                Activity activity = this.f120696a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                C71393k a = C71393k.C71394a.m126095a(activity, t.f186264c, t.f186263b);
                arrayList.add(a);
                linkedHashMap.put(Integer.valueOf(t.f186262a), a);
                a.setOnClickListener(new C52399a(t, this, arrayList, linkedHashMap));
            }
            this.f120696a.f120678f.clear();
            this.f120696a.f120678f.putAll(linkedHashMap);
            C52388d.m97294b(this.f120696a).removeAllViews();
            C52421p pVar = this.f120696a.f120679g;
            if (pVar != null) {
                pVar.mo88181d();
            }
            C52388d dVar = this.f120696a;
            ViewGroup b = C52388d.m97294b(this.f120696a);
            Activity t2 = this.f120696a.mo36486t();
            C89219l.m154716b(t2, "");
            C52421p pVar2 = new C52421p(b, arrayList, t2);
            if (!pVar2.f120730d.isEmpty()) {
                pVar2.mo88178a();
            }
            if (pVar2.f120730d.size() > 4) {
                pVar2.mo88179b();
            }
            pVar2.f120727a = new C52400b();
            dVar.f120679g = pVar2;
            this.f120696a.mo88167C();
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(12150);
            return zVar;
        }
    }

    static {
        Covode.recordClassIndex(61780);
    }

    /* renamed from: a */
    public final FTCEditToolbarViewModel mo88168a() {
        return (FTCEditToolbarViewModel) this.f120680i.getValue();
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo88169b() {
        return (VideoPublishEditModel) this.f120681j.mo23374a(this, f120672a[0]);
    }

    /* renamed from: d */
    public final AbstractC72510a mo88170d() {
        return (AbstractC72510a) this.f120683l.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$c */
    public static final class C52391c {
        static {
            Covode.recordClassIndex(61783);
        }

        private C52391c() {
        }

        public /* synthetic */ C52391c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120685u;
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$a */
    public static final class C52389a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f120686a;

        static {
            Covode.recordClassIndex(61781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52389a(AbstractC21566a aVar) {
            super(0);
            this.f120686a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f120686a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.toolbar.C52388d.C52389a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C52412m mVar = this.f120682k;
        if (mVar != null) {
            mVar.mo88171a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$b */
    public static final class C52390b extends AbstractC89220m implements AbstractC89171a<FTCEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120687a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120688b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120689c;

        static {
            Covode.recordClassIndex(61782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52390b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120687a = jVar;
            this.f120688b = cVar;
            this.f120689c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120687a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120689c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120689c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120688b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m97303xa64e552f(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120687a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120688b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m97303xa64e552f(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.toolbar.C52388d.C52390b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m97303xa64e552f(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: C */
    public final void mo88167C() {
        C52412m mVar = this.f120682k;
        if (mVar != null) {
            mVar.mo88171a();
        }
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoPublishEditModel b = mo88169b();
        FTCEditToolbarViewModel a = mo88168a();
        AbstractC22219j jVar = this.f52551o;
        Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C52412m mVar2 = new C52412m((ActivityC0945e) activity, b, a, (AbstractC22186b) jVar);
        mVar2.mo88173a(this.f120678f);
        mVar2.mo88175b(this.f120678f);
        mVar2.mo88176c(this.f120678f);
        mVar2.mo88177d(this.f120678f);
        View view = this.f120678f.get(1);
        if (view != null) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
            mVar2.mo88172a(this, (C71393k) view);
        }
        this.f120682k = mVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$l */
    public static final class C52402l extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52388d f120702a;

        static {
            Covode.recordClassIndex(61794);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52402l(C52388d dVar) {
            this.f120702a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            this.f120702a.mo88170d().mo114785J();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$m */
    public static final class C52403m extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52388d f120703a;

        static {
            Covode.recordClassIndex(61795);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52403m(C52388d dVar) {
            this.f120703a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            C80510gr.m139527a("camera_start");
            this.f120703a.mo88170d().mo114785J();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m97293a(C52388d dVar) {
        TextView textView = dVar.f120676d;
        if (textView == null) {
            C89219l.m154710a("mTvBackTip");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewGroup m97294b(C52388d dVar) {
        ViewGroup viewGroup = dVar.f120677e;
        if (viewGroup == null) {
            C89219l.m154710a("mToolbarContainer");
        }
        return viewGroup;
    }

    /* renamed from: c */
    public static final /* synthetic */ ConstraintLayout m97295c(C52388d dVar) {
        ConstraintLayout constraintLayout = dVar.f120674b;
        if (constraintLayout == null) {
            C89219l.m154710a("titleLayout");
        }
        return constraintLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$e */
    static final class C52393e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52388d f120691a;

        static {
            Covode.recordClassIndex(61785);
        }

        C52393e(C52388d dVar) {
            this.f120691a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                ViewGroup b = C52388d.m97294b(this.f120691a);
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                b.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$k */
    static final class C52401k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52388d f120701a;

        static {
            Covode.recordClassIndex(61793);
        }

        C52401k(C52388d dVar) {
            this.f120701a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            if (obj != null) {
                AbstractC31071f value = this.f120701a.mo88170d().mo114778C().getValue();
                if (value != null) {
                    i = value.mo56368j();
                } else {
                    i = 0;
                }
                if (i > this.f120701a.mo88169b().mCurMusicLength) {
                    this.f120701a.mo88168a().mo88157d(8, false);
                }
            }
        }
    }

    public C52388d(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f120685u = fVar;
        AbstractC89277c a = C89204ab.m154669a(FTCEditToolbarViewModel.class);
        this.f120680i = C89250i.m154773a((AbstractC89171a) new C52390b(this, a, a));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$d */
    static final class C52392d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52388d f120690a;

        static {
            Covode.recordClassIndex(61784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52392d(C52388d dVar) {
            super(2);
            this.f120690a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C52421p pVar = this.f120690a.f120679g;
            if (pVar != null) {
                pVar.mo88181d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$h */
    static final class C52396h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52388d f120694a;

        static {
            Covode.recordClassIndex(61788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52396h(C52388d dVar) {
            super(2);
            this.f120694a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            TextView a = C52388d.m97293a(this.f120694a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$i */
    static final class C52397i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52388d f120695a;

        static {
            Covode.recordClassIndex(61789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52397i(C52388d dVar) {
            super(2);
            this.f120695a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            C52388d.m97293a(this.f120695a).setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$f */
    static final class C52394f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52388d f120692a;

        static {
            Covode.recordClassIndex(61786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52394f(C52388d dVar) {
            super(2);
            this.f120692a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            ViewGroup.LayoutParams layoutParams = C52388d.m97295c(this.f120692a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = intValue;
                C52388d.m97295c(this.f120692a).setLayoutParams(marginLayoutParams);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$g */
    static final class C52395g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52388d f120693a;

        static {
            Covode.recordClassIndex(61787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52395g(C52388d dVar) {
            super(2);
            this.f120693a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            ImageView imageView = this.f120693a.f120675c;
            if (imageView == null) {
                C89219l.m154710a("mBackImageView");
            }
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asz, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a;
        this.f120674b = constraintLayout;
        if (constraintLayout == null) {
            C89219l.m154710a("titleLayout");
        }
        return constraintLayout;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        Serializable serializable;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList<String> arrayList;
        Intent intent;
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.pf);
        C89219l.m154716b(c, "");
        ImageView imageView = (ImageView) c;
        this.f120675c = imageView;
        if (imageView == null) {
            C89219l.m154710a("mBackImageView");
        }
        imageView.setImageResource(2131232188);
        ImageView imageView2 = this.f120675c;
        if (imageView2 == null) {
            C89219l.m154710a("mBackImageView");
        }
        imageView2.setOnClickListener(new C52402l(this));
        View c2 = mo36475c(R.id.esq);
        C89219l.m154716b(c2, "");
        TextView textView = (TextView) c2;
        this.f120676d = textView;
        if (textView == null) {
            C89219l.m154710a("mTvBackTip");
        }
        textView.setOnClickListener(new C52403m(this));
        View c3 = mo36475c(R.id.c7f);
        C89219l.m154716b(c3, "");
        this.f120677e = (ViewGroup) c3;
        selectNonNullSubscribe(mo88168a(), C52404e.f120704a, new C20370ah(), new C52395g(this));
        selectNonNullSubscribe(mo88168a(), C52406g.f120706a, new C20370ah(), new C52396h(this));
        selectNonNullSubscribe(mo88168a(), C52407h.f120707a, new C20370ah(), new C52397i(this));
        selectNonNullSubscribe(mo88168a(), C52408i.f120708a, new C20370ah(), new C52398j(this));
        AbstractC20382b.C20383a.m38603b(this, mo88168a(), C52409j.f120709a, new C52392d(this));
        C1213t<Boolean> l = mo88168a().mo88163l();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        l.observe((ActivityC0945e) activity, new C52393e(this));
        selectNonNullSubscribe(mo88168a(), C52405f.f120705a, new C20370ah(), new C52394f(this));
        ArrayList arrayList2 = new ArrayList();
        Activity activity2 = this.f52549m;
        C61288d dVar = null;
        if (activity2 == null || (intent = activity2.getIntent()) == null) {
            serializable = null;
        } else {
            serializable = intent.getSerializableExtra("key_mv_theme_data");
        }
        if (serializable instanceof C61288d) {
            dVar = serializable;
        }
        C61288d dVar2 = dVar;
        boolean z2 = false;
        if (dVar2 == null || (arrayList = dVar2.selectMediaList) == null) {
            i = 0;
        } else {
            i = arrayList.size();
        }
        if (i > 1) {
            z = true;
        } else {
            z = false;
        }
        int i7 = 2131232550;
        if (!"slideshow".equals(C71817eu.m126792c(mo88169b())) || !z) {
            if (!this.f120684t) {
                i7 = 2131232549;
            }
            arrayList2.add(new C83395y(5, i7, R.string.bvz));
            if (C70976bp.m125308d(mo88169b())) {
                if (this.f120684t) {
                    i6 = 2131232197;
                } else {
                    i6 = 2131232196;
                }
                arrayList2.add(new C83395y(13, i6, R.string.bj5));
            }
            if (C70976bp.m125310f(mo88169b())) {
                if (this.f120684t) {
                    i5 = 2131232588;
                } else {
                    i5 = 2131232587;
                }
                arrayList2.add(new C83395y(6, i5, R.string.z6));
            }
            if (C70976bp.m125313i(mo88169b())) {
                if (this.f120684t) {
                    i4 = 2131232562;
                } else {
                    i4 = 2131232561;
                }
                arrayList2.add(new C83395y(10, i4, R.string.ax4));
            }
            if (this.f120684t) {
                i2 = 2131232544;
            } else {
                i2 = 2131232543;
            }
            arrayList2.add(new C83395y(8, i2, R.string.b3k));
            if (mo88169b().mMusicPath != null) {
                if (this.f120684t) {
                    i3 = 2131232590;
                } else {
                    i3 = 2131232589;
                }
                arrayList2.add(new C83395y(7, i3, R.string.fzc));
            }
        } else {
            if (!this.f120684t) {
                i7 = 2131232549;
            }
            arrayList2.add(new C83395y(5, i7, R.string.bvz));
        }
        FTCEditToolbarViewModel a = mo88168a();
        C89219l.m154721d(arrayList2, "");
        a.mo33689c(new FTCEditToolbarViewModel.C52370j(arrayList2));
        if (mo88169b().mIsFromDraft) {
            if (mo88169b().isUploadVideo()) {
                mo88168a().mo88153a(false);
            } else {
                mo88168a().mo88153a(true);
            }
            if (mo88169b().isPhotoMvMode && mo88169b().getOriginal() == 1) {
                mo88168a().mo88153a(true);
                FTCEditToolbarViewModel a2 = mo88168a();
                Activity activity3 = this.f52549m;
                if (activity3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity3, "");
                String string = activity3.getResources().getString(R.string.az0);
                C89219l.m154716b(string, "");
                C89219l.m154721d(string, "");
                a2.mo33689c(new FTCEditToolbarViewModel.C52363c(string));
            }
        }
        if (C70976bp.m125312h(mo88169b())) {
            if (mo88169b().veAudioRecorderParam == null || !mo88169b().veAudioRecorderParam.hasRecord()) {
                mo88168a().mo88157d(6, false);
            } else {
                mo88168a().mo88157d(6, true);
            }
        }
        if (mo88169b().mMusicPath != null) {
            z2 = true;
        }
        mo88168a().mo88155b(8, z2);
        LiveData<AbstractC31071f> C = mo88170d().mo114778C();
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C.observe((ActivityC0218d) t, new C52401k(this));
        if (!C70976bp.m125310f(mo88169b())) {
            C71529w.m126419a("voice", -1);
        } else {
            C71529w.m126419a("voice", C71529w.f160309g);
        }
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
