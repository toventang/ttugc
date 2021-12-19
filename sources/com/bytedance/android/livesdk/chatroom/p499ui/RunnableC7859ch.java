package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ch */
final /* synthetic */ class RunnableC7859ch implements Runnable {

    /* renamed from: a */
    private final C7822br f19579a;

    static {
        Covode.recordClassIndex(8654);
    }

    RunnableC7859ch(C7822br brVar) {
        this.f19579a = brVar;
    }

    public final void run() {
        C7822br brVar = this.f19579a;
        ((IGiftService) C6193a.m13435a(IGiftService.class)).syncGiftList(brVar.f19470ar, brVar.f19495c, 2, false);
    }
}
