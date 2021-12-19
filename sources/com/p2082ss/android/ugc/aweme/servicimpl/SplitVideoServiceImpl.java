package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.services.cutvideo.ISplitVideoService;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl */
public final class SplitVideoServiceImpl implements ISplitVideoService {
    static {
        Covode.recordClassIndex(80050);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean showPlayList() {
        if (C16048b.m29633a().mo25412a(true, "tiktok_playlist_status", 0) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean playListAutoTake() {
        if (C16048b.m29633a().mo25412a(true, "tiktok_playlist_status", 0) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static ISplitVideoService m120147a() {
        MethodCollector.m26663i(6232);
        Object a = C81908b.m141854a(ISplitVideoService.class, false);
        if (a != null) {
            ISplitVideoService iSplitVideoService = (ISplitVideoService) a;
            MethodCollector.m26664o(6232);
            return iSplitVideoService;
        }
        if (C81908b.f183310dG == null) {
            synchronized (ISplitVideoService.class) {
                try {
                    if (C81908b.f183310dG == null) {
                        C81908b.f183310dG = new SplitVideoServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6232);
                    throw th;
                }
            }
        }
        SplitVideoServiceImpl splitVideoServiceImpl = (SplitVideoServiceImpl) C81908b.f183310dG;
        MethodCollector.m26664o(6232);
        return splitVideoServiceImpl;
    }
}
