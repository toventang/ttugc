package com.p2082ss.android.newmedia.p2167e.p2168a;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.C0783m;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.Map;

/* renamed from: com.ss.android.newmedia.e.a.d */
public class C30140d extends WebView implements AbstractC0780j {
    private static final String TAG = C30140d.class.getSimpleName();
    public boolean canTouch = true;
    private long lastCickTime;
    private C0783m mChildHelper;
    private int mLastY;
    private int mNestedOffsetY;
    private int[] mScrollConsumed;
    private int[] mScrollOffset;
    private long startClickTime;
    private int timeInterval = 500;

    static /* synthetic */ void access$000(WebView webView, String str, Map map) {
        MethodCollector.m26663i(11891);
        super.loadUrl(str, map);
        MethodCollector.m26664o(11891);
    }

    static /* synthetic */ void access$001(WebView webView, String str) {
        MethodCollector.m26663i(12028);
        super.loadUrl(str);
        MethodCollector.m26664o(12028);
    }

    /* renamed from: com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m60963xde75612b(String str, String str2) {
        return 0;
    }

    private String fileterUrl(String str) {
        return str;
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

    public int getTimeInterval() {
        int i = this.timeInterval;
        if (i > 0) {
            return i;
        }
        return 500;
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.mo2905a(0);
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.f2940a;
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public void stopNestedScroll() {
        this.mChildHelper.mo2910b(0);
    }

    static {
        Covode.recordClassIndex(36639);
    }

    private void initNestedScrolling() {
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mChildHelper = new C0783m(this);
        setNestedScrollingEnabled(false);
    }

    public boolean hasClickInTimeInterval() {
        long currentTimeMillis = System.currentTimeMillis() - this.lastCickTime;
        m60963xde75612b(TAG, "interval:".concat(String.valueOf(currentTimeMillis)));
        if (currentTimeMillis < ((long) getTimeInterval())) {
            return true;
        }
        return false;
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

    public void setCanTouch(boolean z) {
        this.canTouch = z;
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

    public void setTimeInterval(int i) {
        this.timeInterval = i;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            m60964x98866cd0(this, webViewClient);
        } catch (Exception unused) {
        }
    }

    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public void loadUrl(String str) {
        try {
            m60965x986aa877(this, fileterUrl(str));
        } catch (Exception unused) {
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.mo2902a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.mChildHelper.mo2906a(i, 0);
    }

    public C30140d(Context context) {
        super(context);
        MethodCollector.m26663i(11718);
        initNestedScrolling();
        MethodCollector.m26664o(11718);
    }

    private boolean isHttpUrl(String str) {
        if (C13627m.m24498a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public boolean nestedTouch(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedOffsetY = 0;
        }
        int y = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, (float) this.mNestedOffsetY);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.mLastY - y;
                    if (dispatchNestedPreScroll(0, i, this.mScrollConsumed, this.mScrollOffset)) {
                        i -= this.mScrollConsumed[1];
                        this.mNestedOffsetY += this.mScrollOffset[1];
                    }
                    int scrollY = getScrollY();
                    this.mLastY = y - this.mScrollOffset[1];
                    int max = Math.max(0, scrollY + i) - scrollY;
                    if (dispatchNestedScroll(0, max, 0, i - max, this.mScrollOffset)) {
                        int i2 = this.mLastY;
                        int[] iArr = this.mScrollOffset;
                        this.mLastY = i2 - iArr[1];
                        this.mNestedOffsetY += iArr[1];
                    }
                } else if (!(actionMasked == 3 || actionMasked == 5)) {
                    return false;
                }
            }
            stopNestedScroll();
        } else {
            this.mLastY = y;
            startNestedScroll(2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.canTouch) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.startClickTime = System.currentTimeMillis();
                m60963xde75612b(TAG, "startClickTime" + this.startClickTime);
            } else if (action == 1) {
                long currentTimeMillis = System.currentTimeMillis() - this.startClickTime;
                String str = TAG;
                m60963xde75612b(str, "clickDuration".concat(String.valueOf(currentTimeMillis)));
                if (currentTimeMillis < 100) {
                    this.lastCickTime = System.currentTimeMillis();
                    m60963xde75612b(str, "lastCickTime:" + this.lastCickTime + "TapTimeout():" + ViewConfiguration.getTapTimeout());
                }
            }
            try {
                return nestedTouch(motionEvent);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.mo2903a(f, f2);
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(fileterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        try {
            m60966x986aa877(this, fileterUrl(str), map);
        } catch (Exception unused) {
        }
    }

    /* renamed from: com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl */
    public static void m60965x986aa877(WebView webView, String str) {
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        access$001(webView, str);
    }

    public C30140d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11719);
        initNestedScrolling();
        MethodCollector.m26664o(11719);
    }

    /* renamed from: com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient */
    public static void m60964x98866cd0(WebView webView, WebViewClient webViewClient) {
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

    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.mo2904a(f, f2, z);
    }

    /* renamed from: com_ss_android_newmedia_ui_webview_SSWebView_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl */
    public static void m60966x986aa877(WebView webView, String str, Map map) {
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        access$000(webView, str, map);
    }

    public C30140d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(11720);
        initNestedScrolling();
        MethodCollector.m26664o(11720);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mChildHelper.mo2908a(i, i2, iArr, iArr2);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.mo2907a(i, i2, i3, i4, iArr);
    }
}
