package com.bytedance.android.livesdk.function;

import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.function.g */
final /* synthetic */ class RunnableC8762g implements Runnable {

    /* renamed from: a */
    private final LiveRoomNotifyWidget.C87461 f21619a;

    static {
        Covode.recordClassIndex(9639);
    }

    RunnableC8762g(LiveRoomNotifyWidget.C87461 r1) {
        this.f21619a = r1;
    }

    public final void run() {
        LiveRoomNotifyWidget.C87461 r1 = this.f21619a;
        if (LiveRoomNotifyWidget.this.isViewValid() && LiveRoomNotifyWidget.this.f21583d != null) {
            LiveRoomNotifyWidget.this.f21583d.start();
        }
    }
}
