package com.p2082ss.android.ugc.aweme.ecommerce.delivery;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
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
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.C44353a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.C44354b;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45262h;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45263i;
import com.p2082ss.android.ugc.aweme.ecommerce.router.StrategyService;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
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

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b */
public final class C44375b extends C44294a implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: b */
    public static final C44380d f103484b = new C44380d((byte) 0);

    /* renamed from: a */
    public final C34499i f103485a = new C34499i();

    /* renamed from: c */
    private final lifecycleAwareLazy f103486c;

    /* renamed from: d */
    private final AbstractC89244h f103487d;

    /* renamed from: e */
    private SparseArray f103488e;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b$b */
    public static final class C44377b extends AbstractC89220m implements AbstractC89183m<DeliveryPanelState, Bundle, DeliveryPanelState> {
        public static final C44377b INSTANCE = new C44377b();

        static {
            Covode.recordClassIndex(52709);
        }

        public C44377b() {
            super(2);
        }

        public final DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState, Bundle bundle) {
            C89219l.m154719c(deliveryPanelState, "");
            return deliveryPanelState;
        }
    }

    static {
        Covode.recordClassIndex(52707);
    }

    /* renamed from: c */
    private final AbstractC44374g m87093c() {
        return (AbstractC44374g) this.f103487d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final View mo74087a(int i) {
        if (this.f103488e == null) {
            this.f103488e = new SparseArray();
        }
        View view = (View) this.f103488e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f103488e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final void mo74088a() {
        SparseArray sparseArray = this.f103488e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final DeliveryPanelViewModel mo75406b() {
        return (DeliveryPanelViewModel) this.f103486c.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b$d */
    public static final class C44380d {
        static {
            Covode.recordClassIndex(52712);
        }

        private C44380d() {
        }

        public /* synthetic */ C44380d(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f103485a;
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

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    /* renamed from: e */
    public final AbstractC45271m mo75221e() {
        return m87093c();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b$a */
    public static final class C44376a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f103489a;

        static {
            Covode.recordClassIndex(52708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44376a(AbstractC89277c cVar) {
            super(0);
            this.f103489a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f103489a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onDestroyView() {
        super.onDestroyView();
        m87093c().mo75401d();
        mo74088a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        m87093c().mo75399b();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b$c */
    public static final class C44378c extends AbstractC89220m implements AbstractC89171a<DeliveryPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f103490a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f103491b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f103492c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f103493d;

        static {
            Covode.recordClassIndex(52710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44378c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f103490a = fragment;
            this.f103491b = aVar;
            this.f103492c = cVar;
            this.f103493d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f103490a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f103491b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f103492c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m87099x87f7e055(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.delivery.b$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.b$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.C44375b.C44378c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_DeliveryWrapperFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87099x87f7e055(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b$e */
    static final class C44381e extends AbstractC89220m implements AbstractC89171a<AbstractC44374g> {

        /* renamed from: a */
        final /* synthetic */ C44375b f103495a;

        static {
            Covode.recordClassIndex(52713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44381e(C44375b bVar) {
            super(0);
            this.f103495a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC44374g invoke() {
            Uri uri;
            AbstractC45262h b = StrategyService.m87825b().mo76330a().mo76349a(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.delivery.C44375b.C44381e.C443821 */

                /* renamed from: a */
                final /* synthetic */ C44381e f103496a;

                static {
                    Covode.recordClassIndex(52714);
                }

                {
                    this.f103496a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C44354b(this.f103496a.f103495a, this.f103496a.f103495a.mo75406b());
                }
            }).mo76351b(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.delivery.C44375b.C44381e.C443832 */

                /* renamed from: a */
                final /* synthetic */ C44381e f103497a;

                static {
                    Covode.recordClassIndex(52715);
                }

                {
                    this.f103497a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C44353a(this.f103497a.f103495a, this.f103497a.f103495a.mo75406b());
                }
            });
            Bundle arguments = this.f103495a.getArguments();
            if (arguments != null) {
                uri = (Uri) arguments.getParcelable("uri");
            } else {
                uri = null;
            }
            return C45263i.m87840a(b, uri);
        }
    }

    public C44375b() {
        super((byte) 0);
        AbstractC89277c a = C89204ab.m154669a(DeliveryPanelViewModel.class);
        C44376a aVar = new C44376a(a);
        this.f103486c = new lifecycleAwareLazy(this, aVar, new C44378c(this, aVar, a, C44377b.INSTANCE));
        this.f103487d = C89250i.m154773a((AbstractC89171a) new C44381e(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onCancel(DialogInterface dialogInterface) {
        C89219l.m154721d(dialogInterface, "");
        super.onCancel(dialogInterface);
        m87093c().mo75402e();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m87093c().mo75397a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i, com.google.android.material.bottomsheet.C26614b, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        m87093c().mo75398a(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m87093c().mo75400c();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC44374g c = m87093c();
            C89219l.m154716b(activity, "");
            c.mo76357a(activity, bundle);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC44374g c = m87093c();
            C89219l.m154716b(activity, "");
            c.mo76359b(activity, bundle);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return m87093c().mo75396a(layoutInflater, viewGroup);
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
