package com.p2082ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl */
public class LoginUtilsServiceImpl implements ILoginUtilsService {
    static {
        Covode.recordClassIndex(69278);
    }

    /* renamed from: a */
    public static ILoginUtilsService m108310a() {
        MethodCollector.m26663i(7607);
        Object a = C81908b.m141854a(ILoginUtilsService.class, false);
        if (a != null) {
            ILoginUtilsService iLoginUtilsService = (ILoginUtilsService) a;
            MethodCollector.m26664o(7607);
            return iLoginUtilsService;
        }
        if (C81908b.f183296ct == null) {
            synchronized (ILoginUtilsService.class) {
                try {
                    if (C81908b.f183296ct == null) {
                        C81908b.f183296ct = new LoginUtilsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7607);
                    throw th;
                }
            }
        }
        LoginUtilsServiceImpl loginUtilsServiceImpl = (LoginUtilsServiceImpl) C81908b.f183296ct;
        MethodCollector.m26664o(7607);
        return loginUtilsServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.login.ILoginUtilsService
    /* renamed from: a */
    public final void mo96439a(Bundle bundle) {
        C58958d.m108328a(bundle);
    }
}
