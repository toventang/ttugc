package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.toolbar.g */
final /* synthetic */ class C10918g implements AbstractC89172b {

    /* renamed from: a */
    private final LiveToolbarWidget f26231a;

    static {
        Covode.recordClassIndex(12526);
    }

    C10918g(LiveToolbarWidget liveToolbarWidget) {
        this.f26231a = liveToolbarWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveToolbarWidget liveToolbarWidget = this.f26231a;
        if (((Boolean) obj).booleanValue()) {
            liveToolbarWidget.hide();
        } else {
            liveToolbarWidget.show();
        }
        return C89391z.f203057a;
    }
}
