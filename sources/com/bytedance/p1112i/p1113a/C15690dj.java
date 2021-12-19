package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dj */
public class C15690dj extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17956);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(22.0f, 24.1716f);
        this.f37302c.lineTo(22.0f, 7.0f);
        this.f37302c.cubicTo(22.0f, 6.44772f, 22.4477f, 6.0f, 23.0f, 6.0f);
        this.f37302c.lineTo(25.0f, 6.0f);
        this.f37302c.cubicTo(25.5523f, 6.0f, 26.0f, 6.44772f, 26.0f, 7.0f);
        this.f37302c.lineTo(26.0f, 24.1716f);
        this.f37302c.lineTo(29.8787f, 20.2929f);
        this.f37302c.cubicTo(30.2692f, 19.9024f, 30.9024f, 19.9024f, 31.2929f, 20.2929f);
        this.f37302c.lineTo(32.7071f, 21.7071f);
        this.f37302c.cubicTo(33.0976f, 22.0976f, 33.0976f, 22.7308f, 32.7071f, 23.1213f);
        this.f37302c.lineTo(25.4142f, 30.4142f);
        this.f37302c.cubicTo(24.6332f, 31.1953f, 23.3668f, 31.1953f, 22.5858f, 30.4142f);
        this.f37302c.lineTo(15.2929f, 23.1213f);
        this.f37302c.cubicTo(14.9024f, 22.7308f, 14.9024f, 22.0976f, 15.2929f, 21.7071f);
        this.f37302c.lineTo(16.7071f, 20.2929f);
        this.f37302c.cubicTo(17.0976f, 19.9024f, 17.7308f, 19.9024f, 18.1213f, 20.2929f);
        this.f37302c.lineTo(22.0f, 24.1716f);
        this.f37302c.close();
        this.f37302c.moveTo(5.0f, 36.0f);
        this.f37302c.lineTo(5.0f, 27.0f);
        this.f37302c.cubicTo(5.0f, 26.4477f, 5.44772f, 26.0f, 6.0f, 26.0f);
        this.f37302c.lineTo(8.0f, 26.0f);
        this.f37302c.cubicTo(8.55228f, 26.0f, 9.0f, 26.4477f, 9.0f, 27.0f);
        this.f37302c.lineTo(9.0f, 36.0f);
        this.f37302c.cubicTo(9.0f, 37.1046f, 9.89543f, 38.0f, 11.0f, 38.0f);
        this.f37302c.lineTo(37.0f, 38.0f);
        this.f37302c.cubicTo(38.1046f, 38.0f, 39.0f, 37.1046f, 39.0f, 36.0f);
        this.f37302c.lineTo(39.0f, 27.0f);
        this.f37302c.cubicTo(39.0f, 26.4477f, 39.4477f, 26.0f, 40.0f, 26.0f);
        this.f37302c.lineTo(42.0f, 26.0f);
        this.f37302c.cubicTo(42.5523f, 26.0f, 43.0f, 26.4477f, 43.0f, 27.0f);
        this.f37302c.lineTo(43.0f, 36.0f);
        this.f37302c.cubicTo(43.0f, 39.3137f, 40.3137f, 42.0f, 37.0f, 42.0f);
        this.f37302c.lineTo(11.0f, 42.0f);
        this.f37302c.cubicTo(7.68629f, 42.0f, 5.0f, 39.3137f, 5.0f, 36.0f);
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
