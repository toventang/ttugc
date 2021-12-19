package com.p2082ss.android.ugc.aweme.compliance.business.termspp;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2654a.C39465a;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog */
public final class TermsConsentDialog extends ActivityC17312a {

    /* renamed from: b */
    public static final C39570a f93308b = new C39570a((byte) 0);

    /* renamed from: a */
    public boolean f93309a;

    /* renamed from: c */
    private SparseArray f93310c;

    static {
        Covode.recordClassIndex(47280);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f93310c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f93310c == null) {
            this.f93310c = new SparseArray();
        }
        View view = (View) this.f93310c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f93310c.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog$a */
    public static final class C39570a {
        static {
            Covode.recordClassIndex(47281);
        }

        private C39570a() {
        }

        public /* synthetic */ C39570a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m80355a(String str) {
        C39162r.m79460a(str, new C33744d().f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog$e */
    static final class View$OnClickListenerC39574e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f93323a;

        static {
            Covode.recordClassIndex(47285);
        }

        View$OnClickListenerC39574e(TermsConsentDialog termsConsentDialog) {
            this.f93323a = termsConsentDialog;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                if (this.f93323a.f93309a) {
                    C39465a aVar = new C39465a();
                    TermsConsentInfo o = C39608b.m80429o();
                    if (o != null) {
                        str = o.getBusiness();
                    } else {
                        str = null;
                    }
                    aVar.mo68919a(str, null, null, null, null, 0, C395751.f93324a);
                    TermsConsentDialog.m80355a("qa_kr_terms_dialog_confirm_click");
                    this.f93323a.finish();
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_CONSENT);
                    return;
                }
                new C23144b(this.f93323a).mo37640e(R.string.aqt).mo37637b();
            }
        }
    }

