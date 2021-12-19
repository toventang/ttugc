package com.p2082ss.android.ugc.aweme.comment.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.GiftChooseViewPager */
public final class GiftChooseViewPager extends RtlViewPager {

    /* renamed from: f */
    private boolean f86115f = true;

    static {
        Covode.recordClassIndex(43726);
    }

    public final void setScrollable(boolean z) {
        this.f86115f = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f86115f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public GiftChooseViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
