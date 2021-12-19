package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.s */
final /* synthetic */ class C11043s implements AbstractC88433f {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26589a;

    static {
        Covode.recordClassIndex(12661);
    }

    C11043s(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26589a = liveRoomUserInfoWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f26589a.mo17858a((C11688a) obj, true);
    }
}
