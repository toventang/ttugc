package com.p2082ss.android.ugc.gamora.editor.multiedit;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
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
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70299bu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71513p;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.C83254v;
import com.p2082ss.android.ugc.gamora.editor.progressbar.C82544d;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88297u;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
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

/* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c */
public final class C82408c extends AbstractC22186b implements AbstractC20382b, AbstractC21566a, AbstractC70299bu {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f184331b = {new C89232y(C82408c.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: e */
    public static final C82411c f184332e = new C82411c((byte) 0);

    /* renamed from: c */
    AbstractC31071f f184333c;

    /* renamed from: d */
    final View$OnClickListenerC71465f f184334d;

    /* renamed from: f */
    private final AbstractC89244h f184335f;

    /* renamed from: g */
    private final AbstractC89248d f184336g = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: h */
    private final AbstractC89244h f184337h = C89250i.m154774a(EnumC89331m.NONE, new C82409a(this));

    /* renamed from: i */
    private final int f184338i = 52;

    /* renamed from: j */
    private final int f184339j = 242;

    /* renamed from: k */
    private final C21582f f184340k;

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c$f */
    static final class View$OnClickListenerC82414f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC82414f f184347a = new View$OnClickListenerC82414f();

        static {
            Covode.recordClassIndex(96252);
        }

        View$OnClickListenerC82414f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(96246);
    }

    /* renamed from: K */
    private final MultiEditViewModel m142455K() {
        return (MultiEditViewModel) this.f184335f.getValue();
    }

    /* renamed from: E */
    public final VideoPublishEditModel mo62771E() {
        return (VideoPublishEditModel) this.f184336g.mo23374a(this, f184331b[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final AbstractC72510a mo127501F() {
        return (AbstractC72510a) this.f184337h.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c$c */
    public static final class C82411c {
        static {
            Covode.recordClassIndex(96249);
        }

        private C82411c() {
        }

        public /* synthetic */ C82411c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184340k;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70299bu
    /* renamed from: G */
    public final float mo87661G() {
        return this.f184334d.mo113083a();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c$a */
    public static final class C82409a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184341a;

        static {
            Covode.recordClassIndex(96247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82409a(AbstractC21566a aVar) {
            super(0);
            this.f184341a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184341a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.multiedit.C82408c.C82409a.invoke():com.bytedance.als.b");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final int mo127502H() {
        return (int) C13628n.m24520b(this.f52549m, (float) this.f184338i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo127503I() {
        return (int) C13628n.m24520b(this.f52549m, (float) this.f184339j);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f184334d.mo113091c();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        this.f184334d.mo113090b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final int mo127504J() {
        return (((C70636dh.m124836e(this.f52549m) - mo127502H()) - mo127503I()) - C70636dh.m124833c(this.f52549m)) - C70636dh.m124835d(this.f52549m);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (!C82544d.m142679a() && !C71513p.m126385a()) {
            this.f184334d.mo113090b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c$b */
    public static final class C82410b extends AbstractC89220m implements AbstractC89171a<MultiEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184342a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184343b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184344c;

        static {
            Covode.recordClassIndex(96248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82410b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184342a = jVar;
            this.f184343b = cVar;
            this.f184344c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184342a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184344c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184344c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184343b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142468x23c6878c(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184342a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184343b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142468x23c6878c(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.multiedit.C82408c.C82410b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_multiedit_MultiEditVideoScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142468x23c6878c(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        selectNonNullSubscribe(m142455K(), C82415d.f184348a, new C20370ah(), new C82412d(this));
        selectNonNullSubscribe(m142455K(), C82416e.f184349a, new C20370ah(), new C82413e(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c$e */
    static final class C82413e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82408c f184346a;

        static {
            Covode.recordClassIndex(96251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82413e(C82408c cVar) {
            super(2);
            this.f184346a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            AbstractC82036ac ap;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            AbstractC22219j jVar = this.f184346a.f52551o;
            if (!(jVar instanceof C83254v)) {
                jVar = null;
            }
            AbstractC82561d dVar = (AbstractC82561d) jVar;
            if (!(dVar == null || (ap = dVar.mo127624ap()) == null)) {
                ap.mo127274a();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.aev, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.dpl);
        View$OnClickListenerC71465f fVar = this.f184334d;
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C89219l.m154716b(frameLayout2, "");
        fVar.mo113085a((ActivityC0945e) activity, frameLayout2);
        frameLayout2.setVisibility(8);
        frameLayout2.setOnClickListener(View$OnClickListenerC82414f.f184347a);
        return frameLayout;
    }

    public C82408c(C21582f fVar, View$OnClickListenerC71465f fVar2) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar2, "");
        this.f184340k = fVar;
        this.f184334d = fVar2;
        AbstractC89277c a = C89204ab.m154669a(MultiEditViewModel.class);
        this.f184335f = C89250i.m154773a((AbstractC89171a) new C82410b(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.c$d */
    static final class C82412d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Boolean, ? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82408c f184345a;

        static {
            Covode.recordClassIndex(96250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82412d(C82408c cVar) {
            super(2);
            this.f184345a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Boolean, ? extends Boolean> pVar) {
            String str;
            String str2;
            C89378p<? extends Boolean, ? extends Boolean> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C82408c cVar = this.f184345a;
            boolean booleanValue = ((Boolean) pVar2.getFirst()).booleanValue();
            boolean booleanValue2 = ((Boolean) pVar2.getSecond()).booleanValue();
            VideoPublishEditModel E = this.f184345a.mo62771E();
            if (E != null) {
                E.copyMultiEditMusicInfo();
            }
            VEEditorAutoStartStopArbiter value = cVar.mo127501F().mo114779D().getValue();
            if (value != null) {
                value.f200071f = !booleanValue2;
            }
            if (booleanValue2) {
                boolean z = cVar.f184334d.f160145t.f160068f;
                C84425b c = C71427b.m126147c();
                if (booleanValue) {
                    str = "1";
                } else {
                    str = "0";
                }
                C84425b a = c.mo129406a("is_warn_shown", str);
                if (z) {
                    str2 = "single";
                } else {
                    str2 = "multiple";
                }
                C39162r.m79460a("enter_trim_page", a.mo129406a("segment_type", str2).f188764a);
            }
            if (!cVar.f184334d.f160145t.f160068f) {
                if (booleanValue2) {
                    cVar.mo127501F().mo114803a(C88297u.C88298a.m153448a(C77795c.m135910a(true, false, false, false), cVar.mo127502H() + C70636dh.m124833c(cVar.f52549m), cVar.mo127503I(), cVar.mo127504J(), C33398a.f79357a.mo59453d(), false, false, 960));
                } else {
                    AbstractC72510a F = cVar.mo127501F();
                    Activity activity = cVar.f52549m;
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    F.mo114803a(C88297u.C88298a.m153445a(C0643b.m2378c(activity, R.color.a2), cVar.mo127502H() + C70636dh.m124833c(cVar.f52549m), cVar.mo127503I(), cVar.mo127504J(), C33398a.f79357a.mo59453d()));
                }
            }
            cVar.f184334d.mo113088a(booleanValue2);
            return C89391z.f203057a;
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
