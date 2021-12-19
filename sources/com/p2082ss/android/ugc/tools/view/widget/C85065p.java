package com.p2082ss.android.ugc.tools.view.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.tools.view.widget.p */
public final class C85065p {

    /* renamed from: a */
    static final Field f190351a;

    static {
        Covode.recordClassIndex(99086);
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            f190351a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.widget.p$a */
    public static class C85066a {
        static {
            Covode.recordClassIndex(99087);
        }

        /* renamed from: a */
        public static View m146265a(ViewPager viewPager) {
            if (viewPager == null) {
                return null;
            }
            int currentItem = viewPager.getCurrentItem();
            for (int i = 0; i < viewPager.getChildCount(); i++) {
                View childAt = viewPager.getChildAt(i);
                ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) C85065p.f190351a.get(layoutParams)).intValue();
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
}
