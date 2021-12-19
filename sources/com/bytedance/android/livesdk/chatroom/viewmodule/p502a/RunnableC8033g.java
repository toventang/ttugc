package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.g */
final /* synthetic */ class RunnableC8033g implements Runnable {

    /* renamed from: a */
    private final C8024f f20025a;

    /* renamed from: b */
    private final DataChannel f20026b;

    static {
        Covode.recordClassIndex(8840);
    }

    RunnableC8033g(C8024f fVar, DataChannel dataChannel) {
        this.f20025a = fVar;
        this.f20026b = dataChannel;
    }

    public final void run() {
        C8024f fVar = this.f20025a;
        DataChannel dataChannel = this.f20026b;
        fVar.f19998c = ((ISlotService) C6193a.m13435a(ISlotService.class)).createIconSlotController((ActivityC0945e) fVar.f19997b, fVar, IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR, IIconSlot.EnumC6150c.AGGREGATE);
        fVar.f19998c.mo12058a(dataChannel);
        fVar.f19998c.mo12059a((ActivityC0945e) fVar.f19997b, IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR);
        fVar.f19996a.getLifecycle().mo4012a(fVar.f19998c);
    }
}
