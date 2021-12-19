package com.p2082ss.android.ugc.effectmanager.download;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.FetchModelType;
import com.p2082ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;

/* renamed from: com.ss.android.ugc.effectmanager.download.IModelDownloader */
public interface IModelDownloader {
    static {
        Covode.recordClassIndex(95540);
    }

    long download(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace);
}
