package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.TypeEvaluator;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.d */
public final class C72317d implements TypeEvaluator<float[]> {

    /* renamed from: a */
    private final float[] f162117a;

    static {
        Covode.recordClassIndex(84984);
    }

    public C72317d(float[] fArr) {
        C89219l.m154721d(fArr, "");
        this.f162117a = fArr;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C89219l.m154721d(fArr3, "");
        C89219l.m154721d(fArr4, "");
        float[] fArr5 = this.f162117a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        int length = fArr5.length;
        for (int i = 0; i < length; i++) {
            float f2 = fArr3[i];
            fArr5[i] = f2 + ((fArr4[i] - f2) * f);
        }
        return fArr5;
    }
}
