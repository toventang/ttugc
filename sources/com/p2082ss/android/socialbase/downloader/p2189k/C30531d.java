package com.p2082ss.android.socialbase.downloader.p2189k;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30378p;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.k.d */
public final class C30531d {
    static {
        Covode.recordClassIndex(37059);
    }

    /* renamed from: a */
    public static void m62530a(int i, SparseArray<IDownloadListener> sparseArray, boolean z, DownloadInfo downloadInfo, BaseException baseException) {
        SparseArray<IDownloadListener> clone;
        MethodCollector.m26663i(7773);
        if (z && sparseArray != null) {
            try {
                if (sparseArray.size() > 0) {
                    synchronized (sparseArray) {
                        try {
                            clone = sparseArray.clone();
                        } finally {
                            MethodCollector.m26664o(7773);
                        }
                    }
                    for (int i2 = 0; i2 < clone.size(); i2++) {
                        IDownloadListener iDownloadListener = clone.get(clone.keyAt(i2));
                        if (iDownloadListener != null) {
                            if (i == 1) {
                                iDownloadListener.onPrepare(downloadInfo);
                            } else if (i == 2) {
                                iDownloadListener.onStart(downloadInfo);
                            } else if (i == 4) {
                                iDownloadListener.onProgress(downloadInfo);
                            } else if (i == 5) {
                                iDownloadListener.onRetry(downloadInfo, baseException);
                            } else if (i == 6) {
                                iDownloadListener.onFirstStart(downloadInfo);
                            } else if (i == 7) {
                                iDownloadListener.onRetryDelay(downloadInfo, baseException);
                            } else if (i != 11) {
                                switch (i) {
                                    case -7:
                                        if (iDownloadListener instanceof AbsDownloadListener) {
                                            ((AbsDownloadListener) iDownloadListener).onIntercept(downloadInfo);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case -6:
                                        iDownloadListener.onFirstSuccess(downloadInfo);
                                        continue;
                                    case -5:
                                    case -2:
                                        iDownloadListener.onPause(downloadInfo);
                                        continue;
                                    case -4:
                                        iDownloadListener.onCanceled(downloadInfo);
                                        continue;
                                    case -3:
                                        iDownloadListener.onSuccessed(downloadInfo);
                                        continue;
                                    case -1:
                                        iDownloadListener.onFailed(downloadInfo, baseException);
                                        continue;
                                }
                            } else if (iDownloadListener instanceof AbstractC30378p) {
                                ((AbstractC30378p) iDownloadListener).mo53934a(downloadInfo);
                            }
                        }
                    }
                    return;
                }
            } catch (Throwable unused) {
                MethodCollector.m26664o(7773);
                return;
            }
        }
        MethodCollector.m26664o(7773);
    }
}
