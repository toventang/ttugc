package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.cp */
public class C15669cp extends AbstractC15287a {

    /* renamed from: d */
    Paint f38143d;

    /* renamed from: e */
    Path f38144e;

    static {
        Covode.recordClassIndex(17935);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(0.0f, 5.0f);
        this.f37302c.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
        this.f37302c.lineTo(43.0f, 0.0f);
        this.f37302c.cubicTo(45.7614f, 0.0f, 48.0f, 2.23858f, 48.0f, 5.0f);
        this.f37302c.lineTo(48.0f, 43.0f);
        this.f37302c.cubicTo(48.0f, 45.7614f, 45.7614f, 48.0f, 43.0f, 48.0f);
        this.f37302c.lineTo(5.0f, 48.0f);
        this.f37302c.cubicTo(2.23858f, 48.0f, 0.0f, 45.7614f, 0.0f, 43.0f);
        this.f37302c.lineTo(0.0f, 5.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-15483504);
        this.f38143d = new Paint();
        Path path = new Path();
        this.f38144e = path;
        path.moveTo(24.0f, 40.5f);
        this.f38144e.cubicTo(24.875f, 40.5f, 38.0f, 29.0686f, 38.0f, 21.3947f);
        this.f38144e.cubicTo(38.0f, 13.7209f, 31.732f, 7.5f, 24.0f, 7.5f);
        this.f38144e.cubicTo(16.268f, 7.5f, 10.0f, 13.7209f, 10.0f, 21.3947f);
        this.f38144e.cubicTo(10.0f, 29.0686f, 23.125f, 40.5f, 24.0f, 40.5f);
        this.f38144e.close();
        this.f38144e.moveTo(24.0f, 25.7368f);
        this.f38144e.cubicTo(26.8995f, 25.7368f, 29.25f, 23.4039f, 29.25f, 20.5263f);
        this.f38144e.cubicTo(29.25f, 17.6486f, 26.8995f, 15.3157f, 24.0f, 15.3157f);
        this.f38144e.cubicTo(21.1005f, 15.3157f, 18.75f, 17.6486f, 18.75f, 20.5263f);
        this.f38144e.cubicTo(18.75f, 23.4039f, 21.1005f, 25.7368f, 24.0f, 25.7368f);
        this.f38144e.close();
        this.f38144e.setFillType(Path.FillType.EVEN_ODD);
        this.f38143d.setStyle(Paint.Style.FILL);
        this.f38143d.setColor(-1);
        this.f37300a.add(this.f38143d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38144e, this.f38143d);
    }
}
