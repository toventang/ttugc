package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.p2163a.C30123b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.services.IWebViewTweaker;

/* renamed from: com.ss.android.ugc.aweme.services.WebViewTweakerService */
public final class WebViewTweakerService implements IWebViewTweaker {
    static {
        Covode.recordClassIndex(79744);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IWebViewTweaker
    public final void clearWebviewOnDestroy(WebView webView) {
        C30123b.m60933a(webView);
    }

    public static IWebViewTweaker createIWebViewTweakerbyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(9582);
        Object a = C81908b.m141854a(IWebViewTweaker.class, z);
        if (a != null) {
            IWebViewTweaker iWebViewTweaker = (IWebViewTweaker) a;
            MethodCollector.m26664o(9582);
            return iWebViewTweaker;
        }
        if (C81908b.f183304dA == null) {
            synchronized (IWebViewTweaker.class) {
                try {
                    if (C81908b.f183304dA == null) {
                        C81908b.f183304dA = new WebViewTweakerService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9582);
                    throw th;
                }
            }
        }
        WebViewTweakerService webViewTweakerService = (WebViewTweakerService) C81908b.f183304dA;
        MethodCollector.m26664o(9582);
        return webViewTweakerService;
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IWebViewTweaker
    public final void tweakPauseIfFinishing(Context context, WebView webView) {
        C30123b.m60932a(context, webView);
    }
}
