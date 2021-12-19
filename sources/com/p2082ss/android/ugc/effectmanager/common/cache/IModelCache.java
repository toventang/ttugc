package com.p2082ss.android.ugc.effectmanager.common.cache;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.p2082ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.common.cache.IModelCache */
public interface IModelCache {
    static {
        Covode.recordClassIndex(95446);
    }

    String getCacheDir();

    LocalModelInfo getLocalModelInfoByName(String str, MonitorTrace monitorTrace);

    Map<String, LocalModelInfo> getLocalModelInfoList();

    boolean isBuiltInResource(String str);
}
