package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39254n;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Map;
import org.json.JSONException;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.e */
public final class C39667e {

    /* renamed from: a */
    public static final C39667e f93474a = new C39667e();

    /* renamed from: b */
    private static final Keva f93475b;

    /* renamed from: c */
    private static C39254n f93476c;

    /* renamed from: d */
    private static String f93477d;

    /* renamed from: e */
    private static Map<String, C39252m> f93478e;

    /* renamed from: f */
    private static String f93479f;

    /* renamed from: g */
    private static Map<String, C39252m> f93480g;

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.e$a */
    public static final class C39668a extends C27895a<Map<String, ? extends C39252m>> {
        static {
            Covode.recordClassIndex(47391);
        }

        C39668a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.e$b */
    public static final class C39669b extends C27895a<Map<String, ? extends C39252m>> {
        static {
            Covode.recordClassIndex(47392);
        }

        C39669b() {
        }
    }

    private C39667e() {
    }

    /* renamed from: b */
    public static void m80547b() {
        f93476c = null;
        f93475b.erase("private_settings");
    }

    /* renamed from: d */
    public static void m80549d() {
        f93478e = null;
        f93475b.erase(m80546a("popup_agreement"));
    }

    /* renamed from: f */
    public static void m80551f() {
        f93480g = null;
        f93475b.erase(m80546a("post_record"));
    }

    static {
        Covode.recordClassIndex(47390);
        Keva repo = Keva.getRepo("compliance_setting");
        C89219l.m154716b(repo, "");
        f93475b = repo;
    }

    /* renamed from: a */
    public static C39254n m80545a() {
        boolean z;
        if (f93476c == null) {
            try {
                f93476c = (C39254n) C80342dg.m139301a(f93475b.getString("private_settings", ""), C39254n.class);
            } catch (JSONException unused) {
            }
        }
        if (f93476c == null) {
            z = true;
        } else {
            z = false;
        }
        C39617a.m80458a("privacy_deprecated_keva", z, C89041ag.m154412a(C89387v.m154943a("key", "restriction")));
        return f93476c;
    }

    /* renamed from: c */
    public static Map<String, C39252m> m80548c() {
        String a = C39631a.m80484a();
        String str = f93477d;
        boolean z = false;
        if (str == null || !C89361p.m154872a(str, a, false)) {
            f93478e = null;
        }
        if (f93478e == null) {
            String string = f93475b.getString(m80546a("popup_agreement"), "");
            try {
                f93478e = (Map) C80342dg.m139300a().mo46671a(string, new C39668a().type);
            } catch (JSONException unused) {
            }
            f93477d = a;
        }
        if (f93478e == null) {
            z = true;
        }
        C39617a.m80458a("privacy_deprecated_keva", z, C89041ag.m154412a(C89387v.m154943a("key", "popupAgreement")));
        return f93478e;
    }

    /* renamed from: e */
    public static Map<String, C39252m> m80550e() {
        String a = C39631a.m80484a();
        String str = f93479f;
        boolean z = false;
        if (str == null || !C89361p.m154872a(str, a, false)) {
            f93480g = null;
        }
        if (f93480g == null) {
            String string = f93475b.getString(m80546a("post_record"), "");
            try {
                f93480g = (Map) C80342dg.m139300a().mo46671a(string, new C39669b().type);
            } catch (JSONException unused) {
            }
            f93479f = a;
        }
        if (f93480g == null) {
            z = true;
        }
        C39617a.m80458a("privacy_deprecated_keva", z, C89041ag.m154412a(C89387v.m154943a("key", "postRecord")));
        return f93480g;
    }

    /* renamed from: a */
    private static String m80546a(String str) {
        String a = C39631a.m80484a();
        if (a == null || a.length() == 0) {
            return str;
        }
        return str + a;
    }
}
