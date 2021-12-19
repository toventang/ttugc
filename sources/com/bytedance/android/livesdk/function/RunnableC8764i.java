package com.bytedance.android.livesdk.function;

import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.function.i */
final /* synthetic */ class RunnableC8764i implements Runnable {

    /* renamed from: a */
    private final LiveRoomNotifyWidget.C87461.C87471 f21622a;

    static {
        Covode.recordClassIndex(9641);
    }

    RunnableC8764i(LiveRoomNotifyWidget.C87461.C87471 r1) {
        this.f21622a = r1;
    }

    public final void run() {
        LiveRoomNotifyWidget.C87461.C87471 r1 = this.f21622a;
        if (LiveRoomNotifyWidget.this.isViewValid() && LiveRoomNotifyWidget.this.f21583d != null) {
            LiveRoomNotifyWidget.this.f21583d.start();
        }
    }
}
