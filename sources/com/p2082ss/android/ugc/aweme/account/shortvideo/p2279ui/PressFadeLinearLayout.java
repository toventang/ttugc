package com.p2082ss.android.ugc.aweme.account.shortvideo.p2279ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.account.shortvideo.ui.PressFadeLinearLayout */
public class PressFadeLinearLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f78401a;

    static {
        Covode.recordClassIndex(39742);
    }

    /* renamed from: a */
    private void m67580a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.account.shortvideo.p2279ui.PressFadeLinearLayout.C329512 */

                static {
                    Covode.recordClassIndex(39744);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }
            });
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f78401a;
    }

    public void setIntercept(boolean z) {
        this.f78401a = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", 1.0f, 0.5f);
                ofFloat.setDuration(100L);
                ofFloat.start();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.account.shortvideo.p2279ui.PressFadeLinearLayout.C329501 */

                    static {
                        Covode.recordClassIndex(39743);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    }
                });
            }
        } else if (action == 1) {
            m67580a();
        } else if (action == 3) {
            m67580a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private PressFadeLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12765);
        MethodCollector.m26664o(12765);
    }
}
