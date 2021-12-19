package com.p2082ss.android.socialbase.downloader.depend;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;

/* renamed from: com.ss.android.socialbase.downloader.depend.AbsDownloadListener */
public abstract class AbsDownloadListener implements IDownloadListener {
    private static final String TAG = AbsDownloadListener.class.getSimpleName();

    static {
        Covode.recordClassIndex(36844);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onCanceled -- " + downloadInfo.getName());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onFirstStart -- " + downloadInfo.getName());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onFirstSuccess -- " + downloadInfo.getName());
        }
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onIntercept -- " + downloadInfo.getName());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onPause -- " + downloadInfo.getName());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onPrepare -- " + downloadInfo.getName());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            C30434a.m62027b(TAG, C1764a.m5928a("onProgress %s %.2f%%", new Object[]{downloadInfo.getName(), Float.valueOf((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f)}));
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onStart -- " + downloadInfo.getName());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (C30434a.m62025a() && downloadInfo != null) {
            C30434a.m62027b(TAG, " onSuccessed -- " + downloadInfo.getName() + " " + downloadInfo.isSuccessByCache());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C30434a.m62025a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C30434a.m62027b(str2, C1764a.m5928a("onFailed on %s because of : %s", objArr));
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C30434a.m62025a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C30434a.m62027b(str2, C1764a.m5928a("onRetry on %s because of : %s", objArr));
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C30434a.m62025a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C30434a.m62027b(str2, C1764a.m5928a("onRetryDelay on %s because of : %s", objArr));
        }
    }
}
