package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7386e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bj */
final /* synthetic */ class C8087bj implements AbstractC89172b {

    /* renamed from: a */
    private final DecorationWrapperWidget f20101a;

    static {
        Covode.recordClassIndex(8894);
    }

    C8087bj(DecorationWrapperWidget decorationWrapperWidget) {
        this.f20101a = decorationWrapperWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f20101a;
        Boolean bool = (Boolean) obj;
        if (decorationWrapperWidget.f19880k != null) {
            decorationWrapperWidget.f19880k.mo14284b(bool.booleanValue());
        }
        decorationWrapperWidget.f19881m = bool.booleanValue();
        if (!bool.booleanValue()) {
            return null;
        }
        C6779a.m14563a().mo13053a(new C7386e());
        return null;
    }
}
