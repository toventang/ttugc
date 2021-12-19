package com.p2082ss.android.ugc.aweme.account.p2242b;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.account.b.c */
public final class C31588c {
    static {
        Covode.recordClassIndex(38313);
    }

    /* renamed from: a */
    public static void m65884a(String str) {
        C39162r.m79460a("uc_bind_click_exit", new C31376a().mo57399a("enter_from", str).mo57399a("params_for_special", "uc_login").f75156a);
    }

    /* renamed from: a */
    public static void m65885a(String str, String str2) {
        C39162r.m79460a("uc_bind_notify", new C31376a().mo57399a("enter_from", str).mo57399a("bind_type", str2).mo57399a("params_for_special", "uc_login").f75156a);
    }

    /* renamed from: b */
    public static void m65888b(String str, String str2) {
        C39162r.m79460a("uc_bind_submit", new C31376a().mo57399a("enter_from", str).mo57399a("bind_type", str2).mo57399a("params_for_special", "uc_login").f75156a);
    }

    /* renamed from: a */
    public static void m65887a(String str, String str2, String str3, int i) {
        int i2;
        C31376a a = new C31376a().mo57399a("enter_from", str).mo57399a("enter_method", str2).mo57399a("platform", str3);
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        C39162r.m79460a("bind_status", a.mo57397a("status", i2).f75156a);
    }

    /* renamed from: a */
    public static void m65886a(String str, String str2, int i, String str3, String str4) {
        String str5;
        C31376a a = new C31376a().mo57399a("enter_from", str).mo57399a("bind_type", str2);
        if (i == 0) {
            str5 = "success";
        } else {
            str5 = "fail";
        }
        C31376a a2 = a.mo57399a("status", str5).mo57397a("error_code", i).mo57399a("fail_info", str3).mo57399a("params_for_special", "uc_login");
        if (str4 != null) {
            try {
                a2.mo57397a("phone_country", PhoneNumberUtil.getInstance().parse(str4, null).getCountryCode());
            } catch (NumberParseException e) {
                e.printStackTrace();
            }
        }
        C39162r.m79460a("uc_bind_result", a2.f75156a);
    }
}
