package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1261e.C17960a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C18002l;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18027h;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29641d;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.j */
final /* synthetic */ class CallableC18030j implements Callable {

    /* renamed from: a */
    private final Aweme f42913a;

    /* renamed from: b */
    private final DownloadInfo f42914b;

    static {
        Covode.recordClassIndex(20656);
    }

    CallableC18030j(Aweme aweme, DownloadInfo downloadInfo) {
        this.f42913a = aweme;
        this.f42914b = downloadInfo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Aweme aweme = this.f42913a;
        DownloadInfo downloadInfo = this.f42914b;
        String str = C17975i.m33463b() + aweme.getAid();
        File file = new File(str);
        if (C29641d.m59677a(str) < ((long) C18002l.f42862a)) {
            if (file.exists()) {
                C18027h.C180281.m33599a(file);
            }
            C18129a.m33746a("draw_ad", "download_video_failed", aweme.getAwemeRawAd()).mo28897a("failed_code", -2).mo28897a("failed_msg", "Less than minsize").mo28897a("video_url", downloadInfo.getUrl()).mo28901b();
            C17960a.m33432a(false, aweme, "Less than minsize", -2, downloadInfo.getUrl());
        } else {
            C18129a.m33746a("draw_ad", "download_video_succeed", aweme.getAwemeRawAd()).mo28897a("video_url", downloadInfo.getUrl()).mo28901b();
            C17960a.m33432a(true, aweme, null, -1, downloadInfo.getUrl());
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
        }
        return null;
    }
}
