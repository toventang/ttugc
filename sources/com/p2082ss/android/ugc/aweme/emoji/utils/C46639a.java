package com.p2082ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a */
public final class C46639a {
    static {
        Covode.recordClassIndex(55231);
    }

    /* renamed from: a */
    public static boolean m90020a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || !createIUserServicebyMonsterPlugin.isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static long m90022c() {
        return Long.parseLong(m90021b().toString());
    }

    /* renamed from: b */
    public static CharSequence m90021b() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        if (e == null) {
            return "-1";
        }
        return e.getCurUserId();
    }
}
