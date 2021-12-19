package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.dialogv2.p516b.C8346b;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.m */
final /* synthetic */ class C10063m implements AbstractC88433f {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24469a;

    static {
        Covode.recordClassIndex(11625);
    }

    C10063m(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f24469a = liveNewGiftPanelWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24469a;
        if (C8729d.f21542u.mo15010e() && LiveFirstRechargeStyleSetting.INSTANCE.getValue() && C8729d.f21542u.mo15009d() && liveNewGiftPanelWidget.f24422f != null) {
            AbstractC10004a aVar = liveNewGiftPanelWidget.f24422f;
            C9904t g = C8729d.f21542u.mo15012g();
            C9904t h = C8729d.m17036h();
            if (C8729d.f21542u.mo15011f()) {
                if (g != null) {
                    aVar.f24306f.addFirst(new C8346b(g));
                }
            } else if (h != null) {
                aVar.f24306f.addFirst(new C8346b(h));
            }
        }
        if (liveNewGiftPanelWidget.f24422f != null) {
            AbstractC10004a aVar2 = liveNewGiftPanelWidget.f24422f;
            if (C8729d.f21542u.mo15009d() && (!LiveFirstRechargeStyleSetting.INSTANCE.getValue() || C8729d.f21542u.mo15010e())) {
                if (C8729d.f21542u.mo15011f()) {
                    aVar2.f24307g = C8729d.f21542u.mo15013i();
                } else {
                    aVar2.f24307g = 0;
                }
            }
            liveNewGiftPanelWidget.f24422f.notifyDataSetChanged();
        }
    }
}
