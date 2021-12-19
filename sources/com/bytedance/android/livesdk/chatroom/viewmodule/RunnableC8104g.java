package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.g */
public final /* synthetic */ class RunnableC8104g implements Runnable {

    /* renamed from: a */
    private final BottomRightBannerWidget f20114a;

    /* renamed from: b */
    private final C9695c f20115b;

    static {
        Covode.recordClassIndex(8911);
    }

    RunnableC8104g(BottomRightBannerWidget bottomRightBannerWidget, C9695c cVar) {
        this.f20114a = bottomRightBannerWidget;
        this.f20115b = cVar;
    }

    public final void run() {
        this.f20114a.mo14260b(this.f20115b);
    }
}
