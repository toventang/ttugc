package com.p2082ss.android.ugc.aweme.setting.p3720h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.setting.h.a */
public final class C68083a {

    /* renamed from: a */
    public static final C68083a f152479a = new C68083a();

    private C68083a() {
    }

    static {
        Covode.recordClassIndex(80279);
    }

    /* renamed from: a */
    public static void m120381a(boolean z) {
        String str;
        C33744d dVar = new C33744d();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        C39162r.m79460a(" remove_result", dVar.mo59983a("status", str).f79943a);
    }

    /* renamed from: a */
    public static void m120380a(int i) {
        String str;
        C33744d a = new C33744d().mo59983a("enter_from", "privacy_setting").mo59983a("method", "manual").mo59983a("to_status", "on");
        if (i == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        C39162r.m79460a("switch_sync_auth", a.mo59983a("platform", str).f79943a);
    }

    /* renamed from: b */
    public static void m120383b(int i) {
        String str;
        C33744d a = new C33744d().mo59983a("enter_from", "privacy_setting").mo59983a("method", "manual").mo59983a("to_status", "off");
        if (i == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        C39162r.m79460a("switch_sync_auth", a.mo59983a("platform", str).f79943a);
    }

    /* renamed from: c */
    public static void m120384c(int i) {
        String str;
        C33744d a = new C33744d().mo59983a("enter_from", "privacy_setting");
        if (i == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        C39162r.m79460a("remove_sync_auth", a.mo59983a("platform", str).f79943a);
    }

    /* renamed from: d */
    public static void m120385d(int i) {
        String str;
        C33744d a = new C33744d().mo59983a("enter_from", "privacy_setting");
        if (i == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        C39162r.m79460a("remove_sync_pop", a.mo59983a("platform", str).f79943a);
    }

    /* renamed from: a */
    public static void m120382a(boolean z, int i) {
        String str;
        String str2;
        C33744d a = new C33744d().mo59983a("enter_from", "privacy_setting");
        if (z) {
            str = "remove";
        } else {
            str = "cancel";
        }
        C33744d a2 = a.mo59983a("result", str);
        if (i == 1) {
            str2 = "contact";
        } else {
            str2 = "fb";
        }
        C39162r.m79460a("confirm_remove_sync_pop", a2.mo59983a("platform", str2).f79943a);
    }
}
