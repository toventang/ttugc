package com.p2082ss.android.ugc.aweme.feed.p2978w;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46954ft;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.feed.w.a */
public final class C50486a {
    static {
        Covode.recordClassIndex(59623);
    }

    /* renamed from: a */
    private static String m94647a(String str) {
        if (C46954ft.m90242b()) {
            return "super_account";
        }
        return str;
    }

    /* renamed from: a */
    public static void m94648a(User user) {
        C39162r.m79460a("follow", new C33744d().mo59983a("to_user_id", user.getUid()).mo59983a("enter_from", "homepage_follow").mo59983a("enter_type", "card").mo59983a("trigger_reason", "cold_launch").mo59983a("rec_reason", m94647a(user.getRecommendReason())).f79943a);
    }

    /* renamed from: b */
    public static void m94651b(User user) {
        C39162r.m79460a("follow_cancel", new C33744d().mo59983a("to_user_id", user.getUid()).mo59983a("enter_from", "homepage_follow").mo59983a("enter_type", "card").mo59983a("trigger_reason", "cold_launch").mo59983a("rec_reason", m94647a(user.getRecommendReason())).f79943a);
    }

    /* renamed from: a */
    public static void m94650a(String str, User user) {
        C39162r.m79461a("enter_personal_detail", C59208ac.m108761a(new C33744d().mo59983a("to_user_id", user.getUid()).mo59980a("relation_tag", user.getFollowStatus()).mo59983a("enter_from", "homepage_follow").mo59983a("enter_type", "card").mo59983a("trigger_reason", "cold_launch").mo59983a("rec_reason", m94647a(user.getRecommendReason())).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(str)).f79943a));
    }

    /* renamed from: a */
    public static void m94649a(User user, String str, int i, String str2, String str3) {
        C39162r.m79460a("follow_card", new C33744d().mo59983a("rec_uid", user.getUid()).mo59983a("enter_from", "homepage_follow").mo59983a("event_type", str).mo59980a("impr_order", i).mo59983a("req_id", str2).mo59983a("trigger_reason", str3).mo59983a("rec_reason", m94647a(user.getRecommendReason())).f79943a);
    }
}
