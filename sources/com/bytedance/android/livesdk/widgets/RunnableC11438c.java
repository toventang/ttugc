package com.bytedance.android.livesdk.widgets;

import com.bytedance.android.live.gift.C4345u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.c */
final /* synthetic */ class RunnableC11438c implements Runnable {

    /* renamed from: a */
    private final LiveNewSpecialGiftWidget f27430a;

    static {
        Covode.recordClassIndex(13096);
    }

    RunnableC11438c(LiveNewSpecialGiftWidget liveNewSpecialGiftWidget) {
        this.f27430a = liveNewSpecialGiftWidget;
    }

    public final void run() {
        LiveNewSpecialGiftWidget liveNewSpecialGiftWidget = this.f27430a;
        liveNewSpecialGiftWidget.f27424a.setVisibility(8);
        liveNewSpecialGiftWidget.dataChannel.mo28315b(C4345u.class, (Object) false);
        liveNewSpecialGiftWidget.f27426c = false;
    }
}
