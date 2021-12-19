package com.p2082ss.android.ugc.aweme.relation.p3674c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.c.d */
public final class C66895d {

    /* renamed from: a */
    public static final C66895d f150176a = new C66895d();

    private C66895d() {
    }

    static {
        Covode.recordClassIndex(78470);
    }

    /* renamed from: a */
    public static void m118639a(int i, String str) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d dVar = new C33744d();
        if (i == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
            str2 = "facebook";
        } else {
            str2 = "contact";
        }
        C39162r.m79460a("click_authorize_reconfirm_pop_up", dVar.mo59983a("platform", str2).mo59983a("enter_from", "version_update").mo59983a("result", str).f79943a);
    }

    /* renamed from: a */
    public static void m118642a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("exit_update_authorize_process", new C33744d().mo59983a("exit_from", str).mo59983a("enter_from", "version_update").mo59983a("enter_method", str2).f79943a);
    }

    /* renamed from: a */
    public static void m118641a(User user, int i, int i2) {
        if (user != null) {
            C39162r.m79460a("follow", m118644c(user, i, i2).f79943a);
        }
    }

    /* renamed from: b */
    public static void m118643b(User user, int i, int i2) {
        if (user != null) {
            C39162r.m79460a("follow_cancel", m118644c(user, i, i2).f79943a);
        }
    }

    /* renamed from: a */
    public static void m118640a(int i, String str, int i2) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        if (i == 1) {
            str2 = "contact_boarding";
        } else if (i == 2) {
            str2 = "fb_boarding";
        } else if (i == 3) {
            str2 = "version_update";
        }
        if (i2 == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", str2).mo59983a("to_user_id", str).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", str2).mo59983a("to_user_id", str).f79943a);
        }
    }

    /* renamed from: c */
    private static C33744d m118644c(User user, int i, int i2) {
        String str;
        String str2;
        String type;
        C33744d dVar = new C33744d();
        if (i2 == 1) {
            str = "contact_boarding";
        } else if (i2 == 2) {
            str = "fb_boarding";
        } else if (i2 != 3) {
            str = "";
        } else {
            str = "version_update";
        }
        C33744d a = dVar.mo59983a("enter_from", str);
        if (i2 == 1) {
            str2 = "1-1";
        } else if (i2 == 2) {
            str2 = "1-2";
        } else if (i2 != 3 || (str2 = user.getRecType()) == null) {
            str2 = "";
        }
        C33744d a2 = a.mo59983a("rec_type", str2).mo59983a("rec_uid", user.getUid()).mo59983a("to_user_id", user.getUid()).mo59980a("impr_order", i).mo59983a("req_id", user.getRequestId());
        if (i2 == 3) {
            a2.mo59983a("enter_method", "follow_button");
            String friendTypeStr = user.getFriendTypeStr();
            if (friendTypeStr == null) {
                friendTypeStr = "";
            }
            a2.mo59983a("relation_type", friendTypeStr);
            if (user.getFollowerStatus() == 1) {
                type = C59256u.EnumC59258b.MUTUAL.getType();
            } else {
                type = C59256u.EnumC59258b.SINGLE.getType();
            }
            a2.mo59983a("follow_type", type);
        }
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r7 == com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m118638a(int r6, int r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r5 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r5)
            com.ss.android.ugc.aweme.app.f.d r4 = new com.ss.android.ugc.aweme.app.f.d
            r4.<init>()
            r0 = 1
            java.lang.String r3 = "facebook"
            java.lang.String r2 = "contact"
            r1 = 3
            if (r6 == r0) goto L_0x0048
            r0 = 2
            if (r6 == r0) goto L_0x0046
            if (r6 == r1) goto L_0x003e
        L_0x0017:
            java.lang.String r0 = "platform"
            com.ss.android.ugc.aweme.app.f.d r2 = r4.mo59983a(r0, r5)
            if (r6 != r1) goto L_0x003b
            java.lang.String r1 = "version_update"
        L_0x0021:
            java.lang.String r0 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r1 = r2.mo59983a(r0, r1)
            java.lang.String r0 = "result"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo59983a(r0, r8)
            java.lang.String r0 = "duration"
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo59981a(r0, r9)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f79943a
            java.lang.String r0 = "confirm_auth_page"
            com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r0, r1)
            return
        L_0x003b:
            java.lang.String r1 = "login_onboarding"
            goto L_0x0021
        L_0x003e:
            com.ss.android.ugc.aweme.relation.c.b r0 = com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b.NEW_VERSION_FACEBOOK
            int r0 = r0.getValue()
            if (r7 != r0) goto L_0x0048
        L_0x0046:
            r5 = r3
            goto L_0x0017
        L_0x0048:
            r5 = r2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3674c.C66895d.m118638a(int, int, java.lang.String, long):void");
    }
}
