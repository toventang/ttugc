package com.p2082ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.h */
public final class C62264h {

    /* renamed from: a */
    public static final C62264h f141319a = new C62264h();

    private C62264h() {
    }

    static {
        Covode.recordClassIndex(73038);
    }

    /* renamed from: a */
    private static boolean m112639a(Context context, User user, String str, String str2, String str3, boolean z) {
        if (user == null || !z || user.getFollowStatus() != 2) {
            return false;
        }
        if (str == null) {
            str = "notification_page";
        }
        if (str2 == null) {
            str2 = "button";
        }
        IMUser fromUser = IMUser.fromUser(user);
        if (fromUser == null) {
            return true;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        C56245a.C56246a c = C56245a.C56247b.m102214a(context, fromUser).mo93274c(str);
        c.f128281a.setEnterFromSubPage(str3);
        createIIMServicebyMonsterPlugin.startChat(c.mo93276d(C62265i.m112641a(context, user)).mo93271b(str2).f128281a);
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m112640a(Context context, User user, String str, String str2, String str3, boolean z, int i) {
        if ((i & 4) != 0) {
            str = "notification_page";
        }
        if ((i & 8) != 0) {
            str2 = "button";
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return m112639a(context, user, str, str2, str3, z);
    }
}
