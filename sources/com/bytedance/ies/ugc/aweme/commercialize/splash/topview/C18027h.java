package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1261e.C17960a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C18002l;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.EnumC43176c;
import com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h */
public class C18027h {

    /* renamed from: a */
    public static C18021e f42906a;

    /* renamed from: b */
    private static volatile C18027h f42907b;

    static {
        Covode.recordClassIndex(20653);
    }

    private C18027h() {
    }

    /* renamed from: d */
    public static boolean m33596d() {
        C18021e eVar = f42906a;
        if (eVar != null) {
            return eVar.mo28758e();
        }
        return false;
    }

    /* renamed from: b */
    public static void m33594b() {
        if (f42906a != null && !m33596d()) {
            f42906a.mo28755b();
        }
    }

    /* renamed from: a */
    public static C18027h m33593a() {
        MethodCollector.m26663i(251);
        if (f42907b == null) {
            synchronized (C18027h.class) {
                try {
                    if (f42907b == null) {
                        C17975i.f42810j = SettingsManager.m29616a().mo25400a("topview_storage_optimize_enable", false);
                        f42906a = new C18021e();
                        f42907b = new C18027h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(251);
                    throw th;
                }
            }
        }
        C18027h hVar = f42907b;
        MethodCollector.m26664o(251);
        return hVar;
    }

    /* renamed from: c */
    public static String m33595c() {
        if (C17957a.m33426a().mo28648r()) {
            return "1";
        }
        if (C17957a.m33426a().mo28649s()) {
            return "2";
        }
        if (!C17975i.f42806f) {
            return "3";
        }
        if (!C17975i.f42802b && !C17957a.m33426a().mo28647q()) {
            return "3";
        }
        if (C17975i.f42807g) {
            return "4";
        }
        if (!C17975i.f42803c) {
            return "5";
        }
        return AbstractC37639a.AbstractC37641b.f89004a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo28761a(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            C18129a.m33746a("draw_ad", "download_video_count", aweme.getAwemeRawAd()).mo28901b();
            if ((!z || C16048b.m29633a().mo25412a(true, "awesome_splash_preload_optimize", 0) == 0) && mo28762a(aweme)) {
                z = true;
            }
            C17957a.m33426a().mo28619a(aweme);
        }
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            f.mo59376a().mo59412a(list);
        }
        C18021e eVar = f42906a;
        if (eVar == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme2 = (Aweme) it2.next();
            if (aweme2 != null) {
                AwemeStatus status = aweme2.getStatus();
                C17957a.m33426a();
                status.setPrivateStatus(0);
                status.setAllowComment(true);
                status.setAllowShare(true);
            }
            AwemeSplashInfo m = C37699a.m76308m(aweme2);
            if (m != null) {
                m.anchorId = aweme2.getAuthorUid();
            }
            String I = C37699a.m76206I(aweme2);
            if (!TextUtils.isEmpty(I)) {
                eVar.mo28754a().put(I, aweme2);
            }
        }
        eVar.mo28757d();
        return null;
    }

