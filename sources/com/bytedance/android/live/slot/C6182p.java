package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.slot.p */
final /* synthetic */ class C6182p implements AbstractC88433f {

    /* renamed from: a */
    private final FrameL3SlotWidget f15425a;

    static {
        Covode.recordClassIndex(6888);
    }

    C6182p(FrameL3SlotWidget frameL3SlotWidget) {
        this.f15425a = frameL3SlotWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        FrameL3SlotWidget frameL3SlotWidget = this.f15425a;
        frameL3SlotWidget.f15307g = ((C7401r) obj).f18339b;
        frameL3SlotWidget.mo12026a();
    }
}
