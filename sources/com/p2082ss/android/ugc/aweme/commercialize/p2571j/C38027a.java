package com.p2082ss.android.ugc.aweme.commercialize.p2571j;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38747h;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.j.a */
public final class C38027a implements AbstractC40691e {

    /* renamed from: c */
    public static final List<JSONObject> f89857c = new ArrayList();

    /* renamed from: d */
    public static final C38028a f89858d = new C38028a((byte) 0);

    /* renamed from: f */
    private static final String f89859f = C38027a.class.getSimpleName();

    /* renamed from: a */
    public boolean f89860a;

    /* renamed from: b */
    public boolean f89861b;

    /* renamed from: e */
    private boolean f89862e = false;

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: b */
    public final boolean mo65796b(WebView webView, String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: c */
    public final void mo65797c(WebView webView, String str) {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.j.a$a */
    public static final class C38028a {
        static {
            Covode.recordClassIndex(45490);
        }

        private C38028a() {
        }

        public /* synthetic */ C38028a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m77101a(String str, int i, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error_code", i);
                jSONObject.put("description", str2);
                C38027a.f89857c.add(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(45489);
    }

    /* renamed from: a */
    private static boolean m77092a(String str) {
        if (str == null || !str.equals("about:blank")) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo61846a(WebView webView, String str) {
        if (!m77092a(str) && !this.f89860a) {
            this.f89860a = true;
            C38747h.m78589a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        int i;
        if (sslError != null) {
            str = sslError.getUrl();
            i = sslError.getPrimaryError();
        } else {
            str = null;
            i = 0;
        }
        C38028a.m77101a(str, i, "ssl error");
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        String str2;
        int i;
        Uri url;
        Uri url2;
        String str3 = null;
        if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) {
            str = null;
        } else {
            str = url2.toString();
        }
        if (!m77092a(str)) {
            this.f89861b = true;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                str2 = null;
            } else {
                str2 = url.toString();
            }
            if (webResourceError != null) {
                i = webResourceError.getErrorCode();
                CharSequence description = webResourceError.getDescription();
                if (description != null) {
                    str3 = description.toString();
                }
            } else {
                i = 0;
            }
            C38028a.m77101a(str2, i, str3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        Uri url;
        Uri url2;
        String path;
        Uri url3;
        String str3 = null;
        if (webResourceRequest == null || (url3 = webResourceRequest.getUrl()) == null) {
            str = null;
        } else {
            str = url3.toString();
        }
        if (!m77092a(str)) {
            int i = 0;
            if (this.f89862e && (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (path = url2.getPath()) == null || !C89361p.m154876c(path, "favicon.ico", false))) {
                this.f89861b = true;
            }
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                str2 = null;
            } else {
                str2 = url.toString();
            }
            if (webResourceResponse != null) {
                i = webResourceResponse.getStatusCode();
                str3 = webResourceResponse.getReasonPhrase();
            }
            C38028a.m77101a(str2, i, str3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        if (!m77092a(str)) {
            this.f89860a = false;
            this.f89861b = false;
            f89857c.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65791a(WebView webView, int i, String str, String str2) {
        if (!m77092a(str2)) {
            this.f89861b = true;
            C38028a.m77101a(str2, i, str);
        }
    }
}
