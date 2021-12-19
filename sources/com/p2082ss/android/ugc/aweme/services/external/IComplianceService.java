package com.p2082ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.IComplianceService */
public interface IComplianceService {
    static {
        Covode.recordClassIndex(79792);
    }

    boolean getMusicPreventDownload();

    int getPublishPermission();
}
