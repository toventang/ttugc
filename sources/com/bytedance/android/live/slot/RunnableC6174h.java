package com.bytedance.android.live.slot;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9086cy;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.slot.h */
final /* synthetic */ class RunnableC6174h implements Runnable {

    /* renamed from: a */
    private final FrameL2SlotWidget f15416a;

    static {
        Covode.recordClassIndex(6880);
    }

    RunnableC6174h(FrameL2SlotWidget frameL2SlotWidget) {
        this.f15416a = frameL2SlotWidget;
    }

    public final void run() {
        FrameL2SlotWidget frameL2SlotWidget = this.f15416a;
        frameL2SlotWidget.f15288a = new FrameSlotController((ActivityC0945e) frameL2SlotWidget.getContext(), frameL2SlotWidget, IFrameSlot.EnumC6147c.LAST);
        frameL2SlotWidget.f15288a.mo12035a(frameL2SlotWidget);
        frameL2SlotWidget.f15288a.mo12034a((ActivityC0945e) frameL2SlotWidget.getContext(), IFrameSlot.EnumC6146b.SLOT_LIVE_WATCHER_L2_POP);
        frameL2SlotWidget.dataChannel.mo28313b((AbstractC1204m) frameL2SlotWidget, C4437h.class, (AbstractC89172b) new C6175i(frameL2SlotWidget));
        frameL2SlotWidget.dataChannel.mo28313b((AbstractC1204m) frameL2SlotWidget, C9086cy.class, (AbstractC89172b) new C6176j(frameL2SlotWidget));
        frameL2SlotWidget.f15293f = C6779a.m14563a().mo13052a(C7401r.class).mo143289d(new C6177k(frameL2SlotWidget));
        frameL2SlotWidget.getLifecycle().mo4012a(frameL2SlotWidget.f15288a);
    }
}
