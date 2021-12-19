package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.olddialog.widget.b */
public final /* synthetic */ class RunnableC10052b implements Runnable {

    /* renamed from: a */
    private final LiveNewGiftBottomWidget f24455a;

    /* renamed from: b */
    private final int f24456b;

    static {
        Covode.recordClassIndex(11614);
    }

    RunnableC10052b(LiveNewGiftBottomWidget liveNewGiftBottomWidget, int i) {
        this.f24455a = liveNewGiftBottomWidget;
        this.f24456b = i;
    }

    public final void run() {
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f24455a;
        liveNewGiftBottomWidget.f24394a.mo4413b(this.f24456b);
    }
}
