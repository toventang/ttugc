package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ar */
public class C15617ar extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17883);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(5.0f, 11.0f);
        this.f37302c.cubicTo(5.0f, 10.4477f, 5.44772f, 10.0f, 6.0f, 10.0f);
        this.f37302c.lineTo(42.0f, 10.0f);
        this.f37302c.cubicTo(42.5523f, 10.0f, 43.0f, 10.4477f, 43.0f, 11.0f);
        this.f37302c.lineTo(43.0f, 13.0f);
        this.f37302c.cubicTo(43.0f, 13.5523f, 42.5523f, 14.0f, 42.0f, 14.0f);
        this.f37302c.lineTo(6.0f, 14.0f);
        this.f37302c.cubicTo(5.44772f, 14.0f, 5.0f, 13.5523f, 5.0f, 13.0f);
        this.f37302c.lineTo(5.0f, 11.0f);
        this.f37302c.close();
        this.f37302c.moveTo(5.0f, 23.0f);
        this.f37302c.cubicTo(5.0f, 22.4477f, 5.44772f, 22.0f, 6.0f, 22.0f);
        this.f37302c.lineTo(42.0f, 22.0f);
        this.f37302c.cubicTo(42.5523f, 22.0f, 43.0f, 22.4477f, 43.0f, 23.0f);
        this.f37302c.lineTo(43.0f, 25.0f);
        this.f37302c.cubicTo(43.0f, 25.5523f, 42.5523f, 26.0f, 42.0f, 26.0f);
        this.f37302c.lineTo(6.0f, 26.0f);
        this.f37302c.cubicTo(5.44771f, 26.0f, 5.0f, 25.5523f, 5.0f, 25.0f);
        this.f37302c.lineTo(5.0f, 23.0f);
        this.f37302c.close();
        this.f37302c.moveTo(6.0f, 34.0f);
        this.f37302c.cubicTo(5.44772f, 34.0f, 5.0f, 34.4477f, 5.0f, 35.0f);
        this.f37302c.lineTo(5.0f, 37.0f);
        this.f37302c.cubicTo(5.0f, 37.5523f, 5.44772f, 38.0f, 6.0f, 38.0f);
        this.f37302c.lineTo(42.0f, 38.0f);
        this.f37302c.cubicTo(42.5523f, 38.0f, 43.0f, 37.5523f, 43.0f, 37.0f);
        this.f37302c.lineTo(43.0f, 35.0f);
        this.f37302c.cubicTo(43.0f, 34.4477f, 42.5523f, 34.0f, 42.0f, 34.0f);
        this.f37302c.lineTo(6.0f, 34.0f);
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
