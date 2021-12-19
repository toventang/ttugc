package com.p2082ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30333aa;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30365i;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.Downloader */
public class Downloader extends C30398b {
    private static volatile Downloader instance = null;

    private Downloader() {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void destoryDownloader() {
        super.destoryDownloader();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void pauseAll() {
        super.pauseAll();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setDownloadInMultiProcess() {
        super.setDownloadInMultiProcess();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ List getAllDownloadInfo() {
        return super.getAllDownloadInfo();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ File getGlobalSaveDir() {
        return super.getGlobalSaveDir();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ File getGlobalSaveTempDir() {
        return super.getGlobalSaveTempDir();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ AbstractC30428t getReserveWifiStatusListener() {
        return super.getReserveWifiStatusListener();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ boolean isDownloadCacheSyncSuccess() {
        return super.isDownloadCacheSyncSuccess();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ boolean isHttpServiceInit() {
        return super.isHttpServiceInit();
    }

    static {
        Covode.recordClassIndex(36912);
        C30399c.m61691a(new C30433x());
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void cancel(int i) {
        super.cancel(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void clearDownloadData(int i) {
        super.clearDownloadData(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void forceDownloadIngoreRecommendSize(int i) {
        super.forceDownloadIngoreRecommendSize(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void pause(int i) {
        super.pause(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void registerDownloadCacheSyncListener(AbstractC30365i iVar) {
        super.registerDownloadCacheSyncListener(iVar);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void registerDownloaderProcessConnectedListener(AbstractC30333aa aaVar) {
        super.registerDownloaderProcessConnectedListener(aaVar);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void removeTaskMainListener(int i) {
        super.removeTaskMainListener(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void removeTaskNotificationListener(int i) {
        super.removeTaskNotificationListener(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void removeTaskSubListener(int i) {
        super.removeTaskSubListener(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void restart(int i) {
        super.restart(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void restartAllFailedDownloadTasks(List list) {
        super.restartAllFailedDownloadTasks(list);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void restartAllPauseReserveOnWifiDownloadTasks(List list) {
        super.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void resume(int i) {
        super.resume(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setDefaultSavePath(String str) {
        super.setDefaultSavePath(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setDefaultSaveTempPath(String str) {
        super.setDefaultSaveTempPath(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setLogLevel(int i) {
        super.setLogLevel(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setReserveWifiStatusListener(AbstractC30428t tVar) {
        super.setReserveWifiStatusListener(tVar);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void unRegisterDownloadCacheSyncListener(AbstractC30365i iVar) {
        super.unRegisterDownloadCacheSyncListener(iVar);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void unRegisterDownloaderProcessConnectedListener(AbstractC30333aa aaVar) {
        super.unRegisterDownloaderProcessConnectedListener(aaVar);
    }

    Downloader(C30414h hVar) {
        C30399c.m61692a(hVar);
    }

    public static void init(C30414h hVar) {
        initOrCover(hVar, false);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ boolean canResume(int i) {
        return super.canResume(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ long getCurBytes(int i) {
        return super.getCurBytes(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ AbstractC30379q getDownloadFileUriProvider(int i) {
        return super.getDownloadFileUriProvider(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(int i) {
        return super.getDownloadInfo(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ List getDownloadInfoList(String str) {
        return super.getDownloadInfoList(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ AbstractC30393y getDownloadNotificationEventListener(int i) {
        return super.getDownloadNotificationEventListener(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ List getDownloadingDownloadInfosWithMimeType(String str) {
        return super.getDownloadingDownloadInfosWithMimeType(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ List getFailedDownloadInfosWithMimeType(String str) {
        return super.getFailedDownloadInfosWithMimeType(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ int getStatus(int i) {
        return super.getStatus(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ List getSuccessedDownloadInfosWithMimeType(String str) {
        return super.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ List getUnCompletedDownloadInfosWithMimeType(String str) {
        return super.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ boolean isDownloadServiceForeground(int i) {
        return super.isDownloadServiceForeground(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return super.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ boolean isDownloading(int i) {
        return super.isDownloading(i);
    }

    public static Downloader getInstance(Context context) {
        MethodCollector.m26663i(8920);
        if (instance == null) {
            synchronized (Downloader.class) {
                try {
                    if (instance == null) {
                        C30399c.m61688a(context);
                        instance = new Downloader();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8920);
                    throw th;
                }
            }
        }
        Downloader downloader = instance;
        MethodCollector.m26664o(8920);
        return downloader;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.addMainThreadListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.addNotificationListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.addSubThreadListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.removeMainThreadListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.removeNotificationListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.removeSubThreadListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setDownloadNotificationEventListener(int i, AbstractC30393y yVar) {
        super.setDownloadNotificationEventListener(i, yVar);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.setMainThreadListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.setNotificationListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.setSubThreadListener(i, iDownloadListener);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setThrottleNetSpeed(int i, long j) {
        super.setThrottleNetSpeed(i, j);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void cancel(int i, boolean z) {
        super.cancel(i, z);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void clearDownloadData(int i, boolean z) {
        super.clearDownloadData(i, z);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ int getDownloadId(String str, String str2) {
        return super.getDownloadId(str, str2);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(String str, String str2) {
        return super.getDownloadInfo(str, str2);
    }

    public static synchronized void initOrCover(C30414h hVar, boolean z) {
        synchronized (Downloader.class) {
            MethodCollector.m26663i(8775);
            if (hVar == null) {
                MethodCollector.m26664o(8775);
            } else if (instance == null) {
                instance = new Downloader(hVar);
                MethodCollector.m26664o(8775);
            } else if (!C30399c.f72439k) {
                C30399c.m61692a(hVar);
                MethodCollector.m26664o(8775);
            } else {
                if (z) {
                    C30399c.m61709b(hVar);
                }
                MethodCollector.m26664o(8775);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30398b
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        super.setMainThreadListener(i, iDownloadListener, z);
    }
}
