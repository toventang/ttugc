package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.h */
public final /* synthetic */ class RunnableC8105h implements Runnable {

    /* renamed from: a */
    private final BottomRightBannerWidget f20116a;

    /* renamed from: b */
    private final Uri.Builder f20117b;

    static {
        Covode.recordClassIndex(8912);
    }

    RunnableC8105h(BottomRightBannerWidget bottomRightBannerWidget, Uri.Builder builder) {
        this.f20116a = bottomRightBannerWidget;
        this.f20117b = builder;
    }

    public final void run() {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20116a;
        bottomRightBannerWidget.f19806d.mo13251a(bottomRightBannerWidget.f19803a, this.f20117b.toString());
    }
}
