package com.p2082ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.C63807h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.utils.C80397em;

/* renamed from: com.ss.android.ugc.aweme.profile.api.c */
public final class C63429c {

    /* renamed from: a */
    public static final String f144023a = (C29736b.f70924e + "/aweme/v1/user/");

    /* renamed from: b */
    private static boolean f144024b = true;

    /* renamed from: a */
    public static String m115020a(boolean z) {
        return z ? "/aweme/v1/user/profile/self/" : "/aweme/v1/user/profile/other/";
    }

    static {
        Covode.recordClassIndex(74734);
    }

    /* renamed from: a */
    private static boolean m115021a() {
        if (!C31575b.m65865g().isLogin()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (!C63419ae.f143971a.needShowCompleteProfileGuideBar() || repo.getBoolean(C63807h.m115405a("profile_page_complete_profile_guide_bar_has_click_close"), false) || repo.getInt(C63807h.m115405a("profile_page_complete_profile_guide_bar_show_times"), 0) >= 3 || System.currentTimeMillis() - repo.getLong(C63807h.m115405a("profile_page_complete_profile_guide_bar_last_show_time"), 0) <= 2592000000L) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Bundle m115015a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static UserResponse m115017a(String str, String str2) {
        return (UserResponse) C63873h.f144797a.apiExecuteGetJSONObject(str, UserResponse.class, "", true, str2);
    }

    /* renamed from: b */
    public static String m115022b(String str, String str2) {
        return m115019a(str, str2, null, 0, true);
    }

    /* renamed from: a */
    public static User m115016a(String str, boolean z, String str2) {
        String str3;
        C29844g gVar = new C29844g(str);
        if (f144024b) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        gVar.mo52130a("is_cold_start", str3);
        f144024b = false;
        return (User) C63873h.f144797a.apiExecuteGetJSONObject(gVar.toString(), User.class, "user", z, str2);
    }

    /* renamed from: a */
    public static String m115018a(String str, String str2, int i, Boolean bool) {
        return m115019a(str, str2, null, i, bool);
    }

    /* renamed from: a */
    public static String m115019a(String str, String str2, String str3, int i, Boolean bool) {
        int i2;
        Uri.Builder buildUpon = Uri.parse(C29736b.f70924e).buildUpon();
        String curUserId = C31575b.m65865g().getCurUserId();
        String curSecUserId = C31575b.m65865g().getCurSecUserId();
        String uniqueId = C31575b.m65865g().getCurUser().getUniqueId();
        if ((!TextUtils.isEmpty(str2) && TextUtils.equals(curUserId, str2)) || ((!TextUtils.isEmpty(str) && TextUtils.equals(curSecUserId, str)) || (!TextUtils.isEmpty(str3) && TextUtils.equals(uniqueId, str3)))) {
            buildUpon.path(m115020a(true));
            if (m115021a()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else if (!TextUtils.isEmpty(str)) {
            buildUpon.path(m115020a(false)).appendQueryParameter("sec_user_id", str);
        } else if (!TextUtils.isEmpty(str2)) {
            buildUpon.path(m115020a(false)).appendQueryParameter("user_id", str2);
        } else if (!TextUtils.isEmpty(str3)) {
            buildUpon.path(m115020a(false)).appendQueryParameter("unique_id", str3);
        } else if (C31575b.m65865g().isLogin()) {
            buildUpon.path(m115020a(true));
            if (m115021a()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else {
            buildUpon.path(m115020a(false));
        }
        if (bool.booleanValue() && C51487e.m95905b()) {
            buildUpon.appendQueryParameter("with_mutual", "true");
        }
        if (C31575b.m65865g().isUidContactPermisioned()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        buildUpon.appendQueryParameter("address_book_access", String.valueOf(i2));
        buildUpon.appendQueryParameter("from", String.valueOf(i));
        if (buildUpon.toString().contains("/aweme/v1/user/profile/other/")) {
            int[] a = C80397em.m139369a(102);
            String str4 = a[0] + "_" + a[1];
            int[] a2 = C80397em.m139369a(700);
            buildUpon.appendQueryParameter("user_avatar_shrink", str4);
            buildUpon.appendQueryParameter("user_cover_shrink", a2[0] + "_" + a2[1]);
        }
        return buildUpon.toString();
    }
}
