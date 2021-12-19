package com.bytedance.ies.bullet.p1145f;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16311d;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16660c;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16665h;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16664g;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
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

/* renamed from: com.bytedance.ies.bullet.f.a */
public final class C16289a implements AbstractC16660c {

    /* renamed from: a */
    public static final C16290a f39119a = new C16290a((byte) 0);

    static {
        Covode.recordClassIndex(18582);
    }

    /* renamed from: com.bytedance.ies.bullet.f.a$a */
    public static final class C16290a {
        static {
            Covode.recordClassIndex(18583);
        }

        private C16290a() {
        }

        public /* synthetic */ C16290a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.f.a$b */
    public static final class C16291b extends AbsDownloadListener {

        /* renamed from: a */
        public final WeakReference<AbstractC16665h> f39120a;

        /* renamed from: b */
        public final WeakReference<AbstractC16665h> f39121b;

        /* renamed from: c */
        final /* synthetic */ C16289a f39122c;

        /* renamed from: d */
        final /* synthetic */ Application f39123d;

        /* renamed from: e */
        final /* synthetic */ boolean f39124e;

        /* renamed from: f */
        final /* synthetic */ File f39125f;

        /* renamed from: g */
        final /* synthetic */ C89233z.C89238e f39126g;

        /* renamed from: h */
        final /* synthetic */ String f39127h;

        /* renamed from: i */
        final /* synthetic */ C16667j f39128i;

        /* renamed from: j */
        final /* synthetic */ String f39129j;

        /* renamed from: k */
        final /* synthetic */ String f39130k;

        /* renamed from: l */
        final /* synthetic */ int f39131l;

        /* renamed from: m */
        final /* synthetic */ AbstractC16665h f39132m;

        static {
            Covode.recordClassIndex(18584);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            AbstractC16665h hVar;
            C89219l.m154719c(downloadInfo, "");
            downloadInfo.getUrl();
            Downloader.getInstance(this.f39123d).removeMainThreadListener(downloadInfo.getId(), this);
            if (!this.f39124e && (hVar = this.f39120a.get()) != null) {
                String absolutePath = this.f39125f.getAbsolutePath();
                C89219l.m154709a((Object) absolutePath, "");
                hVar.mo25891a(new C16664g(absolutePath, downloadInfo.isSuccessByCache()));
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            AbstractC16665h hVar;
            C89219l.m154719c(downloadInfo, "");
            C89219l.m154719c(baseException, "");
            baseException.getErrorCode();
            baseException.getErrorMessage();
            Downloader.getInstance(this.f39123d).removeMainThreadListener(downloadInfo.getId(), this);
            if (this.f39126g.element.length() > 0) {
                this.f39122c.mo25876a(this.f39123d, this.f39127h, this.f39128i, this.f39129j, this.f39130k, this.f39124e, this.f39125f, this.f39131l + 1, this.f39132m);
            } else if (!this.f39124e && (hVar = this.f39121b.get()) != null) {
                hVar.mo25892a("Download Failed:reason " + baseException.getErrorCode());
            }
        }

        C16291b(C16289a aVar, Application application, boolean z, File file, C89233z.C89238e eVar, String str, C16667j jVar, String str2, String str3, int i, AbstractC16665h hVar) {
            this.f39122c = aVar;
            this.f39123d = application;
            this.f39124e = z;
            this.f39125f = file;
            this.f39126g = eVar;
            this.f39127h = str;
            this.f39128i = jVar;
            this.f39129j = str2;
            this.f39130k = str3;
            this.f39131l = i;
            this.f39132m = hVar;
            this.f39120a = new WeakReference<>(hVar);
            this.f39121b = new WeakReference<>(hVar);
        }
    }

    /* renamed from: a */
    private static boolean m30281a(File file) {
        MethodCollector.m26663i(11223);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11223);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11223);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0135 A[Catch:{ IOException -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0136 A[Catch:{ IOException -> 0x017c }] */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16660c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25877a(java.lang.String r21, boolean r22, com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j r23, com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16665h r24) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p1145f.C16289a.mo25877a(java.lang.String, boolean, com.bytedance.ies.bullet.service.base.resourceloader.config.j, com.bytedance.ies.bullet.service.base.resourceloader.config.h):void");
    }

    /* renamed from: a */
    public final void mo25876a(Application application, String str, C16667j jVar, String str2, String str3, boolean z, File file, int i, AbstractC16665h hVar) {
        C16311d dVar;
        String str4;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        if (jVar instanceof C16311d) {
            dVar = (C16311d) jVar;
        } else {
            dVar = null;
        }
        if (dVar == null || dVar.f39178b != 1) {
            str4 = str;
        } else {
            Uri parse = Uri.parse(str);
            if (!C89361p.m154908a((CharSequence) str, (CharSequence) dVar.f39177a.get(i), false)) {
                Uri.Builder builder = new Uri.Builder();
                C89219l.m154709a((Object) parse, "");
                str4 = builder.scheme(parse.getScheme()).authority(dVar.f39177a.get(i)).query(parse.getQuery()).path(parse.getPath()).toString();
                C89219l.m154709a((Object) str4, "");
            } else {
                str4 = str;
            }
            if (i + 1 < dVar.f39177a.size()) {
                Uri.Builder builder2 = new Uri.Builder();
                C89219l.m154709a((Object) parse, "");
                T t = (T) builder2.scheme(parse.getScheme()).authority(dVar.f39177a.get(i)).query(parse.getQuery()).path(parse.getPath()).toString();
                C89219l.m154709a((Object) t, "");
                eVar.element = t;
            }
        }
        Downloader.with(application).url(str4).name(str3).savePath(str2).addListenerToSameTask(true).deleteCacheIfCheckFailed(true).retryCount(jVar.f39840h).autoSetHashCodeForSameTask(true).ttnetProtectTimeout(20000).expiredRedownload(true).mainThreadListener(new C16291b(this, application, z, file, eVar, str, jVar, str2, str3, i, hVar)).download();
    }
}
