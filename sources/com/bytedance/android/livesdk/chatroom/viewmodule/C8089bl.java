package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7380am;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bl */
final /* synthetic */ class C8089bl implements AbstractC89172b {

    /* renamed from: a */
    private final FullVideoButtonWidget f20103a;

    static {
        Covode.recordClassIndex(8896);
    }

    C8089bl(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f20103a = fullVideoButtonWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        boolean z;
        FullVideoButtonWidget fullVideoButtonWidget = this.f20103a;
        fullVideoButtonWidget.f19913b = ((C7380am) obj).mo13610a();
        if (fullVideoButtonWidget.f19914c || !fullVideoButtonWidget.f19913b) {
            z = false;
        } else {
            z = true;
        }
        fullVideoButtonWidget.mo14289a(Boolean.valueOf(z));
        return C89391z.f203057a;
    }
}
