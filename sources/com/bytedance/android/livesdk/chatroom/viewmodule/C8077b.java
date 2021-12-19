package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.b */
final /* synthetic */ class C8077b implements AbstractC89172b {

    /* renamed from: a */
    private final BottomRightBannerWidget f20090a;

    static {
        Covode.recordClassIndex(8884);
    }

    C8077b(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20090a = bottomRightBannerWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20090a;
        bottomRightBannerWidget.f19810h = ((Boolean) obj).booleanValue();
        bottomRightBannerWidget.mo14261c();
        return C89391z.f203057a;
    }
}
