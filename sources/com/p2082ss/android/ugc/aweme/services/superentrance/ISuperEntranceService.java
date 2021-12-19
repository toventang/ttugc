package com.p2082ss.android.ugc.aweme.services.superentrance;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService */
public interface ISuperEntranceService {
    static {
        Covode.recordClassIndex(79996);
    }

    List<String> getSuperEntranceEffectList();

    boolean isNeedShowSuperEntranceTabDirect();

    boolean isSuperEntranceResReady();

    void preDownloadSuperEntranceRes(Context context);

    void setShowedSuperEntranceTab();

    void setSuperEntranceRecordClicked(Context context, boolean z);

    boolean shouldShowSuperEntranceRecord(Context context);

    boolean shouldStartSuperEntrance(Context context);
}
