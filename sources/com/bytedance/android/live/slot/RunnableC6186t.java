package com.bytedance.android.live.slot;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.slot.t */
final /* synthetic */ class RunnableC6186t implements Runnable {

    /* renamed from: a */
    private final FrameSlotWidget.C61422.animationAnimation$AnimationListenerC61442 f15430a;

    /* renamed from: b */
    private final View f15431b;

    static {
        Covode.recordClassIndex(6892);
    }

    RunnableC6186t(FrameSlotWidget.C61422.animationAnimation$AnimationListenerC61442 r1, View view) {
        this.f15430a = r1;
        this.f15431b = view;
    }

    public final void run() {
        MethodCollector.m26663i(9237);
        FrameSlotWidget.C61422.animationAnimation$AnimationListenerC61442 r2 = this.f15430a;
        View view = this.f15431b;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            FrameSlotWidget.this.hide();
        }
        MethodCollector.m26664o(9237);
    }
}