    /* renamed from: a */
    public final boolean mo28762a(final Aweme aweme) {
        VideoUrlModel playAddr;
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("start preload TopView Aweme =" + aweme.getAid());
        if (C37699a.m76205H(aweme)) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("past data, cancel download");
            C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "past_data").mo28901b();
            return false;
        }
        AwemeSplashInfo m = C37699a.m76308m(aweme);
        if (m == null) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("awemeSplashInfo is null，cancel download");
            C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "splash_info_null").mo28901b();
            return false;
        }
        int preloadType = m.getPreloadType();
        if (!C34719f.C34720a.f82009a.mo61395c()) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("no network, cancel download");
            C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "no_network").mo28901b();
            return false;
        } else if (C34719f.C34720a.f82009a.mo61394b() || preloadType != 1) {
            aweme.getAid();
            C180281 r5 = new IDownloadListener() {
                /* class com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18027h.C180281 */

                static {
                    Covode.recordClassIndex(20654);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first succeed");
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPause(DownloadInfo downloadInfo) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download pause");
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    C18129a.m33746a("draw_ad", "download_video_cancel", aweme.getAwemeRawAd()).mo28901b();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download cancel");
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstStart(DownloadInfo downloadInfo) {
                    C18129a.m33746a("draw_ad", "download_video_start_first_sdk", aweme.getAwemeRawAd()).mo28901b();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first start");
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPrepare(DownloadInfo downloadInfo) {
                    C18129a.m33746a("draw_ad", "download_video_prepare", aweme.getAwemeRawAd()).mo28901b();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download prepare");
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    C18129a.m33746a("draw_ad", "download_video_start_sdk", aweme.getAwemeRawAd()).mo28901b();
                    downloadInfo.getUrl();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download start");
                }

                /* renamed from: a */
                public static boolean m33599a(File file) {
                    MethodCollector.m26663i(5972);
                    try {
                        C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                        if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                        }
                        if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                            MethodCollector.m26664o(5972);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.m26664o(5972);
                    return delete;
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    downloadInfo.getUrl();
                    if (C18002l.f42862a == 0) {
                        C18129a.m33746a("draw_ad", "download_video_succeed", aweme.getAwemeRawAd()).mo28897a("video_url", downloadInfo.getUrl()).mo28901b();
                        C17960a.m33432a(true, aweme, null, -1, downloadInfo.getUrl());
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
                        return;
                    }
                    C1731i.m5640b(new CallableC18030j(aweme, downloadInfo), C1731i.f5562a);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry delay");
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    downloadInfo.getUrl();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry");
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    int errorCode;
                    String errorMessage;
                    downloadInfo.getUrl();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download failed");
                    if (baseException == null) {
                        errorCode = 0;
                        errorMessage = "";
                    } else {
                        errorCode = baseException.getErrorCode();
                        errorMessage = baseException.getErrorMessage();
                    }
                    C18129a.m33746a("draw_ad", "download_video_failed", aweme.getAwemeRawAd()).mo28897a("failed_code", Integer.valueOf(errorCode)).mo28897a("failed_msg", errorMessage).mo28897a("video_url", downloadInfo.getUrl()).mo28901b();
                    if (errorCode == 1034) {
                        File file = new File(C17975i.m33463b() + aweme.getAid());
                        if (file.exists()) {
                            m33599a(file);
                        }
                    }
                    C17960a.m33432a(false, aweme, errorMessage, Integer.valueOf(errorCode), downloadInfo.getUrl());
                }
            };
            Video video = aweme.getVideo();
            if (video == null) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_null");
                C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "video_null").mo28901b();
                return false;
            }
            if (SettingsManager.m29616a().mo25400a("awesome_splash_force_use_h264", false)) {
                playAddr = video.getPlayAddrH264();
            } else {
                playAddr = video.getPlayAddr();
            }
            if (playAddr == null) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_model_null");
                C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "video_url_model_null").mo28901b();
                return false;
            }
            playAddr.setSourceId(aweme.getAid());
            String str = C17975i.m33466c() + playAddr.getSourceId();
            if (new File(C17975i.m33463b() + playAddr.getSourceId()).exists() || (C17975i.f42810j && new File(str).exists())) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video has download, do not download again");
                C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "video_exists").mo28901b();
                return false;
            }
            List<String> urlList = playAddr.getUrlList();
            if (C13603b.m24435a((Collection) urlList)) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_list_null");
                C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "video_url_list_null").mo28901b();
                return false;
            }
            String str2 = urlList.get(0);
            if (TextUtils.isEmpty(str2)) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_first_null");
                C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "video_url_first_null").mo28901b();
                return false;
            }
            ArrayList arrayList = new ArrayList(urlList);
            arrayList.remove(str2);
            int a = C30399c.m61681a(str2, C17975i.m33463b());
            IDownloadService p = C17957a.m33426a().mo28646p();
            if (p == null) {
                C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "download_service_null").mo28901b();
                return false;
            } else if (p.mo73440a(a)) {
                C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "is_downloading").mo28901b();
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video is downloading, not start download");
                return false;
            } else {
                DownloadInfo downloadInfo = p.getDownloadInfo(a);
                int i = 100;
                if (downloadInfo != null) {
                    i = downloadInfo.getStatus();
                }
                C18129a.m33746a("draw_ad", "download_video_start", aweme.getAwemeRawAd()).mo28897a("download_status", Integer.valueOf(i)).mo28901b();
                String fileHash = playAddr.getFileHash();
                AbstractC43167a with = p.with(str2);
                with.f100637n = arrayList;
                with.f100629f = C17975i.m33463b();
                with.f100642s = fileHash;
                with.f100626c = aweme.getAid();
                with.f100600C = r5;
                with.mo73400a("ad_splash_video_preload").mo73404b().mo73397a(EnumC43176c.VIDEO);
                return true;
            }
        } else {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("not wifi, cancel download");
            C18129a.m33746a("draw_ad", "download_video_no_download", aweme.getAwemeRawAd()).mo28897a("reason", "wifi_only").mo28901b();
            return false;
        }
    }
}
