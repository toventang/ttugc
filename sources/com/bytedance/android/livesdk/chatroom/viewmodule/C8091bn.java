package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bn */
final /* synthetic */ class C8091bn implements AbstractC89172b {

    /* renamed from: a */
    private final FullVideoButtonWidget f20105a;

    static {
        Covode.recordClassIndex(8898);
    }

    C8091bn(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f20105a = fullVideoButtonWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = this.f20105a;
        if (((Boolean) obj).booleanValue()) {
            fullVideoButtonWidget.hide();
        } else {
            fullVideoButtonWidget.show();
        }
        return C89391z.f203057a;
    }
}
