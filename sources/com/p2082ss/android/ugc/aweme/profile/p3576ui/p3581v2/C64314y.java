package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.y */
public final class C64314y {

    /* renamed from: a */
    public static final C64314y f145779a = new C64314y();

    private C64314y() {
    }

    /* renamed from: a */
    public static void m116183a(String str, String str2, User user) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (user != null) {
            C39162r.m79460a("show_link", new C33744d().mo59983a("enter_from", str).mo59983a("link_type", str2).mo59983a("link", m116175a(user, str2)).mo59983a("scene_id", "1008").mo59983a("author_id", user.getUid()).f79943a);
        }
    }

    /* renamed from: a */
    public static void m116184a(String str, String str2, Integer num, Integer num2, String str3) {
        C33744d a = new C33744d().mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI").mo59983a("page_name", "others_homepage");
        if (str == null || str.length() <= 0) {
            str = "unknown";
        }
        C33744d a2 = a.mo59983a("previous_page", str).mo59983a("author_id", str2).mo59982a("is_self", num).mo59982a("follow_status", num2);
        if (!TextUtils.isEmpty(str3)) {
            a2.mo59983a("show_window_source", str3);
        }
        C39162r.m79460a("tiktokec_showcase_entrance_show", a2.f79943a);
    }

    /* renamed from: a */
    public static void m116185a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("profile_set_user_data", new C33744d().mo59983a("enter_from", str).mo59983a(StringSet.type, str3).mo59983a("to_user_id", str2).f79943a);
    }

    static {
        Covode.recordClassIndex(75759);
    }

    /* renamed from: a */
    public static void m116176a() {
        C39162r.m79460a("show_profile_bio_hint", new C33744d().f79943a);
    }

    /* renamed from: a */
    public static String m116174a(User user) {
        C89219l.m154721d(user, "");
        if (C80580in.m139694g(user)) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: b */
    public static void m116186b(String str) {
        if (C64315z.m116188a(str)) {
            C39162r.m79460a("enter_personal_homepage", new C33744d().mo59983a("tab_name", str).f79943a);
        }
    }

    /* renamed from: c */
    public static void m116187c(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("click_private_guide_pop_up", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("action_type", str).f79943a);
    }

    /* renamed from: a */
    public static void m116177a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("click_live_event_icon", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("action_type", str).f79943a);
    }

    /* renamed from: a */
    private static String m116175a(User user, String str) {
        if (C89219l.m154714a((Object) str, (Object) "weblink")) {
            return user.getBioUrl();
        }
        return user.getBioEmail();
    }

    /* renamed from: a */
    public static void m116179a(String str, C33744d dVar) {
        C89219l.m154721d(str, "");
        if (dVar != null) {
            C39162r.m79460a("profile_edit_status", dVar.mo59983a("event_type", str).f79943a);
        }
    }

    /* renamed from: a */
    public static void m116180a(String str, User user) {
        C89219l.m154721d(str, "");
        if (user != null) {
            C39162r.m79460a("click_link", new C33744d().mo59983a("enter_from", m116174a(user)).mo59983a("link_type", str).mo59983a("author_id", user.getUid()).mo59983a("link", m116175a(user, str)).f79943a);
        }
    }

    /* renamed from: a */
    public static void m116181a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("follow_request_pop_up_response", new C33744d().mo59983a("to_user_id", str2).mo59983a("enter_from", str).mo59980a("action_type", i).f79943a);
    }

    /* renamed from: a */
    public static void m116178a(String str, int i, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C39162r.m79460a("change_notification_preference", new C33744d().mo59983a("enter_from", str).mo59980a("follow_status", i).mo59983a("to_user_id", str2).mo59983a("previous_page", str3).mo59983a("to_status", str4).f79943a);
    }

    /* renamed from: a */
    public static void m116182a(String str, String str2, int i, String str3, boolean z) {
        String str4;
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C33744d a = new C33744d().mo59983a("enter_from", str3).mo59983a("live_event_id", str).mo59980a("live_event_cnt", i);
        if (z) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        C39162r.m79460a("livesdk_live_event_card", a.mo59983a("is_free_event", str4).mo59983a("action_type", str2).f79943a);
    }
}
