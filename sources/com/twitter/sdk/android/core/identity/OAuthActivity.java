package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import com.p2082ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.C87690h;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.C87804n;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.C87810s;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.C87696c;
import com.twitter.sdk.android.core.internal.C87750q;
import com.twitter.sdk.android.core.internal.oauth.C87745b;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

public class OAuthActivity extends Activity implements C87696c.AbstractC87699a {

    /* renamed from: a */
    C87696c f199194a;

    /* renamed from: b */
    private ProgressBar f199195b;

    /* renamed from: c */
    private WebView f199196c;

    static {
        Covode.recordClassIndex(103679);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onBackPressed() {
        this.f199194a.mo142142a(0, new C87804n("Authorization failed, request was canceled."));
    }

    /* access modifiers changed from: protected */
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

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f199195b.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bh1);
        this.f199195b = (ProgressBar) findViewById(R.id.f7n);
        this.f199196c = (WebView) findViewById(R.id.f7o);
        int i = 0;
        if (bundle != null) {
            z = bundle.getBoolean("progress", false);
        } else {
            z = true;
        }
        ProgressBar progressBar = this.f199195b;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
        C87696c cVar = new C87696c(this.f199195b, this.f199196c, (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config"), new OAuth1aService(C87808q.m152816a(), new C87750q()), this);
        this.f199194a = cVar;
        C87794k.m152811c().mo142113b();
        OAuth1aService oAuth1aService = cVar.f199212e;
        C87696c.C876971 r2 = new AbstractC87682b<OAuthResponse>() {
            /* class com.twitter.sdk.android.core.identity.C87696c.C876971 */

            static {
                Covode.recordClassIndex(103686);
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34387a(C87810s sVar) {
                C87794k.m152811c().mo142112a();
                C87696c.this.mo142142a(1, new C87804n("Failed to get request token"));
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34386a(C87690h<OAuthResponse> hVar) {
                MethodCollector.m26663i(6064);
                C87696c.this.f199209b = hVar.f199190a.f199286a;
                OAuth1aService oAuth1aService = C87696c.this.f199212e;
                TwitterAuthToken twitterAuthToken = C87696c.this.f199209b;
                String[] strArr = {"oauth", "authorize"};
                Uri.Builder buildUpon = Uri.parse(oAuth1aService.f199298c.f199302a).buildUpon();
                int i = 0;
                do {
                    buildUpon.appendPath(strArr[i]);
                    i++;
                } while (i < 2);
                String uri = buildUpon.appendQueryParameter("oauth_token", twitterAuthToken.f199173b).build().toString();
                C87794k.m152811c().mo142113b();
                WebView webView = C87696c.this.f199210c;
                C87702f fVar = new C87702f(OAuth1aService.m152695a(C87696c.this.f199211d), C87696c.this);
                C87701e eVar = new C87701e();
                WebSettings settings = webView.getSettings();
                settings.setAllowFileAccess(false);
                settings.setJavaScriptEnabled(false);
                settings.setSaveFormData(false);
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
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
                webView.setWebViewClient(C23833c.m45038a(fVar));
                String a = C84357h.f188595a.mo129370a(webView, uri);
                if (!TextUtils.isEmpty(a)) {
                    uri = a;
                }
                webView.loadUrl(uri);
                webView.setVisibility(4);
                webView.setWebChromeClient(eVar);
                MethodCollector.m26664o(6064);
            }
        };
        TwitterAuthConfig twitterAuthConfig = oAuth1aService.f199297b.f199464e;
        oAuth1aService.f199276a.getTempToken(C87745b.m152707a(twitterAuthConfig, null, OAuth1aService.m152695a(twitterAuthConfig), "POST", oAuth1aService.f199298c.f199302a + "/oauth/request_token", null)).mo144268a(oAuth1aService.mo142189a(r2));
    }

    @Override // com.twitter.sdk.android.core.identity.C87696c.AbstractC87699a
    /* renamed from: a */
    public final void mo142128a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }
}
