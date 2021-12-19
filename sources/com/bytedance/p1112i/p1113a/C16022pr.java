package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pr */
public class C16022pr extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18288);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(5.0f, 8.0f);
        this.f37302c.cubicTo(5.0f, 6.34315f, 6.34315f, 5.0f, 8.0f, 5.0f);
        this.f37302c.lineTo(35.0f, 5.0f);
        this.f37302c.cubicTo(36.6569f, 5.0f, 38.0f, 6.34314f, 38.0f, 8.0f);
        this.f37302c.lineTo(38.0f, 12.0f);
        this.f37302c.lineTo(40.0f, 12.0f);
        this.f37302c.cubicTo(41.6568f, 12.0f, 43.0f, 13.3431f, 43.0f, 15.0f);
        this.f37302c.lineTo(43.0f, 40.0f);
        this.f37302c.cubicTo(43.0f, 41.6569f, 41.6569f, 43.0f, 40.0f, 43.0f);
        this.f37302c.lineTo(8.0f, 43.0f);
        this.f37302c.cubicTo(6.34315f, 43.0f, 5.0f, 41.6569f, 5.0f, 40.0f);
        this.f37302c.lineTo(5.0f, 8.0f);
        this.f37302c.close();
        this.f37302c.moveTo(9.0f, 16.0f);
        this.f37302c.lineTo(9.0f, 39.0f);
        this.f37302c.lineTo(39.0f, 39.0f);
        this.f37302c.lineTo(39.0f, 34.0f);
        this.f37302c.lineTo(32.5f, 34.0f);
        this.f37302c.cubicTo(28.9101f, 34.0f, 26.0f, 31.0899f, 26.0f, 27.5f);
        this.f37302c.cubicTo(26.0f, 23.9101f, 28.9101f, 21.0f, 32.5f, 21.0f);
        this.f37302c.lineTo(39.0f, 21.0f);
        this.f37302c.lineTo(39.0f, 16.0f);
        this.f37302c.lineTo(9.0f, 16.0f);
        this.f37302c.close();
        this.f37302c.moveTo(39.0f, 25.0f);
        this.f37302c.lineTo(32.5f, 25.0f);
        this.f37302c.cubicTo(31.1193f, 25.0f, 30.0f, 26.1193f, 30.0f, 27.5f);
        this.f37302c.cubicTo(30.0f, 28.8807f, 31.1193f, 30.0f, 32.5f, 30.0f);
        this.f37302c.lineTo(39.0f, 30.0f);
        this.f37302c.lineTo(39.0f, 25.0f);
        this.f37302c.close();
        this.f37302c.moveTo(9.0f, 12.0f);
        this.f37302c.lineTo(34.0f, 12.0f);
        this.f37302c.lineTo(34.0f, 9.0f);
        this.f37302c.lineTo(9.0f, 9.0f);
        this.f37302c.lineTo(9.0f, 12.0f);
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
