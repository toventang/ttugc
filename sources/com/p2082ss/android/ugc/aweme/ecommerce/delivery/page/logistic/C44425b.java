package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
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
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.C44348a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b.C44384a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b */
public final class C44425b extends Fragment implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: b */
    public static final C44427b f103572b = new C44427b((byte) 0);

    /* renamed from: a */
    public final C34499i f103573a = new C34499i();

    /* renamed from: c */
    private final AbstractC89244h f103574c;

    /* renamed from: d */
    private final AbstractC89244h f103575d;

    /* renamed from: e */
    private final AbstractC89171a<C89391z> f103576e;

    /* renamed from: f */
    private SparseArray f103577f;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o */
    final /* synthetic */ class C44444o implements AbstractC0952i.AbstractC0955c {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f103605a;

        static {
            Covode.recordClassIndex(52783);
        }

        C44444o(AbstractC89171a aVar) {
            this.f103605a = aVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
        /* renamed from: a */
        public final /* synthetic */ void mo3582a() {
            C89219l.m154716b(this.f103605a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(52764);
    }

    /* renamed from: a */
    public final View mo75428a(int i) {
        if (this.f103577f == null) {
            this.f103577f = new SparseArray();
        }
        View view = (View) this.f103577f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f103577f.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DeliveryPanelViewModel mo75429a() {
        return (DeliveryPanelViewModel) this.f103574c.getValue();
    }

    /* renamed from: b */
    public final LogisticAdapter mo75430b() {
        return (LogisticAdapter) this.f103575d.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$b */
    public static final class C44427b {
        static {
            Covode.recordClassIndex(52766);
        }

        private C44427b() {
        }

        public /* synthetic */ C44427b(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f103573a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$c */
    static final class C44428c extends AbstractC89220m implements AbstractC89171a<LogisticAdapter> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103581a;

        static {
            Covode.recordClassIndex(52767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44428c(C44425b bVar) {
            super(0);
            this.f103581a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LogisticAdapter invoke() {
            LogisticAdapter logisticAdapter = new LogisticAdapter(this.f103581a);
            logisticAdapter.mo67829d(false);
            return logisticAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$e */
    static final class C44430e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103588a;

        static {
            Covode.recordClassIndex(52769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44430e(C44425b bVar) {
            super(0);
            this.f103588a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f103588a.mo75429a().mo75475a(this.f103588a.getContext());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$f */
    static final class C44431f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103589a;

        static {
            Covode.recordClassIndex(52770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44431f(C44425b bVar) {
            super(0);
            this.f103589a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f103589a.mo75429a().mo75475a(this.f103589a.getContext());
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r3 = this;
            super.onDestroyView()
            androidx.fragment.app.i r2 = r3.getFragmentManager()
            if (r2 == 0) goto L_0x0018
            h.f.a.a<h.z> r1 = r3.f103576e
            if (r1 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o
            r0.<init>(r1)
            r1 = r0
        L_0x0013:
            androidx.fragment.app.i$c r1 = (androidx.fragment.app.AbstractC0952i.AbstractC0955c) r1
            r2.mo3559b(r1)
        L_0x0018:
            android.util.SparseArray r0 = r3.f103577f
            if (r0 == 0) goto L_0x001f
            r0.clear()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.C44425b.onDestroyView():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$n */
    static final class C44443n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103604a;

        static {
            Covode.recordClassIndex(52782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44443n(C44425b bVar) {
            super(0);
            this.f103604a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Object obj;
            List<Fragment> f;
            FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) this.f103604a.mo75428a(R.id.dgn);
            if (fixedRecyclerView != null) {
                AbstractC0952i fragmentManager = this.f103604a.getFragmentManager();
                if (fragmentManager == null || (f = fragmentManager.mo3565f()) == null) {
                    obj = null;
                } else {
                    obj = C89070n.m154586h((List) f);
                }
                fixedRecyclerView.setNestedScrollingEnabled(C89219l.m154714a(obj, this.f103604a));
            }
            return C89391z.f203057a;
        }
    }

    public C44425b() {
        AbstractC89277c a = C89204ab.m154669a(DeliveryPanelViewModel.class);
        this.f103574c = C89250i.m154773a((AbstractC89171a) new C44426a(this, a, a));
        this.f103575d = C89250i.m154773a((AbstractC89171a) new C44428c(this));
        this.f103576e = new C44443n(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$a */
    public static final class C44426a extends AbstractC89220m implements AbstractC89171a<DeliveryPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f103578a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f103579b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f103580c;

        static {
            Covode.recordClassIndex(52765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44426a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f103578a = fragment;
            this.f103579b = cVar;
            this.f103580c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.f103578a
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.f103580c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.f103579b     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = m87136xc51c8721(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.f103578a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f103579b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m87136xc51c8721(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.C44425b.C44426a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_page_logistic_LogisticSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87136xc51c8721(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$d */
    public static final class C44429d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103582a = 700;

        /* renamed from: b */
        final /* synthetic */ int f103583b;

        /* renamed from: c */
        final /* synthetic */ Context f103584c;

        /* renamed from: d */
        final /* synthetic */ int f103585d;

        /* renamed from: e */
        final /* synthetic */ int f103586e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89171a f103587f;

        static {
            Covode.recordClassIndex(52768);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f103587f.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44429d(int i, Context context, int i2, int i3, AbstractC89171a aVar) {
            super(700);
            this.f103583b = i;
            this.f103584c = context;
            this.f103585d = i2;
            this.f103586e = i3;
            this.f103587f = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$l */
    public static final class C44440l implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C44425b f103601a;

        static {
            Covode.recordClassIndex(52779);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44440l(C44425b bVar) {
            this.f103601a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            this.f103601a.mo75429a().f103667b.invoke();
            C44425b bVar = this.f103601a;
            bVar.withState(bVar.mo75429a(), C44441a.f103602a);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$l$a */
        static final class C44441a extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

            /* renamed from: a */
            public static final C44441a f103602a = new C44441a();

            static {
                Covode.recordClassIndex(52780);
            }

            C44441a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
                Float f;
                String str;
                LogisticTextDTO logisticTextDTO;
                Price price;
                Price price2;
                String priceVal;
                DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                C89219l.m154721d(deliveryPanelState2, "");
                LogisticDTO selectedLogistic = deliveryPanelState2.getSelectedLogistic();
                String str2 = null;
                if (selectedLogistic == null || (price2 = selectedLogistic.f103619f) == null || (priceVal = price2.getPriceVal()) == null) {
                    f = null;
                } else {
                    f = C89361p.m154861c(priceVal);
                }
                LogisticDTO selectedLogistic2 = deliveryPanelState2.getSelectedLogistic();
                if (selectedLogistic2 == null || (price = selectedLogistic2.f103619f) == null) {
                    str = null;
                } else {
                    str = price.getCurrency();
                }
                LogisticDTO selectedLogistic3 = deliveryPanelState2.getSelectedLogistic();
                if (!(selectedLogistic3 == null || (logisticTextDTO = selectedLogistic3.f103623j) == null)) {
                    str2 = logisticTextDTO.f103630f;
                }
                C44348a.m87067a("close", "close", f, str, str2);
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$k */
    public static final class C44439k extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103599a = 700;

        /* renamed from: b */
        final /* synthetic */ C44425b f103600b;

        static {
            Covode.recordClassIndex(52778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44439k(C44425b bVar) {
            super(700);
            this.f103600b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                DeliveryPanelViewModel a = this.f103600b.mo75429a();
                a.mo33687b_(new DeliveryPanelViewModel.C44465a(a));
                C44425b bVar = this.f103600b;
                bVar.withState(bVar.mo75429a(), C44442m.f103603a);
                C89219l.m154721d("continue", "");
                C89219l.m154721d("confirm", "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(C44348a.f103431a);
                linkedHashMap.put("button_name", "continue");
                linkedHashMap.put("button_type", "confirm");
                C45544c.m88082a("tiktokec_button_show", linkedHashMap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$g */
    static final class C44432g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103590a;

        static {
            Covode.recordClassIndex(52771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44432g(C44425b bVar) {
            super(2);
            this.f103590a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$g$a */
        static final class C44433a extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ List f103591a;

            /* renamed from: b */
            final /* synthetic */ C44432g f103592b;

            /* renamed from: c */
            final /* synthetic */ AbstractC20477i f103593c;

            static {
                Covode.recordClassIndex(52772);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44433a(List list, C44432g gVar, AbstractC20477i iVar) {
                super(1);
                this.f103591a = list;
                this.f103592b = gVar;
                this.f103593c = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
                C89219l.m154721d(deliveryPanelState, "");
                this.f103592b.f103590a.mo75430b().mo60931a(this.f103591a);
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            List<? extends Object> list2 = list;
            C89219l.m154721d(iVar2, "");
            if (list2 != null) {
                iVar2.withState(this.f103590a.mo75429a(), new C44433a(list2, this, iVar2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$m */
    static final class C44442m extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

        /* renamed from: a */
        public static final C44442m f103603a = new C44442m();

        static {
            Covode.recordClassIndex(52781);
        }

        C44442m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
            Float f;
            String str;
            LogisticTextDTO logisticTextDTO;
            Price price;
            Price price2;
            String priceVal;
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            LogisticDTO selectedLogistic = deliveryPanelState2.getSelectedLogistic();
            String str2 = null;
            if (selectedLogistic == null || (price2 = selectedLogistic.f103619f) == null || (priceVal = price2.getPriceVal()) == null) {
                f = null;
            } else {
                f = C89361p.m154861c(priceVal);
            }
            LogisticDTO selectedLogistic2 = deliveryPanelState2.getSelectedLogistic();
            if (selectedLogistic2 == null || (price = selectedLogistic2.f103619f) == null) {
                str = null;
            } else {
                str = price.getCurrency();
            }
            LogisticDTO selectedLogistic3 = deliveryPanelState2.getSelectedLogistic();
            if (!(selectedLogistic3 == null || (logisticTextDTO = selectedLogistic3.f103623j) == null)) {
                str2 = logisticTextDTO.f103630f;
            }
            C44348a.m87067a("continue", "confirm", f, str, str2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$h */
    static final class C44434h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103594a;

        static {
            Covode.recordClassIndex(52773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44434h(C44425b bVar) {
            super(2);
            this.f103594a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f103594a.mo75428a(R.id.e77)).setStatus(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$i */
    static final class C44435i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, LogisticDTO, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103595a;

        static {
            Covode.recordClassIndex(52774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44435i(C44425b bVar) {
            super(2);
            this.f103595a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, LogisticDTO logisticDTO) {
            boolean z;
            AbstractC20477i iVar2 = iVar;
            final LogisticDTO logisticDTO2 = logisticDTO;
            C89219l.m154721d(iVar2, "");
            TuxButton tuxButton = (TuxButton) this.f103595a.mo75428a(R.id.u3);
            C89219l.m154716b(tuxButton, "");
            if (logisticDTO2 != null) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            if (logisticDTO2 != null) {
                iVar2.withState(this.f103595a.mo75429a(), new AbstractC89172b<DeliveryPanelState, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.C44425b.C44435i.C444361 */

                    static {
                        Covode.recordClassIndex(52775);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
                    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState r9) {
                        /*
                        // Method dump skipped, instructions count: 128
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.C44425b.C44435i.C444361.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.C44425b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ot, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$j */
    static final class C44437j extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, List<? extends Object>, C44384a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44425b f103597a;

        static {
            Covode.recordClassIndex(52776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44437j(C44425b bVar) {
            super(3);
            this.f103597a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list, C44384a aVar) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(aVar, "");
            iVar2.withState(this.f103597a.mo75429a(), new AbstractC89172b<DeliveryPanelState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.C44425b.C44437j.C444381 */

                /* renamed from: a */
                final /* synthetic */ C44437j f103598a;

                static {
                    Covode.recordClassIndex(52777);
                }

                {
                    this.f103598a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
                    DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                    C89219l.m154721d(deliveryPanelState2, "");
                    if (!deliveryPanelState2.canSelectLogistic(this.f103598a.f103597a.mo75429a().f103666a)) {
                        TuxButton tuxButton = (TuxButton) this.f103598a.f103597a.mo75428a(R.id.u3);
                        C89219l.m154716b(tuxButton, "");
                        tuxButton.setVisibility(8);
                    } else {
                        TuxButton tuxButton2 = (TuxButton) this.f103598a.f103597a.mo75428a(R.id.u3);
                        C89219l.m154716b(tuxButton2, "");
                        tuxButton2.setVisibility(0);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
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

    /* renamed from: a */
    private final View m87131a(Context context, int i, int i2, int i3, AbstractC89171a<C89391z> aVar) {
        LayoutInflater from = LayoutInflater.from(context);
        View view = getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        View a = C1764a.m5927a(from, R.layout.pj, (ViewGroup) view, false);
        ((AppCompatImageView) a.findViewById(R.id.bky)).setImageResource(i3);
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.text);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(context.getText(i));
        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.efr);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(context.getText(i2));
        TuxButton tuxButton = (TuxButton) a.findViewById(R.id.djd);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setOnClickListener(new C44429d(i3, context, i, i2, aVar));
        C89219l.m154716b(a, "");
        return a;
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
