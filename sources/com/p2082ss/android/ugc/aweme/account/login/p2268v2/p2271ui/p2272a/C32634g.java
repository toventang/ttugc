package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22409d;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.base.p2243a.DialogC31590a;
import com.p2082ss.android.ugc.aweme.account.experiment.C31657l;
import com.p2082ss.android.ugc.aweme.account.experiment.C31662n;
import com.p2082ss.android.ugc.aweme.account.login.C32821z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g */
public final class C32634g extends AbstractC32613a implements AbstractC2599d {

    /* renamed from: b */
    public static boolean f77840b;

    /* renamed from: c */
    public static final C32635a f77841c = new C32635a((byte) 0);

    /* renamed from: a */
    public long f77842a = System.currentTimeMillis();

    /* renamed from: d */
    private C32783f f77843d;

    /* renamed from: e */
    private HashMap f77844e;

    static {
        Covode.recordClassIndex(39413);
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "PhoneEmailSignUpStep";
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77844e == null) {
            this.f77844e = new HashMap();
        }
        View view = (View) this.f77844e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77844e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hj;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77844e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$a */
    public static final class C32635a {
        static {
            Covode.recordClassIndex(39414);
        }

        private C32635a() {
        }

        public /* synthetic */ C32635a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C31376a m67183a(TuxCheckBox tuxCheckBox) {
            C89219l.m154721d(tuxCheckBox, "");
            C31376a aVar = new C31376a();
            String str = "checked";
            if (C31662n.m65971a()) {
                if (!tuxCheckBox.isChecked()) {
                    str = "unchecked";
                }
                aVar.mo57399a("email_checkbox_status", str);
                aVar.mo57399a("text_type", "short_version");
            } else if (C31662n.m65972b()) {
                if (!tuxCheckBox.isChecked()) {
                    str = "unchecked";
                }
                aVar.mo57399a("email_checkbox_status", str);
                aVar.mo57399a("text_type", "long_version");
            }
            return aVar;
        }

        /* renamed from: a */
        public static void m67184a(Integer num, String str) {
            int i;
            C89219l.m154721d(str, "");
            C31376a a = new C31376a().mo57399a("platform", "email").mo57399a("enter_method", str);
            if (num != null && num.intValue() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            C31376a a2 = a.mo57397a("is_success", i).mo57397a("is_register", 1);
            if (num == null) {
                a2.mo57399a("error_code", "");
            } else {
                a2.mo57397a("error_code", num.intValue());
            }
            C39162r.m79460a("register_click_next_result", a2.f75156a);
        }

        /* renamed from: a */
        public static void m67185a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C39162r.m79460a("show_button_consent_check_box", new C31376a().mo57399a("page_name", str).mo57399a("exp_name", str2).mo57399a("text_type", str3).f75156a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.atm)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.atm)).mo58776a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: f */
    public final void mo58496f() {
        super.mo58496f();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.ato);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(null, null, false, null, null, true, null, false, true, 895);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: u */
    public final void mo58497u() {
        super.mo58497u();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.ato);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$e */
    public static final class C32639e extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C32634g f77848a;

