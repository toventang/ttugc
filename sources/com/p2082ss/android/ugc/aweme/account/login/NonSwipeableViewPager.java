package com.p2082ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.account.login.NonSwipeableViewPager */
public class NonSwipeableViewPager extends RtlViewPager {

    /* renamed from: f */
    private boolean f76005f;

    static {
        Covode.recordClassIndex(38541);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setShouldLimitHeight(boolean z) {
        this.f76005f = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.NonSwipeableViewPager$a */
    public class C31802a extends Scroller {
        static {
            Covode.recordClassIndex(38542);
        }

        public C31802a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        public final void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, 150);
        }
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C31802a(getContext()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f76005f) {
            int i3 = 0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i));
            View childAt = getChildAt(getCurrentItem());
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, 0);
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > 0) {
                    i3 = measuredHeight;
                }
                double d = (double) Resources.getSystem().getDisplayMetrics().heightPixels;
                Double.isNaN(d);
                int max = Math.max(measuredHeight, (int) (d * 0.6d));
                if (i3 != 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
                }
                super.onMeasure(i, i2);
            }
        }
    }
}
