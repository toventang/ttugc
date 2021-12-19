package com.p2082ss.android.ugc.aweme.ecommerce.address.list;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
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
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.AbstractC43570i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.C43549a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.C43550b;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45263i;
import com.p2082ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
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

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity */
public final class AddressListActivity extends AbstractActivityC44311b implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: c */
    public static final C43529c f101520c = new C43529c((byte) 0);

    /* renamed from: a */
    public final C34499i f101521a = new C34499i();

    /* renamed from: b */
    final lifecycleAwareLazy f101522b;

    /* renamed from: d */
    private final AbstractC89244h f101523d;

    /* renamed from: e */
    private long f101524e;

    /* renamed from: f */
    private SparseArray f101525f;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$a */
    public static final class C43526a extends AbstractC89220m implements AbstractC89183m<AddressListState, Bundle, AddressListState> {
        public static final C43526a INSTANCE = new C43526a();

        static {
            Covode.recordClassIndex(51764);
        }

        public C43526a() {
            super(2);
        }

        public final AddressListState invoke(AddressListState addressListState, Bundle bundle) {
            C89219l.m154719c(addressListState, "");
            return addressListState;
        }
    }

    static {
        Covode.recordClassIndex(51763);
    }

    /* renamed from: a */
    private final AbstractC43570i m86581a() {
        return (AbstractC43570i) this.f101523d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f101525f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f101525f == null) {
            this.f101525f = new SparseArray();
        }
        View view = (View) this.f101525f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101525f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$c */
    public static final class C43529c {
        static {
            Covode.recordClassIndex(51767);
        }

        private C43529c() {
        }

        public /* synthetic */ C43529c(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f101521a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$d */
    static final class C43530d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddressListActivity f101531a;

        static {
            Covode.recordClassIndex(51768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43530d(AddressListActivity addressListActivity) {
            super(0);
            this.f101531a = addressListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AddressListActivity.super.onBackPressed();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        m86581a().mo73991a(new C43530d(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        m86581a().mo74036c();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        m86581a().mo74035b();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo13015b(SystemClock.elapsedRealtime() - this.f101524e);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onResume", true);
        super.onResume();
        this.f101524e = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onResume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$f */
    static final class C43533f extends AbstractC89220m implements AbstractC89171a<AbstractC43570i> {

        /* renamed from: a */
        final /* synthetic */ AddressListActivity f101534a;

        static {
            Covode.recordClassIndex(51771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43533f(AddressListActivity addressListActivity) {
            super(0);
            this.f101534a = addressListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC43570i invoke() {
            return C45263i.m87840a(StrategyService.m87825b().mo76330a().mo76349a(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity.C43533f.C435341 */

                /* renamed from: a */
                final /* synthetic */ C43533f f101535a;

                static {
                    Covode.recordClassIndex(51772);
                }

                {
                    this.f101535a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C43550b(this.f101535a.f101534a, (AddressListViewModel) this.f101535a.f101534a.f101522b.getValue());
                }
            }).mo76351b(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity.C43533f.C435352 */

                /* renamed from: a */
                final /* synthetic */ C43533f f101536a;

                static {
                    Covode.recordClassIndex(51773);
                }

                {
                    this.f101536a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C43549a(this.f101536a.f101534a);
                }
            }), this.f101534a.getIntent().getData());
        }
    }

    public AddressListActivity() {
        AbstractC89277c a = C89204ab.m154669a(AddressListViewModel.class);
        this.f101522b = new lifecycleAwareLazy(this, new C43527b(this, a, C43526a.INSTANCE, a));
        this.f101523d = C89250i.m154773a((AbstractC89171a) new C43533f(this));
        this.f101524e = -1;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$b */
    public static final class C43527b extends AbstractC89220m implements AbstractC89171a<AddressListViewModel> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0218d f101526a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f101527b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f101528c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89277c f101529d;

        static {
            Covode.recordClassIndex(51765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43527b(ActivityC0218d dVar, AbstractC89277c cVar, AbstractC89183m mVar, AbstractC89277c cVar2) {
            super(0);
            this.f101526a = dVar;
            this.f101527b = cVar;
            this.f101528c = mVar;
            this.f101529d = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.f101526a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f101529d
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r3)
                h.k.c r0 = r4.f101527b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m86584xed577d9b(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.mo33696a(r0)
                if (r0 == 0) goto L_0x0038
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$b$1
                r0.<init>(r4)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity.C43527b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_list_AddressListActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86584xed577d9b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$e */
    static final class C43531e extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C43531e f101532a = new C43531e();

        static {
            Covode.recordClassIndex(51769);
        }

        C43531e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C435321.f101533a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onCreate", true);
        activityConfiguration(C43531e.f101532a);
        super.onCreate(bundle);
        m86581a().mo74034a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onRestoreInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onRestoreInstanceState(bundle);
        m86581a().mo76357a(this, bundle);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        m86581a().mo76359b(this, bundle);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
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
