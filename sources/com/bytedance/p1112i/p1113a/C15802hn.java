package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hn */
public class C15802hn extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18068);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(20.5522f, 6.91656f);
        this.f37302c.cubicTo(22.0988f, 4.28733f, 25.9011f, 4.28734f, 27.4477f, 6.91656f);
        this.f37302c.lineTo(43.9509f, 34.9719f);
        this.f37302c.cubicTo(45.5194f, 37.6385f, 43.5968f, 41.0f, 40.5031f, 41.0f);
        this.f37302c.lineTo(7.49679f, 41.0f);
        this.f37302c.cubicTo(4.40313f, 41.0f, 2.48051f, 37.6385f, 4.04906f, 34.9719f);
        this.f37302c.lineTo(20.5522f, 6.91656f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 8.94464f);
        this.f37302c.lineTo(7.49679f, 37.0f);
        this.f37302c.lineTo(40.5031f, 37.0f);
        this.f37302c.lineTo(24.0f, 8.94464f);
        this.f37302c.close();
        this.f37302c.moveTo(22.0f, 18.0f);
        this.f37302c.cubicTo(22.0f, 17.4477f, 22.4477f, 17.0f, 23.0f, 17.0f);
        this.f37302c.lineTo(25.0f, 17.0f);
        this.f37302c.cubicTo(25.5522f, 17.0f, 26.0f, 17.4477f, 26.0f, 18.0f);
        this.f37302c.lineTo(26.0f, 27.0f);
        this.f37302c.cubicTo(26.0f, 27.5523f, 25.5522f, 28.0f, 25.0f, 28.0f);
        this.f37302c.lineTo(23.0f, 28.0f);
        this.f37302c.cubicTo(22.4477f, 28.0f, 22.0f, 27.5523f, 22.0f, 27.0f);
        this.f37302c.lineTo(22.0f, 18.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 35.0f);
        this.f37302c.cubicTo(25.3807f, 35.0f, 26.5f, 33.8807f, 26.5f, 32.5f);
        this.f37302c.cubicTo(26.5f, 31.1193f, 25.3807f, 30.0f, 24.0f, 30.0f);
        this.f37302c.cubicTo(22.6192f, 30.0f, 21.5f, 31.1193f, 21.5f, 32.5f);
        this.f37302c.cubicTo(21.5f, 33.8807f, 22.6192f, 35.0f, 24.0f, 35.0f);
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
