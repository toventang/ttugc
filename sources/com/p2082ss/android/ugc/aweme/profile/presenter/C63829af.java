package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.af */
public final class C63829af {
    static {
        Covode.recordClassIndex(75253);
    }

    /* renamed from: a */
    public static void m115494a() {
        User curUser = C31575b.m65865g().getCurUser();
        C31575b.m65859a();
        C31575b.f75524a.mo57075k().updateMethodInfo("update_name", curUser.getUniqueId());
        curUser.setNicknameUpdateReminder(false);
    }
}
