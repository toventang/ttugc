package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.s */
final /* synthetic */ class C8193s implements AbstractC89172b {

    /* renamed from: a */
    private final MessageBlockWidget f20318a;

    static {
        Covode.recordClassIndex(9016);
    }

    C8193s(MessageBlockWidget messageBlockWidget) {
        this.f20318a = messageBlockWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        MessageBlockWidget messageBlockWidget = this.f20318a;
        if (((Boolean) obj).booleanValue()) {
            messageBlockWidget.getView().setVisibility(4);
        } else {
            messageBlockWidget.show();
        }
        return C89391z.f203057a;
    }
}
