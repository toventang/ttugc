package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
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
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43860n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43864r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShippingAddress;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.p2831a.C43888b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44067c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44108g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89378p;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity */
public final class OrderSubmitActivity extends AbstractActivityC44311b implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: d */
    public static final C43649c f101735d = new C43649c((byte) 0);

    /* renamed from: a */
    public final C34499i f101736a = new C34499i();

    /* renamed from: b */
    public AbstractC89172b<? super MotionEvent, C89391z> f101737b;

    /* renamed from: c */
    public Fragment f101738c;

    /* renamed from: e */
    private final lifecycleAwareLazy f101739e;

    /* renamed from: f */
    private long f101740f;

    /* renamed from: h */
    private SparseArray f101741h;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$a */
    public static final class C43646a extends AbstractC89220m implements AbstractC89183m<OrderSubmitState, Bundle, OrderSubmitState> {
        public static final C43646a INSTANCE = new C43646a();

        static {
            Covode.recordClassIndex(51906);
        }

        public C43646a() {
            super(2);
        }

        public final OrderSubmitState invoke(OrderSubmitState orderSubmitState, Bundle bundle) {
            C89219l.m154719c(orderSubmitState, "");
            return orderSubmitState;
        }
    }

    static {
        Covode.recordClassIndex(51905);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f101741h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f101741h == null) {
            this.f101741h = new SparseArray();
        }
        View view = (View) this.f101741h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101741h.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final OrderSubmitViewModel mo74312a() {
        return (OrderSubmitViewModel) this.f101739e.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$c */
    public static final class C43649c {
        static {
            Covode.recordClassIndex(51909);
        }

        private C43649c() {
        }

        public /* synthetic */ C43649c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$i */
    public static final class C43658i extends C27895a<List<? extends Region>> {
        static {
            Covode.recordClassIndex(51918);
        }

        C43658i() {
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f101736a;
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo13015b(SystemClock.elapsedRealtime() - this.f101740f);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity", "onResume", true);
        super.onResume();
        this.f101740f = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        Fragment fragment = this.f101738c;
        if (fragment != null && (fragment instanceof AbstractC43756e)) {
            ((AbstractC43756e) fragment).mo73976g();
        }
    }

    public OrderSubmitActivity() {
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f101739e = new lifecycleAwareLazy(this, new C43647b(this, a, C43646a.INSTANCE, a));
        this.f101737b = C43654e.f101752a;
        this.f101740f = -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$b */
    public static final class C43647b extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0218d f101742a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f101743b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f101744c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89277c f101745d;

        static {
            Covode.recordClassIndex(51907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43647b(ActivityC0218d dVar, AbstractC89277c cVar, AbstractC89183m mVar, AbstractC89277c cVar2) {
            super(0);
            this.f101742a = dVar;
            this.f101743b = cVar;
            this.f101744c = mVar;
            this.f101745d = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.f101742a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f101745d
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r3)
                h.k.c r0 = r4.f101743b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m86661x5cbd4134(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.mo33696a(r0)
                if (r0 == 0) goto L_0x0038
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$b$1
                r0.<init>(r4)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.C43647b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86661x5cbd4134(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$d */
    static final class C43650d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101747a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitActivity f101748b;

        static {
            Covode.recordClassIndex(51910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43650d(C43420a aVar, OrderSubmitActivity orderSubmitActivity) {
            super(0);
            this.f101747a = aVar;
            this.f101748b = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f101748b.mo74312a().f101793o != null) {
                this.f101748b.mo74312a().mo74414b();
                OrderSubmitActivity orderSubmitActivity = this.f101748b;
                C43860n nVar = orderSubmitActivity.mo74312a().f101793o;
                C436511 r4 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.C43650d.C436511 */

                    /* renamed from: a */
                    final /* synthetic */ C43650d f101749a;

                    static {
                        Covode.recordClassIndex(51911);
                    }

                    {
                        this.f101749a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.C43650d.C436511.RunnableC436521 */

                            /* renamed from: a */
                            final /* synthetic */ C436511 f101750a;

                            static {
                                Covode.recordClassIndex(51912);
                            }

                            {
                                this.f101750a = r1;
                            }

                            public final void run() {
                                ActivityC0945e activity = this.f101750a.f101749a.f101747a.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        }, 450);
                        return C89391z.f203057a;
                    }
                };
                C436532 r5 = new AbstractC89172b<C43864r, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.C43650d.C436532 */

                    /* renamed from: a */
                    final /* synthetic */ C43650d f101751a;

                    static {
                        Covode.recordClassIndex(51913);
                    }

                    {
                        this.f101751a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C43864r rVar) {
                        C43864r rVar2 = rVar;
                        C89219l.m154721d(rVar2, "");
                        this.f101751a.f101748b.mo74312a().mo74409a(rVar2);
                        return C89391z.f203057a;
                    }
                };
                HashMap<String, Object> j = this.f101748b.mo74312a().mo74424j();
                j.put("previous_page", "shipping_address");
                new C43888b(orderSubmitActivity, nVar, r4, r5, j).mo74812a();
            } else {
                ActivityC0945e activity = this.f101747a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        int e = supportFragmentManager.mo3564e();
        if (e > 0) {
            AbstractC0952i.AbstractC0953a c = getSupportFragmentManager().mo3561c(e - 1);
            C89219l.m154716b(c, "");
            Fragment a = getSupportFragmentManager().mo3551a(c.mo3481h());
            if ((a instanceof AbstractC43718a) && ((AbstractC43718a) a).mo73975f()) {
                return;
            }
            if (e == 1) {
                finish();
            } else {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        Fragment fragment = this.f101738c;
        if (fragment != null && (fragment instanceof AbstractC43756e)) {
            ((AbstractC43756e) fragment).mo73977h();
        }
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$l */
    static final class C43661l implements AbstractC0952i.AbstractC0955c {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitActivity f101758a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f101759b;

        static {
            Covode.recordClassIndex(51921);
        }

        C43661l(OrderSubmitActivity orderSubmitActivity, C89233z.C89236c cVar) {
            this.f101758a = orderSubmitActivity;
            this.f101759b = cVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
        /* renamed from: a */
        public final void mo3582a() {
            Fragment fragment;
            AbstractC0952i supportFragmentManager = this.f101758a.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            int e = supportFragmentManager.mo3564e();
            if (e > 0) {
                int i = e - 1;
                AbstractC0952i supportFragmentManager2 = this.f101758a.getSupportFragmentManager();
                AbstractC0952i.AbstractC0953a c = this.f101758a.getSupportFragmentManager().mo3561c(i);
                C89219l.m154716b(c, "");
                Fragment a = supportFragmentManager2.mo3551a(c.mo3481h());
                if (a != null && (a instanceof AbstractC43756e)) {
                    ((AbstractC43756e) a).mo73976g();
                }
                if (!(this.f101758a.f101738c == null || (fragment = this.f101758a.f101738c) == null || !(fragment instanceof AbstractC43756e))) {
                    ((AbstractC43756e) fragment).mo73977h();
                }
                this.f101758a.f101738c = a;
                AbstractC0952i.AbstractC0953a c2 = this.f101758a.getSupportFragmentManager().mo3561c(i);
                C89219l.m154716b(c2, "");
                String.valueOf(c2.mo3481h());
            }
            if (e <= this.f101759b.element) {
                if (e == 0) {
                    this.f101758a.mo74312a().mo74407a((C43750c) null);
                } else {
                    AbstractC0952i supportFragmentManager3 = this.f101758a.getSupportFragmentManager();
                    AbstractC0952i supportFragmentManager4 = this.f101758a.getSupportFragmentManager();
                    C89219l.m154716b(supportFragmentManager4, "");
                    AbstractC0952i.AbstractC0953a c3 = supportFragmentManager3.mo3561c(supportFragmentManager4.mo3564e() - 1);
                    C89219l.m154716b(c3, "");
                    OrderSubmitViewModel a2 = this.f101758a.mo74312a();
                    String h = c3.mo3481h();
                    if (h == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(h, "");
                    a2.mo74407a(new C43750c(h, true));
                }
            }
            this.f101759b.element = e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$e */
    static final class C43654e extends AbstractC89220m implements AbstractC89172b<MotionEvent, C89391z> {

        /* renamed from: a */
        public static final C43654e f101752a = new C43654e();

        static {
            Covode.recordClassIndex(51914);
        }

        C43654e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static AbstractC0976n m86657a(AbstractC0976n nVar) {
        AbstractC0976n a = nVar.mo3452a(R.anim.aq, R.anim.ar, R.anim.aq, R.anim.ar);
        C89219l.m154716b(a, "");
        return a;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f101737b.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$g */
    static final class C43656g extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitActivity f101754a;

        static {
            Covode.recordClassIndex(51916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43656g(OrderSubmitActivity orderSubmitActivity) {
            super(1);
            this.f101754a = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44085n nVar) {
            C44085n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            this.f101754a.mo74312a().mo74410a(nVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$m */
    static final class C43662m extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C43662m f101760a = new C43662m();

        static {
            Covode.recordClassIndex(51922);
        }

        C43662m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C436631.f101761a);
            baseActivityViewModel2.config(C436642.f101762a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$h */
    static final class C43657h extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitActivity f101755a;

        static {
            Covode.recordClassIndex(51917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43657h(OrderSubmitActivity orderSubmitActivity) {
            super(1);
            this.f101755a = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44085n nVar) {
            C44085n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            HashMap<String, Object> hashMap = this.f101755a.mo74312a().f101769F;
            if (hashMap != null) {
                hashMap.put("previous_page", "payment_method");
            }
            this.f101755a.mo74312a().mo74410a(nVar2);
            this.f101755a.mo74312a().mo74402a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$f */
    static final class C43655f extends AbstractC89220m implements AbstractC89172b<C89378p<? extends String, ? extends Address>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitActivity f101753a;

        static {
            Covode.recordClassIndex(51915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43655f(OrderSubmitActivity orderSubmitActivity) {
            super(1);
            this.f101753a = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends String, ? extends Address> pVar) {
            C89378p<? extends String, ? extends Address> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            HashMap<String, Object> hashMap = this.f101753a.mo74312a().f101769F;
            if (hashMap != null) {
                hashMap.put("previous_page", "shipping_address");
            }
            this.f101753a.mo74312a().f101788g = new ShippingAddress((Address) pVar2.getSecond(), null, null, null, null);
            this.f101753a.mo74312a().f101785d = null;
            this.f101753a.mo74312a().mo74402a();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putString("requestParams", C80342dg.m139300a().mo46674b(new OrderSubmitRequestParam(mo74312a().f101783b, mo74312a().f101784c, null, null, 12, null)));
        bundle.putString("chainKey", mo74312a().f101786e);
        bundle.putString("trackParams", C80342dg.m139300a().mo46674b(mo74312a().f101769F));
        bundle.putString("repoId", mo74312a().f101772I);
        bundle.putString("response", C80342dg.m139300a().mo46674b(mo74312a().f101789k));
        Fragment fragment = this.f101738c;
        if (fragment != null) {
            str = fragment.getTag();
        } else {
            str = null;
        }
        bundle.putString("last_page", str);
        bundle.putInt("buy_type", mo74312a().f101782a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01eb A[SYNTHETIC, Splitter:B:87:0x01eb] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0277  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 653
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m86658a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$k */
    static final class C43660k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitActivity f101757a;

        static {
            Covode.recordClassIndex(51920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43660k(OrderSubmitActivity orderSubmitActivity) {
            super(2);
            this.f101757a = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            ViewPropertyAnimator duration;
            float f;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            ViewPropertyAnimator animate = this.f101757a._$_findCachedViewById(R.id.e7b).animate();
            if (!(animate == null || (duration = animate.setDuration(300)) == null)) {
                if (booleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                duration.alpha(f);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$j */
    static final class C43659j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C43750c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitActivity f101756a;

        static {
            Covode.recordClassIndex(51919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43659j(OrderSubmitActivity orderSubmitActivity) {
            super(2);
            this.f101756a = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C43750c cVar) {
            int i;
            int i2;
            InputItemData inputItemData;
            Address address;
            C43750c cVar2 = cVar;
            C89219l.m154721d(iVar, "");
            if (cVar2 != null && !cVar2.f102010b) {
                String str = cVar2.f102009a;
                int hashCode = str.hashCode();
                if (hashCode != -1273172058) {
                    String str2 = null;
                    C44089r rVar = null;
                    if (hashCode != -129088550) {
                        if (hashCode == 1664927849 && str.equals("payment_fragment")) {
                            AbstractC0976n a = this.f101756a.getSupportFragmentManager().mo3552a();
                            C89219l.m154716b(a, "");
                            AbstractC0976n a2 = OrderSubmitActivity.m86657a(a);
                            OrderSubmitActivity orderSubmitActivity = this.f101756a;
                            C44108g gVar = new C44108g();
                            HashMap<String, Object> hashMap = orderSubmitActivity.mo74312a().f101769F;
                            if (hashMap == null) {
                                hashMap = new HashMap<>();
                            }
                            HashMap hashMap2 = new HashMap(hashMap);
                            ShippingAddress shippingAddress = orderSubmitActivity.mo74312a().f101788g;
                            if (shippingAddress != null) {
                                address = shippingAddress.getShippingAddress();
                            } else {
                                address = null;
                            }
                            BillInfoData billInfoData = orderSubmitActivity.mo74312a().f101789k;
                            if (billInfoData != null) {
                                rVar = billInfoData.getPaymentMethods();
                            }
                            gVar.mo74988a(new C44067c(2, 3, Integer.valueOf(C44067c.EnumC44068a.NEXT.ordinal()), rVar, null, false, orderSubmitActivity.mo74312a().f101792n, hashMap2, null, address, 304));
                            C43656g gVar2 = new C43656g(orderSubmitActivity);
                            C89219l.m154721d(gVar2, "");
                            gVar.f102870e = gVar2;
                            gVar.mo74989a(new C43657h(orderSubmitActivity));
                            a2.mo3454a(R.id.b82, gVar, "payment_fragment").mo3457a("payment_fragment").mo3473c();
                        }
                    } else if (str.equals("address_edit_fragment")) {
                        AbstractC0976n a3 = this.f101756a.getSupportFragmentManager().mo3552a();
                        C89219l.m154716b(a3, "");
                        AbstractC0976n a4 = OrderSubmitActivity.m86657a(a3);
                        OrderSubmitActivity orderSubmitActivity2 = this.f101756a;
                        C43420a aVar = new C43420a();
                        List<Region> list = orderSubmitActivity2.mo74312a().f101785d;
                        String b = C80342dg.m139300a().mo46674b(orderSubmitActivity2.mo74312a().f101769F);
                        if (orderSubmitActivity2.mo74312a().f101774K.size() == 3) {
                            i = 1;
                        } else {
                            i = null;
                        }
                        if (orderSubmitActivity2.mo74312a().f101774K.size() == 3) {
                            i2 = 3;
                        } else {
                            i2 = null;
                        }
                        BillInfoData billInfoData2 = orderSubmitActivity2.mo74312a().f101789k;
                        if (billInfoData2 != null) {
                            inputItemData = billInfoData2.getAddressInputItemData();
                        } else {
                            inputItemData = null;
                        }
                        if (orderSubmitActivity2.mo74312a().f101774K.size() == 3) {
                            str2 = orderSubmitActivity2.getString(R.string.bgq);
                        }
                        aVar.mo73970a(new AddressPageStarter.AddressEditEnterParams(list, null, "product_detail", b, i, i2, inputItemData, true, 1, str2));
                        C43655f fVar = new C43655f(orderSubmitActivity2);
                        C89219l.m154721d(fVar, "");
                        aVar.f101316d = fVar;
                        aVar.f101317e = new C43650d(aVar, orderSubmitActivity2);
                        a4.mo3454a(R.id.b82, aVar, "address_edit_fragment").mo3457a("address_edit_fragment").mo3473c();
                    }
                } else if (str.equals("order_submit_fragment")) {
                    AbstractC0976n a5 = this.f101756a.getSupportFragmentManager().mo3552a();
                    C89219l.m154716b(a5, "");
                    OrderSubmitActivity.m86657a(a5).mo3454a(R.id.b82, new C43777j(), "order_submit_fragment").mo3457a("order_submit_fragment").mo3473c();
                }
            }
            return C89391z.f203057a;
        }
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
