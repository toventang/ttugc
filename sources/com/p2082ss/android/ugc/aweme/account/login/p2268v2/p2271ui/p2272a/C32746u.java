package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.base.p2243a.DialogC31590a;
import com.p2082ss.android.ugc.aweme.account.login.C32821z;
import com.p2082ss.android.ugc.aweme.account.login.p2260e.C31910a;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.login.view.DialogC32810a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32868n;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.p2280ui.PhoneInputView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u */
public final class C32746u extends AbstractC32613a implements AbstractC2599d {

    /* renamed from: c */
    public static final C32747a f78036c = new C32747a((byte) 0);

    /* renamed from: a */
    public DialogC32810a f78037a;

    /* renamed from: b */
    public long f78038b = System.currentTimeMillis();

    /* renamed from: d */
    private boolean f78039d;

    /* renamed from: e */
    private final AbstractC89244h f78040e = C89250i.m154773a((AbstractC89171a) new C32752f(this));

    /* renamed from: j */
    private HashMap f78041j;

    static {
        Covode.recordClassIndex(39525);
    }

    /* renamed from: e */
    private final C31910a m67331e() {
        return (C31910a) this.f78040e.getValue();
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "PhoneEmailSignUpStep";
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78041j == null) {
            this.f78041j = new HashMap();
        }
        View view = (View) this.f78041j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78041j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hr;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78041j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$a */
    public static final class C32747a {
        static {
            Covode.recordClassIndex(39526);
        }

        private C32747a() {
        }

