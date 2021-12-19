package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56659a;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ai */
final /* synthetic */ class C70809ai implements AbstractC56659a {

    /* renamed from: a */
    private final VideoPublishEditModel f158559a;

    static {
        Covode.recordClassIndex(83294);
    }

    C70809ai(VideoPublishEditModel videoPublishEditModel) {
        this.f158559a = videoPublishEditModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56659a
    /* renamed from: a */
    public final void mo93541a(AVChallenge aVChallenge) {
        VideoPublishEditModel videoPublishEditModel = this.f158559a;
        if (aVChallenge != null) {
            if (videoPublishEditModel.challenges == null) {
                videoPublishEditModel.challenges = new ArrayList();
            }
            videoPublishEditModel.challenges.add(aVChallenge);
        }
    }
}
