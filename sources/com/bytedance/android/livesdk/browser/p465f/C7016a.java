package com.bytedance.android.livesdk.browser.p465f;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.livesdk.browser.f.a */
final class C7016a implements AbstractC7017b {
    static {
        Covode.recordClassIndex(7755);
    }

    C7016a() {
    }

    @Override // com.bytedance.android.livesdk.browser.p465f.AbstractC7017b
    /* renamed from: a */
    public final WebResourceResponse mo13326a(Uri uri, WebView webView) {
        MethodCollector.m26663i(7162);
        if (!TextUtils.equals(uri.getScheme(), "liveresource") || !TextUtils.equals(uri.getHost(), "file")) {
            MethodCollector.m26664o(7162);
            return null;
        }
        String queryParameter = uri.getQueryParameter("path");
        if (TextUtils.isEmpty(queryParameter)) {
            MethodCollector.m26664o(7162);
            return null;
        }
        File file = new File(queryParameter);
        if (!file.exists()) {
            MethodCollector.m26664o(7162);
            return null;
        }
        try {
            WebResourceResponse webResourceResponse = new WebResourceResponse("", "", new FileInputStream(file));
            MethodCollector.m26664o(7162);
            return webResourceResponse;
        } catch (FileNotFoundException unused) {
            MethodCollector.m26664o(7162);
            return null;
        }
    }
}
