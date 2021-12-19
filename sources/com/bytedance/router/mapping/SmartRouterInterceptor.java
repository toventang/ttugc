package com.bytedance.router.mapping;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.IInterceptorInitializer;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64152da;
import java.util.List;
import java.util.Map;

public class SmartRouterInterceptor implements IInterceptorInitializer {
    static {
        Covode.recordClassIndex(25893);
    }

    @Override // com.bytedance.router.IInterceptorInitializer
    public void initAssignInterceptors(Map<String, IInterceptor> map) {
        map.put("profile.UserProfileInterceptor", new C64152da());
    }

    @Override // com.bytedance.router.IInterceptorInitializer
    public void initInterceptors(List<IInterceptor> list) {
    }

    public void initSafeInterceptors(List<IInterceptor> list) {
    }
}
