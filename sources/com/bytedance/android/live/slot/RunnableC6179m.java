package com.bytedance.android.live.slot;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.liveinteract.api.C4438i;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9086cy;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.slot.m */
final /* synthetic */ class RunnableC6179m implements Runnable {

    /* renamed from: a */
    private final FrameL3SlotWidget f15422a;

    static {
        Covode.recordClassIndex(6885);
    }

    RunnableC6179m(FrameL3SlotWidget frameL3SlotWidget) {
        this.f15422a = frameL3SlotWidget;
    }

    public final void run() {
        FrameL3SlotWidget frameL3SlotWidget = this.f15422a;
        frameL3SlotWidget.f15301a = new FrameSlotController((ActivityC0945e) frameL3SlotWidget.getContext(), frameL3SlotWidget, IFrameSlot.EnumC6147c.LAST);
        frameL3SlotWidget.f15301a.mo12035a(frameL3SlotWidget);
        frameL3SlotWidget.f15301a.mo12034a((ActivityC0945e) frameL3SlotWidget.getContext(), IFrameSlot.EnumC6146b.SLOT_LIVE_WATCHER_L3_POP);
        frameL3SlotWidget.dataChannel.mo28317b((Object) frameL3SlotWidget, C4438i.class, (AbstractC89172b) new C6180n(frameL3SlotWidget));
        frameL3SlotWidget.dataChannel.mo28313b((AbstractC1204m) frameL3SlotWidget, C9086cy.class, (AbstractC89172b) new C6181o(frameL3SlotWidget));
        frameL3SlotWidget.f15305e = C6779a.m14563a().mo13052a(C7401r.class).mo143289d(new C6182p(frameL3SlotWidget));
        frameL3SlotWidget.f15306f = C6779a.m14563a().mo13052a(C4419h.class).mo143289d(new C6183q(frameL3SlotWidget));
        frameL3SlotWidget.getLifecycle().mo4012a(frameL3SlotWidget.f15301a);
    }
}
