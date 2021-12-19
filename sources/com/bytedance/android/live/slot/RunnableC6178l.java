package com.bytedance.android.live.slot;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.slot.l */
final /* synthetic */ class RunnableC6178l implements Runnable {

    /* renamed from: a */
    private final FrameL2SlotWidget.C61292.animationAnimation$AnimationListenerC61323 f15420a;

    /* renamed from: b */
    private final View f15421b;

    static {
        Covode.recordClassIndex(6884);
    }

    RunnableC6178l(FrameL2SlotWidget.C61292.animationAnimation$AnimationListenerC61323 r1, View view) {
        this.f15420a = r1;
        this.f15421b = view;
    }

    public final void run() {
        MethodCollector.m26663i(9845);
        FrameL2SlotWidget.C61292.animationAnimation$AnimationListenerC61323 r2 = this.f15420a;
        View view = this.f15421b;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            FrameL2SlotWidget.this.hide();
        }
        MethodCollector.m26664o(9845);
    }
}
