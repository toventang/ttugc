package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.d */
public class C15680d extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17946);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.0f, 11.0f);
        this.f37302c.cubicTo(8.0f, 7.68629f, 10.6863f, 5.0f, 14.0f, 5.0f);
        this.f37302c.lineTo(38.0f, 5.0f);
        this.f37302c.cubicTo(38.5523f, 5.0f, 39.0f, 5.44772f, 39.0f, 6.0f);
        this.f37302c.lineTo(39.0f, 41.0f);
        this.f37302c.cubicTo(39.0f, 41.5523f, 38.5523f, 42.0f, 38.0f, 42.0f);
        this.f37302c.lineTo(13.5f, 42.0f);
        this.f37302c.cubicTo(10.4624f, 42.0f, 8.0f, 39.5376f, 8.0f, 36.5f);
        this.f37302c.cubicTo(8.0f, 36.3315f, 8.00758f, 36.1647f, 8.02242f, 36.0f);
        this.f37302c.lineTo(8.0f, 36.0f);
        this.f37302c.lineTo(8.0f, 11.0f);
        this.f37302c.close();
        this.f37302c.moveTo(10.0f, 32.2572f);
        this.f37302c.cubicTo(10.9509f, 31.4718f, 12.1704f, 31.0f, 13.5f, 31.0f);
        this.f37302c.lineTo(37.0f, 31.0f);
        this.f37302c.lineTo(37.0f, 7.0f);
        this.f37302c.lineTo(14.0f, 7.0f);
        this.f37302c.cubicTo(11.7909f, 7.0f, 10.0f, 8.79086f, 10.0f, 11.0f);
        this.f37302c.lineTo(10.0f, 32.2572f);
        this.f37302c.close();
        this.f37302c.moveTo(37.0f, 33.0f);
        this.f37302c.lineTo(13.5f, 33.0f);
        this.f37302c.cubicTo(11.567f, 33.0f, 10.0f, 34.567f, 10.0f, 36.5f);
        this.f37302c.cubicTo(10.0f, 38.433f, 11.567f, 40.0f, 13.5f, 40.0f);
        this.f37302c.lineTo(37.0f, 40.0f);
        this.f37302c.lineTo(37.0f, 33.0f);
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
