package com.p2082ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService */
public interface IAbnormalExitLogService {
    static {
        Covode.recordClassIndex(79790);
    }

    void logAppAbnormalExit();

    void logRestoreDialogClick(boolean z);

    void logRestoreDialogShow();
}
