package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.web.jsbridge2.AbstractC18359s;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49498ad;
import com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SSWebView extends WebView implements AbstractC18359s {
    private String pageStartUrl;

    static {
        Covode.recordClassIndex(7990);
    }

    static /* synthetic */ void access$000(WebView webView, String str, Map map) {
        MethodCollector.m26663i(6637);
        super.loadUrl(str, map);
        MethodCollector.m26664o(6637);
    }

    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18359s
    public String getSafeUrl() {
        return this.pageStartUrl;
    }

    public void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setPageStartUrl(String str) {
        this.pageStartUrl = str;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            m15157x1961f159(this, webViewClient);
        } catch (Exception unused) {
        }
    }

    private static boolean isSafeHost(String str) {
        return C6935a.m14805a(str);
    }

    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public SSWebView(Context context) {
        super(context);
        MethodCollector.m26663i(6483);
        MethodCollector.m26664o(6483);
    }

    public void loadUrl(String str) {
        try {
            String filterUrl = filterUrl(str);
            m15158x52e5794e(this, filterUrl, requestHeader(filterUrl, null));
        } catch (Exception unused) {
        }
    }

    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String filterUrl(String str) {
        boolean z;
        MethodCollector.m26663i(6651);
        Context context = getContext();
        if (context != null) {
            if (C13627m.m24498a(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C22898a.m43150a(context);
                str = C22898a.m43153e(str);
            }
        }
        try {
            if (((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest() && getContext().getAssets() != null && getContext().getAssets().list("") != null && Arrays.asList(getContext().getAssets().list("")).contains("ttnet_config.json")) {
                str = tryReplaceUrlToBoe(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        syncCookie(str);
        MethodCollector.m26664o(6651);
        return str;
    }

    private void syncCookie(String str) {
        String str2;
        String[] split;
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        List<String> a = ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18885a(str);
        C3854a.m9453a(3, "Cookie_Share", "url:".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = "";
        }
        if (!(a == null || str2 == null)) {
            for (int i = 0; i < a.size(); i++) {
                String str3 = a.get(i);
                for (String str4 : str3.split(";")) {
                    String replace = str4.replace(" ", "");
                    m15156x67b8c4f9(instance, str2, replace);
                    C3854a.m9453a(3, "Cookie_Share", "set cookie:".concat(String.valueOf(replace)));
                }
                C3854a.m9453a(3, "Cookie_Share", "cookies:".concat(String.valueOf(str3)));
            }
        }
    }

    private String tryReplaceUrlToBoe(String str) {
        if (str == null) {
            return str;
        }
        try {
            URI create = URI.create(str);
            create.getHost();
            if (C13627m.m24498a("")) {
                return str;
            }
            String scheme = create.getScheme();
            int port = create.getPort();
            String rawPath = create.getRawPath();
            String rawQuery = create.getRawQuery();
            String rawFragment = create.getRawFragment();
            StringBuilder sb = new StringBuilder();
            if (scheme != null) {
                sb.append(scheme);
                sb.append("://");
            }
            sb.append("");
            if (port > 0) {
                sb.append(':');
                sb.append(port);
            }
            if (rawPath == null || !rawPath.startsWith("/")) {
                sb.append('/');
            }
            if (rawPath != null) {
                sb.append(rawPath);
            }
            if (rawQuery != null) {
                sb.append('?');
                sb.append(rawQuery);
            }
            if (rawFragment != null) {
                sb.append('#');
                sb.append(rawFragment);
            }
            return new URI(sb.toString()).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (Exception unused) {
        }
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(filterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(6485);
        MethodCollector.m26664o(6485);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        try {
            String filterUrl = filterUrl(str);
            m15158x52e5794e(this, filterUrl, requestHeader(filterUrl, map));
        } catch (Exception unused) {
        }
    }

    /* renamed from: com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient */
    public static void m15157x1961f159(WebView webView, WebViewClient webViewClient) {
        if (C84367b.m145126a() && webViewClient != null) {
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
        super.setWebViewClient(webViewClient);
    }

    private static Map<String, String> requestHeader(String str, Map<String, String> map) {
        Map<String, String> emptyMap;
        if (isSafeHost(str)) {
            emptyMap = ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18888b(str);
        } else {
            emptyMap = Collections.emptyMap();
        }
        if (emptyMap == null || emptyMap.isEmpty()) {
            return map;
        }
        if (map == null || map.isEmpty()) {
            return emptyMap;
        }
        HashMap hashMap = new HashMap(map);
        for (Map.Entry<String, String> entry : emptyMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    /* renamed from: com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl */
    public static void m15158x52e5794e(WebView webView, String str, Map map) {
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        access$000(webView, str, map);
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(6635);
        MethodCollector.m26664o(6635);
    }

    /* renamed from: com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_setCookie */
    public static void m15156x67b8c4f9(CookieManager cookieManager, String str, String str2) {
        String cookie;
        cookieManager.setCookie(str, str2);
        if (C29843f.m60129a(C17879g.m33104a()) && C49498ad.m92737a() && (cookie = CookieManager.getInstance().getCookie(C49540a.m92781a())) != null && !TextUtils.equals(cookie, C49540a.m92784b())) {
            C49540a.m92783a(C49540a.m92781a(), cookie);
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
