package com.bytedance.android.livesdk.widgets;

import com.bytedance.android.live.gift.C4345u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.widgets.d */
public final /* synthetic */ class RunnableC11439d implements Runnable {

    /* renamed from: a */
    private final LiveNewSpecialGiftWidget f27431a;

    static {
        Covode.recordClassIndex(13097);
    }

    RunnableC11439d(LiveNewSpecialGiftWidget liveNewSpecialGiftWidget) {
        this.f27431a = liveNewSpecialGiftWidget;
    }

    public final void run() {
        LiveNewSpecialGiftWidget liveNewSpecialGiftWidget = this.f27431a;
        liveNewSpecialGiftWidget.f27424a.setVisibility(8);
        liveNewSpecialGiftWidget.dataChannel.mo28315b(C4345u.class, (Object) false);
        liveNewSpecialGiftWidget.f27426c = false;
    }
}
