package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.o */
final /* synthetic */ class C8112o implements AbstractC88433f {

    /* renamed from: a */
    private final BottomRightBannerWidget f20124a;

    static {
        Covode.recordClassIndex(8919);
    }

    C8112o(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20124a = bottomRightBannerWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f20124a.mo13713a(((InRoomBannerManager.C2944a) obj).f8691b);
    }
}
