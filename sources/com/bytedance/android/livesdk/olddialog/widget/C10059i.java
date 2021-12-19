package com.bytedance.android.livesdk.olddialog.widget;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.i */
final /* synthetic */ class C10059i implements AbstractC1214u {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24463a;

    static {
        Covode.recordClassIndex(11621);
    }

    C10059i(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f24463a = liveNewGiftPanelWidget;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24463a;
        Integer num = (Integer) obj;
        if (num != null) {
            if (liveNewGiftPanelWidget.f24431o != num.intValue()) {
                liveNewGiftPanelWidget.f24432p = false;
                liveNewGiftPanelWidget.f24431o = num.intValue();
            }
            liveNewGiftPanelWidget.f24428l = false;
            if (num.intValue() != 5) {
                liveNewGiftPanelWidget.mo16873a(liveNewGiftPanelWidget.f24420d, num);
            } else {
                liveNewGiftPanelWidget.mo16875b(liveNewGiftPanelWidget.f24421e);
            }
        }
        liveNewGiftPanelWidget.f24422f.mo16824b();
    }
}
