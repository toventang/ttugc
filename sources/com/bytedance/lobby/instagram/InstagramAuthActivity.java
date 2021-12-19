package com.bytedance.lobby.instagram;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.lobby.C20879a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.example.p1811a.C23833c;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49498ad;
import com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;
import okhttp3.C90200t;

public class InstagramAuthActivity extends ActivityC0218d {

    /* renamed from: b */
    public static String f49443b;

    /* renamed from: c */
    public static String f49444c;

    /* renamed from: d */
    public static String f49445d;

    /* renamed from: e */
    public static String f49446e;

    /* renamed from: f */
    private static final boolean f49447f = C20879a.f49364a;

    /* renamed from: h */
    private static String f49448h;

    /* renamed from: a */
    public String f49449a = "";

    /* renamed from: g */
    private WebView f49450g;

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(24511);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("ig_result_error_info", "Login flow cancelled by pressing back");
        intent.putExtra("error_stage", "goto_URL_and_auth");
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
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
    public final boolean mo34358a(String str) {
        C90200t f = C90200t.m156802f(str);
        Intent intent = new Intent();
        if (f != null) {
            try {
                if (TextUtils.equals(f.f204858a + "://" + f.mo145046a().getHost() + f.mo145046a().getPath(), f49443b)) {
                    int i = -1;
                    if (!this.f49449a.equals(f.mo145048c("state"))) {
                        intent.putExtra("ig_result_error_info", "State does not match");
                        intent.putExtra("error_stage", "redirect_and_get_token");
                        setResult(-1, intent);
                        finish();
                        return true;
                    }
                    String c = f.mo145048c("error");
                    if (!TextUtils.isEmpty(c)) {
                        String c2 = f.mo145048c("error_description");
                        String str2 = "error = [ " + c + " ], desc = [ " + c2 + " ]";
                        if (!TextUtils.equals(c2, "The user denied your request.")) {
                            i = 0;
                        }
                        intent.putExtra("ig_result_error_info", str2);
                        intent.putExtra("error_stage", "redirect_and_get_token");
                        setResult(i, intent);
                        finish();
                        return true;
                    }
                    intent.putExtra("ig_result_code", f.mo145048c("code"));
                    setResult(1, intent);
                    finish();
                    return true;
                }
            } catch (Exception e) {
                intent.putExtra("ig_result_error_info", "exception: url = [" + str + "], message = [" + e.getMessage() + "], stacktrace = [" + Log.getStackTraceString(e) + "]");
                setResult(0, intent);
                intent.putExtra("error_stage", "redirect_and_get_token");
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        String cookie;
        MethodCollector.m26663i(6438);
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bf);
        this.f49450g = (WebView) findViewById(R.id.bp1);
        Intent intent = getIntent();
        if (intent != null) {
            f49444c = m39318a(intent, "client_id");
            f49448h = m39318a(intent, "login_auth_url");
            f49443b = m39318a(intent, "redirect_url");
            f49445d = m39318a(intent, "response_type");
            f49446e = m39318a(intent, "scope");
        }
        try {
            WebSettings settings = this.f49450g.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setDomStorageEnabled(true);
        } catch (Exception unused) {
        }
        WebView webView = this.f49450g;
        C209121 r8 = new WebViewClient() {
            /* class com.bytedance.lobby.instagram.InstagramAuthActivity.C209121 */

            /* renamed from: b */
            private String f49452b;

            static {
                Covode.recordClassIndex(24512);
            }

            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C23833c.m45039a(webView, renderProcessGoneDetail);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                C90200t f;
                MethodCollector.m26663i(7123);
                if (C84365i.m145122b(webView, str)) {
                    MethodCollector.m26664o(7123);
                    return true;
                }
                String str2 = this.f49452b;
                if (str2 == null || !str2.contains("www.instagram.com/challenge") || !TextUtils.equals("https://www.instagram.com/", str) || (f = C90200t.m156802f("https://www.instagram.com/oauth/authorize")) == null) {
                    this.f49452b = str;
                    if (InstagramAuthActivity.this.mo34358a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                        MethodCollector.m26664o(7123);
                        return true;
                    }
                } else {
                    String tVar = f.mo145060j().mo145064a("client_id", InstagramAuthActivity.f49444c).mo145064a("redirect_uri", InstagramAuthActivity.f49443b).mo145064a("response_type", InstagramAuthActivity.f49445d).mo145064a("state", InstagramAuthActivity.this.f49449a).mo145064a("scope", InstagramAuthActivity.f49446e).mo145068b().toString();
                    this.f49452b = tVar;
                    String a = C84357h.f188595a.mo129370a(webView, tVar);
                    if (!TextUtils.isEmpty(a)) {
                        tVar = a;
                    }
                    webView.loadUrl(tVar);
                }
                MethodCollector.m26664o(7123);
                return false;
            }
        };
        if (C84367b.m145126a()) {
            WebSettings settings2 = webView.getSettings();
            String userAgentString = settings2.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings2.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(C23833c.m45038a(r8));
        CookieManager instance = CookieManager.getInstance();
        if (!TextUtils.isEmpty(instance.getCookie("https://.instagram.com"))) {
            instance.setCookie("https://.instagram.com", "sessionid=");
            if (C29843f.m60129a(C17879g.m33104a()) && C49498ad.m92737a() && (cookie = CookieManager.getInstance().getCookie(C49540a.m92781a())) != null && !TextUtils.equals(cookie, C49540a.m92784b())) {
                C49540a.m92783a(C49540a.m92781a(), cookie);
            }
        }
        this.f49449a = UUID.randomUUID().toString();
        C90200t f = C90200t.m156802f(f49448h);
        if (f != null) {
            C90200t b = f.mo145060j().mo145064a("client_id", f49444c).mo145064a("redirect_uri", f49443b).mo145064a("response_type", f49445d).mo145064a("state", this.f49449a).mo145064a("scope", f49446e).mo145068b();
            WebView webView2 = this.f49450g;
            String tVar = b.toString();
            String a = C84357h.f188595a.mo129370a(webView2, tVar);
            if (!TextUtils.isEmpty(a)) {
                tVar = a;
            }
            webView2.loadUrl(tVar);
        }
        MethodCollector.m26664o(6438);
    }

    /* renamed from: a */
    private static String m39318a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
