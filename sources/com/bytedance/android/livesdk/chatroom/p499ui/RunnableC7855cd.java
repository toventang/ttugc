package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cd */
final /* synthetic */ class RunnableC7855cd implements Runnable {

    /* renamed from: a */
    private final Room f19575a;

    static {
        Covode.recordClassIndex(8650);
    }

    RunnableC7855cd(Room room) {
        this.f19575a = room;
    }

    public final void run() {
        Room room = this.f19575a;
        ((IGiftService) C6193a.m13435a(IGiftService.class)).getFirstRechargeManager().mo15002a(room.getId(), room.getOwnerUserId());
    }
}
