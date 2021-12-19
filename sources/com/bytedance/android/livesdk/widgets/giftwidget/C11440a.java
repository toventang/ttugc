package com.bytedance.android.livesdk.widgets.giftwidget;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.a */
final /* synthetic */ class C11440a implements AbstractC89172b {

    /* renamed from: a */
    private final GiftWidget f27454a;

    static {
        Covode.recordClassIndex(13099);
    }

    C11440a(GiftWidget giftWidget) {
        this.f27454a = giftWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        GiftWidget giftWidget = this.f27454a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if ((giftWidget.f27435d == null || !(giftWidget.f27435d.getStreamType() == EnumC11728i.THIRD_PARTY || C10890a.m19496b() == C10890a.EnumC10891a.LINK_MIC_ANCHOR || C10890a.m19496b() == C10890a.EnumC10891a.LINK_MIC_PK)) && giftWidget.f27436e && !booleanValue) {
            giftWidget.mo18277a(C3966y.m9653a(276.0f));
        }
        return C89391z.f203057a;
    }
}
