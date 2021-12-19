package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.oe */
public class C15982oe extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18248);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.7764f, 10.5f);
        this.f37302c.cubicTo(16.1265f, 10.5f, 11.5f, 15.172f, 11.5f, 20.993f);
        this.f37302c.cubicTo(11.5f, 26.814f, 16.1265f, 31.486f, 21.7764f, 31.486f);
        this.f37302c.cubicTo(24.5005f, 31.486f, 26.9782f, 30.4054f, 28.8221f, 28.6314f);
        this.f37302c.cubicTo(30.8097f, 26.7191f, 32.0527f, 24.0079f, 32.0527f, 20.993f);
        this.f37302c.cubicTo(32.0527f, 15.172f, 27.4262f, 10.5f, 21.7764f, 10.5f);
        this.f37302c.close();
        this.f37302c.moveTo(8.5f, 20.993f);
        this.f37302c.cubicTo(8.5f, 13.5669f, 14.4184f, 7.5f, 21.7764f, 7.5f);
        this.f37302c.cubicTo(29.1344f, 7.5f, 35.0527f, 13.5669f, 35.0527f, 20.993f);
        this.f37302c.cubicTo(35.0527f, 24.2993f, 33.881f, 27.3328f, 31.9342f, 29.6817f);
        this.f37302c.lineTo(38.3696f, 36.2355f);
        this.f37302c.cubicTo(38.7566f, 36.6296f, 38.7508f, 37.2627f, 38.3568f, 37.6497f);
        this.f37302c.lineTo(37.6432f, 38.3503f);
        this.f37302c.cubicTo(37.2492f, 38.7373f, 36.616f, 38.7315f, 36.2291f, 38.3374f);
        this.f37302c.lineTo(29.7742f, 31.7638f);
        this.f37302c.cubicTo(27.5523f, 33.4701f, 24.7814f, 34.486f, 21.7764f, 34.486f);
        this.f37302c.cubicTo(14.4184f, 34.486f, 8.5f, 28.4191f, 8.5f, 20.993f);
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
