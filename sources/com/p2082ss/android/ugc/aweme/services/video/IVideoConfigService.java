package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.video.IVideoConfigService */
public interface IVideoConfigService {
    static {
        Covode.recordClassIndex(80014);
    }

    int getVideoHeight();

    int getVideoWidth();

    void invalidate();
}
