package com.google.android.material.p1952b;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.b.b */
public final class C26583b extends RippleDrawable {
    static {
        Covode.recordClassIndex(32020);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (getDrawable(0) != null) {
            ((GradientDrawable) ((LayerDrawable) ((InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0)).setColorFilter(colorFilter);
        }
    }

    C26583b(ColorStateList colorStateList, InsetDrawable insetDrawable, Drawable drawable) {
        super(colorStateList, insetDrawable, drawable);
    }
}
