package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
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
import com.bytedance.widget.C23669c;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44769d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44867d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
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

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i */
public final class C44805i extends AbstractC34586a implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: c */
    public static final C44809c f104521c = new C44809c((byte) 0);

    /* renamed from: a */
    public C34499i f104522a = new C34499i();

    /* renamed from: b */
    public AbstractC88412b f104523b;

    /* renamed from: d */
    private final lifecycleAwareLazy f104524d;

    /* renamed from: e */
    private SparseArray f104525e;

    static {
        Covode.recordClassIndex(53191);
    }

    /* renamed from: a */
    public final PdpViewModel mo75944a() {
        return (PdpViewModel) this.f104524d.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$c */
    public static final class C44809c {
        static {
            Covode.recordClassIndex(53195);
        }

        private C44809c() {
        }

        public /* synthetic */ C44809c(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f104522a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$a */
    public static final class C44806a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f104526a;

        static {
            Covode.recordClassIndex(53192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44806a(AbstractC89277c cVar) {
            super(0);
            this.f104526a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f104526a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC88412b bVar = this.f104523b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f104523b = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f104525e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$b */
    public static final class C44807b extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f104527a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f104528b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104529c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f104530d;

        static {
            Covode.recordClassIndex(53193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44807b(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f104527a = fragment;
            this.f104528b = aVar;
            this.f104529c = cVar;
            this.f104530d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f104527a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f104528b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f104529c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m87528x8be1bd9c(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.pdp.i$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.i$b$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44805i.C44807b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_PdpFullFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87528x8be1bd9c(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C44805i() {
        C44814h hVar = C44814h.f104537a;
        AbstractC89277c a = C89204ab.m154669a(PdpViewModel.class);
        C44806a aVar = new C44806a(a);
        this.f104524d = new lifecycleAwareLazy(this, aVar, new C44807b(this, aVar, a, hVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$g */
    static final class C44813g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44805i f104536a;

        static {
            Covode.recordClassIndex(53199);
        }

        C44813g(C44805i iVar) {
            this.f104536a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC88412b bVar = this.f104536a.f104523b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f104536a.f104523b = null;
            if (th instanceof IPdpStarter.C44633b) {
                this.f104536a.mo75944a().mo75819a((ProductPackStruct) null, Integer.valueOf(((IPdpStarter.C44633b) th).getCode()));
            } else {
                this.f104536a.mo75944a().mo75819a((ProductPackStruct) null, (Integer) null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$f */
    static final class C44812f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44805i f104534a;

        /* renamed from: b */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104535b;

        static {
            Covode.recordClassIndex(53198);
        }

        C44812f(C44805i iVar, IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f104534a = iVar;
            this.f104535b = pdpEnterParam;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            this.f104534a.mo75944a().mo75819a(productPackStruct, (Integer) null);
            AbstractC88412b bVar = this.f104534a.f104523b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f104534a.f104523b = null;
            if (TextUtils.isEmpty(this.f104535b.getChainKey()) && !TextUtils.isEmpty(productPackStruct.f104694v)) {
                HashMap<String, Object> visitReportParams = this.f104535b.getVisitReportParams();
                if (visitReportParams != null) {
                    String str = productPackStruct.f104694v;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    visitReportParams.put("chain_key", str);
                }
                this.f104535b.setChainKey(productPackStruct.f104694v);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int i;
        ProductPackStruct productPackStruct;
        Long l;
        long j;
        int i2;
        ActivityC0945e activity;
        super.onCreate(bundle);
        if (!(bundle == null || (activity = getActivity()) == null)) {
            activity.finish();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("ENTER_PARAMS");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam");
        IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) serializable;
        mo75944a().f104162s = C44720k.C44721a.m87476a(getContext());
        mo75944a().f104147a = pdpEnterParam;
        mo75944a().f104166w = true;
        mo75944a().mo75821a(true);
        C44720k kVar = mo75944a().f104162s;
        if (kVar != null) {
            kVar.mo75866a(true);
        }
        PdpViewModel a = mo75944a();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("PREFETCH_TYPE");
        } else {
            i = 0;
        }
        a.f104155l = i;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            productPackStruct = (ProductPackStruct) arguments3.getParcelable("PREFETCH_RESULT");
        } else {
            productPackStruct = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (i2 = arguments4.getInt("ERROR_CODE", 0)) != 0) {
            mo75944a().mo75819a((ProductPackStruct) null, Integer.valueOf(i2));
        } else if (productPackStruct != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                l = Long.valueOf(arguments5.getLong("PREFETCH_FINISH_TIME"));
            } else {
                l = null;
            }
            mo75944a().mo75819a(productPackStruct, (Integer) null);
            C44720k kVar2 = mo75944a().f104162s;
            if (kVar2 != null) {
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                kVar2.f104336s = j;
            }
        } else {
            C44867d a2 = IPdpStarter.C44631a.m87369a().mo75742a(pdpEnterParam, true);
            if (a2.f104627d != null) {
                mo75944a().mo75819a(a2.f104627d, (Integer) null);
            } else {
                this.f104523b = a2.f104626c.mo143254a(new C44812f(this, pdpEnterParam), new C44813g(this));
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$d */
    static final class C44810d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44805i f104532a;

        static {
            Covode.recordClassIndex(53196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44810d(C44805i iVar) {
            super(2);
            this.f104532a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            ActivityC0945e activity;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue && (activity = this.f104532a.getActivity()) != null) {
                activity.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$e */
    static final class C44811e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44805i f104533a;

        static {
            Covode.recordClassIndex(53197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44811e(C44805i iVar) {
            super(2);
            this.f104533a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar2, "");
            if (booleanValue) {
                ImagePreloadExperiment imagePreloadExperiment = ImagePreloadExperiment.INSTANCE;
                AbstractC1196i lifecycle = iVar2.getLifecycle();
                C89219l.m154716b(lifecycle, "");
                imagePreloadExperiment.onFirstHeaderImageReady(lifecycle, this.f104533a.mo75944a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.i$h */
    static final class C44814h extends AbstractC89220m implements AbstractC89183m<PdpMainState, Bundle, PdpMainState> {

        /* renamed from: a */
        public static final C44814h f104537a = new C44814h();

        static {
            Covode.recordClassIndex(53200);
        }

        C44814h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState, Bundle bundle) {
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 3, null, null, 1.0f, 0, null, 0, false, null, null, null, null, null, 65463, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C23669c a = C23669c.C23671a.m44763a(this, getView());
        a.mo39100a(R.id.vc, new PdpBodyWidget(this), C44769d.f104450a);
        a.mo39100a(R.id.be2, new PdpHeadNavBarWidget(getFragmentManager()), C44769d.f104450a);
        a.mo39100a(R.id.uf, new PdpBottomNavBarWidget(this), C44769d.f104450a);
        AbstractC88412b unused = selectSubscribe(mo75944a(), C44815j.f104538a, new C20370ah(), new C44810d(this));
        AbstractC88412b unused2 = selectSubscribe(mo75944a(), C44816k.f104539a, new C20370ah(), new C44811e(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C44766a.m87492a(getContext(), R.layout.pl, viewGroup, false);
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
