package com.p2082ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30333aa;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30365i;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.impls.C30499l;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.b */
public class C30398b {
    private String globalDefaultSavePath;
    private String globalDefaultSaveTempPath;

    static {
        Covode.recordClassIndex(36917);
    }

    C30398b() {
    }

    public void destoryDownloader() {
        C30399c.m61687a();
    }

    public AbstractC30428t getReserveWifiStatusListener() {
        return C30399c.f72438j;
    }

    public File getGlobalSaveDir() {
        return getGlobalSaveDir(this.globalDefaultSavePath, true);
    }

    public File getGlobalSaveTempDir() {
        return getGlobalSaveDir(this.globalDefaultSaveTempPath, false);
    }

    public boolean isHttpServiceInit() {
        C30405d.m61749a();
        return C30399c.m61675C();
    }

    public boolean isDownloadCacheSyncSuccess() {
        C30405d.m61749a();
        AbstractC30423o a = C30499l.m62246a(false);
        if (a != null) {
            return a.mo54186f();
        }
        return false;
    }

    public void pauseAll() {
        C30405d.m61749a();
        AbstractC30423o a = C30499l.m62246a(false);
        if (a != null) {
            a.mo54145a();
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            a2.mo54145a();
        }
    }

    public List<DownloadInfo> getAllDownloadInfo() {
        List<DownloadInfo> list;
        C30405d.m61749a();
        SparseArray sparseArray = new SparseArray();
        AbstractC30423o a = C30499l.m62246a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo54179d();
        } else {
            list = null;
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            list2 = a2.mo54179d();
        }
        return C30405d.m61750a(list, list2, sparseArray);
    }

    public void setDownloadInMultiProcess() {
        MethodCollector.m26663i(7382);
        if (C30528a.m62524a(4194304)) {
            synchronized (this) {
                try {
                    C30399c.m61707b();
                } finally {
                    MethodCollector.m26664o(7382);
                }
            }
            return;
        }
        C30399c.m61707b();
        MethodCollector.m26664o(7382);
    }

    public void setReserveWifiStatusListener(AbstractC30428t tVar) {
        C30399c.f72438j = tVar;
    }

    public void cancel(int i) {
        cancel(i, true);
    }

    public static DownloadTask with(Context context) {
        Downloader.getInstance(context);
        return new DownloadTask();
    }

    public void clearDownloadData(int i) {
        C30405d.m61749a().mo54058c(i, true);
    }

    public void forceDownloadIngoreRecommendSize(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c != null) {
            c.mo54192j(i);
        }
    }

    public boolean isDownloadServiceForeground(int i) {
        return C30405d.m61749a().mo54057c(i).mo54173b();
    }

    public void pause(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c != null) {
            c.mo54146a(i);
        }
    }

    public void removeTaskMainListener(int i) {
        C30405d.m61749a().mo54051a(i, null, EnumC30294h.MAIN, true);
    }

    public void removeTaskNotificationListener(int i) {
        C30405d.m61749a().mo54051a(i, null, EnumC30294h.NOTIFICATION, true);
    }

    public void removeTaskSubListener(int i) {
        C30405d.m61749a().mo54051a(i, null, EnumC30294h.SUB, true);
    }

    public void restart(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c != null) {
            c.mo54181d(i);
        }
    }

    public void resume(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c != null) {
            c.mo54176c(i);
        }
    }

    public void setDefaultSavePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSavePath = str;
        }
    }

    public void setDefaultSaveTempPath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSaveTempPath = str;
        }
    }

    public boolean canResume(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c == null) {
            return false;
        }
        return c.mo54174b(i);
    }

    public long getCurBytes(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c == null) {
            return 0;
        }
        return c.mo54182e(i);
    }

    public AbstractC30379q getDownloadFileUriProvider(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c == null) {
            return null;
        }
        return c.mo54201s(i);
    }

    public DownloadInfo getDownloadInfo(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c == null) {
            return null;
        }
        return c.mo54189h(i);
    }

    public AbstractC30393y getDownloadNotificationEventListener(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c == null) {
            return null;
        }
        return c.mo54199q(i);
    }

    public int getStatus(int i) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c == null) {
            return 0;
        }
        return c.mo54185f(i);
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        AbstractC30423o c;
        C30405d a = C30405d.m61749a();
        if (downloadInfo == null || (c = a.mo54057c(downloadInfo.getId())) == null) {
            return false;
        }
        return c.mo54164a(downloadInfo);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        C30405d.m61749a();
        AbstractC30423o a = C30499l.m62246a(false);
        if (a != null) {
            a.mo54162a(list);
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            a2.mo54162a(list);
        }
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        C30405d.m61749a();
        AbstractC30423o a = C30499l.m62246a(false);
        if (a != null) {
            a.mo54172b(list);
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            a2.mo54172b(list);
        }
    }

    public void setLogLevel(int i) {
        C30405d.m61749a();
        AbstractC30423o a = C30499l.m62246a(false);
        if (a != null) {
            a.mo54193k(i);
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            a2.mo54193k(i);
        }
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        C30405d.m61749a();
        List<DownloadInfo> a = C30499l.m62246a(false).mo54144a(str);
        List<DownloadInfo> a2 = C30499l.m62246a(true).mo54144a(str);
        if (a == null) {
            if (a2 == null) {
                return null;
            }
            return a2;
        } else if (a2 == null) {
            return a;
        } else {
            ArrayList arrayList = new ArrayList(a);
            arrayList.addAll(a2);
            return arrayList;
        }
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        C30405d.m61749a();
        SparseArray sparseArray = new SparseArray();
        AbstractC30423o a = C30499l.m62246a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo54183e(str);
        } else {
            list = null;
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            list2 = a2.mo54183e(str);
        }
        return C30405d.m61750a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        C30405d.m61749a();
        SparseArray sparseArray = new SparseArray();
        AbstractC30423o a = C30499l.m62246a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo54166b(str);
        } else {
            list = null;
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            list2 = a2.mo54166b(str);
        }
        return C30405d.m61750a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        C30405d.m61749a();
        SparseArray sparseArray = new SparseArray();
        AbstractC30423o a = C30499l.m62246a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo54175c(str);
        } else {
            list = null;
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            list2 = a2.mo54175c(str);
        }
        return C30405d.m61750a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> list;
        C30405d.m61749a();
        SparseArray sparseArray = new SparseArray();
        AbstractC30423o a = C30499l.m62246a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo54180d(str);
        } else {
            list = null;
        }
        AbstractC30423o a2 = C30499l.m62246a(true);
        if (a2 != null) {
            list2 = a2.mo54180d(str);
        }
        return C30405d.m61750a(list, list2, sparseArray);
    }

    public boolean isDownloading(int i) {
        boolean d;
        MethodCollector.m26663i(6165);
        if (C30528a.m62524a(4194304)) {
            synchronized (this) {
                try {
                    d = C30405d.m61749a().mo54059d(i);
                } finally {
                    MethodCollector.m26664o(6165);
                }
            }
            return d;
        }
        boolean d2 = C30405d.m61749a().mo54059d(i);
        MethodCollector.m26664o(6165);
        return d2;
    }

    public void registerDownloadCacheSyncListener(AbstractC30365i iVar) {
        MethodCollector.m26663i(7374);
        C30405d.m61749a();
        synchronized (C30399c.f72434f) {
            if (iVar != null) {
                try {
                    if (!C30399c.f72434f.contains(iVar)) {
                        C30399c.f72434f.add(iVar);
                        return;
                    }
                } finally {
                    MethodCollector.m26664o(7374);
                }
            }
            MethodCollector.m26664o(7374);
        }
    }

    public void registerDownloaderProcessConnectedListener(AbstractC30333aa aaVar) {
        MethodCollector.m26663i(7714);
        C30405d a = C30405d.m61749a();
        if (aaVar == null || C30535g.m62594c()) {
            MethodCollector.m26664o(7714);
            return;
        }
        C30499l.m62246a(true).mo54190h();
        synchronized (a.f72457b) {
            try {
                if (!a.f72457b.contains(aaVar)) {
                    a.f72457b.add(aaVar);
                }
            } finally {
                MethodCollector.m26664o(7714);
            }
        }
    }

    public void unRegisterDownloadCacheSyncListener(AbstractC30365i iVar) {
        MethodCollector.m26663i(7377);
        C30405d.m61749a();
        synchronized (C30399c.f72434f) {
            if (iVar != null) {
                try {
                    if (C30399c.f72434f.contains(iVar)) {
                        C30399c.f72434f.remove(iVar);
                        return;
                    }
                } finally {
                    MethodCollector.m26664o(7377);
                }
            }
            MethodCollector.m26664o(7377);
        }
    }

    public void unRegisterDownloaderProcessConnectedListener(AbstractC30333aa aaVar) {
        MethodCollector.m26663i(8000);
        C30405d a = C30405d.m61749a();
        if (aaVar != null) {
            synchronized (a.f72457b) {
                try {
                    if (a.f72457b.contains(aaVar)) {
                        a.f72457b.remove(aaVar);
                    }
                } finally {
                    MethodCollector.m26664o(8000);
                }
            }
            return;
        }
        MethodCollector.m26664o(8000);
    }

    /* renamed from: com_ss_android_socialbase_downloader_downloader_BaseDownloader_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m61672x3e770a3(File file) {
        MethodCollector.m26663i(8894);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8894);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8894);
        return delete;
    }

    public void clearDownloadData(int i, boolean z) {
        C30405d.m61749a().mo54058c(i, z);
    }

    public int getDownloadId(String str, String str2) {
        C30405d.m61749a();
        return C30399c.m61681a(str, str2);
    }

    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54055b(i, iDownloadListener, EnumC30294h.MAIN, false);
        }
    }

    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54055b(i, iDownloadListener, EnumC30294h.NOTIFICATION, false);
        }
    }

    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54055b(i, iDownloadListener, EnumC30294h.SUB, false);
        }
    }

    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54051a(i, iDownloadListener, EnumC30294h.MAIN, false);
        }
    }

    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54051a(i, iDownloadListener, EnumC30294h.NOTIFICATION, false);
        }
    }

    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54051a(i, iDownloadListener, EnumC30294h.SUB, false);
        }
    }

    public void setDownloadNotificationEventListener(int i, AbstractC30393y yVar) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c != null) {
            c.mo54155a(i, yVar);
        }
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54055b(i, iDownloadListener, EnumC30294h.MAIN, true);
        }
    }

    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54055b(i, iDownloadListener, EnumC30294h.NOTIFICATION, true);
        }
    }

    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C30405d.m61749a().mo54055b(i, iDownloadListener, EnumC30294h.SUB, true);
        }
    }

    public void setThrottleNetSpeed(int i, long j) {
        AbstractC30423o c = C30405d.m61749a().mo54057c(i);
        if (c != null) {
            c.mo54153a(i, j);
        }
    }

    private File getGlobalSaveDir(String str, boolean z) {
        File file = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file2 = new File(str);
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                    return file2;
                } else if (file2.isDirectory()) {
                    return file2;
                } else {
                    if (!z) {
                        return null;
                    }
                    m61672x3e770a3(file2);
                    file2.mkdirs();
                    return file2;
                }
            } catch (Throwable unused) {
                file = file2;
                return file;
            }
        } catch (Throwable unused2) {
            return file;
        }
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        C30405d a = C30405d.m61749a();
        int a2 = C30399c.m61681a(str, str2);
        AbstractC30423o c = a.mo54057c(a2);
        if (c == null) {
            return null;
        }
        return c.mo54189h(a2);
    }

    public void cancel(int i, boolean z) {
        C30405d a = C30405d.m61749a();
        if (!C30535g.m62557a()) {
            AbstractC30423o c = a.mo54057c(i);
            if (c != null) {
                c.mo54157a(i, z);
            }
            C30499l.m62246a(true).mo54147a(2, i);
        } else if (C30528a.m62524a(8388608)) {
            AbstractC30423o a2 = C30499l.m62246a(true);
            if (a2 != null) {
                a2.mo54157a(i, z);
            }
            AbstractC30423o a3 = C30499l.m62246a(false);
            if (a3 != null) {
                a3.mo54157a(i, z);
            }
        } else {
            AbstractC30423o a4 = C30499l.m62246a(false);
            if (a4 != null) {
                a4.mo54157a(i, z);
            }
            AbstractC30423o a5 = C30499l.m62246a(true);
            if (a5 != null) {
                a5.mo54157a(i, z);
            }
        }
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        if (iDownloadListener != null) {
            C30405d a = C30405d.m61749a();
            EnumC30294h hVar = EnumC30294h.MAIN;
            AbstractC30423o c = a.mo54057c(i);
            if (c != null) {
                c.mo54152a(i, iDownloadListener.hashCode(), iDownloadListener, hVar, true, z);
            }
        }
    }
}
