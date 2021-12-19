package com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57148d;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57154a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.util.concurrent.CountDownLatch;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.c.d */
public final class C57089d implements AbstractC57086b {

    /* renamed from: j */
    public static final C57090a f129968j = new C57090a((byte) 0);

    /* renamed from: b */
    public final String f129969b;

    /* renamed from: c */
    public int f129970c = -1;

    /* renamed from: d */
    public IDownloadListener f129971d;

    /* renamed from: e */
    public AbstractC57123a f129972e;

    /* renamed from: f */
    public C57093f f129973f;

    /* renamed from: g */
    public final UrlModel f129974g;

    /* renamed from: h */
    public final String f129975h;

    /* renamed from: i */
    public final CountDownLatch f129976i;

    /* renamed from: k */
    private final String f129977k;

    static {
        Covode.recordClassIndex(66983);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.d$a */
    public static final class C57090a {
        static {
            Covode.recordClassIndex(66984);
        }

        private C57090a() {
        }

        public /* synthetic */ C57090a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57086b
    /* renamed from: a */
    public final void mo94242a() {
        Downloader.getInstance(C17867d.m33078a()).removeSubThreadListener(this.f129970c, this.f129971d);
        this.f129973f = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57086b
    /* renamed from: b */
    public final void mo94243b() {
        Downloader.getInstance(C17867d.m33078a()).removeSubThreadListener(this.f129970c, this.f129971d);
        this.f129973f = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.d$b */
    public static final class C57091b extends AbstractC57085a {

        /* renamed from: a */
        final /* synthetic */ C57089d f129978a;

        static {
            Covode.recordClassIndex(66985);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C57091b(C57089d dVar) {
            this.f129978a = dVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onPause(DownloadInfo downloadInfo) {
            super.onPause(downloadInfo);
            CountDownLatch countDownLatch = this.f129978a.f129976i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57085a, com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            AbstractC57123a aVar = this.f129978a.f129972e;
            if (aVar != null) {
                aVar.mo94232b();
            }
            CountDownLatch countDownLatch = this.f129978a.f129976i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C57093f fVar = this.f129978a.f129973f;
            if (fVar != null) {
                fVar.mo94248b(this.f129978a.f129975h, this.f129978a);
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            C57093f fVar = this.f129978a.f129973f;
            if (fVar != null) {
                fVar.mo94247a(this.f129978a.f129975h, this.f129978a);
            }
            AbstractC57123a aVar = this.f129978a.f129972e;
            if (aVar != null) {
                aVar.mo94228a();
            }
            C73991bj.m130128a("Download Music Beat start time: " + System.currentTimeMillis());
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57085a, com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            AbstractC57123a aVar = this.f129978a.f129972e;
            Long l = null;
            if (aVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getTargetFilePath()) == null) {
                    str = "";
                }
                aVar.mo94231a(str, null);
            }
            StringBuilder append = new StringBuilder("Download Music Beat success time: ").append(System.currentTimeMillis()).append(" duration: ");
            if (downloadInfo != null) {
                l = Long.valueOf(downloadInfo.getDownloadTime());
            }
            C73991bj.m130128a(append.append(l).toString());
            CountDownLatch countDownLatch = this.f129978a.f129976i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C57093f fVar = this.f129978a.f129973f;
            if (fVar != null) {
                fVar.mo94248b(this.f129978a.f129975h, this.f129978a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57085a, com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            AbstractC57123a aVar = this.f129978a.f129972e;
            if (aVar != null) {
                aVar.mo94230a(new C57154a());
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
            CountDownLatch countDownLatch = this.f129978a.f129976i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C57093f fVar = this.f129978a.f129973f;
            if (fVar != null) {
                fVar.mo94248b(this.f129978a.f129975h, this.f129978a);
            }
        }
    }

    public C57089d(UrlModel urlModel, String str, String str2, CountDownLatch countDownLatch) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f129974g = urlModel;
        this.f129975h = str2;
        this.f129976i = countDownLatch;
        String str3 = C57148d.f130109a + C57148d.m103545a(str);
        C89219l.m154716b(str3, "");
        this.f129977k = str3;
        String a = C57148d.m103545a(str);
        C89219l.m154716b(a, "");
        this.f129969b = a;
        C80313cs.m139225a(C57148d.f130109a, false);
    }
}
