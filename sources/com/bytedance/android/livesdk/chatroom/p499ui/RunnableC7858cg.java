package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cg */
final /* synthetic */ class RunnableC7858cg implements Runnable {

    /* renamed from: a */
    private final Room f19578a;

    static {
        Covode.recordClassIndex(8653);
    }

    RunnableC7858cg(Room room) {
        this.f19578a = room;
    }

    public final void run() {
        Room room = this.f19578a;
        ((IGiftService) C6193a.m13435a(IGiftService.class)).getFirstRechargeManager().mo15002a(room.getId(), room.getOwnerUserId());
        ((IGiftService) C6193a.m13435a(IGiftService.class)).clearFastGift(room.getId());
    }
}
