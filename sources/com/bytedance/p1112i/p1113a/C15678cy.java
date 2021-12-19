package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.cy */
public class C15678cy extends AbstractC15287a {

    /* renamed from: d */
    Paint f38192d;

    /* renamed from: e */
    Path f38193e;

    static {
        Covode.recordClassIndex(17944);
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
        this.f37301b.setColor(-1);
        this.f38192d = new Paint();
        Path path = new Path();
        this.f38193e = path;
        path.moveTo(42.0f, 32.2278f);
        this.f38193e.lineTo(25.2947f, 24.0f);
        this.f38193e.lineTo(42.0f, 15.7722f);
        this.f38193e.lineTo(42.0f, 11.9873f);
        this.f38193e.cubicTo(42.0f, 11.7405f, 41.7494f, 11.5759f, 41.4988f, 11.6582f);
        this.f38193e.lineTo(34.9002f, 14.8671f);
        this.f38193e.cubicTo(34.6497f, 12.7278f, 32.7285f, 11.0f, 30.4733f, 11.0f);
        this.f38193e.lineTo(10.4269f, 11.0f);
        this.f38193e.cubicTo(8.00464f, 11.0f, 6.0f, 12.9747f, 6.0f, 15.3608f);
        this.f38193e.lineTo(6.0f, 17.9937f);
        this.f38193e.cubicTo(6.0f, 18.5696f, 6.33411f, 19.1456f, 6.83527f, 19.3924f);
        this.f38193e.lineTo(16.1903f, 24.0f);
        this.f38193e.lineTo(6.83527f, 28.6076f);
        this.f38193e.cubicTo(6.33411f, 28.8544f, 6.0f, 29.4304f, 6.0f, 30.0063f);
        this.f38193e.lineTo(6.0f, 32.6392f);
        this.f38193e.cubicTo(6.0f, 35.0253f, 8.00464f, 37.0f, 10.4269f, 37.0f);
        this.f38193e.lineTo(30.4733f, 37.0f);
        this.f38193e.cubicTo(32.7285f, 37.0f, 34.6497f, 35.3544f, 34.9002f, 33.1329f);
        this.f38193e.lineTo(41.4988f, 36.3418f);
        this.f38193e.cubicTo(41.7494f, 36.424f, 42.0f, 36.2595f, 42.0f, 36.0127f);
        this.f38193e.lineTo(42.0f, 32.2278f);
        this.f38193e.close();
        this.f38193e.moveTo(10.0093f, 16.5949f);
        this.f38193e.lineTo(10.0093f, 15.443f);
        this.f38193e.cubicTo(10.0093f, 15.1962f, 10.1763f, 15.0316f, 10.4269f, 15.0316f);
        this.f38193e.lineTo(30.4733f, 15.0316f);
        this.f38193e.cubicTo(30.7239f, 15.0316f, 30.8909f, 15.1962f, 30.8909f, 15.443f);
        this.f38193e.lineTo(30.8909f, 16.8418f);
        this.f38193e.lineTo(20.7007f, 21.8608f);
        this.f38193e.lineTo(10.0093f, 16.5949f);
        this.f38193e.close();
        this.f38193e.moveTo(30.8909f, 32.6392f);
        this.f38193e.cubicTo(30.8909f, 32.8861f, 30.7239f, 33.0506f, 30.4733f, 33.0506f);
        this.f38193e.lineTo(10.4269f, 33.0506f);
        this.f38193e.cubicTo(10.1763f, 33.0506f, 10.0093f, 32.8861f, 10.0093f, 32.6392f);
        this.f38193e.lineTo(10.0093f, 31.4873f);
        this.f38193e.lineTo(20.7007f, 26.2215f);
        this.f38193e.lineTo(30.8909f, 31.2405f);
        this.f38193e.lineTo(30.8909f, 32.6392f);
        this.f38193e.close();
        this.f38193e.setFillType(Path.FillType.WINDING);
        this.f38192d.setStyle(Paint.Style.FILL);
        this.f38192d.setColor(-16383999);
        this.f37300a.add(this.f38192d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38193e, this.f38192d);
    }
}
