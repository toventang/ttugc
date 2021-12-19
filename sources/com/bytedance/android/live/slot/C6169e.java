package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.event.C8460m;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.slot.e */
final /* synthetic */ class C6169e implements AbstractC88433f {

    /* renamed from: a */
    private final BarrageWidget f15407a;

    static {
        Covode.recordClassIndex(6875);
    }

    C6169e(BarrageWidget barrageWidget) {
        this.f15407a = barrageWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        BarrageWidget barrageWidget = this.f15407a;
        C8460m mVar = (C8460m) obj;
        if (mVar != null) {
            barrageWidget.f15248c = mVar.f20914b;
            if (barrageWidget.f15247b != null) {
                barrageWidget.f15247b.setPadding(barrageWidget.f15247b.getPaddingLeft(), barrageWidget.f15247b.getPaddingTop(), barrageWidget.f15248c, barrageWidget.f15247b.getPaddingBottom());
            }
        }
    }
}
