package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a.C43452b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a.C43458c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43718a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43756e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44067c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44161t;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoReqInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44071a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44073c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44083l;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44088q;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44046a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44059c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44060d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44062f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44064h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44173b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44180d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44207c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.EnumC44227f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.EnumC44266l;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.view.PageStepper;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45572m;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g */
public final class C44108g extends AbstractC34488b implements AbstractC43718a, AbstractC43756e {

    /* renamed from: q */
    public static final C44114c f102866q = new C44114c((byte) 0);

    /* renamed from: b */
    public C44067c f102867b = new C44067c(null, null, null, null, null, false, null, null, null, null, 1023);

    /* renamed from: c */
    public AbstractC89172b<? super C44085n, C89391z> f102868c = C44140x.f102925a;

    /* renamed from: d */
    public AbstractC89172b<? super EnumC44266l, C89391z> f102869d = C44142z.f102927a;

    /* renamed from: e */
    public AbstractC89172b<? super C44085n, C89391z> f102870e = C44139w.f102924a;

    /* renamed from: j */
    public AbstractC89171a<C89391z> f102871j = C44141y.f102926a;

    /* renamed from: k */
    public AbstractC89171a<C89391z> f102872k = C44138v.f102923a;

    /* renamed from: l */
    public C44086o f102873l;

    /* renamed from: m */
    public String f102874m;

    /* renamed from: n */
    public boolean f102875n;

    /* renamed from: o */
    public String[] f102876o;

    /* renamed from: p */
    public String f102877p;

    /* renamed from: r */
    private final lifecycleAwareLazy f102878r;

    /* renamed from: s */
    private final AbstractC89244h f102879s;

    /* renamed from: t */
    private final AbstractC89244h f102880t;

    /* renamed from: u */
    private final AbstractC89244h f102881u;

    /* renamed from: v */
    private SparseArray f102882v;

    static {
        Covode.recordClassIndex(52419);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f102882v == null) {
            this.f102882v = new SparseArray();
        }
        View view = (View) this.f102882v.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102882v.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f102882v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final PaymentViewModel mo74990b() {
        return (PaymentViewModel) this.f102878r.getValue();
    }

    /* renamed from: c */
    public final PaymentAdapter mo74991c() {
        return (PaymentAdapter) this.f102879s.getValue();
    }

    /* renamed from: e */
    public final C44161t mo74992e() {
        return (C44161t) this.f102880t.getValue();
    }

