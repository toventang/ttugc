package com.p2082ss.android.ugc.aweme.app.p2330h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.C15531c;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47962l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.h.a */
public final class C33758a implements IInterceptor, C36125t.AbstractC36130b {

    /* renamed from: a */
    private boolean f79968a;

    /* renamed from: b */
    private boolean f79969b;

    /* renamed from: c */
    private boolean f79970c;

    static {
        Covode.recordClassIndex(40653);
    }

    /* renamed from: a */
    private static Bundle m69102a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.C36125t.AbstractC36130b
    /* renamed from: a */
    public final String mo59992a(String str) {
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://ame/webview/"))) {
            Uri parse = Uri.parse(str);
            if (!(parse == null || parse.getQueryParameter("rn_schema") == null)) {
                return Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString();
            }
        } else if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            str = "aweme://webview/?url=" + Uri.encode(str);
        }
        if (C47962l.m90953a(str)) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        boolean z;
        String url = routeIntent.getUrl();
        if (!TextUtils.isEmpty(routeIntent.getUrl())) {
            if (url.startsWith("aweme://webview") || url.startsWith("aweme://ame/webview/")) {
                Uri parse = Uri.parse(url);
                String queryParameter = parse.getQueryParameter("url");
                if (queryParameter != null) {
                    z = TextUtils.equals(Uri.parse(Uri.decode(queryParameter)).getQueryParameter("use_spark"), "1");
                } else {
                    z = false;
                }
                if (TextUtils.equals(parse.getQueryParameter("use_spark"), "1") || z) {
                    this.f79970c = true;
                    return true;
                } else if (TextUtils.equals(parse.getQueryParameter("hybrid_sdk_version"), "bullet")) {
                    this.f79969b = true;
                    return true;
                } else if (parse.getQueryParameter("rn_schema") != null) {
                    routeIntent.setUrl(Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString());
                    return true;
                }
            } else if (url.startsWith("http://") || url.startsWith("https://")) {
                routeIntent.setUrl("aweme://webview/?url=" + Uri.encode(url));
                Uri parse2 = Uri.parse(url);
                if (parse2 != null && TextUtils.equals(parse2.getQueryParameter("use_spark"), "1")) {
                    this.f79970c = true;
                }
                return true;
            } else if (url.startsWith("aweme://reactnative/")) {
                Uri parse3 = Uri.parse(url);
                if (parse3 != null && TextUtils.equals(parse3.getQueryParameter("hybrid_sdk_version"), "bullet")) {
                    this.f79969b = true;
                    return true;
                }
            } else if (url.startsWith("aweme://lynxview")) {
                Uri parse4 = Uri.parse(url);
                if (parse4 == null || !TextUtils.equals(parse4.getQueryParameter("use_spark"), "1")) {
                    this.f79969b = true;
                } else {
                    this.f79970c = true;
                }
                return true;
            }
        }
        boolean a = C47962l.m90953a(url);
        this.f79968a = a;
        if (a) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (this.f79968a) {
            this.f79968a = false;
            return true;
        } else if (this.f79969b) {
            this.f79969b = false;
            if (routeIntent.getExtra() != null) {
                C34963b.m71412a(context, routeIntent.getUrl(), m69102a(routeIntent.getExtra()));
            } else {
                String url = routeIntent.getUrl();
                C89219l.m154721d(context, "");
                C89219l.m154721d(url, "");
                C34963b.m71413a(context, url, null, null);
            }
            return true;
        } else if (!this.f79970c) {
            return false;
        } else {
            this.f79970c = false;
            SparkContext sparkContext = new SparkContext();
            sparkContext.mo25238a(routeIntent.getUrl());
            C15531c.C15532a.m28665a(context, sparkContext).mo25316a();
            return true;
        }
    }
}
