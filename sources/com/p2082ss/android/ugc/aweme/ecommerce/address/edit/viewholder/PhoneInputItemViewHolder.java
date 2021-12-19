package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43478j;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder */
public final class PhoneInputItemViewHolder extends JediSimpleViewHolder<C43340a> implements AbstractC33974au {

    /* renamed from: k */
    public static final C43493b f101423k = new C43493b((byte) 0);

    /* renamed from: f */
    public final CandHelper f101424f;

    /* renamed from: g */
    public long f101425g = -1;

    /* renamed from: j */
    public int f101426j;

    /* renamed from: l */
    private final AbstractC89244h f101427l;

    /* renamed from: m */
    private TextWatcher f101428m;

    static {
        Covode.recordClassIndex(51722);
    }

    /* renamed from: m */
    public final AddressEditViewModel mo63351m() {
        return (AddressEditViewModel) this.f101427l.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$b */
    public static final class C43493b {
        static {
            Covode.recordClassIndex(51724);
        }

        private C43493b() {
        }

        public /* synthetic */ C43493b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$d */
    static final class C43495d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ InputItem f101435a;

        /* renamed from: b */
        final /* synthetic */ PhoneInputItemViewHolder f101436b;

        /* renamed from: c */
        final /* synthetic */ C43340a f101437c;

        static {
            Covode.recordClassIndex(51726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43495d(InputItem inputItem, PhoneInputItemViewHolder phoneInputItemViewHolder, C43340a aVar) {
            super(0);
            this.f101435a = inputItem;
            this.f101436b = phoneInputItemViewHolder;
            this.f101437c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f101437c.f101149b = ((PhoneInputView) this.f101435a.mo74090a(R.id.d1e)).getFullPhoneNumber();
            return C89391z.f203057a;
        }
    }

    /* renamed from: n */
    public final void mo70807n() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (C89361p.m154908a((CharSequence) ((PhoneInputView) view.findViewById(R.id.d1e)).getFullPhoneNumber().getSecond(), (CharSequence) "*", false)) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            ((PhoneInputView) view2.findViewById(R.id.d1e)).setPhoneNumber("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$a */
    public static final class C43492a extends AbstractC89220m implements AbstractC89171a<AddressEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f101429a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f101430b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f101431c;

        static {
            Covode.recordClassIndex(51723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43492a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f101429a = jediViewHolder;
            this.f101430b = cVar;
            this.f101431c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder.C43492a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_PhoneInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86552xfa4c5b0b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$e */
    static final class View$OnClickListenerC43496e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneInputItemViewHolder f101438a;

        /* renamed from: b */
        final /* synthetic */ C43340a f101439b;

        static {
            Covode.recordClassIndex(51727);
        }

        View$OnClickListenerC43496e(PhoneInputItemViewHolder phoneInputItemViewHolder, C43340a aVar) {
            this.f101438a = phoneInputItemViewHolder;
            this.f101439b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101438a.mo70807n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$g */
    static final class View$OnClickListenerC43498g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneInputItemViewHolder f101443a;

        /* renamed from: b */
        final /* synthetic */ C43340a f101444b;

        static {
            Covode.recordClassIndex(51729);
        }

        View$OnClickListenerC43498g(PhoneInputItemViewHolder phoneInputItemViewHolder, C43340a aVar) {
            this.f101443a = phoneInputItemViewHolder;
            this.f101444b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C43478j jVar = this.f101443a.mo63351m().f101255l;
            if (jVar != null) {
                jVar.mo74000c(this.f101444b.f101148a.f101199d);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PhoneInputItemViewHolder(android.view.ViewGroup r6) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r4)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558946(0x7f0d0222, float:1.8743222E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)
            r5.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$a
            r0.<init>(r5, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r5.f101427l = r0
            com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper r3 = new com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper
            android.content.Context r2 = r6.getContext()
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r4)
            android.view.View r1 = r5.itemView
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)
            r0 = 2131366945(0x7f0a1421, float:1.8353798E38)
            android.view.View r0 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView r0 = (com.p2082ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView) r0
            android.widget.EditText r0 = r0.getEditText()
            r3.<init>(r2, r0)
            r5.f101424f = r3
            r0 = -1
            r5.f101425g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43340a aVar) {
        C43340a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        this.f101424f.mo73864a(mo63351m(), aVar2.f101148a.f101199d);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        PhoneInputView phoneInputView = (PhoneInputView) view.findViewById(R.id.d1e);
        C89219l.m154716b(phoneInputView, "");
        ((InputWithIndicator) phoneInputView.mo74065a(R.id.aff)).setIndicatorClickListener(new View$OnClickListenerC43498g(this, aVar2));
        View view2 = this.itemView;
        Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
        InputItem inputItem = (InputItem) view2;
        TextWatcher textWatcher = this.f101428m;
        if (textWatcher != null) {
            PhoneInputView phoneInputView2 = (PhoneInputView) inputItem.mo74090a(R.id.d1e);
            C89219l.m154716b(phoneInputView2, "");
            ((InputWithIndicator) phoneInputView2.mo74065a(R.id.aff)).getEditText().removeTextChangedListener(textWatcher);
        }
        inputItem.setTitle(aVar2.f101148a.f101202g);
        ((PhoneInputView) inputItem.mo74090a(R.id.d1e)).setHint(aVar2.f101148a.f101198c);
        PhoneInputView phoneInputView3 = (PhoneInputView) inputItem.mo74090a(R.id.d1e);
        Object obj = aVar2.f101149b;
        if (!(obj instanceof C89378p)) {
            obj = null;
        }
        phoneInputView3.setFullPhoneNumber((C89378p) obj);
        String str = aVar2.f101150c;
        if (str != null) {
            inputItem.mo74092a(str);
        } else {
            inputItem.mo74091a();
        }
        if (C89219l.m154714a((Object) this.f101424f.f101161d, (Object) "sug")) {
            PhoneInputView phoneInputView4 = (PhoneInputView) inputItem.mo74090a(R.id.d1e);
            C89219l.m154716b(phoneInputView4, "");
            this.f101426j = ((InputWithIndicator) phoneInputView4.mo74065a(R.id.aff)).getEditText().getText().length();
        }
        this.f101428m = new C43494c(inputItem, this, aVar2);
        PhoneInputView phoneInputView5 = (PhoneInputView) inputItem.mo74090a(R.id.d1e);
        C89219l.m154716b(phoneInputView5, "");
        ((InputWithIndicator) phoneInputView5.mo74065a(R.id.aff)).getEditText().addTextChangedListener(this.f101428m);
        ((PhoneInputView) inputItem.mo74090a(R.id.d1e)).setOnCountryCodeChangeListener(new C43495d(inputItem, this, aVar2));
        ((PhoneInputView) inputItem.mo74090a(R.id.d1e)).setOnCountryCodeClickListener(new View$OnClickListenerC43496e(this, aVar2));
        PhoneInputView phoneInputView6 = (PhoneInputView) inputItem.mo74090a(R.id.d1e);
        C89219l.m154716b(phoneInputView6, "");
        ((InputWithIndicator) phoneInputView6.mo74065a(R.id.aff)).setOnEditTextFocusChangeListener(new View$OnFocusChangeListenerC43497f(inputItem, this, aVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$f */
    static final class View$OnFocusChangeListenerC43497f implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ InputItem f101440a;

        /* renamed from: b */
        final /* synthetic */ PhoneInputItemViewHolder f101441b;

        /* renamed from: c */
        final /* synthetic */ C43340a f101442c;

        static {
            Covode.recordClassIndex(51728);
        }

        View$OnFocusChangeListenerC43497f(InputItem inputItem, PhoneInputItemViewHolder phoneInputItemViewHolder, C43340a aVar) {
            this.f101440a = inputItem;
            this.f101441b = phoneInputItemViewHolder;
            this.f101442c = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                PhoneInputItemViewHolder phoneInputItemViewHolder = this.f101441b;
                PhoneInputView phoneInputView = (PhoneInputView) this.f101440a.mo74090a(R.id.d1e);
                C89219l.m154716b(phoneInputView, "");
                phoneInputItemViewHolder.f101426j = ((InputWithIndicator) phoneInputView.mo74065a(R.id.aff)).getEditText().getText().length();
                this.f101441b.f101425g = SystemClock.elapsedRealtime();
                C43478j jVar = this.f101441b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.mo73995a(this.f101442c.f101148a.f101199d);
                }
                if (this.f101442c.f101149b == null) {
                    this.f101442c.f101149b = ((PhoneInputView) this.f101440a.mo74090a(R.id.d1e)).getFullPhoneNumber();
                }
                CandHelper candHelper = this.f101441b.f101424f;
                View view2 = this.f101441b.itemView;
                C89219l.m154716b(view2, "");
                candHelper.mo73863a(((PhoneInputView) view2.findViewById(R.id.d1e)).getEditText(), this.f101442c.f101148a.f101199d, this.f101441b.mo63351m());
                this.f101441b.mo70807n();
                this.f101440a.mo74091a();
                this.f101442c.f101150c = null;
                return;
            }
            PhoneInputView phoneInputView2 = (PhoneInputView) this.f101440a.mo74090a(R.id.d1e);
            C89219l.m154716b(phoneInputView2, "");
            PhoneInputView phoneInputView3 = (PhoneInputView) this.f101440a.mo74090a(R.id.d1e);
            C89219l.m154716b(phoneInputView3, "");
            ((InputWithIndicator) phoneInputView2.mo74065a(R.id.aff)).setText(((InputWithIndicator) phoneInputView3.mo74065a(R.id.aff)).getText());
            this.f101441b.mo63351m();
            String a = AddressEditViewModel.m86484a(this.f101442c.f101148a.f101204i, this.f101442c.f101149b);
            if (a != null) {
                this.f101440a.mo74092a(a);
                this.f101442c.f101150c = a;
            }
            this.f101441b.f101424f.mo73865b(this.f101441b.mo63351m(), this.f101442c.f101148a.f101199d);
            PhoneInputView phoneInputView4 = (PhoneInputView) this.f101440a.mo74090a(R.id.d1e);
            C89219l.m154716b(phoneInputView4, "");
            int length = ((InputWithIndicator) phoneInputView4.mo74065a(R.id.aff)).getEditText().getText().length() - this.f101441b.f101426j;
            if (length == 0) {
                if (!C89219l.m154714a((Object) this.f101441b.f101424f.f101161d, (Object) "sug")) {
                    this.f101441b.f101424f.f101161d = "";
                }
            } else if (length > 0) {
                this.f101441b.f101424f.f101161d = "add";
            } else {
                this.f101441b.f101424f.f101161d = "del";
            }
            if (this.f101441b.f101425g != -1) {
                C43478j jVar2 = this.f101441b.mo63351m().f101255l;
                if (jVar2 != null) {
                    jVar2.mo73996a(this.f101442c.f101148a.f101199d, SystemClock.elapsedRealtime() - this.f101441b.f101425g, this.f101441b.f101424f.f101161d);
                }
                this.f101441b.f101425g = -1;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$c */
    public static final class C43494c extends C45571l {

        /* renamed from: a */
        final /* synthetic */ InputItem f101432a;

        /* renamed from: b */
        final /* synthetic */ PhoneInputItemViewHolder f101433b;

        /* renamed from: c */
        final /* synthetic */ C43340a f101434c;

        static {
            Covode.recordClassIndex(51725);
        }

        C43494c(InputItem inputItem, PhoneInputItemViewHolder phoneInputItemViewHolder, C43340a aVar) {
            this.f101432a = inputItem;
            this.f101433b = phoneInputItemViewHolder;
            this.f101434c = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            if (charSequence != null) {
                C89378p<String, String> fullPhoneNumber = ((PhoneInputView) this.f101432a.mo74090a(R.id.d1e)).getFullPhoneNumber();
                String second = fullPhoneNumber.getSecond();
                Object obj = this.f101434c.f101149b;
                Object obj2 = null;
                if (!(obj instanceof C89378p)) {
                    obj = null;
                }
                C89378p pVar = (C89378p) obj;
                if (pVar != null) {
                    obj2 = pVar.getSecond();
                }
                if (!C89219l.m154714a((Object) second, obj2)) {
                    this.f101433b.mo63351m().f101251e = true;
                }
                this.f101434c.f101149b = fullPhoneNumber;
            }
            if (this.f101433b.f101424f.f101160c == 0) {
                this.f101433b.f101424f.f101160c = 1;
                this.f101433b.f101424f.mo73865b(this.f101433b.mo63351m(), this.f101434c.f101148a.f101199d);
                return;
            }
            CandHelper candHelper = this.f101433b.f101424f;
            View view = this.f101433b.itemView;
            C89219l.m154716b(view, "");
            candHelper.mo73863a(((PhoneInputView) view.findViewById(R.id.d1e)).getEditText(), this.f101434c.f101148a.f101199d, this.f101433b.mo63351m());
        }
    }
}
