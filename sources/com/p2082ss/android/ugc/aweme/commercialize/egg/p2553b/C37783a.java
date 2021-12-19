package com.p2082ss.android.ugc.aweme.commercialize.egg.p2553b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37782b;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37794b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.a */
public final class C37783a implements AbstractC37794b {

    /* renamed from: a */
    private CrossPlatformWebView f89206a;

    /* renamed from: b */
    private final ActivityC0945e f89207b;

    /* renamed from: c */
    private final String f89208c;

    static {
        Covode.recordClassIndex(45230);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37794b
    /* renamed from: a */
    public final View mo65788a() {
        CrossPlatformWebView crossPlatformWebView = this.f89206a;
        if (crossPlatformWebView == null) {
            C89219l.m154710a("mWebView");
        }
        return crossPlatformWebView;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37794b
    /* renamed from: b */
    public final void mo65790b() {
        CrossPlatformWebView crossPlatformWebView = this.f89206a;
        if (crossPlatformWebView == null) {
            C89219l.m154710a("mWebView");
        }
        CrossPlatformWebView.m82144a(crossPlatformWebView, this.f89208c, false, null, 6);
    }

    /* renamed from: a */
    private static SingleWebView m76410a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((AbstractC40746j) crossPlatformWebView.mo69911a(AbstractC40746j.class)).mo69969a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37794b
    /* renamed from: a */
    public final void mo65789a(AbstractC37782b bVar) {
        C89219l.m154721d(bVar, "");
        CrossPlatformWebView crossPlatformWebView = this.f89206a;
        if (crossPlatformWebView == null) {
            C89219l.m154710a("mWebView");
        }
        int i = Build.VERSION.SDK_INT;
        WebSettings settings = m76410a(crossPlatformWebView).getSettings();
        C89219l.m154716b(settings, "");
        settings.setMediaPlaybackRequiresUserGesture(false);
        m76410a(crossPlatformWebView).setCanTouch(false);
        C37784a aVar = new C37784a(this, bVar);
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f89208c);
        ActivityC0945e eVar = this.f89207b;
        if (eVar != null) {
            CommercializeWebViewHelper.m78329a(crossPlatformWebView, aVar, eVar, eVar, bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.a$a */
    public static final class C37784a implements AbstractC40691e {

        /* renamed from: a */
        final /* synthetic */ C37783a f89209a;

        /* renamed from: b */
        final /* synthetic */ AbstractC37782b f89210b;

        static {
            Covode.recordClassIndex(45231);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: b */
        public final boolean mo65796b(WebView webView, String str) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: c */
        public final void mo65797c(WebView webView, String str) {
        }

        C37784a(C37783a aVar, AbstractC37782b bVar) {
            this.f89209a = aVar;
            this.f89210b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
            this.f89210b.mo65786a();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            CharSequence charSequence;
            String str = null;
            if (Build.VERSION.SDK_INT >= 23) {
                if (webResourceError != null) {
                    charSequence = webResourceError.getDescription();
                } else {
                    charSequence = null;
                }
                if (charSequence instanceof String) {
                    str = charSequence;
                }
                str = str;
            }
            this.f89210b.mo65787a(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
            this.f89210b.mo65787a(str);
        }
    }

    public C37783a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        this.f89208c = str;
        ActivityC0945e eVar = (ActivityC0945e) (!(context instanceof ActivityC0945e) ? null : context);
        this.f89207b = eVar;
        if (eVar != null) {
            this.f89206a = new CrossPlatformWebView(eVar, (AttributeSet) null, 6);
        }
    }
}
