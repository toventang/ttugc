package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.cb */
public final class C80291cb {

    /* renamed from: a */
    public static final C80291cb f179813a = new C80291cb();

    private C80291cb() {
    }

    static {
        Covode.recordClassIndex(93559);
    }

    /* renamed from: a */
    public static Drawable m139199a(int i, float f) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        C89219l.m154716b(paint, "");
        paint.setColor(i);
        Paint paint2 = shapeDrawable.getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = shapeDrawable.getPaint();
        C89219l.m154716b(paint3, "");
        paint3.setAntiAlias(true);
        return shapeDrawable;
    }

    /* renamed from: a */
    public static Drawable m139201a(int[] iArr, GradientDrawable.Orientation orientation, float f) {
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(orientation, "");
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m139200a(int i, float f, float f2, float f3, float f4) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        Paint paint = shapeDrawable.getPaint();
        C89219l.m154716b(paint, "");
        paint.setColor(i);
        Paint paint2 = shapeDrawable.getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = shapeDrawable.getPaint();
        C89219l.m154716b(paint3, "");
        paint3.setAntiAlias(true);
        return shapeDrawable;
    }
}
