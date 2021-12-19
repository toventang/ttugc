package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j */
public final class C44253j extends AbstractC44228g {

    /* renamed from: b */
    private C44086o f103200b;

    /* renamed from: c */
    private C44075e f103201c;

    /* renamed from: d */
    private TextWatcher f103202d;

    /* renamed from: e */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103203e;

    /* renamed from: g */
    private PhoneInputView f103204g;

    /* renamed from: h */
    private final int f103205h;

    /* renamed from: i */
    private SparseArray f103206i;

    static {
        Covode.recordClassIndex(52565);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    /* renamed from: a */
    public final View mo74090a(int i) {
        if (this.f103206i == null) {
            this.f103206i = new SparseArray();
        }
        View view = (View) this.f103206i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103206i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103201c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103203e;
    }

    public final C44086o getPaymentMethod() {
        return this.f103200b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g
    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo74090a(R.id.aff);
        C89219l.m154716b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final View getContentView() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        PhoneInputView phoneInputView = new PhoneInputView(context, (AttributeSet) null, 6);
        phoneInputView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C23163i.m43660a((View) phoneInputView.getEditText(), (Integer) null, Integer.valueOf(this.f103205h), (Integer) null, Integer.valueOf(this.f103205h), false, 21);
        this.f103204g = phoneInputView;
        return phoneInputView;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        PhoneInputView.C43583b bVar;
        C44075e eVar;
        C44075e eVar2;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        List<C44075e> list;
        List<C44075e> list2;
        PhoneInputView phoneInputView = this.f103204g;
        Boolean bool2 = null;
        if (phoneInputView != null) {
            bVar = phoneInputView.getPhoneModel();
        } else {
            bVar = null;
        }
        C44075e elementDTO = getElementDTO();
        if (elementDTO == null || (list2 = elementDTO.f102750i) == null) {
            eVar = null;
        } else {
            eVar = (C44075e) C89070n.m154561b((List) list2, 0);
        }
        C44075e elementDTO2 = getElementDTO();
        if (elementDTO2 == null || (list = elementDTO2.f102750i) == null) {
            eVar2 = null;
        } else {
            eVar2 = (C44075e) C89070n.m154561b((List) list, 1);
        }
        C44084m[] mVarArr = new C44084m[3];
        if (bVar != null) {
            str = bVar.f101617a;
        } else {
            str = null;
        }
        mVarArr[0] = new C44084m(null, null, str, null, null, 24, null);
        if (eVar2 != null) {
            str2 = eVar2.f102742a;
            str3 = eVar2.f102747f;
        } else {
            str2 = null;
            str3 = null;
        }
        StringBuilder sb = new StringBuilder("+");
        if (bVar != null) {
            str4 = bVar.f101618b;
        } else {
            str4 = null;
        }
        String sb2 = sb.append(str4).toString();
        if (eVar2 != null) {
            bool = eVar2.f102752k;
        } else {
            bool = null;
        }
        mVarArr[1] = new C44084m(str2, str3, sb2, bool, null, 16, null);
        if (eVar != null) {
            str5 = eVar.f102742a;
            str6 = eVar.f102747f;
        } else {
            str5 = null;
            str6 = null;
        }
        if (bVar != null) {
            str7 = bVar.f101619c;
        } else {
            str7 = null;
        }
        if (!C80538hl.m139614a(str7)) {
            str7 = null;
        }
        if (eVar != null) {
            bool2 = eVar.f102752k;
        }
        mVarArr[2] = new C44084m(str5, str6, str7, bool2, null, 16, null);
        return C89070n.m154522b(mVarArr);
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103201c = eVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103200b = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j$b */
    public static final class C44255b extends C45571l {

        /* renamed from: a */
        final /* synthetic */ C44253j f103209a;

        static {
            Covode.recordClassIndex(52567);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44255b(C44253j jVar) {
            this.f103209a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f103209a.getOnValueChange().invoke(this.f103209a.getValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j$d */
    static final class C44257d extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44257d f103211a = new C44257d();

        static {
            Covode.recordClassIndex(52569);
        }

        C44257d() {
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

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103203e = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j$a */
    static final class View$OnClickListenerC44254a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103207a;

        /* renamed from: b */
        final /* synthetic */ C44253j f103208b;

        static {
            Covode.recordClassIndex(52566);
        }

        View$OnClickListenerC44254a(String str, C44253j jVar) {
            this.f103207a = str;
            this.f103208b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f103208b.getContext(), this.f103207a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44253j(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f103203e = C44257d.f103211a;
        this.f103205h = (int) C13628n.m24520b(context, 15.0f);
        ((InputWithIndicator) mo74090a(R.id.aff)).setInputType(3);
    }

    public /* synthetic */ C44253j(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j$c */
    static final class View$OnFocusChangeListenerC44256c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C44253j f103210a;

        static {
            Covode.recordClassIndex(52568);
        }

        View$OnFocusChangeListenerC44256c(C44253j jVar) {
            this.f103210a = jVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f103210a.mo74091a();
                this.f103210a.getOnErrorClear().invoke();
                return;
            }
            String invoke = this.f103210a.getOnVerify().invoke(this.f103210a.getValue());
            if (invoke != null) {
                this.f103210a.mo74092a(invoke);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public final void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        String str;
        String str2;
        PhoneInputView phoneInputView;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        super.mo75055a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        String str3 = eVar.f102753l;
        String str4 = null;
        if (!C80538hl.m139614a(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            View a = mo74090a(R.id.aj_);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) mo74090a(R.id.bh1)).setOnClickListener(new View$OnClickListenerC44254a(str3, this));
        } else {
            View a2 = mo74090a(R.id.aj_);
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        ((InputWithIndicator) mo74090a(R.id.aff)).setMaxLines(1);
        TextWatcher textWatcher = this.f103202d;
        if (textWatcher != null) {
            ((DmtEditText) mo74090a(R.id.bol)).removeTextChangedListener(textWatcher);
        }
        this.f103202d = new C44255b(this);
        ((DmtEditText) mo74090a(R.id.bol)).addTextChangedListener(this.f103202d);
        ((InputWithIndicator) mo74090a(R.id.aff)).setOnEditTextFocusChangeListener(new View$OnFocusChangeListenerC44256c(this));
        if (list != null) {
            if (list.size() < 3) {
                PhoneInputView phoneInputView2 = this.f103204g;
                if (phoneInputView2 != null) {
                    phoneInputView2.mo74066a();
                }
                PhoneInputView phoneInputView3 = this.f103204g;
                if (phoneInputView3 != null) {
                    phoneInputView3.setPhoneNumber("");
                }
            } else {
                C44084m mVar = (C44084m) C89070n.m154561b((List) list, 0);
                if (mVar != null) {
                    str = mVar.getParamValue();
                } else {
                    str = null;
                }
                C44084m mVar2 = (C44084m) C89070n.m154561b((List) list, 1);
                if (mVar2 != null) {
                    str2 = mVar2.getParamValue();
                } else {
                    str2 = null;
                }
                C44084m mVar3 = (C44084m) C89070n.m154561b((List) list, 2);
                if (mVar3 != null) {
                    str4 = mVar3.getParamValue();
                }
                if (!(str == null || str2 == null || str4 == null || (phoneInputView = this.f103204g) == null)) {
                    phoneInputView.setPhoneModel(new PhoneInputView.C43583b(str, C89361p.m154868a(str2, "+", ""), str4));
                }
            }
        }
        DmtEditText dmtEditText = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        dmtEditText.setImeOptions(6);
    }
}
