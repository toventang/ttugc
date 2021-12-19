package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.m */
public class C15923m extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18189);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(6.85407f, 10.9036f);
        this.f37302c.cubicTo(7.39762f, 10.3472f, 8.15915f, 10.0f, 9.0f, 10.0f);
        this.f37302c.lineTo(39.0f, 10.0f);
        this.f37302c.cubicTo(39.8408f, 10.0f, 40.6024f, 10.3472f, 41.1459f, 10.9036f);
        this.f37302c.cubicTo(41.6733f, 11.4434f, 42.0f, 12.1845f, 42.0f, 13.0f);
        this.f37302c.lineTo(42.0f, 34.0f);
        this.f37302c.cubicTo(42.0f, 35.6569f, 40.6569f, 37.0f, 39.0f, 37.0f);
        this.f37302c.lineTo(9.0f, 37.0f);
        this.f37302c.cubicTo(7.34315f, 37.0f, 6.0f, 35.6569f, 6.0f, 34.0f);
        this.f37302c.lineTo(6.0f, 13.0f);
        this.f37302c.cubicTo(6.0f, 12.1845f, 6.32667f, 11.4434f, 6.85407f, 10.9036f);
        this.f37302c.close();
        this.f37302c.moveTo(9.58786f, 12.0f);
        this.f37302c.lineTo(23.3542f, 23.644f);
        this.f37302c.cubicTo(23.727f, 23.9593f, 24.273f, 23.9593f, 24.6458f, 23.644f);
        this.f37302c.lineTo(38.4121f, 12.0f);
        this.f37302c.lineTo(9.58786f, 12.0f);
        this.f37302c.close();
        this.f37302c.moveTo(40.0f, 13.2764f);
        this.f37302c.lineTo(25.9374f, 25.171f);
        this.f37302c.cubicTo(24.819f, 26.117f, 23.181f, 26.117f, 22.0626f, 25.171f);
        this.f37302c.lineTo(8.0f, 13.2764f);
        this.f37302c.lineTo(8.0f, 34.0f);
        this.f37302c.cubicTo(8.0f, 34.5523f, 8.44772f, 35.0f, 9.0f, 35.0f);
        this.f37302c.lineTo(39.0f, 35.0f);
        this.f37302c.cubicTo(39.5523f, 35.0f, 40.0f, 34.5523f, 40.0f, 34.0f);
        this.f37302c.lineTo(40.0f, 13.2764f);
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
