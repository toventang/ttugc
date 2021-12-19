package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.utils.hr */
public final class C80546hr {
    static {
        Covode.recordClassIndex(93819);
    }

    /* renamed from: a */
    public static Boolean m139632a() {
        User curUser = C31575b.m65865g().getCurUser();
        if (curUser == null || curUser.getCommerceUserInfo() == null) {
            return false;
        }
        return Boolean.valueOf(curUser.getCommerceUserInfo().isHasTcmEntry());
    }
}
