package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.c */
final /* synthetic */ class C68947c implements IAVTransformService.ITransformProgress {

    /* renamed from: a */
    private final ProgressDialogC74145d f154251a;

    static {
        Covode.recordClassIndex(81259);
    }

    C68947c(ProgressDialogC74145d dVar) {
        this.f154251a = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress
    public final void update(int i) {
        this.f154251a.setProgress(i);
    }
}
