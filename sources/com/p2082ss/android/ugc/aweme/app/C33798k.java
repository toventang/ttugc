package com.p2082ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41058p;

/* renamed from: com.ss.android.ugc.aweme.app.k */
public final class C33798k {

    /* renamed from: a */
    private C41058p f80044a;

    /* renamed from: b */
    private final String f80045b = "webview";

    static {
        Covode.recordClassIndex(40695);
    }

    public C33798k(C41058p pVar) {
        this.f80044a = pVar;
    }

    /* renamed from: a */
    public final Uri mo60037a(Activity activity, Uri uri) {
        Uri parse;
        String queryParameter = uri.getQueryParameter("gd_label");
        String queryParameter2 = uri.getQueryParameter("utm_source");
        String host = uri.getHost();
        if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.equals(host, "webview") && uri.getQueryParameter("url") != null && (parse = Uri.parse(uri.getQueryParameter("url"))) != null) {
            queryParameter = parse.getQueryParameter("gd_label");
            queryParameter2 = parse.getQueryParameter("utm_source");
        }
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra("al_applink_data")) {
            this.f80044a.mo70265a("link_direct");
            this.f80044a.mo70266b("fb");
            this.f80044a.mo70268d("facebook");
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            this.f80044a.mo70265a(queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            this.f80044a.mo70268d(queryParameter2);
        } else {
            String queryParameter3 = uri.getQueryParameter("params_url");
            if (!TextUtils.isEmpty(queryParameter3)) {
                String queryParameter4 = Uri.parse(queryParameter3).getQueryParameter("utm_source");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    this.f80044a.mo70268d(queryParameter4);
                }
            }
        }
        return uri;
    }
}
