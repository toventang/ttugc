package com.bytedance.android.live.liveinteract.cohost.p279ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicMatchViewPager */
public final class RandomLinkMicMatchViewPager extends ViewPager {
    static {
        Covode.recordClassIndex(5383);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RandomLinkMicMatchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        setClipChildren(false);
        setFadingEdgeLength(0);
    }
}
