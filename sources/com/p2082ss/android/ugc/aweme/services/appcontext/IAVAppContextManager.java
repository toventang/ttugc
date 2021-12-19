package com.p2082ss.android.ugc.aweme.services.appcontext;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager */
public interface IAVAppContextManager {
    static {
        Covode.recordClassIndex(79745);
    }

    long getUpdateVersionCode();

    long getVersionCode();
}
