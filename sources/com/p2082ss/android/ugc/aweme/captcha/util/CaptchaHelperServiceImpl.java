package com.p2082ss.android.ugc.aweme.captcha.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl */
public class CaptchaHelperServiceImpl implements ICaptchaHelperService {
    static {
        Covode.recordClassIndex(42592);
    }

    /* renamed from: a */
    public static ICaptchaHelperService m72448a() {
        MethodCollector.m26663i(13003);
        Object a = C81908b.m141854a(ICaptchaHelperService.class, false);
        if (a != null) {
            ICaptchaHelperService iCaptchaHelperService = (ICaptchaHelperService) a;
            MethodCollector.m26664o(13003);
            return iCaptchaHelperService;
        }
        if (C81908b.f183140W == null) {
            synchronized (ICaptchaHelperService.class) {
                try {
                    if (C81908b.f183140W == null) {
                        C81908b.f183140W = new CaptchaHelperServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13003);
                    throw th;
                }
            }
        }
        CaptchaHelperServiceImpl captchaHelperServiceImpl = (CaptchaHelperServiceImpl) C81908b.f183140W;
        MethodCollector.m26664o(13003);
        return captchaHelperServiceImpl;
    }
}
