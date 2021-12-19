package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
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
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.C44348a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.EnumC44478a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b */
public final class C44397b extends Fragment implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: a */
    public final C34499i f103522a = new C34499i();

    /* renamed from: b */
    private final AbstractC89244h f103523b;

    /* renamed from: c */
    private final lifecycleAwareLazy f103524c;

    /* renamed from: d */
    private final AbstractC89244h f103525d;

    /* renamed from: e */
    private final AbstractC89171a<C89391z> f103526e;

    /* renamed from: f */
    private SparseArray f103527f;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$c */
    public static final class C44400c extends AbstractC89220m implements AbstractC89183m<AddressSelectState, Bundle, AddressSelectState> {
        public static final C44400c INSTANCE = new C44400c();

        static {
            Covode.recordClassIndex(52737);
        }

        public C44400c() {
            super(2);
        }

        public final AddressSelectState invoke(AddressSelectState addressSelectState, Bundle bundle) {
            C89219l.m154719c(addressSelectState, "");
            return addressSelectState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l */
    final /* synthetic */ class C44412l implements AbstractC0952i.AbstractC0955c {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f103548a;

        static {
            Covode.recordClassIndex(52749);
        }

        C44412l(AbstractC89171a aVar) {
            this.f103548a = aVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
        /* renamed from: a */
        public final /* synthetic */ void mo3582a() {
            C89219l.m154716b(this.f103548a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(52734);
    }

    /* renamed from: a */
    public final View mo75422a(int i) {
        if (this.f103527f == null) {
            this.f103527f = new SparseArray();
        }
        View view = (View) this.f103527f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f103527f.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DeliveryPanelViewModel mo75423a() {
        return (DeliveryPanelViewModel) this.f103523b.getValue();
    }

    /* renamed from: b */
    public final AddressSelectViewModel mo75424b() {
        return (AddressSelectViewModel) this.f103524c.getValue();
    }

    /* renamed from: c */
    public final AddressAdapter mo75425c() {
        return (AddressAdapter) this.f103525d.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f103522a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$b */
    public static final class C44399b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f103531a;

        static {
            Covode.recordClassIndex(52736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44399b(AbstractC89277c cVar) {
            super(0);
            this.f103531a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f103531a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$e */
    static final class C44403e extends AbstractC89220m implements AbstractC89171a<AddressAdapter> {

        /* renamed from: a */
        final /* synthetic */ C44397b f103537a;

        static {
            Covode.recordClassIndex(52740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44403e(C44397b bVar) {
            super(0);
            this.f103537a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AddressAdapter invoke() {
            AddressAdapter addressAdapter = new AddressAdapter(this.f103537a);
            addressAdapter.mo67829d(false);
            return addressAdapter;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r3 = this;
            super.onDestroyView()
            androidx.fragment.app.i r2 = r3.getFragmentManager()
            if (r2 == 0) goto L_0x0018
            h.f.a.a<h.z> r1 = r3.f103526e
            if (r1 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l
            r0.<init>(r1)
            r1 = r0
        L_0x0013:
            androidx.fragment.app.i$c r1 = (androidx.fragment.app.AbstractC0952i.AbstractC0955c) r1
            r2.mo3559b(r1)
        L_0x0018:
            android.util.SparseArray r0 = r3.f103527f
            if (r0 == 0) goto L_0x001f
            r0.clear()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.C44397b.onDestroyView():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$d */
    public static final class C44401d extends AbstractC89220m implements AbstractC89171a<AddressSelectViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f103532a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f103533b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f103534c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f103535d;

        static {
            Covode.recordClassIndex(52738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44401d(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f103532a = fragment;
            this.f103533b = aVar;
            this.f103534c = cVar;
            this.f103535d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f103532a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f103533b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f103534c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m87118x6a04f235(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$d$1 r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$d$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.C44397b.C44401d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressSelectFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87118x6a04f235(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$k */
    static final class C44411k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44397b f103547a;

        static {
            Covode.recordClassIndex(52748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44411k(C44397b bVar) {
            super(0);
            this.f103547a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Object obj;
            List<Fragment> f;
            FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) this.f103547a.mo75422a(R.id.dgn);
            if (fixedRecyclerView != null) {
                AbstractC0952i fragmentManager = this.f103547a.getFragmentManager();
                if (fragmentManager == null || (f = fragmentManager.mo3565f()) == null) {
                    obj = null;
                } else {
                    obj = C89070n.m154586h((List) f);
                }
                fixedRecyclerView.setNestedScrollingEnabled(C89219l.m154714a(obj, this.f103547a));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$a */
    public static final class C44398a extends AbstractC89220m implements AbstractC89171a<DeliveryPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f103528a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f103529b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f103530c;

        static {
            Covode.recordClassIndex(52735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44398a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f103528a = fragment;
            this.f103529b = cVar;
            this.f103530c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.f103528a
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.f103530c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.f103529b     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = m87117x49a1946b(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.f103528a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f103529b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m87117x49a1946b(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.C44397b.C44398a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87117x49a1946b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C44397b() {
        AbstractC89277c a = C89204ab.m154669a(DeliveryPanelViewModel.class);
        this.f103523b = C89250i.m154773a((AbstractC89171a) new C44398a(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(AddressSelectViewModel.class);
        C44399b bVar = new C44399b(a2);
        this.f103524c = new lifecycleAwareLazy(this, bVar, new C44401d(this, bVar, a2, C44400c.INSTANCE));
        this.f103525d = C89250i.m154773a((AbstractC89171a) new C44403e(this));
        this.f103526e = new C44411k(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$j */
    public static final class C44410j implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C44397b f103546a;

        static {
            Covode.recordClassIndex(52747);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44410j(C44397b bVar) {
            this.f103546a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f103546a.mo75423a().mo75477a(EnumC44478a.POP);
            C44348a.m87067a("close", "return", null, null, null);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            this.f103546a.mo75423a().f103667b.invoke();
            C44348a.m87067a("close", "close", null, null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$h */
    public static final class C44407h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103541a = 700;

        /* renamed from: b */
        final /* synthetic */ C44397b f103542b;

        static {
            Covode.recordClassIndex(52744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44407h(C44397b bVar) {
            super(700);
            this.f103542b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                C44397b bVar = this.f103542b;
                bVar.withState(bVar.mo75424b(), new C44408a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$h$a */
        static final class C44408a extends AbstractC89220m implements AbstractC89172b<AddressSelectState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C44407h f103543a;

            static {
                Covode.recordClassIndex(52745);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44408a(C44407h hVar) {
                super(1);
                this.f103543a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AddressSelectState addressSelectState) {
                AddressSelectState addressSelectState2 = addressSelectState;
                C89219l.m154721d(addressSelectState2, "");
                if (addressSelectState2.getSelectedAddress() != null) {
                    this.f103543a.f103542b.mo75423a().mo75476a(this.f103543a.f103542b.getContext(), addressSelectState2.getSelectedAddress());
                }
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$i */
    public static final class C44409i extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103544a = 700;

        /* renamed from: b */
        final /* synthetic */ C44397b f103545b;

        static {
            Covode.recordClassIndex(52746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44409i(C44397b bVar) {
            super(700);
            this.f103545b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f103545b.mo75423a().mo75477a(EnumC44478a.PUSH_AREA_PAGE);
                C44348a.m87067a("select_location", "next", null, null, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$f */
    static final class C44404f extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44397b f103538a;

        static {
            Covode.recordClassIndex(52741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44404f(C44397b bVar) {
            super(1);
            this.f103538a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            this.f103538a.mo75425c().mo60931a(deliveryPanelState2.getAddressRenderData());
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            deliveryPanelState2.getSelectedShipToInfo().mo75410a(new AbstractC89172b<C44457d, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.C44397b.C44404f.C444051 */

                static {
                    Covode.recordClassIndex(52742);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C44457d dVar) {
                    C89219l.m154721d(dVar, "");
                    eVar.element = dVar;
                    return C89391z.f203057a;
                }
            });
            if (deliveryPanelState2.getSelectedShipToInfo().f103498a == null) {
                for (T t : deliveryPanelState2.getAddressRenderData()) {
                    if (!(t instanceof C44457d)) {
                        t = null;
                    }
                    T t2 = t;
                    if (t2 != null && t2.f103650b.mo73872a() && t2.f103649a) {
                        eVar.element = t2;
                    }
                }
            }
            this.f103538a.mo75424b().mo75421a((C44457d) eVar.element);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$g */
    static final class C44406g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44457d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44397b f103540a;

        static {
            Covode.recordClassIndex(52743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44406g(C44397b bVar) {
            super(2);
            this.f103540a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44457d dVar) {
            boolean z;
            C44457d dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            TuxButton tuxButton = (TuxButton) this.f103540a.mo75422a(R.id.ae1);
            C89219l.m154716b(tuxButton, "");
            if (dVar2 == null || !dVar2.f103649a) {
                z = false;
            } else {
                z = true;
            }
            tuxButton.setEnabled(z);
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.C44397b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.oc, viewGroup, false);
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
