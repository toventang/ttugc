package com.p2082ss.android.ugc.aweme.services.download;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.common.p2631c.AbstractC39090b;
import com.p2082ss.android.ugc.aweme.common.p2631c.C39089a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import java.io.File;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl */
public final class AVDownloadServiceImpl implements AbstractC39090b {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(79759);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79760);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final String getFullFilePath(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath == null || !C89361p.m154876c(savePath, "/", false)) {
            return downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
        }
        return downloadInfo.getSavePath() + downloadInfo.getName();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2631c.AbstractC39090b
    public final void downloadFile(String str, String str2, String str3, C39089a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        Downloader.with(C63247i.f143610a).url(str).savePath(str2).name(str3).subThreadListener(new AVDownloadServiceImpl$downloadFile$1(this, aVar)).download();
    }
}
