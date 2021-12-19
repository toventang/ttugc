package com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57154a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57158b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.c.h */
public final class C57103h implements AbstractC57088c {

    /* renamed from: a */
    public static final C57104a f130013a = new C57104a((byte) 0);

    /* renamed from: b */
    private final HashMap<String, Integer> f130014b;

    static {
        Covode.recordClassIndex(66997);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.h$a */
    public static final class C57104a {
        static {
            Covode.recordClassIndex(66998);
        }

        private C57104a() {
        }

        public /* synthetic */ C57104a(byte b) {
            this();
        }
    }

    private C57103h() {
        this.f130014b = new HashMap<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57088c
    /* renamed from: a */
    public final void mo94244a() {
        for (Map.Entry<String, Integer> entry : this.f130014b.entrySet()) {
            int intValue = entry.getValue().intValue();
            if (!Downloader.getInstance(C17867d.m33078a()).isDownloading(intValue)) {
                Downloader.getInstance(C17867d.m33078a()).removeTaskSubListener(intValue);
            } else {
                Downloader.getInstance(C17867d.m33078a()).cancel(intValue);
            }
        }
        this.f130014b.clear();
    }

    public /* synthetic */ C57103h(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.h$b */
    public static final class C57105b extends AbstractC57085a {

        /* renamed from: a */
        final /* synthetic */ AbstractC57123a f130015a;

        static {
            Covode.recordClassIndex(66999);
        }

        C57105b(AbstractC57123a aVar) {
            this.f130015a = aVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null && downloadInfo.getTotalBytes() > 0) {
                this.f130015a.mo94229a((int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57085a, com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            if (downloadInfo == null || (downloadInfo.getSavePath() + downloadInfo.getName()) == null) {
                str = "";
            }
            this.f130015a.mo94231a(str, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57085a, com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            int i;
            String str;
            super.onFailed(downloadInfo, baseException);
            AbstractC57123a aVar = this.f130015a;
            if (baseException != null) {
                i = baseException.getErrorCode();
            } else {
                i = -1;
            }
            String str2 = null;
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            if (downloadInfo != null) {
                str2 = downloadInfo.getConnectionUrl();
            }
            aVar.mo94230a(new C57154a(i, str, str2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57088c
    /* renamed from: a */
    public final void mo94246a(String str) {
        C89219l.m154721d(str, "");
        Integer num = this.f130014b.get(str);
        if (num != null) {
            Downloader instance = Downloader.getInstance(C17867d.m33078a());
            C89219l.m154716b(num, "");
            if (!instance.isDownloading(num.intValue())) {
                Downloader.getInstance(C17867d.m33078a()).removeTaskSubListener(num.intValue());
            } else {
                Downloader.getInstance(C17867d.m33078a()).cancel(num.intValue());
            }
        }
        this.f130014b.remove(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57088c
    /* renamed from: a */
    public final void mo94245a(MusicModel musicModel, String str, List<String> list, AbstractC57123a aVar) {
        List<String> list2;
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar, "");
        if (!list.isEmpty()) {
            aVar.mo94228a();
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = C89086z.INSTANCE;
            }
            String musicId = musicModel.getMusicId();
            UrlModel url = musicModel.getUrl();
            C89219l.m154716b(url, "");
            int download = Downloader.with(C17867d.m33078a()).url(list.get(0)).backUpUrls(list2).savePath(str).name(C57158b.m103575c(C57092e.m103457b(url))).retryCount(3).extraHeaders(C89070n.m154516a(new HttpHeader("downloader_scene", "music"))).showNotification(false).subThreadListener(new C57105b(aVar)).addListenerToSameTask(true).download();
            HashMap<String, Integer> hashMap = this.f130014b;
            C89219l.m154716b(musicId, "");
            hashMap.put(musicId, Integer.valueOf(download));
        }
    }
}
