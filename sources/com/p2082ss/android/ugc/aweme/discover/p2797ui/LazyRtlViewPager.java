package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41593a;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.LazyRtlViewPager */
public class LazyRtlViewPager extends RtlViewPager {

    /* renamed from: f */
    private AbstractC41593a f99303f;

    static {
        Covode.recordClassIndex(50671);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter instanceof AbstractC41593a) {
            this.f99303f = (AbstractC41593a) pagerAdapter;
            super.setAdapter(pagerAdapter);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.p2082ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (C42777bl.f99783a) {
            return true;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public LazyRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addOnPageChangeListener(new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.LazyRtlViewPager.C425731 */

            static {
                Covode.recordClassIndex(50672);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    C42777bl.f99783a = false;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                LazyRtlViewPager.this.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.LazyRtlViewPager.C425731.RunnableC425741 */

                    static {
                        Covode.recordClassIndex(50673);
                    }

                    public final void run() {
                        LazyRtlViewPager lazyRtlViewPager = LazyRtlViewPager.this;
                        if (!lazyRtlViewPager.isLayoutRequested()) {
                            int childCount = lazyRtlViewPager.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                if (lazyRtlViewPager.getChildAt(i).isLayoutRequested()) {
                                    lazyRtlViewPager.requestLayout();
                                    return;
                                }
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (f >= 0.1f && this.f99303f.mo70817b(i3)) {
                this.f99303f.startUpdate((ViewGroup) this);
                this.f99303f.mo70816b(this, i3);
                this.f99303f.finishUpdate((ViewGroup) this);
            }
        } else if (getCurrentItem() > i && 1.0f - f >= 0.1f && this.f99303f.mo70817b(i)) {
            this.f99303f.startUpdate((ViewGroup) this);
            this.f99303f.mo70816b(this, i);
            this.f99303f.finishUpdate((ViewGroup) this);
        }
        super.onPageScrolled(i, f, i2);
    }
}
