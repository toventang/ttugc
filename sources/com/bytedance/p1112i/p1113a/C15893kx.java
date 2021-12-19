package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.kx */
public class C15893kx extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18159);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 4.0f);
        this.f37302c.cubicTo(18.4772f, 4.0f, 14.0f, 8.47715f, 14.0f, 14.0f);
        this.f37302c.lineTo(14.0f, 19.0f);
        this.f37302c.lineTo(11.0f, 19.0f);
        this.f37302c.cubicTo(8.23858f, 19.0f, 6.0f, 21.2386f, 6.0f, 24.0f);
        this.f37302c.lineTo(6.0f, 37.0f);
        this.f37302c.cubicTo(6.0f, 39.7614f, 8.23858f, 42.0f, 11.0f, 42.0f);
        this.f37302c.lineTo(37.0f, 42.0f);
        this.f37302c.cubicTo(39.7614f, 42.0f, 42.0f, 39.7614f, 42.0f, 37.0f);
        this.f37302c.lineTo(42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 21.2386f, 39.7614f, 19.0f, 37.0f, 19.0f);
        this.f37302c.lineTo(34.0f, 19.0f);
        this.f37302c.lineTo(34.0f, 14.0f);
        this.f37302c.cubicTo(34.0f, 8.47715f, 29.5228f, 4.0f, 24.0f, 4.0f);
        this.f37302c.close();
        this.f37302c.moveTo(30.0f, 19.0f);
        this.f37302c.lineTo(30.0f, 14.0f);
        this.f37302c.cubicTo(30.0f, 10.6863f, 27.3137f, 8.0f, 24.0f, 8.0f);
        this.f37302c.cubicTo(20.6863f, 8.0f, 18.0f, 10.6863f, 18.0f, 14.0f);
        this.f37302c.lineTo(18.0f, 19.0f);
        this.f37302c.lineTo(30.0f, 19.0f);
        this.f37302c.close();
        this.f37302c.moveTo(10.0f, 24.0f);
        this.f37302c.cubicTo(10.0f, 23.4477f, 10.4477f, 23.0f, 11.0f, 23.0f);
        this.f37302c.lineTo(37.0f, 23.0f);
        this.f37302c.cubicTo(37.5523f, 23.0f, 38.0f, 23.4477f, 38.0f, 24.0f);
        this.f37302c.lineTo(38.0f, 37.0f);
        this.f37302c.cubicTo(38.0f, 37.5523f, 37.5523f, 38.0f, 37.0f, 38.0f);
        this.f37302c.lineTo(11.0f, 38.0f);
        this.f37302c.cubicTo(10.4477f, 38.0f, 10.0f, 37.5523f, 10.0f, 37.0f);
        this.f37302c.lineTo(10.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
