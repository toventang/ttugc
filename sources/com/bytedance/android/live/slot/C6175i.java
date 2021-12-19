package com.bytedance.android.live.slot;

import android.view.ViewGroup;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.slot.i */
final /* synthetic */ class C6175i implements AbstractC89172b {

    /* renamed from: a */
    private final FrameL2SlotWidget f15417a;

    static {
        Covode.recordClassIndex(6881);
    }

    C6175i(FrameL2SlotWidget frameL2SlotWidget) {
        this.f15417a = frameL2SlotWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        FrameL2SlotWidget frameL2SlotWidget = this.f15417a;
        C4419h hVar = (C4419h) obj;
        if (frameL2SlotWidget.getView() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameL2SlotWidget.getView().getLayoutParams();
            if (hVar.f12018a) {
                marginLayoutParams.rightMargin = C3966y.m9667d(R.dimen.wx);
            } else {
                marginLayoutParams.rightMargin = 0;
            }
            frameL2SlotWidget.getView().setLayoutParams(marginLayoutParams);
        }
        return C89391z.f203057a;
    }
}
