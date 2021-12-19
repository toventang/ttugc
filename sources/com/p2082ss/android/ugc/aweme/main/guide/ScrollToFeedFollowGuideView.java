package com.p2082ss.android.ugc.aweme.main.guide;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.main.guide.ScrollToFeedFollowGuideView */
public class ScrollToFeedFollowGuideView extends FrameLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, GestureDetector.OnGestureListener {

    /* renamed from: a */
    GestureDetector f134500a;

    static {
        Covode.recordClassIndex(69444);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        m108574a(0);
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        getChildAt(0).setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m108574a(500);
        return this.f134500a.onTouchEvent(motionEvent);
    }

    public void onAnimationEnd(Animator animator) {
        MethodCollector.m26663i(6582);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        MethodCollector.m26664o(6582);
    }

    /* renamed from: a */
    private void m108574a(long j) {
        AbstractC81915c.m141874a(new C59096b(false));
        C59097c.f134505a = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public ScrollToFeedFollowGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ScrollToFeedFollowGuideView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6233);
        animate().alpha(1.0f).setDuration(1000).start();
        this.f134500a = new GestureDetector(getContext(), this);
        MethodCollector.m26664o(6233);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m108574a(500);
        return true;
    }
}
