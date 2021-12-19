package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
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
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.edit.EditMusicStruct;
import com.p2082ss.android.ugc.aweme.services.edit.MusicTimeStruct;
import com.p2082ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71393k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.AbstractC72705b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.C72704a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.EnumC72711d;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
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

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac */
public class C83138ac extends AbstractC22186b implements AbstractC20382b, AbstractC21566a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f185780b = {new C89232y(C83138ac.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: h */
    public static final C83142d f185781h = new C83142d((byte) 0);

    /* renamed from: c */
    public final Map<Integer, C71393k> f185782c = new LinkedHashMap();

    /* renamed from: d */
    LinearLayout f185783d;

    /* renamed from: e */
    public ViewGroup f185784e;

    /* renamed from: f */
    public TuxButton f185785f;

    /* renamed from: g */
    public final boolean f185786g;

    /* renamed from: i */
    private final AbstractC89244h f185787i;

    /* renamed from: j */
    private final AbstractC89244h f185788j;

    /* renamed from: k */
    private final AbstractC89244h f185789k;

    /* renamed from: l */
    private final AbstractC89248d f185790l;

    /* renamed from: t */
    private View f185791t;

    /* renamed from: u */
    private final C21582f f185792u;

    static {
        Covode.recordClassIndex(97022);
    }

    /* renamed from: H */
    private final ReplaceMusicToolbarViewModel m143554H() {
        return (ReplaceMusicToolbarViewModel) this.f185788j.getValue();
    }

    /* renamed from: E */
    public final EditToolbarViewModel mo62771E() {
        return (EditToolbarViewModel) this.f185787i.getValue();
    }

    /* renamed from: F */
    public final AbstractC72510a mo128287F() {
        return (AbstractC72510a) this.f185789k.getValue();
    }

    /* renamed from: G */
    public final VideoPublishEditModel mo128288G() {
        return (VideoPublishEditModel) this.f185790l.mo23374a(this, f185780b[0]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$d */
    public static final class C83142d {
        static {
            Covode.recordClassIndex(97026);
        }

        private C83142d() {
        }

        public /* synthetic */ C83142d(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f185792u;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$a */
    public static final class C83139a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185793a;

        static {
            Covode.recordClassIndex(97023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83139a(AbstractC21566a aVar) {
            super(0);
            this.f185793a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185793a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83138ac.C83139a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$b */
    public static final class C83140b extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185794a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185795b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185796c;

        static {
            Covode.recordClassIndex(97024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83140b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185794a = jVar;
            this.f185795b = cVar;
            this.f185796c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185794a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185796c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185796c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185795b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143562x5eeb5114(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185794a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185795b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143562x5eeb5114(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83138ac.C83140b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143562x5eeb5114(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$c */
    public static final class C83141c extends AbstractC89220m implements AbstractC89171a<ReplaceMusicToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185797a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185798b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185799c;

        static {
            Covode.recordClassIndex(97025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83141c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185797a = jVar;
            this.f185798b = cVar;
            this.f185799c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185797a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185799c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185799c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185798b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143563x72932495(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185797a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185798b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143563x72932495(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83138ac.C83141c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_toolbar_ReplaceMusicToolbarScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143563x72932495(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$e */
    public static final class C83143e extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83395y f185800a;

        /* renamed from: b */
        final /* synthetic */ C83138ac f185801b;

        static {
            Covode.recordClassIndex(97027);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f185801b.mo62771E().mo128237a(this.f185800a.f186262a);
        }

        C83143e(C83395y yVar, C83138ac acVar) {
            this.f185800a = yVar;
            this.f185801b = acVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$f */
    static final class View$OnClickListenerC83144f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83138ac f185802a;

        static {
            Covode.recordClassIndex(97028);
        }

        View$OnClickListenerC83144f(C83138ac acVar) {
            this.f185802a = acVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity activity = this.f185802a.f52549m;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxButton m143555a(C83138ac acVar) {
        TuxButton tuxButton = acVar.f185785f;
        if (tuxButton == null) {
            C89219l.m154710a("postButton");
        }
        return tuxButton;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$l */
    static final class C83150l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83138ac f185808a;

        static {
            Covode.recordClassIndex(97034);
        }

        C83150l(C83138ac acVar) {
            this.f185808a = acVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((Boolean) ((C89386u) obj).getFirst()).booleanValue()) {
                ViewGroup viewGroup = this.f185808a.f185784e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.f185808a.f185784e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
    }

    public C83138ac(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f185792u = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditToolbarViewModel.class);
        this.f185787i = C89250i.m154773a((AbstractC89171a) new C83140b(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(ReplaceMusicToolbarViewModel.class);
        this.f185788j = C89250i.m154773a((AbstractC89171a) new C83141c(this, a2, a2));
        this.f185789k = C89250i.m154774a(EnumC89331m.NONE, new C83139a(this));
        this.f185790l = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f185786g = C65350at.m117036a();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$j */
    static final class C83148j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83138ac f185806a;

        static {
            Covode.recordClassIndex(97032);
        }

        C83148j(C83138ac acVar) {
            this.f185806a = acVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            int i3;
            MethodCollector.m26663i(11525);
            AbstractC31071f fVar = (AbstractC31071f) obj;
            C83138ac acVar = this.f185806a;
            boolean l = C70976bp.m125316l(acVar.mo128288G());
            View c = acVar.mo36475c(R.id.c7f);
            C89219l.m154716b(c, "");
            acVar.f185783d = (LinearLayout) c;
            ArrayList arrayList = new ArrayList();
            if (acVar.f185786g) {
                i = 2131232532;
            } else {
                i = 2131232345;
            }
            int i4 = 1;
            arrayList.add(new C83395y(1, i, R.string.db5));
            if (!l) {
                if (acVar.f185786g) {
                    i2 = 2131232544;
                } else {
                    i2 = 2131232543;
                }
                arrayList.add(new C83395y(8, i2, R.string.b3k));
                if (acVar.f185786g) {
                    i3 = 2131232590;
                } else {
                    i3 = 2131232589;
                }
                arrayList.add(new C83395y(7, i3, R.string.fzc));
            }
            for (T t : arrayList) {
                Activity activity = acVar.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                C71393k a = C71393k.C71394a.m126095a(activity, t.f186264c, t.f186263b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) C13628n.m24520b(acVar.mo36483q(), 4.0f);
                LinearLayout linearLayout = acVar.f185783d;
                if (linearLayout == null) {
                    C89219l.m154710a("bottomBarContainer");
                }
                linearLayout.addView(a, layoutParams);
                acVar.f185782c.put(Integer.valueOf(t.f186262a), a);
                a.setOnClickListener(new C83143e(t, acVar));
                if (t.f186262a == 8) {
                    a.setEnabled(false);
                    a.setAlpha(0.5f);
                }
            }
            if (C70976bp.m125300a() && C70976bp.m125314j(this.f185806a.mo128288G())) {
                C70005cr.m123611a().mo70083a((C69905c) null);
                VideoPublishEditModel G = this.f185806a.mo128288G();
                C89219l.m154721d(G, "");
                if (G.videoDurationFromVideoCutPage > 0) {
                    C72704a.m128170a(new AbstractC72705b.C72709d(G.getPreviewInfo().getVideoList().get(0).getVideoPath(), (long) G.videoDurationFromVideoCutPage, EnumC72711d.NORMAL, G.creationId, G.microAppId, false));
                }
            }
            VideoPublishEditModel G2 = this.f185806a.mo128288G();
            int j = fVar.mo56368j();
            C89219l.m154721d(G2, "");
            C33744d dVar = new C33744d();
            dVar.mo59983a("creation_id", G2.creationId);
            dVar.mo59983a("group_id", G2.replaceMusicModel.getAid());
            dVar.mo59983a("shoot_way", G2.mShootWay);
            dVar.mo59983a("content_source", "upload");
            if (j < 61000) {
                i4 = 0;
            }
            C83252z.f185985a = i4;
            dVar.mo59980a("is_long_video", i4);
            dVar.mo59983a("music_id", G2.replaceMusicModel.getMid());
            C39162r.m79460a("click_change_music_icon", dVar.f79943a);
            MethodCollector.m26664o(11525);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$i */
    static final class View$OnClickListenerC83147i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83138ac f185805a;

        static {
            Covode.recordClassIndex(97031);
        }

        View$OnClickListenerC83147i(C83138ac acVar) {
            this.f185805a = acVar;
        }

        public final void onClick(View view) {
            int i;
            int min;
            ClickAgent.onClick(view);
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null) {
                Activity t = this.f185805a.mo36486t();
                C89219l.m154716b(t, "");
                new C23144b(t).mo37640e(R.string.dgy).mo37637b();
                return;
            }
            ReplaceMusicServiceImpl.m143543a().setClickPost(true);
            ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();
            replaceMusicRequest.setItemID(this.f185805a.mo128288G().replaceMusicModel.getAid());
            replaceMusicRequest.setOriginalVid(this.f185805a.mo128288G().replaceMusicModel.getVid());
            EditMusicStruct editMusicStruct = new EditMusicStruct();
            String musicId = cVar.getMusicId();
            C89219l.m154716b(musicId, "");
            editMusicStruct.setMusicID(musicId);
            editMusicStruct.setMusicVolume(String.valueOf((int) ((this.f185805a.mo128288G().musicVolume * 100.0f) / 2.0f)));
            MusicTimeStruct musicTimeStruct = new MusicTimeStruct();
            musicTimeStruct.setStartTime((long) this.f185805a.mo128288G().mMusicStart);
            AbstractC31071f value = this.f185805a.mo128287F().mo114778C().getValue();
            if (value != null) {
                i = value.mo56368j();
            } else {
                i = 0;
            }
            VideoPublishEditModel G = this.f185805a.mo128288G();
            C89219l.m154721d(G, "");
            if (C70005cr.m123611a().f156482a == null) {
                min = 0;
            } else {
                int a = C80418fa.m139406a(G.mMusicPath);
                if (C70005cr.m123611a().f156482a != null) {
                    C69905c cVar2 = C70005cr.m123611a().f156482a;
                    if (cVar2 == null) {
                        C89219l.m154715b();
                    }
                    if (cVar2.getShootDuration() > 0) {
                        C69905c cVar3 = C70005cr.m123611a().f156482a;
                        if (cVar3 == null) {
                            C89219l.m154715b();
                        }
                        if (Math.abs(a - cVar3.getShootDuration()) >= 1000) {
                            C69905c cVar4 = C70005cr.m123611a().f156482a;
                            if (cVar4 == null) {
                                C89219l.m154715b();
                            }
                            a = cVar4.getShootDuration();
                        }
                    }
                }
                min = Math.min(G.mMusicStart + i, G.mMusicStart + a);
            }
            musicTimeStruct.setEndTime((long) min);
            editMusicStruct.setMusicTime(musicTimeStruct);
            StringBuilder sb = new StringBuilder("click post mid : ");
            String musicID = editMusicStruct.getMusicID();
            if (musicID == null) {
                musicID = "null";
            }
            C84911q.m145922a("ReplaceMusicToolbarScene", sb.append(musicID).append("volume ").append(editMusicStruct.getMusicVolume()).append("itemID ").append(replaceMusicRequest.getItemID()).append("startTime ").append(musicTimeStruct.getStartTime()).append("endTime ").append(musicTimeStruct.getEndTime()).toString());
            replaceMusicRequest.setEditMusicStruct(editMusicStruct);
            ReplaceMusicServiceImpl.m143543a().setReplaceMusicRequest(replaceMusicRequest);
            ReplaceMusicServiceImpl.m143543a().setCover(this.f185805a.mo128288G().replaceMusicModel.getCover());
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            AbstractC63167ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
            C89219l.m154716b(applicationService, "");
            Class<? extends ActivityC0945e> e = applicationService.mo93776e();
            C89219l.m154716b(e, "");
            Intent intent = new Intent(this.f185805a.f52549m, e);
            intent.addFlags(603979776);
            Activity t2 = this.f185805a.mo36486t();
            C84349a.m145093a(intent, t2);
            t2.startActivity(intent);
            VideoPublishEditModel G2 = this.f185805a.mo128288G();
            String musicId2 = cVar.getMusicId();
            C89219l.m154716b(musicId2, "");
            C89219l.m154721d(G2, "");
            C89219l.m154721d(musicId2, "");
            C33744d dVar = new C33744d();
            dVar.mo59983a("creation_id", G2.creationId);
            dVar.mo59983a("group_id", G2.replaceMusicModel.getAid());
            dVar.mo59983a("shoot_way", G2.mShootWay);
            dVar.mo59983a("content_source", "upload");
            dVar.mo59980a("is_long_video", C83252z.f185985a);
            dVar.mo59983a("music_id", G2.replaceMusicModel.getMid());
            dVar.mo59983a("replace_music_id", musicId2);
            C39162r.m79460a("publish_replace_music", dVar.f79943a);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$m */
    static final class C83151m extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        public static final C83151m f185809a = new C83151m();

        static {
            Covode.recordClassIndex(97035);
        }

        C83151m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            bool.booleanValue();
            C89219l.m154721d(bVar, "");
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.atg, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        this.f185784e = viewGroup2;
        if (viewGroup2 == null) {
            C89219l.m154715b();
        }
        return viewGroup2;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$g */
    static final class C83145g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83138ac f185803a;

        static {
            Covode.recordClassIndex(97029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83145g(C83138ac acVar) {
            super(2);
            this.f185803a = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            ViewGroup.LayoutParams layoutParams;
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            ViewGroup viewGroup = this.f185803a.f185784e;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = intValue;
                ViewGroup viewGroup2 = this.f185803a.f185784e;
                if (viewGroup2 != null) {
                    viewGroup2.setLayoutParams(marginLayoutParams2);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$k */
    static final class C83149k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83138ac f185807a;

        static {
            Covode.recordClassIndex(97033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83149k(C83138ac acVar) {
            super(2);
            this.f185807a = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            if (C70976bp.m125302a(this.f185807a.mo128288G(), this.f185807a.mo128288G().mMusicPath)) {
                C71393k kVar = this.f185807a.f185782c.get(8);
                if (kVar != null) {
                    kVar.setEnabled(true);
                }
                C71393k kVar2 = this.f185807a.f185782c.get(8);
                if (kVar2 != null) {
                    kVar2.setAlpha(1.0f);
                }
            } else {
                C71393k kVar3 = this.f185807a.f185782c.get(8);
                if (kVar3 != null) {
                    kVar3.setEnabled(false);
                }
                C71393k kVar4 = this.f185807a.f185782c.get(8);
                if (kVar4 != null) {
                    kVar4.setAlpha(0.5f);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ac$h */
    static final class C83146h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Drawable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83138ac f185804a;

        static {
            Covode.recordClassIndex(97030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83146h(C83138ac acVar) {
            super(2);
            this.f185804a = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Drawable drawable) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(drawable, "");
            if (C70005cr.m123611a().f156482a == null) {
                C83138ac.m143555a(this.f185804a).setButtonVariant(2);
                if (this.f185804a.f185786g) {
                    C71393k kVar = this.f185804a.f185782c.get(1);
                    if (kVar != null) {
                        kVar.setIcon(2131232532);
                    }
                } else {
                    C71393k kVar2 = this.f185804a.f185782c.get(1);
                    if (kVar2 != null) {
                        kVar2.setIcon(2131232345);
                    }
                }
            } else {
                C83138ac.m143555a(this.f185804a).setButtonVariant(0);
                if (this.f185804a.f185786g) {
                    C71393k kVar3 = this.f185804a.f185782c.get(1);
                    if (kVar3 != null) {
                        kVar3.setIcon(2131232532);
                    }
                } else {
                    C71393k kVar4 = this.f185804a.f185782c.get(1);
                    if (kVar4 != null) {
                        kVar4.setIcon(2131232531);
                    }
                }
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar != null && !TextUtils.isEmpty(cVar.getMusicId())) {
                    VideoPublishEditModel G = this.f185804a.mo128288G();
                    String musicId = cVar.getMusicId();
                    C89219l.m154716b(musicId, "");
                    C89219l.m154721d(G, "");
                    C89219l.m154721d(musicId, "");
                    C33744d dVar = new C33744d();
                    dVar.mo59983a("creation_id", G.creationId);
                    dVar.mo59983a("group_id", G.replaceMusicModel.getAid());
                    dVar.mo59983a("shoot_way", G.mShootWay);
                    dVar.mo59983a("content_source", "upload");
                    dVar.mo59980a("is_long_video", C83252z.f185985a);
                    dVar.mo59983a("music_id", G.replaceMusicModel.getMid());
                    dVar.mo59983a("replace_music_id", musicId);
                    C39162r.m79460a("select_replace_music", dVar.f79943a);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.pf);
        C89219l.m154716b(c, "");
        this.f185791t = c;
        View c2 = mo36475c(R.id.d51);
        C89219l.m154716b(c2, "");
        this.f185785f = (TuxButton) c2;
        View view2 = this.f185791t;
        if (view2 == null) {
            C89219l.m154710a("backView");
        }
        view2.setOnClickListener(new View$OnClickListenerC83144f(this));
        mo128288G().musicVolume = 0.0f;
        TuxButton tuxButton = this.f185785f;
        if (tuxButton == null) {
            C89219l.m154710a("postButton");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC83147i(this));
        mo128287F().mo114778C().observe(this, new C83148j(this));
        AbstractC20382b.C20383a.m38603b(this, m143554H(), C83153ae.f185811a, new C83149k(this));
        mo128287F().mo114781F().observe(getLifecycleOwner(), new C83150l(this));
        AbstractC20382b.C20383a.m38603b(this, m143554H(), C83154af.f185812a, C83151m.f185809a);
        selectNonNullSubscribe(mo62771E(), C83155ag.f185813a, new C20370ah(), new C83145g(this));
        selectNonNullSubscribe(mo62771E(), C83152ad.f185810a, new C20370ah(), new C83146h(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
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
