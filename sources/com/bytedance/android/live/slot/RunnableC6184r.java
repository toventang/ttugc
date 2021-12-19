package com.bytedance.android.live.slot;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.slot.r */
final /* synthetic */ class RunnableC6184r implements Runnable {

    /* renamed from: a */
    private final FrameL3SlotWidget.C61342.animationAnimation$AnimationListenerC61373 f15427a;

    /* renamed from: b */
    private final View f15428b;

    static {
        Covode.recordClassIndex(6890);
    }

    RunnableC6184r(FrameL3SlotWidget.C61342.animationAnimation$AnimationListenerC61373 r1, View view) {
        this.f15427a = r1;
        this.f15428b = view;
    }

    public final void run() {
        MethodCollector.m26663i(9243);
        FrameL3SlotWidget.C61342.animationAnimation$AnimationListenerC61373 r2 = this.f15427a;
        View view = this.f15428b;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            FrameL3SlotWidget.this.hide();
        }
        MethodCollector.m26664o(9243);
    }
}
