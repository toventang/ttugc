package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.AccountService */
public class AccountService extends AbstractC33494an {
    static {
        Covode.recordClassIndex(37913);
    }

    /* renamed from: a */
    public static IAccountService m65215a() {
        MethodCollector.m26663i(11002);
        Object a = C81908b.m141854a(IAccountService.class, false);
        if (a != null) {
            IAccountService iAccountService = (IAccountService) a;
            MethodCollector.m26664o(11002);
            return iAccountService;
        }
        if (C81908b.f183402k == null) {
            synchronized (IAccountService.class) {
                try {
                    if (C81908b.f183402k == null) {
                        C81908b.f183402k = new AccountService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11002);
                    throw th;
                }
            }
        }
        AbstractC33494an anVar = (AbstractC33494an) C81908b.f183402k;
        MethodCollector.m26664o(11002);
        return anVar;
    }
}
