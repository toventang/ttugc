package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.l */
final /* synthetic */ class C69993l implements AbstractC88434g {

    /* renamed from: a */
    private final VideoPublishEditModel f156445a;

    static {
        Covode.recordClassIndex(82407);
    }

    C69993l(VideoPublishEditModel videoPublishEditModel) {
        this.f156445a = videoPublishEditModel;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        return this.f156445a.getCoverPublishModel().getEffectTextModel().mergeCoverText((Bitmap) obj);
    }
}
