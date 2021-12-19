package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fz */
public class C15760fz extends AbstractC15287a {

    /* renamed from: d */
    RadialGradient f38305d;

    /* renamed from: e */
    Matrix f38306e;

    static {
        Covode.recordClassIndex(18026);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f38305d = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-27988, -119723}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        this.f38306e = matrix;
        matrix.preTranslate(15.8323f, 13.252f);
        this.f38306e.preRotate(54.9757f);
        this.f38306e.preScale(27.8344f, 30.3834f);
        this.f38305d.setLocalMatrix(this.f38306e);
        this.f37302c.moveTo(15.0f, 4.5f);
        this.f37302c.cubicTo(21.0f, 4.5f, 24.0f, 8.5f, 24.0f, 8.5f);
        this.f37302c.cubicTo(24.0f, 8.5f, 27.0f, 4.5f, 33.0f, 4.5f);
        this.f37302c.cubicTo(40.0f, 4.5f, 45.0f, 9.99998f, 45.0f, 17.0f);
        this.f37302c.cubicTo(45.0f, 25.0f, 38.4622f, 32.1314f, 32.5f, 37.5f);
        this.f37302c.cubicTo(28.8191f, 40.8144f, 26.0f, 43.0f, 24.0f, 43.0f);
        this.f37302c.cubicTo(22.0f, 43.0f, 19.101f, 40.7978f, 15.5f, 37.5f);
        this.f37302c.cubicTo(9.63898f, 32.1325f, 3.0f, 25.0f, 3.0f, 17.0f);
        this.f37302c.cubicTo(3.0f, 9.99998f, 8.0f, 4.5f, 15.0f, 4.5f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setShader(this.f38305d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
