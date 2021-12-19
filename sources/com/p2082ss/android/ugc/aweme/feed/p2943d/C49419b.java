package com.p2082ss.android.ugc.aweme.feed.p2943d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;

/* renamed from: com.ss.android.ugc.aweme.feed.d.b */
public final class C49419b {
    static {
        Covode.recordClassIndex(58232);
    }

    /* renamed from: a */
    public static void m92487a(Aweme aweme) {
        C80937s.m140453b().mo124080d();
        C80662ac.m139882a(aweme, 0);
        if (aweme != null && aweme.getVideo() != null) {
            aweme.getVideo().setSourceId(aweme.getAid());
            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
            if (properPlayAddr != null) {
                properPlayAddr.setSourceId(aweme.getAid());
            }
        }
    }
}
