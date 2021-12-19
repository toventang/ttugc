package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78598b;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceImpl$$Lambda$1 */
final /* synthetic */ class MainServiceImpl$$Lambda$1 implements AbstractC78598b {
    private final IMainService.DownLoadFinishListener arg$1;

    static {
        Covode.recordClassIndex(79689);
    }

    MainServiceImpl$$Lambda$1(IMainService.DownLoadFinishListener downLoadFinishListener) {
        this.arg$1 = downLoadFinishListener;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78598b
    public final void onFinish(int i) {
        MainServiceImpl.lambda$downloadStickerHelper$1$MainServiceImpl(this.arg$1, i);
    }
}
