package com.p2082ss.android.ugc.aweme.discover.p2787m;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.m.g */
public final class C42304g {
    static {
        Covode.recordClassIndex(50247);
    }

    /* renamed from: a */
    public static void m84664a(Window window, int i) {
        ViewGroup viewGroup;
        int childCount;
        if (window != null && (childCount = (viewGroup = (ViewGroup) window.getDecorView()).getChildCount()) > 0) {
            int i2 = childCount - 1;
            if (viewGroup.getChildAt(i2).getId() == 16908335) {
                Drawable background = viewGroup.getChildAt(i2).getBackground();
                if (background instanceof ColorDrawable) {
                    ((ColorDrawable) background).setColor(i);
                }
            }
        }
    }
}
