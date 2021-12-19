package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
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
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.property.C65394cg;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71393k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import com.p2082ss.android.ugc.gamora.editor.p4277d.C82145a;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a */
public final class C52377a extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120648a = {new C89232y(C52377a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: g */
    public static final C52380c f120649g = new C52380c((byte) 0);

    /* renamed from: b */
    public RelativeLayout f120650b;

    /* renamed from: c */
    public View f120651c;

    /* renamed from: d */
    LinearLayout f120652d;

    /* renamed from: e */
    final Map<Integer, View> f120653e = new LinkedHashMap();

    /* renamed from: f */
    C52412m f120654f;

    /* renamed from: h */
    private final AbstractC89244h f120655h;

    /* renamed from: i */
    private final AbstractC89248d f120656i = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: j */
    private final AbstractC89244h f120657j = C89250i.m154774a(EnumC89331m.NONE, new C52378a(this));

    /* renamed from: k */
    private final boolean f120658k = C65350at.m117036a();

    /* renamed from: l */
    private final C21582f f120659l;

    static {
        Covode.recordClassIndex(61769);
    }

    /* renamed from: a */
    public final FTCEditToolbarViewModel mo88164a() {
        return (FTCEditToolbarViewModel) this.f120655h.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final VideoPublishEditModel mo88165b() {
        return (VideoPublishEditModel) this.f120656i.mo23374a(this, f120648a[0]);
    }

    /* renamed from: d */
    public final AbstractC72510a mo88166d() {
        return (AbstractC72510a) this.f120657j.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$c */
    public static final class C52380c {
        static {
            Covode.recordClassIndex(61772);
        }

        private C52380c() {
        }

        public /* synthetic */ C52380c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120659l;
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$a */
    public static final class C52378a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f120660a;

        static {
            Covode.recordClassIndex(61770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52378a(AbstractC21566a aVar) {
            super(0);
            this.f120660a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f120660a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.toolbar.C52377a.C52378a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C52412m mVar = this.f120654f;
        if (mVar != null) {
            mVar.mo88171a();
        }
    }

    /* renamed from: C */
    private final boolean m97281C() {
        String str = mo88165b().mMusicPath;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$b */
    public static final class C52379b extends AbstractC89220m implements AbstractC89171a<FTCEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120661a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120662b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120663c;

        static {
            Covode.recordClassIndex(61771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52379b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120661a = jVar;
            this.f120662b = cVar;
            this.f120663c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120661a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120663c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120663c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120662b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m97290x9eeccfa8(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120661a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120662b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m97290x9eeccfa8(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.toolbar.C52377a.C52379b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m97290x9eeccfa8(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$h */
    public static final class C52385h extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52377a f120669a;

        static {
            Covode.recordClassIndex(61777);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52385h(C52377a aVar) {
            super(600);
            this.f120669a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C73991bj.m130128a("VEVideoPublishEditActivity nextStep OnClick");
            this.f120669a.mo88166d().mo114789N();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$d */
    public static final class C52381d extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83395y f120664a;

        /* renamed from: b */
        final /* synthetic */ C52377a f120665b;

        static {
            Covode.recordClassIndex(61773);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f120665b.mo88164a().mo88149a(this.f120664a.f186262a);
        }

        C52381d(C83395y yVar, C52377a aVar) {
            this.f120664a = yVar;
            this.f120665b = aVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RelativeLayout m97282a(C52377a aVar) {
        RelativeLayout relativeLayout = aVar.f120650b;
        if (relativeLayout == null) {
            C89219l.m154710a("bottomLayout");
        }
        return relativeLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$f */
    static final class C52383f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52377a f120667a;

        static {
            Covode.recordClassIndex(61775);
        }

        C52383f(C52377a aVar) {
            this.f120667a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f120667a.f120651c;
                if (view == null) {
                    C89219l.m154710a("nextStep");
                }
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    public C52377a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f120659l = fVar;
        AbstractC89277c a = C89204ab.m154669a(FTCEditToolbarViewModel.class);
        this.f120655h = C89250i.m154773a((AbstractC89171a) new C52379b(this, a, a));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        Serializable serializable;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList<String> arrayList;
        Intent intent;
        super.mo22704a(bundle);
        selectNonNullSubscribe(mo88164a(), C52386b.f120670a, new C20370ah(), new C52382e(this));
        C1213t<Boolean> g = mo88164a().mo88158g();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        g.observe((ActivityC0945e) activity, new C52383f(this));
        selectNonNullSubscribe(mo88164a(), C52387c.f120671a, new C20370ah(), new C52384g(this));
        VideoLengthChecker.m126409a().mo113258a(mo88166d(), this, mo88164a());
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
        int i6 = 2131232548;
        int i7 = 2131232580;
        int i8 = 2131232345;
        if (!"slideshow".equals(C71817eu.m126792c(mo88165b())) || !z) {
            if (m97281C()) {
                if (this.f120658k) {
                    i3 = 2131232532;
                } else {
                    i3 = 2131232345;
                }
                arrayList2.add(new C83395y(1, i3, R.string.db5));
            } else {
                if (this.f120658k) {
                    i2 = 2131232590;
                } else {
                    i2 = 2131232589;
                }
                arrayList2.add(new C83395y(7, i2, R.string.fzc));
            }
            if (!this.f120658k) {
                i6 = 2131232547;
            }
            arrayList2.add(new C83395y(2, i6, R.string.bkw));
            if (!this.f120658k) {
                i7 = 2131232579;
            }
            arrayList2.add(new C83395y(3, i7, R.string.hc5));
            mo88164a().mo88152a(arrayList2);
        } else {
            if (m97281C()) {
                if (this.f120658k) {
                    i5 = 2131232532;
                } else {
                    i5 = 2131232345;
                }
                arrayList2.add(new C83395y(1, i5, R.string.db5));
            }
            if (!C65394cg.m117094a()) {
                if (!this.f120658k) {
                    i6 = 2131232547;
                }
                arrayList2.add(new C83395y(2, i6, R.string.bkw));
            }
            if (!this.f120658k) {
                i7 = 2131232579;
            }
            arrayList2.add(new C83395y(3, i7, R.string.hc5));
            mo88164a().mo88152a(arrayList2);
        }
        FTCEditToolbarViewModel a = mo88164a();
        String string = mo36486t().getString(R.string.db5);
        C89219l.m154716b(string, "");
        C89219l.m154721d(string, "");
        a.mo33689c(new FTCEditToolbarViewModel.C52369i(string));
        if (C70005cr.m123611a().f156482a != null) {
            Activity t = mo36486t();
            if (this.f120658k) {
                i4 = 2131232532;
            } else {
                i4 = 2131232531;
            }
            Drawable a2 = C0643b.m2369a(t, i4);
            if (a2 != null) {
                FTCEditToolbarViewModel a3 = mo88164a();
                C89219l.m154716b(a2, "");
                a3.mo88151a(a2);
            }
        } else {
            Activity t2 = mo36486t();
            if (this.f120658k) {
                i8 = 2131232532;
            }
            Drawable a4 = C0643b.m2369a(t2, i8);
            if (a4 != null) {
                FTCEditToolbarViewModel a5 = mo88164a();
                C89219l.m154716b(a4, "");
                a5.mo88151a(a4);
            }
        }
        C71529w.m126419a("music", -1);
        C71529w.m126419a("effect", C71529w.f160308f);
        if (C71529w.m126421a("text")) {
            C71529w.m126419a("text", -1);
        } else {
            C71529w.m126419a("text", C71529w.f160306d);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$g */
    static final class C52384g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52377a f120668a;

        static {
            Covode.recordClassIndex(61776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52384g(C52377a aVar) {
            super(2);
            this.f120668a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            ViewGroup.LayoutParams layoutParams = C52377a.m97282a(this.f120668a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = intValue;
                C52377a.m97282a(this.f120668a).setLayoutParams(marginLayoutParams);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        if (this.f52549m != null) {
            Activity activity = this.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            if (C82145a.m142163a(activity)) {
                View a = C1764a.m5927a(layoutInflater, R.layout.asr, viewGroup, false);
                C89219l.m154716b(a, "");
                return a;
            }
        }
        View a2 = C1764a.m5927a(layoutInflater, R.layout.asq, viewGroup, false);
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$e */
    static final class C52382e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, List<? extends C83395y>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52377a f120666a;

        static {
            Covode.recordClassIndex(61774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52382e(C52377a aVar) {
            super(2);
            this.f120666a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, List<? extends C83395y> list) {
            MethodCollector.m26663i(12307);
            List<? extends C83395y> list2 = list;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(list2, "");
            C52377a aVar = this.f120666a;
            LinearLayout linearLayout = aVar.f120652d;
            if (linearLayout == null) {
                C89219l.m154710a("bottomBarContainer");
            }
            linearLayout.removeAllViews();
            aVar.f120653e.clear();
            for (T t : list2) {
                Activity activity = aVar.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                C71393k a = C71393k.C71394a.m126095a(activity, t.f186264c, t.f186263b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) C13628n.m24520b(aVar.mo36483q(), 4.0f);
                LinearLayout linearLayout2 = aVar.f120652d;
                if (linearLayout2 == null) {
                    C89219l.m154710a("bottomBarContainer");
                }
                linearLayout2.addView(a, layoutParams);
                aVar.f120653e.put(Integer.valueOf(t.f186262a), a);
                a.setOnClickListener(new C52381d(t, aVar));
            }
            C52412m mVar = aVar.f120654f;
            if (mVar != null) {
                mVar.mo88171a();
            }
            Activity activity2 = aVar.f52549m;
            if (activity2 != null) {
                ActivityC0945e eVar = (ActivityC0945e) activity2;
                VideoPublishEditModel b = aVar.mo88165b();
                FTCEditToolbarViewModel a2 = aVar.mo88164a();
                AbstractC22219j jVar = aVar.f52551o;
                if (jVar != null) {
                    C52412m mVar2 = new C52412m(eVar, b, a2, (AbstractC22186b) jVar);
                    mVar2.mo88173a(aVar.f120653e);
                    mVar2.mo88175b(aVar.f120653e);
                    mVar2.mo88176c(aVar.f120653e);
                    mVar2.mo88177d(aVar.f120653e);
                    View view = aVar.f120653e.get(1);
                    if (view != null) {
                        mVar2.mo88172a(aVar, (C71393k) view);
                    }
                    aVar.f120654f = mVar2;
                    C89391z zVar = C89391z.f203057a;
                    MethodCollector.m26664o(12307);
                    return zVar;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                MethodCollector.m26664o(12307);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.m26664o(12307);
            throw nullPointerException2;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        Typeface a;
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.c3e);
        C89219l.m154716b(c, "");
        this.f120650b = (RelativeLayout) c;
        View c2 = mo36475c(R.id.uf);
        C89219l.m154716b(c2, "");
        this.f120652d = (LinearLayout) c2;
        View c3 = mo36475c(R.id.csd);
        C89219l.m154716b(c3, "");
        this.f120651c = c3;
        if (c3 == null) {
            C89219l.m154710a("nextStep");
        }
        c3.setOnClickListener(new C52385h(this));
        View view2 = this.f120651c;
        if (view2 == null) {
            C89219l.m154710a("nextStep");
        }
        if (!(view2 instanceof TextView)) {
            view2 = null;
        }
        TextView textView = (TextView) view2;
        if (!(textView == null || (a = C17301b.m32033a().mo27611a(C17303d.f41573g)) == null)) {
            textView.setTypeface(a);
        }
        Activity activity = this.f52549m;
        if (activity != null) {
            C89219l.m154716b(activity, "");
            if (!C82145a.m142163a(activity)) {
                return;
            }
            if (C78099c.m136517a(activity)) {
                View view3 = this.f120651c;
                if (view3 == null) {
                    C89219l.m154710a("nextStep");
                }
                view3.setBackground(C0643b.m2369a(activity, (int) R.drawable.e2));
                return;
            }
            View view4 = this.f120651c;
            if (view4 == null) {
                C89219l.m154710a("nextStep");
            }
            view4.setBackground(C0643b.m2369a(activity, (int) R.drawable.e1));
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
