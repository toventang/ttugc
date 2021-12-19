package com.p2082ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34877bj;
import com.p2082ss.android.ugc.aweme.AbstractC34881bk;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.AbstractC34913br;
import com.p2082ss.android.ugc.aweme.AbstractC34930bs;
import com.p2082ss.android.ugc.aweme.AbstractC35317bv;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IAgeGateService;

/* renamed from: com.ss.android.ugc.aweme.account.b */
public final class C31575b {

    /* renamed from: a */
    public static volatile IAccountService f75524a;

    static {
        Covode.recordClassIndex(38300);
    }

    /* renamed from: a */
    public static void m65859a() {
        if (f75524a == null) {
            f75524a = AccountService.m65215a();
        }
    }

    /* renamed from: b */
    public static AbstractC34892bo m65860b() {
        m65859a();
        return f75524a.mo57071g();
    }

    /* renamed from: c */
    public static AbstractC34881bk m65861c() {
        m65859a();
        return f75524a.mo57068d();
    }

    /* renamed from: d */
    public static IAgeGateService m65862d() {
        m65859a();
        return f75524a.mo57067c();
    }

    /* renamed from: e */
    public static AbstractC34877bj m65863e() {
        m65859a();
        return f75524a.mo57072h();
    }

    /* renamed from: f */
    public static AbstractC34913br m65864f() {
        m65859a();
        return f75524a.mo57073i();
    }

    /* renamed from: g */
    public static IAccountUserService m65865g() {
        m65859a();
        return f75524a.mo57069e();
    }

    /* renamed from: h */
    public static AbstractC35317bv m65866h() {
        m65859a();
        return f75524a.mo57070f();
    }

    /* renamed from: i */
    public static AbstractC34930bs m65867i() {
        m65859a();
        return f75524a.mo57074j();
    }
}
