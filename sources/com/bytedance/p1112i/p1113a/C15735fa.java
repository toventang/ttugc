package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fa */
public class C15735fa extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18001);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(7.58586f, 11.0355f);
        this.f37302c.lineTo(21.8788f, 25.3284f);
        this.f37302c.cubicTo(23.0503f, 26.5f, 24.9498f, 26.5f, 26.1214f, 25.3284f);
        this.f37302c.lineTo(40.4143f, 11.0355f);
        this.f37302c.cubicTo(40.8048f, 10.645f, 40.8048f, 10.0118f, 40.4143f, 9.62133f);
        this.f37302c.lineTo(37.5859f, 6.7929f);
        this.f37302c.cubicTo(37.1953f, 6.40237f, 36.5622f, 6.40237f, 36.1716f, 6.7929f);
        this.f37302c.lineTo(24.0001f, 18.9645f);
        this.f37302c.lineTo(11.8285f, 6.79289f);
        this.f37302c.cubicTo(11.438f, 6.40237f, 10.8048f, 6.40237f, 10.4143f, 6.79289f);
        this.f37302c.lineTo(7.58586f, 9.62132f);
        this.f37302c.cubicTo(7.19534f, 10.0118f, 7.19534f, 10.645f, 7.58586f, 11.0355f);
        this.f37302c.close();
        this.f37302c.moveTo(7.58586f, 30.0355f);
        this.f37302c.lineTo(21.8788f, 44.3284f);
        this.f37302c.cubicTo(23.0503f, 45.5f, 24.9498f, 45.5f, 26.1214f, 44.3284f);
        this.f37302c.lineTo(40.4143f, 30.0355f);
        this.f37302c.cubicTo(40.8048f, 29.645f, 40.8048f, 29.0119f, 40.4143f, 28.6213f);
        this.f37302c.lineTo(37.5859f, 25.7929f);
        this.f37302c.cubicTo(37.1953f, 25.4024f, 36.5622f, 25.4024f, 36.1716f, 25.7929f);
        this.f37302c.lineTo(24.0001f, 37.9645f);
        this.f37302c.lineTo(11.8285f, 25.7929f);
        this.f37302c.cubicTo(11.438f, 25.4024f, 10.8048f, 25.4024f, 10.4143f, 25.7929f);
        this.f37302c.lineTo(7.58586f, 28.6213f);
        this.f37302c.cubicTo(7.19534f, 29.0118f, 7.19534f, 29.645f, 7.58586f, 30.0355f);
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
