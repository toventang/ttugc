package net.openid.appauth.p4651c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import net.openid.appauth.C90009p;

/* renamed from: net.openid.appauth.c.b */
public final class C89980b {
    static {
        Covode.recordClassIndex(106151);
    }

    /* renamed from: a */
    private static String m156129a(String str) {
        C90009p.m156197a(str);
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("Unable to encode using UTF-8");
        }
    }

    /* renamed from: a */
    public static String m156130a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + m156129a(entry.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    /* renamed from: a */
    public static Long m156128a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Long.valueOf(Long.parseLong(queryParameter));
        }
        return null;
    }

    /* renamed from: a */
    public static void m156131a(Uri.Builder builder, String str, Object obj) {
        if (obj != null && obj.toString() != null) {
            builder.appendQueryParameter(str, obj.toString());
        }
    }
}
