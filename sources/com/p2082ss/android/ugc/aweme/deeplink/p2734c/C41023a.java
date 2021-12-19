package com.p2082ss.android.ugc.aweme.deeplink.p2734c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41035d;
import com.p2082ss.android.ugc.aweme.deeplink.C41050m;
import com.p2082ss.android.ugc.aweme.deeplink.C41051n;
import com.p2082ss.android.ugc.aweme.deeplink.C41058p;
import com.p2082ss.android.ugc.aweme.deeplink.C41059q;
import com.p2082ss.android.ugc.aweme.deeplink.C41065u;
import com.p2082ss.android.ugc.aweme.deeplink.p2731a.AbstractC40998a;
import com.p2082ss.android.ugc.aweme.deeplink.p2731a.C40999b;
import com.p2082ss.android.ugc.aweme.deeplink.p2731a.C41001c;
import com.p2082ss.android.ugc.aweme.deeplink.p2731a.C41002d;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.c.a */
public final class C41023a extends AbstractC41025b {

    /* renamed from: a */
    public static final C41024a f95907a = new C41024a((byte) 0);

    /* renamed from: c */
    private boolean f95908c;

    static {
        Covode.recordClassIndex(48893);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.c.a$a */
    public static final class C41024a {
        static {
            Covode.recordClassIndex(48894);
        }

        private C41024a() {
        }

        public /* synthetic */ C41024a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static Bundle m82639a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2734c.AbstractC41025b
    /* renamed from: a */
    public final boolean mo70238a(C41035d dVar) {
        AbstractC40998a aVar;
        String str;
        Object a;
        String str2;
        C89219l.m154721d(dVar, "");
        if (!C41039c.f95935h) {
            C41039c.m82675c("AppLinkNode");
        }
        C41065u.m82724a("AppLinkNode");
        Intent intent = dVar.f95923f;
        Uri data = intent.getData();
        if (data == null) {
            C41039c.m82668a("uri_parse", 2001, null, "");
        } else if (TextUtils.equals("http", data.getScheme()) || TextUtils.equals("https", data.getScheme())) {
            Bundle a2 = m82639a(intent);
            if (!(a2 == null || (((a = m82640a(a2, "android.intent.extra.REFERRER")) == null || (str2 = a.toString()) == null) && (str2 = m82641a(intent, "android.intent.extra.REFERRER_NAME")) == null))) {
                dVar.f95920c.mo70272h(str2);
            }
            C41058p pVar = dVar.f95920c;
            String uri = data.toString();
            C89219l.m154716b(uri, "");
            pVar.mo70273i(uri);
            dVar.f95920c.mo70267c("applink");
            try {
                String host = data.getHost();
                String path = data.getPath();
                if (C41051n.C41052a.m82699a(host, path) || C41059q.C41060a.m82718a(data) || C41051n.C41052a.m82698a(data)) {
                    UgCommonServiceImpl.m138290j().mo123110h().mo123164a();
                    Context applicationContext = dVar.f95921d.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    aVar = new C41002d(applicationContext, true);
                    C41039c.m82666a("short_to_long");
                    Activity activity = dVar.f95921d;
                    C89219l.m154721d(activity, "");
                    if (!C41059q.C41060a.m82717a() && !C57058z.f129923a.mo57269b(activity)) {
                        m82642a(activity, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(activity));
                        this.f95908c = true;
                    }
                    this.f95909b = true;
                } else if (C41051n.C41052a.m82701b(host, path)) {
                    aVar = new C40999b();
                    if (C41039c.f95936i) {
                        str = "personalize_link";
                    } else if (C89219l.m154714a((Object) C41039c.f95934g, (Object) "short_to_long")) {
                        str = "short_to_semantic";
                    } else {
                        str = "semantic";
                    }
                    C41039c.m82666a(str);
                } else {
                    aVar = new C41001c();
                }
                Uri a3 = aVar.mo70209a(data);
                if (a3 != null || (!(aVar instanceof C41001c) && (a3 = new C41001c().mo70209a(data)) != null)) {
                    if (!this.f95909b) {
                        C89219l.m154721d(a3, "");
                        dVar.f95922e = a3;
                        dVar.f95920c.mo70265a("link_direct");
                        dVar.f95920c.mo70266b("google");
                        C41039c.m82677d(a3.getHost() + "/" + a3.getPath());
                    }
                } else if (!C80580in.m139687c()) {
                    Activity activity2 = dVar.f95921d;
                    if (C41050m.f95959a.mo70173a(activity2, "from_app_link", true)) {
                        C41039c.m82668a("login", 2005, data, "");
                    } else {
                        C41039c.m82668a("uri_parse", 2003, data, "");
                        String a4 = SecLinkServiceImpl.m145081b().mo129345a(data.toString(), "deeplink");
                        if (a4 == null) {
                            a4 = data.toString();
                            C89219l.m154716b(a4, "");
                        }
                        Intent awemeWebIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAwemeWebIntent(activity2, data.buildUpon().appendQueryParameter("url", a4).build(), true, false);
                        if (awemeWebIntent != null) {
                            m82642a(activity2, awemeWebIntent);
                        }
                    }
                }
                if ((!this.f95909b || !C41059q.C41060a.m82717a()) && !this.f95908c) {
                    C41039c.m82672b("AppLinkNode");
                } else {
                    dVar.f95921d.finish();
                    C41039c.f95935h = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            C41039c.m82668a("uri_parse", 2002, data, "");
        }
        return true;
    }

    /* renamed from: a */
    private static Object m82640a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m82641a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m82642a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }
}
