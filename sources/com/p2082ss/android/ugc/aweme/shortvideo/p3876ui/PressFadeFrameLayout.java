package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PressFadeFrameLayout */
public class PressFadeFrameLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f164661a;

    static {
        Covode.recordClassIndex(86041);
    }

    /* renamed from: a */
    private void m129370a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(C73451ad.f164996a);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f164661a;
    }

    public void setIntercept(boolean z) {
        this.f164661a = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", 1.0f, 0.5f);
                ofFloat.setDuration(100L);
                ofFloat.start();
                ofFloat.addUpdateListener(C73450ac.f164995a);
            }
        } else if (action == 1) {
            m129370a();
        } else if (action == 3) {
            m129370a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private PressFadeFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(11458);
        MethodCollector.m26664o(11458);
    }
}
