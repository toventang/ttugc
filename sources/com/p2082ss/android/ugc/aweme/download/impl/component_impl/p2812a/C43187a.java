package com.p2082ss.android.ugc.aweme.download.impl.component_impl.p2812a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.a.a */
public final class C43187a implements IDownloadListener {

    /* renamed from: a */
    private IDownloadListener f100674a;

    /* renamed from: b */
    private boolean f100675b;

    /* renamed from: c */
    private AbstractC43188a f100676c;

    /* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.a.a$a */
    public interface AbstractC43188a {
        static {
            Covode.recordClassIndex(51375);
        }

        /* renamed from: a */
        void mo73441a(DownloadInfo downloadInfo);
    }

    static {
        Covode.recordClassIndex(51374);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onCanceled(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onFirstStart(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onFirstSuccess(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onPause(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onPrepare(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onProgress(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onStart(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        AbstractC43188a aVar = this.f100676c;
        if (aVar != null) {
            aVar.mo73441a(downloadInfo);
        }
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onSuccessed(downloadInfo);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onFailed(downloadInfo, baseException);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onRetry(downloadInfo, baseException);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.f100674a;
        if (iDownloadListener != null) {
            iDownloadListener.onRetryDelay(downloadInfo, baseException);
        }
    }

    public C43187a(IDownloadListener iDownloadListener, boolean z, AbstractC43188a aVar) {
        this.f100674a = iDownloadListener;
        this.f100675b = z;
        this.f100676c = aVar;
    }
}
