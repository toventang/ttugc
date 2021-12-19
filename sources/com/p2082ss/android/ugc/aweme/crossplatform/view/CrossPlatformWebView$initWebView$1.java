package com.p2082ss.android.ugc.aweme.crossplatform.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.sdk.activity.C30226b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.XpathBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40633f;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40634g;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.C40742g;
import com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$initWebView$1 */
public final class CrossPlatformWebView$initWebView$1 implements AbstractC40691e {

    /* renamed from: a */
    final /* synthetic */ CrossPlatformWebView f95379a;

    /* renamed from: b */
    private boolean f95380b;

    static {
        Covode.recordClassIndex(48582);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CrossPlatformWebView$initWebView$1(CrossPlatformWebView crossPlatformWebView) {
        this.f95379a = crossPlatformWebView;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: c */
    public final void mo65797c(WebView webView, String str) {
        AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo65797c(webView, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: b */
    public final boolean mo65796b(WebView webView, String str) {
        AdWebStatBusiness webStatBusiness = this.f95379a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.mo69712c(webView, str);
        }
        AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
        if (customWebViewStatus == null || !customWebViewStatus.mo65796b(webView, str)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo61846a(WebView webView, String str) {
        C40618a crossPlatformParams;
        C40634g gVar;
        AbstractC40591g crossPlatformBusiness;
        XpathBusiness xpathBusiness;
        AbstractC40691e e;
        MethodCollector.m26663i(6431);
        AbstractC40547m mVar = this.f95379a.f95348e;
        if (!(mVar == null || (e = mVar.mo67257e()) == null)) {
            e.mo61846a(webView, str);
        }
        AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo61846a(webView, str);
        }
        ((DmtStatusView) this.f95379a.mo69910a(R.id.cg3)).mo27379a(false);
        if (!this.f95380b) {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f95379a.mo69910a(R.id.awv);
            C89219l.m154716b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            this.f95379a.mo69915a((Integer) 0, "", str, true);
        }
        this.f95379a.f95347d = true;
        this.f95379a.getRegistry().mo69983a(C40742g.EnumC40743a.LOAD_FINISH);
        AbstractC40547m mVar2 = this.f95379a.f95348e;
        if (!(mVar2 == null || (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) == null || (xpathBusiness = (XpathBusiness) crossPlatformBusiness.mo69748a(XpathBusiness.class)) == null)) {
            xpathBusiness.xpathDirect(this.f95379a.getCrossPlatformParams(), webView);
        }
        AdWebStatBusiness webStatBusiness = this.f95379a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.mo69709b(webView, str);
        }
        if (webView != null) {
            String reactId = this.f95379a.getReactId();
            C89219l.m154719c(webView, "");
            if (reactId != null) {
                String str2 = "javascript:(function () {    window.reactId = '" + reactId + "';})();";
                String a = C84357h.f188595a.mo129370a(webView, str2);
                if (!TextUtils.isEmpty(a)) {
                    str2 = a;
                }
                webView.loadUrl(str2);
            }
        }
        CrossPlatformWebView crossPlatformWebView = this.f95379a;
        int i = !this.f95380b ? 1 : 0;
        if (!(crossPlatformWebView.f95352i || (crossPlatformParams = crossPlatformWebView.getCrossPlatformParams()) == null || (gVar = crossPlatformParams.f95072e) == null || gVar.f95196c == null)) {
            C40618a crossPlatformParams2 = crossPlatformWebView.getCrossPlatformParams();
            if (crossPlatformParams2 == null) {
                C89219l.m154715b();
            }
            JSONObject jSONObject = new JSONObject(crossPlatformParams2.f95072e.f95196c);
            try {
                jSONObject.put("status", String.valueOf(i)).put("duration", System.currentTimeMillis() - CrossPlatformActivity.f94801c);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            C39162r.m79461a("request_anchor_detail", jSONObject);
            crossPlatformWebView.f95352i = true;
        }
        MethodCollector.m26664o(6431);
    }

    public final void webStatBusinessOnReceivedError(WebView webView, WebResourceRequest webResourceRequest, String str) {
        AdWebStatBusiness webStatBusiness = this.f95379a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.mo69701a(webView, webResourceRequest, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC40691e e;
        AbstractC40547m mVar = this.f95379a.f95348e;
        if (!(mVar == null || (e = mVar.mo67257e()) == null)) {
            e.mo65792a(webView, sslErrorHandler, sslError);
        }
        AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo65792a(webView, sslErrorHandler, sslError);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC40691e e;
        AbstractC40547m mVar = this.f95379a.f95348e;
        if (!(mVar == null || (e = mVar.mo67257e()) == null)) {
            e.mo65794a(webView, webResourceRequest, webResourceResponse);
        }
        AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo65794a(webView, webResourceRequest, webResourceResponse);
        }
        JSONObject jSONObject = new JSONObject();
        C30226b.m61166a(jSONObject, "host", webResourceRequest.getUrl().getHost());
        C30226b.m61166a(jSONObject, "path", webResourceRequest.getUrl().getPath());
        C30226b.m61166a(jSONObject, "statusCode", Integer.valueOf(webResourceResponse.getStatusCode()));
        C30226b.m61166a(jSONObject, "errorCode", 1001);
        C12290b.m22060a("aweme_webview_assets_error", 0, jSONObject);
        AdWebStatBusiness webStatBusiness = this.f95379a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.mo69701a(webView, webResourceRequest, webResourceResponse.getReasonPhrase());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        Uri uri;
        Boolean bool;
        Uri url;
        String path;
        CharSequence description;
        AbstractC40691e e;
        AbstractC40547m mVar = this.f95379a.f95348e;
        if (!(mVar == null || (e = mVar.mo67257e()) == null)) {
            e.mo65793a(webView, webResourceRequest, webResourceError);
        }
        AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo65793a(webView, webResourceRequest, webResourceError);
        }
        Integer num = null;
        if (webResourceError == null || (description = webResourceError.getDescription()) == null) {
            str = null;
        } else {
            str = description.toString();
        }
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        String valueOf = String.valueOf(uri);
        if (webResourceRequest != null) {
            bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (path = url.getPath()) == null || !C89361p.m154876c(path, ".apk", false)) {
                this.f95380b = true;
                this.f95379a.mo69927d();
                CrossPlatformWebView crossPlatformWebView = this.f95379a;
                if (webResourceError != null) {
                    num = Integer.valueOf(webResourceError.getErrorCode());
                }
                crossPlatformWebView.mo69915a(num, str, valueOf, false);
            } else {
                return;
            }
        } else if (C89219l.m154714a((Object) bool, (Object) false)) {
            Uri url2 = webResourceRequest.getUrl();
            if (!(url2 == null || url2.getPath() == null)) {
                Uri url3 = webResourceRequest.getUrl();
                C89219l.m154716b(url3, "");
                String path2 = url3.getPath();
                if (path2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(path2, "");
                if (C89361p.m154876c(path2, "favicon.ico", false)) {
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject();
            C30226b.m61166a(jSONObject, "host", webResourceRequest.getUrl().getHost());
            C30226b.m61166a(jSONObject, "path", webResourceRequest.getUrl().getPath());
            C30226b.m61166a(jSONObject, "statusCode", null);
            C30226b.m61166a(jSONObject, "errorCode", Integer.valueOf(webResourceError.getErrorCode()));
            C12290b.m22060a("aweme_webview_assets_error", 0, jSONObject);
        }
        webStatBusinessOnReceivedError(webView, webResourceRequest, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        C40633f fVar;
        AbstractC40691e e;
        AbstractC40547m mVar = this.f95379a.f95348e;
        if (!(mVar == null || (e = mVar.mo67257e()) == null)) {
            e.mo65795a(webView, str, bitmap);
        }
        AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo65795a(webView, str, bitmap);
        }
        this.f95380b = false;
        this.f95379a.f95347d = false;
        this.f95379a.getRegistry().mo69983a(C40742g.EnumC40743a.LOAD_START);
        CrossPlatformWebView crossPlatformWebView = this.f95379a;
        C40618a crossPlatformParams = crossPlatformWebView.getCrossPlatformParams();
        if (!(crossPlatformParams == null || (fVar = crossPlatformParams.f95071d) == null || !fVar.f95160E)) {
            LineProgressBarView lineProgressBarView = (LineProgressBarView) crossPlatformWebView.mo69910a(R.id.d02);
            C89219l.m154716b(lineProgressBarView, "");
            lineProgressBarView.setVisibility(0);
            crossPlatformWebView.mo69929e();
        }
        AdWebStatBusiness webStatBusiness = this.f95379a.getWebStatBusiness();
        if (webStatBusiness != null) {
            webStatBusiness.mo69702a(webView, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65791a(WebView webView, int i, String str, String str2) {
        AbstractC40691e e;
        if (Build.VERSION.SDK_INT < 23) {
            AdWebStatBusiness webStatBusiness = this.f95379a.getWebStatBusiness();
            if (webStatBusiness != null) {
                webStatBusiness.mo69703a(webView, str2, str);
            }
            AbstractC40547m mVar = this.f95379a.f95348e;
            if (!(mVar == null || (e = mVar.mo67257e()) == null)) {
                e.mo65791a(webView, i, str, str2);
            }
            AbstractC40691e customWebViewStatus = this.f95379a.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.mo65791a(webView, i, str, str2);
            }
            this.f95380b = true;
            this.f95379a.mo69927d();
            this.f95379a.mo69915a(Integer.valueOf(i), str, str2, false);
        }
    }
}
