package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.like.widget.anim.a */
public final class C9274a implements TypeEvaluator<PointF> {

    /* renamed from: a */
    private PointF f22642a;

    static {
        Covode.recordClassIndex(10190);
    }

    public C9274a(PointF pointF) {
        this.f22642a = pointF;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ PointF evaluate(float f, PointF pointF, PointF pointF2) {
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        PointF pointF5 = new PointF();
        float f2 = 1.0f - f;
        double d = (double) f2;
        double pow = Math.pow(d, 2.0d);
        double d2 = (double) pointF3.x;
        Double.isNaN(d2);
        double d3 = pow * d2;
        float f3 = 2.0f * f * f2;
        double d4 = (double) (this.f22642a.x * f3);
        Double.isNaN(d4);
        double d5 = d3 + d4;
        float f4 = f * f;
        double d6 = (double) (pointF4.x * f4);
        Double.isNaN(d6);
        pointF5.x = (float) (d5 + d6);
        double pow2 = Math.pow(d, 2.0d);
        double d7 = (double) pointF3.y;
        Double.isNaN(d7);
        double d8 = pow2 * d7;
        double d9 = (double) (f3 * this.f22642a.y);
        Double.isNaN(d9);
        double d10 = d8 + d9;
        double d11 = (double) (f4 * pointF4.y);
        Double.isNaN(d11);
        pointF5.y = (float) (d10 + d11);
        return pointF5;
    }
}
