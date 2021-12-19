package com.p2082ss.android.ugc.aweme.profile.effect;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20466f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.e */
public final class C63713e extends AbstractC64118co implements AbstractC20380ar<C34499i>, AbstractC20527q, AbstractC63990as {

    /* renamed from: d */
    public static final C63718d f144446d = new C63718d((byte) 0);

    /* renamed from: a */
    public final C34499i f144447a = new C34499i();

    /* renamed from: b */
    public C63712d f144448b;

    /* renamed from: c */
    public boolean f144449c;

    /* renamed from: e */
    private final lifecycleAwareLazy f144450e;

    /* renamed from: j */
    private boolean f144451j;

    /* renamed from: k */
    private String f144452k;

    /* renamed from: l */
    private String f144453l;

    /* renamed from: m */
    private boolean f144454m;

    /* renamed from: n */
    private boolean f144455n;

    /* renamed from: o */
    private boolean f144456o;

    /* renamed from: p */
    private SparseArray f144457p;

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$b */
    public static final class C63715b extends AbstractC89220m implements AbstractC89183m<EffectProfileState, Bundle, EffectProfileState> {
        public static final C63715b INSTANCE = new C63715b();

        static {
            Covode.recordClassIndex(75042);
        }

        public C63715b() {
            super(2);
        }

