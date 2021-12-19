package com.p2082ss.android.ugc.aweme.shoutouts;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutVideoDownloader */
public final class ShoutOutVideoDownloader implements AbstractC33974au {

    /* renamed from: g */
    public static final C74375a f167265g = new C74375a((byte) 0);

    /* renamed from: a */
    public int f167266a = -1;

    /* renamed from: b */
    public final String f167267b;

    /* renamed from: c */
    public final String f167268c;

    /* renamed from: d */
    public final String f167269d;

    /* renamed from: e */
    public final ShoutoutVideoDownloadListener f167270e;

    /* renamed from: f */
    public final AbstractC1204m f167271f;

    static {
        Covode.recordClassIndex(87149);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutVideoDownloader$a */
    public static final class C74375a {
        static {
            Covode.recordClassIndex(87150);
        }

        private C74375a() {
        }

        public /* synthetic */ C74375a(byte b) {
            this();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f167266a != -1) {
            Downloader.getInstance(C40963b.m82473a()).cancel(this.f167266a);
        }
        this.f167271f.getLifecycle().mo4013b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutVideoDownloader$b */
    public static final class C74376b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ ShoutOutVideoDownloader f167272a;

        static {
            Covode.recordClassIndex(87151);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74376b(ShoutOutVideoDownloader shoutOutVideoDownloader) {
            this.f167272a = shoutOutVideoDownloader;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            long j;
            long j2;
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                j = downloadInfo.getCurBytes();
                j2 = downloadInfo.getTotalBytes();
            } else {
                j = 0;
                j2 = 100;
            }
            C84911q.m145921a("SHOUTOUTTOOLSShoutOutVideoDownloader onProgress".concat(String.valueOf((int) (((((float) j) * 1.0f) / ((float) j2)) * 100.0f))));
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            Downloader.getInstance(C40963b.m82473a()).removeSubThreadListener(this.f167272a.f167266a, this);
            AbstractC1196i lifecycle = this.f167272a.f167271f.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) < 0) {
                ShoutoutVideoDownloadListener shoutoutVideoDownloadListener = this.f167272a.f167270e;
                if (shoutoutVideoDownloadListener != null) {
                    shoutoutVideoDownloadListener.onSuccess("");
                    return;
                }
                return;
            }
            if (downloadInfo != null) {
                this.f167272a.f167266a = -1;
                ShoutoutVideoDownloadListener shoutoutVideoDownloadListener2 = this.f167272a.f167270e;
                if (shoutoutVideoDownloadListener2 != null) {
                    shoutoutVideoDownloadListener2.onSuccess(ShoutOutVideoDownloader.m130836a(downloadInfo));
                }
            }
            StringBuilder sb = new StringBuilder("SHOUTOUTTOOLSShoutOutVideoDownloader onSuccessed");
            if (downloadInfo != null) {
                str = ShoutOutVideoDownloader.m130836a(downloadInfo);
            } else {
                str = null;
            }
            C84911q.m145921a(sb.append(str).toString());
            if (downloadInfo != null) {
                ShoutOutVideoDownloader.m130836a(downloadInfo);
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            ShoutoutVideoDownloadListener shoutoutVideoDownloadListener = this.f167272a.f167270e;
            if (shoutoutVideoDownloadListener != null) {
                shoutoutVideoDownloadListener.onFail();
            }
            StringBuilder sb = new StringBuilder("SHOUTOUTTOOLSShoutOutVideoDownloader onFailure");
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            C84911q.m145926b(sb.append(str).toString());
            if (baseException != null) {
                baseException.getErrorMessage();
            }
            Downloader.getInstance(C40963b.m82473a()).removeSubThreadListener(this.f167272a.f167266a, this);
        }
    }

    /* renamed from: a */
    public static String m130836a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath == null || !C89361p.m154876c(savePath, "/", false)) {
            return downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
        }
        return downloadInfo.getSavePath() + downloadInfo.getName();
    }

    public ShoutOutVideoDownloader(String str, String str2, String str3, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener, AbstractC1204m mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(mVar, "");
        this.f167267b = str;
        this.f167268c = str2;
        this.f167269d = str3;
        this.f167270e = shoutoutVideoDownloadListener;
        this.f167271f = mVar;
    }
}
