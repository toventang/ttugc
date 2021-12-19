package com.p2082ss.android.ugc.aweme.kids.intergration.account;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;

/* renamed from: com.ss.android.ugc.aweme.kids.intergration.account.a */
public final class C57719a {

    /* renamed from: a */
    static volatile IAccountService f131704a;

    static {
        Covode.recordClassIndex(67693);
    }

    /* renamed from: a */
    static void m104420a() {
        if (f131704a == null) {
            f131704a = AccountService.m65215a();
        }
    }

    /* renamed from: b */
    public static IAccountUserService m104421b() {
        m104420a();
        return f131704a.mo57069e();
    }
}
