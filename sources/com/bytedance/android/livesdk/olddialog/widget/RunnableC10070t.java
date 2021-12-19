package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.olddialog.widget.t */
public final /* synthetic */ class RunnableC10070t implements Runnable {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24476a;

    /* renamed from: b */
    private final int f24477b;

    static {
        Covode.recordClassIndex(11632);
    }

    RunnableC10070t(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i) {
        this.f24476a = liveNewGiftPanelWidget;
        this.f24477b = i;
    }

    public final void run() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24476a;
        liveNewGiftPanelWidget.f24417a.mo4413b(this.f24477b);
    }
}
