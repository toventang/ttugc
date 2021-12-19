package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdkapi.view.AbstractC11878f;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.banner.c */
public class C8506c extends RtlViewPager {

    /* renamed from: a */
    MotionEvent f21051a;

    /* renamed from: b */
    private boolean f21052b;

    /* renamed from: c */
    private Boolean f21053c;

    static {
        Covode.recordClassIndex(9360);
    }

    private AbstractC11878f getParentViewPager() {
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof AbstractC11878f)) {
            viewParent = viewParent.getParent();
        }
        return (AbstractC11878f) viewParent;
    }

    /* renamed from: c */
    private void m16716c() {
        if (getChildCount() > 1 && this.f21052b) {
            C3854a.m9453a(3, "BannerViewPager", "disableParent");
            this.f21052b = false;
            AbstractC11878f parentViewPager = getParentViewPager();
            if (parentViewPager != null && this.f21053c == null) {
                this.f21053c = Boolean.valueOf(parentViewPager.mo19020a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14827b() {
        Boolean bool;
        if (!this.f21052b) {
            C3854a.m9453a(3, "BannerViewPager", "enableParent");
            this.f21052b = true;
            if (getParentViewPager() != null && (bool = this.f21053c) != null) {
                bool.booleanValue();
                this.f21053c = null;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.bytedance.android.live.uikit.rtl.RtlViewPager
    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        super.setOnPageChangeListener(eVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            m16716c();
        } else if (motionEvent.getAction() != 2) {
            mo14827b();
        } else if (onInterceptTouchEvent) {
            m16716c();
        }
        this.f21051a = motionEvent;
        return onInterceptTouchEvent;
    }

    public C8506c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
