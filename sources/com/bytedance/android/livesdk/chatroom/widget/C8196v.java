package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.v */
final /* synthetic */ class C8196v implements AbstractC89172b {

    /* renamed from: a */
    private final OrientationChangeWidget f20321a;

    static {
        Covode.recordClassIndex(9019);
    }

    C8196v(OrientationChangeWidget orientationChangeWidget) {
        this.f20321a = orientationChangeWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        OrientationChangeWidget orientationChangeWidget = this.f20321a;
        if (((Boolean) obj).booleanValue()) {
            orientationChangeWidget.getView().setVisibility(4);
        } else {
            orientationChangeWidget.show();
        }
        return C89391z.f203057a;
    }
}
