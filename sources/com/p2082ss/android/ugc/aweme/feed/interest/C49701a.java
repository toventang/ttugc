package com.p2082ss.android.ugc.aweme.feed.interest;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.a */
public final class C49701a {

    /* renamed from: a */
    public static final C49701a f114377a = new C49701a();

    private C49701a() {
    }

    static {
        Covode.recordClassIndex(58549);
    }

    /* renamed from: a */
    public static String m93115a() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        if (e != null) {
            return e.getCurUserId();
        }
        return null;
    }
}
