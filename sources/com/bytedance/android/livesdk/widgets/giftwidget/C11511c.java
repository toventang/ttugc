package com.bytedance.android.livesdk.widgets.giftwidget;

import com.bytedance.android.livesdk.gift.p548d.C8801e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.c */
final /* synthetic */ class C11511c implements AbstractC88433f {

    /* renamed from: a */
    private final GiftWidget f27590a;

    static {
        Covode.recordClassIndex(13170);
    }

    C11511c(GiftWidget giftWidget) {
        this.f27590a = giftWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        GiftWidget giftWidget = this.f27590a;
        C8801e eVar = (C8801e) obj;
        if (giftWidget.f27432a != null && giftWidget.f27433b != null) {
            if (eVar.f21678a) {
                giftWidget.f27432a.mo15101a();
                giftWidget.f27432a.mo15104b();
                giftWidget.f27433b.mo16649a();
                giftWidget.f27432a.f21818a = true;
                return;
            }
            giftWidget.f27432a.f21818a = false;
        }
    }
}
