package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.br */
public class C15644br extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17910);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 8.5f);
        this.f37302c.cubicTo(20.9624f, 8.5f, 18.5f, 10.9624f, 18.5f, 14.0f);
        this.f37302c.lineTo(18.5f, 18.5f);
        this.f37302c.lineTo(29.5f, 18.5f);
        this.f37302c.lineTo(29.5f, 14.0f);
        this.f37302c.cubicTo(29.5f, 10.9624f, 27.0376f, 8.5f, 24.0f, 8.5f);
        this.f37302c.close();
        this.f37302c.moveTo(32.5f, 18.5f);
        this.f37302c.lineTo(32.5f, 14.0f);
        this.f37302c.cubicTo(32.5f, 9.30558f, 28.6944f, 5.5f, 24.0f, 5.5f);
        this.f37302c.cubicTo(19.3056f, 5.5f, 15.5f, 9.30558f, 15.5f, 14.0f);
        this.f37302c.lineTo(15.5f, 18.5f);
        this.f37302c.lineTo(11.0f, 18.5f);
        this.f37302c.cubicTo(9.61929f, 18.5f, 8.5f, 19.6193f, 8.5f, 21.0f);
        this.f37302c.lineTo(8.5f, 40.0f);
        this.f37302c.cubicTo(8.5f, 41.3807f, 9.61929f, 42.5f, 11.0f, 42.5f);
        this.f37302c.lineTo(37.0f, 42.5f);
        this.f37302c.cubicTo(38.3807f, 42.5f, 39.5f, 41.3807f, 39.5f, 40.0f);
        this.f37302c.lineTo(39.5f, 21.0f);
        this.f37302c.cubicTo(39.5f, 19.6193f, 38.3807f, 18.5f, 37.0f, 18.5f);
        this.f37302c.lineTo(32.5f, 18.5f);
        this.f37302c.close();
        this.f37302c.moveTo(11.5f, 21.5f);
        this.f37302c.lineTo(11.5f, 39.5f);
        this.f37302c.lineTo(36.5f, 39.5f);
        this.f37302c.lineTo(36.5f, 21.5f);
        this.f37302c.lineTo(11.5f, 21.5f);
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
