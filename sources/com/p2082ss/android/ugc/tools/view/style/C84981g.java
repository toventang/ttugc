package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.g */
public final class C84981g {
    static {
        Covode.recordClassIndex(98986);
    }

    /* renamed from: a */
    public static final void m146055a(TextView textView) {
        C89219l.m154721d(textView, "");
        Typeface a = C84980f.m146052a(EnumC84965a.MEDIUM.getFONT_NAME());
        if (a != null) {
            textView.setTypeface(a);
        } else {
            textView.setTypeface(textView.getTypeface(), 1);
        }
    }

    /* renamed from: a */
    public static final Drawable m146053a(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C89219l.m154716b(mutate, "");
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public static final GradientDrawable m146054a(Context context, AttributeSet attributeSet, boolean z) {
        boolean z2;
        float f;
        boolean z3;
        if (context == null) {
            return null;
        }
        int color = context.getResources().getColor(R.color.u8);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes, "");
            z2 = obtainStyledAttributes.getBoolean(1, false);
            f = obtainStyledAttributes.getDimension(15, 0.0f);
            z3 = obtainStyledAttributes.getBoolean(25, false);
            color = obtainStyledAttributes.getColor(0, color);
            z = obtainStyledAttributes.getBoolean(2, z);
            obtainStyledAttributes.recycle();
        } else {
            z2 = false;
            f = 0.0f;
            z3 = false;
        }
        if (!z) {
            return null;
        }
        C84966b a = C84966b.C84967a.m146038a().mo129755b(color).mo129753a(color, 0);
        if (z2) {
            a.mo129752a(1);
        } else {
            a.mo129752a(0);
            if (z3) {
                a.mo129754a(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                a.mo129751a(f);
            }
        }
        return a.mo129750a();
    }

    /* renamed from: a */
    public static final void m146056a(TextView textView, AttributeSet attributeSet, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        C89219l.m154721d(textView, "");
        if (attributeSet == null) {
            i = Integer.MIN_VALUE;
        } else if (z) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j2, R.attr.j3, R.attr.j4});
            C89219l.m154716b(obtainStyledAttributes, "");
            i = obtainStyledAttributes.getInt(0, Integer.MIN_VALUE);
            obtainStyledAttributes.recycle();
        } else {
            TypedArray obtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes2, "");
            i = obtainStyledAttributes2.getInt(7, Integer.MIN_VALUE);
            obtainStyledAttributes2.recycle();
        }
        Typeface typeface = null;
        if (i != Integer.MIN_VALUE) {
            AbstractC84968c cVar = C84980f.f190016a;
            if (cVar != null) {
                typeface = cVar.mo73253a(i);
            }
        } else {
            AbstractC89171a<? extends Typeface> aVar = C84980f.f190017b;
            if (aVar != null) {
                typeface = (Typeface) aVar.invoke();
            }
        }
        if (attributeSet != null) {
            if (z) {
                TypedArray obtainStyledAttributes3 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j2, R.attr.j3, R.attr.j4});
                C89219l.m154716b(obtainStyledAttributes3, "");
                z2 = obtainStyledAttributes3.getBoolean(2, false);
                obtainStyledAttributes3.recycle();
            } else {
                TypedArray obtainStyledAttributes4 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
                C89219l.m154716b(obtainStyledAttributes4, "");
                z2 = obtainStyledAttributes4.getBoolean(9, false);
                obtainStyledAttributes4.recycle();
            }
            if (z) {
                TypedArray obtainStyledAttributes5 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j2, R.attr.j3, R.attr.j4});
                C89219l.m154716b(obtainStyledAttributes5, "");
                z3 = obtainStyledAttributes5.getBoolean(1, false);
                obtainStyledAttributes5.recycle();
            } else {
                TypedArray obtainStyledAttributes6 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
                C89219l.m154716b(obtainStyledAttributes6, "");
                z3 = obtainStyledAttributes6.getBoolean(8, false);
                obtainStyledAttributes6.recycle();
            }
            if (typeface != null) {
                if (z2) {
                    textView.setIncludeFontPadding(true);
                }
            } else if (!z3) {
                textView.setIncludeFontPadding(true);
                return;
            } else {
                return;
            }
        } else if (typeface == null) {
            return;
        }
        textView.setTypeface(typeface);
    }
}
