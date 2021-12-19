package com.bytedance.android.live.slot;

import com.bytedance.android.live.liveinteract.api.p261b.C4418g;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.slot.n */
final /* synthetic */ class C6180n implements AbstractC89172b {

    /* renamed from: a */
    private final FrameL3SlotWidget f15423a;

    static {
        Covode.recordClassIndex(6886);
    }

    C6180n(FrameL3SlotWidget frameL3SlotWidget) {
        this.f15423a = frameL3SlotWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        FrameL3SlotWidget frameL3SlotWidget = this.f15423a;
        C4418g gVar = (C4418g) obj;
        frameL3SlotWidget.f15308h = gVar.f12016a;
        frameL3SlotWidget.mo12026a();
        frameL3SlotWidget.mo12027a(gVar.f12017b);
        return C89391z.f203057a;
    }
}
