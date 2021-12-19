package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IMultiAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.C32816w;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.MultiAccountService */
public final class MultiAccountService implements IMultiAccountService {
    static {
        Covode.recordClassIndex(38365);
    }

    @Override // com.p2082ss.android.ugc.aweme.IMultiAccountService
    /* renamed from: b */
    public final boolean mo57226b() {
        return C32816w.C32817a.m67394a();
    }

    @Override // com.p2082ss.android.ugc.aweme.IMultiAccountService
    /* renamed from: a */
    public final void mo57225a() {
        C31575b.m65860b().uploadAccountNum(false);
    }

    /* renamed from: c */
    public static IMultiAccountService m65945c() {
        MethodCollector.m26663i(11523);
        Object a = C81908b.m141854a(IMultiAccountService.class, false);
        if (a != null) {
            IMultiAccountService iMultiAccountService = (IMultiAccountService) a;
            MethodCollector.m26664o(11523);
            return iMultiAccountService;
        }
        if (C81908b.f183118A == null) {
            synchronized (IMultiAccountService.class) {
                try {
                    if (C81908b.f183118A == null) {
                        C81908b.f183118A = new MultiAccountService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11523);
                    throw th;
                }
            }
        }
        MultiAccountService multiAccountService = (MultiAccountService) C81908b.f183118A;
        MethodCollector.m26664o(11523);
        return multiAccountService;
    }
}
