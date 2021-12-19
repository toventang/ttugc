package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.toolbar.b */
final /* synthetic */ class C10903b implements AbstractC89172b {

    /* renamed from: a */
    private final LiveAudienceToolbarWidget f26202a;

    static {
        Covode.recordClassIndex(12511);
    }

    C10903b(LiveAudienceToolbarWidget liveAudienceToolbarWidget) {
        this.f26202a = liveAudienceToolbarWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveAudienceToolbarWidget liveAudienceToolbarWidget = this.f26202a;
        if (((Boolean) obj).booleanValue()) {
            liveAudienceToolbarWidget.contentView.setVisibility(4);
        } else {
            liveAudienceToolbarWidget.contentView.setVisibility(0);
        }
        return C89391z.f203057a;
    }
}
