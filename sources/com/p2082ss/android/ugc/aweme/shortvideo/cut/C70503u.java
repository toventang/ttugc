package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEUtils;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.u */
public final class C70503u {

    /* renamed from: a */
    public static final C70503u f157560a = new C70503u();

    private C70503u() {
    }

    static {
        Covode.recordClassIndex(82952);
    }

    /* renamed from: a */
    public static final VEUtils.VEVideoFileInfo m124367a(String str) {
        C89219l.m154721d(str, "");
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (!(videoFileInfo == null || videoFileInfo.rotation % LiveFeedRefreshTimeSetting.DEFAULT == 0)) {
            int i = videoFileInfo.height;
            videoFileInfo.height = videoFileInfo.width;
            videoFileInfo.width = i;
        }
        return videoFileInfo;
    }
}
