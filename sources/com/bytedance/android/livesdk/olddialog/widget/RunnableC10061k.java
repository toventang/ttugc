package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.olddialog.widget.k */
public final /* synthetic */ class RunnableC10061k implements Runnable {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24465a;

    /* renamed from: b */
    private final int f24466b;

    static {
        Covode.recordClassIndex(11623);
    }

    RunnableC10061k(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i) {
        this.f24465a = liveNewGiftPanelWidget;
        this.f24466b = i;
    }

    public final void run() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24465a;
        liveNewGiftPanelWidget.f24417a.mo4413b(this.f24466b);
    }
}
