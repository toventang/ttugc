package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.m */
final /* synthetic */ class C8110m implements AbstractC89172b {

    /* renamed from: a */
    private final BottomRightBannerWidget f20122a;

    static {
        Covode.recordClassIndex(8917);
    }

    C8110m(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20122a = bottomRightBannerWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20122a;
        bottomRightBannerWidget.f19810h = ((Boolean) obj).booleanValue();
        bottomRightBannerWidget.mo14261c();
        return C89391z.f203057a;
    }
}