        public /* synthetic */ C32747a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m67342a(Integer num, String str) {
            int i;
            C89219l.m154721d(str, "");
            C31376a a = new C31376a().mo57399a("platform", "phone").mo57399a("enter_method", str);
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
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$g */
    public static final class C32753g implements DialogC32810a.AbstractC32811a {

        /* renamed from: a */
        final /* synthetic */ C32746u f78047a;

        static {
            Covode.recordClassIndex(39532);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.view.DialogC32810a.AbstractC32811a
        /* renamed from: a */
        public final void mo58554a() {
            C80273bt.m139146b(this.f78047a.f78037a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32753g(C32746u uVar) {
            this.f78047a = uVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$f */
    static final class C32752f extends AbstractC89220m implements AbstractC89171a<C31910a> {

        /* renamed from: a */
        final /* synthetic */ C32746u f78046a;

        static {
            Covode.recordClassIndex(39531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32752f(C32746u uVar) {
            super(0);
            this.f78046a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31910a invoke() {
            C32746u uVar = this.f78046a;
            return new C31910a(uVar, uVar.mo58467x());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        m67331e().mo57846b();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.d1j)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.d1j);
        if (loadingButton != null) {
            loadingButton.mo58776a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(null, null, false, null, null, false, null, false, true, 1023);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (AccountKeyBoardHelper.C32598a.m67091a()) {
            C32776c.m67375a(((PhoneInputView) mo57434c(R.id.d1m)).getInputView().getEditText());
        } else {
            ((PhoneInputView) mo57434c(R.id.d1m)).getInputView().getEditText().requestFocus();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$b */
    public static final class C32748b extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C32746u f78042a;

        static {
            Covode.recordClassIndex(39527);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32748b(C32746u uVar) {
            this.f78042a = uVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f78042a.mo57434c(R.id.d1l);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f78042a.mo57434c(R.id.d1j);
            if (loadingButton != null) {
                boolean z = false;
                if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                    z = true;
                }
                loadingButton.setEnabled(z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m67331e().mo57843a();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$c */
    static final class View$OnClickListenerC32749c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32746u f78043a;

        static {
            Covode.recordClassIndex(39528);
        }

        View$OnClickListenerC32749c(C32746u uVar) {
            this.f78043a = uVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C80273bt.m139145a(DialogC31590a.m65889a(this.f78043a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$d */
    static final class View$OnClickListenerC32750d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32746u f78044a;

        static {
            Covode.recordClassIndex(39529);
        }

        View$OnClickListenerC32750d(C32746u uVar) {
            this.f78044a = uVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C80273bt.m139145a(DialogC31590a.m65890b(this.f78044a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$h */
    static final class View$OnClickListenerC32754h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32746u f78048a;

        /* renamed from: b */
        final /* synthetic */ boolean f78049b;

        static {
            Covode.recordClassIndex(39533);
        }

        View$OnClickListenerC32754h(C32746u uVar, boolean z) {
            this.f78048a = uVar;
            this.f78049b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78048a.mo58558a(this.f78049b);
            this.f78048a.mo58559a(this.f78049b, true);
            C80273bt.m139146b(this.f78048a.f78037a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$i */
    static final class View$OnClickListenerC32755i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32746u f78050a;

        /* renamed from: b */
        final /* synthetic */ boolean f78051b;

        static {
            Covode.recordClassIndex(39534);
        }

        View$OnClickListenerC32755i(C32746u uVar, boolean z) {
            this.f78050a = uVar;
            this.f78051b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78050a.mo58558a(!this.f78051b);
            this.f78050a.mo58559a(!this.f78051b, true);
            C80273bt.m139146b(this.f78050a.f78037a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$j */
    public static final class C32756j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32746u f78052a;

        static {
            Covode.recordClassIndex(39535);
        }

        C32756j(C32746u uVar) {
            this.f78052a = uVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f78052a.mo58467x();
            C89219l.m154716b(x, "");
            C32747a.m67342a(0, x);
            this.f78052a.mo58560b(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$k */
    public static final class C32757k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32746u f78053a;

        static {
            Covode.recordClassIndex(39536);
        }

        C32757k(C32746u uVar) {
            this.f78053a = uVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f78053a.mo58467x();
            C89219l.m154716b(x, "");
            C32747a.m67342a(0, x);
            this.f78053a.mo58560b(false, true);
        }
    }

    /* renamed from: a */
    public final void mo58558a(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C39162r.m79460a(str, new C31376a().mo57399a("enter_type", mo58468y()).f75156a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$e */
    static final class View$OnClickListenerC32751e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32746u f78045a;

        static {
            Covode.recordClassIndex(39530);
        }

        View$OnClickListenerC32751e(C32746u uVar) {
            this.f78045a = uVar;
        }

        public final void onClick(View view) {
            String string;
            String string2;
            ClickAgent.onClick(view);
            C39162r.m79460a("register_click_next", new C31376a().mo57399a("platform", "phone").mo57399a("enter_method", this.f78045a.mo58467x()).mo57398a("stay_time", System.currentTimeMillis() - this.f78045a.f78038b).f75156a);
            if (!C31940a.m66308a(((PhoneInputView) this.f78045a.mo57434c(R.id.d1m)).getCountryCodeString(), ((PhoneInputView) this.f78045a.mo57434c(R.id.d1m)).getPhoneNumberString())) {
                String x = this.f78045a.mo58467x();
                C89219l.m154716b(x, "");
                C32747a.m67342a(null, x);
                C32746u uVar = this.f78045a;
                String string3 = uVar.getString(R.string.aqb);
                C89219l.m154716b(string3, "");
                uVar.mo57442a(0, string3);
            } else if (C32868n.m67469a(((PhoneInputView) this.f78045a.mo57434c(R.id.d1m)).getCountryCodeString())) {
                C32746u uVar2 = this.f78045a;
                if (uVar2.getActivity() != null) {
                    String countryCodeString = ((PhoneInputView) uVar2.mo57434c(R.id.d1m)).getCountryCodeString();
                    boolean b = C32868n.m67470b(countryCodeString);
                    if (C32868n.m67470b(countryCodeString)) {
                        string = uVar2.getString(R.string.fij);
                        C89219l.m154716b(string, "");
                        string2 = uVar2.getString(R.string.fii);
                        C89219l.m154716b(string2, "");
                    } else {
                        string = uVar2.getString(R.string.fii);
                        C89219l.m154716b(string, "");
                        string2 = uVar2.getString(R.string.fij);
                        C89219l.m154716b(string2, "");
                    }
                    String fullPhoneNumber = ((PhoneInputView) uVar2.mo57434c(R.id.d1m)).getFullPhoneNumber();
                    ActivityC0945e activity = uVar2.getActivity();
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    String string4 = uVar2.getString(R.string.fik);
                    C89219l.m154716b(string4, "");
                    String string5 = uVar2.getString(R.string.fih, fullPhoneNumber);
                    C89219l.m154716b(string5, "");
                    String y = uVar2.mo58468y();
                    C89219l.m154716b(y, "");
                    uVar2.f78037a = new DialogC32810a(activity, new DialogC32810a.C32812b(string4, string5, string, string2, y, fullPhoneNumber));
                    DialogC32810a aVar = uVar2.f78037a;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.f78166a = new C32753g(uVar2);
                    DialogC32810a aVar2 = uVar2.f78037a;
                    if (aVar2 == null) {
                        C89219l.m154715b();
                    }
                    aVar2.f78167b = new View$OnClickListenerC32754h(uVar2, b);
                    DialogC32810a aVar3 = uVar2.f78037a;
                    if (aVar3 == null) {
                        C89219l.m154715b();
                    }
                    aVar3.f78168c = new View$OnClickListenerC32755i(uVar2, b);
                    C80273bt.m139145a(uVar2.f78037a);
                }
            } else {
                this.f78045a.mo58559a(false, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.d1l);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    /* renamed from: b */
    public final void mo58560b(boolean z, boolean z2) {
        C32582d.m67062a(this, ((PhoneInputView) mo57434c(R.id.d1m)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC32594j.PHONE_SMS_SIGN_UP.getValue());
        arguments.putInt("current_scene", EnumC32592i.SIGN_UP.getValue());
        arguments.putBoolean("code_sent", z2);
        arguments.putBoolean("use_whatsapp", z);
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((PhoneInputView) mo57434c(R.id.d1m)).getInputView().setTextWatcher(new C32748b(this));
        C32821z.m67398a(getContext(), (TextView) mo57434c(R.id.d1k), new View$OnClickListenerC32749c(this), new View$OnClickListenerC32750d(this), true);
        ((PhoneInputView) mo57434c(R.id.d1m)).mo58790a();
        if (!this.f78039d) {
            m67331e().mo57845a(((PhoneInputView) mo57434c(R.id.d1m)).getEditText());
            this.f78039d = true;
        }
        mo58495a(mo57434c(R.id.d1j), new View$OnClickListenerC32751e(this));
    }

    /* renamed from: a */
    public final void mo58559a(boolean z, boolean z2) {
        String str;
        C32308a aVar;
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), ((PhoneInputView) mo57434c(R.id.d1m)).getFullPhoneNumber(), EnumC32592i.SIGN_UP);
        if (a != null && (aVar = a.f77750a) != null && aVar.mo58388d()) {
            mo58560b(z, false);
        } else if (z) {
            String a2 = C31940a.m66306a(((PhoneInputView) mo57434c(R.id.d1m)).getPhoneNumberObject());
            C89219l.m154716b(a2, "");
            C32407x.m66793a(this, a2, EnumC32592i.SIGN_UP, EnumC32594j.PHONE_SMS_SIGN_UP, "user_click", "").mo143251d(new C32756j(this)).mo143246c();
        } else {
            String a3 = C31940a.m66306a(((PhoneInputView) mo57434c(R.id.d1m)).getPhoneNumberObject());
            C89219l.m154716b(a3, "");
            EnumC32592i iVar = EnumC32592i.SIGN_UP;
            EnumC32594j jVar = EnumC32594j.PHONE_SMS_SIGN_UP;
            if (z2) {
                str = "choose_dialog";
            } else {
                str = null;
            }
            C32407x.m66795a(this, a3, iVar, jVar, "", "user_click", str, 128).mo143251d(new C32757k(this)).mo143246c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m67331e().mo57844a(i, i2, intent);
    }
}
