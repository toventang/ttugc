package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.d */
public final class C72306d implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f162102a = new float[9];

    /* renamed from: b */
    private final float[] f162103b = new float[9];

    /* renamed from: c */
    private final Matrix f162104c = new Matrix();

    static {
        Covode.recordClassIndex(84973);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = matrix;
        Matrix matrix4 = matrix2;
        C89219l.m154721d(matrix3, "");
        C89219l.m154721d(matrix4, "");
        matrix3.getValues(this.f162102a);
        matrix4.getValues(this.f162103b);
        int i = 0;
        do {
            float[] fArr = this.f162103b;
            float f2 = fArr[i];
            float[] fArr2 = this.f162102a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
            i++;
        } while (i <= 8);
        this.f162104c.setValues(this.f162103b);
        return this.f162104c;
    }
}
