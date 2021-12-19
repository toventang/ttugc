package com.bytedance.android.live.slot;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.slot.d */
final /* synthetic */ class C6168d implements AbstractC89172b {

    /* renamed from: a */
    private final BarrageWidget f15406a;

    static {
        Covode.recordClassIndex(6874);
    }

    C6168d(BarrageWidget barrageWidget) {
        this.f15406a = barrageWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BarrageWidget barrageWidget = this.f15406a;
        barrageWidget.f15249d = !((Boolean) obj).booleanValue();
        if (!(barrageWidget.f15249d || barrageWidget.f15247b == null || barrageWidget.f15247b.getVisibility() == 0)) {
            barrageWidget.f15247b.setVisibility(8);
        }
        return C89391z.f203057a;
    }
}
