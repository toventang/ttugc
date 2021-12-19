package com.p2082ss.android.ugc.aweme.framework.services;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IWebViewTweaker */
public interface IWebViewTweaker {
    static {
        Covode.recordClassIndex(60673);
    }

    void clearWebviewOnDestroy(WebView webView);

    void tweakPauseIfFinishing(Context context, WebView webView);
}
