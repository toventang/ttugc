package com.google.android.material.p1951a;

import android.animation.TypeEvaluator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.a.c */
public final class C26557c implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final C26557c f62660a = new C26557c();

    static {
        Covode.recordClassIndex(31988);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return m52581a(f, num, num2);
    }

    /* renamed from: a */
    public static Integer m52581a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float pow5 = (float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d);
        return Integer.valueOf((Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (pow3 + (f * (((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3))), 0.45454545454545453d)) * 255.0f));
    }
}
