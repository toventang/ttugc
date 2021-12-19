package com.p2082ss.android.ugc.aweme.notice.api.helper;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper */
public interface IMainServiceHelper {
    static {
        Covode.recordClassIndex(72288);
    }

    void goToTipsPage();

    boolean isChatFunOfflineUnder16();

    boolean shouldRedictToTipsPage();
}
