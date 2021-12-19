package com.bytedance.ies.xelement.banner;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xelement.banner.b */
public final class C19022b implements ViewPager.AbstractC1580f {
    static {
        Covode.recordClassIndex(21778);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1580f
    /* renamed from: a */
    public final void mo5330a(View view, float f) {
        float f2;
        ViewPager viewPager = (ViewPager) view.getParent();
        int left = (view.getLeft() - viewPager.getPaddingLeft()) - viewPager.getScrollX();
        int measuredWidth = (viewPager.getMeasuredWidth() - viewPager.getPaddingLeft()) - viewPager.getPaddingRight();
        if (measuredWidth != 0) {
            f2 = ((float) left) / ((float) measuredWidth);
        } else {
            f2 = 0.0f;
        }
        float min = Math.min(9.0f, Math.max(-9.0f, f2 * 9.0f));
        view.setCameraDistance(1280.0f);
        view.setRotationY(-min);
    }
}
