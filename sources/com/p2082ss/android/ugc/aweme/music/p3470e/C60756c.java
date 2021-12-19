package com.p2082ss.android.ugc.aweme.music.p3470e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60829g;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.e.c */
public final class C60756c implements AbstractC60753a {

    /* renamed from: f */
    public static final C60757a f138054f = new C60757a((byte) 0);

    /* renamed from: b */
    public AbstractC61065b f138055b;

    /* renamed from: c */
    public C60769f f138056c;

    /* renamed from: d */
    public final String f138057d;

    /* renamed from: e */
    public final CountDownLatch f138058e;

    /* renamed from: g */
    private final String f138059g;

    /* renamed from: h */
    private final String f138060h;

    /* renamed from: i */
    private int f138061i = -1;

    /* renamed from: j */
    private IDownloadListener f138062j;

    /* renamed from: k */
    private final UrlModel f138063k;

    static {
        Covode.recordClassIndex(71313);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.c$a */
    public static final class C60757a {
        static {
            Covode.recordClassIndex(71314);
        }

        private C60757a() {
        }

        public /* synthetic */ C60757a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60753a
    /* renamed from: a */
    public final void mo98167a() {
        Downloader.getInstance(C17867d.m33078a()).removeSubThreadListener(this.f138061i, this.f138062j);
        this.f138056c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60753a
    /* renamed from: b */
    public final void mo98168b() {
        Downloader.getInstance(C17867d.m33078a()).removeSubThreadListener(this.f138061i, this.f138062j);
        this.f138056c = null;
    }

    /* renamed from: c */
    public final void mo98174c() {
        if (!C60768e.m110302b(this.f138063k)) {
            CountDownLatch countDownLatch = this.f138058e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C73991bj.m130131b("Download Music Beat illegal beat url: " + C60768e.m110299a(this.f138063k));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpHeader("Accept-Encoding", " "));
        this.f138062j = new C60758b(this);
        AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(C60768e.m110303c(this.f138063k));
        with.f100637n = C60768e.m110304d(this.f138063k);
        with.f100629f = C60829g.f138241a;
        with.f100626c = this.f138060h;
        AbstractC43167a a = with.mo73399a(3).mo73400a("music_beat_file");
        a.f100601D = this.f138062j;
        this.f138061i = a.mo73402a(true).mo73401a(arrayList).mo73409f();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.c$b */
    public static final class C60758b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C60756c f138064a;

        static {
            Covode.recordClassIndex(71315);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60758b(C60756c cVar) {
            this.f138064a = cVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onPause(DownloadInfo downloadInfo) {
            super.onPause(downloadInfo);
            CountDownLatch countDownLatch = this.f138064a.f138058e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            AbstractC61065b bVar = this.f138064a.f138055b;
            if (bVar != null) {
                bVar.mo69324a();
            }
            CountDownLatch countDownLatch = this.f138064a.f138058e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C60769f fVar = this.f138064a.f138056c;
            if (fVar != null) {
                fVar.mo98185b(this.f138064a.f138057d, this.f138064a);
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            C60769f fVar = this.f138064a.f138056c;
            if (fVar != null) {
                fVar.mo98184a(this.f138064a.f138057d, this.f138064a);
            }
            AbstractC61065b bVar = this.f138064a.f138055b;
            if (bVar != null) {
                bVar.mo69328b();
            }
            C73991bj.m130128a("Download Music Beat start time: " + System.currentTimeMillis());
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            AbstractC61065b bVar = this.f138064a.f138055b;
            Long l = null;
            if (bVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getTargetFilePath()) == null) {
                    str = "";
                }
                bVar.mo69327a(str, null);
            }
            StringBuilder append = new StringBuilder("Download Music Beat success time: ").append(System.currentTimeMillis()).append(" duration: ");
            if (downloadInfo != null) {
                l = Long.valueOf(downloadInfo.getDownloadTime());
            }
            C73991bj.m130128a(append.append(l).toString());
            CountDownLatch countDownLatch = this.f138064a.f138058e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C60769f fVar = this.f138064a.f138056c;
            if (fVar != null) {
                fVar.mo98185b(this.f138064a.f138057d, this.f138064a);
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            AbstractC61065b bVar = this.f138064a.f138055b;
            if (bVar != null) {
                bVar.mo69326a(new C84125a());
            }
            StringBuilder sb = new StringBuilder("Download Music Beat beat url fail, cur url: ");
            Integer num = null;
            if (downloadInfo != null) {
                str = downloadInfo.getConnectionUrl();
            } else {
                str = null;
            }
            StringBuilder append = sb.append(str).append(",retry url index: ");
            if (downloadInfo != null) {
                num = Integer.valueOf(downloadInfo.getCurBackUpUrlIndex());
            }
            C73991bj.m130128a(append.append(num).toString());
            CountDownLatch countDownLatch = this.f138064a.f138058e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C60769f fVar = this.f138064a.f138056c;
            if (fVar != null) {
                fVar.mo98185b(this.f138064a.f138057d, this.f138064a);
            }
        }
    }

    /* renamed from: a */
    public final void mo98173a(C60769f fVar) {
        C89219l.m154721d(fVar, "");
        this.f138056c = fVar;
    }

    public C60756c(UrlModel urlModel, String str, String str2, CountDownLatch countDownLatch) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f138063k = urlModel;
        this.f138057d = str2;
        this.f138058e = countDownLatch;
        String a = C60829g.m110430a(str);
        C89219l.m154716b(a, "");
        this.f138059g = a;
        String b = C60829g.m110431b(str);
        C89219l.m154716b(b, "");
        this.f138060h = b;
        C80313cs.m139225a(C60829g.f138241a, false);
    }
}
