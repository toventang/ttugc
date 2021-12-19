package com.bytedance.android.live.slot;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.slot.s */
final /* synthetic */ class RunnableC6185s implements Runnable {

    /* renamed from: a */
    private final FrameSlotWidget f15429a;

    static {
        Covode.recordClassIndex(6891);
    }

    RunnableC6185s(FrameSlotWidget frameSlotWidget) {
        this.f15429a = frameSlotWidget;
    }

    public final void run() {
        FrameSlotWidget frameSlotWidget = this.f15429a;
        frameSlotWidget.f15333a = new FrameSlotController((ActivityC0945e) frameSlotWidget.getContext(), frameSlotWidget, IFrameSlot.EnumC6147c.LAST);
        frameSlotWidget.f15333a.mo12035a(frameSlotWidget);
        frameSlotWidget.f15333a.mo12034a((ActivityC0945e) frameSlotWidget.getContext(), IFrameSlot.EnumC6146b.SLOT_LIVE_BOTTOM_POP);
        frameSlotWidget.getLifecycle().mo4012a(frameSlotWidget.f15333a);
    }
}
