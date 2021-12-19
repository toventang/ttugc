package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.r */
public class C81465r extends RtlViewPager {

    /* renamed from: f */
    boolean f182121f = true;

    static {
        Covode.recordClassIndex(94837);
    }

    public void setScrollable(boolean z) {
        this.f182121f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f182121f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public C81465r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
