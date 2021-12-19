package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.android.livesdk.p668y.p670b.C11596a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.o */
final /* synthetic */ class C10065o implements AbstractC88433f {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24471a;

    static {
        Covode.recordClassIndex(11627);
    }

    C10065o(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f24471a = liveNewGiftPanelWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24471a;
        C11596a aVar = (C11596a) obj;
        if (liveNewGiftPanelWidget.f24422f != null) {
            AbstractC10004a aVar2 = liveNewGiftPanelWidget.f24422f;
            aVar2.f24302b = aVar.f27751a;
            aVar2.mo16827c();
        }
    }
}
