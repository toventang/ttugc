package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84261c;

/* renamed from: com.ss.android.ugc.aweme.video.u */
public final /* synthetic */ class C81074u implements AbstractC84261c {

    /* renamed from: a */
    public static final AbstractC84261c f181199a = new C81074u();

    static {
        Covode.recordClassIndex(94395);
    }

    private C81074u() {
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84261c
    /* renamed from: a */
    public final boolean mo124536a(VideoUrlModel videoUrlModel) {
        return C80937s.m140453b().mo124069a(C80942a.m140478a(videoUrlModel));
    }
}
