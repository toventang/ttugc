package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pk */
public class C16015pk extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18281);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(30.6565f, 12.9148f);
        this.f37302c.cubicTo(30.1163f, 13.03f, 29.5935f, 12.6796f, 29.3831f, 12.169f);
        this.f37302c.cubicTo(28.3907f, 9.76043f, 25.7907f, 8.32883f, 23.1522f, 8.89157f);
        this.f37302c.cubicTo(20.1815f, 9.52516f, 18.2868f, 12.4471f, 18.9204f, 15.4178f);
        this.f37302c.lineTo(19.6844f, 19.0f);
        this.f37302c.lineTo(36.0f, 19.0f);
        this.f37302c.cubicTo(38.7614f, 19.0f, 41.0f, 21.2385f, 41.0f, 24.0f);
        this.f37302c.lineTo(41.0f, 38.0f);
        this.f37302c.cubicTo(41.0f, 40.7614f, 38.7614f, 43.0f, 36.0f, 43.0f);
        this.f37302c.lineTo(12.0f, 43.0f);
        this.f37302c.cubicTo(9.23858f, 43.0f, 7.0f, 40.7614f, 7.0f, 38.0f);
        this.f37302c.lineTo(7.0f, 24.0f);
        this.f37302c.cubicTo(7.0f, 21.2385f, 9.23858f, 19.0f, 12.0f, 19.0f);
        this.f37302c.lineTo(15.5944f, 19.0f);
        this.f37302c.lineTo(15.0084f, 16.2522f);
        this.f37302c.cubicTo(13.914f, 11.1209f, 17.1866f, 6.07394f, 22.3179f, 4.97955f);
        this.f37302c.cubicTo(27.1194f, 3.95549f, 31.847f, 6.75511f, 33.3315f, 11.3234f);
        this.f37302c.cubicTo(33.5022f, 11.8486f, 33.1526f, 12.3824f, 32.6125f, 12.4976f);
        this.f37302c.lineTo(30.6565f, 12.9148f);
        this.f37302c.close();
        this.f37302c.moveTo(12.0f, 23.0f);
        this.f37302c.cubicTo(11.4477f, 23.0f, 11.0f, 23.4477f, 11.0f, 24.0f);
        this.f37302c.lineTo(11.0f, 38.0f);
        this.f37302c.cubicTo(11.0f, 38.5522f, 11.4477f, 39.0f, 12.0f, 39.0f);
        this.f37302c.lineTo(36.0f, 39.0f);
        this.f37302c.cubicTo(36.5523f, 39.0f, 37.0f, 38.5522f, 37.0f, 38.0f);
        this.f37302c.lineTo(37.0f, 24.0f);
        this.f37302c.cubicTo(37.0f, 23.4477f, 36.5523f, 23.0f, 36.0f, 23.0f);
        this.f37302c.lineTo(12.0f, 23.0f);
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
