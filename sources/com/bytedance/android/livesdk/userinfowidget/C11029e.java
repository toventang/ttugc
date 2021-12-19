package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.e */
final /* synthetic */ class C11029e implements AbstractC89172b {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26572a;

    static {
        Covode.recordClassIndex(12647);
    }

    C11029e(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26572a = liveRoomUserInfoWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        this.f26572a.f26537r = (User) obj;
        return C89391z.f203057a;
    }
}
