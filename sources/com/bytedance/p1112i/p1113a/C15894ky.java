package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ky */
public class C15894ky extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18160);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(3.0f, 15.0f);
        this.f37302c.cubicTo(3.0f, 12.2386f, 5.23858f, 10.0f, 8.0f, 10.0f);
        this.f37302c.lineTo(36.0f, 10.0f);
        this.f37302c.cubicTo(38.7614f, 10.0f, 41.0f, 12.2386f, 41.0f, 15.0f);
        this.f37302c.lineTo(41.0f, 33.0f);
        this.f37302c.cubicTo(41.0f, 35.7614f, 38.7614f, 38.0f, 36.0f, 38.0f);
        this.f37302c.lineTo(8.0f, 38.0f);
        this.f37302c.cubicTo(5.23858f, 38.0f, 3.0f, 35.7614f, 3.0f, 33.0f);
        this.f37302c.lineTo(3.0f, 15.0f);
        this.f37302c.close();
        this.f37302c.moveTo(8.0f, 14.0f);
        this.f37302c.cubicTo(7.44772f, 14.0f, 7.0f, 14.4477f, 7.0f, 15.0f);
        this.f37302c.lineTo(7.0f, 33.0f);
        this.f37302c.cubicTo(7.0f, 33.5523f, 7.44772f, 34.0f, 8.0f, 34.0f);
        this.f37302c.lineTo(36.0f, 34.0f);
        this.f37302c.cubicTo(36.5523f, 34.0f, 37.0f, 33.5523f, 37.0f, 33.0f);
        this.f37302c.lineTo(37.0f, 15.0f);
        this.f37302c.cubicTo(37.0f, 14.4477f, 36.5523f, 14.0f, 36.0f, 14.0f);
        this.f37302c.lineTo(8.0f, 14.0f);
        this.f37302c.close();
        this.f37302c.moveTo(43.0f, 28.0f);
        this.f37302c.cubicTo(45.2091f, 28.0f, 47.0f, 26.2091f, 47.0f, 24.0f);
        this.f37302c.cubicTo(47.0f, 21.7909f, 45.2091f, 20.0f, 43.0f, 20.0f);
        this.f37302c.lineTo(43.0f, 28.0f);
        this.f37302c.close();
        this.f37302c.moveTo(10.0f, 16.0f);
        this.f37302c.cubicTo(9.44772f, 16.0f, 9.0f, 16.4477f, 9.0f, 17.0f);
        this.f37302c.lineTo(9.0f, 31.0f);
        this.f37302c.cubicTo(9.0f, 31.5523f, 9.44772f, 32.0f, 10.0f, 32.0f);
        this.f37302c.lineTo(17.0f, 32.0f);
        this.f37302c.cubicTo(17.5523f, 32.0f, 18.0f, 31.5523f, 18.0f, 31.0f);
        this.f37302c.lineTo(18.0f, 17.0f);
        this.f37302c.cubicTo(18.0f, 16.4477f, 17.5523f, 16.0f, 17.0f, 16.0f);
        this.f37302c.lineTo(10.0f, 16.0f);
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
