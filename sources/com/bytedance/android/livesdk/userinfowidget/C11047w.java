package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.livesdkapi.p689e.C11751a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.w */
final /* synthetic */ class C11047w implements AbstractC88433f {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26593a;

    static {
        Covode.recordClassIndex(12665);
    }

    C11047w(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26593a = liveRoomUserInfoWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f26593a.dataChannel.mo28315b(C11751a.class, Long.valueOf(((AbstractC2994b) obj).getFanTicketCount()));
    }
}
