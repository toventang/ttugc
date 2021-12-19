package com.p2082ss.android.ugc.aweme.view.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.customView.NaviNonSwipingViewPager */
public final class NaviNonSwipingViewPager extends ViewPager {

    /* renamed from: a */
    private final Context f181430a;

    static {
        Covode.recordClassIndex(94529);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final Context getCon() {
        return this.f181430a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NaviNonSwipingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        this.f181430a = context;
    }
}
