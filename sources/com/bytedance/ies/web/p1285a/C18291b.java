package com.bytedance.ies.web.p1285a;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.Map;

/* renamed from: com.bytedance.ies.web.a.b */
public final class C18291b extends WebView {

    /* renamed from: a */
    public boolean f43665a;

    /* renamed from: b */
    private AbstractC18296g f43666b;

    static {
        Covode.recordClassIndex(20962);
    }

    public final void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public final void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public final void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public final void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public final void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private boolean m34028a() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public final int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public final String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public final String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void goBack() {
        if (!C84365i.m145121b(this)) {
            try {
                super.goBack();
            } catch (Exception unused) {
            }
        }
    }

    public final boolean canGoBack() {
        if (!m34028a() || !C84365i.m145120a(this)) {
            return false;
        }
        return true;
    }

    public final void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public final void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public final void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public final void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public final void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public final void setWebViewUrlFilter(AbstractC18296g gVar) {
        this.f43666b = gVar;
    }

    public final boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private String m34027a(String str) {
        AbstractC18296g gVar = this.f43666b;
        if (gVar != null) {
            return gVar.mo29291a();
        }
        return str;
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        boolean z;
        try {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient != null) {
                z = true;
            } else {
                z = false;
            }
            this.f43665a = z;
        } catch (Exception unused) {
            this.f43665a = false;
        }
    }

    public final void loadUrl(String str) {
        MethodCollector.m26663i(396);
        String a = C84365i.f188614a.mo129370a(this, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        try {
            String a2 = m34027a(str);
            String a3 = C84357h.f188595a.mo129370a(this, a2);
            if (!TextUtils.isEmpty(a3)) {
                a2 = a3;
            }
            super.loadUrl(a2);
            MethodCollector.m26664o(396);
        } catch (Exception unused) {
            MethodCollector.m26664o(396);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (C84367b.m145126a() && webViewClient != null) {
                WebSettings settings = getSettings();
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
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public final void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(m34027a(str), bArr);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        MethodCollector.m26663i(390);
        String a = C84365i.f188614a.mo129370a(this, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        try {
            String a2 = m34027a(str);
            String a3 = C84357h.f188595a.mo129370a(this, a2);
            if (!TextUtils.isEmpty(a3)) {
                a2 = a3;
            }
            super.loadUrl(a2, map);
            MethodCollector.m26664o(390);
        } catch (Exception unused) {
            MethodCollector.m26664o(390);
        }
    }

    public final void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
