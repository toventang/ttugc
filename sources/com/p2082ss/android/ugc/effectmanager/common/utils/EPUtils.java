package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.EPUtils */
public final class EPUtils {
    public static final EPUtils INSTANCE = new EPUtils();

    public static final String getPlatformSDKVersion() {
        return "760.0.1.110-alpha.0-mt";
    }

    private EPUtils() {
    }

    static {
        Covode.recordClassIndex(95509);
    }
}
