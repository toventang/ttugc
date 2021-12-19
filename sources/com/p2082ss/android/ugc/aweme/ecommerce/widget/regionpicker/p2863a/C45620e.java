package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
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
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.C45593a;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
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
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e */
public final class C45620e extends Fragment implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: f */
    public static final C45625d f106221f = new C45625d((byte) 0);

    /* renamed from: a */
    public final C34499i f106222a = new C34499i();

    /* renamed from: b */
    public AbstractC89171a<C89391z> f106223b;

    /* renamed from: c */
    public AbstractC89171a<C89391z> f106224c;

    /* renamed from: d */
    public AbstractC89172b<? super List<Region>, C89391z> f106225d;

    /* renamed from: e */
    public AbstractC89172b<? super List<Region>, C89391z> f106226e;

    /* renamed from: g */
    private final lifecycleAwareLazy f106227g;

    /* renamed from: h */
    private SparseArray f106228h;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$b */
    public static final class C45622b extends AbstractC89220m implements AbstractC89183m<DistrictPickerWrapperState, Bundle, DistrictPickerWrapperState> {
        public static final C45622b INSTANCE = new C45622b();

        static {
            Covode.recordClassIndex(54119);
        }

        public C45622b() {
            super(2);
        }

        public final DistrictPickerWrapperState invoke(DistrictPickerWrapperState districtPickerWrapperState, Bundle bundle) {
            C89219l.m154719c(districtPickerWrapperState, "");
            return districtPickerWrapperState;
        }
    }

    static {
        Covode.recordClassIndex(54117);
    }

    /* renamed from: a */
    public final DistrictPickerWrapperViewModel mo76830a() {
        return (DistrictPickerWrapperViewModel) this.f106227g.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$d */
    public static final class C45625d {
        static {
            Covode.recordClassIndex(54122);
        }

        private C45625d() {
        }

        public /* synthetic */ C45625d(byte b) {
            this();
        }

        /* renamed from: a */
        private static C45620e m88157a(String str, OrderSKUDTO orderSKUDTO, int i, boolean z, String str2) {
            C45620e eVar = new C45620e();
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putStringArray("geoname_ids", new String[]{str});
            }
            if (orderSKUDTO != null) {
                bundle.putParcelable("order_sku", orderSKUDTO);
            }
            bundle.putInt("number_of_remaining_level", i - 1);
            bundle.putBoolean("show_back_icon", z);
            bundle.putString("page_info", str2);
            eVar.setArguments(bundle);
            return eVar;
        }

        /* renamed from: a */
        public static /* synthetic */ C45620e m88158a(String str, OrderSKUDTO orderSKUDTO, int i, boolean z, String str2, int i2) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                orderSKUDTO = null;
            }
            if ((i2 & 4) != 0) {
                i = Integer.MAX_VALUE;
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            if ((i2 & 16) != 0) {
                str2 = null;
            }
            return m88157a(str, orderSKUDTO, i, z, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$i */
    public static final class C45632i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C45632i f106242a = new C45632i();

        static {
            Covode.recordClassIndex(54129);
        }

        C45632i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$j */
    public static final class C45633j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C45633j f106243a = new C45633j();

        static {
            Covode.recordClassIndex(54130);
        }

        C45633j() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$m */
    public static final class C45636m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C45636m f106246a = new C45636m();

        static {
            Covode.recordClassIndex(54133);
        }

        C45636m() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$n */
    public static final class C45637n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C45637n f106247a = new C45637n();

        static {
            Covode.recordClassIndex(54134);
        }

        C45637n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f106222a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$a */
    public static final class C45621a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f106229a;

        static {
            Covode.recordClassIndex(54118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45621a(AbstractC89277c cVar) {
            super(0);
            this.f106229a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f106229a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f106228h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$c */
    public static final class C45623c extends AbstractC89220m implements AbstractC89171a<DistrictPickerWrapperViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f106230a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f106231b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f106232c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f106233d;

        static {
            Covode.recordClassIndex(54120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45623c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f106230a = fragment;
            this.f106231b = aVar;
            this.f106232c = cVar;
            this.f106233d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f106230a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f106231b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f106232c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m88156x71d25b5(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45620e.C45623c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPickerWrapper$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m88156x71d25b5(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C45620e() {
        AbstractC89277c a = C89204ab.m154669a(DistrictPickerWrapperViewModel.class);
        C45621a aVar = new C45621a(a);
        this.f106227g = new lifecycleAwareLazy(this, aVar, new C45623c(this, aVar, a, C45622b.INSTANCE));
        this.f106223b = C45632i.f106242a;
        this.f106224c = C45633j.f106243a;
        this.f106225d = C45635l.f106245a;
        this.f106226e = C45634k.f106244a;
    }

    /* renamed from: b */
    public final boolean mo76831b() {
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        if (childFragmentManager.mo3567h()) {
            return true;
        }
        AbstractC0952i childFragmentManager2 = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager2, "");
        if (childFragmentManager2.mo3565f().size() > 1) {
            getChildFragmentManager().mo3562c();
            return true;
        }
        mo76830a().mo76879a();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$k */
    public static final class C45634k extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        public static final C45634k f106244a = new C45634k();

        static {
            Covode.recordClassIndex(54131);
        }

        C45634k() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$l */
    public static final class C45635l extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        public static final C45635l f106245a = new C45635l();

        static {
            Covode.recordClassIndex(54132);
        }

        C45635l() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$o */
    public static final class C45638o extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        public static final C45638o f106248a = new C45638o();

        static {
            Covode.recordClassIndex(54135);
        }

        C45638o() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$p */
    public static final class C45639p extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        public static final C45639p f106249a = new C45639p();

        static {
            Covode.recordClassIndex(54136);
        }

        C45639p() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("page_info");
        } else {
            str = null;
        }
        mo76830a().f106298a = new C45593a(str);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$e */
    public static final class C45626e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45620e f106235a;

        static {
            Covode.recordClassIndex(54123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45626e(C45620e eVar) {
            super(2);
            this.f106235a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar2, "");
            if (booleanValue) {
                iVar2.withState(this.f106235a.mo76830a(), new AbstractC89172b<DistrictPickerWrapperState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45620e.C45626e.C456271 */

                    /* renamed from: a */
                    final /* synthetic */ C45626e f106236a;

                    static {
                        Covode.recordClassIndex(54124);
                    }

                    {
                        this.f106236a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(DistrictPickerWrapperState districtPickerWrapperState) {
                        DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
                        C89219l.m154721d(districtPickerWrapperState2, "");
                        this.f106236a.f106235a.f106225d.invoke(districtPickerWrapperState2.getSelectedRegions());
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$f */
    static final class C45628f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45620e f106237a;

        static {
            Covode.recordClassIndex(54125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45628f(C45620e eVar) {
            super(2);
            this.f106237a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f106237a.f106224c.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$g */
    static final class C45629g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45620e f106238a;

        static {
            Covode.recordClassIndex(54126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45629g(C45620e eVar) {
            super(2);
            this.f106238a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f106238a.f106223b.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$h */
    public static final class C45630h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Region>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45620e f106239a;

        static {
            Covode.recordClassIndex(54127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45630h(C45620e eVar) {
            super(2);
            this.f106239a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Region> list) {
            AbstractC20477i iVar2 = iVar;
            final List<? extends Region> list2 = list;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list2, "");
            iVar2.withState(this.f106239a.mo76830a(), new AbstractC89172b<DistrictPickerWrapperState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45620e.C45630h.C456311 */

                /* renamed from: a */
                final /* synthetic */ C45630h f106240a;

                static {
                    Covode.recordClassIndex(54128);
                }

                {
                    this.f106240a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(DistrictPickerWrapperState districtPickerWrapperState) {
                    DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
                    C89219l.m154721d(districtPickerWrapperState2, "");
                    if (!districtPickerWrapperState2.getDone() && (!list2.isEmpty())) {
                        this.f106240a.f106239a.f106226e.invoke(list2);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC88412b unused = selectSubscribe(mo76830a(), C45640f.f106250a, new C20370ah(), new C45626e(this));
        AbstractC88412b unused2 = selectSubscribe(mo76830a(), C45641g.f106251a, new C20370ah(), new C45628f(this));
        AbstractC88412b unused3 = selectSubscribe(mo76830a(), C45642h.f106252a, new C20370ah(), new C45629g(this));
        AbstractC88412b unused4 = selectSubscribe(mo76830a(), C45643i.f106253a, new C20370ah(), new C45630h(this));
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        Bundle arguments = getArguments();
        C45594a aVar = new C45594a();
        aVar.setArguments(arguments);
        if (arguments != null) {
            arguments.putInt("parent_id", R.id.b80);
        }
        a.mo3453a(R.id.b80, aVar).mo3457a((String) null).mo3473c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.on, viewGroup, false);
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

    /* renamed from: a */
    private void m88152a(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super List<Region>, C89391z> bVar, AbstractC89172b<? super List<Region>, C89391z> bVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f106223b = aVar;
        this.f106224c = aVar2;
        this.f106225d = bVar;
        this.f106226e = bVar2;
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

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m88151a(C45620e eVar, AbstractC89171a aVar, AbstractC89171a aVar2, AbstractC89172b bVar, AbstractC89172b bVar2, int i) {
        if ((i & 1) != 0) {
            aVar = C45636m.f106246a;
        }
        if ((i & 2) != 0) {
            aVar2 = C45637n.f106247a;
        }
        if ((i & 4) != 0) {
            bVar = C45638o.f106248a;
        }
        if ((i & 8) != 0) {
            bVar2 = C45639p.f106249a;
        }
        eVar.m88152a(aVar, aVar2, bVar, bVar2);
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
