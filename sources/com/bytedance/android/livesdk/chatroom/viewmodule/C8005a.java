package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a */
final /* synthetic */ class C8005a implements AbstractC89172b {

    /* renamed from: a */
    private final BottomRightBannerWidget f19948a;

    static {
        Covode.recordClassIndex(8812);
    }

    C8005a(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f19948a = bottomRightBannerWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f19948a;
        bottomRightBannerWidget.f19809g = ((Boolean) obj).booleanValue();
        bottomRightBannerWidget.mo14261c();
        return C89391z.f203057a;
    }
}
