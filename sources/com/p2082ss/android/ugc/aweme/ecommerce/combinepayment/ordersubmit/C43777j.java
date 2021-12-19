package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.widget.C23669c;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43749j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43860n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43864r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.p2831a.C43888b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44207c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.view.PageStepper;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2837vm.CouponViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44760v;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
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
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j */
public final class C43777j extends AbstractC34488b implements AbstractC43718a {

    /* renamed from: c */
    public static final C43786b f102059c = new C43786b((byte) 0);

    /* renamed from: b */
    public long f102060b;

    /* renamed from: d */
    private final AbstractC89244h f102061d;

    /* renamed from: e */
    private final AbstractC89244h f102062e = C89250i.m154773a((AbstractC89171a) new C43787c(this));

    /* renamed from: j */
    private final AbstractC89244h f102063j = C89250i.m154773a((AbstractC89171a) new C43779aa(this));

    /* renamed from: k */
    private final AbstractC89244h f102064k = C89250i.m154773a((AbstractC89171a) new C43789e(this));

    /* renamed from: l */
    private SparseArray f102065l;

    static {
        Covode.recordClassIndex(52042);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f102065l == null) {
            this.f102065l = new SparseArray();
        }
        View view = (View) this.f102065l.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102065l.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f102065l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final OrderSubmitViewModel mo74458b() {
        return (OrderSubmitViewModel) this.f102061d.getValue();
    }

    /* renamed from: c */
    public final C43759h mo74459c() {
        return (C43759h) this.f102062e.getValue();
    }

    /* renamed from: e */
    public final DialogC81438i mo74460e() {
        return (DialogC81438i) this.f102063j.getValue();
    }

