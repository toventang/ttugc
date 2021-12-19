package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.n */
final /* synthetic */ class C8186n implements AbstractC89172b {

    /* renamed from: a */
    private final LockScreenWidget f20311a;

    static {
        Covode.recordClassIndex(9009);
    }

    C8186n(LockScreenWidget lockScreenWidget) {
        this.f20311a = lockScreenWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LockScreenWidget lockScreenWidget = this.f20311a;
        if (((Boolean) obj).booleanValue()) {
            lockScreenWidget.getView().setVisibility(4);
        } else {
            lockScreenWidget.show();
        }
        return C89391z.f203057a;
    }
}
