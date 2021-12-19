package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.df */
public class C15686df extends AbstractC15287a {

    /* renamed from: d */
    Paint f38204d;

    /* renamed from: e */
    Path f38205e;

    static {
        Covode.recordClassIndex(17952);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(43.4143f, 16.5858f);
        this.f37302c.lineTo(31.1214f, 4.29289f);
        this.f37302c.cubicTo(30.7309f, 3.90237f, 30.0977f, 3.90237f, 29.7072f, 4.29289f);
        this.f37302c.lineTo(28.2929f, 5.70711f);
        this.f37302c.cubicTo(27.9024f, 6.09763f, 27.9024f, 6.7308f, 28.293f, 7.12132f);
        this.f37302c.lineTo(37.1716f, 16.0f);
        this.f37302c.lineTo(5.00006f, 16.0f);
        this.f37302c.cubicTo(4.44777f, 16.0f, 4.00006f, 16.4477f, 4.00006f, 17.0f);
        this.f37302c.lineTo(4.00006f, 19.0f);
        this.f37302c.cubicTo(4.00006f, 19.5523f, 4.44777f, 20.0f, 5.00006f, 20.0f);
        this.f37302c.lineTo(42.0001f, 20.0f);
        this.f37302c.cubicTo(42.809f, 20.0f, 43.5383f, 19.5127f, 43.8478f, 18.7654f);
        this.f37302c.cubicTo(44.1574f, 18.018f, 43.9863f, 17.1578f, 43.4143f, 16.5858f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38204d = new Paint();
        Path path = new Path();
        this.f38205e = path;
        path.moveTo(4.58584f, 31.4142f);
        this.f38205e.lineTo(16.8787f, 43.7071f);
        this.f38205e.cubicTo(17.2693f, 44.0976f, 17.9024f, 44.0976f, 18.293f, 43.7071f);
        this.f38205e.lineTo(19.7072f, 42.2929f);
        this.f38205e.cubicTo(20.0977f, 41.9024f, 20.0977f, 41.2692f, 19.7072f, 40.8787f);
        this.f38205e.lineTo(10.8285f, 32.0f);
        this.f38205e.lineTo(43.0001f, 32.0f);
        this.f38205e.cubicTo(43.5523f, 32.0f, 44.0001f, 31.5523f, 44.0001f, 31.0f);
        this.f38205e.lineTo(44.0001f, 29.0f);
        this.f38205e.cubicTo(44.0001f, 28.4477f, 43.5523f, 28.0f, 43.0001f, 28.0f);
        this.f38205e.lineTo(6.00006f, 28.0f);
        this.f38205e.cubicTo(5.19113f, 28.0f, 4.46186f, 28.4873f, 4.1523f, 29.2346f);
        this.f38205e.cubicTo(3.84274f, 29.982f, 4.01385f, 30.8422f, 4.58584f, 31.4142f);
        this.f38205e.close();
        this.f38205e.setFillType(Path.FillType.WINDING);
        this.f38204d.setStyle(Paint.Style.FILL);
        this.f38204d.setColor(-16777216);
        this.f37300a.add(this.f38204d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38205e, this.f38204d);
    }
}
