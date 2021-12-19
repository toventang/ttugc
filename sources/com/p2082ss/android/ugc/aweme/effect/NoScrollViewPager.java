package com.p2082ss.android.ugc.aweme.effect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.effect.NoScrollViewPager */
public class NoScrollViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f107805a = true;

    static {
        Covode.recordClassIndex(54836);
    }

    public void setNoScroll(boolean z) {
        this.f107805a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f107805a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f107805a || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("cur_item:").append(getCurrentItem());
            if (getAdapter() != null) {
                sb.append(", count:").append(getAdapter().getCount());
            }
            C84911q.m145926b(sb.toString());
            e.printStackTrace();
            return false;
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