        public final EffectProfileState invoke(EffectProfileState effectProfileState, Bundle bundle) {
            C89219l.m154719c(effectProfileState, "");
            return effectProfileState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$f */
    public static final class C63720f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> {
        public static final C63720f INSTANCE = new C63720f();

        static {
            Covode.recordClassIndex(75047);
        }

        public C63720f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C75445g> list) {
            invoke(iVar, list);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20477i iVar, List<? extends C75445g> list) {
            C89219l.m154719c(list, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$q */
    final /* synthetic */ class C63731q implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f144484a;

        static {
            Covode.recordClassIndex(75058);
        }

        C63731q(AbstractC89171a aVar) {
            this.f144484a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final /* synthetic */ void mo62679l() {
            C89219l.m154716b(this.f144484a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(75040);
    }

    /* renamed from: a */
    public final View mo102297a(int i) {
        if (this.f144457p == null) {
            this.f144457p = new SparseArray();
        }
        View view = (View) this.f144457p.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f144457p.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final EffectProfileListViewModel mo102298a() {
        return (EffectProfileListViewModel) this.f144450e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: g */
    public final void mo65254g() {
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$d */
    public static final class C63718d {
        static {
            Covode.recordClassIndex(75045);
        }

        private C63718d() {
        }

        public /* synthetic */ C63718d(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$g */
    public static final class C63721g implements AbstractC20443c<C75445g, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f144465a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f144466b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f144467c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f144468d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f144469e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> f144470f;

        static {
            Covode.recordClassIndex(75048);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f144468d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f144469e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> mo33775c() {
            return this.f144470f;
        }

        public C63721g(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f144465a = bVar;
            this.f144466b = mVar;
            this.f144467c = mVar2;
            this.f144468d = bVar;
            this.f144469e = mVar;
            this.f144470f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$h */
    public static final class C63722h implements AbstractC20443c<C75445g, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f144471a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f144472b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f144473c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f144474d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f144475e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> f144476f;

        static {
            Covode.recordClassIndex(75049);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f144474d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f144475e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> mo33775c() {
            return this.f144476f;
        }

        public C63722h(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f144471a = bVar;
            this.f144472b = mVar;
            this.f144473c = mVar2;
            this.f144474d = bVar;
            this.f144475e = mVar;
            this.f144476f = mVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final boolean ci_() {
        return this.f144449c;
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f144447a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        return mo102297a(R.id.doq);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$a */
    public static final class C63714a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f144458a;

        static {
            Covode.recordClassIndex(75041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63714a(AbstractC89277c cVar) {
            super(0);
            this.f144458a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f144458a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$i */
    static final /* synthetic */ class C63723i extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(75050);
        }

        C63723i(EffectProfileListViewModel effectProfileListViewModel) {
            super(0, effectProfileListViewModel, EffectProfileListViewModel.class, "loadMore", "loadMore()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((ListViewModel) this.receiver).mo33758l();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f144457p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final void bS_() {
        if (this.f144454m || this.f144455n || this.f144456o) {
            mo102300c();
        } else {
            mo102298a().mo33757k();
        }
    }

    /* renamed from: c */
    public final void mo102300c() {
        if (af_()) {
            m115240h();
            ((DmtStatusView) mo102297a(R.id.e7i)).mo27385g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as
    /* renamed from: k */
    public final boolean mo98052k() {
        if (!af_()) {
            return false;
        }
        ((RecyclerView) mo102297a(R.id.doq)).mo4413b(0);
        mo102298a().mo33757k();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$c */
    public static final class C63716c extends AbstractC89220m implements AbstractC89171a<EffectProfileListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f144459a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f144460b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f144461c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f144462d;

        static {
            Covode.recordClassIndex(75043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63716c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f144459a = fragment;
            this.f144460b = aVar;
            this.f144461c = cVar;
            this.f144462d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f144459a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f144460b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f144461c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m115254xcb57a9c0(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel> r0 = com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.profile.effect.e$c$1 r0 = new com.ss.android.ugc.aweme.profile.effect.e$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.effect.C63713e.C63716c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_profile_effect_EffectProfileListFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m115254xcb57a9c0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C63713e() {
        AbstractC89277c a = C89204ab.m154669a(EffectProfileListViewModel.class);
        C63714a aVar = new C63714a(a);
        this.f144450e = new lifecycleAwareLazy(this, aVar, new C63716c(this, aVar, a, C63715b.INSTANCE));
        this.f144449c = true;
    }

    /* renamed from: h */
    private final void m115240h() {
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
        a.mo27406b(m115241i()).mo27408c(m115242j());
        ((DmtStatusView) mo102297a(R.id.e7i)).mo27382d();
        ((DmtStatusView) mo102297a(R.id.e7i)).setBuilder(a);
    }

    /* renamed from: i */
    private final View m115241i() {
        int i;
        int i2;
        if (this.f144454m) {
            i = R.string.euh;
            i2 = R.string.eug;
        } else {
            if (this.f144455n) {
                i = R.string.euj;
            } else if (this.f144451j) {
                i = R.string.eun;
            } else {
                i = R.string.eul;
            }
            if (this.f144455n) {
                i2 = R.string.eui;
            } else if (this.f144451j) {
                i2 = R.string.eum;
            } else {
                i2 = R.string.euk;
            }
        }
        MtEmptyView a = MtEmptyView.m31926a(getContext());
        a.setStatus(new C17273d.C17274a(getContext()).mo27462b(i).mo27464c(i2).f41365a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: j */
    private final View m115242j() {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        Context context2 = getContext();
        if (context2 == null) {
            C89219l.m154715b();
        }
        tuxTextView.setTextColor(C0643b.m2378c(context2, R.color.c4));
        tuxTextView.setText(R.string.cxj);
        tuxTextView.setOnClickListener(new View$OnClickListenerC63719e(this));
        return tuxTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: b */
    public final void mo102299b(boolean z) {
        this.f144454m = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c */
    public final void mo102301c(boolean z) {
        this.f144455n = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c_ */
    public final void mo98050c_(boolean z) {
        this.f144456o = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$k */
    public static final class C63725k extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C63713e f144478e;

        static {
            Covode.recordClassIndex(75052);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63725k(C63713e eVar) {
            this.f144478e = eVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            C63712d dVar = this.f144478e.f144448b;
            if (dVar == null) {
                C89219l.m154715b();
            }
            if (i < dVar.mo33761a().f48358c.size()) {
                return 1;
            }
            return 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$e */
    public static final class View$OnClickListenerC63719e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63713e f144464a;

        static {
            Covode.recordClassIndex(75046);
        }

        View$OnClickListenerC63719e(C63713e eVar) {
            this.f144464a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144464a.mo102298a().mo33757k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$l */
    static final class C63726l extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63713e f144479a;

        static {
            Covode.recordClassIndex(75053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63726l(C63713e eVar) {
            super(1);
            this.f144479a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f144479a.f144449c = false;
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.f144451j) {
            mo98052k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$n */
    static final class C63728n extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63713e f144481a;

        static {
            Covode.recordClassIndex(75055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63728n(C63713e eVar) {
            super(1);
            this.f144481a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            C63712d dVar = this.f144481a.f144448b;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.ao_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$m */
    static final class C63727m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63713e f144480a;

        static {
            Covode.recordClassIndex(75054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63727m(C63713e eVar) {
            super(2);
            this.f144480a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f144480a.f144449c = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$o */
    static final class C63729o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63713e f144482a;

        static {
            Covode.recordClassIndex(75056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63729o(C63713e eVar) {
            super(2);
            this.f144482a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C75445g> list) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list, "");
            C63712d dVar = this.f144482a.f144448b;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.aq_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$p */
    static final class C63730p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63713e f144483a;

        static {
            Covode.recordClassIndex(75057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63730p(C63713e eVar) {
            super(2);
            this.f144483a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C63712d dVar = this.f144483a.f144448b;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.aq_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$j */
    static final class C63724j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, ListState<C75445g, C20465o>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63713e f144477a;

        static {
            Covode.recordClassIndex(75051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63724j(C63713e eVar) {
            super(2);
            this.f144477a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, ListState<C75445g, C20465o> listState) {
            boolean z;
            ListState<C75445g, C20465o> listState2 = listState;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(listState2, "");
            List<C75445g> list = listState2.getList();
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ((DmtStatusView) this.f144477a.mo102297a(R.id.e7i)).mo27382d();
            } else if ((listState2.getRefresh() instanceof C20466f) || (listState2.getLoadMore() instanceof C20466f)) {
                ((DmtStatusView) this.f144477a.mo102297a(R.id.e7i)).mo27387h();
            } else {
                this.f144477a.mo102300c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: a */
    public final void mo65249a(String str, String str2) {
        if (!TextUtils.equals(this.f144452k, str) && !TextUtils.equals(this.f144453l, str2)) {
            this.f144449c = true;
        }
        this.f144452k = str;
        this.f144453l = str2;
        try {
            mo102298a().mo102270a(this.f144451j, this.f144452k, this.f144453l);
        } catch (Exception unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f144451j = arguments.getBoolean("is_me", false);
            this.f144452k = arguments.getString("user_id");
            this.f144453l = arguments.getString("sec_user_id");
            mo102298a().mo102270a(this.f144451j, this.f144452k, this.f144453l);
        }
        m115240h();
        this.f144448b = new C63712d(this, this.f144451j, (byte) 0);
        getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2, 1);
        C63712d dVar = this.f144448b;
        if (dVar == null) {
            C89219l.m154715b();
        }
        dVar.mo67813a(new C63731q(new C63723i(mo102298a())));
        wrapGridLayoutManager.mo4320a(new C63725k(this));
        RecyclerView recyclerView = (RecyclerView) mo102297a(R.id.doq);
        recyclerView.setAdapter(this.f144448b);
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        recyclerView.mo4402a(new C63699b());
        recyclerView.setItemAnimator(null);
        ListViewModel.m38623a(mo102298a(), this, this.f144448b, new C63721g(new C63726l(this), new C63727m(this), C63720f.INSTANCE), new C63722h(new C63728n(this), new C63730p(this), new C63729o(this)), 240);
        AbstractC88412b unused = selectSubscribe(mo102298a(), C63732f.f144485a, new C20370ah(), new C63724j(this));
        if (this.f145458N) {
            mo102298a().mo33757k();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.amp, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
