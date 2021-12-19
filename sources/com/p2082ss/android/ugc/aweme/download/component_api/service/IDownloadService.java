package com.p2082ss.android.ugc.aweme.download.component_api.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.service.IDownloadService */
public interface IDownloadService extends IBaseDownloadService {
    static {
        Covode.recordClassIndex(51367);
    }

    /* renamed from: a */
    void mo73438a(Context context, IMonitorLogSendDepend iMonitorLogSendDepend, IDownloadConfigDepend iDownloadConfigDepend);

    /* renamed from: a */
    void mo73439a(IDownloadSdkMonitorDepend iDownloadSdkMonitorDepend);

    /* renamed from: a */
    boolean mo73440a(int i);
}
