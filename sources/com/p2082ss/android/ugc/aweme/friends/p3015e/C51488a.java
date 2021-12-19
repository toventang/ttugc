package com.p2082ss.android.ugc.aweme.friends.p3015e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.p1239b.C17747a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46913eu;
import com.p2082ss.android.ugc.aweme.experiment.C46928fe;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.e.a */
public final class C51488a {

    /* renamed from: a */
    public static final C51488a f118673a = new C51488a();

    private C51488a() {
    }

    /* renamed from: a */
    public static void m95921a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String b = m95926b(str);
        C39162r.m79460a("find_friends", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("platform", str).mo59983a("previous_page", str2).mo59980a("is_auth", z ? 1 : 0).mo59983a("did_status", b).mo59983a("uid_status", m95934c(str)).f79943a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m95920a(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, Map map, int i) {
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 256) != 0) {
            map = null;
        }
        m95919a(str, str2, str3, z, z2, str4, str5, str6, map);
    }

    /* renamed from: a */
    public static void m95922a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("authorize_contact_response", new C33744d().mo59982a("is_allow", Boolean.valueOf(z)).mo59983a("enter_from", str).mo59983a("pop_up_type", "guide").f79943a);
    }

    /* renamed from: a */
    public static void m95923a(String str, boolean z, boolean z2) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d dVar = new C33744d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        C39162r.m79460a("show_authorize_reminder", dVar.mo59983a("pop_up_type", str2).mo59983a("enter_from", str).mo59982a("is_allow", Boolean.valueOf(z2)).f79943a);
    }

    /* renamed from: a */
    public static void m95924a(String str, boolean z, boolean z2, boolean z3) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d dVar = new C33744d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        C39162r.m79460a("authorize_contact_response", dVar.mo59983a("pop_up_type", str2).mo59983a("enter_from", str).mo59980a("deny_type", !z3 ? 1 : 0).mo59982a("is_allow", Boolean.valueOf(z2)).f79943a);
    }

    /* renamed from: b */
    public static void m95933b(String str, boolean z, boolean z2) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d dVar = new C33744d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        C39162r.m79460a("authorize_contact_response", dVar.mo59983a("pop_up_type", str2).mo59983a("enter_from", str).mo59982a("is_allow", Boolean.valueOf(z2)).f79943a);
    }

    /* renamed from: a */
    public static void m95918a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("pop_up_type", str2).mo59983a("platform", str3).mo59983a("did_status", str5).mo59983a("uid_status", str6).mo59983a("enter_method", str4);
        if (map != null) {
            a.mo59986a(map);
        }
        C46928fe a2 = C46913eu.m90215a();
        if (a2 == null || a2.f109364d != 0) {
            C89219l.m154716b(a, "");
            m95910a(a, str);
        }
        C39162r.m79460a("show_authorize_pop_up", a.f79943a);
    }

    /* renamed from: a */
    public static void m95919a(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("pop_up_type", str2).mo59982a("is_allow", Boolean.valueOf(z)).mo59983a("platform", str3).mo59983a("did_status", str5).mo59983a("uid_status", str6).mo59983a("enter_method", str4);
        if (!z && C89219l.m154714a((Object) str2, (Object) "system")) {
            a.mo59980a("deny_type", !z2 ? 1 : 0);
        }
        if (map != null) {
            a.mo59986a(map);
        }
        C46928fe a2 = C46913eu.m90215a();
        if (a2 == null || a2.f109364d != 0) {
            C89219l.m154716b(a, "");
            m95910a(a, str);
        }
        C39162r.m79460a("click_authorize_pop_up", a.f79943a);
    }

    /* renamed from: a */
    public static void m95917a(String str, String str2, String str3, String str4, String str5, String str6, int i, Integer num, Integer num2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("pop_up_type", str2).mo59983a("platform", str3).mo59983a("auth_type", str4).mo59983a("enter_method", str5).mo59983a("sync_type", str6).mo59980a("has_uid_errorcode", 1).mo59980a("retry", i);
        if (num != null) {
            a.mo59980a("has_token", num.intValue());
        }
        if (num2 != null) {
            a.mo59980a("has_fbsdk_errorcode", num2.intValue());
        }
        C46928fe a2 = C46913eu.m90215a();
        if (a2 == null || a2.f109364d != 0) {
            C89219l.m154716b(a, "");
            m95910a(a, str);
        }
        C39162r.m79460a("authorize_fail_after_allow", a.f79943a);
    }

    static {
        Covode.recordClassIndex(60753);
    }

    /* renamed from: a */
    public static String m95909a() {
        if (C79519c.C79521b.f178476a.mo86991a()) {
            return "on";
        }
        return "off";
    }

    /* renamed from: b */
    public static String m95925b() {
        if (C79519c.C79520a.f178475a.mo86982a()) {
            return "on";
        }
        return "off";
    }

    /* renamed from: c */
    public static void m95935c() {
        C39162r.m79460a("invite_card_show", new C33744d().mo59983a("enter_from", "find_friends_page").f79943a);
    }

    /* renamed from: d */
    public static void m95938d() {
        C39162r.m79460a("friend_list_notify_show", new C33744d().mo59983a("enter_from", "find_friends_page").f79943a);
    }

    /* renamed from: a */
    public static void m95912a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("invite_friends", new C33744d().mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: c */
    private static String m95934c(String str) {
        boolean a;
        if (str.hashCode() == 497130182 && str.equals("facebook")) {
            a = C51648a.f118980a.mo87327g().mo86991a();
        } else {
            a = C51648a.f118980a.mo87322d().mo86982a();
        }
        if (a) {
            return "on";
        }
        return "off";
    }

    /* renamed from: b */
    private static String m95926b(String str) {
        if (str.hashCode() == 497130182 && str.equals("facebook")) {
            AbstractC51485d g = C51648a.f118980a.mo87327g();
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            User curUser = g2.getCurUser();
            C89219l.m154716b(curUser, "");
            if (g.mo86987a(curUser.getUid()).length() > 0) {
                return "on";
            }
            return "off";
        }
        boolean b = C51648a.f118980a.mo87322d().mo86983b();
        boolean a = C17747a.m32890a("android.permission.READ_CONTACTS");
        if (b) {
            return "on";
        }
        if (a) {
            return "off";
        }
        return "unknown";
    }

    /* renamed from: a */
    public static void m95913a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        C39162r.m79460a("invite_share_panel_show", linkedHashMap);
    }

    /* renamed from: b */
    public static String m95927b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C89219l.m154714a((Object) str, (Object) "on")) {
            return "uid";
        }
        if (C89219l.m154714a((Object) str2, (Object) "off")) {
            return "both";
        }
        return "did";
    }

    /* renamed from: d */
    public static void m95940d(String str, boolean z) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d a = new C33744d().mo59983a("enter_from", "find_friends_page");
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C39162r.m79460a("click_auth_card", a.mo59983a("is_auth", str2).mo59983a("platform", str).f79943a);
    }

    /* renamed from: a */
    private static void m95910a(C33744d dVar, String str) {
        int currentTimeMillis;
        String str2;
        int i = C66890a.C66891a.m118631a().f150169a.getInt("contact_pop_up_count", 0);
        long j = C66890a.C66891a.m118631a().f150169a.getLong("last_show_contact_time", 0);
        if (j == 0) {
            currentTimeMillis = 0;
        } else {
            currentTimeMillis = (int) ((System.currentTimeMillis() - j) / 86400000);
        }
        dVar.mo59980a("show_index", i).mo59980a("time_int", currentTimeMillis);
        if (C89219l.m154714a((Object) str, (Object) "following_list") || C89219l.m154714a((Object) str, (Object) "follower_list")) {
            if (C66890a.C66891a.m118631a().f150169a.getBoolean("is_my_self", false)) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            dVar.mo59983a("previous_page", str2);
        }
    }

    /* renamed from: c */
    public static void m95937c(String str, boolean z) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d dVar = new C33744d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        C39162r.m79460a("show_authorize_contact_pop_up", dVar.mo59983a("pop_up_type", str2).mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: b */
    public static void m95932b(String str, boolean z) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("authorize_user_contact", new C33744d().mo59982a("is_allow", Boolean.valueOf(z)).mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: b */
    public static void m95931b(String str, String str2, boolean z) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String b = m95926b(str);
        String c = m95934c(str);
        C33744d a = new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("platform", str);
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        C39162r.m79460a("authorize_card_show", a.mo59983a("is_auth", str3).mo59983a("previous_page", str2).mo59983a("did_status", b).mo59983a("uid_status", c).f79943a);
    }

    /* renamed from: c */
    public static void m95936c(User user, int i, String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (user != null) {
            if (user.getFollowerStatus() == 0) {
                str3 = "null";
            } else {
                str3 = "single";
            }
            C39162r.m79460a("follow_cancel", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59983a("relation_type", user.getFriendTypeStr()).mo59983a("tab_name", str2).mo59983a("follow_type", str3).mo59983a("enter_method", "follow_button").mo59983a("to_user_id", user.getUid()).mo59983a("req_id", user.getRequestId()).mo59980a("impr_order", i).mo59983a("section", str).f79943a);
        }
    }

    /* renamed from: d */
    public static void m95939d(User user, int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (user != null) {
            C33744d a = new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59983a("to_user_id", user.getUid()).mo59980a("impr_order", i).mo59983a("tab_name", str2).mo59983a("req_id", user.getRequestId()).mo59983a("section", str);
            C89219l.m154716b(a, "");
            C39162r.m79460a("enter_personal_detail", C80409eu.m139390a(a, user).f79943a);
        }
    }

    /* renamed from: a */
    public static void m95911a(User user, int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (user != null) {
            C39162r.m79460a("show_recommend_user_cell", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59980a("impr_order", i).mo59983a("req_id", user.getRequestId()).mo59983a("relation_type", user.getFriendTypeStr()).mo59983a("tab_name", str2).mo59983a("section", str).f79943a);
        }
    }

    /* renamed from: b */
    public static void m95928b(User user, int i, String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (user != null) {
            if (user.getFollowerStatus() == 0) {
                str3 = "single";
            } else {
                str3 = "mutual";
            }
            C39162r.m79460a("follow", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59983a("follow_type", str3).mo59983a("enter_method", "follow_button").mo59983a("to_user_id", user.getUid()).mo59983a("tab_name", str2).mo59980a("impr_order", i).mo59983a("req_id", user.getRequestId()).mo59983a("section", str).f79943a);
        }
    }

    /* renamed from: a */
    public static void m95914a(String str, String str2, String str3, String str4) {
        User curUser;
        String uid;
        String str5 = "";
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        C33744d dVar = new C33744d();
        IAccountUserService g = C31575b.m65865g();
        if (!(g == null || (curUser = g.getCurUser()) == null || (uid = curUser.getUid()) == null)) {
            str5 = uid;
        }
        Map<String, String> map = dVar.mo59983a("from_user_id", str5).mo59983a("platform", str2).mo59983a("enter_from", str).f79943a;
        if (str3 != null) {
            map.put("enter_method", str3);
        }
        if (str4 != null) {
            map.put("url", str4);
        }
        C39162r.m79460a("invite_via", map);
    }

    /* renamed from: b */
    public static void m95930b(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("pop_up_type", str2).mo59983a("platform", str3).mo59983a("auth_type", str5).mo59983a("sync_type", str6).mo59983a("enter_method", str4);
        if (map != null) {
            a.mo59986a(map);
        }
        C46928fe a2 = C46913eu.m90215a();
        if (a2 == null || a2.f109364d != 0) {
            C89219l.m154716b(a, "");
            m95910a(a, str);
        }
        C39162r.m79460a("authorize_finish", a.f79943a);
    }
}