    /* renamed from: g */
    public final CouponViewModel mo74461g() {
        return (CouponViewModel) this.f102064k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$b */
    public static final class C43786b {
        static {
            Covode.recordClassIndex(52051);
        }

        private C43786b() {
        }

        public /* synthetic */ C43786b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$c */
    static final class C43787c extends AbstractC89220m implements AbstractC89171a<C43759h> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102077a;

        static {
            Covode.recordClassIndex(52052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43787c(C43777j jVar) {
            super(0);
            this.f102077a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43759h invoke() {
            return new C43759h(this.f102077a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$aa */
    static final class C43779aa extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102069a;

        static {
            Covode.recordClassIndex(52044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43779aa(C43777j jVar) {
            super(0);
            this.f102069a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f102069a.requireContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$v */
    static final class C43818v extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102114a;

        static {
            Covode.recordClassIndex(52083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43818v(C43777j jVar) {
            super(0);
            this.f102114a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f102114a.mo74458b().mo74413a(false);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C43732h.f101922b = SystemClock.elapsedRealtime();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$e */
    static final class C43789e extends AbstractC89220m implements AbstractC89171a<CouponViewModel> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102084a;

        static {
            Covode.recordClassIndex(52054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43789e(C43777j jVar) {
            super(0);
            this.f102084a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CouponViewModel invoke() {
            return new C1175ad(this.f102084a.requireActivity()).mo3983a(CouponViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$u */
    static final class C43816u extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102112a;

        static {
            Covode.recordClassIndex(52081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43816u(C43777j jVar) {
            super(0);
            this.f102112a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C43777j jVar = this.f102112a;
            jVar.withState(jVar.mo74458b(), C438171.f102113a);
            ActivityC0945e activity = this.f102112a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$y */
    static final class C43821y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102117a;

        static {
            Covode.recordClassIndex(52086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43821y(C43777j jVar) {
            super(0);
            this.f102117a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C43732h.m86712a();
            OrderSubmitViewModel.m86667a(this.f102117a.mo74458b(), true, false, false, false, null, 62);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$z */
    static final class C43822z extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102118a;

        static {
            Covode.recordClassIndex(52087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43822z(C43777j jVar) {
            super(0);
            this.f102118a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C43732h.m86712a();
            OrderSubmitViewModel.m86667a(this.f102118a.mo74458b(), true, false, false, false, null, 62);
            return C89391z.f203057a;
        }
    }

    public C43777j() {
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102061d = C89250i.m154773a((AbstractC89171a) new C43778a(this, a, a));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C43732h.f101921a.clear();
        C43732h.f101922b = -1;
        C43732h.f101926f = -1;
        C43732h.f101927g = -1;
        C43732h.f101928h = -1;
        C43732h.f101929i = 0;
        C43732h.f101923c = -1;
        C43732h.f101924d = -1;
        C43732h.f101925e = -1;
        C43732h.f101930j = -1;
        OrderSubmitViewModel b = mo74458b();
        EventCenter.m87158a().mo75481b("ec_payment_method_activate_clicked", b);
        EventCenter.m87158a().mo75481b("ec_osp_resend_order_create", b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$a */
    public static final class C43778a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f102066a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102067b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102068c;

        static {
            Covode.recordClassIndex(52043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43778a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102066a = fragment;
            this.f102067b = cVar;
            this.f102068c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.f102066a
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.f102068c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.f102067b     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = m86760xb874a96c(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.f102066a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f102067b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m86760xb874a96c(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43778a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86760xb874a96c(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43718a
    /* renamed from: f */
    public final boolean mo73975f() {
        if (mo74458b().f101795q) {
            mo74458b().mo74413a(false);
            return true;
        }
        mo74458b().mo74412a("return");
        if (mo74458b().f101774K.size() != 3) {
            if (mo74458b().f101799u) {
                C43732h.m86720a("quit_checkout", (String) null, 6);
                m86752a(getActivity(), false);
            } else if (mo74458b().f101767D) {
                C43732h.m86720a("quit_checkout", (String) null, 6);
                m86752a(getActivity(), true);
            }
            return true;
        }
        if (mo74458b().f101774K.size() != 2) {
            return false;
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (ActivityStack.isAppBackGround()) {
            C43732h.f101925e += SystemClock.elapsedRealtime() - C43732h.f101924d;
            OrderSubmitViewModel b = mo74458b();
            b.mo33687b_(new OrderSubmitViewModel.C43682c(b));
        }
        OrderSubmitViewModel b2 = mo74458b();
        if (b2.f101771H) {
            OrderSubmitViewModel.m86667a(b2, false, false, false, false, null, 63);
            b2.f101771H = false;
        }
        if (mo74458b().f101803y) {
            mo74458b().f101803y = false;
            mo74458b().mo74426l();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            C43732h.f101924d = SystemClock.elapsedRealtime();
            mo74458b().mo74412a("close");
        }
        if (!C44207c.f103100d) {
            C43732h.m86732a(mo74458b().f101794p, mo74458b().f101796r, Boolean.valueOf(mo74458b().f101765B), Boolean.valueOf(mo74458b().f101766C), mo74458b().mo74424j(), (Long) null, (String) null, (String) null, 480);
        }
        if (mo74458b().f101803y) {
            OrderSubmitViewModel b = mo74458b();
            EventCenter.m87158a().mo75480a("ec_address_select", b);
            EventCenter.m87158a().mo75480a("ec_address_change", b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$d */
    public static final class C43788d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102078a = 700;

        /* renamed from: b */
        final /* synthetic */ int f102079b;

        /* renamed from: c */
        final /* synthetic */ Context f102080c;

        /* renamed from: d */
        final /* synthetic */ int f102081d;

        /* renamed from: e */
        final /* synthetic */ int f102082e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89171a f102083f;

        static {
            Covode.recordClassIndex(52053);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f102083f.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43788d(int i, Context context, int i2, int i3, AbstractC89171a aVar) {
            super(700);
            this.f102079b = i;
            this.f102080c = context;
            this.f102081d = i2;
            this.f102082e = i3;
            this.f102083f = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$s */
    static final class C43813s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C43777j f102108a;

        static {
            Covode.recordClassIndex(52078);
        }

        C43813s(C43777j jVar) {
            this.f102108a = jVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f102108a.mo74458b().mo74411a((Voucher) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$w */
    static final class View$OnClickListenerC43819w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43777j f102115a;

        static {
            Covode.recordClassIndex(52084);
        }

        View$OnClickListenerC43819w(C43777j jVar) {
            this.f102115a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f102115a.mo74458b().mo74413a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$x */
    static final class View$OnClickListenerC43820x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43777j f102116a;

        static {
            Covode.recordClassIndex(52085);
        }

        View$OnClickListenerC43820x(C43777j jVar) {
            this.f102116a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f102116a.mo74458b().mo74413a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$ab */
    public static final class C43780ab extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102070a;

        /* renamed from: b */
        final /* synthetic */ Context f102071b;

        static {
            Covode.recordClassIndex(52045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43780ab(C43777j jVar, Context context) {
            super(1);
            this.f102070a = jVar;
            this.f102071b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f102070a.getString(R.string.fuq);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43780ab.C437811 */

                /* renamed from: a */
                final /* synthetic */ C43780ab f102072a;

                static {
                    Covode.recordClassIndex(52046);
                }

                {
                    this.f102072a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    if (this.f102072a.f102070a.mo74458b().f101793o != null) {
                        this.f102072a.f102070a.mo74458b().mo74414b();
                        Context context = this.f102072a.f102071b;
                        C43860n nVar = this.f102072a.f102070a.mo74458b().f101793o;
                        C437821 r4 = new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43780ab.C437811.C437821 */

                            /* renamed from: a */
                            final /* synthetic */ C437811 f102073a;

                            static {
                                Covode.recordClassIndex(52047);
                            }

                            {
                                this.f102073a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43780ab.C437811.C437821.RunnableC437831 */

                                    /* renamed from: a */
                                    final /* synthetic */ C437821 f102074a;

                                    static {
                                        Covode.recordClassIndex(52048);
                                    }

                                    {
                                        this.f102074a = r1;
                                    }

                                    public final void run() {
                                        ActivityC0945e activity = this.f102074a.f102073a.f102072a.f102070a.getActivity();
                                        if (activity != null) {
                                            activity.finish();
                                        }
                                    }
                                }, 450);
                                return C89391z.f203057a;
                            }
                        };
                        C437842 r5 = new AbstractC89172b<C43864r, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43780ab.C437811.C437842 */

                            /* renamed from: a */
                            final /* synthetic */ C437811 f102075a;

                            static {
                                Covode.recordClassIndex(52049);
                            }

                            {
                                this.f102075a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C43864r rVar) {
                                C43864r rVar2 = rVar;
                                C89219l.m154721d(rVar2, "");
                                this.f102075a.f102072a.f102070a.mo74458b().mo74409a(rVar2);
                                return C89391z.f203057a;
                            }
                        };
                        HashMap<String, Object> j = this.f102072a.f102070a.mo74458b().mo74424j();
                        j.put("previous_page", "order_submit");
                        new C43888b(context, nVar, r4, r5, j).mo74812a();
                    } else {
                        ActivityC0945e activity = this.f102072a.f102070a.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                    C43732h.m86722a("quit_checkout", "quit", (String) null, 12);
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f102070a.getString(R.string.fup);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, C437852.f102076a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C43732h.m86728a(mo74458b().f101769F);
        LinkedHashMap<String, Object> linkedHashMap = C43732h.f101921a;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        C43732h.f101923c = SystemClock.elapsedRealtime();
        OrderSubmitViewModel b = mo74458b();
        if (b.f101774K.size() != 1 || b.f101789k == null) {
            b.mo33689c(OrderSubmitViewModel.C43683d.f101830a);
            OrderSubmitViewModel.m86667a(b, false, false, false, false, null, 63);
            return;
        }
        BillInfoData billInfoData = b.f101789k;
        if (billInfoData == null) {
            C89219l.m154715b();
        }
        b.mo74408a(billInfoData, new BillInfoRequest(null, 0, null, false, false, false, false, null, null, null, false, null, null, null, null, 32767, null));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$f */
    static final class C43790f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102085a;

        static {
            Covode.recordClassIndex(52055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43790f(C43777j jVar) {
            super(2);
            this.f102085a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            List<? extends Object> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            this.f102085a.mo74459c().mo60931a(list2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$g */
    static final class C43791g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C43749j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102086a;

        static {
            Covode.recordClassIndex(52056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43791g(C43777j jVar) {
            super(2);
            this.f102086a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C43749j jVar) {
            C43749j jVar2 = jVar;
            C89219l.m154721d(iVar, "");
            if (jVar2 != null) {
                ((OrderSummaryPanel) this.f102086a.mo60929a(R.id.ebn)).setBillSummaryData(jVar2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$h */
    static final class C43792h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102087a;

        static {
            Covode.recordClassIndex(52057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43792h(C43777j jVar) {
            super(2);
            this.f102087a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            ((RecyclerView) this.f102087a.mo60929a(R.id.dgw)).mo4395a(0, intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$i */
    static final class C43793i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102088a;

        static {
            Covode.recordClassIndex(52058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43793i(C43777j jVar) {
            super(2);
            this.f102088a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Object obj) {
            C89219l.m154721d(iVar, "");
            if (obj != null) {
                new C79459a(this.f102088a.getContext()).mo123050a(R.string.dcq).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$j */
    static final class C43794j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102089a;

        static {
            Covode.recordClassIndex(52059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43794j(C43777j jVar) {
            super(2);
            this.f102089a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Object obj) {
            C89219l.m154721d(iVar, "");
            if (obj != null) {
                new C79459a(this.f102089a.getContext()).mo123050a(R.string.ftv).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$o */
    static final class C43809o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102104a;

        static {
            Covode.recordClassIndex(52074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43809o(C43777j jVar) {
            super(2);
            this.f102104a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Object obj) {
            C89219l.m154721d(iVar, "");
            if (obj != null) {
                this.f102104a.mo74458b().mo74416b(this.f102104a.getContext());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$q */
    static final class C43811q extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, VoucherInfo, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102106a;

        static {
            Covode.recordClassIndex(52076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43811q(C43777j jVar) {
            super(2);
            this.f102106a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, VoucherInfo voucherInfo) {
            C89219l.m154721d(iVar, "");
            this.f102106a.mo74461g().mo75366a(voucherInfo);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$r */
    static final class C43812r extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102107a;

        static {
            Covode.recordClassIndex(52077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43812r(C43777j jVar) {
            super(2);
            this.f102107a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            num.intValue();
            C89219l.m154721d(iVar, "");
            CouponViewModel g = this.f102107a.mo74461g();
            g.mo75366a(g.f103390a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$p */
    static final class C43810p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102105a;

        static {
            Covode.recordClassIndex(52075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43810p(C43777j jVar) {
            super(2);
            this.f102105a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                C43777j jVar = this.f102105a;
                C23669c.C23671a.m44763a(jVar, jVar.getView()).mo39101a(R.id.uk, (Widget) new OrderSubmitBottomWidget(), true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$t */
    static final class C43814t extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102109a;

        /* renamed from: b */
        final /* synthetic */ C43777j f102110b;

        static {
            Covode.recordClassIndex(52079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43814t(View view, C43777j jVar) {
            super(2);
            this.f102109a = view;
            this.f102110b = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            this.f102110b.mo74458b().f101767D = true;
            if (booleanValue) {
                FrameLayout frameLayout = (FrameLayout) this.f102110b.mo60929a(R.id.uk);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(8);
            } else {
                this.f102109a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43814t.RunnableC438151 */

                    /* renamed from: a */
                    final /* synthetic */ C43814t f102111a;

                    static {
                        Covode.recordClassIndex(52080);
                    }

                    {
                        this.f102111a = r1;
                    }

                    public final void run() {
                        FrameLayout frameLayout = (FrameLayout) this.f102111a.f102110b.mo60929a(R.id.uk);
                        C89219l.m154716b(frameLayout, "");
                        frameLayout.setVisibility(0);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m86752a(Context context, boolean z) {
        if (context != null) {
            C23023b a = C23013a.C23015a.m43405a(context);
            if (z) {
                a.mo37483b(R.string.bgq);
            } else {
                a.mo37483b(R.string.bgr);
            }
            ((C23023b) C23028c.m43435a((C23023b) a.mo37479a(R.string.fut), new C43780ab(this, context)).mo37482a(false)).mo37405a().mo37396b().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$l */
    static final class C43796l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102091a;

        static {
            Covode.recordClassIndex(52061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43796l(C43777j jVar) {
            super(2);
            this.f102091a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (!booleanValue) {
                try {
                    this.f102091a.mo74460e().dismiss();
                } catch (Exception e) {
                    C22708a.m42802a((Throwable) e);
                }
            } else if (this.f102091a.mo74458b().f101797s) {
                DialogC81438i e2 = this.f102091a.mo74460e();
                e2.setCanceledOnTouchOutside(true);
                Window window = e2.getWindow();
                if (window != null) {
                    window.setFlags(8, 8);
                }
                e2.show();
            } else {
                DialogC81438i e3 = this.f102091a.mo74460e();
                e3.setCanceledOnTouchOutside(false);
                Window window2 = e3.getWindow();
                if (window2 != null) {
                    window2.clearFlags(8);
                }
                e3.show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$m */
    static final class C43797m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102092a;

        static {
            Covode.recordClassIndex(52062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43797m(C43777j jVar) {
            super(2);
            this.f102092a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            AbstractC20477i iVar2 = iVar;
            int intValue = num.intValue();
            C89219l.m154721d(iVar2, "");
            if (intValue == 1) {
                iVar2.withState(this.f102092a.mo74458b(), new AbstractC89172b<OrderSubmitState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C438012 */

                    /* renamed from: a */
                    final /* synthetic */ C43797m f102096a;

                    static {
                        Covode.recordClassIndex(52066);
                    }

                    {
                        this.f102096a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        C89219l.m154721d(orderSubmitState2, "");
                        Context requireContext = this.f102096a.f102092a.requireContext();
                        C89219l.m154716b(requireContext, "");
                        C43751d.m86742a(requireContext, this.f102096a.f102092a.mo74458b().f101791m, this.f102096a.f102092a.mo74458b().f101790l, orderSubmitState2.getLoadSuccess(), new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C438012.C438021 */

                            /* renamed from: a */
                            final /* synthetic */ C438012 f102097a;

                            static {
                                Covode.recordClassIndex(52067);
                            }

                            {
                                this.f102097a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                this.f102097a.f102096a.f102092a.mo74458b().mo74403a(3);
                                return C89391z.f203057a;
                            }
                        }, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C438012.C438032 */

                            /* renamed from: a */
                            final /* synthetic */ C438012 f102098a;

                            static {
                                Covode.recordClassIndex(52068);
                            }

                            {
                                this.f102098a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                this.f102098a.f102096a.f102092a.requireActivity().finish();
                                return C89391z.f203057a;
                            }
                        }, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C438012.C438043 */

                            /* renamed from: a */
                            final /* synthetic */ C438012 f102099a;

                            static {
                                Covode.recordClassIndex(52069);
                            }

                            {
                                this.f102099a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                String str = this.f102099a.f102096a.f102092a.mo74458b().f101800v;
                                int hashCode = str.hashCode();
                                if (hashCode != -557572305) {
                                    if (hashCode == 1874714187 && str.equals("create_order")) {
                                        this.f102099a.f102096a.f102092a.mo74458b().mo74416b(this.f102099a.f102096a.f102092a.getContext());
                                    }
                                } else if (str.equals("query_bill_info")) {
                                    OrderSubmitViewModel.m86667a(this.f102099a.f102096a.f102092a.mo74458b(), false, false, false, false, null, 63);
                                }
                                return C89391z.f203057a;
                            }
                        }, new AbstractC89172b<FetchInfo, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C438012.C438054 */

                            /* renamed from: a */
                            final /* synthetic */ C438012 f102100a;

                            static {
                                Covode.recordClassIndex(52070);
                            }

                            {
                                this.f102100a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(FetchInfo fetchInfo) {
                                Integer fetchAPI;
                                OrderShopDigest orderShopDigest;
                                List<OrderSKUDTO> orderSKUs;
                                OrderSKUDTO orderSKUDTO;
                                String str;
                                FetchInfo fetchInfo2 = fetchInfo;
                                OrderSubmitViewModel b = this.f102100a.f102096a.f102092a.mo74458b();
                                String str2 = null;
                                if (fetchInfo2 != null) {
                                    str2 = fetchInfo2.getServerIssuedParams();
                                }
                                b.f101777N = str2;
                                if (!(fetchInfo2 == null || (fetchAPI = fetchInfo2.getFetchAPI()) == null)) {
                                    if (fetchAPI.intValue() == 1) {
                                        this.f102100a.f102096a.f102092a.mo74458b().mo74416b(this.f102100a.f102096a.f102092a.getContext());
                                    } else if (fetchAPI.intValue() == 2) {
                                        OrderSubmitViewModel.m86667a(this.f102100a.f102096a.f102092a.mo74458b(), false, false, false, false, null, 63);
                                        List<OrderShopDigest> list = this.f102100a.f102096a.f102092a.mo74458b().f101784c;
                                        if (!(list == null || (orderShopDigest = (OrderShopDigest) C89070n.m154583g((List) list)) == null || (orderSKUs = orderShopDigest.getOrderSKUs()) == null || (orderSKUDTO = (OrderSKUDTO) C89070n.m154583g((List) orderSKUs)) == null || (str = orderSKUDTO.f103631a) == null)) {
                                            AbstractC81915c.m141874a(new C44760v(str));
                                        }
                                    }
                                    return C89391z.f203057a;
                                }
                                OrderSubmitViewModel.m86667a(this.f102100a.f102096a.f102092a.mo74458b(), false, false, false, false, null, 63);
                                return C89391z.f203057a;
                            }
                        }, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C438012.C438065 */

                            /* renamed from: a */
                            final /* synthetic */ C438012 f102101a;

                            static {
                                Covode.recordClassIndex(52071);
                            }

                            {
                                this.f102101a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                Context context = this.f102101a.f102096a.f102092a.getContext();
                                if (context != null) {
                                    OrderSubmitViewModel b = this.f102101a.f102096a.f102092a.mo74458b();
                                    C89219l.m154716b(context, "");
                                    b.mo74406a(context, true);
                                }
                                return C89391z.f203057a;
                            }
                        }, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C438012.C438076 */

                            /* renamed from: a */
                            final /* synthetic */ C438012 f102102a;

                            static {
                                Covode.recordClassIndex(52072);
                            }

                            {
                                this.f102102a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                RedirectContent redirectContent;
                                ExceptionUX exceptionUX = this.f102102a.f102096a.f102092a.mo74458b().f101790l;
                                if (!(exceptionUX == null || (redirectContent = exceptionUX.getRedirectContent()) == null)) {
                                    String jumpSchema = redirectContent.getJumpSchema();
                                    if (jumpSchema != null) {
                                        Uri.Builder buildUpon = Uri.parse(jumpSchema).buildUpon();
                                        buildUpon.appendQueryParameter("source", "ordersubmit");
                                        HashMap hashMap = new HashMap();
                                        HashMap<String, Object> hashMap2 = this.f102102a.f102096a.f102092a.mo74458b().f101769F;
                                        if (hashMap2 != null) {
                                            hashMap.putAll(hashMap2);
                                        }
                                        hashMap.put("previous_page", "order_submit");
                                        hashMap.putAll(this.f102102a.f102096a.f102092a.mo74458b().mo74424j());
                                        buildUpon.appendQueryParameter("trackParams", C80342dg.m139300a().mo46674b(hashMap));
                                        SmartRouter.buildRoute(C17867d.m33078a(), buildUpon.toString()).open();
                                    }
                                    if (C89219l.m154714a((Object) redirectContent.getClosePage(), (Object) true)) {
                                        this.f102102a.f102096a.f102092a.requireActivity().finish();
                                    }
                                }
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
            } else if (intValue == 3) {
                C43732h.m86720a("add_address_for_location", (String) null, 6);
                Context requireContext = this.f102092a.requireContext();
                C89219l.m154716b(requireContext, "");
                ((C23023b) C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(requireContext).mo37483b(R.string.fu4), new AbstractC89172b<C23025b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C437981 */

                    /* renamed from: a */
                    final /* synthetic */ C43797m f102093a;

                    static {
                        Covode.recordClassIndex(52063);
                    }

                    {
                        this.f102093a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        String string = this.f102093a.f102092a.requireContext().getString(R.string.fu2);
                        C89219l.m154716b(string, "");
                        bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43777j.C43797m.C437981.C437991 */

                            /* renamed from: a */
                            final /* synthetic */ C437981 f102094a;

                            static {
                                Covode.recordClassIndex(52064);
                            }

                            {
                                this.f102094a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                C43732h.m86722a("add_address_for_location", "enter", (String) null, 12);
                                this.f102094a.f102093a.f102092a.mo74458b().mo74404a(this.f102094a.f102093a.f102092a.requireContext());
                                return C89391z.f203057a;
                            }
                        });
                        String string2 = this.f102093a.f102092a.requireContext().getString(R.string.fu3);
                        C89219l.m154716b(string2, "");
                        bVar2.mo37419b(string2, C438002.f102095a);
                        return C89391z.f203057a;
                    }
                }).mo37482a(false)).mo37405a().mo37396b().show();
            } else if (intValue == 4) {
                this.f102092a.requireActivity().finish();
            }
            this.f102092a.mo74458b().mo74415b(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$k */
    static final class C43795k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102090a;

        static {
            Covode.recordClassIndex(52060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43795k(C43777j jVar) {
            super(2);
            this.f102090a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (intValue == -1 || intValue == 0) {
                TuxNavBar tuxNavBar = (TuxNavBar) this.f102090a.mo60929a(R.id.eiz);
                C89219l.m154716b(tuxNavBar, "");
                tuxNavBar.setVisibility(0);
                C23194g gVar = new C23194g();
                String string = this.f102090a.getResources().getString(R.string.fua);
                C89219l.m154716b(string, "");
                ((TuxNavBar) this.f102090a.mo60929a(R.id.eiz)).mo37725a(gVar.mo37753a(string));
            } else if (intValue == 2) {
                TuxNavBar tuxNavBar2 = (TuxNavBar) this.f102090a.mo60929a(R.id.eiz);
                C89219l.m154716b(tuxNavBar2, "");
                tuxNavBar2.setVisibility(8);
            } else if (intValue == 3) {
                TuxNavBar tuxNavBar3 = (TuxNavBar) this.f102090a.mo60929a(R.id.eiz);
                C89219l.m154716b(tuxNavBar3, "");
                tuxNavBar3.setVisibility(0);
                C23194g gVar2 = new C23194g();
                String string2 = this.f102090a.getResources().getString(R.string.bfr);
                C89219l.m154716b(string2, "");
                ((TuxNavBar) this.f102090a.mo60929a(R.id.eiz)).mo37725a(gVar2.mo37753a(string2));
            }
            ((DmtStatusView) this.f102090a.mo60929a(R.id.e7i)).setStatus(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$n */
    static final class C43808n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43777j f102103a;

        static {
            Covode.recordClassIndex(52073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43808n(C43777j jVar) {
            super(2);
            this.f102103a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f102103a.f102060b = SystemClock.elapsedRealtime();
                HashMap<String, Object> j = this.f102103a.mo74458b().mo74424j();
                C89219l.m154721d("order_summary", "");
                C89219l.m154721d(j, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(C43732h.f101921a);
                linkedHashMap.put("actionsheet_name", "order_summary");
                linkedHashMap.putAll(j);
                C45544c.m88082a("tiktokec_enter_actionsheet", linkedHashMap);
                OrderSummaryPanel orderSummaryPanel = (OrderSummaryPanel) this.f102103a.mo60929a(R.id.ebn);
                orderSummaryPanel.startAnimation(orderSummaryPanel.f102259d);
            } else {
                if (this.f102103a.f102060b != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.f102103a.f102060b;
                    HashMap<String, Object> j2 = this.f102103a.mo74458b().mo74424j();
                    C89219l.m154721d("order_summary", "");
                    C89219l.m154721d(j2, "");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(C43732h.f101921a);
                    linkedHashMap2.put("stay_time", Long.valueOf(elapsedRealtime));
                    linkedHashMap2.put("actionsheet_name", "order_summary");
                    linkedHashMap2.putAll(j2);
                    C45544c.m88082a("tiktokec_stay_actionsheet", linkedHashMap2);
                }
                OrderSummaryPanel orderSummaryPanel2 = (OrderSummaryPanel) this.f102103a.mo60929a(R.id.ebn);
                if (orderSummaryPanel2.f102261f != null) {
                    orderSummaryPanel2.setClickable(false);
                    orderSummaryPanel2.startAnimation(orderSummaryPanel2.f102261f);
                    orderSummaryPanel2.f102261f = null;
                } else {
                    orderSummaryPanel2.startAnimation(orderSummaryPanel2.f102260e);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        OrderSubmitViewModel b = mo74458b();
        EventCenter.m87158a().mo75480a("ec_payment_method_activate_clicked", b);
        EventCenter.m87158a().mo75480a("ec_osp_resend_order_create", b);
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23187b a = new C23187b().mo37738a(R.raw.icon_arrow_left_ltr);
        a.f54930b = true;
        TuxNavBar.C23179a a2 = aVar.mo37732a(a.mo37741a((AbstractC89171a<C89391z>) new C43816u(this)));
        C23194g gVar = new C23194g();
        String string = getResources().getString(R.string.fua);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a3 = a2.mo37731a(gVar.mo37753a(string));
        a3.f54919d = true;
        ((TuxNavBar) mo60929a(R.id.eiz)).setNavActions(a3);
        DmtStatusView.C17269a a4 = DmtStatusView.C17269a.m31905a(requireContext()).mo27403a(C1764a.m5927a(LayoutInflater.from(requireContext()), R.layout.rk, (ViewGroup) mo60929a(R.id.acf), false));
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, "");
        DmtStatusView.C17269a c = a4.mo27408c(m86751a(requireContext, R.string.bfu, R.string.bft, R.drawable.ys, new C43821y(this)));
        Context requireContext2 = requireContext();
        C89219l.m154716b(requireContext2, "");
        ((DmtStatusView) mo60929a(R.id.e7i)).setBuilder(c.mo27409d(m86751a(requireContext2, R.string.bfr, R.string.bfq, R.drawable.zb, new C43822z(this))));
        ((RecyclerView) mo60929a(R.id.dgw)).mo4402a(new C44998a(C0643b.m2378c(requireContext(), R.color.az), C34728n.m70946a(8.0d), 0.0f));
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.dgw);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.dgw);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(mo74459c());
        ((OrderSummaryPanel) mo60929a(R.id.ebn)).setCloseAction(new C43818v(this));
        mo60929a(R.id.cxa).setOnClickListener(new View$OnClickListenerC43819w(this));
        mo60929a(R.id.cxb).setOnClickListener(new View$OnClickListenerC43820x(this));
        if ((!mo74458b().f101774K.isEmpty()) && mo74458b().f101774K.size() == 3) {
            ((PageStepper) mo60929a(R.id.cyq)).setLightStep(3);
        }
        C80330da.C80331a.m139266a("tiktokec_anchor_order_submit").mo123698a((RecyclerView) mo60929a(R.id.dgw));
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        View view2 = getView();
        if (!(window == null || view2 == null)) {
            AbstractC1196i lifecycle = getLifecycle();
            C89219l.m154716b(lifecycle, "");
            new KeyBoardVisibilityUtil(lifecycle, window, view2, null, new C43814t(view2, this));
        }
        AbstractC88412b unused = selectSubscribe(mo74458b(), C43823k.f102119a, new C20370ah(), new C43795k(this));
        AbstractC88412b unused2 = selectSubscribe(mo74458b(), C43869u.f102249a, new C20370ah(), new C43810p(this));
        AbstractC88412b unused3 = selectSubscribe(mo74458b(), C43870v.f102250a, new C20370ah(), new C43811q(this));
        AbstractC88412b unused4 = selectSubscribe(mo74458b(), C43943w.f102455a, new C20370ah(), new C43812r(this));
        mo74461g().f103391b.observe(this, new C43813s(this));
        AbstractC88412b unused5 = selectSubscribe(mo74458b(), C43824l.f102120a, new C20370ah(), new C43790f(this));
        AbstractC88412b unused6 = selectSubscribe(mo74458b(), C43825m.f102121a, new C20370ah(), new C43791g(this));
        AbstractC88412b unused7 = selectSubscribe(mo74458b(), C43826n.f102122a, new C20370ah(), new C43792h(this));
        AbstractC88412b unused8 = selectSubscribe(mo74458b(), C43827o.f102123a, new C20370ah(), new C43793i(this));
        AbstractC88412b unused9 = selectSubscribe(mo74458b(), C43828p.f102124a, new C20370ah(), new C43794j(this));
        AbstractC88412b unused10 = selectSubscribe(mo74458b(), C43829q.f102125a, new C20370ah(), new C43796l(this));
        AbstractC88412b unused11 = selectSubscribe(mo74458b(), C43830r.f102126a, new C20370ah(), new C43797m(this));
        AbstractC88412b unused12 = selectSubscribe(mo74458b(), C43867s.f102247a, new C20370ah(), new C43808n(this));
        AbstractC88412b unused13 = selectSubscribe(mo74458b(), C43868t.f102248a, new C20370ah(), new C43809o(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.re, viewGroup, false);
    }

    /* renamed from: a */
    private final View m86751a(Context context, int i, int i2, int i3, AbstractC89171a<C89391z> aVar) {
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.pj, (ViewGroup) mo60929a(R.id.acf), false);
        ((AppCompatImageView) a.findViewById(R.id.bky)).setImageResource(i3);
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.text);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(context.getText(i));
        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.efr);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(context.getText(i2));
        TuxButton tuxButton = (TuxButton) a.findViewById(R.id.djd);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setOnClickListener(new C43788d(i3, context, i, i2, aVar));
        C89219l.m154716b(a, "");
        return a;
    }
}
