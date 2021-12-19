package com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
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
import com.bytedance.widget.Widget;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44761w;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.C45418c;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.C45421d;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.C45429a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2859a.C45383a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.EnumC45533a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
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

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c */
public final class C45393c extends AbstractC45390a implements AbstractC20527q {

    /* renamed from: a */
    final AbstractC89244h f105789a = C89250i.m154773a((AbstractC89171a) C45412o.f105817a);

    /* renamed from: b */
    final AbstractC89244h f105790b = C89250i.m154773a((AbstractC89171a) C45411n.f105816a);

    /* renamed from: c */
    final AbstractC89244h f105791c = C89250i.m154773a((AbstractC89171a) new C45410m(this));

    /* renamed from: d */
    final AbstractC89244h f105792d = C89250i.m154773a((AbstractC89171a) C45413p.f105818a);

    /* renamed from: e */
    public BottomSheetBehavior<FrameLayout> f105793e;

    /* renamed from: f */
    public final C45421d f105794f;

    /* renamed from: o */
    private final lifecycleAwareLazy f105795o;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$b */
    public static final class C45395b extends AbstractC89220m implements AbstractC89183m<SkuState, Bundle, SkuState> {
        public static final C45395b INSTANCE = new C45395b();

        static {
            Covode.recordClassIndex(53869);
        }

        public C45395b() {
            super(2);
        }

        public final SkuState invoke(SkuState skuState, Bundle bundle) {
            C89219l.m154719c(skuState, "");
            return skuState;
        }
    }

    static {
        Covode.recordClassIndex(53867);
    }

