package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.LazyViewPager */
public class LazyViewPager extends ViewPager {

    /* renamed from: a */
    private AbstractC72360b<?> f162225a;

    static {
        Covode.recordClassIndex(85027);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        AbstractC72360b<?> bVar;
        super.setAdapter(pagerAdapter);
        if (pagerAdapter instanceof AbstractC72360b) {
            bVar = (AbstractC72360b) pagerAdapter;
        } else {
            bVar = null;
        }
        this.f162225a = bVar;
    }

    public LazyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f162225a == null) {
            super.onPageScrolled(i, f, i2);
            return;
        }
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (0.1f < f && this.f162225a.mo114642b(i3)) {
                this.f162225a.startUpdate((ViewGroup) this);
                this.f162225a.mo114641a(this, i3);
                this.f162225a.finishUpdate((ViewGroup) this);
            }
        } else if (getCurrentItem() > i && 0.1f < 1.0f - f && this.f162225a.mo114642b(i)) {
            this.f162225a.startUpdate((ViewGroup) this);
            this.f162225a.mo114641a(this, i);
            this.f162225a.finishUpdate((ViewGroup) this);
        }
        super.onPageScrolled(i, f, i2);
    }
}
