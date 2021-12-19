package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ix */
public final class C80594ix {
    static {
        Covode.recordClassIndex(93867);
    }

    /* renamed from: a */
    public static final Integer m139734a(View view) {
        Drawable drawable;
        if (view != null) {
            drawable = view.getBackground();
        } else {
            drawable = null;
        }
        if (!(drawable instanceof ColorDrawable)) {
            drawable = null;
        }
        ColorDrawable colorDrawable = (ColorDrawable) drawable;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        return null;
    }

    /* renamed from: a */
    public static final void m139735a(View view, AbstractC89172b<? super ViewGroup.LayoutParams, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C89219l.m154716b(layoutParams, "");
            bVar.invoke(layoutParams);
            if (C0792v.m2788v(view)) {
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static final void m139736a(View view, Integer num) {
        if (view != null && num != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            if (C0792v.m2788v(view)) {
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
