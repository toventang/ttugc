package com.p2082ss.android.ugc.aweme.app;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URLDecoder;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.al */
public final class C33596al {

    /* renamed from: a */
    public static final C33596al f79767a = new C33596al();

    private C33596al() {
    }

    static {
        Covode.recordClassIndex(40486);
    }

    /* renamed from: a */
    private static void m68808a(Uri uri, Intent intent) {
        intent.putExtra("share_expose_sharer", true);
        String queryParameter = uri.getQueryParameter("utm_source");
        if (queryParameter != null) {
            intent.putExtra("share_url_utm_source", queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("share_link_id");
        if (queryParameter2 != null) {
            intent.putExtra("share_url_link_id", queryParameter2);
        }
        String queryParameter3 = uri.getQueryParameter("user_id");
        if (queryParameter3 != null) {
            intent.putExtra("share_url_user_id", queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("sec_user_id");
        if (queryParameter4 != null) {
            intent.putExtra("share_sec_url_user_id", queryParameter4);
        }
        String queryParameter5 = uri.getQueryParameter("checksum");
        if (queryParameter5 != null) {
            intent.putExtra("share_url_checksum", queryParameter5);
        }
        String queryParameter6 = uri.getQueryParameter("timestamp");
        if (queryParameter6 != null) {
            intent.putExtra("share_url_timestamp", queryParameter6);
        }
    }

    /* renamed from: a */
    public static void m68809a(Uri uri, Intent intent, boolean z) {
        String str;
        if (uri != null && intent != null && !z) {
            try {
                if (!uri.isOpaque()) {
                    if (TextUtils.equals(uri.getQueryParameter("utm_campaign"), "client_share")) {
                        m68808a(uri, intent);
                    }
                    String queryParameter = uri.getQueryParameter("params_url");
                    if (queryParameter != null) {
                        str = URLDecoder.decode(queryParameter, "UTF-8");
                        C89219l.m154716b(str, "");
                    } else {
                        str = "";
                        String queryParameter2 = uri.getQueryParameter("target_url");
                        if (queryParameter2 != null) {
                            str = URLDecoder.decode(queryParameter2, "UTF-8");
                            C89219l.m154716b(str, "");
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Uri parse = Uri.parse(str);
                        if (TextUtils.equals(parse.getQueryParameter("utm_campaign"), "client_share")) {
                            C89219l.m154716b(parse, "");
                            m68808a(parse, intent);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
