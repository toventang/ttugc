package com.p2082ss.android.ugc.aweme.newuser;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.launcher.service.newuser.INewUserApi;

/* renamed from: com.ss.android.ugc.aweme.newuser.NewUserImpl */
public final class NewUserImpl implements INewUserApi {
    static {
        Covode.recordClassIndex(72184);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.newuser.INewUserApi
    /* renamed from: a */
    public final void mo95586a() {
        C61521a.m111406a();
    }

    /* renamed from: b */
    public static INewUserApi m111404b() {
        MethodCollector.m26663i(4087);
        Object a = C81908b.m141854a(INewUserApi.class, false);
        if (a != null) {
            INewUserApi iNewUserApi = (INewUserApi) a;
            MethodCollector.m26664o(4087);
            return iNewUserApi;
        }
        if (C81908b.f183269cS == null) {
            synchronized (INewUserApi.class) {
                try {
                    if (C81908b.f183269cS == null) {
                        C81908b.f183269cS = new NewUserImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4087);
                    throw th;
                }
            }
        }
        NewUserImpl newUserImpl = (NewUserImpl) C81908b.f183269cS;
        MethodCollector.m26664o(4087);
        return newUserImpl;
    }
}
