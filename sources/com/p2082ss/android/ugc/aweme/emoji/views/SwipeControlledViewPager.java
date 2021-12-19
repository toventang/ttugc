package com.p2082ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager */
public class SwipeControlledViewPager extends C46670b {

    /* renamed from: a */
    private boolean f108808a = true;

    static {
        Covode.recordClassIndex(55262);
    }

    public void setSwipeEnabled(boolean z) {
        this.f108808a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.views.C46670b, androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f108808a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.views.C46670b, androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f108808a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public SwipeControlledViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
