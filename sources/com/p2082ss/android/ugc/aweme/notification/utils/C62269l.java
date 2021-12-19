package com.p2082ss.android.ugc.aweme.notification.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.l */
public final class C62269l {
    static {
        Covode.recordClassIndex(73043);
    }

    /* renamed from: a */
    public static boolean m112652a() {
        if (BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser() == null || !C80580in.m139687c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m112651a(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }
}
