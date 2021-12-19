package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.creatortools.videogift.C40509a;
import com.p2082ss.android.ugc.aweme.creatortools.videogift.C40511c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.is */
public final class C80586is {

    /* renamed from: a */
    public static final String f180203a = "IS_PRIVACY_PROMOTION_SHOWN";

    /* renamed from: b */
    public static final C80586is f180204b = new C80586is();

    private C80586is() {
    }

    static {
        Covode.recordClassIndex(93859);
        m139726c();
    }

    /* renamed from: a */
    public static final boolean m139724a() {
        boolean z = Keva.getRepo("video_gift_settings_keva_repo").getBoolean(m139722a("vgc_visiting_first_time"), true);
        C40509a a = C40511c.m81708a();
        if (a == null || !a.f94777a || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m139725b() {
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(m139722a("vgv_is_new_user_account"), true);
    }

    /* renamed from: c */
    public static final void m139726c() {
        boolean z;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (curUser != null) {
            curUser.getRegisterTime();
            if ((System.currentTimeMillis() / 1000) - curUser.getRegisterTime() < 2592000) {
                z = true;
            } else {
                z = false;
            }
            Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(m139722a("vgv_is_new_user_account"), z);
        }
    }

    /* renamed from: a */
    public static final void m139723a(boolean z) {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(m139722a("vgc_accept_gifting"), z);
    }

    /* renamed from: a */
    public static String m139722a(String str) {
        String str2;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (curUser == null) {
            return str;
        }
        String uniqueId = curUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str2 = curUser.getShortId();
        } else {
            str2 = curUser.getUniqueId();
        }
        return str + "_" + str2;
    }
}
