package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.toolbar.f */
final /* synthetic */ class C10917f implements AbstractC89172b {

    /* renamed from: a */
    private final LiveToolbarWidget f26230a;

    static {
        Covode.recordClassIndex(12525);
    }

    C10917f(LiveToolbarWidget liveToolbarWidget) {
        this.f26230a = liveToolbarWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveToolbarWidget liveToolbarWidget = this.f26230a;
        if (((Boolean) obj).booleanValue()) {
            liveToolbarWidget.getView().setVisibility(4);
        } else {
            liveToolbarWidget.show();
        }
        return C89391z.f203057a;
    }
}
