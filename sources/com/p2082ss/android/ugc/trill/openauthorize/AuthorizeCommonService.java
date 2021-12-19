package com.p2082ss.android.ugc.trill.openauthorize;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.services.IAuthorizeCommonService;
import com.p2082ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;

/* renamed from: com.ss.android.ugc.trill.openauthorize.AuthorizeCommonService */
public class AuthorizeCommonService implements IAuthorizeCommonService {
    static {
        Covode.recordClassIndex(99128);
    }

    /* renamed from: a */
    public static IAuthorizeCommonService m146329a() {
        MethodCollector.m26663i(10711);
        Object a = C81908b.m141854a(IAuthorizeCommonService.class, false);
        if (a != null) {
            IAuthorizeCommonService iAuthorizeCommonService = (IAuthorizeCommonService) a;
            MethodCollector.m26664o(10711);
            return iAuthorizeCommonService;
        }
        if (C81908b.f183367eK == null) {
            synchronized (IAuthorizeCommonService.class) {
                try {
                    if (C81908b.f183367eK == null) {
                        C81908b.f183367eK = new AuthorizeCommonService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10711);
                    throw th;
                }
            }
        }
        AuthorizeCommonService authorizeCommonService = (AuthorizeCommonService) C81908b.f183367eK;
        MethodCollector.m26664o(10711);
        return authorizeCommonService;
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IAuthorizeCommonService
    public boolean isActivityAwemeAuthorize(Activity activity) {
        if ((activity instanceof AwemeAuthorizedActivity) || (activity instanceof AwemeAuthorizeLoginActivity)) {
            return true;
        }
        return false;
    }
}
