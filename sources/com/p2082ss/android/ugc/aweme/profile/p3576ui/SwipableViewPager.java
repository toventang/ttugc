package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.C81465r;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.SwipableViewPager */
public class SwipableViewPager extends C81465r {

    /* renamed from: g */
    private boolean f145044g = true;

    static {
        Covode.recordClassIndex(75398);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f145044g || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public SwipableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
