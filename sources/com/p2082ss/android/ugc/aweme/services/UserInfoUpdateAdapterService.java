package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.p4196c.C80056b;

/* renamed from: com.ss.android.ugc.aweme.services.UserInfoUpdateAdapterService */
public final class UserInfoUpdateAdapterService implements IAccountInfoUpdateAdapterService {
    static {
        Covode.recordClassIndex(79741);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService
    public final int userDefaultAllowStatus() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService
    public final User getUser() {
        return new C80056b().mo123506a();
    }

    public static IAccountInfoUpdateAdapterService createIAccountInfoUpdateAdapterServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(9579);
        Object a = C81908b.m141854a(IAccountInfoUpdateAdapterService.class, z);
        if (a != null) {
            IAccountInfoUpdateAdapterService iAccountInfoUpdateAdapterService = (IAccountInfoUpdateAdapterService) a;
            MethodCollector.m26664o(9579);
            return iAccountInfoUpdateAdapterService;
        }
        if (C81908b.f183355dz == null) {
            synchronized (IAccountInfoUpdateAdapterService.class) {
                try {
                    if (C81908b.f183355dz == null) {
                        C81908b.f183355dz = new UserInfoUpdateAdapterService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9579);
                    throw th;
                }
            }
        }
        UserInfoUpdateAdapterService userInfoUpdateAdapterService = (UserInfoUpdateAdapterService) C81908b.f183355dz;
        MethodCollector.m26664o(9579);
        return userInfoUpdateAdapterService;
    }
}
