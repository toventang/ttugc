package com.p2082ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.widget.C34744a;

/* renamed from: com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView */
public class NestedScrollingRecyclerView extends C34744a {

    /* renamed from: O */
    private int f92420O;

    /* renamed from: P */
    private int f92421P;

    /* renamed from: Q */
    private int f92422Q;

    /* renamed from: R */
    private int f92423R;

    static {
        Covode.recordClassIndex(46803);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f92423R = viewConfiguration.getScaledTouchSlop();
        } else if (i == 1) {
            this.f92423R = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f92420O = motionEvent.getPointerId(0);
            this.f92421P = (int) (motionEvent.getX() + 0.5f);
            this.f92422Q = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f92420O);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i = x - this.f92421P;
            int i2 = y - this.f92422Q;
            boolean f = getLayoutManager().mo4366f();
            boolean g = getLayoutManager().mo4368g();
            if (!f || Math.abs(i) <= this.f92423R) {
                z = false;
            } else {
                if (Math.abs(i) >= Math.abs(i2) || g) {
                    z = true;
                }
                return false;
            }
            if (((!g || Math.abs(i2) <= this.f92423R || (Math.abs(i2) < Math.abs(i) && !f)) && !z) || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (actionMasked != 5) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f92420O = motionEvent.getPointerId(actionIndex);
            this.f92421P = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f92422Q = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public NestedScrollingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NestedScrollingRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.f92420O = -1;
        this.f92423R = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}
