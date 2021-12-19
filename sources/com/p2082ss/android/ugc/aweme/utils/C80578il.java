package com.p2082ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.il */
public final class C80578il {
    static {
        Covode.recordClassIndex(93851);
    }

    /* renamed from: a */
    public static Uri m139673a(Uri uri) {
        if (uri == null || !TextUtils.equals(uri.getHost(), "webview") || uri.getQueryParameter("url") == null) {
            return null;
        }
        return Uri.parse(uri.getQueryParameter("url"));
    }

    /* renamed from: a */
    public static String m139674a(Uri uri, String str) {
        if (uri == null || uri.isOpaque()) {
            return null;
        }
        return uri.getQueryParameter(str);
    }
}
