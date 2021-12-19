package com.bytedance.android.live.slot;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.slot.o */
final /* synthetic */ class C6181o implements AbstractC89172b {

    /* renamed from: a */
    private final FrameL3SlotWidget f15424a;

    static {
        Covode.recordClassIndex(6887);
    }

    C6181o(FrameL3SlotWidget frameL3SlotWidget) {
        this.f15424a = frameL3SlotWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        Pair<Boolean, String> value;
        FrameL3SlotWidget frameL3SlotWidget = this.f15424a;
        if (((Boolean) obj).booleanValue() && frameL3SlotWidget.f15303c != null && (value = frameL3SlotWidget.f15303c.f15346a.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            frameL3SlotWidget.f15303c.f15346a.setValue(new Pair<>(false, "visibility_reason_conflict"));
        }
        return C89391z.f203057a;
    }
}
