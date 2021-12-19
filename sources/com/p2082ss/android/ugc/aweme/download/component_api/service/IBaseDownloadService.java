package com.p2082ss.android.ugc.aweme.download.component_api.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.p2809a.AbstractC43168a;
import com.p2082ss.android.ugc.aweme.download.component_api.p2809a.AbstractC43169b;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService */
public interface IBaseDownloadService {
    static {
        Covode.recordClassIndex(51366);
    }

    void cancel(int i);

    int getDownloadId(String str, String str2);

    DownloadInfo getDownloadInfo(int i);

    DownloadInfo getDownloadInfo(String str, String str2);

    AbstractC43167a getDownloadTask(int i);

    AbstractC43168a getPageLifeMonitor(int i);

    AbstractC43169b getViewLifeMonitor(int i);

    void restart(int i);

    AbstractC43167a with(String str);
}
