package com.bytedance.tux.p1710c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23163i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.c.e */
public final class C23008e {

    /* renamed from: a */
    public Integer f54462a;

    /* renamed from: b */
    public Integer f54463b;

    /* renamed from: c */
    public Float f54464c;

    /* renamed from: d */
    public Integer f54465d;

    /* renamed from: e */
    public Integer f54466e;

    /* renamed from: f */
    public Integer f54467f;

    /* renamed from: g */
    public int f54468g = -1;

    /* renamed from: h */
    public int f54469h = -1;

    /* renamed from: i */
    public Float f54470i;

    /* renamed from: j */
    public Float f54471j;

    /* renamed from: k */
    public Float f54472k;

    /* renamed from: l */
    public Float f54473l;

    /* renamed from: m */
    public boolean f54474m = true;

    static {
        Covode.recordClassIndex(26928);
    }

    /* renamed from: a */
    public final Drawable mo37389a(Context context) {
        float f;
        float f2;
        float f3;
        C89219l.m154719c(context, "");
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.f54463b;
        if (num != null) {
            Integer a = m43395a(context, num);
            if (a != null) {
                gradientDrawable.setColor(a.intValue());
            }
        } else {
            Integer num2 = this.f54462a;
            if (num2 != null) {
                gradientDrawable.setColor(num2.intValue());
            }
        }
        Integer num3 = this.f54465d;
        if (num3 != null) {
            int intValue = num3.intValue();
            Integer num4 = this.f54467f;
            if (num4 != null) {
                Integer a2 = m43395a(context, num4);
                if (a2 != null) {
                    gradientDrawable.setStroke(intValue, a2.intValue());
                }
            } else {
                Integer num5 = this.f54466e;
                if (num5 != null) {
                    gradientDrawable.setStroke(intValue, num5.intValue());
                }
            }
        }
        Float f4 = this.f54464c;
        if (f4 != null) {
            gradientDrawable.setCornerRadius(f4.floatValue());
        }
        Float f5 = this.f54470i;
        if (!(f5 == null && this.f54471j == null && this.f54472k == null && this.f54473l == null)) {
            float f6 = 0.0f;
            if (f5 != null) {
                f = f5.floatValue();
            } else {
                f = 0.0f;
            }
            Float f7 = this.f54471j;
            if (f7 != null) {
                f2 = f7.floatValue();
            } else {
                f2 = 0.0f;
            }
            Float f8 = this.f54473l;
            if (f8 != null) {
                f3 = f8.floatValue();
            } else {
                f3 = 0.0f;
            }
            Float f9 = this.f54472k;
            if (f9 != null) {
                f6 = f9.floatValue();
            }
            gradientDrawable.setCornerRadii((!this.f54474m || !C23163i.m43663a(context)) ? new float[]{f, f, f2, f2, f3, f3, f6, f6} : new float[]{f2, f2, f, f, f6, f6, f3, f3});
        }
        int i = this.f54469h;
        if (i >= 0 || this.f54468g >= 0) {
            gradientDrawable.setSize(i, this.f54468g);
        }
        return gradientDrawable;
    }

    /* renamed from: a */
    private static Integer m43395a(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C23155d.m43641a(context, num.intValue());
    }
}
