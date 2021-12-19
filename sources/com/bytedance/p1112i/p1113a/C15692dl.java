package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dl */
public class C15692dl extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17958);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.1716f, 26.0f);
        this.f37302c.lineTo(7.0f, 26.0f);
        this.f37302c.cubicTo(6.44771f, 26.0f, 6.0f, 25.5523f, 6.0f, 25.0f);
        this.f37302c.lineTo(6.0f, 23.0f);
        this.f37302c.cubicTo(6.0f, 22.4477f, 6.44771f, 22.0f, 7.0f, 22.0f);
        this.f37302c.lineTo(24.1716f, 22.0f);
        this.f37302c.lineTo(20.2929f, 18.1213f);
        this.f37302c.cubicTo(19.9024f, 17.7308f, 19.9024f, 17.0976f, 20.2929f, 16.7071f);
        this.f37302c.lineTo(21.7071f, 15.2929f);
        this.f37302c.cubicTo(22.0976f, 14.9024f, 22.7308f, 14.9024f, 23.1213f, 15.2929f);
        this.f37302c.lineTo(30.4142f, 22.5858f);
        this.f37302c.cubicTo(31.1953f, 23.3668f, 31.1953f, 24.6332f, 30.4142f, 25.4142f);
        this.f37302c.lineTo(23.1213f, 32.7071f);
        this.f37302c.cubicTo(22.7308f, 33.0976f, 22.0976f, 33.0976f, 21.7071f, 32.7071f);
        this.f37302c.lineTo(20.2929f, 31.2929f);
        this.f37302c.cubicTo(19.9024f, 30.9024f, 19.9024f, 30.2692f, 20.2929f, 29.8787f);
        this.f37302c.lineTo(24.1716f, 26.0f);
        this.f37302c.close();
        this.f37302c.moveTo(36.0f, 43.0f);
        this.f37302c.lineTo(27.0f, 43.0f);
        this.f37302c.cubicTo(26.4477f, 43.0f, 26.0f, 42.5523f, 26.0f, 42.0f);
        this.f37302c.lineTo(26.0f, 40.0f);
        this.f37302c.cubicTo(26.0f, 39.4477f, 26.4477f, 39.0f, 27.0f, 39.0f);
        this.f37302c.lineTo(36.0f, 39.0f);
        this.f37302c.cubicTo(37.1046f, 39.0f, 38.0f, 38.1046f, 38.0f, 37.0f);
        this.f37302c.lineTo(38.0f, 11.0f);
        this.f37302c.cubicTo(38.0f, 9.89543f, 37.1046f, 9.0f, 36.0f, 9.0f);
        this.f37302c.lineTo(27.0f, 9.0f);
        this.f37302c.cubicTo(26.4477f, 9.0f, 26.0f, 8.55228f, 26.0f, 8.0f);
        this.f37302c.lineTo(26.0f, 6.0f);
        this.f37302c.cubicTo(26.0f, 5.44771f, 26.4477f, 5.0f, 27.0f, 5.0f);
        this.f37302c.lineTo(36.0f, 5.0f);
        this.f37302c.cubicTo(39.3137f, 5.0f, 42.0f, 7.68629f, 42.0f, 11.0f);
        this.f37302c.lineTo(42.0f, 37.0f);
        this.f37302c.cubicTo(42.0f, 40.3137f, 39.3137f, 43.0f, 36.0f, 43.0f);
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
