package com.bytedance.android.livesdk.function;

import android.view.View;
import com.bytedance.android.live.core.p218f.p219a.C3899h;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.C9691bw;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.function.k */
final /* synthetic */ class RunnableC8766k implements Runnable {

    /* renamed from: a */
    private final LiveRoomNotifyWidget.C87493 f21624a;

    static {
        Covode.recordClassIndex(9643);
    }

    RunnableC8766k(LiveRoomNotifyWidget.C87493 r1) {
        this.f21624a = r1;
    }

    public final void run() {
        LiveRoomNotifyWidget.C87493 r0 = this.f21624a;
        LiveRoomNotifyWidget.this.mo15027a((C9691bw) C3899h.m9527a((View) LiveRoomNotifyWidget.this.f21580a, "2131362407"));
    }
}
