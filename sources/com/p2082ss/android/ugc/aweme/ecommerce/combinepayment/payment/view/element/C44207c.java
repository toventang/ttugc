package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p153a.C2748h;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p157c.AbstractC2768c;
import com.bytedance.android.ecommerce.p159e.AbstractC2780d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44161t;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.C44054a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44074d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.api.PaymentApi;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44627b;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45564i;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c */
public final class C44207c extends AbstractC44228g {

    /* renamed from: d */
    public static boolean f103100d;

    /* renamed from: e */
    public static final C44208a f103101e = new C44208a((byte) 0);

    /* renamed from: b */
    public final int f103102b;

    /* renamed from: c */
    public final C44209b f103103c;

    /* renamed from: g */
    private final Runnable f103104g;

    /* renamed from: h */
    private String f103105h;

    /* renamed from: i */
    private C44161t f103106i;

    /* renamed from: j */
    private C44086o f103107j;

    /* renamed from: k */
    private C44075e f103108k;

    /* renamed from: l */
    private List<C44086o> f103109l;

    /* renamed from: m */
    private String f103110m;

    /* renamed from: n */
    private TextWatcher f103111n;

    /* renamed from: o */
    private final int f103112o;

    /* renamed from: p */
    private final int f103113p;

    /* renamed from: q */
    private final int f103114q;

    /* renamed from: r */
    private AbstractC89172b<? super C44086o, C89391z> f103115r;

    /* renamed from: s */
    private final C20745e f103116s;

    /* renamed from: t */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103117t;

    /* renamed from: u */
    private SparseArray f103118u;

