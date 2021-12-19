package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.framework.services.IDeleteAccountService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.DeleteAccountService */
public final class DeleteAccountService implements IDeleteAccountService {
    static {
        Covode.recordClassIndex(79610);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IDeleteAccountService
    public final boolean toAccountRecover(String str) {
        C89219l.m154721d(str, "");
        return C31575b.m65860b().toRecoverDeletedAccount(str);
    }

    public static IDeleteAccountService createIDeleteAccountServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(9740);
        Object a = C81908b.m141854a(IDeleteAccountService.class, z);
        if (a != null) {
            IDeleteAccountService iDeleteAccountService = (IDeleteAccountService) a;
            MethodCollector.m26664o(9740);
            return iDeleteAccountService;
        }
        if (C81908b.f183345dp == null) {
            synchronized (IDeleteAccountService.class) {
                try {
                    if (C81908b.f183345dp == null) {
                        C81908b.f183345dp = new DeleteAccountService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9740);
                    throw th;
                }
            }
        }
        DeleteAccountService deleteAccountService = (DeleteAccountService) C81908b.f183345dp;
        MethodCollector.m26664o(9740);
        return deleteAccountService;
    }
}
