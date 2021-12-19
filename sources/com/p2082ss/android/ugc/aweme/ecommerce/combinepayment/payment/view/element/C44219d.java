package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44161t;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44074d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45564i;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d */
public final class C44219d extends AbstractC44228g {

    /* renamed from: b */
    private C44086o f103133b;

    /* renamed from: c */
    private C44075e f103134c;

    /* renamed from: d */
    private TextWatcher f103135d;

    /* renamed from: e */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103136e;

    /* renamed from: g */
    private String f103137g;

    /* renamed from: h */
    private C44161t f103138h;

    /* renamed from: i */
    private SparseArray f103139i;

    static {
        Covode.recordClassIndex(52531);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    /* renamed from: a */
    public final View mo74090a(int i) {
        if (this.f103139i == null) {
            this.f103139i = new SparseArray();
        }
        View view = (View) this.f103139i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103139i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getContentViewLayoutId() {
        return R.layout.p8;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getFooterViewLayoutId() {
        return R.layout.p9;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103134c;
    }

    public final String getMInputType() {
        return this.f103137g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103136e;
    }

    public final C44161t getPaymentLogger() {
        return this.f103138h;
    }

    public final C44086o getPaymentMethod() {
        return this.f103133b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g
    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo74090a(R.id.boj);
        C89219l.m154716b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        T t;
        T t2;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        List<C44075e> list;
        T t3;
        List<C44075e> list2;
        T t4;
        DmtEditText dmtEditText = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        List<String> b = C89361p.m154915b(String.valueOf(dmtEditText.getText()), new String[]{"/"});
        String str5 = (String) C89070n.m154561b((List) b, 0);
        String str6 = (String) C89070n.m154561b((List) b, 1);
        C44075e elementDTO = getElementDTO();
        Boolean bool2 = null;
        if (elementDTO == null || (list2 = elementDTO.f102750i) == null) {
            t = null;
        } else {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t4 = null;
                    break;
                }
                t4 = it.next();
                if (C89219l.m154714a((Object) t4.f102742a, (Object) "eg_ccdc_global_expiration_month")) {
                    break;
                }
            }
            t = t4;
        }
        C44075e elementDTO2 = getElementDTO();
        if (elementDTO2 == null || (list = elementDTO2.f102750i) == null) {
            t2 = null;
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it2.next();
                if (C89219l.m154714a((Object) t3.f102742a, (Object) "eg_ccdc_global_expiration_year")) {
                    break;
                }
            }
            t2 = t3;
        }
        C44084m[] mVarArr = new C44084m[2];
        if (t != null) {
            str = t.f102742a;
            str2 = t.f102747f;
            bool = t.f102752k;
        } else {
            str = null;
            str2 = null;
            bool = null;
        }
        mVarArr[0] = new C44084m(str, str2, str5, bool, null, 16, null);
        if (t2 != null) {
            str3 = t2.f102742a;
            str4 = t2.f102747f;
            bool2 = t2.f102752k;
        } else {
            str3 = null;
            str4 = null;
        }
        mVarArr[1] = new C44084m(str3, str4, str6, bool2, null, 16, null);
        return C89070n.m154522b(mVarArr);
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103134c = eVar;
    }

