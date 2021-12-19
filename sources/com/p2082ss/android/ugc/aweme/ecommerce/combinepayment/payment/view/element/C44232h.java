package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.text.Editable;
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
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44074d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h */
public final class C44232h extends AbstractC44228g {

    /* renamed from: b */
    private C44086o f103159b;

    /* renamed from: c */
    private C44075e f103160c;

    /* renamed from: d */
    private TextWatcher f103161d;

    /* renamed from: e */
    private AbstractC89172b<? super Boolean, C89391z> f103162e;

    /* renamed from: g */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103163g;

    /* renamed from: h */
    private String f103164h;

    /* renamed from: i */
    private SparseArray f103165i;

    static {
        Covode.recordClassIndex(52544);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    /* renamed from: a */
    public final View mo74090a(int i) {
        if (this.f103165i == null) {
            this.f103165i = new SparseArray();
        }
        View view = (View) this.f103165i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103165i.put(i, findViewById);
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
        return this.f103160c;
    }

    public final String getMInputMethod() {
        return this.f103164h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final AbstractC89172b<Boolean, C89391z> getOnFocusChange() {
        return this.f103162e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103163g;
    }

    public final C44086o getPaymentMethod() {
        return this.f103159b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g
    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo74090a(R.id.boj);
        C89219l.m154716b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        Integer num;
        String str;
        String str2;
        C44074d dVar;
        String str3;
        DmtEditText dmtEditText = (DmtEditText) mo74090a(R.id.bol);
        String str4 = "";
        C89219l.m154716b(dmtEditText, str4);
        String valueOf = String.valueOf(dmtEditText.getText());
        C44075e elementDTO = getElementDTO();
        Boolean bool = null;
        if (elementDTO != null) {
            num = elementDTO.f102744c;
        } else {
            num = null;
        }
        int ordinal = EnumC44227f.CPF.ordinal();
        if (num != null && num.intValue() == ordinal) {
            valueOf = C89361p.m154869a(C89361p.m154869a(valueOf, ".", str4, false), "-", str4, false);
        }
        if (valueOf.length() > 0) {
            StringBuilder sb = new StringBuilder();
            C44075e elementDTO2 = getElementDTO();
            if (!(elementDTO2 == null || (dVar = elementDTO2.f102754m) == null || (str3 = dVar.f102740d) == null)) {
                str4 = str3;
            }
            str4 = sb.append(str4).append(valueOf).toString();
        }
        C44075e elementDTO3 = getElementDTO();
        if (elementDTO3 != null) {
            str = elementDTO3.f102742a;
        } else {
            str = null;
        }
        C44075e elementDTO4 = getElementDTO();
        if (elementDTO4 != null) {
            str2 = elementDTO4.f102747f;
        } else {
            str2 = null;
        }
        C44075e elementDTO5 = getElementDTO();
        if (elementDTO5 != null) {
            bool = elementDTO5.f102752k;
        }
        return C89070n.m154516a(new C44084m(str, str2, str4, bool, null, 16, null));
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103160c = eVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103159b = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h$e */
    public static final class C44237e extends C45571l {

        /* renamed from: a */
        final /* synthetic */ C44232h f103174a;

        static {
            Covode.recordClassIndex(52549);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44237e(C44232h hVar) {
            this.f103174a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            super.onTextChanged(charSequence, i, i2, i3);
            this.f103174a.getOnValueChange().invoke(this.f103174a.getValue());
            C44232h hVar = this.f103174a;
            if (TextUtils.isEmpty(charSequence)) {
                str = "";
            } else {
                str = "normal";
            }
            hVar.setMInputMethod(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h$f */
    static final class C44238f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        public static final C44238f f103175a = new C44238f();

        static {
            Covode.recordClassIndex(52550);
        }

        C44238f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h$g */
    static final class C44239g extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44239g f103176a = new C44239g();

        static {
            Covode.recordClassIndex(52551);
        }

        C44239g() {
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

    public final void setMInputMethod(String str) {
        C89219l.m154721d(str, "");
        this.f103164h = str;
    }

    public final void setOnFocusChange(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103162e = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103163g = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h$a */
    public static class C44233a implements TextWatcher {

        /* renamed from: a */
        private final EditText f103166a;

        /* renamed from: b */
        private final int f103167b;

        /* renamed from: c */
        private final List<String> f103168c;

        /* renamed from: d */
        private final int f103169d;

        static {
            Covode.recordClassIndex(52545);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        private C44233a(EditText editText) {
            C89219l.m154721d(editText, "");
            this.f103166a = editText;
            this.f103167b = 3;
            this.f103168c = C89070n.m154522b(".", "-");
            this.f103169d = 14;
        }

        public void afterTextChanged(Editable editable) {
            C89219l.m154721d(editable, "");
            if (this.f103167b > 0) {
                String obj = editable.toString();
                int selectionStart = this.f103166a.getSelectionStart();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                int i = 0;
                String substring = obj.substring(0, selectionStart);
                C89219l.m154716b(substring, "");
                int length = C89361p.m154868a(C89361p.m154868a(substring, this.f103168c.get(0), ""), this.f103168c.get(1), "").length();
                StringBuilder sb = new StringBuilder();
                int length2 = obj.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt = obj.charAt(i3);
                    if (!(charAt == this.f103168c.get(0).charAt(0) || charAt == this.f103168c.get(1).charAt(0))) {
                        sb.append(charAt);
                        if ((sb.length() - i2) % this.f103167b == 0) {
                            if (i2 >= 2) {
                                sb.append(this.f103168c.get(1));
                            } else {
                                sb.append(this.f103168c.get(0));
                            }
                            i2++;
                        }
                    }
                }
                int lastIndexOf = sb.lastIndexOf(this.f103168c.get(0));
                int lastIndexOf2 = sb.lastIndexOf(this.f103168c.get(1));
                if (lastIndexOf2 > lastIndexOf) {
                    lastIndexOf = lastIndexOf2;
                }
                if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
                    sb.deleteCharAt(lastIndexOf);
                }
                String sb2 = sb.toString();
                if (sb2.length() > this.f103169d) {
                    C89219l.m154716b(sb2, "");
                    int i4 = this.f103169d;
                    Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
                    sb2 = sb2.substring(0, i4);
                    C89219l.m154716b(sb2, "");
                } else {
                    C89219l.m154716b(sb2, "");
                }
                int i5 = this.f103167b;
                int i6 = ((length / i5) * (i5 + 1)) + (length % i5);
                if (i6 % (i5 + 1) == 0) {
                    i6--;
                }
                int length3 = sb2.length();
                if (i6 >= 0) {
                    i = i6;
                }
                if (i <= length3) {
                    length3 = i;
                }
                if (!C89219l.m154714a((Object) sb2, (Object) obj)) {
                    this.f103166a.setText(sb2);
                }
                this.f103166a.setSelection(length3);
            }
        }

        public /* synthetic */ C44233a(EditText editText, byte b) {
            this(editText);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h$b */
    static final class View$OnClickListenerC44234b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103170a;

        /* renamed from: b */
        final /* synthetic */ C44232h f103171b;

        static {
            Covode.recordClassIndex(52546);
        }

        View$OnClickListenerC44234b(String str, C44232h hVar) {
            this.f103170a = str;
            this.f103171b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f103171b.getContext(), this.f103170a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44232h(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f103162e = C44238f.f103175a;
        this.f103163g = C44239g.f103176a;
        this.f103164h = "";
    }

    public /* synthetic */ C44232h(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h$d */
    public static final class C44236d extends C44233a {

        /* renamed from: a */
        final /* synthetic */ C44232h f103173a;

        static {
            Covode.recordClassIndex(52548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44236d(C44232h hVar, EditText editText) {
            super(editText, (byte) 0);
            this.f103173a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44232h.C44233a
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str = "";
            C89219l.m154721d(charSequence, str);
            this.f103173a.getOnValueChange().invoke(this.f103173a.getValue());
            C44232h hVar = this.f103173a;
            if (!TextUtils.isEmpty(charSequence)) {
                str = "normal";
            }
            hVar.setMInputMethod(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h$c */
    static final class View$OnFocusChangeListenerC44235c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C44232h f103172a;

        static {
            Covode.recordClassIndex(52547);
        }

        View$OnFocusChangeListenerC44235c(C44232h hVar) {
            this.f103172a = hVar;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f103172a.getOnFocusChange().invoke(Boolean.valueOf(z));
            if (z) {
                this.f103172a.mo74091a();
                this.f103172a.getOnErrorClear().invoke();
                return;
            }
            String invoke = this.f103172a.getOnVerify().invoke(this.f103172a.getValue());
            if (invoke != null) {
                this.f103172a.mo74092a(invoke);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public final void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        TextWatcher dVar;
        boolean z;
        String str;
        String str2;
        String str3;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        super.mo75055a(eVar, oVar, list, obj);
        setElementDTO(eVar);
        setPaymentMethod(oVar);
        DmtEditText dmtEditText = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        dmtEditText.setTag(eVar.f102744c);
        ((InputWithIndicator) mo74090a(R.id.boj)).setOnEditTextFocusChangeListener(new View$OnFocusChangeListenerC44235c(this));
        TextWatcher textWatcher = this.f103161d;
        if (textWatcher != null) {
            ((DmtEditText) mo74090a(R.id.bol)).removeTextChangedListener(textWatcher);
        }
        Integer num = eVar.f102744c;
        int ordinal = EnumC44227f.CPF.ordinal();
        if (num != null && num.intValue() == ordinal) {
            DmtEditText dmtEditText2 = (DmtEditText) mo74090a(R.id.bol);
            C89219l.m154716b(dmtEditText2, "");
            dVar = new C44236d(this, dmtEditText2);
        } else {
            dVar = new C44237e(this);
        }
        this.f103161d = dVar;
        ((DmtEditText) mo74090a(R.id.bol)).addTextChangedListener(this.f103161d);
        boolean z2 = true;
        String str4 = null;
        if (list != null) {
            C44074d dVar2 = eVar.f102754m;
            if (dVar2 != null) {
                str2 = dVar2.f102740d;
            } else {
                str2 = null;
            }
            C44084m mVar = (C44084m) C89070n.m154561b((List) list, 0);
            if (mVar == null || (str3 = mVar.getParamValue()) == null) {
                str3 = "";
            }
            if (!(str2 == null || str2.length() == 0)) {
                str3 = C89361p.m154873b(str3, str2, "", false);
            }
            ((InputWithIndicator) mo74090a(R.id.boj)).setText(str3);
        }
        String str5 = eVar.f102753l;
        if (!C80538hl.m139614a(str5)) {
            str5 = null;
        }
        if (str5 != null) {
            View a = mo74090a(R.id.aj_);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) mo74090a(R.id.bh1)).setOnClickListener(new View$OnClickListenerC44234b(str5, this));
        } else {
            View a2 = mo74090a(R.id.aj_);
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        String str6 = eVar.f102755n;
        if (str6 == null || str6.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
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
        C44074d dVar3 = eVar.f102754m;
        if (!(dVar3 == null || (str = dVar3.f102740d) == null || str.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            TuxTextView tuxTextView4 = (TuxTextView) mo74090a(R.id.d5b);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(0);
            TuxTextView tuxTextView5 = (TuxTextView) mo74090a(R.id.d5b);
            C89219l.m154716b(tuxTextView5, "");
            C44074d dVar4 = eVar.f102754m;
            if (dVar4 != null) {
                str4 = dVar4.f102740d;
            }
            tuxTextView5.setText(str4);
        } else {
            TuxTextView tuxTextView6 = (TuxTextView) mo74090a(R.id.d5b);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setVisibility(8);
        }
        DmtEditText dmtEditText3 = (DmtEditText) mo74090a(R.id.bol);
        C89219l.m154716b(dmtEditText3, "");
        dmtEditText3.setImeOptions(6);
    }
}
