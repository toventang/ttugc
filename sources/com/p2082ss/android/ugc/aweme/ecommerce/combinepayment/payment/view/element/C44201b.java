package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44071a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44073c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44172a;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b */
public final class C44201b extends LinearLayout implements AbstractC44225e {

    /* renamed from: a */
    public static final C44202a f103087a = new C44202a((byte) 0);

    /* renamed from: b */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103088b;

    /* renamed from: c */
    private C44086o f103089c;

    /* renamed from: d */
    private C44075e f103090d;

    /* renamed from: e */
    private AbstractC89172b<? super String, String> f103091e;

    /* renamed from: g */
    private final AbstractC89244h f103092g;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b$c */
    static final class C44204c extends AbstractC89220m implements AbstractC89172b {

        /* renamed from: a */
        public static final C44204c f103095a = new C44204c();

        static {
            Covode.recordClassIndex(52516);
        }

        C44204c() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(52513);
    }

    private final C44172a getBalanceView() {
        return (C44172a) this.f103092g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b$a */
    public static final class C44202a {
        static {
            Covode.recordClassIndex(52514);
        }

        private C44202a() {
        }

        public /* synthetic */ C44202a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103090d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, java.lang.String>, h.f.a.b<java.lang.String, java.lang.String> */
    public final AbstractC89172b<String, String> getGetBindUrl() {
        return this.f103091e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103088b;
    }

    public final C44086o getPaymentMethod() {
        return this.f103089c;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b$b */
    static final class C44203b extends AbstractC89220m implements AbstractC89171a<C44172a> {

        /* renamed from: a */
        final /* synthetic */ C44201b f103093a;

        /* renamed from: b */
        final /* synthetic */ Context f103094b;

        static {
            Covode.recordClassIndex(52515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44203b(C44201b bVar, Context context) {
            super(0);
            this.f103093a = bVar;
            this.f103094b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C44172a invoke() {
            C44172a aVar = new C44172a(this.f103094b, (byte) 0);
            aVar.getBalanceTextValue();
            this.f103093a.addView(aVar);
            return aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        return C89070n.m154516a(new C44084m("balance", null, null, null, null, 24, null));
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103090d = eVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103089c = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b$e */
    static final class C44206e extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44206e f103099a = new C44206e();

        static {
            Covode.recordClassIndex(52518);
        }

        C44206e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    public final void setGetBindUrl(AbstractC89172b<? super String, String> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103091e = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103088b = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44201b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8179);
        this.f103088b = C44206e.f103099a;
        this.f103091e = C44204c.f103095a;
        this.f103092g = C89250i.m154773a((AbstractC89171a) new C44203b(this, context));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        MethodCollector.m26664o(8179);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b$d */
    public static final class C44205d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103096a = 700;

        /* renamed from: b */
        final /* synthetic */ C44201b f103097b;

        /* renamed from: c */
        final /* synthetic */ C44086o f103098c;

        static {
            Covode.recordClassIndex(52517);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String invoke;
            if (view != null && (invoke = this.f103097b.getGetBindUrl().invoke(this.f103098c.f102794a)) != null && C80538hl.m139614a(invoke)) {
                C43732h.m86725a("active_now", "confirm", (HashMap) null, "payment_method", (String) null, (Boolean) null, this.f103098c.f102795b, Boolean.valueOf(C80538hl.m139614a(this.f103098c.f102805l)), 52);
                EventCenter.m87158a().mo75479a("ec_payment_method_activate_clicked", "{}");
                SmartRouter.buildRoute(this.f103097b.getContext(), invoke).open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44205d(C44201b bVar, C44086o oVar) {
            super(700);
            this.f103097b = bVar;
            this.f103098c = oVar;
        }
    }

    public /* synthetic */ C44201b(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public final void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        String str;
        String str2;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        getBalanceView().setBalanceTextColor(C0643b.m2378c(getContext(), R.color.c5));
        getBalanceView().setButtonTextValue("");
        getBalanceView().setNoteTextVisibility(false);
        getBalanceView().setNoteTextValue("");
        getBalanceView().setBalanceTextValue("");
        getBalanceView().mo75016a(false);
        String str3 = oVar.f102812s;
        String str4 = null;
        if (str3 != null && C80538hl.m139614a(str3)) {
            getBalanceView().setBalanceTextValue(str3);
        }
        C44071a aVar = oVar.f102813t;
        if (aVar != null && C89219l.m154714a((Object) aVar.f102725a, (Object) false)) {
            getBalanceView().setBalanceTextColor(C0643b.m2378c(getContext(), R.color.bz));
        }
        C44073c cVar = oVar.f102814u;
        if (!(cVar == null || (str2 = cVar.f102736c) == null || !C80538hl.m139614a(str2))) {
            getBalanceView().setBalanceTextValue(str2);
            getBalanceView().setBalanceTextColor(C0643b.m2378c(getContext(), R.color.bz));
        }
        C44073c cVar2 = oVar.f102814u;
        if (!(cVar2 == null || (str = cVar2.f102735b) == null || !C80538hl.m139614a(str))) {
            getBalanceView().setNoteTextValue(str);
            getBalanceView().setNoteTextVisibility(true);
        }
        C44073c cVar3 = oVar.f102814u;
        if (cVar3 != null) {
            str4 = cVar3.f102734a;
        }
        if (C80538hl.m139614a(str4) && str4 != null) {
            getBalanceView().setButtonTextValue(str4);
            getBalanceView().mo75016a(true);
            C43732h.m86724a("active_now", "confirm", (HashMap) null, "payment_method", oVar.f102795b, Boolean.valueOf(C80538hl.m139614a(oVar.f102805l)), 20);
            ConstraintLayout constraintLayout = (ConstraintLayout) getBalanceView().mo75015a(R.id.qf);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setOnClickListener(new C44205d(this, oVar));
        }
    }
}
