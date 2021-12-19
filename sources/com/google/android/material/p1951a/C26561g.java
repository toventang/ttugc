package com.google.android.material.p1951a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.a.g */
public final class C26561g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f62665a = new float[9];

    /* renamed from: b */
    private final float[] f62666b = new float[9];

    /* renamed from: c */
    private final Matrix f62667c = new Matrix();

    static {
        Covode.recordClassIndex(31992);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f62665a);
        matrix2.getValues(this.f62666b);
        int i = 0;
        do {
            float[] fArr = this.f62666b;
            float f2 = fArr[i];
            float[] fArr2 = this.f62665a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
            i++;
        } while (i < 9);
        this.f62667c.setValues(this.f62666b);
        return this.f62667c;
    }
}
