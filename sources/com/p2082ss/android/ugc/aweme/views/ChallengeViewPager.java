package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.ChallengeViewPager */
public class ChallengeViewPager extends RtlViewPager {

    /* renamed from: f */
    private boolean f181792f;

    static {
        Covode.recordClassIndex(94738);
    }

    public void setPagingEnable(boolean z) {
        this.f181792f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f181792f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f181792f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public ChallengeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
