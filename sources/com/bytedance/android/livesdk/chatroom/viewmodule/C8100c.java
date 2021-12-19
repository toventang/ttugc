package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.c */
final /* synthetic */ class C8100c implements AbstractC89172b {

    /* renamed from: a */
    private final BottomRightBannerWidget f20110a;

    static {
        Covode.recordClassIndex(8907);
    }

    C8100c(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20110a = bottomRightBannerWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20110a;
        C4419h hVar = (C4419h) bottomRightBannerWidget.dataChannel.mo28318b(C4437h.class);
        if (hVar == null || !hVar.f12018a) {
            return null;
        }
        bottomRightBannerWidget.hide();
        return null;
    }
}