        static {
            Covode.recordClassIndex(39418);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32639e(C32634g gVar) {
            this.f77848a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f77848a.mo57434c(R.id.atq);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f77848a.mo57434c(R.id.atm);
            if (loadingButton != null) {
                boolean z = false;
                if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                    z = true;
                }
                loadingButton.setEnabled(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$f */
    static final class View$OnClickListenerC32640f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32634g f77849a;

        static {
            Covode.recordClassIndex(39419);
        }

        View$OnClickListenerC32640f(C32634g gVar) {
            this.f77849a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C80273bt.m139145a(DialogC31590a.m65889a(this.f77849a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$g */
    static final class View$OnClickListenerC32641g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32634g f77850a;

        static {
            Covode.recordClassIndex(39420);
        }

        View$OnClickListenerC32641g(C32634g gVar) {
            this.f77850a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C80273bt.m139145a(DialogC31590a.m65890b(this.f77850a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$d */
    static final class View$OnClickListenerC32638d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32634g f77847a;

        static {
            Covode.recordClassIndex(39417);
        }

        View$OnClickListenerC32638d(C32634g gVar) {
            this.f77847a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f77847a.mo57434c(R.id.atr);
            C89219l.m154716b(tuxCheckBox, "");
            C31376a a = C32635a.m67183a(tuxCheckBox);
            a.mo57399a("page_name", "email_signup_page");
            a.mo57399a("exp_name", "onboarding_collect_email_consent");
            C39162r.m79460a("click_button_consent_check_box", a.f75156a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$b */
    static final class C32636b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32634g f77845a;

        static {
            Covode.recordClassIndex(39415);
        }

        C32636b(C32634g gVar) {
            this.f77845a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C22409d dVar = (C22409d) obj;
            C32634g gVar = this.f77845a;
            C32582d.m67063a(gVar, ((InputWithIndicator) gVar.mo57434c(R.id.atp)).getText());
            ((InputWithIndicator) this.f77845a.mo57434c(R.id.atp)).getText();
            C89219l.m154716b(dVar, "");
            dVar.mo36739a();
            if (dVar.mo36739a()) {
                C32634g gVar2 = this.f77845a;
                Bundle arguments = gVar2.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", EnumC32594j.EMAIL_PASSWORD_LOGIN.getValue());
                C89219l.m154716b(arguments, "");
                gVar2.mo58461a(arguments);
            } else {
                C32634g gVar3 = this.f77845a;
                Bundle arguments2 = gVar3.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                if (C31657l.m65967a()) {
                    arguments2.putInt("next_page", EnumC32594j.EMAIL_VERIFICATION_WHEN_SIGN_UP.getValue());
                } else {
                    arguments2.putInt("next_page", EnumC32594j.CREATE_PASSWORD_FOR_EMAIL.getValue());
                }
                C89219l.m154716b(arguments2, "");
                gVar3.mo58461a(arguments2);
                if (C31662n.m65972b() || C31662n.m65971a()) {
                    TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f77845a.mo57434c(R.id.atr);
                    C89219l.m154716b(tuxCheckBox, "");
                    z = tuxCheckBox.isChecked();
                } else {
                    z = false;
                }
                C32634g.f77840b = z;
            }
            String x = this.f77845a.mo58467x();
            C89219l.m154716b(x, "");
            C32635a.m67184a(0, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$c */
    static final class View$OnClickListenerC32637c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32634g f77846a;

        static {
            Covode.recordClassIndex(39416);
        }

        View$OnClickListenerC32637c(C32634g gVar) {
            this.f77846a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f77846a.mo57434c(R.id.atr);
            C89219l.m154716b(tuxCheckBox, "");
            C39162r.m79460a("register_click_next", C32635a.m67183a(tuxCheckBox).mo57399a("platform", "email").mo57399a("enter_method", this.f77846a.mo58467x()).mo57398a("stay_time", System.currentTimeMillis() - this.f77846a.f77842a).f75156a);
            String text = ((InputWithIndicator) this.f77846a.mo57434c(R.id.atp)).getText();
            if (TextUtils.isEmpty(text) || !Patterns.EMAIL_ADDRESS.matcher(text).matches()) {
                C32634g gVar = this.f77846a;
                String string = gVar.getString(R.string.apo);
                C89219l.m154716b(string, "");
                gVar.mo57442a(0, string);
                String x = this.f77846a.mo58467x();
                C89219l.m154716b(x, "");
                C32635a.m67184a(null, x);
                return;
            }
            ((InputResultIndicator) this.f77846a.mo57434c(R.id.atq)).mo58481a();
            C32634g gVar2 = this.f77846a;
            String text2 = ((InputWithIndicator) gVar2.mo57434c(R.id.atp)).getText();
            EnumC32592i iVar = EnumC32592i.SIGN_UP;
            EnumC32594j Z_ = gVar2.mo58460Z_();
            C89219l.m154721d(gVar2, "");
            C89219l.m154721d(text2, "");
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(Z_, "");
            AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32544t(iVar, Z_, gVar2, text2)).mo143244b(new C32407x.C32546u(gVar2));
            C89219l.m154716b(b, "");
            C32555z.m67011a(gVar2, b).mo143251d(new C32636b(gVar2)).mo143246c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        ((InputResultIndicator) mo57434c(R.id.atq)).mo58482a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        Context context2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        String str = null;
        if (C31662n.m65971a()) {
            TuxCheckBox tuxCheckBox = (TuxCheckBox) mo57434c(R.id.atr);
            C89219l.m154716b(tuxCheckBox, "");
            tuxCheckBox.setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.au0);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.au0);
            C89219l.m154716b(tuxTextView2, "");
            TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.au0);
            if (!(tuxTextView3 == null || (context2 = tuxTextView3.getContext()) == null)) {
                str = context2.getString(R.string.b4);
            }
            tuxTextView2.setText(str);
            C32635a.m67185a("email_signup_page", "onboarding_collect_email_consent", "short_version");
        } else if (C31662n.m65972b()) {
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) mo57434c(R.id.atr);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox2.setVisibility(0);
            TuxTextView tuxTextView4 = (TuxTextView) mo57434c(R.id.au0);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(0);
            TuxTextView tuxTextView5 = (TuxTextView) mo57434c(R.id.au0);
            C89219l.m154716b(tuxTextView5, "");
            TuxTextView tuxTextView6 = (TuxTextView) mo57434c(R.id.au0);
            if (!(tuxTextView6 == null || (context = tuxTextView6.getContext()) == null)) {
                str = context.getString(R.string.b3);
            }
            tuxTextView5.setText(str);
            C32635a.m67185a("email_signup_page", "onboarding_collect_email_consent", "long_version");
        } else {
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) mo57434c(R.id.atr);
            C89219l.m154716b(tuxCheckBox3, "");
            tuxCheckBox3.setVisibility(8);
            TuxTextView tuxTextView7 = (TuxTextView) mo57434c(R.id.au0);
            C89219l.m154716b(tuxTextView7, "");
            tuxTextView7.setVisibility(8);
        }
        mo58495a(mo57434c(R.id.atm), new View$OnClickListenerC32637c(this));
        mo58495a(mo57434c(R.id.atr), new View$OnClickListenerC32638d(this));
        ((InputWithIndicator) mo57434c(R.id.atp)).setTextWatcher(new C32639e(this));
        C32821z.m67398a(getContext(), (TextView) mo57434c(R.id.atn), new View$OnClickListenerC32640f(this), new View$OnClickListenerC32641g(this), false);
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.ato);
        C89219l.m154716b(recyclerView, "");
        EditText editText = ((InputWithIndicator) mo57434c(R.id.atp)).getEditText();
        String w = mo58466w();
        C89219l.m154716b(w, "");
        String x = mo58467x();
        C89219l.m154716b(x, "");
        this.f77843d = C32783f.C32787c.m67382a(recyclerView, editText, w, x);
        ((InputWithIndicator) mo57434c(R.id.atp)).getEditText().setNextFocusDownId(((InputWithIndicator) mo57434c(R.id.atp)).getEditText().getId());
    }
}
