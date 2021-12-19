package com.p2082ss.android.ugc.aweme.ecommercelive.business.p2865a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.a.b */
public final class C45682b {
    static {
        Covode.recordClassIndex(54196);
    }

    /* renamed from: a */
    private static String m88190a(String str, C45681a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        try {
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("trackParams", m88191b(parse.getQueryParameter("trackParams"), aVar));
            return buildUpon.build().toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m88191b(java.lang.String r2, com.p2082ss.android.ugc.aweme.ecommercelive.business.p2865a.C45681a r3) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.business.p2865a.C45682b.m88191b(java.lang.String, com.ss.android.ugc.aweme.ecommercelive.business.a.a):java.lang.String");
    }

    /* renamed from: a */
    public static final String m88189a(int i, String str, C45681a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        if (i == 5 || i == 6) {
            try {
                Uri parse = Uri.parse(str);
                Uri.Builder builder = new Uri.Builder();
                C89219l.m154716b(parse, "");
                builder.scheme(parse.getScheme());
                builder.authority(parse.getHost());
                builder.path(parse.getPath());
                for (String str2 : parse.getQueryParameterNames()) {
                    if (!C89219l.m154714a((Object) str2, (Object) "trackParams")) {
                        builder.appendQueryParameter(str2, parse.getQueryParameter(str2));
                    }
                }
                builder.appendQueryParameter("trackParams", m88191b(parse.getQueryParameter("trackParams"), aVar));
                builder.appendQueryParameter("fullScreen", "false");
                return builder.build().toString();
            } catch (Exception unused) {
                return str;
            }
        } else if (i == 100) {
            return m88190a(str, aVar);
        } else {
            return str;
        }
    }
}
