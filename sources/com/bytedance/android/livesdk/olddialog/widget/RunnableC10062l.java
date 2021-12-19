package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.l */
final /* synthetic */ class RunnableC10062l implements Runnable {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24467a;

    /* renamed from: b */
    private final int f24468b;

    static {
        Covode.recordClassIndex(11624);
    }

    RunnableC10062l(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i) {
        this.f24467a = liveNewGiftPanelWidget;
        this.f24468b = i;
    }

    public final void run() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24467a;
        liveNewGiftPanelWidget.f24417a.mo4413b(this.f24468b);
    }
}
