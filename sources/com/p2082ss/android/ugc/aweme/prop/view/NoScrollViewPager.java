package com.p2082ss.android.ugc.aweme.prop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.prop.view.NoScrollViewPager */
public class NoScrollViewPager extends RtlViewPager {

    /* renamed from: f */
    private boolean f147450f = true;

    static {
        Covode.recordClassIndex(76807);
    }

    public void setNoScroll(boolean z) {
        this.f147450f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f147450f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f147450f || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
