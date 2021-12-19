package com.bytedance.android.livesdk.browser.p465f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.hybrid.WebOfflineEnabledSetting;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.f.e */
public final class C7020e implements AbstractC7017b {
    static {
        Covode.recordClassIndex(7759);
    }

    @Override // com.bytedance.android.livesdk.browser.p465f.AbstractC7017b
    /* renamed from: a */
    public final WebResourceResponse mo13326a(Uri uri, WebView webView) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(webView, "");
        if (!WebOfflineEnabledSetting.INSTANCE.getValue()) {
            return null;
        }
        return ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18881a(webView, uri.toString());
    }
}
