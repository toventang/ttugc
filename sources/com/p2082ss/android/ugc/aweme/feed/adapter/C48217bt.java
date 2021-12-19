package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bt */
public final /* synthetic */ class C48217bt implements AbstractC89172b {

    /* renamed from: a */
    private final VideoViewCell f111700a;

    static {
        Covode.recordClassIndex(56959);
    }

    C48217bt(VideoViewCell videoViewCell) {
        this.f111700a = videoViewCell;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        VideoViewCell videoViewCell = this.f111700a;
        Aweme aweme = (Aweme) obj;
        if (videoViewCell.f111308j == null || videoViewCell.f111308j.getAid() != aweme.getAid() || videoViewCell.f111308j.getInteractionTagInfo() == null) {
            return null;
        }
        videoViewCell.f111308j.getInteractionTagInfo().setVideoLabelText("");
        C34727m.m70944a(new RunnableC48219bv(videoViewCell));
        return null;
    }
}
