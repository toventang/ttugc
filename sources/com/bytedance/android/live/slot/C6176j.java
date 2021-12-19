package com.bytedance.android.live.slot;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.slot.j */
final /* synthetic */ class C6176j implements AbstractC89172b {

    /* renamed from: a */
    private final FrameL2SlotWidget f15418a;

    static {
        Covode.recordClassIndex(6882);
    }

    C6176j(FrameL2SlotWidget frameL2SlotWidget) {
        this.f15418a = frameL2SlotWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        Pair<Boolean, String> value;
        FrameL2SlotWidget frameL2SlotWidget = this.f15418a;
        if (((Boolean) obj).booleanValue() && frameL2SlotWidget.f15290c != null && (value = frameL2SlotWidget.f15290c.f15346a.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            frameL2SlotWidget.f15290c.f15346a.setValue(new Pair<>(false, "visibility_reason_conflict"));
        }
        return C89391z.f203057a;
    }
}
