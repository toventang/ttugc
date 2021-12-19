package com.p2082ss.android.ugc.aweme.download.impl.component_impl;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30426r;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.EnumC43176c;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend;
import com.p2082ss.android.ugc.aweme.download.component_api.p2810b.AbstractC43173a;
import com.p2082ss.android.ugc.aweme.download.component_api.p2811c.C43177a;
import com.p2082ss.android.ugc.aweme.download.component_api.p2811c.C43178b;
import com.p2082ss.android.ugc.aweme.download.component_api.p2811c.C43179c;
import com.p2082ss.android.ugc.aweme.download.component_api.p2811c.C43180d;
import com.p2082ss.android.ugc.aweme.download.impl.component_impl.p2812a.C43187a;
import com.p2082ss.android.ugc.aweme.download.impl.component_impl.p2813b.C43190a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.d */
public final class C43193d extends AbstractC43167a implements C43187a.AbstractC43188a {

    /* renamed from: aa */
    private DownloadTask f100681aa;

    static {
        Covode.recordClassIndex(51380);
    }

    /* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.d$a */
    public static final class C43194a implements C43180d.AbstractC43181a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f100682a;

        static {
            Covode.recordClassIndex(51381);
        }

        @Override // com.p2082ss.android.ugc.aweme.download.component_api.p2811c.C43180d.AbstractC43181a
        /* renamed from: a */
        public final void mo73420a() {
            this.f100682a.invoke();
        }

