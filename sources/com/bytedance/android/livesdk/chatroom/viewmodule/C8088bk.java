package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bk */
final /* synthetic */ class C8088bk implements AbstractC89172b {

    /* renamed from: a */
    private final FullVideoButtonWidget f20102a;

    static {
        Covode.recordClassIndex(8895);
    }

    C8088bk(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f20102a = fullVideoButtonWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = this.f20102a;
        fullVideoButtonWidget.f19914c = ((Boolean) obj).booleanValue();
        fullVideoButtonWidget.mo14289a(Boolean.valueOf(!fullVideoButtonWidget.f19914c && fullVideoButtonWidget.f19913b));
        return C89391z.f203057a;
    }
}
