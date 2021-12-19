package com.bytedance.android.live.core.p218f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URLDecoder;
import java.util.Set;

/* renamed from: com.bytedance.android.live.core.f.af */
public final class C3906af {
    static {
        Covode.recordClassIndex(4435);
    }

    /* renamed from: c */
    private static String m9540c(Uri uri, String str) {
        String decode;
        try {
            try {
                decode = URLDecoder.decode(uri.getQueryParameter(str), "UTF-8");
                return decode;
            } catch (Exception unused) {
                return decode;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m9538a(Uri uri, String str) {
        String c = m9540c(uri, str);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        if ("1".equals(c) || "true".equals(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Uri m9539b(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!str2.equals(str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return clearQuery.build();
    }
}