    static {
        Covode.recordClassIndex(52519);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    /* renamed from: a */
    public final View mo74090a(int i) {
        if (this.f103118u == null) {
            this.f103118u = new SparseArray();
        }
        View view = (View) this.f103118u.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103118u.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getContentViewLayoutId() {
        return R.layout.p7;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$a */
    public static final class C44208a {
        static {
            Covode.recordClassIndex(52520);
        }

        private C44208a() {
        }

        public /* synthetic */ C44208a(byte b) {
            this();
        }
    }

    public final List<String> getAllCardIcons() {
        return C89086z.INSTANCE;
    }

    public final C20745e getCircleOption() {
        return this.f103116s;
    }

    public final String getCurrentPaymentId() {
        return this.f103110m;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103108k;
    }

    public final String getMInputType() {
        return this.f103105h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, h.z>, h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, h.z> */
    public final AbstractC89172b<C44086o, C89391z> getOnPaymentMethodIdentify() {
        return this.f103115r;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103117t;
    }

    public final List<C44086o> getPaymentList() {
        return this.f103109l;
    }

    public final C44161t getPaymentLogger() {
        return this.f103106i;
    }

    public final C44086o getPaymentMethod() {
        return this.f103107j;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$j */
    static final class RunnableC44218j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44207c f103132a;

        static {
            Covode.recordClassIndex(52530);
        }

        RunnableC44218j(C44207c cVar) {
            this.f103132a = cVar;
        }

        public final void run() {
            this.f103132a.mo75095b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g
    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo74090a(R.id.boj);
        C89219l.m154716b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        new Handler(Looper.getMainLooper()).removeCallbacks(this.f103104g);
    }

    /* renamed from: b */
    public final void mo75095b() {
        PaymentApi.C44630a.m87364a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C44054a.C44055a());
        new Handler(Looper.getMainLooper()).postDelayed(this.f103104g, 300000);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        String str;
        String str2;
        C44075e elementDTO = getElementDTO();
        Boolean bool = null;
        if (elementDTO != null) {
            str = elementDTO.f102742a;
        } else {
            str = null;
        }
        C44075e elementDTO2 = getElementDTO();
        if (elementDTO2 != null) {
            str2 = elementDTO2.f102747f;
        } else {
            str2 = null;
        }
        DmtEditText dmtEditText = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        String a = C89361p.m154868a(String.valueOf(dmtEditText.getText()), " ", "");
        C44075e elementDTO3 = getElementDTO();
        if (elementDTO3 != null) {
            bool = elementDTO3.f102752k;
        }
        return C89070n.m154516a(new C44084m(str, str2, a, bool, null, 16, null));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$b */
    public static final class C44209b implements AbstractC2768c {

        /* renamed from: a */
        final /* synthetic */ C44207c f103119a;

        static {
            Covode.recordClassIndex(52521);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$b$a */
        static final class RunnableC44210a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44209b f103120a;

            /* renamed from: b */
            final /* synthetic */ int f103121b;

            /* renamed from: c */
            final /* synthetic */ C2740b f103122c;

            /* renamed from: d */
            final /* synthetic */ String f103123d;

            static {
                Covode.recordClassIndex(52522);
            }

            RunnableC44210a(C44209b bVar, int i, C2740b bVar2, String str) {
                this.f103120a = bVar;
                this.f103121b = i;
                this.f103122c = bVar2;
                this.f103123d = str;
            }

            public final void run() {
                try {
                    String invoke = this.f103120a.f103119a.getOnVerify().invoke(this.f103120a.f103119a.getValue());
                    if (invoke != null) {
                        this.f103120a.f103119a.mo74092a(invoke);
                    }
                    DmtEditText dmtEditText = (DmtEditText) this.f103120a.f103119a.mo74090a(R.id.bol);
                    C89219l.m154716b(dmtEditText, "");
                    dmtEditText.setFocusableInTouchMode(true);
                    ((DmtEditText) this.f103120a.f103119a.mo74090a(R.id.bol)).requestFocus();
                    long j = 0;
                    if (this.f103121b != this.f103120a.f103119a.f103102b || this.f103122c == null) {
                        C44161t paymentLogger = this.f103120a.f103119a.getPaymentLogger();
                        if (paymentLogger != null) {
                            C44161t paymentLogger2 = this.f103120a.f103119a.getPaymentLogger();
                            if (paymentLogger2 != null) {
                                j = paymentLogger2.mo75011b("ocr_scanning");
                            }
                            paymentLogger.mo75004a(j, "back");
                        }
                        new C23144b(this.f103120a.f103119a).mo37635a(this.f103123d).mo37637b();
                        return;
                    }
                    this.f103120a.f103119a.setMInputType("card_number_ocr");
                    ((DmtEditText) this.f103120a.f103119a.mo74090a(R.id.bol)).setText(this.f103122c.f8198h);
                    ((DmtEditText) this.f103120a.f103119a.mo74090a(R.id.bol)).setSelection((this.f103122c.f8198h.length() + (this.f103122c.f8198h.length() / 4)) - 1);
                    C44161t paymentLogger3 = this.f103120a.f103119a.getPaymentLogger();
                    if (paymentLogger3 != null) {
                        C44161t paymentLogger4 = this.f103120a.f103119a.getPaymentLogger();
                        if (paymentLogger4 != null) {
                            j = paymentLogger4.mo75011b("ocr_scanning");
                        }
                        paymentLogger3.mo75004a(j, "card_result");
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44209b(C44207c cVar) {
            this.f103119a = cVar;
        }

        @Override // com.bytedance.android.ecommerce.p157c.AbstractC2769d
        /* renamed from: a */
        public final void mo7348a(int i, int i2, String str, C2740b bVar) {
            new Handler(Looper.getMainLooper()).post(new RunnableC44210a(this, i, bVar, str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$h */
    static final class C44216h extends AbstractC89220m implements AbstractC89172b<C44086o, C89391z> {

        /* renamed from: a */
        public static final C44216h f103130a = new C44216h();

        static {
            Covode.recordClassIndex(52528);
        }

        C44216h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(C44086o oVar) {
            return C89391z.f203057a;
        }
    }

    public final void setCurrentPaymentId(String str) {
        this.f103110m = str;
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103108k = eVar;
    }

    public final void setPaymentList(List<C44086o> list) {
        this.f103109l = list;
    }

    public final void setPaymentLogger(C44161t tVar) {
        this.f103106i = tVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103107j = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$i */
    static final class C44217i extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44217i f103131a = new C44217i();

        static {
            Covode.recordClassIndex(52529);
        }

        C44217i() {
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

    public final void setMInputType(String str) {
        C89219l.m154721d(str, "");
        this.f103105h = str;
    }

    public final void setOnPaymentMethodIdentify(AbstractC89172b<? super C44086o, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103115r = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103117t = bVar;
    }

    public final void setDelimiterVisible(boolean z) {
        int i;
        View a = mo74090a(R.id.aj_);
        C89219l.m154716b(a, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        a.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$d */
    static final class View$OnClickListenerC44212d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44207c f103125a;

        static {
            Covode.recordClassIndex(52524);
        }

        View$OnClickListenerC44212d(C44207c cVar) {
            this.f103125a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103125a.setMInputType("");
            ((DmtEditText) this.f103125a.mo74090a(R.id.bol)).setText("");
            DmtEditText dmtEditText = (DmtEditText) this.f103125a.mo74090a(R.id.bol);
            dmtEditText.setFocusableInTouchMode(true);
            dmtEditText.requestFocus();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$g */
    static final class C44215g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44207c f103129a;

        static {
            Covode.recordClassIndex(52527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44215g(C44207c cVar) {
            super(1);
            this.f103129a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C44207c cVar = this.f103129a;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) cVar.mo74090a(R.id.dp_);
            C89219l.m154716b(linearLayoutCompat, "");
            int childCount = linearLayoutCompat.getChildCount();
            boolean z = true;
            if (childCount == 0 || !booleanValue) {
                z = false;
            }
            cVar.setDelimiterVisible(z);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$c */
    static final class View$OnClickListenerC44211c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44207c f103124a;

        static {
            Covode.recordClassIndex(52523);
        }

        View$OnClickListenerC44211c(C44207c cVar) {
            this.f103124a = cVar;
        }

        public final void onClick(View view) {
            String str;
            Map<String, Long> map;
            C44161t paymentLogger;
            ClickAgent.onClick(view);
            C44161t paymentLogger2 = this.f103124a.getPaymentLogger();
            if (!(paymentLogger2 == null || (map = paymentLogger2.f102961f) == null || map.containsKey(C44207c.class.getSimpleName()) || (paymentLogger = this.f103124a.getPaymentLogger()) == null)) {
                paymentLogger.mo75012c("card_number");
                paymentLogger.mo75005a(C44207c.class.getSimpleName());
            }
            C44207c.f103100d = true;
            C44209b bVar = this.f103124a.f103103c;
            C89219l.m154721d(bVar, "");
            AbstractC2780d dVar = C2732a.f8145a;
            C44627b bVar2 = C44054a.f102697a;
            if (bVar2 != null) {
                str = bVar2.f104107b;
            } else {
                str = null;
            }
            dVar.mo7361a(str, bVar);
            C44161t paymentLogger3 = this.f103124a.getPaymentLogger();
            if (paymentLogger3 != null) {
                paymentLogger3.mo75008a("card_number_ocr", null, null, C44161t.f102953g, null);
            }
            C44161t paymentLogger4 = this.f103124a.getPaymentLogger();
            if (paymentLogger4 != null) {
                paymentLogger4.mo75005a("ocr_scanning");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44207c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f103104g = new RunnableC44218j(this);
        this.f103105h = "";
        this.f103102b = 1;
        this.f103112o = (int) C13628n.m24520b(context, 4.0f);
        this.f103113p = (int) C13628n.m24520b(context, 25.0f);
        this.f103114q = (int) C13628n.m24520b(context, 16.0f);
        this.f103115r = C44216h.f103130a;
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48961e = C13628n.m24520b(context, 2.0f);
        this.f103116s = aVar.mo34169a();
        this.f103117t = C44217i.f103131a;
        this.f103103c = new C44209b(this);
    }

    /* renamed from: b */
    public final void mo75096b(String str) {
        T t;
        if (str == null) {
            mo75094a(C89086z.INSTANCE);
        } else if (str.length() != 0) {
            List<C44086o> list = this.f103109l;
            String str2 = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f102794a, (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    str2 = t2.f102798e;
                }
            }
            mo75094a(C89070n.m154516a(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0058 A[LOOP:0: B:9:0x0056->B:10:0x0058, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75094a(java.util.List<java.lang.String> r20) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44207c.mo75094a(java.util.List):void");
    }

    public /* synthetic */ C44207c(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$f */
    static final class View$OnFocusChangeListenerC44214f implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C44207c f103128a;

        static {
            Covode.recordClassIndex(52526);
        }

        View$OnFocusChangeListenerC44214f(C44207c cVar) {
            this.f103128a = cVar;
        }

        public final void onFocusChange(View view, boolean z) {
            C44161t paymentLogger;
            if (z) {
                if (!C44207c.f103100d && (paymentLogger = this.f103128a.getPaymentLogger()) != null) {
                    paymentLogger.mo75012c("card_number");
                    paymentLogger.mo75005a(C89204ab.m154669a(this.f103128a.getClass()).mo143613b());
                }
                C44207c.f103100d = false;
                this.f103128a.mo74091a();
                this.f103128a.getOnErrorClear().invoke();
            } else {
                C44161t paymentLogger2 = this.f103128a.getPaymentLogger();
                if (paymentLogger2 != null && !C44207c.f103100d) {
                    paymentLogger2.mo75006a("card_number", paymentLogger2.mo75011b(C89204ab.m154669a(this.f103128a.getClass()).mo143613b()), this.f103128a.getMInputType());
                }
                DmtEditText dmtEditText = (DmtEditText) this.f103128a.mo74090a(R.id.bol);
                C89219l.m154716b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text == null || text.length() == 0) {
                    C44207c cVar = this.f103128a;
                    cVar.mo75094a(cVar.getAllCardIcons());
                }
                String invoke = this.f103128a.getOnVerify().invoke(this.f103128a.getValue());
                if (invoke != null) {
                    this.f103128a.mo74092a(invoke);
                }
            }
            String currentPaymentId = this.f103128a.getCurrentPaymentId();
            if (currentPaymentId == null || currentPaymentId.length() == 0) {
                this.f103128a.mo75094a(C89086z.INSTANCE);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$e */
    public static final class C44213e extends C45564i {

        /* renamed from: a */
        final /* synthetic */ C44207c f103126a;

        /* renamed from: b */
        final /* synthetic */ C44075e f103127b;

        static {
            Covode.recordClassIndex(52525);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45564i
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            C89219l.m154721d(charSequence, "");
            super.onTextChanged(charSequence, i, i2, i3);
            if (TextUtils.isEmpty(charSequence)) {
                this.f103126a.setMInputType("");
            } else if (i2 == 1 || i3 == 1) {
                this.f103126a.setMInputType("normal");
            }
            C2748h a = C2732a.f8145a.mo7357a(this.f103126a.getValue().get(0).getParamValue());
            T t = null;
            if (a != null) {
                str = a.f8265h;
            } else {
                str = null;
            }
            this.f103126a.mo75096b(str);
            if (true ^ C89219l.m154714a((Object) str, (Object) this.f103126a.getCurrentPaymentId())) {
                AbstractC89172b<C44086o, C89391z> onPaymentMethodIdentify = this.f103126a.getOnPaymentMethodIdentify();
                List<C44086o> paymentList = this.f103126a.getPaymentList();
                if (paymentList != null) {
                    Iterator<T> it = paymentList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89219l.m154714a((Object) next.f102794a, (Object) str)) {
                            t = next;
                            break;
                        }
                    }
                }
                onPaymentMethodIdentify.invoke(t);
            }
            this.f103126a.setCurrentPaymentId(str);
            this.f103126a.getOnValueChange().invoke(this.f103126a.getValue());
            if (TextUtils.isEmpty(charSequence)) {
                TuxIconView tuxIconView = (TuxIconView) this.f103126a.mo74090a(R.id.bh8);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                TuxIconView tuxIconView2 = (TuxIconView) this.f103126a.mo74090a(R.id.bh3);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
            } else {
                TuxIconView tuxIconView3 = (TuxIconView) this.f103126a.mo74090a(R.id.bh8);
                C89219l.m154716b(tuxIconView3, "");
                tuxIconView3.setVisibility(8);
                TuxIconView tuxIconView4 = (TuxIconView) this.f103126a.mo74090a(R.id.bh3);
                C89219l.m154716b(tuxIconView4, "");
                tuxIconView4.setVisibility(0);
            }
            if (this.f103126a.getCurrentPaymentId() != null) {
                C44207c cVar = this.f103126a;
                cVar.mo75096b(cVar.getCurrentPaymentId());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44213e(C44207c cVar, C44075e eVar, EditText editText, String str, int i) {
            super(editText, 4, str, i);
            this.f103126a = cVar;
            this.f103127b = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public final void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        int i;
        C44084m mVar;
        String paramValue;
        Integer num;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        super.mo75055a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        this.f103109l = oVar.f102801h;
        mo75095b();
        ((TuxIconView) mo74090a(R.id.bh3)).setOnClickListener(new View$OnClickListenerC44212d(this));
        TextWatcher textWatcher = this.f103111n;
        if (textWatcher != null) {
            ((DmtEditText) mo74090a(R.id.bol)).removeTextChangedListener(textWatcher);
        }
        DmtEditText dmtEditText = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        C44074d dVar = eVar.f102754m;
        if (dVar == null || (num = dVar.f102737a) == null) {
            i = 19;
        } else {
            i = num.intValue();
        }
        this.f103111n = new C44213e(this, eVar, dmtEditText, " ", i);
        ((DmtEditText) mo74090a(R.id.bol)).addTextChangedListener(this.f103111n);
        ((InputWithIndicator) mo74090a(R.id.boj)).setOnEditTextFocusChangeListener(new View$OnFocusChangeListenerC44214f(this));
        ((InputWithIndicator) mo74090a(R.id.boj)).setOnIndicatorVisibleChangeListener(new C44215g(this));
        if (!(list == null || (mVar = (C44084m) C89070n.m154561b((List) list, 0)) == null || (paramValue = mVar.getParamValue()) == null || paramValue.length() == 0)) {
            ((InputWithIndicator) mo74090a(R.id.boj)).setText(paramValue);
        }
        DmtEditText dmtEditText2 = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText2, "");
        dmtEditText2.setImeOptions(6);
        ((TuxIconView) mo74090a(R.id.bh8)).setOnClickListener(new View$OnClickListenerC44211c(this));
    }
}
