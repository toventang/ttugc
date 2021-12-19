package com.bytedance.ies.web.jsbridge2;

import android.os.Build;
import android.webkit.WebView;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.web.jsbridge2.l */
public final /* synthetic */ class RunnableC18346l implements Runnable {

    /* renamed from: a */
    private final WebView f43906a;

    static {
        Covode.recordClassIndex(21018);
    }

    RunnableC18346l(WebView webView) {
        this.f43906a = webView;
    }

    public final void run() {
        Toast makeText = Toast.makeText(this.f43906a.getContext(), "【Security】\nThe current JSB authentication has security risks!\nPlease implement the ISafeWebView interface of JsBridge2\n", 1);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
    }
}
