package com.p2082ss.android.ugc.aweme.music.p3470e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.music.p3463a.C60327a;
import com.p2082ss.android.ugc.aweme.music.p3463a.C60329c;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.musicprovider.C84127b;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.e.i */
public final class C60780i implements AbstractC60755b {

    /* renamed from: a */
    public static boolean f138119a;

    /* renamed from: b */
    public static final C60781a f138120b = new C60781a((byte) 0);

    /* renamed from: c */
    private final HashMap<String, Integer> f138121c;

    static {
        Covode.recordClassIndex(71337);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: a */
    public final void mo98169a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.i$a */
    public static final class C60781a {
        static {
            Covode.recordClassIndex(71338);
        }

        private C60781a() {
        }

        /* renamed from: a */
        public static AbstractC60755b m110329a() {
            if (!C60780i.f138119a) {
                C60780i.f138119a = true;
                m110330b();
            }
            return new C60780i((byte) 0);
        }

        /* renamed from: b */
        private static void m110330b() {
            if (C60329c.m110044a()) {
                try {
                    C84158e a = C84158e.m144733a();
                    C89219l.m154716b(a, "");
                    String c = a.mo128988c();
                    if (!C84127b.m144668b(c)) {
                        C84127b.m144667a(c);
                    }
                    new C60759d(new File(c), C60327a.m110042a(), AVExternalServiceImpl.m113114a().configService().cacheConfig().draftMusicList());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public /* synthetic */ C60781a(byte b) {
            this();
        }
    }

    private C60780i() {
        this.f138121c = new HashMap<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: b */
    public final void mo98172b() {
        for (Map.Entry<String, Integer> entry : this.f138121c.entrySet()) {
            int intValue = entry.getValue().intValue();
            if (!Downloader.getInstance(C17867d.m33078a()).isDownloading(intValue)) {
                Downloader.getInstance(C17867d.m33078a()).removeTaskSubListener(intValue);
            } else {
                Downloader.getInstance(C17867d.m33078a()).cancel(intValue);
            }
        }
        this.f138121c.clear();
    }

    public /* synthetic */ C60780i(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.i$b */
    public static final class C60782b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C60780i f138122a;

        /* renamed from: b */
        final /* synthetic */ AbstractC61065b f138123b;

        static {
            Covode.recordClassIndex(71339);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null && downloadInfo.getTotalBytes() > 0) {
                this.f138123b.mo69325a((int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()));
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            if (downloadInfo == null || (downloadInfo.getSavePath() + downloadInfo.getName()) == null) {
                str = "";
            }
            C73991bj.m130133d("downloader_loader, onSuccessed ; entity : " + downloadInfo + " , musicFilePath : " + str + " , fileExists : " + new File(str).exists());
            this.f138123b.mo69327a(str, null);
        }

        C60782b(C60780i iVar, AbstractC61065b bVar) {
            this.f138122a = iVar;
            this.f138123b = bVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            int i;
            String str;
            super.onFailed(downloadInfo, baseException);
            AbstractC61065b bVar = this.f138123b;
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
            bVar.mo69326a(new C84125a(i, str, str2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: a */
    public final void mo98171a(String str) {
        C89219l.m154721d(str, "");
        Integer num = this.f138121c.get(str);
        if (num != null) {
            Downloader instance = Downloader.getInstance(C17867d.m33078a());
            C89219l.m154716b(num, "");
            if (!instance.isDownloading(num.intValue())) {
                Downloader.getInstance(C17867d.m33078a()).removeTaskSubListener(num.intValue());
            } else {
                Downloader.getInstance(C17867d.m33078a()).cancel(num.intValue());
            }
        }
        this.f138121c.remove(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: a */
    public final void mo98170a(MusicModel musicModel, String str, List<String> list, AbstractC61065b bVar) {
        List<String> list2;
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        if (!list.isEmpty()) {
            bVar.mo69328b();
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = C89086z.INSTANCE;
            }
            String musicId = musicModel.getMusicId();
            UrlModel url = musicModel.getUrl();
            C89219l.m154716b(url, "");
            String c = C84127b.m144669c(C60768e.m110303c(url));
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(list.get(0));
            with.f100637n = list2;
            with.f100629f = str;
            with.f100626c = c;
            AbstractC43167a a = with.mo73399a(3).mo73401a(C89070n.m154516a(new HttpHeader("downloader_scene", "music"))).mo73400a("music_normal_file");
            a.f100601D = new C60782b(this, bVar);
            int f = a.mo73402a(true).mo73407d().mo73409f();
            HashMap<String, Integer> hashMap = this.f138121c;
            C89219l.m154716b(musicId, "");
            hashMap.put(musicId, Integer.valueOf(f));
        }
    }
}
