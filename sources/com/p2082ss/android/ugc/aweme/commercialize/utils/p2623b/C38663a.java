package com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38223aj;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a */
public final class C38663a {

    /* renamed from: a */
    public static final C38663a f91359a = new C38663a();

    private C38663a() {
    }

    static {
        Covode.recordClassIndex(46204);
    }

    /* renamed from: a */
    private static Intent m78439a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        return intent;
    }

    /* renamed from: a */
    private static List<String> m78440a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://"));
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        C89219l.m154716b(queryIntentActivities, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) queryIntentActivities, 10));
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a$a */
    public static final class C38664a implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        final /* synthetic */ Context f91360a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f91361b;

        /* renamed from: c */
        final /* synthetic */ String f91362c;

        static {
            Covode.recordClassIndex(46205);
        }

        C38664a(Context context, AwemeRawAd awemeRawAd, String str) {
            this.f91360a = context;
            this.f91361b = awemeRawAd;
            this.f91362c = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
        public final void sendLog(boolean z) {
            if (z) {
                Context context = this.f91360a;
                AwemeRawAd awemeRawAd = this.f91361b;
                String str = this.f91362c;
                if (C38189j.m77514b(context, awemeRawAd)) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str);
                    hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
                    C38189j.m77490a(context, "deeplink_success", awemeRawAd, C38189j.m77470a(context, awemeRawAd, false, (Map<String, String>) hashMap));
                    new C38223aj.C38224a().mo66651a("draw_ad").mo66649a(System.currentTimeMillis() - 5000).mo66650a(awemeRawAd).mo66652a();
                }
                C18129a.m33746a("draw_ad", "deeplink_success", this.f91361b).mo28897a("url", this.f91362c).mo28902c();
                return;
            }
            C38189j.m77488a(this.f91360a, this.f91361b, this.f91362c, "user_canceled");
            C18129a.m33746a("draw_ad", "deeplink_failed", this.f91361b).mo28897a("url", this.f91362c).mo28897a("fail_reason", "user_canceled").mo28902c();
        }
    }

    /* renamed from: c */
    public static final boolean m78448c(Context context, Uri uri) {
        if (context == null || uri == null || !C38767w.m78644a(uri) || C89070n.m154568c((Iterable) m78450e(context, uri), (Iterable) m78440a(context)).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m78449d(Context context, Uri uri) {
        if (context == null || uri == null || C38767w.m78644a(uri) || m78450e(context, uri).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static List<String> m78450e(Context context, Uri uri) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(m78439a(uri), 65536);
        C89219l.m154716b(queryIntentActivities, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) queryIntentActivities, 10));
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m78446b(Context context, Uri uri) {
        if (context == null || uri == null || !m78449d(context, uri)) {
            return false;
        }
        Intent a = m78439a(uri);
        List<String> e = m78450e(context, uri);
        if ((!e.isEmpty()) && e != null) {
            a.setPackage((String) C89070n.m154590j(e).get(0));
            a.addFlags(268435456);
            return C38767w.m78632a(context, a);
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m78443a(Context context, Uri uri) {
        if (context == null || uri == null || !m78448c(context, uri)) {
            return false;
        }
        Intent a = m78439a(uri);
        Set c = C89070n.m154568c((Iterable) m78450e(context, uri), (Iterable) m78440a(context));
        if ((!c.isEmpty()) && c != null) {
            a.setPackage((String) C89070n.m154590j(c).get(0));
            a.addFlags(268435456);
            return C38767w.m78632a(context, a);
        }
        return false;
    }

    /* renamed from: a */
    public static final void m78441a(Context context, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(context, "");
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        m78442a(context, awemeRawAd, str);
    }

    /* renamed from: b */
    public static final void m78444b(Context context, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(context, "");
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        m78445b(context, awemeRawAd, str);
    }

    /* renamed from: a */
    public static final void m78442a(Context context, AwemeRawAd awemeRawAd, String str) {
        C89219l.m154721d(context, "");
        C38189j.m77487a(context, awemeRawAd, str);
        C18129a.m33746a("draw_ad", "open_url_app", awemeRawAd).mo28897a("url", str).mo28902c();
        C38189j.m77509b(context, awemeRawAd, str);
        C18129a.m33746a("draw_ad", "deeplink_failed", awemeRawAd).mo28897a("url", str).mo28897a("fail_reason", "app_uninstalled").mo28902c();
    }

    /* renamed from: b */
    public static final void m78445b(Context context, AwemeRawAd awemeRawAd, String str) {
        C89219l.m154721d(context, "");
        C38189j.m77487a(context, awemeRawAd, str);
        C18129a.m33746a("draw_ad", "open_url_app", awemeRawAd).mo28897a("url", str).mo28902c();
        C38767w.m78630a(new C38664a(context, awemeRawAd, str));
    }

    /* renamed from: c */
    public static final void m78447c(Context context, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(context, "");
        AwemeRawAd awemeRawAd2 = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C38189j.m77488a(context, awemeRawAd, str, "allowlist_not_found");
        if (aweme != null) {
            awemeRawAd2 = aweme.getAwemeRawAd();
        }
        C18129a.m33746a("draw_ad", "deeplink_failed", awemeRawAd2).mo28897a("url", str).mo28897a("fail_reason", "allowlist_not_found").mo28902c();
    }
}
