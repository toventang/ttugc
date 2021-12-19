package com.p2082ss.android.ugc.tools.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.view.a */
public final class C84916a {
    static {
        Covode.recordClassIndex(98910);
    }

    /* renamed from: a */
    public static Drawable m145949a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m145946a(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m145948a(int i, int i2, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m145947a(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        gradientDrawable.setCornerRadius((float) i4);
        return gradientDrawable;
    }
}
