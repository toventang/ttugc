package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.c */
public class C15653c extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17919);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(13.4375f, 11.9817f);
        this.f37302c.lineTo(36.0183f, 34.5625f);
        this.f37302c.cubicTo(38.4977f, 31.7439f, 40.0f, 28.0482f, 40.0f, 24.0f);
        this.f37302c.cubicTo(40.0f, 15.1634f, 32.8366f, 8.0f, 24.0f, 8.0f);
        this.f37302c.cubicTo(19.9518f, 8.0f, 16.2561f, 9.50231f, 13.4375f, 11.9817f);
        this.f37302c.close();
        this.f37302c.moveTo(34.6067f, 35.9793f);
        this.f37302c.lineTo(12.0207f, 13.3933f);
        this.f37302c.cubicTo(9.51807f, 16.2174f, 8.0f, 19.9306f, 8.0f, 24.0f);
        this.f37302c.cubicTo(8.0f, 32.8366f, 15.1634f, 40.0f, 24.0f, 40.0f);
        this.f37302c.cubicTo(28.0694f, 40.0f, 31.7826f, 38.4819f, 34.6067f, 35.9793f);
        this.f37302c.close();
        this.f37302c.moveTo(11.2941f, 11.2501f);
        this.f37302c.cubicTo(14.5486f, 8.00674f, 19.0409f, 6.0f, 24.0f, 6.0f);
        this.f37302c.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 28.9591f, 39.9933f, 33.4514f, 36.7499f, 36.7059f);
        this.f37302c.cubicTo(33.4919f, 39.9751f, 28.9815f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 19.0185f, 8.02491f, 14.5081f, 11.2941f, 11.2501f);
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
