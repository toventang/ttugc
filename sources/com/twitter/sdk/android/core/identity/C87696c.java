package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.C87690h;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.C87804n;
import com.twitter.sdk.android.core.C87810s;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.C87702f;
import com.twitter.sdk.android.core.internal.oauth.C87745b;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

/* renamed from: com.twitter.sdk.android.core.identity.c */
final class C87696c implements C87702f.AbstractC87703a {

    /* renamed from: a */
    final AbstractC87699a f199208a;

    /* renamed from: b */
    TwitterAuthToken f199209b;

    /* renamed from: c */
    public final WebView f199210c;

    /* renamed from: d */
    public final TwitterAuthConfig f199211d;

    /* renamed from: e */
    public final OAuth1aService f199212e;

    /* renamed from: f */
    private final ProgressBar f199213f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.twitter.sdk.android.core.identity.c$a */
    public interface AbstractC87699a {
        static {
            Covode.recordClassIndex(103688);
        }

        /* renamed from: a */
        void mo142128a(int i, Intent intent);
    }

    static {
        Covode.recordClassIndex(103685);
    }

    /* renamed from: c */
    private void m152623c() {
        this.f199213f.setVisibility(8);
    }

    /* renamed from: b */
    private void m152622b() {
        this.f199210c.stopLoading();
        m152623c();
    }

    @Override // com.twitter.sdk.android.core.identity.C87702f.AbstractC87703a
    /* renamed from: a */
    public final void mo142141a() {
        C87794k.m152811c().mo142112a();
        mo142142a(1, new C87804n("OAuth web view completed with an error"));
        m152622b();
    }

    @Override // com.twitter.sdk.android.core.identity.C87702f.AbstractC87703a
    /* renamed from: a */
    public final void mo142144a(WebView webView) {
        m152623c();
        webView.setVisibility(0);
    }

    @Override // com.twitter.sdk.android.core.identity.C87702f.AbstractC87703a
    /* renamed from: a */
    public final void mo142143a(Bundle bundle) {
        C87794k.m152811c().mo142113b();
        String string = bundle.getString("oauth_verifier");
        if (string != null) {
            C87794k.m152811c().mo142113b();
            OAuth1aService oAuth1aService = this.f199212e;
            C876982 r2 = new AbstractC87682b<OAuthResponse>() {
                /* class com.twitter.sdk.android.core.identity.C87696c.C876982 */

                static {
                    Covode.recordClassIndex(103687);
                }

                @Override // com.twitter.sdk.android.core.AbstractC87682b
                /* renamed from: a */
                public final void mo34387a(C87810s sVar) {
                    C87794k.m152811c().mo142112a();
                    C87696c.this.mo142142a(1, new C87804n("Failed to get access token"));
                }

                @Override // com.twitter.sdk.android.core.AbstractC87682b
                /* renamed from: a */
                public final void mo34386a(C87690h<OAuthResponse> hVar) {
                    Intent intent = new Intent();
                    T t = hVar.f199190a;
                    intent.putExtra("screen_name", t.f199287b);
                    intent.putExtra("user_id", t.f199288c);
                    intent.putExtra("tk", t.f199286a.f199173b);
                    intent.putExtra("ts", t.f199286a.f199174c);
                    C87696c.this.f199208a.mo142128a(-1, intent);
                }
            };
            oAuth1aService.f199276a.getAccessToken(C87745b.m152707a(oAuth1aService.f199297b.f199464e, this.f199209b, null, "POST", oAuth1aService.f199298c.f199302a + "/oauth/access_token", null), string).mo144268a(oAuth1aService.mo142189a(r2));
        } else {
            C87794k.m152811c().mo142112a();
            mo142142a(1, new C87804n("Failed to get authorization, bundle incomplete"));
        }
        m152622b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo142142a(int i, C87804n nVar) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", nVar);
        this.f199208a.mo142128a(i, intent);
    }

    C87696c(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, AbstractC87699a aVar) {
        this.f199213f = progressBar;
        this.f199210c = webView;
        this.f199211d = twitterAuthConfig;
        this.f199212e = oAuth1aService;
        this.f199208a = aVar;
    }
}
