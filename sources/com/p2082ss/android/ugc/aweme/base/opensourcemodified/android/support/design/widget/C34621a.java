package com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a */
public final class C34621a {

    /* renamed from: a */
    static final Field f81706a;

    static {
        Covode.recordClassIndex(41587);
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            f81706a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static View m70700a(ViewPager viewPager) {
        if (viewPager == null || !(viewPager instanceof RtlViewPager)) {
            return C34622a.m70701a(viewPager);
        }
        return C34623b.m70702a(viewPager);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$a */
    static class C34622a {
        static {
            Covode.recordClassIndex(41588);
        }

        /* renamed from: a */
        public static View m70701a(ViewPager viewPager) {
            if (viewPager == null) {
                return null;
            }
            int currentItem = viewPager.getCurrentItem();
            for (int i = 0; i < viewPager.getChildCount(); i++) {
                View childAt = viewPager.getChildAt(i);
                ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) C34621a.f81706a.get(layoutParams)).intValue();
                    if (!layoutParams.f5156a && currentItem == intValue) {
                        return childAt;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$b */
    static class C34623b {
        static {
            Covode.recordClassIndex(41589);
        }

        /* renamed from: a */
        public static View m70702a(ViewPager viewPager) {
            if (viewPager != null && (viewPager instanceof RtlViewPager)) {
                RtlViewPager rtlViewPager = (RtlViewPager) viewPager;
                int currentItem = viewPager.getCurrentItem();
                for (int i = 0; i < viewPager.getChildCount(); i++) {
                    View childAt = viewPager.getChildAt(i);
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                    try {
                        int intValue = ((Integer) C34621a.f81706a.get(layoutParams)).intValue();
                        if (rtlViewPager.mo125047a()) {
                            intValue = (rtlViewPager.getItemCount() - intValue) - 1;
                        }
                        if (!layoutParams.f5156a && currentItem == intValue) {
                            return childAt;
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return null;
        }
    }
}