    /* renamed from: a */
    public final void mo68990a(boolean z) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.z4);
            C89219l.m154716b(tuxTextView, "");
            ((TuxTextView) _$_findCachedViewById(R.id.z4)).setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.a9));
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.z4);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setBackground(C0643b.m2369a(this, (int) R.drawable.a2u));
            C17235c.m31810a(_$_findCachedViewById(R.id.z4), 0.5f);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.z4);
        C89219l.m154716b(tuxTextView3, "");
        ((TuxTextView) _$_findCachedViewById(R.id.z4)).setTextColor(C0643b.m2378c(tuxTextView3.getContext(), R.color.bz));
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.z4);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setBackground(C0643b.m2369a(this, (int) R.drawable.a2y));
        C17235c.m31810a(_$_findCachedViewById(R.id.z4), 1.0f);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u6);
        AbstractC0211a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo421c();
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f5q);
        C89219l.m154716b(tuxTextView, "");
        TermsConsentInfo o = C39608b.m80429o();
        String str5 = null;
        if (o != null) {
            str5 = o.getTitle();
        }
        if (str5 == null || str5.length() == 0 || str5 == null) {
            str5 = getString(R.string.aqv);
        }
        tuxTextView.setText(str5);
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.f5p);
        C89219l.m154716b(tuxTextView2, "");
        TermsConsentInfo o2 = C39608b.m80429o();
        if (o2 == null || (str = o2.getDescription()) == null || str.length() == 0 || str == null) {
            str = getString(R.string.ct2);
        }
        tuxTextView2.setText(str);
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.f5p);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setBackground(new ColorDrawable(-1));
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.f5m);
        C89219l.m154716b(tuxTextView4, "");
        TermsConsentInfo o3 = C39608b.m80429o();
        if (o3 == null || (str2 = o3.getCheckboxAll()) == null || str2.length() == 0 || str2 == null) {
            str2 = getString(R.string.aqq);
        }
        tuxTextView4.setText(str2);
        TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.f5o);
        C89219l.m154716b(tuxTextView5, "");
        TermsConsentInfo o4 = C39608b.m80429o();
        if (o4 == null || (str3 = o4.getCheckboxTerms()) == null || str3.length() == 0 || str3 == null) {
            str3 = getString(R.string.ass);
        }
        tuxTextView5.setText(str3);
        TuxTextView tuxTextView6 = (TuxTextView) _$_findCachedViewById(R.id.f5n);
        C89219l.m154716b(tuxTextView6, "");
        TermsConsentInfo o5 = C39608b.m80429o();
        if (o5 == null || (str4 = o5.getCheckboxPP()) == null || str4.length() == 0 || str4 == null) {
            str4 = getString(R.string.asm);
        }
        tuxTextView6.setText(str4);
        TuxTextView tuxTextView7 = (TuxTextView) _$_findCachedViewById(R.id.z4);
        C89219l.m154716b(tuxTextView7, "");
        tuxTextView7.setText(getString(R.string.ct3));
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(R.id.a2q);
        C89219l.m154716b(appCompatCheckBox, "");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a2s);
        C89219l.m154716b(appCompatCheckBox2, "");
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a2r);
        C89219l.m154716b(appCompatCheckBox3, "");
        appCompatCheckBox.setOnCheckedChangeListener(new C39571b(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox));
        appCompatCheckBox2.setOnCheckedChangeListener(new C39572c(this, appCompatCheckBox3, appCompatCheckBox, appCompatCheckBox2));
        appCompatCheckBox3.setOnCheckedChangeListener(new C39573d(this, appCompatCheckBox2, appCompatCheckBox, appCompatCheckBox3));
        String m = C39608b.m80427m();
        String n = C39608b.m80428n();
        if (!(m == null || m.length() == 0)) {
            WebView webView = (WebView) _$_findCachedViewById(R.id.fjs);
            C89219l.m154716b(webView, "");
            m80354a(webView, m);
        }
        if (!(n == null || n.length() == 0)) {
            WebView webView2 = (WebView) _$_findCachedViewById(R.id.fjr);
            C89219l.m154716b(webView2, "");
            m80354a(webView2, n);
        }
        ((TuxTextView) _$_findCachedViewById(R.id.z4)).setOnClickListener(new View$OnClickListenerC39574e(this));
        m80355a("qa_kr_terms_dialog_show");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog$f */
    public static final class View$OnTouchListenerC39576f implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC39576f f93325a = new View$OnTouchListenerC39576f();

        static {
            Covode.recordClassIndex(47287);
        }

        View$OnTouchListenerC39576f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            ((WebView) view).requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* renamed from: b */
    private static void m80356b(WebView webView, String str) {
        MethodCollector.m26663i(13014);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(13014);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog$b */
    static final class C39571b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f93311a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f93312b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f93313c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f93314d;

        static {
            Covode.recordClassIndex(47282);
        }

        C39571b(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f93311a = termsConsentDialog;
            this.f93312b = appCompatCheckBox;
            this.f93313c = appCompatCheckBox2;
            this.f93314d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            this.f93312b.setChecked(z);
            this.f93313c.setChecked(z);
            TermsConsentDialog termsConsentDialog = this.f93311a;
            if (!this.f93314d.isChecked() || !this.f93312b.isChecked() || !this.f93313c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            termsConsentDialog.f93309a = z2;
            TermsConsentDialog termsConsentDialog2 = this.f93311a;
            termsConsentDialog2.mo68990a(termsConsentDialog2.f93309a);
        }
    }

    /* renamed from: a */
    private static void m80353a(WebView webView, WebViewClient webViewClient) {
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

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog$c */
    static final class C39572c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f93315a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f93316b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f93317c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f93318d;

        static {
            Covode.recordClassIndex(47283);
        }

        C39572c(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f93315a = termsConsentDialog;
            this.f93316b = appCompatCheckBox;
            this.f93317c = appCompatCheckBox2;
            this.f93318d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f93316b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f93317c;
            boolean z3 = true;
            if (!z || !this.f93316b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f93316b.setChecked(isChecked);
            TermsConsentDialog termsConsentDialog = this.f93315a;
            if (!this.f93317c.isChecked() || !this.f93318d.isChecked() || !this.f93316b.isChecked()) {
                z3 = false;
            }
            termsConsentDialog.f93309a = z3;
            TermsConsentDialog termsConsentDialog2 = this.f93315a;
            termsConsentDialog2.mo68990a(termsConsentDialog2.f93309a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog$d */
    static final class C39573d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentDialog f93319a;

        /* renamed from: b */
        final /* synthetic */ AppCompatCheckBox f93320b;

        /* renamed from: c */
        final /* synthetic */ AppCompatCheckBox f93321c;

        /* renamed from: d */
        final /* synthetic */ AppCompatCheckBox f93322d;

        static {
            Covode.recordClassIndex(47284);
        }

        C39573d(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f93319a = termsConsentDialog;
            this.f93320b = appCompatCheckBox;
            this.f93321c = appCompatCheckBox2;
            this.f93322d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f93320b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f93321c;
            boolean z3 = true;
            if (!z || !this.f93320b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f93320b.setChecked(isChecked);
            TermsConsentDialog termsConsentDialog = this.f93319a;
            if (!this.f93321c.isChecked() || !this.f93320b.isChecked() || !this.f93322d.isChecked()) {
                z3 = false;
            }
            termsConsentDialog.f93309a = z3;
            TermsConsentDialog termsConsentDialog2 = this.f93319a;
            termsConsentDialog2.mo68990a(termsConsentDialog2.f93309a);
        }
    }

    /* renamed from: a */
    private final void m80354a(WebView webView, String str) {
        m80353a(webView, new C39588d(this));
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        C89219l.m154716b(settings, "");
        settings.setJavaScriptEnabled(true);
        WebSettings settings2 = webView.getSettings();
        C89219l.m154716b(settings2, "");
        settings2.setDomStorageEnabled(true);
        m80356b(webView, str);
        webView.setOnTouchListener(View$OnTouchListenerC39576f.f93325a);
    }
}
