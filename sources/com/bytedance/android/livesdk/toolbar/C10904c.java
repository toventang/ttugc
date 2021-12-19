package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.toolbar.c */
final /* synthetic */ class C10904c implements AbstractC89172b {

    /* renamed from: a */
    private final LiveAudienceToolbarWidget f26203a;

    static {
        Covode.recordClassIndex(12512);
    }

    C10904c(LiveAudienceToolbarWidget liveAudienceToolbarWidget) {
        this.f26203a = liveAudienceToolbarWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveAudienceToolbarWidget liveAudienceToolbarWidget = this.f26203a;
        Boolean bool = (Boolean) obj;
        if (liveAudienceToolbarWidget.contentView != null) {
            liveAudienceToolbarWidget.contentView.setVisibility(bool.booleanValue() ? 8 : 0);
        }
        return C89391z.f203057a;
    }
}
