package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.p */
final /* synthetic */ class C10066p implements AbstractC88433f {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24472a;

    static {
        Covode.recordClassIndex(11628);
    }

    C10066p(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f24472a = liveNewGiftPanelWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24472a;
        if (liveNewGiftPanelWidget.f24422f != null) {
            AbstractC10004a aVar = liveNewGiftPanelWidget.f24422f;
            if (aVar.f24301a != null) {
                C11599a.C11601a.f27757a.f27752a = false;
                aVar.f24301a.mo16838b();
            }
        }
    }
}
