package com.p2082ss.android.ugc.aweme.download.impl.component_impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.downloader.C30414h;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j;
import com.p2082ss.android.socialbase.downloader.p2188j.ThreadFactoryC30513a;
import com.p2082ss.android.socialbase.p2177a.C30279a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import com.p2082ss.android.ugc.aweme.download.component_api.p2809a.AbstractC43168a;
import com.p2082ss.android.ugc.aweme.download.component_api.p2809a.AbstractC43169b;
import com.p2082ss.android.ugc.aweme.download.component_api.p2811c.C43179c;
import com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.p2082ss.android.ugc.aweme.download.impl.component_impl.C43191c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl */
public class DownloadServiceImpl implements IDownloadService {

    /* renamed from: b */
    static IMonitorLogSendDepend f100662b;

    /* renamed from: c */
    private static IDownloadConfigDepend f100663c;

    /* renamed from: d */
    private static final int f100664d;

    /* renamed from: e */
    private static final int f100665e;

    /* renamed from: a */
    public Context f100666a;

    static {
        Covode.recordClassIndex(51368);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f100664d = availableProcessors;
        f100665e = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    /* renamed from: b */
    public static IDownloadService m86121b() {
        MethodCollector.m26663i(14264);
        Object a = C81908b.m141854a(IDownloadService.class, false);
        if (a != null) {
            IDownloadService iDownloadService = (IDownloadService) a;
            MethodCollector.m26664o(14264);
            return iDownloadService;
        }
        if (C81908b.f183226bc == null) {
            synchronized (IDownloadService.class) {
                try {
                    if (C81908b.f183226bc == null) {
                        C81908b.f183226bc = new DownloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14264);
                    throw th;
                }
            }
        }
        DownloadServiceImpl downloadServiceImpl = (DownloadServiceImpl) C81908b.f183226bc;
        MethodCollector.m26664o(14264);
        return downloadServiceImpl;
    }

    /* renamed from: a */
    public static JSONObject m86120a() {
        String str;
        JSONObject jSONObject;
        IDownloadConfigDepend iDownloadConfigDepend = f100663c;
        if (iDownloadConfigDepend != null) {
            str = iDownloadConfigDepend.getSettingString();
        } else {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("switch_not_auto_boot_service", 1);
            jSONObject.put("download_completed_event_tag", "draw_ad");
            jSONObject.put("landing_page_progressbar_visible", 1);
            jSONObject.put("is_enable_show_retry_download_dialog", 1);
            jSONObject.put("save_path_security", 1);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService
    /* renamed from: a */
    public final boolean mo73440a(int i) {
        return Downloader.getInstance(this.f100666a).isDownloading(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public void cancel(int i) {
        Downloader.getInstance(this.f100666a).cancel(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public DownloadInfo getDownloadInfo(int i) {
        return Downloader.getInstance(this.f100666a).getDownloadInfo(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public AbstractC43167a getDownloadTask(int i) {
        return C43197e.m86150a().f100689a.get(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public void restart(int i) {
        Downloader.getInstance(this.f100666a).restart(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService
    /* renamed from: a */
    public final void mo73439a(IDownloadSdkMonitorDepend iDownloadSdkMonitorDepend) {
        C89219l.m154721d(iDownloadSdkMonitorDepend, "");
        try {
            C30279a a = C30279a.m61267a();
            C43191c.C43192a aVar = new C43191c.C43192a(iDownloadSdkMonitorDepend);
            if (a.f72236a == null) {
                a.f72236a = aVar;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public AbstractC43167a with(String str) {
        if (this.f100666a == null) {
            this.f100666a = C17867d.m33078a();
        }
        return new C43193d(this.f100666a, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public AbstractC43168a getPageLifeMonitor(int i) {
        final AbstractC43167a downloadTask = getDownloadTask(i);
        if (downloadTask == null || !downloadTask.f100617T) {
            return new AbstractC43168a() {
                /* class com.p2082ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.C431832 */

                static {
                    Covode.recordClassIndex(51370);
                }
            };
        }
        if (downloadTask.f100620W != null) {
            return downloadTask.f100620W;
        }
        downloadTask.f100620W = new AbstractC43168a() {
            /* class com.p2082ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.C431821 */

            static {
                Covode.recordClassIndex(51369);
            }

            @Override // com.p2082ss.android.ugc.aweme.download.component_api.p2809a.AbstractC43168a, com.bytedance.ies.uikit.p1279a.AbstractC18241e
            /* renamed from: a */
            public final void mo29100a() {
                C43179c.m86112a(DownloadServiceImpl.this.f100666a, downloadTask);
            }
        };
        return downloadTask.f100620W;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public AbstractC43169b getViewLifeMonitor(int i) {
        final AbstractC43167a downloadTask = getDownloadTask(i);
        if (downloadTask == null || !downloadTask.f100618U) {
            return new AbstractC43169b() {
                /* class com.p2082ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.C431854 */

                static {
                    Covode.recordClassIndex(51372);
                }
            };
        }
        if (downloadTask.f100619V != null) {
            return downloadTask.f100619V;
        }
        downloadTask.f100619V = new AbstractC43169b() {
            /* class com.p2082ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.C431843 */

            static {
                Covode.recordClassIndex(51371);
            }
        };
        return downloadTask.f100619V;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public int getDownloadId(String str, String str2) {
        return Downloader.getInstance(this.f100666a).getDownloadId(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public DownloadInfo getDownloadInfo(String str, String str2) {
        return Downloader.getInstance(this.f100666a).getDownloadInfo(str, str2);
    }

    /* renamed from: a */
    private static ExecutorService m86119a(int i, String str, ExecutorService executorService) {
        ThreadPoolExecutor threadPoolExecutor = executorService;
        MethodCollector.m26663i(13505);
        if (i > 0) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC30513a("DownloadThreadPool-" + str + "-fixed", true));
            try {
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                threadPoolExecutor = threadPoolExecutor2;
            } catch (Exception e) {
                e.printStackTrace();
                threadPoolExecutor = threadPoolExecutor2;
            }
        }
        MethodCollector.m26664o(13505);
        return threadPoolExecutor;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService
    /* renamed from: a */
    public final void mo73438a(Context context, IMonitorLogSendDepend iMonitorLogSendDepend, IDownloadConfigDepend iDownloadConfigDepend) {
        AbstractC30463j jVar;
        boolean z;
        this.f100666a = context;
        f100662b = iMonitorLogSendDepend;
        f100663c = iDownloadConfigDepend;
        boolean z2 = false;
        int optInt = m86120a().optInt("download_exp_switch_temp", 0);
        C30414h hVar = new C30414h(context);
        hVar.f72532n = new C43186a(this);
        IDownloadConfigDepend iDownloadConfigDepend2 = f100663c;
        if (iDownloadConfigDepend2 != null) {
            jVar = iDownloadConfigDepend2.getTTNetDownloadHttpService();
        } else {
            jVar = null;
        }
        hVar.f72524f = jVar;
        hVar.f72518B = optInt;
        IDownloadConfigDepend iDownloadConfigDepend3 = f100663c;
        if (iDownloadConfigDepend3 != null) {
            z = iDownloadConfigDepend3.needAutoRefreshUnSuccessTask();
        } else {
            z = false;
        }
        hVar.f72517A = z;
        hVar.f72530l = C43189b.f100677a;
        if (m86120a().optInt("enable_thread_opt") == 1) {
            JSONObject a = m86120a();
            int optInt2 = a.optInt("cpu_thread_count", -1);
            int optInt3 = a.optInt("io_thread_count", -1);
            int optInt4 = a.optInt("mix_default_thread_count", -1);
            int optInt5 = a.optInt("mix_frequent_thread_count", -1);
            int optInt6 = a.optInt("mix_apk_thread_count", 4);
            int optInt7 = a.optInt("db_thread_count", -1);
            int optInt8 = a.optInt("chunk_thread_count", -1);
            if (a.optInt("use_default_okhttp_executor", 0) == 1) {
                z2 = true;
            }
            hVar.f72533o = m86119a(optInt2, "cpu", C40780g.m82245b());
            hVar.f72534p = m86119a(optInt3, "io", C40780g.m82241a());
            hVar.f72535q = m86119a(optInt4, "mix-default", C40780g.m82241a());
            hVar.f72536r = m86119a(optInt5, "mix-frequent", C40780g.m82241a());
            hVar.f72537s = m86119a(optInt6, "mix-apk", C40780g.m82241a());
            hVar.f72538t = m86119a(optInt7, "db", C40780g.m82241a());
            hVar.f72539u = m86119a(optInt8, "chunk", C40780g.m82241a());
            if (!z2) {
                hVar.f72540v = C40780g.m82241a();
            }
        }
        Downloader.init(hVar);
    }
}
