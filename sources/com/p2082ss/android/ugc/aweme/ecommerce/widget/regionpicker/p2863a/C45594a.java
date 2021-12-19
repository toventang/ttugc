package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
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
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.C45593a;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a */
public final class C45594a extends Fragment implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: b */
    public static final C45600e f106175b = new C45600e((byte) 0);

    /* renamed from: a */
    public final C34499i f106176a = new C34499i();

    /* renamed from: c */
    private final AbstractC89244h f106177c;

    /* renamed from: d */
    private final lifecycleAwareLazy f106178d;

    /* renamed from: e */
    private final AbstractC89244h f106179e;

    /* renamed from: f */
    private boolean f106180f;

    /* renamed from: g */
    private final AbstractC89171a<C89391z> f106181g;

    /* renamed from: h */
    private SparseArray f106182h;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$c */
    public static final class C45597c extends AbstractC89220m implements AbstractC89183m<DistrictPickerState, Bundle, DistrictPickerState> {
        public static final C45597c INSTANCE = new C45597c();

        static {
            Covode.recordClassIndex(54094);
        }

        public C45597c() {
            super(2);
        }

        public final DistrictPickerState invoke(DistrictPickerState districtPickerState, Bundle bundle) {
            C89219l.m154719c(districtPickerState, "");
            return districtPickerState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r */
    final /* synthetic */ class C45616r implements AbstractC0952i.AbstractC0955c {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f106217a;

        static {
            Covode.recordClassIndex(54113);
        }

        C45616r(AbstractC89171a aVar) {
            this.f106217a = aVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
        /* renamed from: a */
        public final /* synthetic */ void mo3582a() {
            C89219l.m154716b(this.f106217a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(54091);
    }

    /* renamed from: a */
    public final View mo76823a(int i) {
        if (this.f106182h == null) {
            this.f106182h = new SparseArray();
        }
        View view = (View) this.f106182h.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f106182h.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DistrictPickerWrapperViewModel mo76824a() {
        return (DistrictPickerWrapperViewModel) this.f106177c.getValue();
    }

    /* renamed from: b */
    public final DistrictPickerViewModel mo76826b() {
        return (DistrictPickerViewModel) this.f106178d.getValue();
    }

    /* renamed from: c */
    public final RegionAdapter mo76827c() {
        return (RegionAdapter) this.f106179e.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$e */
    public static final class C45600e {
        static {
            Covode.recordClassIndex(54097);
        }

        private C45600e() {
        }

        public /* synthetic */ C45600e(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f106176a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$b */
    public static final class C45596b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f106186a;

        static {
            Covode.recordClassIndex(54093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45596b(AbstractC89277c cVar) {
            super(0);
            this.f106186a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f106186a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$q */
    static final class C45615q extends AbstractC89220m implements AbstractC89171a<RegionAdapter> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106216a;

        static {
            Covode.recordClassIndex(54112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45615q(C45594a aVar) {
            super(0);
            this.f106216a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RegionAdapter invoke() {
            RegionAdapter regionAdapter = new RegionAdapter(this.f106216a);
            regionAdapter.mo67829d(false);
            return regionAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$g */
    static final class C45602g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106198a;

        static {
            Covode.recordClassIndex(54099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45602g(C45594a aVar) {
            super(0);
            this.f106198a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            DistrictPickerViewModel b = this.f106198a.mo76826b();
            this.f106198a.getContext();
            b.mo76864g();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$h */
    static final class C45603h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106199a;

        static {
            Covode.recordClassIndex(54100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45603h(C45594a aVar) {
            super(0);
            this.f106199a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            DistrictPickerViewModel b = this.f106199a.mo76826b();
            this.f106199a.getContext();
            b.mo76864g();
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r3 = this;
            super.onDestroyView()
            androidx.fragment.app.i r2 = r3.getFragmentManager()
            if (r2 == 0) goto L_0x0018
            h.f.a.a<h.z> r1 = r3.f106181g
            if (r1 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r
            r0.<init>(r1)
            r1 = r0
        L_0x0013:
            androidx.fragment.app.i$c r1 = (androidx.fragment.app.AbstractC0952i.AbstractC0955c) r1
            r2.mo3559b(r1)
        L_0x0018:
            android.util.SparseArray r0 = r3.f106182h
            if (r0 == 0) goto L_0x001f
            r0.clear()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.onDestroyView():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C45593a aVar = mo76824a().f106298a;
        if (aVar != null) {
            aVar.f106173c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$d */
    public static final class C45598d extends AbstractC89220m implements AbstractC89171a<DistrictPickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f106187a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f106188b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f106189c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f106190d;

        static {
            Covode.recordClassIndex(54095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45598d(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f106187a = fragment;
            this.f106188b = aVar;
            this.f106189c = cVar;
            this.f106190d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f106187a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f106188b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f106189c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m88145x38919654(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$d$1 r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$d$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.C45598d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPicker$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m88145x38919654(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$o */
    static final class C45613o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106211a;

        static {
            Covode.recordClassIndex(54110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45613o(C45594a aVar) {
            super(0);
            this.f106211a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Object obj;
            List<Fragment> f;
            FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) this.f106211a.mo76823a(R.id.dgn);
            if (fixedRecyclerView != null) {
                AbstractC0952i fragmentManager = this.f106211a.getFragmentManager();
                if (fragmentManager == null || (f = fragmentManager.mo3565f()) == null) {
                    obj = null;
                } else {
                    obj = C89070n.m154586h((List) f);
                }
                fixedRecyclerView.setNestedScrollingEnabled(C89219l.m154714a(obj, this.f106211a));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$a */
    public static final class C45595a extends AbstractC89220m implements AbstractC89171a<DistrictPickerWrapperViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f106183a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f106184b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f106185c;

        static {
            Covode.recordClassIndex(54092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45595a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f106183a = fragment;
            this.f106184b = cVar;
            this.f106185c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.f106183a
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.f106185c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.f106184b     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = m88144xfaf1110a(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.f106183a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f106184b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m88144xfaf1110a(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.C45595a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPicker$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m88144xfaf1110a(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C45594a() {
        AbstractC89277c a = C89204ab.m154669a(DistrictPickerWrapperViewModel.class);
        this.f106177c = C89250i.m154773a((AbstractC89171a) new C45595a(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(DistrictPickerViewModel.class);
        C45596b bVar = new C45596b(a2);
        this.f106178d = new lifecycleAwareLazy(this, bVar, new C45598d(this, bVar, a2, C45597c.INSTANCE));
        this.f106179e = C89250i.m154773a((AbstractC89171a) new C45615q(this));
        this.f106181g = new C45613o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        List<Fragment> f;
        List<Fragment> f2;
        super.onDestroy();
        AbstractC0952i fragmentManager = getFragmentManager();
        int i2 = 0;
        if (fragmentManager == null || (f2 = fragmentManager.mo3565f()) == null) {
            i = 0;
        } else {
            i = f2.size();
        }
        AbstractC0952i fragmentManager2 = getFragmentManager();
        if (!(fragmentManager2 == null || (f = fragmentManager2.mo3565f()) == null)) {
            for (T t : f) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                if (C89219l.m154714a((Object) t, (Object) this) && i2 == i - 1) {
                    mo76825a("return");
                }
                i2 = i3;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        AbstractC0952i fragmentManager;
        int i;
        List<Fragment> f;
        List<Fragment> f2;
        super.onStop();
        if (ActivityStack.isAppBackGround() && (fragmentManager = getFragmentManager()) != null) {
            List<Fragment> f3 = fragmentManager.mo3565f();
            int i2 = 0;
            if (!(f3 == null || f3.isEmpty())) {
                AbstractC0952i fragmentManager2 = getFragmentManager();
                if (fragmentManager2 == null || (f2 = fragmentManager2.mo3565f()) == null) {
                    i = 0;
                } else {
                    i = f2.size();
                }
                AbstractC0952i fragmentManager3 = getFragmentManager();
                if (!(fragmentManager3 == null || (f = fragmentManager3.mo3565f()) == null)) {
                    for (T t : f) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C89070n.m154520a();
                        }
                        if (C89219l.m154714a((Object) t, (Object) this) && i2 == i - 1) {
                            mo76825a("close");
                        }
                        i2 = i3;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$f */
    public static final class C45601f extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106192a = 700;

        /* renamed from: b */
        final /* synthetic */ int f106193b;

        /* renamed from: c */
        final /* synthetic */ Context f106194c;

        /* renamed from: d */
        final /* synthetic */ int f106195d;

        /* renamed from: e */
        final /* synthetic */ int f106196e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89171a f106197f;

        static {
            Covode.recordClassIndex(54098);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f106197f.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45601f(int i, Context context, int i2, int i3, AbstractC89171a aVar) {
            super(700);
            this.f106193b = i;
            this.f106194c = context;
            this.f106195d = i2;
            this.f106196e = i3;
            this.f106197f = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$m */
    public static final class C45611m implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C45594a f106208a;

        static {
            Covode.recordClassIndex(54108);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45611m(C45594a aVar) {
            this.f106208a = aVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            this.f106208a.mo76824a().mo33689c(DistrictPickerWrapperViewModel.C45663a.f106299a);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f106208a.mo76825a("return");
            AbstractC0952i fragmentManager = this.f106208a.getFragmentManager();
            if (fragmentManager != null) {
                C89219l.m154716b(fragmentManager, "");
                if (fragmentManager.mo3565f().size() > 1) {
                    fragmentManager.mo3562c();
                } else {
                    this.f106208a.mo76824a().mo33689c(DistrictPickerWrapperViewModel.C45667e.f106303a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$l */
    public static final class C45608l extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106204a = 700;

        /* renamed from: b */
        final /* synthetic */ C45594a f106205b;

        static {
            Covode.recordClassIndex(54105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45608l(C45594a aVar) {
            super(700);
            this.f106205b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                C45594a aVar = this.f106205b;
                aVar.withState(aVar.mo76826b(), new C45609a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$l$a */
        static final class C45609a extends AbstractC89220m implements AbstractC89172b<DistrictPickerState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C45608l f106206a;

            static {
                Covode.recordClassIndex(54106);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45609a(C45608l lVar) {
                super(1);
                this.f106206a = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(DistrictPickerState districtPickerState) {
                DistrictPickerState districtPickerState2 = districtPickerState;
                C89219l.m154721d(districtPickerState2, "");
                if (districtPickerState2.getSelectedDistrict() != null) {
                    DistrictPickerWrapperViewModel a = this.f106206a.f106205b.mo76824a();
                    ArrayList<Region> a2 = this.f106206a.f106205b.mo76826b().mo76861a(districtPickerState2.getSelectedDistrict());
                    C89219l.m154721d(a2, "");
                    a.mo33689c(new DistrictPickerWrapperViewModel.C45664b(a2));
                    this.f106206a.f106205b.withState(this.f106206a.f106205b.mo76826b(), new AbstractC89172b<DistrictPickerState, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.C45608l.C45609a.C456101 */

                        /* renamed from: a */
                        final /* synthetic */ C45609a f106207a;

                        static {
                            Covode.recordClassIndex(54107);
                        }

                        {
                            this.f106207a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(DistrictPickerState districtPickerState) {
                            DistrictPickerState districtPickerState2 = districtPickerState;
                            String str = "";
                            C89219l.m154721d(districtPickerState2, str);
                            C45593a aVar = this.f106207a.f106206a.f106205b.mo76824a().f106298a;
                            if (aVar == null) {
                                return null;
                            }
                            String titleEn = districtPickerState2.getTitleEn();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(aVar.f106171a);
                            Object obj = linkedHashMap.get("page_name");
                            if (obj == null) {
                                obj = str;
                            }
                            linkedHashMap.put("previous_page", obj);
                            if (titleEn != null) {
                                str = titleEn;
                            }
                            linkedHashMap.put("page_name", str);
                            linkedHashMap.put("button_name", "save");
                            C45544c.m88082a("tiktokec_button_click", linkedHashMap);
                            return C89391z.f203057a;
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: a */
    public final void mo76825a(String str) {
        withState(mo76826b(), new C45612n(this, str));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$p */
    static final class C45614p extends AbstractC89220m implements AbstractC89172b<DistrictPickerWrapperState, Animation> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106212a;

        /* renamed from: b */
        final /* synthetic */ int f106213b;

        /* renamed from: c */
        final /* synthetic */ boolean f106214c;

        /* renamed from: d */
        final /* synthetic */ int f106215d;

        static {
            Covode.recordClassIndex(54111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45614p(C45594a aVar, int i, boolean z, int i2) {
            super(1);
            this.f106212a = aVar;
            this.f106213b = i;
            this.f106214c = z;
            this.f106215d = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Animation invoke(DistrictPickerWrapperState districtPickerWrapperState) {
            DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
            C89219l.m154721d(districtPickerWrapperState2, "");
            if (!districtPickerWrapperState2.getDone() && !districtPickerWrapperState2.getTitleBarBack() && !districtPickerWrapperState2.getPhysicalBack()) {
                return C45594a.super.onCreateAnimation(this.f106213b, this.f106214c, this.f106215d);
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            return translateAnimation;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$n */
    public static final class C45612n extends AbstractC89220m implements AbstractC89172b<DistrictPickerState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106209a;

        /* renamed from: b */
        final /* synthetic */ String f106210b;

        static {
            Covode.recordClassIndex(54109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45612n(C45594a aVar, String str) {
            super(1);
            this.f106209a = aVar;
            this.f106210b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState r14) {
            /*
            // Method dump skipped, instructions count: 224
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.C45612n.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mo76826b().f106289e.mo143655a(DistrictPickerViewModel.f106284a[1], Integer.valueOf(arguments.getInt("parent_id")));
            mo76826b().f106286b = arguments.getStringArray("geoname_ids");
            mo76826b().f106287c = (OrderSKUDTO) arguments.getParcelable("order_sku");
            mo76826b().f106288d.mo143655a(DistrictPickerViewModel.f106284a[0], Integer.valueOf(arguments.getInt("number_of_remaining_level", Integer.MAX_VALUE)));
            this.f106180f = arguments.getBoolean("show_back_icon");
        }
        DistrictPickerViewModel b = mo76826b();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (arrayList = arguments2.getParcelableArrayList("current_selected_region_list")) == null) {
            arrayList = new ArrayList();
        }
        C89219l.m154721d(arrayList, "");
        b.f106290f = new ArrayList<>(arrayList);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$j */
    static final class C45605j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106201a;

        static {
            Covode.recordClassIndex(54102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45605j(C45594a aVar) {
            super(2);
            this.f106201a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f106201a.mo76826b(), new AbstractC89172b<DistrictPickerState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.C45605j.C456061 */

                /* renamed from: a */
                final /* synthetic */ C45605j f106202a;

                static {
                    Covode.recordClassIndex(54103);
                }

                {
                    this.f106202a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(DistrictPickerState districtPickerState) {
                    int i;
                    DistrictPickerState districtPickerState2 = districtPickerState;
                    String str = "";
                    C89219l.m154721d(districtPickerState2, str);
                    TuxButton tuxButton = (TuxButton) this.f106202a.f106201a.mo76823a(R.id.ann);
                    C89219l.m154716b(tuxButton, str);
                    if (this.f106202a.f106201a.mo76826b().mo76863b()) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    tuxButton.setVisibility(i);
                    ((AbstractC17250a) this.f106202a.f106201a.mo76823a(R.id.eim)).setTitle(districtPickerState2.getTitle());
                    this.f106202a.f106201a.mo76827c().mo60931a(districtPickerState2.getDistrictList());
                    if (districtPickerState2.getTitleEn().length() > 0) {
                        C45593a aVar = this.f106202a.f106201a.mo76824a().f106298a;
                        if (aVar != null) {
                            String titleEn = districtPickerState2.getTitleEn();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(aVar.f106171a);
                            Object obj = linkedHashMap.get("page_name");
                            if (obj == null) {
                                obj = str;
                            }
                            linkedHashMap.put("previous_page", obj);
                            if (titleEn != null) {
                                str = titleEn;
                            }
                            linkedHashMap.put("page_name", str);
                            C45544c.m88082a("tiktokec_enter_page", linkedHashMap);
                        }
                        C45593a aVar2 = this.f106202a.f106201a.mo76824a().f106298a;
                        if (aVar2 != null) {
                            aVar2.f106173c = SystemClock.elapsedRealtime();
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$k */
    static final class C45607k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106203a;

        static {
            Covode.recordClassIndex(54104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45607k(C45594a aVar) {
            super(2);
            this.f106203a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f106203a.mo76823a(R.id.e77)).setStatus(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$i */
    static final class C45604i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, District, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45594a f106200a;

        static {
            Covode.recordClassIndex(54101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45604i(C45594a aVar) {
            super(2);
            this.f106200a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
            if (r10 == null) goto L_0x0050;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r12, com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District r13) {
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.C45604i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45594a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return (Animation) withState(mo76824a(), new C45614p(this, i, z, i2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.qi, viewGroup, false);
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

    /* renamed from: a */
    private final View m88136a(Context context, int i, int i2, int i3, AbstractC89171a<C89391z> aVar) {
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
        tuxButton.setOnClickListener(new C45601f(i3, context, i, i2, aVar));
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
