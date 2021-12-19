package com.p2082ss.android.ugc.aweme.main.replace;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IReplaceMusicDownloadService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService */
public final class ReplaceMusicDownloadService implements IReplaceMusicDownloadService {
    static {
        Covode.recordClassIndex(69468);
    }

    /* renamed from: a */
    public static IReplaceMusicDownloadService m108603a() {
        MethodCollector.m26663i(9090);
        Object a = C81908b.m141854a(IReplaceMusicDownloadService.class, false);
        if (a != null) {
            IReplaceMusicDownloadService iReplaceMusicDownloadService = (IReplaceMusicDownloadService) a;
            MethodCollector.m26664o(9090);
            return iReplaceMusicDownloadService;
        }
        if (C81908b.f183299cw == null) {
            synchronized (IReplaceMusicDownloadService.class) {
                try {
                    if (C81908b.f183299cw == null) {
                        C81908b.f183299cw = new ReplaceMusicDownloadService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9090);
                    throw th;
                }
            }
        }
        ReplaceMusicDownloadService replaceMusicDownloadService = (ReplaceMusicDownloadService) C81908b.f183299cw;
        MethodCollector.m26664o(9090);
        return replaceMusicDownloadService;
    }

    @Override // com.p2082ss.android.ugc.aweme.IReplaceMusicDownloadService
    /* renamed from: a */
    public final void mo57249a(String str, Activity activity, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str2, "");
        SmartRouter.buildRoute(activity, "//replace_music/download").withParam("aweme_id", str).open();
    }
}
