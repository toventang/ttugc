package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.h */
final /* synthetic */ class C70567h implements AbstractC1214u {

    /* renamed from: a */
    private final VEVideoEditViewV2 f157837a;

    static {
        Covode.recordClassIndex(83030);
    }

    C70567h(VEVideoEditViewV2 vEVideoEditViewV2) {
        this.f157837a = vEVideoEditViewV2;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f157837a.mo111294a((VideoSegment) obj);
    }
}
