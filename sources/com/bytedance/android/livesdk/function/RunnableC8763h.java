package com.bytedance.android.livesdk.function;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.core.p037h.p039b.C0767b;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.function.h */
final /* synthetic */ class RunnableC8763h implements Runnable {

    /* renamed from: a */
    private final LiveRoomNotifyWidget.C87461 f21620a;

    /* renamed from: b */
    private final int f21621b;

    static {
        Covode.recordClassIndex(9640);
    }

    RunnableC8763h(LiveRoomNotifyWidget.C87461 r1, int i) {
        this.f21620a = r1;
        this.f21621b = i;
    }

    public final void run() {
        LiveRoomNotifyWidget.C87461 r5 = this.f21620a;
        int i = this.f21621b;
        if (LiveRoomNotifyWidget.this.isViewValid()) {
            if (LiveRoomNotifyWidget.this.f21581b.getScrollX() != 0 && C6229a.m13521a(LiveRoomNotifyWidget.this.context)) {
                i = LiveRoomNotifyWidget.this.f21581b.getScrollX() - i;
            }
            ObjectAnimator duration = ObjectAnimator.ofInt(LiveRoomNotifyWidget.this.f21581b, "scrollX", i).setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            duration.setInterpolator(C0767b.m2680a(0.42f, 0.0f, 0.58f, 1.0f));
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.C87461.C87471 */

                static {
                    Covode.recordClassIndex(9622);
                }

                public final void onAnimationEnd(Animator animator) {
                    View view = LiveRoomNotifyWidget.this.getView();
                    RunnableC8764i iVar = new RunnableC8764i(this);
                    long j = 500;
                    if (LiveRoomNotifyWidget.this.f21585f > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                        j = 500 + (LiveRoomNotifyWidget.this.f21585f - InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                    view.postDelayed(iVar, j);
                }
            });
            duration.start();
        }
    }
}
