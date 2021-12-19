package com.bytedance.ies.bullet.kit.web;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import com.C1764a;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.bytedance.ies.web.jsbridge2.AbstractC18359s;
import com.bytedance.webx.p1756e.p1757a.C23586c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public class SSWebView extends C23586c implements AbstractC18359s {

    /* renamed from: a */
    public boolean f39512a;

    /* renamed from: b */
    private AbstractC12021c f39513b;

    /* renamed from: c */
    private final String f39514c;

    /* renamed from: d */
    private final int f39515d;

    /* renamed from: e */
    private final int f39516e;

    /* renamed from: f */
    private int f39517f;

    /* renamed from: g */
    private long f39518g;

    /* renamed from: h */
    private long f39519h;

    /* renamed from: i */
    private AbstractC16469b f39520i;

    /* renamed from: j */
    private AbstractC16468a f39521j;

    /* renamed from: k */
    private AbstractC16470c f39522k;

    /* renamed from: l */
    private String f39523l;

    /* renamed from: com.bytedance.ies.bullet.kit.web.SSWebView$a */
    public interface AbstractC16468a {
        static {
            Covode.recordClassIndex(18898);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.SSWebView$b */
    public interface AbstractC16469b {
        static {
            Covode.recordClassIndex(18899);
        }

        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(18897);
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
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

    public final AbstractC12021c getMonitorHelper() {
        return this.f39513b;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18359s
    public String getSafeUrl() {
        return this.f39523l;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    private boolean m30561y() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
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

    public final int getTimeInterval() {
        int i = this.f39517f;
        if (i > 0) {
            return i;
        }
        return this.f39516e;
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void destroy() {
        try {
            AbstractC12021c cVar = this.f39513b;
            if (cVar != null) {
                cVar.mo19247l(this);
            }
            super.destroy();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void onAttachedToWindow() {
        try {
            AbstractC12021c cVar = this.f39513b;
            if (cVar != null) {
                cVar.mo19250r(this);
            }
            super.onAttachedToWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void reload() {
        try {
            AbstractC12021c cVar = this.f39513b;
            if (cVar != null) {
                cVar.mo19248n(this);
            }
            super.reload();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo26119a() {
        AbstractC16470c cVar = this.f39522k;
        if (cVar != null) {
            try {
                return cVar.mo26166a();
            } catch (C16614as unused) {
            }
        }
        if (System.currentTimeMillis() - this.f39519h < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo26120b() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        C89219l.m154709a((Object) copyBackForwardList, "");
        if (copyBackForwardList.getCurrentIndex() >= 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public boolean canGoBack() {
        if (!m30561y() || !C84365i.m145120a(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void goBack() {
        if (!C84365i.m145121b(this)) {
            try {
                AbstractC12021c cVar = this.f39513b;
                if (cVar != null) {
                    cVar.mo19249p(this);
                }
                super.goBack();
            } catch (Exception unused) {
            }
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
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

    public final void setCanTouch(boolean z) {
        this.f39512a = z;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public final void setMonitorHelper(AbstractC12021c cVar) {
        this.f39513b = cVar;
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public final void setPageStartUrl(String str) {
        this.f39523l = str;
    }

    public final void setTimeInterval(int i) {
        this.f39517f = i;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a, com.bytedance.webx.p1756e.p1757a.C23586c
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public final void setWebOverScrollByListener(AbstractC16468a aVar) {
        this.f39521j = aVar;
    }

    public final void setWebScrollListener(AbstractC16469b bVar) {
        this.f39520i = bVar;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void setWebViewEventDelegate(AbstractC16470c cVar) {
        C89219l.m154719c(cVar, "");
        this.f39522k = cVar;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.SSWebView$c */
    public interface AbstractC16470c {
        static {
            Covode.recordClassIndex(18900);
        }

        /* renamed from: a */
        boolean mo26166a();

        /* renamed from: a */
        boolean mo26167a(MotionEvent motionEvent);

        /* renamed from: a */
        boolean mo26168a(boolean z);

        /* renamed from: com.bytedance.ies.bullet.kit.web.SSWebView$c$a */
        public static final class C16471a {
            static {
                Covode.recordClassIndex(18901);
            }

            /* renamed from: a */
            public static boolean m30567a(MotionEvent motionEvent) {
                C89219l.m154719c(motionEvent, "");
                throw new C16614as("An operation is not implemented");
            }
        }
    }

    public boolean canScrollVertically(int i) {
        AbstractC16470c cVar = this.f39522k;
        if (cVar != null) {
            try {
                return cVar.mo26168a(super.canScrollVertically(i));
            } catch (C16614as unused) {
            }
        }
        return super.canScrollVertically(i);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void loadUrl(String str) {
        String a = C84365i.f188614a.mo129370a(this, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        C89219l.m154719c(str, "");
        try {
            AbstractC12021c cVar = this.f39513b;
            if (cVar != null) {
                cVar.mo19245g(this, str);
            }
            super.loadUrl(str);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context) {
        this(context, null, 6, (byte) 0);
        if (C84367b.m145126a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C1764a.m5930a(settings, sb.toString());
            }
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154719c(motionEvent, "");
        AbstractC16470c cVar = this.f39522k;
        if (cVar != null) {
            try {
                return cVar.mo26167a(motionEvent);
            } catch (C16614as unused) {
            }
        }
        if (!this.f39512a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f39518g = System.currentTimeMillis();
        } else if (action == 1 && System.currentTimeMillis() - this.f39518g < ((long) this.f39515d)) {
            this.f39519h = System.currentTimeMillis();
            ViewConfiguration.getTapTimeout();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a, com.bytedance.webx.p1756e.p1757a.C23586c
    public void setWebViewClient(WebViewClient webViewClient) {
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

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void postUrl(String str, byte[] bArr) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(bArr, "");
        try {
            super.postUrl(str, bArr);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, com.bytedance.webx.p1756e.p1757a.C23586c
    public void loadUrl(String str, Map map) {
        String a = C84365i.f188614a.mo129370a(this, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        try {
            AbstractC12021c cVar = this.f39513b;
            if (cVar != null) {
                cVar.mo19245g(this, str);
            }
            super.loadUrl(str, map);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void loadData(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        String simpleName = SSWebView.class.getSimpleName();
        C89219l.m154709a((Object) simpleName, "");
        this.f39514c = simpleName;
        this.f39515d = 100;
        this.f39516e = 500;
        this.f39517f = 500;
        this.f39512a = true;
        if (C84367b.m145126a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C1764a.m5930a(settings, sb.toString());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SSWebView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC16469b bVar = this.f39520i;
        if (bVar != null) {
            bVar.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154719c(str2, "");
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
