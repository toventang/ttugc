package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;

/* renamed from: com.ss.android.ugc.aweme.services.video.IVideoCoverService */
public interface IVideoCoverService {
    static {
        Covode.recordClassIndex(80015);
    }

    void getVideoCoverByCallback(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback);
}
