package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.tux.input.TuxTextView;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31937c;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31938d;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.SignUpOrLoginActivity;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w */
public final class C32766w extends AbstractC32613a {

    /* renamed from: a */
    public String f78071a;

    /* renamed from: b */
    public boolean f78072b;

    /* renamed from: c */
    public boolean f78073c;

    /* renamed from: d */
    public int f78074d;

    /* renamed from: e */
    public boolean f78075e;

    /* renamed from: j */
    public String f78076j = "";

    /* renamed from: k */
    private int f78077k = EnumC32594j.TERMS_CONSENT_SIGN_UP.getValue();

    /* renamed from: l */
    private AuthResult f78078l;

    /* renamed from: m */
    private HashMap f78079m;

    static {
        Covode.recordClassIndex(39545);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78079m == null) {
            this.f78079m = new HashMap();
        }
        View view = (View) this.f78079m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78079m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.ht;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78079m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$h */
    static final class View$OnClickListenerC32774h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32766w f78101a;

        static {
            Covode.recordClassIndex(39553);
        }

        View$OnClickListenerC32774h(C32766w wVar) {
            this.f78101a = wVar;
        }

        /* renamed from: a */
        private static boolean m67374a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f78101a.f78075e) {
                new C79459a(this.f78101a.getContext()).mo123050a(R.string.aqt).mo123053a();
                return;
            }
            if (this.f78101a.f78072b) {
                this.f78101a.getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m67374a();
                }
                if (!C58029j.f132256h) {
                    new C79459a(this.f78101a.getContext()).mo123050a(R.string.dcq).mo123053a();
                    return;
                } else {
                    this.f78101a.f78074d = -1;
                    this.f78101a.mo58573e();
                }
            } else if (this.f78101a.mo58460Z_() == EnumC32594j.TERMS_CONSENT_SIGN_UP) {
                C32766w wVar = this.f78101a;
                Bundle arguments = wVar.getArguments();
                if (arguments == null) {
                    C89219l.m154715b();
                }
                arguments.putInt("next_page", EnumC32594j.PHONE_EMAIL_SIGN_UP.getValue());
                C89219l.m154716b(arguments, "");
                wVar.mo58461a(arguments);
            } else if (this.f78101a.mo58460Z_() == EnumC32594j.TERMS_CONSENT_NEW_PHONE_USER) {
                C31940a.C31941a b = C32582d.m67066b(this.f78101a);
                C32766w wVar2 = this.f78101a;
                String a = C31940a.m66306a(b);
                C89219l.m154716b(a, "");
                C32407x.m66800a(wVar2, a, this.f78101a.f78076j, EnumC32592i.SIGN_UP, this.f78101a.mo58460Z_()).mo143246c();
            }
            C39162r.m79460a("register_terms_click_next", new C31376a().mo57399a("enter_from", this.f78101a.mo58466w()).mo57399a("enter_method", this.f78101a.mo58467x()).mo57399a("platform", this.f78101a.f78071a).f75156a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        if (!this.f78072b || this.f78073c) {
            return super.mo57458q();
        }
        this.f78074d = 0;
        mo58573e();
        return true;
    }

    /* renamed from: e */
    public final void mo58573e() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C89219l.m154716b(arguments, "");
        arguments.putInt("next_page", EnumC32594j.FINISH.getValue());
        arguments.putInt("result_code", this.f78074d);
        arguments.putInt("current_page", EnumC32594j.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
        mo58461a(arguments);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$g */
    static final class View$OnClickListenerC32773g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32766w f78100a;

        static {
            Covode.recordClassIndex(39552);
        }

        View$OnClickListenerC32773g(C32766w wVar) {
            this.f78100a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f78100a.f78072b || this.f78100a.f78073c) {
                try {
                    ActivityC0945e activity = this.f78100a.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                this.f78100a.f78074d = 0;
                this.f78100a.mo58573e();
            }
        }
    }

    /* renamed from: a */
    public final void mo58572a(boolean z) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.z4);
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            tuxTextView.setTextColor(C0643b.m2378c(context, R.color.l));
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.z4);
            C89219l.m154716b(tuxTextView2, "");
            Context context2 = getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            tuxTextView2.setBackground(C0643b.m2369a(context2, (int) R.drawable.ig));
            C17235c.m31810a(mo57434c(R.id.z4), 0.5f);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.z4);
        Context context3 = getContext();
        if (context3 == null) {
            C89219l.m154715b();
        }
        tuxTextView3.setTextColor(C0643b.m2378c(context3, R.color.bz));
        TuxTextView tuxTextView4 = (TuxTextView) mo57434c(R.id.z4);
        C89219l.m154716b(tuxTextView4, "");
        Context context4 = getContext();
        if (context4 == null) {
            C89219l.m154715b();
        }
        tuxTextView4.setBackground(C0643b.m2369a(context4, (int) R.drawable.kt));
        C17235c.m31810a(mo57434c(R.id.z4), 1.0f);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String string;
        AuthResult authResult;
        int value;
        String str2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z2 = true;
        if (mo58460Z_() == EnumC32594j.TERMS_CONSENT_SIGN_UP_THIRD_PARTY) {
            z = true;
        } else {
            z = false;
        }
        this.f78072b = z;
        String str3 = "";
        if (z) {
            if (arguments != null) {
                authResult = (AuthResult) arguments.getParcelable("key_auth_result");
            } else {
                authResult = null;
            }
            this.f78078l = authResult;
            if (!(authResult == null || (str2 = authResult.f49370d) == null)) {
                str3 = str2;
            }
            this.f78071a = str3;
            int value2 = EnumC32594j.THIRD_PARTY_AGE_GATE.getValue();
            if (arguments != null) {
                value = arguments.getInt("previous_page", EnumC32594j.NONE.getValue());
            } else {
                value = EnumC32594j.NONE.getValue();
            }
            if (value2 != value) {
                z2 = false;
            }
            this.f78073c = z2;
        } else {
            this.f78077k = mo58460Z_().getValue();
            if (!(arguments == null || (string = arguments.getString("sms_code_key", str3)) == null)) {
                str3 = string;
            }
            this.f78076j = str3;
            if (this.f78077k == EnumC32594j.TERMS_CONSENT_NEW_PHONE_USER.getValue()) {
                str = "sms_verification";
            } else {
                str = "phone";
            }
            this.f78071a = str;
        }
        C39162r.m79460a("register_terms_show", new C31376a().mo57399a("enter_from", mo58466w()).mo57399a("enter_method", mo58467x()).mo57399a("platform", this.f78071a).f75156a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$e */
    static final class View$OnTouchListenerC32771e implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC32771e f78098a = new View$OnTouchListenerC32771e();

        static {
            Covode.recordClassIndex(39550);
        }

        View$OnTouchListenerC32771e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            ((WebView) view).requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$f */
    static final class View$OnTouchListenerC32772f implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC32772f f78099a = new View$OnTouchListenerC32772f();

        static {
            Covode.recordClassIndex(39551);
        }

        View$OnTouchListenerC32772f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            ((WebView) view).requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* renamed from: a */
    private static void m67362a(WebView webView, String str) {
        MethodCollector.m26663i(12175);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(12175);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$a */
    static final class C32767a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C32766w f78080a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f78081b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f78082c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f78083d;

        static {
            Covode.recordClassIndex(39546);
        }

        C32767a(C32766w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f78080a = wVar;
            this.f78081b = appCompatCheckBox;
            this.f78082c = appCompatCheckBox2;
            this.f78083d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            this.f78081b.setChecked(z);
            this.f78082c.setChecked(z);
            this.f78083d.setChecked(z);
            C32766w wVar = this.f78080a;
            if (!this.f78081b.isChecked() || !this.f78082c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            wVar.f78075e = z2;
            C32766w wVar2 = this.f78080a;
            wVar2.mo58572a(wVar2.f78075e);
            this.f78080a.mo58571a("total", z);
        }
    }

    /* renamed from: a */
    private static void m67361a(WebView webView, WebViewClient webViewClient) {
        if (C84367b.m145126a()) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(C23833c.m45038a(webViewClient));
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$b */
    static final class C32768b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C32766w f78084a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f78085b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f78086c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f78087d;

        /* renamed from: e */
        final /* synthetic */ AppCompatCheckBox f78088e;

        static {
            Covode.recordClassIndex(39547);
        }

        C32768b(C32766w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3, AppCompatCheckBox appCompatCheckBox4) {
            this.f78084a = wVar;
            this.f78085b = appCompatCheckBox;
            this.f78086c = appCompatCheckBox2;
            this.f78087d = appCompatCheckBox3;
            this.f78088e = appCompatCheckBox4;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f78085b.isChecked();
            boolean isChecked2 = this.f78086c.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f78087d;
            boolean z3 = true;
            if (!z || !this.f78085b.isChecked() || !this.f78086c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f78085b.setChecked(isChecked);
            this.f78086c.setChecked(isChecked2);
            C32766w wVar = this.f78084a;
            if (!this.f78088e.isChecked() || !this.f78085b.isChecked()) {
                z3 = false;
            }
            wVar.f78075e = z3;
            C32766w wVar2 = this.f78084a;
            wVar2.mo58572a(wVar2.f78075e);
            this.f78084a.mo58571a("single", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$c */
    static final class C32769c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C32766w f78089a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f78090b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f78091c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f78092d;

        /* renamed from: e */
        final /* synthetic */ AppCompatCheckBox f78093e;

        static {
            Covode.recordClassIndex(39548);
        }

        C32769c(C32766w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3, AppCompatCheckBox appCompatCheckBox4) {
            this.f78089a = wVar;
            this.f78090b = appCompatCheckBox;
            this.f78091c = appCompatCheckBox2;
            this.f78092d = appCompatCheckBox3;
            this.f78093e = appCompatCheckBox4;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f78090b.isChecked();
            boolean isChecked2 = this.f78091c.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f78092d;
            boolean z3 = true;
            if (!z || !this.f78090b.isChecked() || !this.f78091c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f78090b.setChecked(isChecked);
            this.f78091c.setChecked(isChecked2);
            C32766w wVar = this.f78089a;
            if (!this.f78090b.isChecked() || !this.f78093e.isChecked()) {
                z3 = false;
            }
            wVar.f78075e = z3;
            C32766w wVar2 = this.f78089a;
            wVar2.mo58572a(wVar2.f78075e);
            this.f78089a.mo58571a("single", z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.w$d */
    static final class C32770d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C32766w f78094a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f78095b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f78096c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f78097d;

        static {
            Covode.recordClassIndex(39549);
        }

        C32770d(C32766w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f78094a = wVar;
            this.f78095b = appCompatCheckBox;
            this.f78096c = appCompatCheckBox2;
            this.f78097d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            boolean z2 = true;
            if (this.f78094a.getActivity() instanceof SignUpOrLoginActivity) {
                ActivityC0945e activity = this.f78094a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                SignUpOrLoginActivity signUpOrLoginActivity = (SignUpOrLoginActivity) activity;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                signUpOrLoginActivity.f77785b = i;
            }
            boolean isChecked = this.f78095b.isChecked();
            boolean isChecked2 = this.f78096c.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f78097d;
            if (!z || !this.f78095b.isChecked() || !this.f78096c.isChecked()) {
                z2 = false;
            }
            appCompatCheckBox.setChecked(z2);
            this.f78095b.setChecked(isChecked);
            this.f78096c.setChecked(isChecked2);
        }
    }

    /* renamed from: a */
    public final void mo58571a(String str, boolean z) {
        int i;
        C31376a a = new C31376a().mo57399a("enter_from", mo58466w()).mo57399a("enter_method", mo58467x()).mo57399a("platform", this.f78071a).mo57399a("content", str);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C39162r.m79460a("register_terms_click", a.mo57397a("click_type", i).f75156a);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String b;
        String c;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.emp);
        C89219l.m154716b(tuxTextView, "");
        if (TextUtils.isEmpty(C31937c.m66303b())) {
            b = getString(R.string.f9o);
        } else {
            b = C31937c.m66303b();
        }
        tuxTextView.setText(b);
        TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.emo);
        C89219l.m154716b(tuxTextView2, "");
        if (TextUtils.isEmpty(C31937c.m66304c())) {
            c = getString(R.string.f9n);
        } else {
            c = C31937c.m66304c();
        }
        tuxTextView2.setText(c);
        if (getActivity() instanceof SignUpOrLoginActivity) {
            ActivityC0945e activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
            ((SignUpOrLoginActivity) activity).f77785b = 1;
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) mo57434c(R.id.a2q);
        C89219l.m154716b(appCompatCheckBox, "");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) mo57434c(R.id.a2s);
        C89219l.m154716b(appCompatCheckBox2, "");
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) mo57434c(R.id.a2r);
        C89219l.m154716b(appCompatCheckBox3, "");
        AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) mo57434c(R.id.a2p);
        C89219l.m154716b(appCompatCheckBox4, "");
        appCompatCheckBox.setOnCheckedChangeListener(new C32767a(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox4));
        appCompatCheckBox2.setOnCheckedChangeListener(new C32768b(this, appCompatCheckBox3, appCompatCheckBox4, appCompatCheckBox, appCompatCheckBox2));
        appCompatCheckBox3.setOnCheckedChangeListener(new C32769c(this, appCompatCheckBox2, appCompatCheckBox4, appCompatCheckBox, appCompatCheckBox3));
        appCompatCheckBox4.setOnCheckedChangeListener(new C32770d(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox));
        String b2 = C31937c.f76279a.mo60101b();
        C89219l.m154716b(b2, "");
        String c2 = C31937c.f76279a.mo60102c();
        C89219l.m154716b(c2, "");
        WebView webView = (WebView) mo57434c(R.id.fjs);
        C89219l.m154716b(webView, "");
        m67361a(webView, new C31938d(getActivity()));
        WebView webView2 = (WebView) mo57434c(R.id.fjs);
        C89219l.m154716b(webView2, "");
        webView2.setWebChromeClient(new WebChromeClient());
        WebView webView3 = (WebView) mo57434c(R.id.fjs);
        C89219l.m154716b(webView3, "");
        WebSettings settings = webView3.getSettings();
        C89219l.m154716b(settings, "");
        settings.setJavaScriptEnabled(true);
        WebView webView4 = (WebView) mo57434c(R.id.fjs);
        C89219l.m154716b(webView4, "");
        WebSettings settings2 = webView4.getSettings();
        C89219l.m154716b(settings2, "");
        settings2.setDomStorageEnabled(true);
        m67362a((WebView) mo57434c(R.id.fjs), b2);
        ((WebView) mo57434c(R.id.fjs)).setOnTouchListener(View$OnTouchListenerC32771e.f78098a);
        WebView webView5 = (WebView) mo57434c(R.id.fjr);
        C89219l.m154716b(webView5, "");
        m67361a(webView5, new C31938d(getActivity()));
        WebView webView6 = (WebView) mo57434c(R.id.fjr);
        C89219l.m154716b(webView6, "");
        webView6.setWebChromeClient(new WebChromeClient());
        WebView webView7 = (WebView) mo57434c(R.id.fjr);
        C89219l.m154716b(webView7, "");
        WebSettings settings3 = webView7.getSettings();
        C89219l.m154716b(settings3, "");
        settings3.setJavaScriptEnabled(true);
        WebView webView8 = (WebView) mo57434c(R.id.fjr);
        C89219l.m154716b(webView8, "");
        WebSettings settings4 = webView8.getSettings();
        C89219l.m154716b(settings4, "");
        settings4.setDomStorageEnabled(true);
        m67362a((WebView) mo57434c(R.id.fjr), c2);
        ((WebView) mo57434c(R.id.fjr)).setOnTouchListener(View$OnTouchListenerC32772f.f78099a);
        C17235c.m31810a(mo57434c(R.id.c0d), 0.5f);
        mo58495a(mo57434c(R.id.c0d), new View$OnClickListenerC32773g(this));
        mo58572a(this.f78075e);
        mo58495a(mo57434c(R.id.z4), new View$OnClickListenerC32774h(this));
    }
}
