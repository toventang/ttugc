package com.p2082ss.android.ugc.aweme.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import java.lang.ref.WeakReference;
import p078c.p080b.C1757e;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.util.u */
public final class C80163u {

    /* renamed from: a */
    public static final C80164a f179603a = new C80164a((byte) 0);

    /* renamed from: b */
    private final WeakReference<Context> f179604b;

    /* renamed from: com.ss.android.ugc.aweme.util.u$b */
    public interface AbstractC80165b {
        static {
            Covode.recordClassIndex(93409);
        }

        /* renamed from: a */
        void mo123610a();

        /* renamed from: a */
        void mo109546a(Uri uri);

        /* renamed from: b */
        void mo123611b();
    }

    static {
        Covode.recordClassIndex(93407);
    }

    /* renamed from: com.ss.android.ugc.aweme.util.u$a */
    public static final class C80164a {
        static {
            Covode.recordClassIndex(93408);
        }

        private C80164a() {
        }

        public /* synthetic */ C80164a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.util.u$c */
    public static final class C80166c extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC80165b f179605a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f179606b;

        static {
            Covode.recordClassIndex(93410);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                downloadInfo.getCurBytes();
                downloadInfo.getTotalBytes();
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            AbstractC80165b bVar = this.f179605a;
            if (bVar != null) {
                new RuntimeException("Download is canceled");
                bVar.mo123611b();
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            AbstractC80165b bVar = this.f179605a;
            if (bVar != null) {
                bVar.mo109546a(this.f179606b.element);
            }
        }

        C80166c(AbstractC80165b bVar, C89233z.C89238e eVar) {
            this.f179605a = bVar;
            this.f179606b = eVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            AbstractC80165b bVar = this.f179605a;
            if (bVar != null) {
                bVar.mo123611b();
            }
        }
    }

    public C80163u(WeakReference<Context> weakReference) {
        C89219l.m154721d(weakReference, "");
        this.f179604b = weakReference;
    }

    /* renamed from: a */
    public final void mo123609a(String str, AbstractC80165b bVar) {
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            bVar.mo123611b();
            return;
        }
        Context context = this.f179604b.get();
        if (context != null) {
            C89219l.m154716b(context, "");
            if (C69124b.m122227b(context)) {
                m138920b(str, bVar);
            } else {
                C69125c.m122233a(context);
            }
        }
    }

    /* renamed from: b */
    private final void m138920b(String str, AbstractC80165b bVar) {
        if (bVar != null) {
            bVar.mo123610a();
        }
        String str2 = C13607d.m24442b(str) + ".png";
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) C1757e.m5910c(this.f179604b.get(), str2, "image/png");
        if (eVar.element == null) {
            eVar.element = (T) C1757e.m5902a(this.f179604b.get(), str2, "image/png");
        }
        if (!C1757e.m5913c(this.f179604b.get(), (Uri) eVar.element) && this.f179604b.get() != null) {
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            with.f100626c = str2;
            with.f100629f = String.valueOf(eVar.element);
            with.f100601D = new C80166c(bVar, eVar);
            with.mo73409f();
        }
    }
}