    /* renamed from: i */
    public final DialogC81438i mo74993i() {
        return (DialogC81438i) this.f102881u.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$c */
    public static final class C44114c {
        static {
            Covode.recordClassIndex(52425);
        }

        private C44114c() {
        }

        public /* synthetic */ C44114c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$v */
    static final class C44138v extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C44138v f102923a = new C44138v();

        static {
            Covode.recordClassIndex(52449);
        }

        C44138v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$y */
    static final class C44141y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C44141y f102926a = new C44141y();

        static {
            Covode.recordClassIndex(52452);
        }

        C44141y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: k */
    private String m86924k() {
        String str = this.f102874m;
        this.f102874m = null;
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$a */
    public static final class C44109a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f102883a;

        static {
            Covode.recordClassIndex(52420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44109a(AbstractC89277c cVar) {
            super(0);
            this.f102883a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f102883a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$aa */
    static final class C44110aa extends AbstractC89220m implements AbstractC89171a<C44161t> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102884a;

        static {
            Covode.recordClassIndex(52421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44110aa(C44108g gVar) {
            super(0);
            this.f102884a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C44161t invoke() {
            return new C44161t(this.f102884a.f102867b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$d */
    static final class C44115d extends AbstractC89220m implements AbstractC89171a<PaymentAdapter> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102891a;

        static {
            Covode.recordClassIndex(52426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44115d(C44108g gVar) {
            super(0);
            this.f102891a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PaymentAdapter invoke() {
            PaymentAdapter paymentAdapter = new PaymentAdapter(this.f102891a);
            paymentAdapter.mo67829d(false);
            return paymentAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$t */
    static final class C44135t extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102919a;

        static {
            Covode.recordClassIndex(52446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44135t(C44108g gVar) {
            super(0);
            this.f102919a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f102919a.requireContext());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43718a
    /* renamed from: f */
    public final boolean mo73975f() {
        if (this.f102875n) {
            return false;
        }
        mo74990b().mo74863a(false);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43756e
    /* renamed from: g */
    public final void mo73976g() {
        mo74992e().f102958c = SystemClock.elapsedRealtime();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.f102867b.f102718f) {
            mo73977h();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PaymentViewModel b = mo74990b();
        EventCenter.m87158a().mo75481b("ec_payment_method_activate_clicked", b);
        EventCenter.m87158a().mo75481b("ec_resend_pay_request", b);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f102867b.f102718f) {
            mo74992e().f102958c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$b */
    public static final class C44112b extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f102886a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f102887b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102888c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f102889d;

        static {
            Covode.recordClassIndex(52423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44112b(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f102886a = fragment;
            this.f102887b = aVar;
            this.f102888c = cVar;
            this.f102889d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f102886a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f102887b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f102888c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m86937x8ff5bbd5(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$b$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44108g.C44112b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86937x8ff5bbd5(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43756e
    /* renamed from: h */
    public final void mo73977h() {
        if (ActivityStack.isAppBackGround()) {
            this.f102874m = "close";
        }
        if (!C44207c.f103100d) {
            C44161t e = mo74992e();
            String k = m86924k();
            if (k == null) {
                k = "return";
            }
            e.mo75007a(k, this.f102873l, mo74994j());
        }
    }

    /* renamed from: j */
    public final boolean mo74994j() {
        C44084m mVar;
        String paramValue;
        C44086o oVar = this.f102873l;
        if (oVar == null || (mVar = (C44084m) C89070n.m154561b((List) mo74990b().mo74864b(oVar, "save_element"), 0)) == null || (paramValue = mVar.getParamValue()) == null) {
            return false;
        }
        return Boolean.parseBoolean(paramValue);
    }

    public C44108g() {
        C44111ab abVar = new C44111ab(this);
        AbstractC89277c a = C89204ab.m154669a(PaymentViewModel.class);
        C44109a aVar = new C44109a(a);
        this.f102878r = new lifecycleAwareLazy(this, aVar, new C44112b(this, aVar, a, abVar));
        this.f102879s = C89250i.m154773a((AbstractC89171a) new C44115d(this));
        this.f102880t = C89250i.m154773a((AbstractC89171a) new C44110aa(this));
        String[] strArr = new String[4];
        int i = 0;
        do {
            strArr[i] = null;
            i++;
        } while (i < 4);
        this.f102876o = strArr;
        this.f102881u = C89250i.m154773a((AbstractC89171a) new C44135t(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$s */
    public static final class C44133s extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C44108g f102913a;

        static {
            Covode.recordClassIndex(52444);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44133s(C44108g gVar) {
            this.f102913a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$s$a */
        static final class C44134a extends AbstractC89220m implements AbstractC89172b<PaymentState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C44086o f102914a;

            /* renamed from: b */
            final /* synthetic */ C44133s f102915b;

            /* renamed from: c */
            final /* synthetic */ int[] f102916c;

            /* renamed from: d */
            final /* synthetic */ RecyclerView f102917d;

            /* renamed from: e */
            final /* synthetic */ int[] f102918e;

            static {
                Covode.recordClassIndex(52445);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44134a(C44086o oVar, C44133s sVar, int[] iArr, RecyclerView recyclerView, int[] iArr2) {
                super(1);
                this.f102914a = oVar;
                this.f102915b = sVar;
                this.f102916c = iArr;
                this.f102917d = recyclerView;
                this.f102918e = iArr2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(PaymentState paymentState) {
                String str;
                PaymentState paymentState2 = paymentState;
                C89219l.m154721d(paymentState2, "");
                C44161t e = this.f102915b.f102913a.mo74992e();
                C44086o oVar = this.f102914a;
                this.f102915b.f102913a.mo74990b();
                int a = PaymentViewModel.m86880a(this.f102914a, paymentState2.getPaymentList());
                boolean a2 = C80538hl.m139614a(this.f102914a.f102805l);
                this.f102915b.f102913a.mo74990b();
                boolean a3 = PaymentViewModel.m86882a(this.f102914a);
                boolean a4 = C80538hl.m139614a(this.f102914a.f102812s);
                C44071a aVar = this.f102914a.f102813t;
                if (aVar != null) {
                    str = aVar.f102726b;
                } else {
                    str = null;
                }
                C89219l.m154721d(oVar, "");
                C89219l.m154721d("payment_type", "");
                if (!e.f102957b.contains(C89219l.m154704a(oVar.f102794a, (Object) oVar.f102809p))) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(e.f102956a);
                    linkedHashMap.put("option_name", oVar.mo74952c());
                    linkedHashMap.put("is_option_discounted", Integer.valueOf(a2 ? 1 : 0));
                    linkedHashMap.put("rank", Integer.valueOf(a));
                    linkedHashMap.put("option_type", "payment_type");
                    linkedHashMap.put("is_pay_saved", Integer.valueOf(a3 ? 1 : 0));
                    linkedHashMap.put("is_balance_shown", Integer.valueOf(a4 ? 1 : 0));
                    if (!(str == null || str.length() == 0)) {
                        linkedHashMap.put("option_unavailable_code", str);
                    }
                    C45544c.m88082a("tiktokec_option_show", linkedHashMap);
                    e.f102957b.add(C89219l.m154704a(oVar.f102794a, (Object) oVar.f102809p));
                }
                return C89391z.f203057a;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C44086o paymentMethod;
            C89219l.m154721d(recyclerView, "");
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            recyclerView.getLocationOnScreen(iArr2);
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k = linearLayoutManager.mo4371k();
            int m = linearLayoutManager.mo4373m();
            if (k <= m) {
                while (true) {
                    View c = linearLayoutManager.mo4358c(k);
                    if (!(c instanceof C44180d)) {
                        c = null;
                    }
                    C44180d dVar = (C44180d) c;
                    if (!(dVar == null || (paymentMethod = dVar.getPaymentMethod()) == null)) {
                        dVar.getLocationOnScreen(iArr);
                        if ((recyclerView.getHeight() + iArr2[1]) - iArr[1] > 0) {
                            C44108g gVar = this.f102913a;
                            gVar.withState(gVar.mo74990b(), new C44134a(paymentMethod, this, iArr, recyclerView, iArr2));
                        }
                    }
                    if (k != m) {
                        k++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$w */
    static final class C44139w extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

        /* renamed from: a */
        public static final C44139w f102924a = new C44139w();

        static {
            Covode.recordClassIndex(52450);
        }

        C44139w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44085n nVar) {
            C89219l.m154721d(nVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$x */
    static final class C44140x extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

        /* renamed from: a */
        public static final C44140x f102925a = new C44140x();

        static {
            Covode.recordClassIndex(52451);
        }

        C44140x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44085n nVar) {
            C89219l.m154721d(nVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$z */
    static final class C44142z extends AbstractC89220m implements AbstractC89172b<EnumC44266l, C89391z> {

        /* renamed from: a */
        public static final C44142z f102927a = new C44142z();

        static {
            Covode.recordClassIndex(52453);
        }

        C44142z() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC44266l lVar) {
            C89219l.m154721d(lVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$o */
    static final class View$OnClickListenerC44128o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44108g f102906a;

        static {
            Covode.recordClassIndex(52439);
        }

        View$OnClickListenerC44128o(C44108g gVar) {
            this.f102906a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f102906a.f102871j.invoke();
        }
    }

    /* renamed from: a */
    public final void mo74988a(C44067c cVar) {
        C89219l.m154721d(cVar, "");
        this.f102867b = cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$n */
    static final class View$OnClickListenerC44127n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44108g f102905a;

        static {
            Covode.recordClassIndex(52438);
        }

        View$OnClickListenerC44127n(C44108g gVar) {
            this.f102905a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f102905a.mo74990b().mo74863a(false);
            ActivityC0945e activity = this.f102905a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    public final void mo74989a(AbstractC89172b<? super C44085n, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f102868c = bVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Object obj;
        if (!(bundle == null || (string = bundle.getString("enter_params")) == null)) {
            try {
                obj = C45264j.m87844a().mo46670a(string, C44067c.class);
            } catch (Exception unused) {
                obj = null;
            }
            C44067c cVar = (C44067c) obj;
            if (cVar != null) {
                this.f102867b = cVar;
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putString("enter_params", C80342dg.m139300a().mo46674b(this.f102867b));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$p */
    static final class C44129p extends AbstractC89220m implements AbstractC89172b<PaymentState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102907a;

        static {
            Covode.recordClassIndex(52440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44129p(C44108g gVar) {
            super(1);
            this.f102907a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            String str = "";
            C89219l.m154721d(paymentState2, str);
            TuxTextView tuxTextView = (TuxTextView) this.f102907a.mo60929a(R.id.emj);
            C89219l.m154716b(tuxTextView, str);
            PaymentViewModel b = this.f102907a.mo74990b();
            C44086o checkedPaymentMethod = paymentState2.getCheckedPaymentMethod();
            String str2 = this.f102907a.f102867b.f102717e;
            if (str2 != null) {
                str = str2;
            }
            tuxTextView.setText(b.mo74860a(checkedPaymentMethod, str));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$q */
    static final class C44130q extends AbstractC89220m implements AbstractC89172b<EnumC44266l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102908a;

        static {
            Covode.recordClassIndex(52441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44130q(C44108g gVar) {
            super(1);
            this.f102908a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC44266l lVar) {
            Long l;
            EnumC44266l lVar2 = lVar;
            String str = "";
            C89219l.m154721d(lVar2, str);
            int i = C44143h.f102928a[lVar2.ordinal()];
            if (i == 1) {
                this.f102908a.mo74992e().mo75007a("next", this.f102908a.f102873l, this.f102908a.mo74994j());
                C44161t e = this.f102908a.mo74992e();
                e.f102959d.put("select_region", Long.valueOf(SystemClock.elapsedRealtime()));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(e.f102956a);
                Object obj = linkedHashMap.get("page_name");
                if (obj != 0) {
                    str = obj;
                }
                linkedHashMap.put("previous_page", str);
                linkedHashMap.put("page_name", "select_region");
                C45544c.m88082a("tiktokec_enter_page", linkedHashMap);
            } else if (i == 2) {
                this.f102908a.mo74992e().f102958c = SystemClock.elapsedRealtime();
                C44161t e2 = this.f102908a.mo74992e();
                Long l2 = e2.f102959d.get("select_region");
                if (l2 != null) {
                    l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
                } else {
                    l = null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(e2.f102956a);
                Object obj2 = linkedHashMap2.get("page_name");
                if (obj2 != 0) {
                    str = obj2;
                }
                linkedHashMap2.put("previous_page", str);
                linkedHashMap2.put("page_name", "select_region");
                if (l != null) {
                    linkedHashMap2.put("stay_time", l);
                }
                C45544c.m88082a("tiktokec_stay_page", linkedHashMap2);
            }
            this.f102908a.f102869d.invoke(lVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$r */
    static final class View$OnClickListenerC44131r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44108g f102909a;

        /* renamed from: b */
        final /* synthetic */ Activity f102910b;

        /* renamed from: c */
        final /* synthetic */ String f102911c;

        static {
            Covode.recordClassIndex(52442);
        }

        View$OnClickListenerC44131r(C44108g gVar, Activity activity, String str) {
            this.f102909a = gVar;
            this.f102910b = activity;
            this.f102911c = str;
        }

        public final void onClick(View view) {
            List<? extends Object> list;
            ClickAgent.onClick(view);
            C45573n.m88122a(this.f102910b);
            this.f102909a.mo74990b().mo74863a(true);
            C44108g gVar = this.f102909a;
            String[] strArr = gVar.f102876o;
            if (!(gVar.mo74990b().f102653g == null || (list = gVar.mo74990b().f102653g) == null)) {
                for (T t : list) {
                    if (t instanceof C44059c) {
                        if (t.f102701a != null) {
                            strArr[0] = ",card_number";
                        } else {
                            strArr[0] = null;
                        }
                    } else if (t instanceof C44060d) {
                        if (t.f102702a != null) {
                            strArr[1] = ",date";
                        } else {
                            strArr[1] = null;
                        }
                    } else if (t instanceof C44062f) {
                        T t2 = t;
                        if (C89219l.m154714a((Object) t2.f102703b.f102747f, (Object) "cvv")) {
                            if (t2.f102705a != null) {
                                strArr[2] = ",code";
                            } else {
                                strArr[2] = null;
                            }
                        } else if (C89219l.m154714a((Object) t2.f102703b.f102747f, (Object) "holder_name")) {
                            if (t2.f102705a != null) {
                                strArr[3] = ",card_holder";
                            } else {
                                strArr[3] = null;
                            }
                        }
                    }
                }
            }
            C44108g gVar2 = this.f102909a;
            gVar2.withState(gVar2.mo74990b(), new AbstractC89172b<PaymentState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44108g.View$OnClickListenerC44131r.C441321 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC44131r f102912a;

                static {
                    Covode.recordClassIndex(52443);
                }

                {
                    this.f102912a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(PaymentState paymentState) {
                    String str;
                    String str2;
                    PaymentState paymentState2 = paymentState;
                    C89219l.m154721d(paymentState2, "");
                    C44161t e = this.f102912a.f102909a.mo74992e();
                    String str3 = this.f102912a.f102911c;
                    C44086o checkedPaymentMethod = paymentState2.getCheckedPaymentMethod();
                    if (checkedPaymentMethod != null) {
                        str = checkedPaymentMethod.mo74952c();
                    } else {
                        str = null;
                    }
                    if (this.f102912a.f102909a.mo74994j()) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    String[] strArr = this.f102912a.f102909a.f102876o;
                    this.f102912a.f102909a.mo74990b();
                    e.mo75008a(str3, str, str2, strArr, Boolean.valueOf(PaymentViewModel.m86882a(paymentState2.getCheckedPaymentMethod())));
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        C44089r rVar;
        Object obj;
        boolean z;
        List<C44084m> paymentElements;
        List<C44075e> list;
        T t;
        T t2;
        T t3;
        C44084m copy$default;
        boolean z2;
        int i;
        String str;
        String str2;
        String str3;
        super.onActivityCreated(bundle);
        PaymentViewModel b = mo74990b();
        EventCenter.m87158a().mo75480a("ec_payment_method_activate_clicked", b);
        EventCenter.m87158a().mo75480a("ec_resend_pay_request", b);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            PaymentViewModel b2 = mo74990b();
            C44067c cVar = this.f102867b;
            C89219l.m154721d(cVar, "");
            b2.f102649c = cVar.f102721i;
            C44085n nVar = cVar.f102719g;
            if (!(nVar == null || (rVar = cVar.f102716d) == null)) {
                C44086o oVar = cVar.f102719g.f102789b;
                if (oVar == null) {
                    oVar = rVar.mo74973a();
                }
                ArrayList arrayList = new ArrayList();
                Collection collection = rVar.f102823c;
                if (collection == null) {
                    collection = C89086z.INSTANCE;
                }
                arrayList.addAll(collection);
                Collection collection2 = rVar.f102821a;
                if (collection2 == null) {
                    collection2 = C89086z.INSTANCE;
                }
                arrayList.addAll(collection2);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C44086o oVar2 = (C44086o) obj;
                    if (!C44083l.m86908a(oVar2, oVar)) {
                        if (oVar2.mo74950a(oVar)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                C44086o oVar3 = (C44086o) obj;
                if (oVar3 != null) {
                    C44087p pVar = nVar.f102788a;
                    Boolean bool = nVar.f102790c;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = true;
                    }
                    b2.f102651e = z;
                    if (!(pVar == null || (paymentElements = pVar.getPaymentElements()) == null || paymentElements.isEmpty())) {
                        C44086o oVar4 = nVar.f102789b;
                        if (oVar4 != null) {
                            list = oVar4.mo74949a();
                        } else {
                            list = null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (list != null) {
                            for (T t4 : list) {
                                String str4 = t4.f102742a;
                                if (str4 != null) {
                                    List<C44075e> a = t4.mo74915a();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (T t5 : a) {
                                        List<C44084m> paymentElements2 = pVar.getPaymentElements();
                                        if (paymentElements2 != null) {
                                            Iterator<T> it2 = paymentElements2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    t3 = null;
                                                    break;
                                                }
                                                t3 = it2.next();
                                                if (C89219l.m154714a((Object) t5.f102742a, (Object) t3.getElement())) {
                                                    break;
                                                }
                                            }
                                            T t6 = t3;
                                            if (t6 != null) {
                                                if (C89219l.m154714a((Object) t6.getElement(), (Object) "eg_ccdc_global_billing_address_country_regin")) {
                                                    copy$default = C44084m.copy$default(t6, null, null, C89219l.m154704a(t6.getParamValue(), (Object) ("," + nVar.f102792e + ',' + nVar.f102793f)), null, null, 27, null);
                                                } else {
                                                    copy$default = C44084m.copy$default(t6, null, null, null, null, null, 31, null);
                                                }
                                                if (copy$default != null) {
                                                    arrayList2.add(copy$default);
                                                }
                                            }
                                        }
                                    }
                                    linkedHashMap.put(str4, arrayList2);
                                }
                            }
                        }
                        linkedHashMap.put("save_element", C89070n.m154516a(new C44084m("save_element", "save_element", String.valueOf(C89219l.m154714a((Object) pVar.isChooseSave(), (Object) true)), null, null, 24, null)));
                        List<C44084m> paymentElements3 = pVar.getPaymentElements();
                        if (paymentElements3 != null) {
                            Iterator<T> it3 = paymentElements3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it3.next();
                                if (C89219l.m154714a((Object) "card_id_element", (Object) t.getElement())) {
                                    break;
                                }
                            }
                        } else {
                            t = null;
                        }
                        List<C44084m> paymentElements4 = pVar.getPaymentElements();
                        if (paymentElements4 != null) {
                            Iterator<T> it4 = paymentElements4.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    t2 = null;
                                    break;
                                }
                                t2 = it4.next();
                                if (C89219l.m154714a((Object) "card_token_element", (Object) t2.getElement())) {
                                    break;
                                }
                            }
                        } else {
                            t2 = null;
                        }
                        if (!(t == null || t2 == null)) {
                            linkedHashMap.put("card_type_element", C89070n.m154522b(t, t2));
                        }
                        b2.f102652f.put(C89219l.m154704a(oVar3.f102794a, (Object) oVar3.f102809p), linkedHashMap);
                    }
                }
            }
            mo74990b().f102650d = mo74992e();
            C89219l.m154716b(activity, "");
            RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.dgn);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setAdapter(mo74991c());
            RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.dgn);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) mo60929a(R.id.dgn)).mo4415b(new C44173b(C0643b.m2378c(activity, R.color.b6)));
            ((RecyclerView) mo60929a(R.id.ate)).mo4415b(new C43458c((int) C13628n.m24520b(getActivity(), 12.0f), (int) C13628n.m24520b(getActivity(), 16.0f)));
            if (this.f102867b.f102718f) {
                NormalTitleBar normalTitleBar = (NormalTitleBar) mo60929a(R.id.eim);
                C89219l.m154716b(normalTitleBar, "");
                ImageView startBtn = normalTitleBar.getStartBtn();
                C89219l.m154716b(startBtn, "");
                startBtn.setVisibility(8);
            } else {
                NormalTitleBar normalTitleBar2 = (NormalTitleBar) mo60929a(R.id.eim);
                C89219l.m154716b(normalTitleBar2, "");
                ImageView endBtn = normalTitleBar2.getEndBtn();
                C89219l.m154716b(endBtn, "");
                endBtn.setVisibility(8);
            }
            NormalTitleBar normalTitleBar3 = (NormalTitleBar) mo60929a(R.id.eim);
            C89219l.m154716b(normalTitleBar3, "");
            normalTitleBar3.getStartBtn().setOnClickListener(new View$OnClickListenerC44127n(this));
            NormalTitleBar normalTitleBar4 = (NormalTitleBar) mo60929a(R.id.eim);
            C89219l.m154716b(normalTitleBar4, "");
            normalTitleBar4.getEndBtn().setOnClickListener(new View$OnClickListenerC44128o(this));
            Integer num = this.f102867b.f102713a;
            Integer num2 = this.f102867b.f102714b;
            if (num == null || num2 == null) {
                z2 = false;
            } else {
                ((PageStepper) mo60929a(R.id.e80)).setTotalStep(num2.intValue());
                ((PageStepper) mo60929a(R.id.e80)).setLightStep(num.intValue());
                PageStepper pageStepper = (PageStepper) mo60929a(R.id.e80);
                C89219l.m154716b(pageStepper, "");
                z2 = false;
                pageStepper.setVisibility(0);
            }
            Integer num3 = this.f102867b.f102715c;
            int ordinal = C44067c.EnumC44068a.NEXT.ordinal();
            if (num3 != null && num3.intValue() == ordinal) {
                i = R.string.bi7;
            } else {
                int ordinal2 = C44067c.EnumC44068a.CONTINUE.ordinal();
                if (num3 != null && num3.intValue() == ordinal2) {
                    i = R.string.bi6;
                } else {
                    i = R.string.bi8;
                }
            }
            TuxButton tuxButton = (TuxButton) mo60929a(R.id.u3);
            C89219l.m154716b(tuxButton, "");
            Context context = getContext();
            if (context != null) {
                str = context.getString(i);
            } else {
                str = null;
            }
            tuxButton.setText(str);
            Integer num4 = this.f102867b.f102715c;
            int ordinal3 = C44067c.EnumC44068a.NEXT.ordinal();
            if (num4 != null && num4.intValue() == ordinal3) {
                str2 = "next";
            } else {
                int ordinal4 = C44067c.EnumC44068a.PAY_NOW.ordinal();
                if (num4 != null && num4.intValue() == ordinal4) {
                    str2 = "pay_now";
                } else {
                    int ordinal5 = C44067c.EnumC44068a.CONTINUE.ordinal();
                    if (num4 != null && num4.intValue() == ordinal5) {
                        str2 = "continue";
                    } else {
                        str2 = "";
                    }
                }
            }
            C44161t e = mo74992e();
            C89219l.m154721d(str2, "");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(e.f102956a);
            linkedHashMap2.put("button_name", str2);
            C45544c.m88082a("tiktokec_button_show", linkedHashMap2);
            String str5 = this.f102867b.f102717e;
            if (str5 == null || str5.length() == 0) {
                z2 = true;
            }
            if (z2) {
                View a2 = mo60929a(R.id.amb);
                C89219l.m154716b(a2, "");
                a2.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) mo60929a(R.id.emk);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                TuxTextView tuxTextView2 = (TuxTextView) mo60929a(R.id.emj);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) mo60929a(R.id.emk);
                C89219l.m154716b(tuxTextView3, "");
                StringBuilder sb = new StringBuilder();
                Context context2 = getContext();
                if (context2 != null) {
                    str3 = context2.getString(R.string.fuw);
                } else {
                    str3 = null;
                }
                tuxTextView3.setText(sb.append(str3).append(':').toString());
                withState(mo74990b(), new C44129p(this));
            }
            PaymentViewModel b3 = mo74990b();
            C44130q qVar = new C44130q(this);
            C89219l.m154721d(qVar, "");
            b3.f102647a = qVar;
            mo74990b().f102648b = this.f102867b.f102722j;
            ((TuxButton) mo60929a(R.id.u3)).setOnClickListener(new View$OnClickListenerC44131r(this, activity, str2));
            ((RecyclerView) mo60929a(R.id.dgn)).mo4405a(new C44133s(this));
            AbstractC88412b unused = selectSubscribe(mo74990b(), C44144i.f102929a, new C20370ah(), new C44122j(this, activity));
            AbstractC88412b unused2 = selectSubscribe(mo74990b(), C44149n.f102934a, new C20370ah(), new C44124k(this));
            AbstractC88412b unused3 = selectSubscribe(mo74990b(), C44150o.f102935a, new C20370ah(), new C44125l(this));
            AbstractC88412b unused4 = selectSubscribe(mo74990b(), C44151p.f102936a, new C20370ah(), new C44126m(this));
            AbstractC88412b unused5 = selectSubscribe(mo74990b(), C44152q.f102937a, new C20370ah(), new C44116e(this));
            AbstractC88412b unused6 = selectSubscribe(mo74990b(), C44145j.f102930a, new C20370ah(), new C44117f(this));
            AbstractC88412b unused7 = selectSubscribe(mo74990b(), C44146k.f102931a, new C20370ah(), new C44119g(this));
            AbstractC88412b unused8 = selectSubscribe(mo74990b(), C44147l.f102932a, new C20370ah(), new C44120h(this));
            AbstractC88412b unused9 = selectSubscribe(mo74990b(), C44148m.f102933a, new C20370ah(), new C44121i(this));
        }
        View view = getView();
        ActivityC0945e activity2 = getActivity();
        if (activity2 != null) {
            window = activity2.getWindow();
        } else {
            window = null;
        }
        if (!(view == null || window == null)) {
            AbstractC1196i lifecycle = getLifecycle();
            C89219l.m154716b(lifecycle, "");
            new KeyBoardVisibilityUtil(lifecycle, window, view, null, new C44136u(view, this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$f */
    static final class C44117f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102893a;

        static {
            Covode.recordClassIndex(52428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44117f(C44108g gVar) {
            super(2);
            this.f102893a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Object obj) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f102893a.mo74990b(), new AbstractC89172b<PaymentState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44108g.C44117f.C441181 */

                /* renamed from: a */
                final /* synthetic */ C44117f f102894a;

                static {
                    Covode.recordClassIndex(52429);
                }

                {
                    this.f102894a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(PaymentState paymentState) {
                    String str;
                    String str2;
                    PaymentState paymentState2 = paymentState;
                    C89219l.m154721d(paymentState2, "");
                    C44085n paymentInfoForNextStep = paymentState2.getPaymentInfoForNextStep();
                    if (paymentInfoForNextStep != null) {
                        this.f102894a.f102893a.f102868c.invoke(paymentInfoForNextStep);
                        C44108g gVar = this.f102894a.f102893a;
                        Integer num = this.f102894a.f102893a.f102867b.f102715c;
                        int ordinal = C44067c.EnumC44068a.NEXT.ordinal();
                        if (num != null && num.intValue() == ordinal) {
                            str = "next";
                        } else {
                            str = "return";
                        }
                        gVar.f102874m = str;
                        Integer num2 = this.f102894a.f102893a.f102867b.f102715c;
                        int ordinal2 = C44067c.EnumC44068a.PAY_NOW.ordinal();
                        if (num2 != null && num2.intValue() == ordinal2) {
                            C44161t e = this.f102894a.f102893a.mo74992e();
                            C44086o oVar = paymentInfoForNextStep.f102789b;
                            if (oVar != null) {
                                str2 = oVar.mo74952c();
                            } else {
                                str2 = null;
                            }
                            this.f102894a.f102893a.mo74990b();
                            e.mo75009a(str2, PaymentViewModel.m86882a(paymentInfoForNextStep.f102789b));
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$h */
    static final class C44120h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102896a;

        static {
            Covode.recordClassIndex(52431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44120h(C44108g gVar) {
            super(2);
            this.f102896a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f102896a.f102872k.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$k */
    static final class C44124k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102902a;

        static {
            Covode.recordClassIndex(52435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44124k(C44108g gVar) {
            super(2);
            this.f102902a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            List<? extends Object> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            this.f102902a.mo74991c().mo60931a(list2);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f102867b.f102718f) {
            new C44046a(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$g */
    static final class C44119g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102895a;

        static {
            Covode.recordClassIndex(52430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44119g(C44108g gVar) {
            super(2);
            this.f102895a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44085n nVar) {
            C89219l.m154721d(iVar, "");
            if (nVar != null) {
                this.f102895a.f102870e.invoke(nVar);
                this.f102895a.f102874m = "return";
                this.f102895a.f102875n = true;
                ActivityC0945e activity = this.f102895a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$i */
    static final class C44121i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102897a;

        static {
            Covode.recordClassIndex(52432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44121i(C44108g gVar) {
            super(2);
            this.f102897a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                DialogC81438i i = this.f102897a.mo74993i();
                i.setCanceledOnTouchOutside(true);
                i.show();
            } else {
                try {
                    this.f102897a.mo74993i().dismiss();
                } catch (Exception e) {
                    C22708a.m42802a((Throwable) e);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$l */
    static final class C44125l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102903a;

        static {
            Covode.recordClassIndex(52436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44125l(C44108g gVar) {
            super(2);
            this.f102903a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            Context context;
            C89219l.m154721d(iVar, "");
            if (str != null) {
                Context context2 = this.f102903a.getContext();
                if (context2 != null) {
                    context = context2.getApplicationContext();
                    if (C58003a.f132201c && context == null) {
                        context = C58003a.f132199a;
                    }
                } else {
                    context = null;
                }
                new C79459a(context).mo123050a(R.string.ftv).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$u */
    static final class C44136u extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102920a;

        /* renamed from: b */
        final /* synthetic */ C44108g f102921b;

        static {
            Covode.recordClassIndex(52447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44136u(View view, C44108g gVar) {
            super(2);
            this.f102920a = view;
            this.f102921b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            if (booleanValue) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f102921b.mo60929a(R.id.ua);
                C89219l.m154716b(constraintLayout, "");
                constraintLayout.setVisibility(8);
            } else {
                this.f102921b.mo74990b().mo74865b(false);
                this.f102920a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44108g.C44136u.RunnableC441371 */

                    /* renamed from: a */
                    final /* synthetic */ C44136u f102922a;

                    static {
                        Covode.recordClassIndex(52448);
                    }

                    {
                        this.f102922a = r1;
                    }

                    public final void run() {
                        ConstraintLayout constraintLayout = (ConstraintLayout) this.f102922a.f102921b.mo60929a(R.id.ua);
                        C89219l.m154716b(constraintLayout, "");
                        constraintLayout.setVisibility(0);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$e */
    static final class C44116e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102892a;

        static {
            Covode.recordClassIndex(52427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44116e(C44108g gVar) {
            super(2);
            this.f102892a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44085n nVar) {
            String str;
            String str2;
            C44085n nVar2 = nVar;
            C89219l.m154721d(iVar, "");
            if (nVar2 != null) {
                this.f102892a.f102868c.invoke(nVar2);
                C44108g gVar = this.f102892a;
                Integer num = gVar.f102867b.f102715c;
                int ordinal = C44067c.EnumC44068a.NEXT.ordinal();
                if (num != null && num.intValue() == ordinal) {
                    str = "next";
                } else {
                    str = "return";
                }
                gVar.f102874m = str;
                Integer num2 = this.f102892a.f102867b.f102715c;
                int ordinal2 = C44067c.EnumC44068a.PAY_NOW.ordinal();
                if (num2 != null && num2.intValue() == ordinal2) {
                    C44161t e = this.f102892a.mo74992e();
                    C44086o oVar = nVar2.f102789b;
                    if (oVar != null) {
                        str2 = oVar.mo74952c();
                    } else {
                        str2 = null;
                    }
                    this.f102892a.mo74990b();
                    e.mo75009a(str2, PaymentViewModel.m86882a(nVar2.f102789b));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$m */
    static final class C44126m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102904a;

        static {
            Covode.recordClassIndex(52437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44126m(C44108g gVar) {
            super(2);
            this.f102904a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            int i = 8;
            if (booleanValue) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f102904a.mo60929a(R.id.ua);
                C89219l.m154716b(constraintLayout, "");
                constraintLayout.setVisibility(8);
                EditText editText = (EditText) ((FixedRecyclerView) this.f102904a.mo60929a(R.id.dgn)).findViewWithTag(Integer.valueOf(EnumC44227f.Email.ordinal()));
                if (editText != null) {
                    RecyclerView recyclerView = (RecyclerView) this.f102904a.mo60929a(R.id.ate);
                    C89219l.m154716b(recyclerView, "");
                    C43452b.C43456c.m86515a(recyclerView, editText);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) this.f102904a.mo60929a(R.id.ate);
            C89219l.m154716b(recyclerView2, "");
            if (booleanValue) {
                i = 0;
            }
            recyclerView2.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$j */
    static final class C44122j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44086o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102898a;

        /* renamed from: b */
        final /* synthetic */ Activity f102899b;

        static {
            Covode.recordClassIndex(52433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44122j(C44108g gVar, Activity activity) {
            super(2);
            this.f102898a = gVar;
            this.f102899b = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44086o oVar) {
            boolean z;
            C44073c cVar;
            String str;
            String str2;
            C44071a aVar;
            AbstractC20477i iVar2 = iVar;
            final C44086o oVar2 = oVar;
            String str3 = "";
            C89219l.m154721d(iVar2, str3);
            this.f102898a.f102873l = oVar2;
            C45573n.m88122a(this.f102899b);
            TuxButton tuxButton = (TuxButton) this.f102898a.mo60929a(R.id.u3);
            C89219l.m154716b(tuxButton, str3);
            if (oVar2 != null) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            C44086o oVar3 = this.f102898a.f102873l;
            if (!(oVar3 == null || (aVar = oVar3.f102813t) == null || !C89219l.m154714a((Object) false, (Object) aVar.f102725a))) {
                TuxButton tuxButton2 = (TuxButton) this.f102898a.mo60929a(R.id.u3);
                C89219l.m154716b(tuxButton2, str3);
                tuxButton2.setEnabled(false);
            }
            C44086o oVar4 = this.f102898a.f102873l;
            if (!(oVar4 == null || (cVar = oVar4.f102814u) == null || (str = cVar.f102734a) == null || !C80538hl.m139614a(str))) {
                TuxButton tuxButton3 = (TuxButton) this.f102898a.mo60929a(R.id.u3);
                C89219l.m154716b(tuxButton3, str3);
                tuxButton3.setEnabled(false);
                PaymentViewModel b = this.f102898a.mo74990b();
                C44086o oVar5 = this.f102898a.f102873l;
                if (!(oVar5 == null || (str2 = oVar5.f102794a) == null || str2.length() == 0)) {
                    AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new PaymentViewModel.C44036h(b, C89070n.m154525d(new BindInfoReqInfo(str2)), null), 2);
                }
            }
            TuxTextView tuxTextView = (TuxTextView) this.f102898a.mo60929a(R.id.emj);
            C89219l.m154716b(tuxTextView, str3);
            PaymentViewModel b2 = this.f102898a.mo74990b();
            String str4 = this.f102898a.f102867b.f102717e;
            if (str4 != null) {
                str3 = str4;
            }
            tuxTextView.setText(b2.mo74860a(oVar2, str3));
            if (oVar2 != null) {
                iVar2.withState(this.f102898a.mo74990b(), new AbstractC89172b<PaymentState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44108g.C44122j.C441231 */

                    /* renamed from: a */
                    final /* synthetic */ C44122j f102900a;

                    static {
                        Covode.recordClassIndex(52434);
                    }

                    {
                        this.f102900a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(PaymentState paymentState) {
                        String str;
                        PaymentState paymentState2 = paymentState;
                        C89219l.m154721d(paymentState2, "");
                        if (this.f102900a.f102898a.f102877p == null) {
                            this.f102900a.f102898a.f102877p = oVar2.mo74952c();
                        }
                        C44161t e = this.f102900a.f102898a.mo74992e();
                        String c = oVar2.mo74952c();
                        boolean a = C80538hl.m139614a(oVar2.f102805l);
                        this.f102900a.f102898a.mo74990b();
                        int a2 = PaymentViewModel.m86880a(oVar2, paymentState2.getPaymentList());
                        String str2 = this.f102900a.f102898a.f102877p;
                        this.f102900a.f102898a.mo74990b();
                        boolean a3 = PaymentViewModel.m86882a(oVar2);
                        boolean a4 = C80538hl.m139614a(oVar2.f102812s);
                        C44071a aVar = oVar2.f102813t;
                        if (aVar != null) {
                            str = aVar.f102726b;
                        } else {
                            str = null;
                        }
                        C89219l.m154721d(c, "");
                        C89219l.m154721d("payment_type", "");
                        C45544c.m88083a("tiktokec_select_option", e.f102956a, new C44161t.C44168f(c, a, a2, "payment_type", str2, a3, a4, str));
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$ab */
    static final class C44111ab extends AbstractC89220m implements AbstractC89183m<PaymentState, Bundle, PaymentState> {

        /* renamed from: a */
        final /* synthetic */ C44108g f102885a;

        static {
            Covode.recordClassIndex(52422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44111ab(C44108g gVar) {
            super(2);
            this.f102885a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState, Bundle bundle) {
            boolean z;
            boolean z2;
            C44064h hVar;
            C44086o oVar;
            Object obj;
            ArrayList arrayList;
            C89219l.m154721d(paymentState, "");
            C44089r rVar = this.f102885a.f102867b.f102716d;
            if (rVar != null) {
                C44287y.m87013a(rVar);
            }
            C44067c cVar = this.f102885a.f102867b;
            C89219l.m154721d(cVar, "");
            ArrayList arrayList2 = new ArrayList();
            C44089r rVar2 = cVar.f102716d;
            if (rVar2 == null) {
                return new PaymentState(null, arrayList2, cVar.f102719g, null, false, null, null, false, false, null, 1017, null);
            }
            PaymentViewModel.C44028a.m86893a(C89086z.INSTANCE);
            Collection<C44086o> collection = rVar2.f102821a;
            if (collection == null) {
                collection = C89086z.INSTANCE;
            }
            List<C44086o> list = rVar2.f102823c;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (rVar2.f102826f == null || rVar2.f102823c.size() <= rVar2.f102826f.intValue()) {
                    List<C44086o> list2 = rVar2.f102823c;
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new C44064h(it.next()));
                    }
                    arrayList = arrayList3;
                } else {
                    C44052aa aaVar = new C44052aa(rVar2.f102823c.subList(rVar2.f102826f.intValue(), rVar2.f102823c.size()));
                    List<C44086o> subList = rVar2.f102823c.subList(0, rVar2.f102826f.intValue());
                    ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) subList, 10));
                    Iterator<T> it2 = subList.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new C44064h(it2.next()));
                    }
                    arrayList = C89070n.m154585g((Collection) arrayList4);
                    arrayList.add(aaVar);
                }
                PaymentViewModel.C44028a.m86893a(arrayList);
            }
            if (!(!PaymentViewModel.f102645m.isEmpty()) || !(!collection.isEmpty())) {
                z2 = false;
            } else {
                z2 = true;
                arrayList2.add(new C44045a(R.string.big));
            }
            arrayList2.addAll(PaymentViewModel.f102645m);
            if (z2) {
                arrayList2.add(new C44045a(R.string.bid));
            }
            ArrayList arrayList5 = new ArrayList(C89070n.m154526a(collection, 10));
            for (C44086o oVar2 : collection) {
                arrayList5.add(new C44064h(oVar2));
            }
            arrayList2.addAll(arrayList5);
            C44088q qVar = rVar2.f102825e;
            C44086o oVar3 = null;
            if (!(qVar == null || qVar.f102819a == null)) {
                arrayList2.add(rVar2.f102825e);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList2) {
                C44064h hVar2 = (C44064h) (!(obj2 instanceof C44064h) ? null : obj2);
                if (hVar2 != null && !(!C89219l.m154714a((Object) hVar2.f102707a.f102804k, (Object) true))) {
                    String str = hVar2.f102707a.f102803j;
                    if (str == null) {
                        str = "";
                    }
                    if (!C45572m.m88116a(str)) {
                    }
                }
                arrayList6.add(obj2);
            }
            List g = C89070n.m154585g((Collection) arrayList6);
            int i = 0;
            for (Object obj3 : g) {
                if (obj3 instanceof C44064h) {
                    ((C44064h) obj3).f102709c = i;
                    i++;
                }
                if (obj3 instanceof C44052aa) {
                    i += ((C44052aa) obj3).f102693b.size();
                }
            }
            List g2 = C89070n.m154585g((Collection) g);
            C44085n nVar = cVar.f102719g;
            if ((nVar == null || (oVar = nVar.f102789b) == null) && (oVar = rVar2.mo74973a()) == null) {
                hVar = null;
            } else {
                Iterator it3 = g2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (obj instanceof C44064h) {
                        C44064h hVar3 = (C44064h) obj;
                        if (C44083l.m86908a(hVar3.f102707a, oVar) || hVar3.f102707a.mo74950a(oVar)) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof C44064h)) {
                    obj = null;
                }
                hVar = (C44064h) obj;
                if (hVar != null) {
                    PaymentViewModel.C44028a.m86892a(hVar, hVar.f102707a, g2);
                }
            }
            if (hVar != null) {
                oVar3 = hVar.f102707a;
            }
            return new PaymentState(oVar3, g2, cVar.f102719g, null, false, null, null, false, false, null, 1016, null);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        List<C44086o> list;
        C89219l.m154721d(layoutInflater, "");
        C44161t e = mo74992e();
        C44067c cVar = this.f102867b;
        C89219l.m154721d(cVar, "");
        if (!e.f102960e) {
            C44089r rVar = cVar.f102716d;
            String str = null;
            if (rVar == null || (list = rVar.f102821a) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    if ((t2 instanceof C44086o) && t2 != null && !(!C89219l.m154714a((Object) t2.f102804k, (Object) true))) {
                        String str2 = t2.f102803j;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!C45572m.m88116a(str2)) {
                        }
                    }
                    arrayList2.add(t);
                }
                arrayList = arrayList2;
            }
            C44089r rVar2 = cVar.f102716d;
            if (rVar2 != null) {
                ArrayList<C44086o> arrayList3 = new ArrayList();
                Collection collection = rVar2.f102823c;
                if (collection == null) {
                    collection = C89086z.INSTANCE;
                }
                arrayList3.addAll(collection);
                if (arrayList == null) {
                    arrayList = C89086z.INSTANCE;
                }
                arrayList3.addAll(arrayList);
                ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
                for (C44086o oVar : arrayList3) {
                    arrayList4.add(oVar.mo74952c());
                }
                str = C89070n.m154551a(arrayList4, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C44161t.C44165c.f102967a, 30);
            }
            C45544c.m88083a("tiktokec_enter_page", e.f102956a, new C44161t.C44164b(str));
            e.f102960e = true;
        }
        return C1764a.m5927a(layoutInflater, R.layout.pa, viewGroup, false);
    }
}
