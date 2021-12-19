package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.TypeEvaluator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.like.widget.anim.b */
public final class C9275b implements TypeEvaluator<Float> {

    /* renamed from: a */
    public float f22643a;

    static {
        Covode.recordClassIndex(10191);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        float f4 = 1.0f - f;
        double pow = Math.pow((double) f4, 2.0d);
        double floatValue = (double) f2.floatValue();
        Double.isNaN(floatValue);
        double d = pow * floatValue;
        double d2 = (double) (2.0f * f * f4 * this.f22643a);
        Double.isNaN(d2);
        double d3 = d + d2;
        double floatValue2 = (double) (f * f * f3.floatValue());
        Double.isNaN(floatValue2);
        return Float.valueOf((float) (d3 + floatValue2));
    }
}
