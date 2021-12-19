package com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a.C38668c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.b */
public final class C38669b {

    /* renamed from: a */
    public static final C38669b f91374a = new C38669b();

    private C38669b() {
    }

    static {
        Covode.recordClassIndex(46210);
    }

    /* renamed from: a */
    public static final boolean m78459a(Context context) {
        if (context == null || GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m78463a(Uri uri) {
        C89219l.m154721d(uri, "");
        if (!C38767w.m78644a(uri)) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
            Uri parse = Uri.parse(uri.getQueryParameter("url"));
            C89219l.m154716b(parse, "");
            if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                return true;
            }
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri.getQueryParameter("id"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m78460a(Context context, Uri uri) {
        String str;
        if (context == null) {
            return false;
        }
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        if ((!C89219l.m154714a((Object) str, (Object) "market")) || !m78459a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return C38767w.m78632a(context, intent);
    }

    /* renamed from: a */
    public static final boolean m78462a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!m78459a(context)) {
            return C38668c.m78458a(context, str);
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(String.valueOf(str))));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return C38767w.m78632a(context, intent);
    }

    /* renamed from: b */
    public static final boolean m78464b(Context context, Uri uri) {
        if (!(context == null || uri == null)) {
            if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
                return m78461a(context, uri, "com.google.android.gms");
            }
            if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
                Uri parse = Uri.parse(uri.getQueryParameter("url"));
                C89219l.m154716b(parse, "");
                if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                    Uri parse2 = Uri.parse(uri.getQueryParameter("url"));
                    C89219l.m154716b(parse2, "");
                    return m78461a(context, parse2, "com.google.android.gms");
                }
            }
            if (TextUtils.equals(uri.getHost(), "play.google.com") && TextUtils.equals(uri.getPath(), "/store/apps/details") && !TextUtils.isEmpty(uri.getQueryParameter("id"))) {
                return m78461a(context, uri, "com.android.vending");
            }
        }
        return false;
    }

    /* renamed from: a */
    private static final boolean m78461a(Context context, Uri uri, String str) {
        if (!m78459a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.setData(uri);
        intent.addFlags(268435456);
        return C38767w.m78632a(context, intent);
    }
}
