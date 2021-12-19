package com.p2082ss.android.ugc.aweme.download.component_api.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend */
public interface IDownloadConfigDepend {
    static {
        Covode.recordClassIndex(51363);
    }

    String getDeviceId();

    String getSettingString();

    AbstractC30463j getTTNetDownloadHttpService();

    String getUserId();

    boolean needAutoRefreshUnSuccessTask();
}