    /* renamed from: e */
    public final SkuPanelViewModel mo76512e() {
        return (SkuPanelViewModel) this.f105795o.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$n */
    static final class C45411n extends AbstractC89220m implements AbstractC89171a<SkuPanelCounterWidget> {

        /* renamed from: a */
        public static final C45411n f105816a = new C45411n();

        static {
            Covode.recordClassIndex(53885);
        }

        C45411n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SkuPanelCounterWidget invoke() {
            return new SkuPanelCounterWidget();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$o */
    static final class C45412o extends AbstractC89220m implements AbstractC89171a<SkuPanelHeaderWidget> {

        /* renamed from: a */
        public static final C45412o f105817a = new C45412o();

        static {
            Covode.recordClassIndex(53886);
        }

        C45412o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SkuPanelHeaderWidget invoke() {
            return new SkuPanelHeaderWidget();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$p */
    static final class C45413p extends AbstractC89220m implements AbstractC89171a<SkuWidget> {

        /* renamed from: a */
        public static final C45413p f105818a = new C45413p();

        static {
            Covode.recordClassIndex(53887);
        }

        C45413p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SkuWidget invoke() {
            return new SkuWidget();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$d */
    static final class C45398d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45393c f105802a;

        static {
            Covode.recordClassIndex(53872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45398d(C45393c cVar) {
            super(2);
            this.f105802a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$d$a */
        static final class RunnableC45399a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45398d f105803a;

            static {
                Covode.recordClassIndex(53873);
            }

            RunnableC45399a(C45398d dVar) {
                this.f105803a = dVar;
            }

            public final void run() {
                this.f105803a.f105802a.f105794f.dismissAllowingStateLoss();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            SkuPanelState skuPanelState;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue && (skuPanelState = this.f105802a.mo76512e().f106005c) != null) {
                if (skuPanelState.getJumpOSP()) {
                    SkuPanelStarter.m87954a(this.f105802a.mo76512e().f106005c);
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC45399a(this), 450);
                } else {
                    this.f105802a.f105794f.dismissAllowingStateLoss();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$a */
    public static final class C45394a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f105796a;

        static {
            Covode.recordClassIndex(53868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45394a(AbstractC89277c cVar) {
            super(0);
            this.f105796a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f105796a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f105794f.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$m */
    static final class C45410m extends AbstractC89220m implements AbstractC89171a<SkuPanelBottomWidget> {

        /* renamed from: a */
        final /* synthetic */ C45393c f105815a;

        static {
            Covode.recordClassIndex(53884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45410m(C45393c cVar) {
            super(0);
            this.f105815a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SkuPanelBottomWidget invoke() {
            int i;
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.f105815a.mo76512e().f106007e;
            if (skuEnterParams != null) {
                i = skuEnterParams.getClickFrom();
            } else {
                i = 0;
            }
            return new SkuPanelBottomWidget(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: b */
    public final void mo76507b() {
        Dialog dialog = this.f105794f.getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface$OnShowListenerC45409l(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$c */
    public static final class C45396c extends AbstractC89220m implements AbstractC89171a<SkuPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f105797a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f105798b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105799c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f105800d;

        static {
            Covode.recordClassIndex(53870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45396c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f105797a = fragment;
            this.f105798b = aVar;
            this.f105799c = cVar;
            this.f105800d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f105797a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f105798b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f105799c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m87986x880c8b60(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.sku.b.c$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.sku.b.c$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.C45393c.C45396c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_sku_strategy_SkuPanelNativeStrategy$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87986x880c8b60(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$k */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC45408k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C45393c f105813a;

        static {
            Covode.recordClassIndex(53882);
        }

        public final void onGlobalLayout() {
            this.f105813a.mo76511a(true);
            FrameLayout frameLayout = (FrameLayout) this.f105813a.f105794f.mo74087a(R.id.e1y);
            C89219l.m154716b(frameLayout, "");
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC45408k(C45393c cVar) {
            this.f105813a = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: c */
    public final void mo76508c() {
        SkuPanelStarter.m87954a(mo76512e().f106005c);
        IEventCenter a = EventCenter.m87158a();
        String b = C33039i.m67673a().mo46674b(mo76512e().f106005c);
        if (b == null) {
            b = "{}";
        }
        a.mo75479a("ec_sku_panel_close", b);
        C45383a.f105750a.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: d */
    public final void mo76509d() {
        int i;
        String str;
        String str2;
        boolean z;
        List<SaleProp> list;
        SkuInfo skuInfo = mo76512e().f106006d;
        if (skuInfo == null || (list = skuInfo.f105854b) == null) {
            i = 0;
        } else {
            i = list.size();
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = mo76512e().f106007e;
        Integer num = null;
        if (skuEnterParams != null) {
            str = skuEnterParams.getEnterFrom();
        } else {
            str = null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f105794f.f103308j;
        if (ActivityStack.isAppBackGround()) {
            str2 = "close";
        } else {
            SkuPanelState skuPanelState = mo76512e().f106005c;
            if (skuPanelState == null || !skuPanelState.getJumpOSP()) {
                str2 = "return";
            } else {
                str2 = "next";
            }
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = mo76512e().f106007e;
        if (skuEnterParams2 != null) {
            num = Integer.valueOf(skuEnterParams2.getClickFrom());
        }
        String a = C45429a.m87999a(num);
        if (mo76512e().f106006d != null) {
            z = true;
        } else {
            z = false;
        }
        C89219l.m154721d(str2, "");
        C45544c.m88081a("tiktokec_stay_page", new C45383a.C45388e(i, elapsedRealtime, str2, z, str, a));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: a */
    public final void mo76505a() {
        Serializable serializable;
        String productId;
        ProductPackStruct a;
        SkuPanelStarter.SkuEnterParams skuEnterParams;
        Integer usePrefetch;
        SkuPanelViewModel e = mo76512e();
        Bundle arguments = this.f105794f.getArguments();
        HashMap<String, Object> hashMap = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("enter_params");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter.SkuEnterParams");
        e.f106007e = (SkuPanelStarter.SkuEnterParams) serializable;
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = mo76512e().f106007e;
        if (skuEnterParams2 != null && skuEnterParams2.getProductId() != null) {
            AbstractC88412b unused = selectSubscribe(mo76512e(), C45414d.f105819a, new C20370ah(), new C45398d(this));
            AbstractC88412b unused2 = selectSubscribe(mo76512e(), C45415e.f105820a, new C20370ah(), new C45400e(this));
            AbstractC88412b unused3 = selectSubscribe(mo76512e(), C45416f.f105821a, new C20370ah(), new C45402f(this));
            AbstractC88412b unused4 = selectSubscribe(mo76512e(), C45417g.f105822a, new C20370ah(), new C45403g(this));
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = mo76512e().f106007e;
            if (skuEnterParams3 == null || !skuEnterParams3.getNeedRequest()) {
                IEventCenter a2 = EventCenter.m87158a();
                String b = C33039i.m67673a().mo46674b(mo76512e().f106007e);
                if (b == null) {
                    b = "{}";
                }
                a2.mo75479a("ec_sku_panel_open", b);
            } else {
                SkuPanelViewModel e2 = mo76512e();
                C45421d dVar = this.f105794f;
                C89219l.m154721d(dVar, "");
                SkuPanelStarter.SkuEnterParams skuEnterParams4 = e2.f106007e;
                if (!(skuEnterParams4 == null || (productId = skuEnterParams4.getProductId()) == null || productId.length() == 0 || (a = C45418c.f105824b.mo33459b(productId)) == null)) {
                    C89219l.m154721d(a, "");
                    if (SystemClock.elapsedRealtime() - a.f104673a <= ((long) C45418c.f105823a) && (skuEnterParams = e2.f106007e) != null && (usePrefetch = skuEnterParams.getUsePrefetch()) != null && usePrefetch.intValue() == 1) {
                        e2.mo76702a(a);
                    }
                }
                e2.mo76707b(true);
                e2.f106012m = AbstractC44834a.C44835a.m87545a().mo75949a(SkuPanelStarter.m87953a(e2.f106007e), false, 0, true, true).f104626c.mo143254a(new SkuPanelViewModel.C45514h(e2), new SkuPanelViewModel.C45515i(e2, dVar));
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams5 = mo76512e().f106007e;
            if (skuEnterParams5 != null) {
                hashMap = skuEnterParams5.getTrackParams();
            }
            LinkedHashMap<String, Object> linkedHashMap = C45383a.f105750a;
            if (hashMap != null) {
                linkedHashMap.putAll(hashMap);
            }
            linkedHashMap.put("is_fullscreen", 0);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            mo76512e().f106009g = this.f105794f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$h */
    static final class View$OnClickListenerC45404h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45393c f105809a;

        static {
            Covode.recordClassIndex(53878);
        }

        View$OnClickListenerC45404h(C45393c cVar) {
            this.f105809a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f105809a.f105794f.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$j */
    static final class View$OnClickListenerC45406j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45393c f105811a;

        static {
            Covode.recordClassIndex(53880);
        }

        View$OnClickListenerC45406j(C45393c cVar) {
            this.f105811a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C45393c cVar = this.f105811a;
            cVar.withState(cVar.mo76512e(), new AbstractC89172b<SkuState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.C45393c.View$OnClickListenerC45406j.C454071 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC45406j f105812a;

                static {
                    Covode.recordClassIndex(53881);
                }

                {
                    this.f105812a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    C89219l.m154721d(skuState2, "");
                    if (C89219l.m154714a((Object) skuState2.getKeyBoardVisibility(), (Object) true)) {
                        this.f105812a.f105811a.mo76512e().mo76704a(false);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$l */
    static final class DialogInterface$OnShowListenerC45409l implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C45393c f105814a;

        static {
            Covode.recordClassIndex(53883);
        }

        DialogInterface$OnShowListenerC45409l(C45393c cVar) {
            this.f105814a = cVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            FrameLayout frameLayout = (FrameLayout) ((DialogC26609a) dialogInterface).findViewById(R.id.ajx);
            if (frameLayout != null) {
                C45393c cVar = this.f105814a;
                BottomSheetBehavior<FrameLayout> a = BottomSheetBehavior.m52754a(frameLayout);
                a.f62895i = true;
                cVar.f105793e = a;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45393c(C45421d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
        this.f105794f = dVar;
        AbstractC89277c a = C89204ab.m154669a(SkuPanelViewModel.class);
        C45394a aVar = new C45394a(a);
        this.f105795o = new lifecycleAwareLazy(dVar, aVar, new C45396c(dVar, aVar, a, C45395b.INSTANCE));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: a */
    public final void mo76506a(View view) {
        int i;
        String str;
        List<SaleProp> list;
        C89219l.m154721d(view, "");
        SkuInfo skuInfo = mo76512e().f106006d;
        if (skuInfo == null || (list = skuInfo.f105854b) == null) {
            i = 0;
        } else {
            i = list.size();
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = mo76512e().f106007e;
        Integer num = null;
        if (skuEnterParams != null) {
            str = skuEnterParams.getEnterFrom();
        } else {
            str = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = mo76512e().f106007e;
        if (skuEnterParams2 != null) {
            num = Integer.valueOf(skuEnterParams2.getClickFrom());
        }
        C45544c.m88081a("tiktokec_enter_page", new C45383a.C45387d(i, str, C45429a.m87999a(num)));
    }

    /* renamed from: a */
    public final void mo76511a(boolean z) {
        Long l;
        boolean z2;
        Object obj;
        SkuPanelStarter.SkuEnterParams skuEnterParams = mo76512e().f106007e;
        if (skuEnterParams != null && (l = SkuPanelStarter.f105748b) != null) {
            long longValue = l.longValue();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashMap hashMap = new HashMap();
            HashMap<String, Object> orderRequestParams = skuEnterParams.getOrderRequestParams();
            if (orderRequestParams != null) {
                hashMap.putAll(orderRequestParams);
            }
            HashMap<String, Object> visitReportParams = skuEnterParams.getVisitReportParams();
            if (visitReportParams != null) {
                hashMap.putAll(visitReportParams);
            }
            HashMap<String, Object> trackParams = skuEnterParams.getTrackParams();
            if (trackParams != null) {
                hashMap.putAll(trackParams);
            }
            hashMap.put("image_count", Integer.valueOf(mo76512e().f106003a.size()));
            hashMap.put("is_success", Boolean.valueOf(z));
            List<Image> list = mo76512e().f106003a;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<String> thumbUrls = it.next().getThumbUrls();
                if (thumbUrls != null) {
                    obj = C89070n.m154583g((List) thumbUrls);
                } else {
                    obj = null;
                }
                arrayList.add(obj);
            }
            hashMap.put("image_urls", arrayList);
            Boolean pdpFullScreen = skuEnterParams.getPdpFullScreen();
            int i = 0;
            if (pdpFullScreen != null) {
                z2 = pdpFullScreen.booleanValue();
            } else {
                z2 = false;
            }
            long j = elapsedRealtime - longValue;
            Integer productQuantity = skuEnterParams.getProductQuantity();
            if (productQuantity != null) {
                i = productQuantity.intValue();
            }
            new C44761w(z2, j, i).mo76746c(hashMap);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: a */
    public final View mo76504a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.qx, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$i */
    static final class View$OnTouchListenerC45405i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C45393c f105810a;

        static {
            Covode.recordClassIndex(53879);
        }

        View$OnTouchListenerC45405i(C45393c cVar) {
            this.f105810a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() == 0) {
                this.f105810a.mo76512e().mo76704a(false);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$g */
    static final class C45403g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45393c f105808a;

        static {
            Covode.recordClassIndex(53877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45403g(C45393c cVar) {
            super(2);
            this.f105808a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            DmtLoadingLayout dmtLoadingLayout;
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            View view = this.f105808a.f105794f.getView();
            if (!(view == null || (dmtLoadingLayout = (DmtLoadingLayout) view.findViewById(R.id.e2k)) == null)) {
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                dmtLoadingLayout.setVisibility(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$e */
    static final class C45400e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45393c f105804a;

        static {
            Covode.recordClassIndex(53874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45400e(C45393c cVar) {
            super(2);
            this.f105804a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            final Integer num;
            View childAt;
            Boolean bool2 = bool;
            C89219l.m154721d(iVar, "");
            if (bool2 != null && !bool2.booleanValue()) {
                NestedScrollView nestedScrollView = (NestedScrollView) this.f105804a.f105794f.mo74087a(R.id.e2l);
                if (nestedScrollView == null || (childAt = nestedScrollView.getChildAt(0)) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(childAt.getHeight());
                }
                NestedScrollView nestedScrollView2 = (NestedScrollView) this.f105804a.f105794f.mo74087a(R.id.e2l);
                if (nestedScrollView2 != null) {
                    nestedScrollView2.postDelayed(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.C45393c.C45400e.RunnableC454011 */

                        /* renamed from: a */
                        final /* synthetic */ C45400e f105805a;

                        static {
                            Covode.recordClassIndex(53875);
                        }

                        {
                            this.f105805a = r1;
                        }

                        public final void run() {
                            int i;
                            NestedScrollView nestedScrollView = (NestedScrollView) this.f105805a.f105804a.f105794f.mo74087a(R.id.e2l);
                            if (nestedScrollView != null) {
                                Integer num = num;
                                if (num != null) {
                                    i = num.intValue();
                                } else {
                                    i = 0;
                                }
                                nestedScrollView.mo2945a(0, i, false);
                            }
                        }
                    }, 100);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.c$f */
    static final class C45402f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, EnumC45533a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45393c f105807a;

        static {
            Covode.recordClassIndex(53876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45402f(C45393c cVar) {
            super(2);
            this.f105807a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, EnumC45533a aVar) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(aVar, "");
            if (aVar == EnumC45533a.SUCCESS) {
                C45393c cVar = this.f105807a;
                C23669c a = C23669c.C23671a.m44763a(cVar.f105794f, cVar.f105794f.getView());
                a.mo39101a(R.id.be4, (Widget) ((SkuPanelHeaderWidget) cVar.f105789a.getValue()), false);
                a.mo39101a(R.id.af9, (Widget) ((SkuPanelCounterWidget) cVar.f105790b.getValue()), false);
                a.mo39101a(R.id.e1y, (Widget) ((SkuWidget) cVar.f105792d.getValue()), false);
                a.mo39101a(R.id.uk, (Widget) ((SkuPanelBottomWidget) cVar.f105791c.getValue()), false);
                ImageView imageView = (ImageView) cVar.f105794f.mo74087a(R.id.e26);
                if (imageView != null) {
                    imageView.setOnClickListener(new View$OnClickListenerC45404h(cVar));
                }
                NestedScrollView nestedScrollView = (NestedScrollView) cVar.f105794f.mo74087a(R.id.e2l);
                if (nestedScrollView != null) {
                    nestedScrollView.setOnTouchListener(new View$OnTouchListenerC45405i(cVar));
                }
                FrameLayout frameLayout = (FrameLayout) cVar.f105794f.mo74087a(R.id.be4);
                if (frameLayout != null) {
                    frameLayout.setOnClickListener(new View$OnClickListenerC45406j(cVar));
                }
                int i = Build.VERSION.SDK_INT;
                FrameLayout frameLayout2 = (FrameLayout) cVar.f105794f.mo74087a(R.id.e1y);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC45408k(cVar));
            } else if (aVar == EnumC45533a.FAIL) {
                this.f105807a.mo76511a(false);
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
