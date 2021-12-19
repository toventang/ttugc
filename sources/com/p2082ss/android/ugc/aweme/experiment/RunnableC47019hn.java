package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;

/* renamed from: com.ss.android.ugc.aweme.experiment.hn */
public final /* synthetic */ class RunnableC47019hn implements Runnable {

    /* renamed from: a */
    private final Aweme f109546a;

    static {
        Covode.recordClassIndex(55620);
    }

    public RunnableC47019hn(Aweme aweme) {
        this.f109546a = aweme;
    }

    public final void run() {
        Video video;
        Aweme aweme = this.f109546a;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            C20761r.m39066c(C20761r.m39060a(C34735v.m70965a(video.getOriginCover())).mo34183b());
        }
    }
}