    public final void setPaymentLogger(C44161t tVar) {
        this.f103138h = tVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103133b = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d$d */
    static final class C44223d extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C44223d f103145a = new C44223d();

        static {
            Covode.recordClassIndex(52535);
        }

        C44223d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d$e */
    static final class C44224e extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44224e f103146a = new C44224e();

        static {
            Covode.recordClassIndex(52536);
        }

        C44224e() {
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
        this.f103137g = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103136e = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d$a */
    static final class View$OnClickListenerC44220a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103140a;

        /* renamed from: b */
        final /* synthetic */ C44219d f103141b;

        static {
            Covode.recordClassIndex(52532);
        }

        View$OnClickListenerC44220a(String str, C44219d dVar) {
            this.f103140a = str;
            this.f103141b = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f103141b.getContext(), this.f103140a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44219d(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f103136e = C44224e.f103146a;
        this.f103137g = "";
        ((InputWithIndicator) mo74090a(R.id.boj)).setInputType(2);
    }

    public /* synthetic */ C44219d(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d$c */
    static final class View$OnFocusChangeListenerC44222c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C44219d f103143a;

        /* renamed from: b */
        final /* synthetic */ C44075e f103144b;

        static {
            Covode.recordClassIndex(52534);
        }

        View$OnFocusChangeListenerC44222c(C44219d dVar, C44075e eVar) {
            this.f103143a = dVar;
            this.f103144b = eVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f103143a.mo74091a();
                this.f103143a.getOnErrorClear().invoke();
                C44161t paymentLogger = this.f103143a.getPaymentLogger();
                if (paymentLogger != null) {
                    paymentLogger.mo75012c(C44161t.m86945d(this.f103144b.f102747f));
                    paymentLogger.mo75005a(C89204ab.m154669a(PaymentAdapter.DateElementViewHolder.class).mo143613b());
                    return;
                }
                return;
            }
            String invoke = this.f103143a.getOnVerify().invoke(this.f103143a.getValue());
            if (invoke != null) {
                this.f103143a.mo74092a(invoke);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d$b */
    public static final class C44221b extends C45564i {

        /* renamed from: a */
        final /* synthetic */ C44219d f103142a;

        static {
            Covode.recordClassIndex(52533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44221b(C44219d dVar, EditText editText, String str) {
            super(editText, 2, str, 4);
            this.f103142a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45564i
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            super.onTextChanged(charSequence, i, i2, i3);
            this.f103142a.getOnValueChange().invoke(this.f103142a.getValue());
            if (TextUtils.isEmpty(charSequence)) {
                this.f103142a.setMInputType("");
            } else {
                this.f103142a.setMInputType("normal");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public final void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        int inputType;
        int i;
        boolean z;
        Integer num;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        super.mo75055a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        String str = eVar.f102753l;
        Integer num2 = null;
        if (!C80538hl.m139614a(str)) {
            str = null;
        }
        if (str != null) {
            View a = mo74090a(R.id.aj_);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) mo74090a(R.id.bh1)).setOnClickListener(new View$OnClickListenerC44220a(str, this));
        } else {
            View a2 = mo74090a(R.id.aj_);
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo74090a(R.id.boj);
        C44074d dVar = eVar.f102754m;
        if (dVar != null) {
            num2 = dVar.f102738b;
        }
        int ordinal = EnumC44275n.NUMBER.ordinal();
        if (num2 != null && num2.intValue() == ordinal) {
            inputType = ((InputWithIndicator) mo74090a(R.id.boj)).getInputType() | 2;
        } else {
            int ordinal2 = EnumC44275n.PHONE.ordinal();
            if (num2 != null && num2.intValue() == ordinal2) {
                inputType = ((InputWithIndicator) mo74090a(R.id.boj)).getInputType() | 3;
            } else {
                inputType = ((InputWithIndicator) mo74090a(R.id.boj)).getInputType();
            }
        }
        inputWithIndicator.setInputType(inputType);
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo74090a(R.id.boj);
        C44074d dVar2 = eVar.f102754m;
        int i2 = Integer.MAX_VALUE;
        if (dVar2 == null || (num = dVar2.f102737a) == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = num.intValue();
        }
        inputWithIndicator2.setMaxLength(i);
        C44074d dVar3 = eVar.f102754m;
        boolean z2 = true;
        if (dVar3 == null || !dVar3.f102739c) {
            z = false;
        } else {
            z = true;
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo74090a(R.id.boj);
        if (!z) {
            i2 = 1;
        }
        inputWithIndicator3.setMaxLines(i2);
        if (z) {
            ((InputWithIndicator) mo74090a(R.id.boj)).setInputType(((InputWithIndicator) mo74090a(R.id.boj)).getInputType() | 131072);
        }
        String str2 = eVar.f102755n;
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            TuxTextView tuxTextView = (TuxTextView) mo74090a(R.id.eih);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) mo74090a(R.id.eih);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(eVar.f102755n);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) mo74090a(R.id.eih);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
        TextWatcher textWatcher = this.f103135d;
        if (textWatcher != null) {
            ((DmtEditText) mo74090a(R.id.bol)).removeTextChangedListener(textWatcher);
        }
        DmtEditText dmtEditText = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        this.f103135d = new C44221b(this, dmtEditText, "/");
        ((DmtEditText) mo74090a(R.id.bol)).addTextChangedListener(this.f103135d);
        ((InputWithIndicator) mo74090a(R.id.boj)).setOnEditTextFocusChangeListener(new View$OnFocusChangeListenerC44222c(this, eVar));
        if (list != null) {
            InputWithIndicator inputWithIndicator4 = (InputWithIndicator) mo74090a(R.id.boj);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String paramValue = it.next().getParamValue();
                if (paramValue != null) {
                    arrayList.add(paramValue);
                }
            }
            inputWithIndicator4.setText(C89070n.m154551a(arrayList, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C44223d.f103145a, 30));
        }
        DmtEditText dmtEditText2 = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText2, "");
        dmtEditText2.setImeOptions(6);
    }
}
