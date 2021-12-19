package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.c */
public final /* synthetic */ class CallableC78568c implements Callable {

    /* renamed from: a */
    private final Object f176561a;

    static {
        Covode.recordClassIndex(91702);
    }

    public CallableC78568c(Object obj) {
        this.f176561a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String extractFramesDir = ((VideoPublishEditModel) this.f176561a).extractFramesModel.getExtractFramesDir();
        C80720e.m139938e(extractFramesDir);
        C80720e.m139931c(extractFramesDir);
        return null;
    }
}
