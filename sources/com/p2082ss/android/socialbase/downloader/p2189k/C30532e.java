package com.p2082ss.android.socialbase.downloader.p2189k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;

/* renamed from: com.ss.android.socialbase.downloader.k.e */
public final class C30532e {
    static {
        Covode.recordClassIndex(37060);
    }

    /* renamed from: a */
    public static boolean m62531a(DownloadInfo downloadInfo) {
        if (downloadInfo != null && C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null).mo54258a("optimize_head_request", 0) == 1) {
            return true;
        }
        return false;
    }
}
