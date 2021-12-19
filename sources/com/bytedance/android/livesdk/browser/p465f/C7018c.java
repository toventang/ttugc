package com.bytedance.android.livesdk.browser.p465f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.livesdk.livesetting.hybrid.WebviewNativeImageLoadingSetting;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.browser.f.c */
public final class C7018c implements AbstractC7017b {
    static {
        Covode.recordClassIndex(7757);
    }

    @Override // com.bytedance.android.livesdk.browser.p465f.AbstractC7017b
    /* renamed from: a */
    public final WebResourceResponse mo13326a(Uri uri, WebView webView) {
        String path;
        String str;
        C89219l.m154721d(uri, "");
        C89219l.m154721d(webView, "");
        if (!WebviewNativeImageLoadingSetting.INSTANCE.getValue() || (path = uri.getPath()) == null) {
            return null;
        }
        C89219l.m154716b(path, "");
        if (C89361p.m154876c(path, "jpg", false) || C89361p.m154876c(path, "jpeg", false)) {
            str = "image/jpeg";
        } else if (C89361p.m154876c(path, "png", false)) {
            str = "image/png";
        } else if (C89361p.m154876c(path, "gif", false)) {
            str = "image/gif";
        } else if (!C89361p.m154876c(path, "ico", false)) {
            return null;
        } else {
            str = "image/x-icon";
        }
        InputStream b = C3941k.m9614b(uri);
        if (b != null) {
            return new WebResourceResponse(str, "", b);
        }
        return null;
    }
}
