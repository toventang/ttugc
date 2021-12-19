package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.c */
final /* synthetic */ class RunnableC8018c implements Runnable {

    /* renamed from: a */
    private final C8007b f19986a;

    /* renamed from: b */
    private final DataChannel f19987b;

    static {
        Covode.recordClassIndex(8825);
    }

    RunnableC8018c(C8007b bVar, DataChannel dataChannel) {
        this.f19986a = bVar;
        this.f19987b = dataChannel;
    }

    public final void run() {
        C8007b bVar = this.f19986a;
        DataChannel dataChannel = this.f19987b;
        bVar.f19953c = ((ISlotService) C6193a.m13435a(ISlotService.class)).createIconSlotController((ActivityC0945e) bVar.f19952b, bVar, IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_L2_TOOLBAR, IIconSlot.EnumC6150c.PREEMPTION);
        bVar.f19953c.mo12058a(dataChannel);
        bVar.f19953c.mo12059a((ActivityC0945e) bVar.f19952b, IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_L2_TOOLBAR);
        bVar.f19951a.getLifecycle().mo4012a(bVar.f19953c);
    }
}
