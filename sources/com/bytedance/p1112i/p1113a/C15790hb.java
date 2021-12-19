package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hb */
public class C15790hb extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18056);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(11.9999f, 7.0f);
        this.f37302c.cubicTo(11.4476f, 7.0f, 10.9999f, 7.44772f, 10.9999f, 8.0f);
        this.f37302c.lineTo(10.9999f, 10.0f);
        this.f37302c.cubicTo(10.9999f, 10.5523f, 11.4476f, 11.0f, 11.9999f, 11.0f);
        this.f37302c.lineTo(35.9999f, 11.0f);
        this.f37302c.cubicTo(36.5522f, 11.0f, 36.9999f, 10.5523f, 36.9999f, 10.0f);
        this.f37302c.lineTo(36.9999f, 8.0f);
        this.f37302c.cubicTo(36.9999f, 7.44772f, 36.5522f, 7.0f, 35.9999f, 7.0f);
        this.f37302c.lineTo(11.9999f, 7.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.2099f, 16.0f);
        this.f37302c.cubicTo(8.84337f, 16.0f, 6.99422f, 18.0433f, 7.22972f, 20.398f);
        this.f37302c.lineTo(8.82969f, 36.3965f);
        this.f37302c.cubicTo(9.03418f, 38.4413f, 10.7548f, 39.9985f, 12.8098f, 39.9985f);
        this.f37302c.lineTo(35.1899f, 39.9985f);
        this.f37302c.cubicTo(37.2449f, 39.9985f, 38.9656f, 38.4413f, 39.1701f, 36.3965f);
        this.f37302c.lineTo(40.77f, 20.398f);
        this.f37302c.cubicTo(41.0055f, 18.0433f, 39.1564f, 16.0f, 36.7899f, 16.0f);
        this.f37302c.lineTo(11.2099f, 16.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.2099f, 20.0f);
        this.f37302c.lineTo(36.7899f, 20.0f);
        this.f37302c.lineTo(35.1899f, 35.9985f);
        this.f37302c.lineTo(12.8098f, 35.9985f);
        this.f37302c.lineTo(11.2099f, 20.0f);
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
