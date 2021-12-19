package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cf */
final /* synthetic */ class RunnableC7857cf implements Runnable {

    /* renamed from: a */
    private final C7822br f19577a;

    static {
        Covode.recordClassIndex(8652);
    }

    RunnableC7857cf(C7822br brVar) {
        this.f19577a = brVar;
    }

    public final void run() {
        C7822br brVar = this.f19577a;
        ((IGiftService) C6193a.m13435a(IGiftService.class)).syncGiftList(brVar.f19470ar, brVar.f19495c, 2, false);
    }
}
