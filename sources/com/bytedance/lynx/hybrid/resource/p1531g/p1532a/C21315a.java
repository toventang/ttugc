package com.bytedance.lynx.hybrid.resource.p1531g.p1532a;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21278d;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21283i;
import com.bytedance.lynx.hybrid.resource.config.C21282h;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1526b.C21248d;
import com.bytedance.lynx.hybrid.resource.p1526b.C21263f;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.resource.g.a.a */
public final class C21315a implements AbstractC21278d {

    /* renamed from: a */
    public static final C21316a f50613a = new C21316a((byte) 0);

    static {
        Covode.recordClassIndex(24933);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.g.a.a$a */
    public static final class C21316a {
        static {
            Covode.recordClassIndex(24934);
        }

        private C21316a() {
        }

        public /* synthetic */ C21316a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.g.a.a$b */
    public static final class C21317b extends AbsDownloadListener {

        /* renamed from: a */
        public final WeakReference<AbstractC21283i> f50614a;

        /* renamed from: b */
        public final WeakReference<AbstractC21283i> f50615b;

        /* renamed from: c */
        final /* synthetic */ C21315a f50616c;

        /* renamed from: d */
        final /* synthetic */ Application f50617d;

        /* renamed from: e */
        final /* synthetic */ boolean f50618e;

        /* renamed from: f */
        final /* synthetic */ File f50619f;

        /* renamed from: g */
        final /* synthetic */ C89233z.C89238e f50620g;

        /* renamed from: h */
        final /* synthetic */ String f50621h;

        /* renamed from: i */
        final /* synthetic */ C21284j f50622i;

        /* renamed from: j */
        final /* synthetic */ String f50623j;

        /* renamed from: k */
        final /* synthetic */ String f50624k;

        /* renamed from: l */
        final /* synthetic */ int f50625l;

        /* renamed from: m */
        final /* synthetic */ AbstractC21283i f50626m;

        static {
            Covode.recordClassIndex(24935);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            AbstractC21283i iVar;
            C89219l.m154719c(downloadInfo, "");
            C21210c.m39924a("download success，" + downloadInfo.getUrl(), EnumC21209b.D, "res-DownloaderDepend");
            Downloader.getInstance(this.f50617d).removeMainThreadListener(downloadInfo.getId(), this);
            if (!this.f50618e && (iVar = this.f50614a.get()) != null) {
                String absolutePath = this.f50619f.getAbsolutePath();
                C89219l.m154709a((Object) absolutePath, "");
                iVar.mo34834a(new C21282h(absolutePath, downloadInfo.isSuccessByCache()));
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            AbstractC21283i iVar;
            C89219l.m154719c(downloadInfo, "");
            C89219l.m154719c(baseException, "");
            C21210c.m39924a("download failed,errorCode:" + baseException.getErrorCode() + ";errorMsg:" + baseException.getErrorMessage(), EnumC21209b.D, "res-DownloaderDepend");
            Downloader.getInstance(this.f50617d).removeMainThreadListener(downloadInfo.getId(), this);
            if (this.f50620g.element.length() > 0) {
                this.f50616c.mo34925a(this.f50617d, this.f50621h, this.f50622i, this.f50623j, this.f50624k, this.f50618e, this.f50619f, this.f50625l + 1, this.f50626m);
            } else if (!this.f50618e && (iVar = this.f50615b.get()) != null) {
                iVar.mo34835a("Download Failed:reason " + baseException.getErrorCode());
            }
        }

        C21317b(C21315a aVar, Application application, boolean z, File file, C89233z.C89238e eVar, String str, C21284j jVar, String str2, String str3, int i, AbstractC21283i iVar) {
            this.f50616c = aVar;
            this.f50617d = application;
            this.f50618e = z;
            this.f50619f = file;
            this.f50620g = eVar;
            this.f50621h = str;
            this.f50622i = jVar;
            this.f50623j = str2;
            this.f50624k = str3;
            this.f50625l = i;
            this.f50626m = iVar;
            this.f50614a = new WeakReference<>(iVar);
            this.f50615b = new WeakReference<>(iVar);
        }
    }

    /* renamed from: a */
    private static boolean m40030a(File file) {
        MethodCollector.m26663i(5111);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5111);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5111);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139 A[Catch:{ IOException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013a A[Catch:{ IOException -> 0x0180 }] */
    @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21278d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34880a(java.lang.String r21, boolean r22, com.bytedance.lynx.hybrid.resource.config.C21284j r23, com.bytedance.lynx.hybrid.resource.config.AbstractC21283i r24) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.p1531g.p1532a.C21315a.mo34880a(java.lang.String, boolean, com.bytedance.lynx.hybrid.resource.config.j, com.bytedance.lynx.hybrid.resource.config.i):void");
    }

    /* renamed from: a */
    public final void mo34925a(Application application, String str, C21284j jVar, String str2, String str3, boolean z, File file, int i, AbstractC21283i iVar) {
        C21248d dVar;
        String str4;
        boolean z2;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        if (jVar instanceof C21248d) {
            dVar = (C21248d) jVar;
        } else {
            dVar = null;
        }
        if (dVar == null || dVar.f50426v != 1) {
            str4 = str;
        } else {
            Uri parse = Uri.parse(str);
            if (!C89361p.m154908a((CharSequence) str, (CharSequence) dVar.f50425u.get(i), false)) {
                Uri.Builder builder = new Uri.Builder();
                C89219l.m154709a((Object) parse, "");
                str4 = builder.scheme(parse.getScheme()).authority(dVar.f50425u.get(i)).query(parse.getQuery()).path(parse.getPath()).toString();
                C89219l.m154709a((Object) str4, "");
            } else {
                str4 = str;
            }
            if (i + 1 < dVar.f50425u.size()) {
                Uri.Builder builder2 = new Uri.Builder();
                C89219l.m154709a((Object) parse, "");
                T t = (T) builder2.scheme(parse.getScheme()).authority(dVar.f50425u.get(i)).query(parse.getQuery()).path(parse.getPath()).toString();
                C89219l.m154709a((Object) t, "");
                eVar.element = t;
            }
        }
        C21317b bVar = new C21317b(this, application, z, file, eVar, str, jVar, str2, str3, i, iVar);
        String queryParameter = Uri.parse(str4).getQueryParameter("cdn_negotiate");
        if (C21263f.m39968a(queryParameter)) {
            z2 = C89219l.m154714a((Object) queryParameter, (Object) "1");
        } else {
            z2 = jVar.f50526q;
        }
        Downloader.with(application).url(str4).name(str3).savePath(str2).addListenerToSameTask(true).deleteCacheIfCheckFailed(true).retryCount(jVar.f50512c).autoSetHashCodeForSameTask(true).ttnetProtectTimeout(20000).expiredRedownload(z2).mainThreadListener(bVar).download();
    }
}
