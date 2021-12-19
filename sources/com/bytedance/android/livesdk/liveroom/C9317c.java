package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.liveroom.c */
public final /* synthetic */ class C9317c implements AbstractC88433f {

    /* renamed from: a */
    private final RoomStatusController f22753a;

    static {
        Covode.recordClassIndex(10251);
    }

    C9317c(RoomStatusController roomStatusController) {
        this.f22753a = roomStatusController;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f22753a.lambda$refreshRoomStats$1$RoomStatusController((Room) obj);
    }
}
