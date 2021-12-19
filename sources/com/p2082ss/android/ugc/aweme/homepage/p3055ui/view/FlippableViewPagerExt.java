package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34695n;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt */
public class FlippableViewPagerExt extends C34695n {

    /* renamed from: a */
    public boolean f122369a = true;

    static {
        Covode.recordClassIndex(62866);
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return true;
    }

    public FlippableViewPagerExt(Context context) {
        super(context);
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean canScrollHorizontally(int i) {
        if (!this.f122369a || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34695n, dmt.viewpager.DmtViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f122369a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34695n, dmt.viewpager.DmtViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getContext();
        if (!this.f122369a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public FlippableViewPagerExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
