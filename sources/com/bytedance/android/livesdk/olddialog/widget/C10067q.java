package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.q */
final /* synthetic */ class C10067q implements AbstractC88433f {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24473a;

    static {
        Covode.recordClassIndex(11629);
    }

    C10067q(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f24473a = liveNewGiftPanelWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24473a;
        if (liveNewGiftPanelWidget.f24422f != null) {
            AbstractC10004a aVar = liveNewGiftPanelWidget.f24422f;
            if (aVar.f24301a != null) {
                C11599a.C11601a.f27757a.f27752a = true;
                aVar.f24301a.mo16838b();
                aVar.mo16827c();
            }
        }
    }
}