        C43194a(AbstractC89171a aVar) {
            this.f100682a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a
    /* renamed from: f */
    public final int mo73409f() {
        return mo73397a(EnumC43176c.DEFAULT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.d$c */
    public static final class C43196c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43193d f100686a;

        /* renamed from: b */
        final /* synthetic */ DownloadTask f100687b;

        static {
            Covode.recordClassIndex(51383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43196c(C43193d dVar, DownloadTask downloadTask) {
            super(0);
            this.f100686a = dVar;
            this.f100687b = downloadTask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f100686a.f100625b = this.f100687b.download();
            C43197e.m86150a().mo73442a(this.f100686a.f100625b, this.f100686a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.d$b */
    static final class C43195b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43193d f100683a;

        /* renamed from: b */
        final /* synthetic */ DownloadTask f100684b;

        /* renamed from: c */
        final /* synthetic */ AbstractC30426r f100685c;

        static {
            Covode.recordClassIndex(51382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43195b(C43193d dVar, DownloadTask downloadTask, AbstractC30426r rVar) {
            super(0);
            this.f100683a = dVar;
            this.f100684b = downloadTask;
            this.f100685c = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f100684b.asyncDownload(this.f100685c);
            C43193d dVar = this.f100683a;
            dVar.f100625b = Downloader.getInstance(dVar.f100624a).getDownloadId(this.f100683a.f100628e, this.f100683a.f100629f);
            C43197e.m86150a().mo73442a(this.f100683a.f100625b, this.f100683a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final void m86143c(DownloadTask downloadTask) {
        m86141a(new C43196c(this, downloadTask));
    }

    /* renamed from: a */
    private final void m86141a(AbstractC89171a<C89391z> aVar) {
        boolean z;
        Context context = this.f100624a;
        C89219l.m154716b(context, "");
        int i = context.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || (i != 29 ? i <= 29 : Environment.isExternalStorageLegacy())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f100604G || z) {
            aVar.invoke();
        } else {
            C43180d.m86114a(this.f100624a, new C43194a(aVar));
        }
    }

    /* renamed from: b */
    private final void m86142b(DownloadTask downloadTask) {
        if (this.f100600C != null) {
            downloadTask.mainThreadListener(new C43187a(this.f100600C, this.f100623Z, this));
        }
        if (this.f100601D != null) {
            downloadTask.subThreadListener(new C43187a(this.f100601D, this.f100623Z, this));
        }
        if (this.f100615R) {
            downloadTask.monitorDepend(new DownloadMonitorDepend(DownloadServiceImpl.f100662b, this.f100608K, this.f100606I, this.f100607J));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a
    /* renamed from: a */
    public final int mo73396a(AbstractC30426r rVar) {
        this.f100605H = EnumC43176c.DEFAULT;
        m86140a(this.f100681aa);
        m86142b(this.f100681aa);
        m86141a(new C43195b(this, this.f100681aa, rVar));
        return Downloader.getInstance(this.f100624a).getDownloadId(this.f100628e, this.f100629f);
    }

    /* renamed from: a */
    private final void m86140a(DownloadTask downloadTask) {
        downloadTask.url(this.f100628e).backUpUrls(this.f100637n).name(this.f100626c).title(this.f100627d).savePath(this.f100629f).onlyWifi(this.f100630g).extraHeaders(this.f100633j).addTTNetCommonParam(this.f100631h).depend(this.f100603F).retryCount(this.f100634k).backUpUrlRetryCount(this.f100616S).showNotification(this.f100638o).extra(this.f100632i).mimeType(this.f100639p).force(this.f100622Y).minProgressTimeMsInterval(this.f100636m).maxProgressCount(this.f100635l).notificationListener(this.f100602E).notificationEventListener(this.f100599B).autoResumed(this.f100647x).showNotificationForAutoResumed(this.f100648y).needHttpsToHttpRetry(this.f100640q).packageName(this.f100641r).md5(this.f100642s).fileUriProvider(this.f100649z).expectFileLength(this.f100646w).retryDelayTimeCalculator(this.f100598A).iconUrl(this.f100643t).addListenerToSameTask(this.f100621X).needSDKMonitor(this.f100644u).monitorScene(this.f100645v);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a
    /* renamed from: a */
    public final int mo73397a(EnumC43176c cVar) {
        C89219l.m154721d(cVar, "");
        this.f100605H = cVar;
        m86140a(this.f100681aa);
        m86142b(this.f100681aa);
        m86143c(this.f100681aa);
        return Downloader.getInstance(this.f100624a).getDownloadId(this.f100628e, this.f100629f);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.impl.component_impl.p2812a.C43187a.AbstractC43188a
    /* renamed from: a */
    public final void mo73441a(DownloadInfo downloadInfo) {
        if ((EnumC43176c.IMAGE == this.f100605H || EnumC43176c.VIDEO == this.f100605H) && this.f100612O && downloadInfo != null) {
            try {
                String targetFilePath = downloadInfo.getTargetFilePath();
                String str = this.f100613P;
                if (!TextUtils.isEmpty(targetFilePath)) {
                    if (!TextUtils.isEmpty(str)) {
                        Context context = this.f100624a;
                        C89219l.m154716b(context, "");
                        C89219l.m154716b(targetFilePath, "");
                        C89219l.m154716b(str, "");
                        if (C43177a.m86108a(context, targetFilePath, str, downloadInfo.getMimeType())) {
                            AbstractC43173a aVar = this.f100614Q;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (EnumC43176c.ZIP == this.f100605H && this.f100609L && downloadInfo != null) {
            try {
                String targetFilePath2 = downloadInfo.getTargetFilePath();
                if (!TextUtils.isEmpty(targetFilePath2)) {
                    if (!C30535g.m62583b(downloadInfo)) {
                        C30535g.m62552a(downloadInfo, true);
                    } else if (!TextUtils.isEmpty(this.f100610M)) {
                        File file = new File(this.f100610M);
                        if (file.exists()) {
                            File[] listFiles = file.listFiles();
                            C89219l.m154716b(listFiles, "");
                            if (listFiles.length != 0) {
                                C43178b bVar = C43178b.f100660a;
                                String path = file.getPath();
                                C89219l.m154716b(path, "");
                                bVar.mo73419a(path);
                            }
                        }
                        File a = C80313cs.m139225a(this.f100610M, false);
                        C89219l.m154716b(a, "");
                        C43190a.m86129a(new File(targetFilePath2), a);
                        if (this.f100611N != null) {
                            a.getPath();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.f100623Z && downloadInfo != null) {
            C43179c.m86112a(this.f100624a, this);
        }
    }

    public C43193d(Context context, String str) {
        super(context, str);
        DownloadTask with = Downloader.with(context);
        C89219l.m154716b(with, "");
        this.f100681aa = with;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a
    /* renamed from: a */
    public final void mo73403a(int i, AbsDownloadListener absDownloadListener, EnumC30294h hVar) {
        C89219l.m154721d(absDownloadListener, "");
        C89219l.m154721d(hVar, "");
        this.f100681aa.addDownloadListener(i, absDownloadListener, hVar, true);
    }
}
