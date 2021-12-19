package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.n */
public final /* synthetic */ class C70533n implements AbstractC1214u {

    /* renamed from: a */
    private final VideoEditView f157749a;

    static {
        Covode.recordClassIndex(82989);
    }

    C70533n(VideoEditView videoEditView) {
        this.f157749a = videoEditView;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f157749a.mo111102a((VideoSegment) obj);
    }
}
