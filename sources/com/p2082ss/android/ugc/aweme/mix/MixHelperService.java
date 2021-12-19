package com.p2082ss.android.ugc.aweme.mix;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.mix.MixHelperService */
public class MixHelperService implements IMixHelperService {
    static {
        Covode.recordClassIndex(69709);
    }

    /* renamed from: a */
    public static IMixHelperService m109027a() {
        MethodCollector.m26663i(9718);
        Object a = C81908b.m141854a(IMixHelperService.class, false);
        if (a != null) {
            IMixHelperService iMixHelperService = (IMixHelperService) a;
            MethodCollector.m26664o(9718);
            return iMixHelperService;
        }
        if (C81908b.f183301cy == null) {
            synchronized (IMixHelperService.class) {
                try {
                    if (C81908b.f183301cy == null) {
                        C81908b.f183301cy = new MixHelperService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9718);
                    throw th;
                }
            }
        }
        MixHelperService mixHelperService = (MixHelperService) C81908b.f183301cy;
        MethodCollector.m26664o(9718);
        return mixHelperService;
    }
}
