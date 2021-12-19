package com.p2082ss.android.ugc.aweme.deeplink.p2731a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41059q;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import com.p2082ss.android.ugc.aweme.qrcode.C66416k;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.deeplink.a.c */
public final class C41001c extends AbstractC40998a {
    static {
        Covode.recordClassIndex(48864);
    }

    /* renamed from: c */
    private static int m82617c(Uri uri) {
        uri.getHost();
        String b = C36132v.m73608b(uri.toString(), "schema_type");
        if (!TextUtils.isEmpty(b)) {
            try {
                return Integer.parseInt(b);
            } catch (NumberFormatException unused) {
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (C13603b.m24435a((Collection) pathSegments) || pathSegments.size() < 3 || !TextUtils.equals("share", pathSegments.get(0))) {
            return 0;
        }
        pathSegments.get(2);
        return C66416k.f149319a.mo105288a(pathSegments.get(1));
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2731a.AbstractC40998a
    /* renamed from: a */
    public final Uri mo70209a(Uri uri) {
        Uri uri2 = null;
        if (uri.toString().contains("microapp") || uri.toString().contains("microgame")) {
            String b = C41059q.C41060a.m82719b(uri.toString());
            if (TextUtils.isEmpty(b) || TextUtils.equals(uri.toString(), b)) {
                try {
                    uri2 = m82616b(uri);
                    return uri2;
                } catch (Exception unused) {
                    return uri2;
                }
            } else {
                Uri parse = Uri.parse(b);
                if (!uri.getBooleanQueryParameter("backurl", false)) {
                    return parse;
                }
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.appendQueryParameter("backurl", uri.getQueryParameter("backurl"));
                return buildUpon.build();
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("redirect_url"))) {
            return m82616b(uri);
        } else {
            try {
                uri2 = Uri.parse(uri.getQueryParameter("redirect_url"));
                return uri2;
            } catch (Exception e) {
                e.printStackTrace();
                return uri2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011b, code lost:
        if (m82617c(r14) == 16) goto L_0x0109;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri m82616b(android.net.Uri r14) {
        /*
        // Method dump skipped, instructions count: 515
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.deeplink.p2731a.C41001c.m82616b(android.net.Uri):android.net.Uri");
    }

    /* renamed from: a */
    private static String m82615a(Uri uri, String str) {
        String path = uri.getPath();
        int indexOf = path.indexOf(str) + str.length();
        return path.substring(indexOf, path.indexOf("/", indexOf));
    }
}
