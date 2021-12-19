package com.p2082ss.android.ugc.aweme.speedpredictor.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2441cf.p2442a.C35468c;

/* renamed from: com.ss.android.ugc.aweme.speedpredictor.api.c */
public abstract /* synthetic */ class AbstractC75218c {
    static {
        Covode.recordClassIndex(88104);
    }

    /* renamed from: a */
    public static ISpeedPredictorService m131982a(int i) {
        if (i == 1) {
            return (ISpeedPredictorService) C35468c.m72529a("com.ss.android.ugc.aweme.speedpredictor.impl.DTSpeedPredictorServiceImpl");
        }
        if (i == 2) {
            return (ISpeedPredictorService) C35468c.m72529a("com.ss.android.ugc.aweme.speedpredictor.cloudimpl.CloudSpeedPredictorServiceImpl");
        }
        if (i != 3) {
            return null;
        }
        return (ISpeedPredictorService) C35468c.m72529a("com.ss.android.ugc.aweme.speedpredictor.cloudimpl2.CloudSpeedPredictorServiceImpl");
    }
}
