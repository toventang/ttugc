package com.p2082ss.android.ugc.aweme.question.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.question.views.QuestionViewPager */
public class QuestionViewPager extends RtlViewPager {

    /* renamed from: f */
    private boolean f149694f;

    static {
        Covode.recordClassIndex(78127);
    }

    public void setPagingEnable(boolean z) {
        this.f149694f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f149694f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f149694f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public QuestionViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
