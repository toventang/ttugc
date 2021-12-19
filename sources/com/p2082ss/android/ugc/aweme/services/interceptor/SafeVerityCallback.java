package com.p2082ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.SafeVerityCallback */
public interface SafeVerityCallback {
    static {
        Covode.recordClassIndex(79891);
    }

    void onComplete(SafeVerityResponse safeVerityResponse);
}
