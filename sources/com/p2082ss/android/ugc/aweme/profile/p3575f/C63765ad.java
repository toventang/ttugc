package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.profile.f.ad */
public final class C63765ad {
    static {
        Covode.recordClassIndex(75093);
    }

    /* renamed from: a */
    public static void m115314a(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("enter_from", "others_homepage").f79943a);
    }

    /* renamed from: b */
    public static void m115317b(String str) {
        C39162r.m79460a("block_confirm", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("target", str).f79943a);
    }

    /* renamed from: a */
    public static void m115315a(String str, int i, boolean z) {
        C39162r.m79460a("show_message_button", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("user_id", str).mo59980a("follow_status", i).mo59983a("enter_method", "button").mo59980a("is_enterprise", z ? 1 : 0).f79943a);
    }

    /* renamed from: a */
    public static void m115316a(String str, String str2, Boolean bool) {
        String str3;
        C33744d a = new C33744d().mo59983a("from_user_id", str).mo59983a("rec_type", str2);
        if (bool.booleanValue()) {
            str3 = "follow";
        } else {
            str3 = "click";
        }
        C39162r.m79460a("spread_follow_card", a.mo59983a("enter_method", str3).f79943a);
    }
}
