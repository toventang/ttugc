package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.n */
final /* synthetic */ class C10064n implements AbstractC88433f {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24470a;

    static {
        Covode.recordClassIndex(11626);
    }

    C10064n(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f24470a = liveNewGiftPanelWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24470a;
        if (liveNewGiftPanelWidget.f24422f != null) {
            AbstractC10004a aVar = liveNewGiftPanelWidget.f24422f;
            Iterator<AbstractC8812b<? extends C9543b>> it = aVar.f24306f.iterator();
            while (it.hasNext()) {
                AbstractC8812b<? extends C9543b> next = it.next();
                if ((C8729d.f21542u.mo15012g() != null && next.mo14676d() == C8729d.f21542u.mo15012g().f23999d) || (C8729d.m17036h() != null && next.mo14676d() == C8729d.m17036h().f23999d)) {
                    it.remove();
                }
                if (next.f21694a == 0) {
                    it.remove();
                }
            }
            aVar.mo16823a(aVar.f24306f);
            if (aVar.mo16826c(aVar.f24307g) == -1 && aVar.f24306f.size() > 0) {
                aVar.f24307g = aVar.f24306f.get(0).mo14676d();
            }
            aVar.notifyDataSetChanged();
            if (aVar.f24304d != null) {
                int size = aVar.f24306f.size() > 0 ? ((aVar.f24306f.size() - 1) / 8) + 1 : 0;
                if (aVar.mo16826c(aVar.f24307g) != -1 || aVar.f24306f == null || aVar.f24306f.isEmpty()) {
                    aVar.f24304d.mo16830a(((aVar.mo16826c(aVar.f24307g) / 8) * 8) + 7);
                } else {
                    aVar.f24304d.mo16830a(0);
                }
                aVar.f24304d.mo16831a(aVar.mo16826c(aVar.f24307g) / 8, size);
            }
        }
    }
}
