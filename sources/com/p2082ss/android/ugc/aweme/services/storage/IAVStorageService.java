package com.p2082ss.android.ugc.aweme.services.storage;

import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.services.storage.IAVStorageService */
public interface IAVStorageService {
    static {
        Covode.recordClassIndex(79979);
    }

    void checkStorageClean();

    Set<String> getPrefixAllowList();

    boolean isMonitorEnabled();

    void setMonitorLocalSwitch(boolean z);
}
