package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7378ak;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bf */
final /* synthetic */ class C8083bf implements AbstractC89172b {

    /* renamed from: a */
    private final DecorationWrapperWidget f20097a;

    static {
        Covode.recordClassIndex(8890);
    }

    C8083bf(DecorationWrapperWidget decorationWrapperWidget) {
        this.f20097a = decorationWrapperWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f20097a;
        C7378ak akVar = (C7378ak) obj;
        if (decorationWrapperWidget.isViewValid() && decorationWrapperWidget.context != null) {
            decorationWrapperWidget.getView().post(new RunnableC8073aw(decorationWrapperWidget, akVar));
        }
        return C89391z.f203057a;
    }
}
